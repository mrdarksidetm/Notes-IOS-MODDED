package ac;

import ae.r;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import jc.a;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements jc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f685a;

    private final void a(sc.b bVar, Context context) {
        this.f685a = new j(bVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        r.e(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        r.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        c cVar = new c(packageManager, (ActivityManager) systemService);
        j jVar = this.f685a;
        if (jVar == null) {
            r.t("methodChannel");
            jVar = null;
        }
        jVar.e(cVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "binding");
        sc.b bVarB = bVar.b();
        r.e(bVarB, "getBinaryMessenger(...)");
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        a(bVarB, contextA);
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f685a;
        if (jVar == null) {
            r.t("methodChannel");
            jVar = null;
        }
        jVar.e(null);
    }
}
