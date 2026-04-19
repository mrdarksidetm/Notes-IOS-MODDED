package androidx.lifecycle;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class v implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f4393a;

    public v(d dVar) {
        ae.r.f(dVar, "generatedAdapter");
        this.f4393a = dVar;
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        ae.r.f(eVar, "source");
        ae.r.f(aVar, "event");
        this.f4393a.a(eVar, aVar, false, null);
        this.f4393a.a(eVar, aVar, true, null);
    }
}
