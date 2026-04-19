package na;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ka.c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f16081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f16082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16083d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f16080a = contextA;
        this.f16081b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16082c = cVar;
        this.f16083d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        return this.f16081b.contains("firebase_data_collection_default_enabled") ? this.f16081b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f16080a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f16080a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f16083d != z10) {
            this.f16083d = z10;
            this.f16082c.a(new ka.a<>(x9.b.class, new x9.b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f16083d;
    }

    public synchronized void e(Boolean bool) {
        boolean zEquals;
        if (bool == null) {
            this.f16081b.edit().remove("firebase_data_collection_default_enabled").apply();
            zEquals = d();
        } else {
            zEquals = Boolean.TRUE.equals(bool);
            this.f16081b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
        }
        f(zEquals);
    }
}
