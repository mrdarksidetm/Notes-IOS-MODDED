package i1;

import md.i0;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements w2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f12280a = l.f12284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f12281b;

    public final long c() {
        return this.f12280a.c();
    }

    public final k d() {
        return this.f12281b;
    }

    public final k f(zd.l<? super n1.c, i0> lVar) {
        k kVar = new k(lVar);
        this.f12281b = kVar;
        return kVar;
    }

    @Override // w2.d
    public float getDensity() {
        return this.f12280a.getDensity().getDensity();
    }

    public final r getLayoutDirection() {
        return this.f12280a.getLayoutDirection();
    }

    public final void j(d dVar) {
        this.f12280a = dVar;
    }

    public final void k(k kVar) {
        this.f12281b = kVar;
    }

    @Override // w2.l
    public float y0() {
        return this.f12280a.getDensity().y0();
    }
}
