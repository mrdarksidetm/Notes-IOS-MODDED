package s6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Build.VERSION.SDK_INT < 30 ? context.getPackageManager().getInstallerPackageName(packageName) : context.getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageName();
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    a0 a();

    String b();

    f2 c();

    String d();

    k3 e();

    String f();

    String g();
}
