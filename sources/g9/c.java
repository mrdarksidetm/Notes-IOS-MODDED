package g9;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e9.l;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f11496a;

    public c(Context context) {
        this.f11496a = context;
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo a(String str, int i10) {
        return this.f11496a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence b(String str) {
        Context context = this.f11496a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo c(String str, int i10) {
        return this.f11496a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean d(int i10, String str) {
        if (l.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f11496a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f11496a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
