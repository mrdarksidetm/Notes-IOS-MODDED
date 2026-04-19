package g9;

import android.content.Context;
import e9.l;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f11495b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f11494a;
        if (context2 != null && (bool = f11495b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f11495b = null;
        if (!l.h()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f11495b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f11495b = boolValueOf;
            }
            f11494a = applicationContext;
            return f11495b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f11495b = boolValueOf;
        f11494a = applicationContext;
        return f11495b.booleanValue();
    }
}
