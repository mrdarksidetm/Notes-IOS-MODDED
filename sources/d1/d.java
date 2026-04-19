package d1;

import d1.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f9343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9344t;

    public d(int i10, n nVar, zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2, c cVar) {
        super(i10, nVar, lVar, lVar2);
        this.f9343s = cVar;
        cVar.m(this);
    }

    private final void S() {
        if (this.f9344t) {
            return;
        }
        this.f9344t = true;
        this.f9343s.n(this);
    }

    @Override // d1.c
    public l C() {
        Map<i0, ? extends i0> mapR;
        if (this.f9343s.D() || this.f9343s.e()) {
            return new l.a(this);
        }
        v0.b<g0> bVarE = E();
        int iF = f();
        if (bVarE != null) {
            c cVar = this.f9343s;
            mapR = p.R(cVar, this, cVar.g());
        } else {
            mapR = null;
        }
        synchronized (p.I()) {
            p.g0(this);
            if (bVarE == null || bVarE.size() == 0) {
                b();
            } else {
                l lVarH = H(this.f9343s.f(), mapR, this.f9343s.g());
                if (!ae.r.b(lVarH, l.b.f9378a)) {
                    return lVarH;
                }
                v0.b<g0> bVarE2 = this.f9343s.E();
                if (bVarE2 != null) {
                    bVarE2.a(bVarE);
                } else {
                    this.f9343s.O(bVarE);
                    O(null);
                }
            }
            if (this.f9343s.f() < iF) {
                this.f9343s.B();
            }
            c cVar2 = this.f9343s;
            cVar2.v(cVar2.g().r(iF).o(F()));
            this.f9343s.I(iF);
            this.f9343s.K(y());
            this.f9343s.J(F());
            this.f9343s.L(G());
            md.i0 i0Var = md.i0.f15558a;
            N(true);
            S();
            return l.b.f9378a;
        }
    }

    @Override // d1.c, d1.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        S();
    }
}
