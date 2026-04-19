package zb;

import android.content.Context;
import android.net.ConnectivityManager;
import jc.a;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class f implements jc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f24323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.c f24324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f24325c;

    private void a(sc.b bVar, Context context) {
        this.f24323a = new j(bVar, "dev.fluttercommunity.plus/connectivity");
        this.f24324b = new sc.c(bVar, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f24325c = new d(context, aVar);
        this.f24323a.e(eVar);
        this.f24324b.d(this.f24325c);
    }

    private void b() {
        this.f24323a.e(null);
        this.f24324b.d(null);
        this.f24325c.b(null);
        this.f24323a = null;
        this.f24324b = null;
        this.f24325c = null;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
