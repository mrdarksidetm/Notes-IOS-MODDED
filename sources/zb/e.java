package zb;

import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
class e implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24322a;

    e(a aVar) {
        this.f24322a = aVar;
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        if ("check".equals(iVar.f20503a)) {
            dVar.success(this.f24322a.d());
        } else {
            dVar.notImplemented();
        }
    }
}
