package rc;

import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.c f19248b;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            dVar.success(null);
        }
    }

    public b(fc.a aVar) {
        a aVar2 = new a();
        this.f19248b = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/backgesture", sc.q.f20518b);
        this.f19247a = jVar;
        jVar.e(aVar2);
    }
}
