package bc;

import ae.r;
import android.content.Context;
import jc.a;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements jc.a, kc.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5706d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dev.fluttercommunity.plus.share.a f5708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f5709c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        r.f(cVar, "binding");
        dev.fluttercommunity.plus.share.a aVar = this.f5708b;
        b bVar = null;
        if (aVar == null) {
            r.t("manager");
            aVar = null;
        }
        cVar.b(aVar);
        b bVar2 = this.f5707a;
        if (bVar2 == null) {
            r.t("share");
        } else {
            bVar = bVar2;
        }
        bVar.l(cVar.getActivity());
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "binding");
        this.f5709c = new j(bVar.b(), "dev.fluttercommunity.plus/share");
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        this.f5708b = new dev.fluttercommunity.plus.share.a(contextA);
        Context contextA2 = bVar.a();
        r.e(contextA2, "getApplicationContext(...)");
        dev.fluttercommunity.plus.share.a aVar = this.f5708b;
        j jVar = null;
        if (aVar == null) {
            r.t("manager");
            aVar = null;
        }
        b bVar2 = new b(contextA2, null, aVar);
        this.f5707a = bVar2;
        dev.fluttercommunity.plus.share.a aVar2 = this.f5708b;
        if (aVar2 == null) {
            r.t("manager");
            aVar2 = null;
        }
        bc.a aVar3 = new bc.a(bVar2, aVar2);
        j jVar2 = this.f5709c;
        if (jVar2 == null) {
            r.t("methodChannel");
        } else {
            jVar = jVar2;
        }
        jVar.e(aVar3);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        b bVar = this.f5707a;
        if (bVar == null) {
            r.t("share");
            bVar = null;
        }
        bVar.l(null);
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f5709c;
        if (jVar == null) {
            r.t("methodChannel");
            jVar = null;
        }
        jVar.e(null);
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        r.f(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
