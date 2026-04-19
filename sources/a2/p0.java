package a2;

import a2.k0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends o0 implements y1.d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u0 f253i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<y1.a, Integer> f255k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private y1.f0 f257m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f254j = w2.n.f22418b.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y1.z f256l = new y1.z(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<y1.a, Integer> f258n = new LinkedHashMap();

    public p0(u0 u0Var) {
        this.f253i = u0Var;
    }

    private final void E1(long j10) {
        if (w2.n.i(W0(), j10)) {
            return;
        }
        H1(j10);
        k0.a aVarE = B1().S().E();
        if (aVarE != null) {
            aVarE.t1();
        }
        Z0(this.f253i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(y1.f0 f0Var) {
        md.i0 i0Var;
        if (f0Var != null) {
            w0(w2.q.a(f0Var.getWidth(), f0Var.getHeight()));
            i0Var = md.i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            w0(w2.p.f22421b.a());
        }
        if (!ae.r.b(this.f257m, f0Var) && f0Var != null) {
            Map<y1.a, Integer> map = this.f255k;
            if ((!(map == null || map.isEmpty()) || (!f0Var.d().isEmpty())) && !ae.r.b(f0Var.d(), this.f255k)) {
                w1().d().m();
                Map linkedHashMap = this.f255k;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f255k = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(f0Var.d());
            }
        }
        this.f257m = f0Var;
    }

    public final u0 A1() {
        return this.f253i;
    }

    public abstract int B(int i10);

    public f0 B1() {
        return this.f253i.Y1();
    }

    @Override // a2.o0, y1.n
    public boolean C0() {
        return true;
    }

    public final y1.z C1() {
        return this.f256l;
    }

    protected void D1() {
        N0().a();
    }

    public abstract int E(int i10);

    public final void F1(long j10) {
        long jC0 = c0();
        E1(w2.o.a(w2.n.j(j10) + w2.n.j(jC0), w2.n.k(j10) + w2.n.k(jC0)));
    }

    public final long G1(p0 p0Var) {
        long jA = w2.n.f22418b.a();
        p0 p0VarZ1 = this;
        while (!ae.r.b(p0VarZ1, p0Var)) {
            long jW0 = p0VarZ1.W0();
            jA = w2.o.a(w2.n.j(jA) + w2.n.j(jW0), w2.n.k(jA) + w2.n.k(jW0));
            u0 u0VarF2 = p0VarZ1.f253i.f2();
            ae.r.c(u0VarF2);
            p0VarZ1 = u0VarF2.Z1();
            ae.r.c(p0VarZ1);
        }
        return jA;
    }

    public void H1(long j10) {
        this.f254j = j10;
    }

    @Override // a2.o0
    public o0 I0() {
        u0 u0VarE2 = this.f253i.e2();
        if (u0VarE2 != null) {
            return u0VarE2.Z1();
        }
        return null;
    }

    @Override // a2.o0
    public boolean L0() {
        return this.f257m != null;
    }

    @Override // a2.o0
    public y1.f0 N0() {
        y1.f0 f0Var = this.f257m;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    public abstract int W(int i10);

    @Override // a2.o0
    public long W0() {
        return this.f254j;
    }

    @Override // y1.h0, y1.m
    public Object f() {
        return this.f253i.f();
    }

    @Override // w2.d
    public float getDensity() {
        return this.f253i.getDensity();
    }

    @Override // y1.n
    public w2.r getLayoutDirection() {
        return this.f253i.getLayoutDirection();
    }

    public abstract int k(int i10);

    @Override // a2.o0
    public void m1() {
        v0(W0(), 0.0f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y1.t0
    public final void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        E1(j10);
        if (i1()) {
            return;
        }
        D1();
    }

    public b w1() {
        b bVarB = this.f253i.Y1().S().B();
        ae.r.c(bVarB);
        return bVarB;
    }

    public final int x1(y1.a aVar) {
        Integer num = this.f258n.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // w2.l
    public float y0() {
        return this.f253i.y0();
    }

    protected final Map<y1.a, Integer> y1() {
        return this.f258n;
    }

    public y1.r z1() {
        return this.f256l;
    }
}
