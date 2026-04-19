package kd;

import ae.r;
import jc.a;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements jc.a, j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f14458a;

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "objectbox_flutter_libs");
        this.f14458a = jVar;
        jVar.e(this);
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f14458a;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        r.f(iVar, "call");
        r.f(dVar, "result");
        if (r.b(iVar.f20503a, "loadObjectBoxLibrary")) {
            dVar.success(null);
        } else {
            dVar.notImplemented();
        }
    }
}
