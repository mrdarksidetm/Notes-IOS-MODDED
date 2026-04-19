package n0;

import a2.a0;
import a2.q;
import a2.s;
import i2.d;
import i2.d0;
import i2.g0;
import i2.u;
import java.util.List;
import l1.m0;
import md.i0;
import n2.t;
import y1.f0;
import y1.m;
import y1.n;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a2.l implements a0, q, s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h f15653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k f15654q;

    private g(i2.d dVar, g0 g0Var, t.b bVar, zd.l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, zd.l<? super List<k1.h>, i0> lVar2, h hVar, m0 m0Var) {
        this.f15653p = hVar;
        this.f15654q = (k) a2(new k(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, this.f15653p, m0Var, null));
        if (this.f15653p == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }

    public /* synthetic */ g(i2.d dVar, g0 g0Var, t.b bVar, zd.l lVar, int i10, boolean z10, int i11, int i12, List list, zd.l lVar2, h hVar, m0 m0Var, ae.j jVar) {
        this(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, m0Var);
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        this.f15654q.i2(cVar);
    }

    @Override // a2.a0
    public f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        return this.f15654q.o2(g0Var, d0Var, j10);
    }

    public final void f2(i2.d dVar, g0 g0Var, List<d.b<u>> list, int i10, int i11, boolean z10, t.b bVar, int i12, zd.l<? super d0, i0> lVar, zd.l<? super List<k1.h>, i0> lVar2, h hVar, m0 m0Var) {
        k kVar = this.f15654q;
        kVar.h2(kVar.u2(m0Var, g0Var), this.f15654q.w2(dVar), this.f15654q.v2(g0Var, list, i10, i11, z10, bVar, i12), this.f15654q.t2(lVar, lVar2, hVar));
        this.f15653p = hVar;
        a2.d0.b(this);
    }

    @Override // a2.a0
    public int j(n nVar, m mVar, int i10) {
        return this.f15654q.p2(nVar, mVar, i10);
    }

    @Override // a2.a0
    public int k(n nVar, m mVar, int i10) {
        return this.f15654q.q2(nVar, mVar, i10);
    }

    @Override // a2.s
    public void l(r rVar) {
        h hVar = this.f15653p;
        if (hVar != null) {
            hVar.g(rVar);
        }
    }

    @Override // a2.a0
    public int v(n nVar, m mVar, int i10) {
        return this.f15654q.n2(nVar, mVar, i10);
    }

    @Override // a2.a0
    public int x(n nVar, m mVar, int i10) {
        return this.f15654q.m2(nVar, mVar, i10);
    }
}
