package v;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
class h {

    private static class a {
        static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || !a.a(context.getPackageManager())) ? false : true;
    }
}
