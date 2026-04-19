package cd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.MediaStore;
import cd.q;
import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class o {
    static int a(q.e eVar) {
        Long lC = eVar.c();
        int iB = b();
        return (lC == null || lC.longValue() >= ((long) iB)) ? iB : Math.toIntExact(lC.longValue());
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    static int b() {
        return i.d.c() ? MediaStore.getPickImagesMaxLimit() : a.e.API_PRIORITY_OTHER;
    }

    private static PackageInfo c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 4096);
    }

    private static boolean d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : c(packageManager, context.getPackageName())).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    static boolean e(Context context) {
        return d(context, "android.permission.CAMERA");
    }
}
