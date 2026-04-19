package t8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m f21337b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21338a;

    public m(Context context) {
        this.f21338a = context.getApplicationContext();
    }

    public static m a(Context context) {
        w8.m.k(context);
        synchronized (m.class) {
            if (f21337b == null) {
                b0.a(context);
                f21337b = new m(context);
            }
        }
        return f21337b;
    }

    static final x c(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            y yVar = new y(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                if (xVarArr[i10].equals(yVar)) {
                    return xVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? c(packageInfo2, a0.f21305a) : c(packageInfo2, a0.f21305a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (l.e(this.f21338a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
