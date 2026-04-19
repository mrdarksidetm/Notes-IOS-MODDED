package e9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f10785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f10786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f10787d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10787d == null) {
            boolean z10 = false;
            if (l.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f10787d = Boolean.valueOf(z10);
        }
        return f10787d.booleanValue();
    }

    public static boolean b() {
        int i10 = t8.l.f21332a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !l.g()) {
            return true;
        }
        if (e(context)) {
            return !l.h() || l.j();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f10785b == null) {
            boolean z10 = false;
            if (l.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f10785b = Boolean.valueOf(z10);
        }
        return f10785b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f10786c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f10786c = Boolean.valueOf(z10);
        }
        return f10786c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f10784a == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f10784a = Boolean.valueOf(z10);
        }
        return f10784a.booleanValue();
    }
}
