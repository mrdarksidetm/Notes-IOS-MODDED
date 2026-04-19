package a2;

import a2.f0;
import com.google.android.gms.common.api.a;
import java.util.List;
import java.util.Map;
import w2.n;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f152b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f164n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f166p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0.e f153c = f0.e.Idle;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f165o = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f167q = w2.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zd.a<md.i0> f168r = new d();

    public final class a extends y1.t0 implements y1.d0, a2.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f169f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f173j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f174k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f175l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private w2.b f176m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f178o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private zd.l<? super androidx.compose.ui.graphics.d, md.i0> f179p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f180q;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f184u;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f187x;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f170g = a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f171h = a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f0.g f172i = f0.g.NotUsed;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f177n = w2.n.f22418b.a();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final a2.a f181r = new n0(this);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final v0.d<a> f182s = new v0.d<>(new a[16], 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f183t = true;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f185v = true;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Object f186w = Z0().f();

        /* JADX INFO: renamed from: a2.k0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0005a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f190b;

            static {
                int[] iArr = new int[f0.e.values().length];
                try {
                    iArr[f0.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f0.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f0.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f0.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f189a = iArr;
                int[] iArr2 = new int[f0.g.values().length];
                try {
                    iArr2[f0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f190b = iArr2;
            }
        }

        static final class b extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f192b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f193c;

            /* JADX INFO: renamed from: a2.k0$a$b$a, reason: collision with other inner class name */
            static final class C0006a extends ae.s implements zd.l<a2.b, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0006a f194a = new C0006a();

                C0006a() {
                    super(1);
                }

                public final void a(a2.b bVar) {
                    bVar.d().t(false);
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                    a(bVar);
                    return md.i0.f15558a;
                }
            }

            /* JADX INFO: renamed from: a2.k0$a$b$b, reason: collision with other inner class name */
            static final class C0007b extends ae.s implements zd.l<a2.b, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0007b f195a = new C0007b();

                C0007b() {
                    super(1);
                }

                public final void a(a2.b bVar) {
                    bVar.d().q(bVar.d().l());
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                    a(bVar);
                    return md.i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p0 p0Var, k0 k0Var) {
                super(0);
                this.f192b = p0Var;
                this.f193c = k0Var;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.this.L0();
                a.this.x(C0006a.f194a);
                p0 p0VarZ1 = a.this.r().Z1();
                if (p0VarZ1 != null) {
                    boolean zC1 = p0VarZ1.c1();
                    List<f0> listF = this.f193c.f151a.F();
                    int size = listF.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        p0 p0VarZ12 = listF.get(i10).i0().Z1();
                        if (p0VarZ12 != null) {
                            p0VarZ12.n1(zC1);
                        }
                    }
                }
                this.f192b.N0().a();
                p0 p0VarZ13 = a.this.r().Z1();
                if (p0VarZ13 != null) {
                    p0VarZ13.c1();
                    List<f0> listF2 = this.f193c.f151a.F();
                    int size2 = listF2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        p0 p0VarZ14 = listF2.get(i11).i0().Z1();
                        if (p0VarZ14 != null) {
                            p0VarZ14.n1(false);
                        }
                    }
                }
                a.this.I0();
                a.this.x(C0007b.f195a);
            }
        }

        static final class c extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f198c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k0 k0Var, e1 e1Var, long j10) {
                super(0);
                this.f196a = k0Var;
                this.f197b = e1Var;
                this.f198c = j10;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                u0 u0VarF2;
                o0 o0VarZ1;
                t0.a placementScope = null;
                if (!l0.a(this.f196a.f151a) ? !((u0VarF2 = this.f196a.H().f2()) == null || (o0VarZ1 = u0VarF2.Z1()) == null) : (o0VarZ1 = this.f196a.H().f2()) != null) {
                    placementScope = o0VarZ1.R0();
                }
                if (placementScope == null) {
                    placementScope = this.f197b.getPlacementScope();
                }
                k0 k0Var = this.f196a;
                long j10 = this.f198c;
                p0 p0VarZ1 = k0Var.H().Z1();
                ae.r.c(p0VarZ1);
                t0.a.h(placementScope, p0VarZ1, j10, 0.0f, 2, null);
            }
        }

        static final class d extends ae.s implements zd.l<a2.b, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f199a = new d();

            d() {
                super(1);
            }

            public final void a(a2.b bVar) {
                bVar.d().u(false);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                a(bVar);
                return md.i0.f15558a;
            }
        }

        public a() {
        }

        private final void G1(f0 f0Var) {
            f0.g gVar;
            f0 f0VarK0 = f0Var.k0();
            if (f0VarK0 != null) {
                if (!(this.f172i == f0.g.NotUsed || f0Var.C())) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i10 = C0005a.f189a[f0VarK0.U().ordinal()];
                if (i10 == 1 || i10 == 2) {
                    gVar = f0.g.InMeasureBlock;
                } else {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + f0VarK0.U());
                    }
                    gVar = f0.g.InLayoutBlock;
                }
            } else {
                gVar = f0.g.NotUsed;
            }
            this.f172i = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I0() {
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarS0.n();
                do {
                    a aVarE = f0VarArrN[i10].S().E();
                    ae.r.c(aVarE);
                    int i11 = aVarE.f170g;
                    int i12 = aVarE.f171h;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        aVarE.q1();
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L0() {
            int i10 = 0;
            k0.this.f160j = 0;
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                do {
                    a aVarE = f0VarArrN[i10].S().E();
                    ae.r.c(aVarE);
                    aVarE.f170g = aVarE.f171h;
                    aVarE.f171h = a.e.API_PRIORITY_OTHER;
                    if (aVarE.f172i == f0.g.InLayoutBlock) {
                        aVarE.f172i = f0.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void p1() {
            boolean zJ = j();
            F1(true);
            int i10 = 0;
            if (!zJ && k0.this.D()) {
                f0.g1(k0.this.f151a, true, false, 2, null);
            }
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                do {
                    f0 f0Var = f0VarArrN[i10];
                    if (f0Var.l0() != Integer.MAX_VALUE) {
                        a aVarX = f0Var.X();
                        ae.r.c(aVarX);
                        aVarX.p1();
                        f0Var.l1(f0Var);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void q1() {
            if (j()) {
                int i10 = 0;
                F1(false);
                v0.d<f0> dVarS0 = k0.this.f151a.s0();
                int iO = dVarS0.o();
                if (iO > 0) {
                    f0[] f0VarArrN = dVarS0.n();
                    do {
                        a aVarE = f0VarArrN[i10].S().E();
                        ae.r.c(aVarE);
                        aVarE.q1();
                        i10++;
                    } while (i10 < iO);
                }
            }
        }

        private final void w1() {
            f0 f0Var = k0.this.f151a;
            k0 k0Var = k0.this;
            v0.d<f0> dVarS0 = f0Var.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                int i10 = 0;
                do {
                    f0 f0Var2 = f0VarArrN[i10];
                    if (f0Var2.W() && f0Var2.e0() == f0.g.InMeasureBlock) {
                        a aVarE = f0Var2.S().E();
                        ae.r.c(aVarE);
                        w2.b bVarY = f0Var2.S().y();
                        ae.r.c(bVarY);
                        if (aVarE.A1(bVarY.t())) {
                            f0.g1(k0Var.f151a, false, false, 3, null);
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void x1() {
            f0.g1(k0.this.f151a, false, false, 3, null);
            f0 f0VarK0 = k0.this.f151a.k0();
            if (f0VarK0 == null || k0.this.f151a.R() != f0.g.NotUsed) {
                return;
            }
            f0 f0Var = k0.this.f151a;
            int i10 = C0005a.f189a[f0VarK0.U().ordinal()];
            f0Var.q1(i10 != 2 ? i10 != 3 ? f0VarK0.R() : f0.g.InLayoutBlock : f0.g.InMeasureBlock);
        }

        public final boolean A1(long j10) {
            if (!(!k0.this.f151a.H0())) {
                throw new IllegalArgumentException("measure is called on a deactivated node".toString());
            }
            f0 f0VarK0 = k0.this.f151a.k0();
            k0.this.f151a.o1(k0.this.f151a.C() || (f0VarK0 != null && f0VarK0.C()));
            if (!k0.this.f151a.W()) {
                w2.b bVar = this.f176m;
                if (bVar == null ? false : w2.b.g(bVar.t(), j10)) {
                    e1 e1VarJ0 = k0.this.f151a.j0();
                    if (e1VarJ0 != null) {
                        e1VarJ0.u(k0.this.f151a, true);
                    }
                    k0.this.f151a.n1();
                    return false;
                }
            }
            this.f176m = w2.b.b(j10);
            x0(j10);
            d().s(false);
            x(d.f199a);
            long jI0 = this.f175l ? i0() : w2.q.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f175l = true;
            p0 p0VarZ1 = k0.this.H().Z1();
            if (!(p0VarZ1 != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            k0.this.Q(j10);
            w0(w2.q.a(p0VarZ1.q0(), p0VarZ1.d0()));
            return (w2.p.g(jI0) == p0VarZ1.q0() && w2.p.f(jI0) == p0VarZ1.d0()) ? false : true;
        }

        @Override // y1.m
        public int B(int i10) {
            x1();
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.B(i10);
        }

        public final void B1() {
            f0 f0VarK0;
            try {
                this.f169f = true;
                if (!this.f174k) {
                    throw new IllegalStateException("replace() called on item that was not placed".toString());
                }
                this.f187x = false;
                boolean zJ = j();
                v0(this.f177n, 0.0f, null);
                if (zJ && !this.f187x && (f0VarK0 = k0.this.f151a.k0()) != null) {
                    f0.e1(f0VarK0, false, 1, null);
                }
            } finally {
                this.f169f = false;
            }
        }

        public final void C1(boolean z10) {
            this.f183t = z10;
        }

        public final void D1(f0.g gVar) {
            this.f172i = gVar;
        }

        @Override // y1.m
        public int E(int i10) {
            x1();
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.E(i10);
        }

        public final void E1(int i10) {
            this.f171h = i10;
        }

        public void F1(boolean z10) {
            this.f180q = z10;
        }

        public final boolean H1() {
            if (f() == null) {
                p0 p0VarZ1 = k0.this.H().Z1();
                ae.r.c(p0VarZ1);
                if (p0VarZ1.f() == null) {
                    return false;
                }
            }
            if (!this.f185v) {
                return false;
            }
            this.f185v = false;
            p0 p0VarZ12 = k0.this.H().Z1();
            ae.r.c(p0VarZ12);
            this.f186w = p0VarZ12.f();
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        @Override // y1.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public y1.t0 I(long r4) {
            /*
                r3 = this;
                a2.k0 r0 = a2.k0.this
                a2.f0 r0 = a2.k0.a(r0)
                a2.f0 r0 = r0.k0()
                r1 = 0
                if (r0 == 0) goto L12
                a2.f0$e r0 = r0.U()
                goto L13
            L12:
                r0 = r1
            L13:
                a2.f0$e r2 = a2.f0.e.LookaheadMeasuring
                if (r0 == r2) goto L2b
                a2.k0 r0 = a2.k0.this
                a2.f0 r0 = a2.k0.a(r0)
                a2.f0 r0 = r0.k0()
                if (r0 == 0) goto L27
                a2.f0$e r1 = r0.U()
            L27:
                a2.f0$e r0 = a2.f0.e.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                a2.k0 r0 = a2.k0.this
                r1 = 0
                a2.k0.i(r0, r1)
            L31:
                a2.k0 r0 = a2.k0.this
                a2.f0 r0 = a2.k0.a(r0)
                r3.G1(r0)
                a2.k0 r0 = a2.k0.this
                a2.f0 r0 = a2.k0.a(r0)
                a2.f0$g r0 = r0.R()
                a2.f0$g r1 = a2.f0.g.NotUsed
                if (r0 != r1) goto L51
                a2.k0 r0 = a2.k0.this
                a2.f0 r0 = a2.k0.a(r0)
                r0.u()
            L51:
                r3.A1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.k0.a.I(long):y1.t0");
        }

        public final List<a> N0() {
            k0.this.f151a.F();
            if (this.f183t) {
                f0 f0Var = k0.this.f151a;
                v0.d<a> dVar = this.f182s;
                v0.d<f0> dVarS0 = f0Var.s0();
                int iO = dVarS0.o();
                if (iO > 0) {
                    f0[] f0VarArrN = dVarS0.n();
                    int i10 = 0;
                    do {
                        f0 f0Var2 = f0VarArrN[i10];
                        int iO2 = dVar.o();
                        a aVarE = f0Var2.S().E();
                        ae.r.c(aVarE);
                        if (iO2 <= i10) {
                            dVar.b(aVarE);
                        } else {
                            dVar.A(i10, aVarE);
                        }
                        i10++;
                    } while (i10 < iO);
                }
                dVar.y(f0Var.F().size(), dVar.o());
                this.f183t = false;
            }
            return this.f182s.h();
        }

        public final w2.b R0() {
            return this.f176m;
        }

        @Override // a2.b
        public void T() {
            this.f184u = true;
            d().o();
            if (k0.this.C()) {
                w1();
            }
            p0 p0VarZ1 = r().Z1();
            ae.r.c(p0VarZ1);
            if (k0.this.f159i || (!this.f173j && !p0VarZ1.c1() && k0.this.C())) {
                k0.this.f158h = false;
                f0.e eVarA = k0.this.A();
                k0.this.f153c = f0.e.LookaheadLayingOut;
                e1 e1VarB = j0.b(k0.this.f151a);
                k0.this.V(false);
                g1.f(e1VarB.getSnapshotObserver(), k0.this.f151a, false, new b(p0VarZ1, k0.this), 2, null);
                k0.this.f153c = eVarA;
                if (k0.this.u() && p0VarZ1.c1()) {
                    requestLayout();
                }
                k0.this.f159i = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.f184u = false;
        }

        @Override // a2.b
        public void V() {
            f0.g1(k0.this.f151a, false, false, 3, null);
        }

        @Override // y1.m
        public int W(int i10) {
            x1();
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.W(i10);
        }

        public final boolean W0() {
            return this.f184u;
        }

        public final b Z0() {
            return k0.this.F();
        }

        public final f0.g c1() {
            return this.f172i;
        }

        @Override // a2.b
        public a2.a d() {
            return this.f181r;
        }

        @Override // y1.h0, y1.m
        public Object f() {
            return this.f186w;
        }

        @Override // y1.t0
        public int g0() {
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.g0();
        }

        public final boolean i1() {
            return this.f174k;
        }

        @Override // a2.b
        public boolean j() {
            return this.f180q;
        }

        @Override // y1.m
        public int k(int i10) {
            x1();
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.k(i10);
        }

        @Override // y1.t0
        public int k0() {
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            return p0VarZ1.k0();
        }

        @Override // a2.b
        public Map<y1.a, Integer> l() {
            if (!this.f173j) {
                if (k0.this.A() == f0.e.LookaheadMeasuring) {
                    d().s(true);
                    if (d().g()) {
                        k0.this.M();
                    }
                } else {
                    d().r(true);
                }
            }
            p0 p0VarZ1 = r().Z1();
            if (p0VarZ1 != null) {
                p0VarZ1.n1(true);
            }
            T();
            p0 p0VarZ12 = r().Z1();
            if (p0VarZ12 != null) {
                p0VarZ12.n1(false);
            }
            return d().h();
        }

        public final void m1(boolean z10) {
            f0 f0VarK0;
            f0 f0VarK02 = k0.this.f151a.k0();
            f0.g gVarR = k0.this.f151a.R();
            if (f0VarK02 == null || gVarR == f0.g.NotUsed) {
                return;
            }
            while (f0VarK02.R() == gVarR && (f0VarK0 = f0VarK02.k0()) != null) {
                f0VarK02 = f0VarK0;
            }
            int i10 = C0005a.f190b[gVarR.ordinal()];
            if (i10 == 1) {
                if (f0VarK02.Y() != null) {
                    f0.g1(f0VarK02, z10, false, 2, null);
                    return;
                } else {
                    f0.k1(f0VarK02, z10, false, 2, null);
                    return;
                }
            }
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (f0VarK02.Y() != null) {
                f0VarK02.d1(z10);
            } else {
                f0VarK02.h1(z10);
            }
        }

        public final void n1() {
            this.f185v = true;
        }

        @Override // a2.b
        public u0 r() {
            return k0.this.f151a.N();
        }

        @Override // a2.b
        public void requestLayout() {
            f0.e1(k0.this.f151a, false, 1, null);
        }

        @Override // a2.b
        public a2.b s() {
            k0 k0VarS;
            f0 f0VarK0 = k0.this.f151a.k0();
            if (f0VarK0 == null || (k0VarS = f0VarK0.S()) == null) {
                return null;
            }
            return k0VarS.B();
        }

        public final void t1() {
            v0.d<f0> dVarS0;
            int iO;
            if (k0.this.s() <= 0 || (iO = (dVarS0 = k0.this.f151a.s0()).o()) <= 0) {
                return;
            }
            f0[] f0VarArrN = dVarS0.n();
            int i10 = 0;
            do {
                f0 f0Var = f0VarArrN[i10];
                k0 k0VarS = f0Var.S();
                if ((k0VarS.u() || k0VarS.t()) && !k0VarS.z()) {
                    f0.e1(f0Var, false, 1, null);
                }
                a aVarE = k0VarS.E();
                if (aVarE != null) {
                    aVarE.t1();
                }
                i10++;
            } while (i10 < iO);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.t0
        public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            if (!(!k0.this.f151a.H0())) {
                throw new IllegalArgumentException("place is called on a deactivated node".toString());
            }
            k0.this.f153c = f0.e.LookaheadLayingOut;
            this.f174k = true;
            this.f187x = false;
            if (!w2.n.i(j10, this.f177n)) {
                if (k0.this.t() || k0.this.u()) {
                    k0.this.f158h = true;
                }
                t1();
            }
            e1 e1VarB = j0.b(k0.this.f151a);
            if (k0.this.C() || !j()) {
                k0.this.U(false);
                d().r(false);
                g1.d(e1VarB.getSnapshotObserver(), k0.this.f151a, false, new c(k0.this, e1VarB, j10), 2, null);
            } else {
                p0 p0VarZ1 = k0.this.H().Z1();
                ae.r.c(p0VarZ1);
                p0VarZ1.F1(j10);
                z1();
            }
            this.f177n = j10;
            this.f178o = f10;
            this.f179p = lVar;
            k0.this.f153c = f0.e.Idle;
        }

        @Override // a2.b
        public void x(zd.l<? super a2.b, md.i0> lVar) {
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarS0.n();
                do {
                    a2.b bVarB = f0VarArrN[i10].S().B();
                    ae.r.c(bVarB);
                    lVar.invoke(bVarB);
                    i10++;
                } while (i10 < iO);
            }
        }

        public final void y1() {
            this.f171h = a.e.API_PRIORITY_OTHER;
            this.f170g = a.e.API_PRIORITY_OTHER;
            F1(false);
        }

        public final void z1() {
            this.f187x = true;
            f0 f0VarK0 = k0.this.f151a.k0();
            if (!j()) {
                p1();
                if (this.f169f && f0VarK0 != null) {
                    f0.e1(f0VarK0, false, 1, null);
                }
            }
            if (f0VarK0 == null) {
                this.f171h = 0;
            } else if (!this.f169f && (f0VarK0.U() == f0.e.LayingOut || f0VarK0.U() == f0.e.LookaheadLayingOut)) {
                if (!(this.f171h == Integer.MAX_VALUE)) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.f171h = f0VarK0.S().f160j;
                f0VarK0.S().f160j++;
            }
            T();
        }
    }

    public final class b extends y1.t0 implements y1.d0, a2.b {
        private zd.l<? super androidx.compose.ui.graphics.d, md.i0> A;
        private long B;
        private float C;
        private final zd.a<md.i0> D;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f200f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f203i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f204j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f206l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f207m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private zd.l<? super androidx.compose.ui.graphics.d, md.i0> f208n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f209o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f210p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object f211q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f212r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f213s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final a2.a f214t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final v0.d<b> f215u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f216v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f217w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final zd.a<md.i0> f218x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f219y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f220z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f201g = a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f202h = a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f0.g f205k = f0.g.NotUsed;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f222b;

            static {
                int[] iArr = new int[f0.e.values().length];
                try {
                    iArr[f0.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f0.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f221a = iArr;
                int[] iArr2 = new int[f0.g.values().length];
                try {
                    iArr2[f0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[f0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f222b = iArr2;
            }
        }

        /* JADX INFO: renamed from: a2.k0$b$b, reason: collision with other inner class name */
        static final class C0008b extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: a2.k0$b$b$a */
            static final class a extends ae.s implements zd.l<a2.b, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f224a = new a();

                a() {
                    super(1);
                }

                public final void a(a2.b bVar) {
                    bVar.d().t(false);
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                    a(bVar);
                    return md.i0.f15558a;
                }
            }

            /* JADX INFO: renamed from: a2.k0$b$b$b, reason: collision with other inner class name */
            static final class C0009b extends ae.s implements zd.l<a2.b, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0009b f225a = new C0009b();

                C0009b() {
                    super(1);
                }

                public final void a(a2.b bVar) {
                    bVar.d().q(bVar.d().l());
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                    a(bVar);
                    return md.i0.f15558a;
                }
            }

            C0008b() {
                super(0);
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.this.W0();
                b.this.x(a.f224a);
                b.this.r().N0().a();
                b.this.R0();
                b.this.x(C0009b.f225a);
            }
        }

        static final class c extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f227b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k0 k0Var, b bVar) {
                super(0);
                this.f226a = k0Var;
                this.f227b = bVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t0.a placementScope;
                u0 u0VarF2 = this.f226a.H().f2();
                if (u0VarF2 == null || (placementScope = u0VarF2.R0()) == null) {
                    placementScope = j0.b(this.f226a.f151a).getPlacementScope();
                }
                t0.a aVar = placementScope;
                b bVar = this.f227b;
                k0 k0Var = this.f226a;
                zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar = bVar.A;
                u0 u0VarH = k0Var.H();
                long j10 = bVar.B;
                if (lVar == null) {
                    aVar.g(u0VarH, j10, bVar.C);
                } else {
                    aVar.s(u0VarH, j10, bVar.C, lVar);
                }
            }
        }

        static final class d extends ae.s implements zd.l<a2.b, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f228a = new d();

            d() {
                super(1);
            }

            public final void a(a2.b bVar) {
                bVar.d().u(false);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(a2.b bVar) {
                a(bVar);
                return md.i0.f15558a;
            }
        }

        public b() {
            n.a aVar = w2.n.f22418b;
            this.f207m = aVar.a();
            this.f210p = true;
            this.f214t = new g0(this);
            this.f215u = new v0.d<>(new b[16], 0);
            this.f216v = true;
            this.f218x = new C0008b();
            this.B = aVar.a();
            this.D = new c(k0.this, this);
        }

        private final void B1() {
            f0 f0Var = k0.this.f151a;
            k0 k0Var = k0.this;
            v0.d<f0> dVarS0 = f0Var.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                int i10 = 0;
                do {
                    f0 f0Var2 = f0VarArrN[i10];
                    if (f0Var2.b0() && f0Var2.d0() == f0.g.InMeasureBlock && f0.Z0(f0Var2, null, 1, null)) {
                        f0.k1(k0Var.f151a, false, false, 3, null);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void C1() {
            f0.k1(k0.this.f151a, false, false, 3, null);
            f0 f0VarK0 = k0.this.f151a.k0();
            if (f0VarK0 == null || k0.this.f151a.R() != f0.g.NotUsed) {
                return;
            }
            f0 f0Var = k0.this.f151a;
            int i10 = a.f221a[f0VarK0.U().ordinal()];
            f0Var.q1(i10 != 1 ? i10 != 2 ? f0VarK0.R() : f0.g.InLayoutBlock : f0.g.InMeasureBlock);
        }

        private final void F1(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            if (!(!k0.this.f151a.H0())) {
                throw new IllegalArgumentException("place is called on a deactivated node".toString());
            }
            k0.this.f153c = f0.e.LayingOut;
            this.f207m = j10;
            this.f209o = f10;
            this.f208n = lVar;
            this.f204j = true;
            this.f220z = false;
            e1 e1VarB = j0.b(k0.this.f151a);
            if (k0.this.z() || !j()) {
                d().r(false);
                k0.this.U(false);
                this.A = lVar;
                this.B = j10;
                this.C = f10;
                e1VarB.getSnapshotObserver().c(k0.this.f151a, false, this.D);
                this.A = null;
            } else {
                k0.this.H().B2(j10, f10, lVar);
                E1();
            }
            k0.this.f153c = f0.e.Idle;
        }

        private final void L1(f0 f0Var) {
            f0.g gVar;
            f0 f0VarK0 = f0Var.k0();
            if (f0VarK0 != null) {
                if (!(this.f205k == f0.g.NotUsed || f0Var.C())) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i10 = a.f221a[f0VarK0.U().ordinal()];
                if (i10 == 1) {
                    gVar = f0.g.InMeasureBlock;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + f0VarK0.U());
                    }
                    gVar = f0.g.InLayoutBlock;
                }
            } else {
                gVar = f0.g.NotUsed;
            }
            this.f205k = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R0() {
            f0 f0Var = k0.this.f151a;
            v0.d<f0> dVarS0 = f0Var.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarS0.n();
                do {
                    f0 f0Var2 = f0VarArrN[i10];
                    if (f0Var2.a0().f201g != f0Var2.l0()) {
                        f0Var.V0();
                        f0Var.A0();
                        if (f0Var2.l0() == Integer.MAX_VALUE) {
                            f0Var2.a0().z1();
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W0() {
            k0.this.f161k = 0;
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                int i10 = 0;
                do {
                    b bVarA0 = f0VarArrN[i10].a0();
                    bVarA0.f201g = bVarA0.f202h;
                    bVarA0.f202h = a.e.API_PRIORITY_OTHER;
                    bVarA0.f213s = false;
                    if (bVarA0.f205k == f0.g.InLayoutBlock) {
                        bVarA0.f205k = f0.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void y1() {
            boolean zJ = j();
            K1(true);
            f0 f0Var = k0.this.f151a;
            int i10 = 0;
            if (!zJ) {
                if (f0Var.b0()) {
                    f0.k1(f0Var, true, false, 2, null);
                } else if (f0Var.W()) {
                    f0.g1(f0Var, true, false, 2, null);
                }
            }
            u0 u0VarE2 = f0Var.N().e2();
            for (u0 u0VarI0 = f0Var.i0(); !ae.r.b(u0VarI0, u0VarE2) && u0VarI0 != null; u0VarI0 = u0VarI0.e2()) {
                if (u0VarI0.V1()) {
                    u0VarI0.o2();
                }
            }
            v0.d<f0> dVarS0 = f0Var.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarS0.n();
                do {
                    f0 f0Var2 = f0VarArrN[i10];
                    if (f0Var2.l0() != Integer.MAX_VALUE) {
                        f0Var2.a0().y1();
                        f0Var.l1(f0Var2);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void z1() {
            if (j()) {
                int i10 = 0;
                K1(false);
                v0.d<f0> dVarS0 = k0.this.f151a.s0();
                int iO = dVarS0.o();
                if (iO > 0) {
                    f0[] f0VarArrN = dVarS0.n();
                    do {
                        f0VarArrN[i10].a0().z1();
                        i10++;
                    } while (i10 < iO);
                }
            }
        }

        public final void A1() {
            v0.d<f0> dVarS0;
            int iO;
            if (k0.this.s() <= 0 || (iO = (dVarS0 = k0.this.f151a.s0()).o()) <= 0) {
                return;
            }
            f0[] f0VarArrN = dVarS0.n();
            int i10 = 0;
            do {
                f0 f0Var = f0VarArrN[i10];
                k0 k0VarS = f0Var.S();
                if ((k0VarS.u() || k0VarS.t()) && !k0VarS.z()) {
                    f0.i1(f0Var, false, 1, null);
                }
                k0VarS.F().A1();
                i10++;
            } while (i10 < iO);
        }

        @Override // y1.m
        public int B(int i10) {
            C1();
            return k0.this.H().B(i10);
        }

        public final void D1() {
            this.f202h = a.e.API_PRIORITY_OTHER;
            this.f201g = a.e.API_PRIORITY_OTHER;
            K1(false);
        }

        @Override // y1.m
        public int E(int i10) {
            C1();
            return k0.this.H().E(i10);
        }

        public final void E1() {
            this.f220z = true;
            f0 f0VarK0 = k0.this.f151a.k0();
            float fG2 = r().g2();
            f0 f0Var = k0.this.f151a;
            u0 u0VarI0 = f0Var.i0();
            u0 u0VarN = f0Var.N();
            while (u0VarI0 != u0VarN) {
                ae.r.d(u0VarI0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                b0 b0Var = (b0) u0VarI0;
                fG2 += b0Var.g2();
                u0VarI0 = b0Var.e2();
            }
            if (!(fG2 == this.f219y)) {
                this.f219y = fG2;
                if (f0VarK0 != null) {
                    f0VarK0.V0();
                }
                if (f0VarK0 != null) {
                    f0VarK0.A0();
                }
            }
            if (!j()) {
                if (f0VarK0 != null) {
                    f0VarK0.A0();
                }
                y1();
                if (this.f200f && f0VarK0 != null) {
                    f0.i1(f0VarK0, false, 1, null);
                }
            }
            if (f0VarK0 == null) {
                this.f202h = 0;
            } else if (!this.f200f && f0VarK0.U() == f0.e.LayingOut) {
                if (!(this.f202h == Integer.MAX_VALUE)) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.f202h = f0VarK0.S().f161k;
                f0VarK0.S().f161k++;
            }
            T();
        }

        public final boolean G1(long j10) {
            boolean z10 = true;
            if (!(!k0.this.f151a.H0())) {
                throw new IllegalArgumentException("measure is called on a deactivated node".toString());
            }
            e1 e1VarB = j0.b(k0.this.f151a);
            f0 f0VarK0 = k0.this.f151a.k0();
            k0.this.f151a.o1(k0.this.f151a.C() || (f0VarK0 != null && f0VarK0.C()));
            if (!k0.this.f151a.b0() && w2.b.g(o0(), j10)) {
                e1.i(e1VarB, k0.this.f151a, false, 2, null);
                k0.this.f151a.n1();
                return false;
            }
            d().s(false);
            x(d.f228a);
            this.f203i = true;
            long jA = k0.this.H().a();
            x0(j10);
            k0.this.R(j10);
            if (w2.p.e(k0.this.H().a(), jA) && k0.this.H().q0() == q0() && k0.this.H().d0() == d0()) {
                z10 = false;
            }
            w0(w2.q.a(k0.this.H().q0(), k0.this.H().d0()));
            return z10;
        }

        public final void H1() {
            f0 f0VarK0;
            try {
                this.f200f = true;
                if (!this.f204j) {
                    throw new IllegalStateException("replace called on unplaced item".toString());
                }
                boolean zJ = j();
                F1(this.f207m, this.f209o, this.f208n);
                if (zJ && !this.f220z && (f0VarK0 = k0.this.f151a.k0()) != null) {
                    f0.i1(f0VarK0, false, 1, null);
                }
            } finally {
                this.f200f = false;
            }
        }

        @Override // y1.d0
        public y1.t0 I(long j10) {
            f0.g gVarR = k0.this.f151a.R();
            f0.g gVar = f0.g.NotUsed;
            if (gVarR == gVar) {
                k0.this.f151a.u();
            }
            if (l0.a(k0.this.f151a)) {
                a aVarE = k0.this.E();
                ae.r.c(aVarE);
                aVarE.D1(gVar);
                aVarE.I(j10);
            }
            L1(k0.this.f151a);
            G1(j10);
            return this;
        }

        public final void I1(boolean z10) {
            this.f216v = z10;
        }

        public final void J1(f0.g gVar) {
            this.f205k = gVar;
        }

        public void K1(boolean z10) {
            this.f212r = z10;
        }

        public final boolean M1() {
            if ((f() == null && k0.this.H().f() == null) || !this.f210p) {
                return false;
            }
            this.f210p = false;
            this.f211q = k0.this.H().f();
            return true;
        }

        @Override // a2.b
        public void T() {
            this.f217w = true;
            d().o();
            if (k0.this.z()) {
                B1();
            }
            if (k0.this.f156f || (!this.f206l && !r().c1() && k0.this.z())) {
                k0.this.f155e = false;
                f0.e eVarA = k0.this.A();
                k0.this.f153c = f0.e.LayingOut;
                k0.this.V(false);
                f0 f0Var = k0.this.f151a;
                j0.b(f0Var).getSnapshotObserver().e(f0Var, false, this.f218x);
                k0.this.f153c = eVarA;
                if (r().c1() && k0.this.u()) {
                    requestLayout();
                }
                k0.this.f156f = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.f217w = false;
        }

        @Override // a2.b
        public void V() {
            f0.k1(k0.this.f151a, false, false, 3, null);
        }

        @Override // y1.m
        public int W(int i10) {
            C1();
            return k0.this.H().W(i10);
        }

        public final List<b> Z0() {
            k0.this.f151a.v1();
            if (this.f216v) {
                f0 f0Var = k0.this.f151a;
                v0.d<b> dVar = this.f215u;
                v0.d<f0> dVarS0 = f0Var.s0();
                int iO = dVarS0.o();
                if (iO > 0) {
                    f0[] f0VarArrN = dVarS0.n();
                    int i10 = 0;
                    do {
                        f0 f0Var2 = f0VarArrN[i10];
                        int iO2 = dVar.o();
                        b bVarF = f0Var2.S().F();
                        if (iO2 <= i10) {
                            dVar.b(bVarF);
                        } else {
                            dVar.A(i10, bVarF);
                        }
                        i10++;
                    } while (i10 < iO);
                }
                dVar.y(f0Var.F().size(), dVar.o());
                this.f216v = false;
            }
            return this.f215u.h();
        }

        public final w2.b c1() {
            if (this.f203i) {
                return w2.b.b(o0());
            }
            return null;
        }

        @Override // a2.b
        public a2.a d() {
            return this.f214t;
        }

        @Override // y1.h0, y1.m
        public Object f() {
            return this.f211q;
        }

        @Override // y1.t0
        public int g0() {
            return k0.this.H().g0();
        }

        public final boolean i1() {
            return this.f217w;
        }

        @Override // a2.b
        public boolean j() {
            return this.f212r;
        }

        @Override // y1.m
        public int k(int i10) {
            C1();
            return k0.this.H().k(i10);
        }

        @Override // y1.t0
        public int k0() {
            return k0.this.H().k0();
        }

        @Override // a2.b
        public Map<y1.a, Integer> l() {
            if (!this.f206l) {
                if (k0.this.A() == f0.e.Measuring) {
                    d().s(true);
                    if (d().g()) {
                        k0.this.L();
                    }
                } else {
                    d().r(true);
                }
            }
            r().n1(true);
            T();
            r().n1(false);
            return d().h();
        }

        public final f0.g m1() {
            return this.f205k;
        }

        public final int n1() {
            return this.f202h;
        }

        public final float p1() {
            return this.f219y;
        }

        public final void q1(boolean z10) {
            f0 f0VarK0;
            f0 f0VarK02 = k0.this.f151a.k0();
            f0.g gVarR = k0.this.f151a.R();
            if (f0VarK02 == null || gVarR == f0.g.NotUsed) {
                return;
            }
            while (f0VarK02.R() == gVarR && (f0VarK0 = f0VarK02.k0()) != null) {
                f0VarK02 = f0VarK0;
            }
            int i10 = a.f222b[gVarR.ordinal()];
            if (i10 == 1) {
                f0.k1(f0VarK02, z10, false, 2, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                f0VarK02.h1(z10);
            }
        }

        @Override // a2.b
        public u0 r() {
            return k0.this.f151a.N();
        }

        @Override // a2.b
        public void requestLayout() {
            f0.i1(k0.this.f151a, false, 1, null);
        }

        @Override // a2.b
        public a2.b s() {
            k0 k0VarS;
            f0 f0VarK0 = k0.this.f151a.k0();
            if (f0VarK0 == null || (k0VarS = f0VarK0.S()) == null) {
                return null;
            }
            return k0VarS.r();
        }

        public final void t1() {
            this.f210p = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.t0
        public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            t0.a placementScope;
            this.f213s = true;
            if (!w2.n.i(j10, this.f207m)) {
                if (k0.this.t() || k0.this.u()) {
                    k0.this.f155e = true;
                }
                A1();
            }
            boolean z10 = false;
            if (l0.a(k0.this.f151a)) {
                u0 u0VarF2 = k0.this.H().f2();
                if (u0VarF2 == null || (placementScope = u0VarF2.R0()) == null) {
                    placementScope = j0.b(k0.this.f151a).getPlacementScope();
                }
                t0.a aVar = placementScope;
                k0 k0Var = k0.this;
                a aVarE = k0Var.E();
                ae.r.c(aVarE);
                f0 f0VarK0 = k0Var.f151a.k0();
                if (f0VarK0 != null) {
                    f0VarK0.S().f160j = 0;
                }
                aVarE.E1(a.e.API_PRIORITY_OTHER);
                t0.a.f(aVar, aVarE, w2.n.j(j10), w2.n.k(j10), 0.0f, 4, null);
            }
            a aVarE2 = k0.this.E();
            if (aVarE2 != null && !aVarE2.i1()) {
                z10 = true;
            }
            if (!(true ^ z10)) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
            }
            F1(j10, f10, lVar);
        }

        public final boolean w1() {
            return this.f213s;
        }

        @Override // a2.b
        public void x(zd.l<? super a2.b, md.i0> lVar) {
            v0.d<f0> dVarS0 = k0.this.f151a.s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarS0.n();
                do {
                    lVar.invoke(f0VarArrN[i10].S().r());
                    i10++;
                } while (i10 < iO);
            }
        }

        public final void x1() {
            k0.this.f152b = true;
        }
    }

    static final class c extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10) {
            super(0);
            this.f230b = j10;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            p0 p0VarZ1 = k0.this.H().Z1();
            ae.r.c(p0VarZ1);
            p0VarZ1.I(this.f230b);
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
            k0.this.H().I(k0.this.f167q);
        }
    }

    public k0(f0 f0Var) {
        this.f151a = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(long j10) {
        this.f153c = f0.e.LookaheadMeasuring;
        this.f157g = false;
        g1.h(j0.b(this.f151a).getSnapshotObserver(), this.f151a, false, new c(j10), 2, null);
        M();
        if (l0.a(this.f151a)) {
            L();
        } else {
            O();
        }
        this.f153c = f0.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(long j10) {
        f0.e eVar = this.f153c;
        f0.e eVar2 = f0.e.Idle;
        if (!(eVar == eVar2)) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        f0.e eVar3 = f0.e.Measuring;
        this.f153c = eVar3;
        this.f154d = false;
        this.f167q = j10;
        j0.b(this.f151a).getSnapshotObserver().g(this.f151a, false, this.f168r);
        if (this.f153c == eVar3) {
            L();
            this.f153c = eVar2;
        }
    }

    public final f0.e A() {
        return this.f153c;
    }

    public final a2.b B() {
        return this.f166p;
    }

    public final boolean C() {
        return this.f158h;
    }

    public final boolean D() {
        return this.f157g;
    }

    public final a E() {
        return this.f166p;
    }

    public final b F() {
        return this.f165o;
    }

    public final boolean G() {
        return this.f154d;
    }

    public final u0 H() {
        return this.f151a.h0().n();
    }

    public final int I() {
        return this.f165o.q0();
    }

    public final void J() {
        this.f165o.t1();
        a aVar = this.f166p;
        if (aVar != null) {
            aVar.n1();
        }
    }

    public final void K() {
        this.f165o.I1(true);
        a aVar = this.f166p;
        if (aVar != null) {
            aVar.C1(true);
        }
    }

    public final void L() {
        this.f155e = true;
        this.f156f = true;
    }

    public final void M() {
        this.f158h = true;
        this.f159i = true;
    }

    public final void N() {
        this.f157g = true;
    }

    public final void O() {
        this.f154d = true;
    }

    public final void P() {
        f0.e eVarU = this.f151a.U();
        if (eVarU == f0.e.LayingOut || eVarU == f0.e.LookaheadLayingOut) {
            if (this.f165o.i1()) {
                V(true);
            } else {
                U(true);
            }
        }
        if (eVarU == f0.e.LookaheadLayingOut) {
            a aVar = this.f166p;
            boolean z10 = false;
            if (aVar != null && aVar.W0()) {
                z10 = true;
            }
            if (z10) {
                V(true);
            } else {
                U(true);
            }
        }
    }

    public final void S() {
        a2.a aVarD;
        this.f165o.d().p();
        a aVar = this.f166p;
        if (aVar == null || (aVarD = aVar.d()) == null) {
            return;
        }
        aVarD.p();
    }

    public final void T(int i10) {
        int i11 = this.f164n;
        this.f164n = i10;
        if ((i11 == 0) != (i10 == 0)) {
            f0 f0VarK0 = this.f151a.k0();
            k0 k0VarS = f0VarK0 != null ? f0VarK0.S() : null;
            if (k0VarS != null) {
                k0VarS.T(i10 == 0 ? k0VarS.f164n - 1 : k0VarS.f164n + 1);
            }
        }
    }

    public final void U(boolean z10) {
        int i10;
        if (this.f163m != z10) {
            this.f163m = z10;
            if (z10 && !this.f162l) {
                i10 = this.f164n + 1;
            } else if (z10 || this.f162l) {
                return;
            } else {
                i10 = this.f164n - 1;
            }
            T(i10);
        }
    }

    public final void V(boolean z10) {
        int i10;
        if (this.f162l != z10) {
            this.f162l = z10;
            if (z10 && !this.f163m) {
                i10 = this.f164n + 1;
            } else if (z10 || this.f163m) {
                return;
            } else {
                i10 = this.f164n - 1;
            }
            T(i10);
        }
    }

    public final void W() {
        f0 f0VarK0;
        if (this.f165o.M1() && (f0VarK0 = this.f151a.k0()) != null) {
            f0.k1(f0VarK0, false, false, 3, null);
        }
        a aVar = this.f166p;
        if (aVar != null && aVar.H1()) {
            if (l0.a(this.f151a)) {
                f0 f0VarK02 = this.f151a.k0();
                if (f0VarK02 != null) {
                    f0.k1(f0VarK02, false, false, 3, null);
                    return;
                }
                return;
            }
            f0 f0VarK03 = this.f151a.k0();
            if (f0VarK03 != null) {
                f0.g1(f0VarK03, false, false, 3, null);
            }
        }
    }

    public final void q() {
        if (this.f166p == null) {
            this.f166p = new a();
        }
    }

    public final a2.b r() {
        return this.f165o;
    }

    public final int s() {
        return this.f164n;
    }

    public final boolean t() {
        return this.f163m;
    }

    public final boolean u() {
        return this.f162l;
    }

    public final boolean v() {
        return this.f152b;
    }

    public final int w() {
        return this.f165o.d0();
    }

    public final w2.b x() {
        return this.f165o.c1();
    }

    public final w2.b y() {
        a aVar = this.f166p;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public final boolean z() {
        return this.f155e;
    }
}
