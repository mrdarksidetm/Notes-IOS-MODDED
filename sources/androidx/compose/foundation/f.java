package androidx.compose.foundation;

import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class f extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f2273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final g f2274w;

    private f(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        super(mVar, z10, str, iVar, aVar, null);
        this.f2273v = (h) a2(new h(z10, str, iVar, aVar, null, null, null));
        this.f2274w = (g) a2(new g(z10, mVar, aVar, i2()));
    }

    public /* synthetic */ f(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a aVar, ae.j jVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    @Override // androidx.compose.foundation.a
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public g h2() {
        return this.f2274w;
    }

    public h l2() {
        return this.f2273v;
    }

    public final void m2(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        j2(mVar, z10, str, iVar, aVar);
        l2().c2(z10, str, iVar, aVar, null, null);
        h2().n2(z10, mVar, aVar);
    }
}
