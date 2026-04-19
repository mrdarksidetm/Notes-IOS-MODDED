package t8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f21332a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21334c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f21335d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f21333b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f21336e = new AtomicBoolean();

    @Deprecated
    public static void a(Context context, int i10) throws j, i {
        int iH = h.f().h(context, i10);
        if (iH != 0) {
            Intent intentB = h.f().b(context, iH, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iH);
            if (intentB != null) {
                throw new j(iH, "Google Play Services not available", intentB);
            }
            throw new i(iH);
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String c(int i10) {
        return b.C(i10);
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f21335d) {
                try {
                    PackageInfo packageInfoC = g9.d.a(context).c("com.google.android.gms", 64);
                    m.a(context);
                    if (packageInfoC == null || m.d(packageInfoC, false) || !m.d(packageInfoC, true)) {
                        f21334c = false;
                    } else {
                        f21334c = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
            }
            return f21334c || !e9.g.b();
        } finally {
            f21335d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.l.f(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean g(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(Context context) {
        if (!e9.l.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        w8.m.k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && com.amazon.a.a.o.b.f7427af.equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    static boolean j(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (e9.l.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
