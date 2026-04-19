package a2;

import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends o0 implements y1.d0, y1.r, f1 {
    public static final e B = new e(null);
    private static final zd.l<u0, md.i0> C = d.f310a;
    private static final zd.l<u0, md.i0> D = c.f309a;
    private static final androidx.compose.ui.graphics.e E = new androidx.compose.ui.graphics.e();
    private static final y F = new y();
    private static final float[] G = l1.z0.c(null, 1, null);
    private static final f H = new a();
    private static final f I = new b();
    private d1 A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0 f291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u0 f292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u0 f293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.l<? super androidx.compose.ui.graphics.d, md.i0> f296n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y1.f0 f300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<y1.a, Integer> f301s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private k1.d f304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private y f305w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f308z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w2.d f297o = Y1().I();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w2.r f298p = Y1().getLayoutDirection();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f299q = 0.8f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f302t = w2.n.f22418b.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final zd.l<l1.b0, md.i0> f306x = new g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final zd.a<md.i0> f307y = new j();

    public static final class a implements f {
        a() {
        }

        @Override // a2.u0.f
        public int a() {
            return w0.a(16);
        }

        @Override // a2.u0.f
        public boolean b(f0 f0Var) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        @Override // a2.u0.f
        public boolean c(e.c cVar) {
            int iA = w0.a(16);
            v0.d dVar = null;
            while (cVar != 0) {
                if (!(cVar instanceof j1)) {
                    if (((cVar.C1() & iA) != 0) && (cVar instanceof a2.l)) {
                        e.c cVarB2 = ((a2.l) cVar).b2();
                        int i10 = 0;
                        cVar = cVar;
                        while (cVarB2 != null) {
                            if ((cVarB2.C1() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVar = cVarB2;
                                } else {
                                    if (dVar == null) {
                                        dVar = new v0.d(new e.c[16], 0);
                                    }
                                    if (cVar != 0) {
                                        dVar.b(cVar);
                                        cVar = 0;
                                    }
                                    dVar.b(cVarB2);
                                }
                            }
                            cVarB2 = cVarB2.y1();
                            cVar = cVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                } else if (((j1) cVar).k0()) {
                    return true;
                }
                cVar = a2.k.g(dVar);
            }
            return false;
        }

        @Override // a2.u0.f
        public void d(f0 f0Var, long j10, t tVar, boolean z10, boolean z11) {
            f0Var.t0(j10, tVar, z10, z11);
        }
    }

    public static final class b implements f {
        b() {
        }

        @Override // a2.u0.f
        public int a() {
            return w0.a(8);
        }

        @Override // a2.u0.f
        public boolean b(f0 f0Var) {
            g2.l lVarG = f0Var.G();
            boolean z10 = false;
            if (lVarG != null && lVarG.t()) {
                z10 = true;
            }
            return !z10;
        }

        @Override // a2.u0.f
        public boolean c(e.c cVar) {
            return false;
        }

        @Override // a2.u0.f
        public void d(f0 f0Var, long j10, t tVar, boolean z10, boolean z11) {
            f0Var.v0(j10, tVar, z10, z11);
        }
    }

    static final class c extends ae.s implements zd.l<u0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f309a = new c();

        c() {
            super(1);
        }

        public final void a(u0 u0Var) {
            d1 d1VarX1 = u0Var.X1();
            if (d1VarX1 != null) {
                d1VarX1.invalidate();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(u0 u0Var) {
            a(u0Var);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<u0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f310a = new d();

        d() {
            super(1);
        }

        public final void a(u0 u0Var) {
            if (u0Var.O()) {
                y yVar = u0Var.f305w;
                if (yVar == null) {
                    u0.Q2(u0Var, false, 1, null);
                    return;
                }
                u0.F.a(yVar);
                u0.Q2(u0Var, false, 1, null);
                if (u0.F.c(yVar)) {
                    return;
                }
                f0 f0VarY1 = u0Var.Y1();
                k0 k0VarS = f0VarY1.S();
                if (k0VarS.s() > 0) {
                    if (k0VarS.t() || k0VarS.u()) {
                        f0.i1(f0VarY1, false, 1, null);
                    }
                    k0VarS.F().A1();
                }
                e1 e1VarJ0 = f0VarY1.j0();
                if (e1VarJ0 != null) {
                    e1VarJ0.y(f0VarY1);
                }
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(u0 u0Var) {
            a(u0Var);
            return md.i0.f15558a;
        }
    }

    public static final class e {
        private e() {
        }

        public /* synthetic */ e(ae.j jVar) {
            this();
        }

        public final f a() {
            return u0.H;
        }

        public final f b() {
            return u0.I;
        }
    }

    public interface f {
        int a();

        boolean b(f0 f0Var);

        boolean c(e.c cVar);

        void d(f0 f0Var, long j10, t tVar, boolean z10, boolean z11);
    }

    static final class g extends ae.s implements zd.l<l1.b0, md.i0> {

        static final class a extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0 f312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1.b0 f313b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, l1.b0 b0Var) {
                super(0);
                this.f312a = u0Var;
                this.f313b = b0Var;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f312a.O1(this.f313b);
            }
        }

        g() {
            super(1);
        }

        public final void a(l1.b0 b0Var) {
            u0 u0Var;
            boolean z10;
            if (u0.this.Y1().j()) {
                u0.this.c2().i(u0.this, u0.D, new a(u0.this, b0Var));
                u0Var = u0.this;
                z10 = false;
            } else {
                u0Var = u0.this;
                z10 = true;
            }
            u0Var.f308z = z10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(l1.b0 b0Var) {
            a(b0Var);
            return md.i0.f15558a;
        }
    }

    static final class h extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t f318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f320g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11) {
            super(0);
            this.f315b = cVar;
            this.f316c = fVar;
            this.f317d = j10;
            this.f318e = tVar;
            this.f319f = z10;
            this.f320g = z11;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0.this.k2(v0.b(this.f315b, this.f316c.a(), w0.a(2)), this.f316c, this.f317d, this.f318e, this.f319f, this.f320g);
        }
    }

    static final class i extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t f325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f328h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f322b = cVar;
            this.f323c = fVar;
            this.f324d = j10;
            this.f325e = tVar;
            this.f326f = z10;
            this.f327g = z11;
            this.f328h = f10;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0.this.l2(v0.b(this.f322b, this.f323c.a(), w0.a(2)), this.f323c, this.f324d, this.f325e, this.f326f, this.f327g, this.f328h);
        }
    }

    static final class j extends ae.s implements zd.a<md.i0> {
        j() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0 u0VarF2 = u0.this.f2();
            if (u0VarF2 != null) {
                u0VarF2.o2();
            }
        }
    }

    static final class k extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t f334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f336g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f337h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f331b = cVar;
            this.f332c = fVar;
            this.f333d = j10;
            this.f334e = tVar;
            this.f335f = z10;
            this.f336g = z11;
            this.f337h = f10;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0.this.J2(v0.b(this.f331b, this.f332c.a(), w0.a(2)), this.f332c, this.f333d, this.f334e, this.f335f, this.f336g, this.f337h);
        }
    }

    static final class l extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<androidx.compose.ui.graphics.d, md.i0> f338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            super(0);
            this.f338a = lVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f338a.invoke(u0.E);
        }
    }

    public u0(f0 f0Var) {
        this.f291i = f0Var;
    }

    private final void A2(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        O2(this, lVar, false, 2, null);
        if (!w2.n.i(W0(), j10)) {
            F2(j10);
            Y1().S().F().A1();
            d1 d1Var = this.A;
            if (d1Var != null) {
                d1Var.g(j10);
            } else {
                u0 u0Var = this.f293k;
                if (u0Var != null) {
                    u0Var.o2();
                }
            }
            Z0(this);
            e1 e1VarJ0 = Y1().j0();
            if (e1VarJ0 != null) {
                e1VarJ0.e(Y1());
            }
        }
        this.f303u = f10;
    }

    public static /* synthetic */ void D2(u0 u0Var, k1.d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        u0Var.C2(dVar, z10, z11);
    }

    private final void I1(u0 u0Var, k1.d dVar, boolean z10) {
        if (u0Var == this) {
            return;
        }
        u0 u0Var2 = this.f293k;
        if (u0Var2 != null) {
            u0Var2.I1(u0Var, dVar, z10);
        }
        S1(dVar, z10);
    }

    private final long J1(u0 u0Var, long j10) {
        if (u0Var == this) {
            return j10;
        }
        u0 u0Var2 = this.f293k;
        return (u0Var2 == null || ae.r.b(u0Var, u0Var2)) ? R1(j10) : R1(u0Var2.J1(u0Var, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            n2(fVar, j10, tVar, z10, z11);
        } else if (fVar.c(cVar)) {
            tVar.B(cVar, f10, z11, new k(cVar, fVar, j10, tVar, z10, z11, f10));
        } else {
            J2(v0.b(cVar, fVar.a(), w0.a(2)), fVar, j10, tVar, z10, z11, f10);
        }
    }

    private final u0 K2(y1.r rVar) {
        u0 u0VarB;
        y1.z zVar = rVar instanceof y1.z ? (y1.z) rVar : null;
        if (zVar != null && (u0VarB = zVar.b()) != null) {
            return u0VarB;
        }
        ae.r.d(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (u0) rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(l1.b0 b0Var) {
        e.c cVarI2 = i2(w0.a(4));
        if (cVarI2 == null) {
            z2(b0Var);
        } else {
            Y1().Z().d(b0Var, w2.q.c(a()), this, cVarI2);
        }
    }

    public static /* synthetic */ void O2(u0 u0Var, zd.l lVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        u0Var.N2(lVar, z10);
    }

    private final void P2(boolean z10) {
        e1 e1VarJ0;
        d1 d1Var = this.A;
        if (d1Var == null) {
            if (!(this.f296n == null)) {
                throw new IllegalStateException("null layer with a non-null layerBlock".toString());
            }
            return;
        }
        zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar = this.f296n;
        if (lVar == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        }
        androidx.compose.ui.graphics.e eVar = E;
        eVar.x();
        eVar.A(Y1().I());
        eVar.B(w2.q.c(a()));
        c2().i(this, C, new l(lVar));
        y yVar = this.f305w;
        if (yVar == null) {
            yVar = new y();
            this.f305w = yVar;
        }
        yVar.b(eVar);
        d1Var.i(eVar, Y1().getLayoutDirection(), Y1().I());
        this.f295m = eVar.j();
        this.f299q = eVar.d();
        if (!z10 || (e1VarJ0 = Y1().j0()) == null) {
            return;
        }
        e1VarJ0.e(Y1());
    }

    static /* synthetic */ void Q2(u0 u0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        u0Var.P2(z10);
    }

    private final void S1(k1.d dVar, boolean z10) {
        float fJ = w2.n.j(W0());
        dVar.i(dVar.b() - fJ);
        dVar.j(dVar.c() - fJ);
        float fK = w2.n.k(W0());
        dVar.k(dVar.d() - fK);
        dVar.h(dVar.a() - fK);
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.a(dVar, true);
            if (this.f295m && z10) {
                dVar.e(0.0f, 0.0f, w2.p.g(a()), w2.p.f(a()));
                dVar.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g1 c2() {
        return j0.b(Y1()).getSnapshotObserver();
    }

    private final boolean h2(int i10) {
        e.c cVarJ2 = j2(x0.i(i10));
        return cVarJ2 != null && a2.k.e(cVarJ2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c j2(boolean z10) {
        e.c cVarD2;
        if (Y1().i0() == this) {
            return Y1().h0().k();
        }
        if (!z10) {
            u0 u0Var = this.f293k;
            if (u0Var != null) {
                return u0Var.d2();
            }
            return null;
        }
        u0 u0Var2 = this.f293k;
        if (u0Var2 == null || (cVarD2 = u0Var2.d2()) == null) {
            return null;
        }
        return cVarD2.y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11) {
        if (cVar == null) {
            n2(fVar, j10, tVar, z10, z11);
        } else {
            tVar.v(cVar, z11, new h(cVar, fVar, j10, tVar, z10, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(e.c cVar, f fVar, long j10, t tVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            n2(fVar, j10, tVar, z10, z11);
        } else {
            tVar.w(cVar, f10, z11, new i(cVar, fVar, j10, tVar, z10, z11, f10));
        }
    }

    private final long r2(long j10) {
        float fO = k1.f.o(j10);
        float fMax = Math.max(0.0f, fO < 0.0f ? -fO : fO - k0());
        float fP = k1.f.p(j10);
        return k1.g.a(fMax, Math.max(0.0f, fP < 0.0f ? -fP : fP - g0()));
    }

    @Override // y1.r
    public k1.h A(y1.r rVar, boolean z10) {
        if (!v()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!rVar.v()) {
            throw new IllegalStateException(("LayoutCoordinates " + rVar + " is not attached!").toString());
        }
        u0 u0VarK2 = K2(rVar);
        u0VarK2.s2();
        u0 u0VarQ1 = Q1(u0VarK2);
        k1.d dVarB2 = b2();
        dVarB2.i(0.0f);
        dVarB2.k(0.0f);
        dVarB2.j(w2.p.g(rVar.a()));
        dVarB2.h(w2.p.f(rVar.a()));
        while (u0VarK2 != u0VarQ1) {
            D2(u0VarK2, dVarB2, z10, false, 4, null);
            if (dVarB2.f()) {
                return k1.h.f14343e.a();
            }
            u0VarK2 = u0VarK2.f293k;
            ae.r.c(u0VarK2);
        }
        I1(u0VarQ1, dVarB2, z10);
        return k1.e.a(dVarB2);
    }

    public final void B2(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        long jC0 = c0();
        A2(w2.o.a(w2.n.j(j10) + w2.n.j(jC0), w2.n.k(j10) + w2.n.k(jC0)), f10, lVar);
    }

    public final void C2(k1.d dVar, boolean z10, boolean z11) {
        d1 d1Var = this.A;
        if (d1Var != null) {
            if (this.f295m) {
                if (z11) {
                    long jA2 = a2();
                    float fI = k1.l.i(jA2) / 2.0f;
                    float fG = k1.l.g(jA2) / 2.0f;
                    dVar.e(-fI, -fG, w2.p.g(a()) + fI, w2.p.f(a()) + fG);
                } else if (z10) {
                    dVar.e(0.0f, 0.0f, w2.p.g(a()), w2.p.f(a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            d1Var.a(dVar, false);
        }
        float fJ = w2.n.j(W0());
        dVar.i(dVar.b() + fJ);
        dVar.j(dVar.c() + fJ);
        float fK = w2.n.k(W0());
        dVar.k(dVar.d() + fK);
        dVar.h(dVar.a() + fK);
    }

    public void E2(y1.f0 f0Var) {
        y1.f0 f0Var2 = this.f300r;
        if (f0Var != f0Var2) {
            this.f300r = f0Var;
            if (f0Var2 == null || f0Var.getWidth() != f0Var2.getWidth() || f0Var.getHeight() != f0Var2.getHeight()) {
                v2(f0Var.getWidth(), f0Var.getHeight());
            }
            Map<y1.a, Integer> map = this.f301s;
            if ((!(map == null || map.isEmpty()) || (!f0Var.d().isEmpty())) && !ae.r.b(f0Var.d(), this.f301s)) {
                T1().d().m();
                Map linkedHashMap = this.f301s;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f301s = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(f0Var.d());
            }
        }
    }

    protected void F2(long j10) {
        this.f302t = j10;
    }

    public final void G2(u0 u0Var) {
        this.f292j = u0Var;
    }

    public final void H2(u0 u0Var) {
        this.f293k = u0Var;
    }

    @Override // a2.o0
    public o0 I0() {
        return this.f292j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final boolean I2() {
        e.c cVarJ2 = j2(x0.i(w0.a(16)));
        if (cVarJ2 != null && cVarJ2.H1()) {
            int iA = w0.a(16);
            if (!cVarJ2.L0().H1()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
            e.c cVarL0 = cVarJ2.L0();
            if ((cVarL0.x1() & iA) != 0) {
                while (true) {
                    cVarL0 = cVarL0.y1();
                    if (cVarL0 == null) {
                        break;
                    }
                    if ((cVarL0.C1() & iA) != 0) {
                        e.c cVarG = cVarL0;
                        v0.d dVar = null;
                        while (cVarG != 0) {
                            if (!(cVarG instanceof j1)) {
                                if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) cVarG).b2();
                                    int i10 = 0;
                                    cVarG = cVarG;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != 0) {
                                                    dVar.b(cVarG);
                                                    cVarG = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        cVarG = cVarG;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            } else if (((j1) cVarG).i1()) {
                                return true;
                            }
                            cVarG = a2.k.g(dVar);
                        }
                    }
                }
            }
        }
        return false;
    }

    protected final long K1(long j10) {
        return k1.m.a(Math.max(0.0f, (k1.l.i(j10) - k0()) / 2.0f), Math.max(0.0f, (k1.l.g(j10) - g0()) / 2.0f));
    }

    @Override // y1.r
    public long L(y1.r rVar, long j10) {
        if (rVar instanceof y1.z) {
            return k1.f.w(rVar.L(this, k1.f.w(j10)));
        }
        u0 u0VarK2 = K2(rVar);
        u0VarK2.s2();
        u0 u0VarQ1 = Q1(u0VarK2);
        while (u0VarK2 != u0VarQ1) {
            j10 = u0VarK2.L2(j10);
            u0VarK2 = u0VarK2.f293k;
            ae.r.c(u0VarK2);
        }
        return J1(u0VarQ1, j10);
    }

    @Override // a2.o0
    public boolean L0() {
        return this.f300r != null;
    }

    protected final float L1(long j10, long j11) {
        if (k0() >= k1.l.i(j11) && g0() >= k1.l.g(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jK1 = K1(j11);
        float fI = k1.l.i(jK1);
        float fG = k1.l.g(jK1);
        long jR2 = r2(j10);
        if ((fI > 0.0f || fG > 0.0f) && k1.f.o(jR2) <= fI && k1.f.p(jR2) <= fG) {
            return k1.f.n(jR2);
        }
        return Float.POSITIVE_INFINITY;
    }

    public long L2(long j10) {
        d1 d1Var = this.A;
        if (d1Var != null) {
            j10 = d1Var.e(j10, false);
        }
        return w2.o.c(j10, W0());
    }

    public final void M1(l1.b0 b0Var) {
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.d(b0Var);
            return;
        }
        float fJ = w2.n.j(W0());
        float fK = w2.n.k(W0());
        b0Var.c(fJ, fK);
        O1(b0Var);
        b0Var.c(-fJ, -fK);
    }

    public final k1.h M2() {
        if (v()) {
            y1.r rVarD = y1.s.d(this);
            k1.d dVarB2 = b2();
            long jK1 = K1(a2());
            dVarB2.i(-k1.l.i(jK1));
            dVarB2.k(-k1.l.g(jK1));
            dVarB2.j(k0() + k1.l.i(jK1));
            dVarB2.h(g0() + k1.l.g(jK1));
            u0 u0Var = this;
            while (u0Var != rVarD) {
                u0Var.C2(dVarB2, false, true);
                if (!dVarB2.f()) {
                    u0Var = u0Var.f293k;
                    ae.r.c(u0Var);
                }
            }
            return k1.e.a(dVarB2);
        }
        return k1.h.f14343e.a();
    }

    @Override // a2.o0
    public y1.f0 N0() {
        y1.f0 f0Var = this.f300r;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    protected final void N1(l1.b0 b0Var, l1.d1 d1Var) {
        b0Var.g(new k1.h(0.5f, 0.5f, w2.p.g(i0()) - 0.5f, w2.p.f(i0()) - 0.5f), d1Var);
    }

    public final void N2(zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar, boolean z10) {
        e1 e1VarJ0;
        f0 f0VarY1 = Y1();
        boolean z11 = (!z10 && this.f296n == lVar && ae.r.b(this.f297o, f0VarY1.I()) && this.f298p == f0VarY1.getLayoutDirection()) ? false : true;
        this.f296n = lVar;
        this.f297o = f0VarY1.I();
        this.f298p = f0VarY1.getLayoutDirection();
        if (!f0VarY1.G0() || lVar == null) {
            d1 d1Var = this.A;
            if (d1Var != null) {
                d1Var.destroy();
                f0VarY1.p1(true);
                this.f307y.invoke();
                if (v() && (e1VarJ0 = f0VarY1.j0()) != null) {
                    e1VarJ0.e(f0VarY1);
                }
            }
            this.A = null;
            this.f308z = false;
            return;
        }
        if (this.A != null) {
            if (z11) {
                Q2(this, false, 1, null);
                return;
            }
            return;
        }
        d1 d1VarX = j0.b(f0VarY1).x(this.f306x, this.f307y);
        d1VarX.f(i0());
        d1VarX.g(W0());
        this.A = d1VarX;
        Q2(this, false, 1, null);
        f0VarY1.p1(true);
        this.f307y.invoke();
    }

    @Override // a2.f1
    public boolean O() {
        return (this.A == null || this.f294l || !Y1().G0()) ? false : true;
    }

    public abstract void P1();

    public final u0 Q1(u0 u0Var) {
        f0 f0VarY1 = u0Var.Y1();
        f0 f0VarY12 = Y1();
        if (f0VarY1 != f0VarY12) {
            while (f0VarY1.J() > f0VarY12.J()) {
                f0VarY1 = f0VarY1.k0();
                ae.r.c(f0VarY1);
            }
            while (f0VarY12.J() > f0VarY1.J()) {
                f0VarY12 = f0VarY12.k0();
                ae.r.c(f0VarY12);
            }
            while (f0VarY1 != f0VarY12) {
                f0VarY1 = f0VarY1.k0();
                f0VarY12 = f0VarY12.k0();
                if (f0VarY1 == null || f0VarY12 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            return f0VarY12 == Y1() ? this : f0VarY1 == u0Var.Y1() ? u0Var : f0VarY1.N();
        }
        e.c cVarD2 = u0Var.d2();
        e.c cVarD22 = d2();
        int iA = w0.a(2);
        if (!cVarD22.L0().H1()) {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        e.c cVarL0 = cVarD22.L0();
        while (true) {
            cVarL0 = cVarL0.E1();
            if (cVarL0 == null) {
                return this;
            }
            if ((cVarL0.C1() & iA) != 0 && cVarL0 == cVarD2) {
                return u0Var;
            }
        }
    }

    public long R1(long j10) {
        long jB = w2.o.b(j10, W0());
        d1 d1Var = this.A;
        return d1Var != null ? d1Var.e(jB, true) : jB;
    }

    protected final boolean R2(long j10) {
        if (!k1.g.b(j10)) {
            return false;
        }
        d1 d1Var = this.A;
        return d1Var == null || !this.f295m || d1Var.c(j10);
    }

    @Override // y1.r
    public final y1.r S() {
        if (!v()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        s2();
        return Y1().i0().f293k;
    }

    public a2.b T1() {
        return Y1().S().r();
    }

    @Override // y1.r
    public long U(long j10) {
        if (!v()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        s2();
        for (u0 u0Var = this; u0Var != null; u0Var = u0Var.f293k) {
            j10 = u0Var.L2(j10);
        }
        return j10;
    }

    public y1.r U1() {
        return this;
    }

    public final boolean V1() {
        return this.f308z;
    }

    @Override // a2.o0
    public long W0() {
        return this.f302t;
    }

    public final long W1() {
        return o0();
    }

    public final d1 X1() {
        return this.A;
    }

    public f0 Y1() {
        return this.f291i;
    }

    public abstract p0 Z1();

    @Override // y1.r
    public final long a() {
        return i0();
    }

    public final long a2() {
        return this.f297o.w(Y1().o0().d());
    }

    protected final k1.d b2() {
        k1.d dVar = this.f304v;
        if (dVar != null) {
            return dVar;
        }
        k1.d dVar2 = new k1.d(0.0f, 0.0f, 0.0f, 0.0f);
        this.f304v = dVar2;
        return dVar2;
    }

    public abstract e.c d2();

    public final u0 e2() {
        return this.f292j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // y1.h0, y1.m
    public Object f() {
        if (!Y1().h0().q(w0.a(64))) {
            return null;
        }
        d2();
        ae.h0 h0Var = new ae.h0();
        for (e.c cVarO = Y1().h0().o(); cVarO != null; cVarO = cVarO.E1()) {
            if ((w0.a(64) & cVarO.C1()) != 0) {
                int iA = w0.a(64);
                v0.d dVar = null;
                e.c cVarG = cVarO;
                while (cVarG != 0) {
                    if (cVarG instanceof h1) {
                        h0Var.f712a = ((h1) cVarG).r(Y1().I(), h0Var.f712a);
                    } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                        e.c cVarB2 = ((a2.l) cVarG).b2();
                        int i10 = 0;
                        cVarG = cVarG;
                        while (cVarB2 != null) {
                            if ((cVarB2.C1() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVarG = cVarB2;
                                } else {
                                    if (dVar == null) {
                                        dVar = new v0.d(new e.c[16], 0);
                                    }
                                    if (cVarG != 0) {
                                        dVar.b(cVarG);
                                        cVarG = 0;
                                    }
                                    dVar.b(cVarB2);
                                }
                            }
                            cVarB2 = cVarB2.y1();
                            cVarG = cVarG;
                        }
                        if (i10 == 1) {
                        }
                    }
                    cVarG = a2.k.g(dVar);
                }
            }
        }
        return h0Var.f712a;
    }

    public final u0 f2() {
        return this.f293k;
    }

    public final float g2() {
        return this.f303u;
    }

    @Override // w2.d
    public float getDensity() {
        return Y1().I().getDensity();
    }

    @Override // y1.n
    public w2.r getLayoutDirection() {
        return Y1().getLayoutDirection();
    }

    public final e.c i2(int i10) {
        boolean zI = x0.i(i10);
        e.c cVarD2 = d2();
        if (!zI && (cVarD2 = cVarD2.E1()) == null) {
            return null;
        }
        for (e.c cVarJ2 = j2(zI); cVarJ2 != null && (cVarJ2.x1() & i10) != 0; cVarJ2 = cVarJ2.y1()) {
            if ((cVarJ2.C1() & i10) != 0) {
                return cVarJ2;
            }
            if (cVarJ2 == cVarD2) {
                return null;
            }
        }
        return null;
    }

    @Override // a2.o0
    public void m1() {
        v0(W0(), this.f303u, this.f296n);
    }

    public final void m2(f fVar, long j10, t tVar, boolean z10, boolean z11) {
        float fL1;
        u0 u0Var;
        f fVar2;
        long j11;
        t tVar2;
        boolean z12;
        boolean z13;
        e.c cVarI2 = i2(fVar.a());
        if (R2(j10)) {
            if (cVarI2 == null) {
                n2(fVar, j10, tVar, z10, z11);
                return;
            }
            if (p2(j10)) {
                k2(cVarI2, fVar, j10, tVar, z10, z11);
                return;
            }
            fL1 = !z10 ? Float.POSITIVE_INFINITY : L1(j10, a2());
            if (!((Float.isInfinite(fL1) || Float.isNaN(fL1)) ? false : true) || !tVar.y(fL1, z11)) {
                J2(cVarI2, fVar, j10, tVar, z10, z11, fL1);
                return;
            }
            u0Var = this;
            fVar2 = fVar;
            j11 = j10;
            tVar2 = tVar;
            z12 = z10;
            z13 = z11;
        } else {
            if (!z10) {
                return;
            }
            fL1 = L1(j10, a2());
            if (!((Float.isInfinite(fL1) || Float.isNaN(fL1)) ? false : true) || !tVar.y(fL1, false)) {
                return;
            }
            z13 = false;
            u0Var = this;
            fVar2 = fVar;
            j11 = j10;
            tVar2 = tVar;
            z12 = z10;
        }
        u0Var.l2(cVarI2, fVar2, j11, tVar2, z12, z13, fL1);
    }

    public void n2(f fVar, long j10, t tVar, boolean z10, boolean z11) {
        u0 u0Var = this.f292j;
        if (u0Var != null) {
            u0Var.m2(fVar, u0Var.R1(j10), tVar, z10, z11);
        }
    }

    public void o2() {
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.invalidate();
            return;
        }
        u0 u0Var = this.f293k;
        if (u0Var != null) {
            u0Var.o2();
        }
    }

    @Override // y1.r
    public long p(long j10) {
        return j0.b(Y1()).g(U(j10));
    }

    protected final boolean p2(long j10) {
        float fO = k1.f.o(j10);
        float fP = k1.f.p(j10);
        return fO >= 0.0f && fP >= 0.0f && fO < ((float) k0()) && fP < ((float) g0());
    }

    public final boolean q2() {
        if (this.A != null && this.f299q <= 0.0f) {
            return true;
        }
        u0 u0Var = this.f293k;
        if (u0Var != null) {
            return u0Var.q2();
        }
        return false;
    }

    public final void s2() {
        Y1().S().P();
    }

    public void t2() {
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.invalidate();
        }
    }

    public final void u2() {
        N2(this.f296n, true);
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.invalidate();
        }
    }

    @Override // y1.r
    public boolean v() {
        return d2().H1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y1.t0
    public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        A2(j10, f10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    protected void v2(int i10, int i11) {
        d1 d1Var = this.A;
        if (d1Var != null) {
            d1Var.f(w2.q.a(i10, i11));
        } else {
            u0 u0Var = this.f293k;
            if (u0Var != null) {
                u0Var.o2();
            }
        }
        w0(w2.q.a(i10, i11));
        P2(false);
        int iA = w0.a(4);
        boolean zI = x0.i(iA);
        e.c cVarD2 = d2();
        if (zI || (cVarD2 = cVarD2.E1()) != null) {
            for (e.c cVarJ2 = j2(zI); cVarJ2 != null && (cVarJ2.x1() & iA) != 0; cVarJ2 = cVarJ2.y1()) {
                if ((cVarJ2.C1() & iA) != 0) {
                    e.c cVarG = cVarJ2;
                    v0.d dVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof q) {
                            ((q) cVarG).g0();
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                            e.c cVarB2 = ((a2.l) cVarG).b2();
                            int i12 = 0;
                            cVarG = cVarG;
                            while (cVarB2 != null) {
                                if ((cVarB2.C1() & iA) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        cVarG = cVarB2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new v0.d(new e.c[16], 0);
                                        }
                                        if (cVarG != 0) {
                                            dVar.b(cVarG);
                                            cVarG = 0;
                                        }
                                        dVar.b(cVarB2);
                                    }
                                }
                                cVarB2 = cVarB2.y1();
                                cVarG = cVarG;
                            }
                            if (i12 == 1) {
                            }
                        }
                        cVarG = a2.k.g(dVar);
                    }
                }
                if (cVarJ2 == cVarD2) {
                    break;
                }
            }
        }
        e1 e1VarJ0 = Y1().j0();
        if (e1VarJ0 != null) {
            e1VarJ0.e(Y1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void w2() {
        e.c cVarE1;
        if (h2(w0.a(128))) {
            d1.k kVarC = d1.k.f9368e.c();
            try {
                d1.k kVarL = kVarC.l();
                try {
                    int iA = w0.a(128);
                    boolean zI = x0.i(iA);
                    if (!zI) {
                        cVarE1 = d2().E1();
                        if (cVarE1 == null) {
                        }
                        md.i0 i0Var = md.i0.f15558a;
                    }
                    cVarE1 = d2();
                    for (e.c cVarJ2 = j2(zI); cVarJ2 != null && (cVarJ2.x1() & iA) != 0; cVarJ2 = cVarJ2.y1()) {
                        if ((cVarJ2.C1() & iA) != 0) {
                            e.c cVarG = cVarJ2;
                            v0.d dVar = null;
                            while (cVarG != 0) {
                                if (cVarG instanceof z) {
                                    ((z) cVarG).f(i0());
                                } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) cVarG).b2();
                                    int i10 = 0;
                                    cVarG = cVarG;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != 0) {
                                                    dVar.b(cVarG);
                                                    cVarG = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        cVarG = cVarG;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar);
                            }
                        }
                        if (cVarJ2 == cVarE1) {
                            break;
                        }
                    }
                    md.i0 i0Var2 = md.i0.f15558a;
                } finally {
                    kVarC.s(kVarL);
                }
            } finally {
                kVarC.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void x2() {
        int iA = w0.a(128);
        boolean zI = x0.i(iA);
        e.c cVarD2 = d2();
        if (!zI && (cVarD2 = cVarD2.E1()) == null) {
            return;
        }
        for (e.c cVarJ2 = j2(zI); cVarJ2 != null && (cVarJ2.x1() & iA) != 0; cVarJ2 = cVarJ2.y1()) {
            if ((cVarJ2.C1() & iA) != 0) {
                e.c cVarG = cVarJ2;
                v0.d dVar = null;
                while (cVarG != 0) {
                    if (cVarG instanceof z) {
                        ((z) cVarG).B(this);
                    } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                        e.c cVarB2 = ((a2.l) cVarG).b2();
                        int i10 = 0;
                        cVarG = cVarG;
                        while (cVarB2 != null) {
                            if ((cVarB2.C1() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVarG = cVarB2;
                                } else {
                                    if (dVar == null) {
                                        dVar = new v0.d(new e.c[16], 0);
                                    }
                                    if (cVarG != 0) {
                                        dVar.b(cVarG);
                                        cVarG = 0;
                                    }
                                    dVar.b(cVarB2);
                                }
                            }
                            cVarB2 = cVarB2.y1();
                            cVarG = cVarG;
                        }
                        if (i10 == 1) {
                        }
                    }
                    cVarG = a2.k.g(dVar);
                }
            }
            if (cVarJ2 == cVarD2) {
                return;
            }
        }
    }

    @Override // w2.l
    public float y0() {
        return Y1().I().y0();
    }

    public final void y2() {
        this.f294l = true;
        this.f307y.invoke();
        if (this.A != null) {
            O2(this, null, false, 2, null);
        }
    }

    public void z2(l1.b0 b0Var) {
        u0 u0Var = this.f292j;
        if (u0Var != null) {
            u0Var.M1(b0Var);
        }
    }
}
