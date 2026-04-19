package a2;

import a2.e1;
import androidx.compose.ui.e;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e.c implements a0, q, n1, j1, z1.h, z1.k, h1, z, s, j1.c, j1.j, j1.m, f1, i1.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e.b f43n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z1.a f45p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashSet<z1.c<?>> f46q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y1.r f47r;

    static final class a extends ae.s implements zd.a<md.i0> {
        a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.i2();
        }
    }

    public static final class b implements e1.b {
        b() {
        }

        @Override // a2.e1.b
        public void c() {
            if (c.this.f47r == null) {
                c cVar = c.this;
                cVar.B(k.h(cVar, w0.a(128)));
            }
        }
    }

    /* JADX INFO: renamed from: a2.c$c, reason: collision with other inner class name */
    static final class C0001c extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.b f50a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f51b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0001c(e.b bVar, c cVar) {
            super(0);
            this.f50a = bVar;
            this.f51b = cVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((i1.i) this.f50a).z(this.f51b);
        }
    }

    static final class d extends ae.s implements zd.a<md.i0> {
        d() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e.b bVarB2 = c.this.b2();
            ae.r.d(bVarB2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((z1.d) bVarB2).q(c.this);
        }
    }

    public c(e.b bVar) {
        U1(x0.f(bVar));
        this.f43n = bVar;
        this.f44o = true;
        this.f46q = new HashSet<>();
    }

    private final void d2(boolean z10) {
        if (!H1()) {
            throw new IllegalStateException("initializeModifier called on unattached node".toString());
        }
        e.b bVar = this.f43n;
        if ((w0.a(32) & C1()) != 0) {
            if (bVar instanceof z1.d) {
                Y1(new a());
            }
            if (bVar instanceof z1.j) {
                j2((z1.j) bVar);
            }
        }
        if ((w0.a(4) & C1()) != 0) {
            if (bVar instanceof i1.i) {
                this.f44o = true;
            }
            if (!z10) {
                d0.a(this);
            }
        }
        if ((w0.a(2) & C1()) != 0) {
            if (a2.d.e(this)) {
                u0 u0VarZ1 = z1();
                ae.r.c(u0VarZ1);
                ((b0) u0VarZ1).W2(this);
                u0VarZ1.t2();
            }
            if (!z10) {
                d0.a(this);
                k.k(this).C0();
            }
        }
        if (bVar instanceof y1.w0) {
            ((y1.w0) bVar).t(k.k(this));
        }
        if ((w0.a(128) & C1()) != 0) {
            if ((bVar instanceof y1.m0) && a2.d.e(this)) {
                k.k(this).C0();
            }
            if (bVar instanceof y1.l0) {
                this.f47r = null;
                if (a2.d.e(this)) {
                    k.l(this).m(new b());
                }
            }
        }
        if (((w0.a(256) & C1()) != 0) && (bVar instanceof y1.k0) && a2.d.e(this)) {
            k.k(this).C0();
        }
        if (bVar instanceof j1.l) {
            ((j1.l) bVar).o().d().b(this);
        }
        if (((w0.a(16) & C1()) != 0) && (bVar instanceof v1.i0)) {
            ((v1.i0) bVar).p();
            z1();
            throw null;
        }
        if ((w0.a(8) & C1()) != 0) {
            k.l(this).p();
        }
    }

    private final void g2() {
        if (!H1()) {
            throw new IllegalStateException("unInitializeModifier called on unattached node".toString());
        }
        e.b bVar = this.f43n;
        if ((w0.a(32) & C1()) != 0) {
            if (bVar instanceof z1.j) {
                k.l(this).getModifierLocalManager().d(this, ((z1.j) bVar).getKey());
            }
            if (bVar instanceof z1.d) {
                ((z1.d) bVar).q(a2.d.f58a);
            }
        }
        if ((w0.a(8) & C1()) != 0) {
            k.l(this).p();
        }
        if (bVar instanceof j1.l) {
            ((j1.l) bVar).o().d().v(this);
        }
    }

    private final void h2() {
        e.b bVar = this.f43n;
        if (bVar instanceof i1.i) {
            k.l(this).getSnapshotObserver().i(this, a2.d.f59b, new C0001c(bVar, this));
        }
        this.f44o = false;
    }

    private final void j2(z1.j<?> jVar) {
        z1.a aVar = this.f45p;
        if (aVar != null && aVar.a(jVar.getKey())) {
            aVar.c(jVar);
            k.l(this).getModifierLocalManager().f(this, jVar.getKey());
        } else {
            this.f45p = new z1.a(jVar);
            if (a2.d.e(this)) {
                k.l(this).getModifierLocalManager().a(this, jVar.getKey());
            }
        }
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        i1.j jVar = (i1.j) bVar;
        if (this.f44o && (bVar instanceof i1.i)) {
            h2();
        }
        jVar.A(cVar);
    }

    @Override // a2.z
    public void B(y1.r rVar) {
        this.f47r = rVar;
        e.b bVar = this.f43n;
        if (bVar instanceof y1.l0) {
            ((y1.l0) bVar).B(rVar);
        }
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        d2(true);
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        g2();
    }

    @Override // a2.f1
    public boolean O() {
        return H1();
    }

    @Override // j1.j
    public void S(androidx.compose.ui.focus.d dVar) {
        e.b bVar = this.f43n;
        if (!(bVar instanceof j1.h)) {
            throw new IllegalStateException("applyFocusProperties called on wrong node".toString());
        }
        ((j1.h) bVar).i(new j1.g(dVar));
    }

    @Override // a2.n1
    public void U(g2.x xVar) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        g2.l lVarY = ((g2.n) bVar).y();
        ae.r.d(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((g2.l) xVar).d(lVarY);
    }

    @Override // a2.j1
    public void Z(v1.p pVar, v1.r rVar, long j10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v1.i0) bVar).p();
        throw null;
    }

    public final e.b b2() {
        return this.f43n;
    }

    @Override // i1.d
    public long c() {
        return w2.q.c(k.h(this, w0.a(128)).a());
    }

    @Override // a2.j1
    public void c0() {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v1.i0) bVar).p();
        throw null;
    }

    public final HashSet<z1.c<?>> c2() {
        return this.f46q;
    }

    @Override // a2.a0
    public y1.f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((y1.v) bVar).d(g0Var, d0Var, j10);
    }

    public final void e2() {
        this.f44o = true;
        r.a(this);
    }

    @Override // a2.z
    public void f(long j10) {
        e.b bVar = this.f43n;
        if (bVar instanceof y1.m0) {
            ((y1.m0) bVar).f(j10);
        }
    }

    public final void f2(e.b bVar) {
        if (H1()) {
            g2();
        }
        this.f43n = bVar;
        U1(x0.f(bVar));
        if (H1()) {
            d2(false);
        }
    }

    @Override // a2.q
    public void g0() {
        this.f44o = true;
        r.a(this);
    }

    @Override // i1.d
    public w2.d getDensity() {
        return k.k(this).I();
    }

    @Override // i1.d
    public w2.r getLayoutDirection() {
        return k.k(this).getLayoutDirection();
    }

    @Override // a2.j1
    public boolean i1() {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v1.i0) bVar).p();
        throw null;
    }

    public final void i2() {
        if (H1()) {
            this.f46q.clear();
            k.l(this).getSnapshotObserver().i(this, a2.d.f60c, new d());
        }
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((y1.v) bVar).j(nVar, mVar, i10);
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((y1.v) bVar).k(nVar, mVar, i10);
    }

    @Override // a2.j1
    public boolean k0() {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v1.i0) bVar).p();
        throw null;
    }

    @Override // a2.s
    public void l(y1.r rVar) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((y1.k0) bVar).l(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [v0.d] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // z1.h, z1.k
    public <T> T p(z1.c<T> cVar) {
        androidx.compose.ui.node.a aVarH0;
        this.f46q.add(cVar);
        int iA = w0.a(32);
        if (!L0().H1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        e.c cVarE1 = L0().E1();
        f0 f0VarK = k.k(this);
        while (f0VarK != null) {
            if ((f0VarK.h0().k().x1() & iA) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.C1() & iA) != 0) {
                        ?? G = cVarE1;
                        ?? dVar = 0;
                        while (G != 0) {
                            if (G instanceof z1.h) {
                                z1.h hVar = (z1.h) G;
                                if (hVar.u0().a(cVar)) {
                                    return (T) hVar.u0().b(cVar);
                                }
                            } else {
                                if (((G.C1() & iA) != 0) && (G instanceof l)) {
                                    e.c cVarB2 = ((l) G).b2();
                                    int i10 = 0;
                                    G = G;
                                    dVar = dVar;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            dVar = dVar;
                                            if (i10 == 1) {
                                                G = cVarB2;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (G != 0) {
                                                    dVar.b(G);
                                                    G = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        G = G;
                                        dVar = dVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            G = k.g(dVar);
                        }
                    }
                    cVarE1 = cVarE1.E1();
                }
            }
            f0VarK = f0VarK.k0();
            cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
        }
        return cVar.a().invoke();
    }

    @Override // a2.h1
    public Object r(w2.d dVar, Object obj) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((y1.q0) bVar).r(dVar, obj);
    }

    @Override // j1.c
    public void s(j1.n nVar) {
        e.b bVar = this.f43n;
        if (!(bVar instanceof j1.b)) {
            throw new IllegalStateException("onFocusEvent called on wrong node".toString());
        }
        ((j1.b) bVar).s(nVar);
    }

    public String toString() {
        return this.f43n.toString();
    }

    @Override // z1.h
    public z1.g u0() {
        z1.a aVar = this.f45p;
        return aVar != null ? aVar : z1.i.a();
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((y1.v) bVar).v(nVar, mVar, i10);
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        e.b bVar = this.f43n;
        ae.r.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((y1.v) bVar).x(nVar, mVar, i10);
    }
}
