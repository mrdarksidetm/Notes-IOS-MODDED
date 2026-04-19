package a2;

import a2.e1;
import a2.k0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import b2.x1;
import java.util.Comparator;
import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements t0.j, y1.v0, f1, y1.t, a2.g, e1.b {
    public static final d Y = new d(null);
    public static final int Z = 8;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final f f67a0 = new c();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final zd.a<f0> f68b0 = a.f97a;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final x1 f69c0 = new b();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Comparator<f0> f70d0 = new Comparator() { // from class: a2.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f0.p((f0) obj, (f0) obj2);
        }
    };
    private final androidx.compose.ui.node.a A;
    private final k0 B;
    private y1.x C;
    private u0 D;
    private boolean E;
    private androidx.compose.ui.e F;
    private zd.l<? super e1, md.i0> G;
    private zd.l<? super e1, md.i0> H;
    private boolean I;
    private boolean X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f71a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f74d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f75e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f76f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s0<f0> f77g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0.d<f0> f78h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f79i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f0 f80j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e1 f81k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.compose.ui.viewinterop.b f82l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f83m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f84n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g2.l f85o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v0.d<f0> f86p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f87q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y1.e0 f88r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final x f89s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w2.d f90t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private w2.r f91u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x1 f92v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t0.w f93w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f94x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f95y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f96z;

    static final class a extends ae.s implements zd.a<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            return new f0(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements x1 {
        b() {
        }

        @Override // b2.x1
        public long a() {
            return 300L;
        }

        @Override // b2.x1
        public long b() {
            return 40L;
        }

        @Override // b2.x1
        public long c() {
            return 400L;
        }

        @Override // b2.x1
        public long d() {
            return w2.k.f22414a.b();
        }

        @Override // b2.x1
        public float f() {
            return 16.0f;
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // y1.e0
        public /* bridge */ /* synthetic */ y1.f0 a(y1.g0 g0Var, List list, long j10) {
            return (y1.f0) j(g0Var, list, j10);
        }

        public Void j(y1.g0 g0Var, List<? extends y1.d0> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(ae.j jVar) {
            this();
        }

        public final zd.a<f0> a() {
            return f0.f68b0;
        }

        public final Comparator<f0> b() {
            return f0.f70d0;
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements y1.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f104a;

        public f(String str) {
            this.f104a = str;
        }

        @Override // y1.e0
        public /* bridge */ /* synthetic */ int b(y1.n nVar, List list, int i10) {
            return ((Number) f(nVar, list, i10)).intValue();
        }

        @Override // y1.e0
        public /* bridge */ /* synthetic */ int c(y1.n nVar, List list, int i10) {
            return ((Number) g(nVar, list, i10)).intValue();
        }

        @Override // y1.e0
        public /* bridge */ /* synthetic */ int d(y1.n nVar, List list, int i10) {
            return ((Number) h(nVar, list, i10)).intValue();
        }

        @Override // y1.e0
        public /* bridge */ /* synthetic */ int e(y1.n nVar, List list, int i10) {
            return ((Number) i(nVar, list, i10)).intValue();
        }

        public Void f(y1.n nVar, List<? extends y1.m> list, int i10) {
            throw new IllegalStateException(this.f104a.toString());
        }

        public Void g(y1.n nVar, List<? extends y1.m> list, int i10) {
            throw new IllegalStateException(this.f104a.toString());
        }

        public Void h(y1.n nVar, List<? extends y1.m> list, int i10) {
            throw new IllegalStateException(this.f104a.toString());
        }

        public Void i(y1.n nVar, List<? extends y1.m> list, int i10) {
            throw new IllegalStateException(this.f104a.toString());
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f109a = iArr;
        }
    }

    static final class i extends ae.s implements zd.a<md.i0> {
        i() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f0.this.S().K();
        }
    }

    static final class j extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0<g2.l> f112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ae.h0<g2.l> h0Var) {
            super(0);
            this.f112b = h0Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, g2.l] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.node.a aVarH0 = f0.this.h0();
            int iA = w0.a(8);
            ae.h0<g2.l> h0Var = this.f112b;
            if ((aVarH0.i() & iA) != 0) {
                for (e.c cVarO = aVarH0.o(); cVarO != null; cVarO = cVarO.E1()) {
                    if ((cVarO.C1() & iA) != 0) {
                        e.c cVarG = cVarO;
                        v0.d dVar = null;
                        while (cVarG != 0) {
                            if (cVarG instanceof n1) {
                                n1 n1Var = (n1) cVarG;
                                if (n1Var.d0()) {
                                    ?? lVar = new g2.l();
                                    h0Var.f712a = lVar;
                                    lVar.w(true);
                                }
                                if (n1Var.q1()) {
                                    h0Var.f712a.x(true);
                                }
                                n1Var.U(h0Var.f712a);
                            } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                                e.c cVarB2 = ((l) cVarG).b2();
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
                            cVarG = k.g(dVar);
                        }
                    }
                }
            }
        }
    }

    public f0() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public f0(boolean z10, int i10) {
        this.f71a = z10;
        this.f72b = i10;
        this.f77g = new s0<>(new v0.d(new f0[16], 0), new i());
        this.f86p = new v0.d<>(new f0[16], 0);
        this.f87q = true;
        this.f88r = f67a0;
        this.f89s = new x(this);
        this.f90t = j0.f150a;
        this.f91u = w2.r.Ltr;
        this.f92v = f69c0;
        this.f93w = t0.w.V.a();
        g gVar = g.NotUsed;
        this.f94x = gVar;
        this.f95y = gVar;
        this.A = new androidx.compose.ui.node.a(this);
        this.B = new k0(this);
        this.E = true;
        this.F = androidx.compose.ui.e.f2662a;
    }

    public /* synthetic */ f0(boolean z10, int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? g2.o.b() : i10);
    }

    private final void F0() {
        f0 f0Var;
        if (this.f76f > 0) {
            this.f79i = true;
        }
        if (!this.f71a || (f0Var = this.f80j) == null) {
            return;
        }
        f0Var.F0();
    }

    public static /* synthetic */ boolean M0(f0 f0Var, w2.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = f0Var.B.y();
        }
        return f0Var.L0(bVar);
    }

    private final u0 P() {
        if (this.E) {
            u0 u0VarN = N();
            u0 u0VarF2 = i0().f2();
            this.D = null;
            while (true) {
                if (ae.r.b(u0VarN, u0VarF2)) {
                    break;
                }
                if ((u0VarN != null ? u0VarN.X1() : null) != null) {
                    this.D = u0VarN;
                    break;
                }
                u0VarN = u0VarN != null ? u0VarN.f2() : null;
            }
        }
        u0 u0Var = this.D;
        if (u0Var == null || u0Var.X1() != null) {
            return u0Var;
        }
        throw new IllegalStateException("layer was not set".toString());
    }

    private final void T0(f0 f0Var) {
        if (f0Var.B.s() > 0) {
            this.B.T(r0.s() - 1);
        }
        if (this.f81k != null) {
            f0Var.y();
        }
        f0Var.f80j = null;
        f0Var.i0().H2(null);
        if (f0Var.f71a) {
            this.f76f--;
            v0.d<f0> dVarF = f0Var.f77g.f();
            int iO = dVarF.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarF.n();
                do {
                    f0VarArrN[i10].i0().H2(null);
                    i10++;
                } while (i10 < iO);
            }
        }
        F0();
        V0();
    }

    private final void U0() {
        C0();
        f0 f0VarK0 = k0();
        if (f0VarK0 != null) {
            f0VarK0.A0();
        }
        B0();
    }

    private final void X0() {
        if (this.f79i) {
            int i10 = 0;
            this.f79i = false;
            v0.d<f0> dVar = this.f78h;
            if (dVar == null) {
                v0.d<f0> dVar2 = new v0.d<>(new f0[16], 0);
                this.f78h = dVar2;
                dVar = dVar2;
            }
            dVar.i();
            v0.d<f0> dVarF = this.f77g.f();
            int iO = dVarF.o();
            if (iO > 0) {
                f0[] f0VarArrN = dVarF.n();
                do {
                    f0 f0Var = f0VarArrN[i10];
                    if (f0Var.f71a) {
                        dVar.d(dVar.o(), f0Var.s0());
                    } else {
                        dVar.b(f0Var);
                    }
                    i10++;
                } while (i10 < iO);
            }
            this.B.K();
        }
    }

    public static /* synthetic */ boolean Z0(f0 f0Var, w2.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = f0Var.B.x();
        }
        return f0Var.Y0(bVar);
    }

    public static /* synthetic */ void e1(f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        f0Var.d1(z10);
    }

    public static /* synthetic */ void g1(f0 f0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        f0Var.f1(z10, z11);
    }

    public static /* synthetic */ void i1(f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        f0Var.h1(z10);
    }

    public static /* synthetic */ void k1(f0 f0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        f0Var.j1(z10, z11);
    }

    private final void m1() {
        this.A.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(f0 f0Var, f0 f0Var2) {
        return (f0Var.q0() > f0Var2.q0() ? 1 : (f0Var.q0() == f0Var2.q0() ? 0 : -1)) == 0 ? ae.r.g(f0Var.l0(), f0Var2.l0()) : Float.compare(f0Var.q0(), f0Var2.q0());
    }

    private final float q0() {
        return a0().p1();
    }

    private final void r1(f0 f0Var) {
        if (ae.r.b(f0Var, this.f75e)) {
            return;
        }
        this.f75e = f0Var;
        if (f0Var != null) {
            this.B.q();
            u0 u0VarE2 = N().e2();
            for (u0 u0VarI0 = i0(); !ae.r.b(u0VarI0, u0VarE2) && u0VarI0 != null; u0VarI0 = u0VarI0.e2()) {
                u0VarI0.P1();
            }
        }
        C0();
    }

    public static /* synthetic */ void u0(f0 f0Var, long j10, t tVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        f0Var.t0(j10, tVar, z12, z11);
    }

    private final void v() {
        this.f95y = this.f94x;
        this.f94x = g.NotUsed;
        v0.d<f0> dVarS0 = s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarS0.n();
            do {
                f0 f0Var = f0VarArrN[i10];
                if (f0Var.f94x == g.InLayoutBlock) {
                    f0Var.v();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    private final String w(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        v0.d<f0> dVarS0 = s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            f0[] f0VarArrN = dVarS0.n();
            int i12 = 0;
            do {
                sb2.append(f0VarArrN[i12].w(i10 + 1));
                i12++;
            } while (i12 < iO);
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String x(f0 f0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return f0Var.w(i10);
    }

    private final void y0() {
        if (this.A.p(w0.a(1024) | w0.a(2048) | w0.a(4096))) {
            for (e.c cVarK = this.A.k(); cVarK != null; cVarK = cVarK.y1()) {
                if (((w0.a(1024) & cVarK.C1()) != 0) | ((w0.a(2048) & cVarK.C1()) != 0) | ((w0.a(4096) & cVarK.C1()) != 0)) {
                    x0.a(cVarK);
                }
            }
        }
    }

    private final void z0() {
        androidx.compose.ui.node.a aVar = this.A;
        int iA = w0.a(1024);
        if ((aVar.i() & iA) != 0) {
            for (e.c cVarO = aVar.o(); cVarO != null; cVarO = cVarO.E1()) {
                if ((cVarO.C1() & iA) != 0) {
                    e.c cVarG = cVarO;
                    v0.d dVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                            if (focusTargetNode.h2().a()) {
                                j0.b(this).getFocusOwner().f(true, false);
                                focusTargetNode.j2();
                            }
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                            int i10 = 0;
                            for (e.c cVarB2 = ((l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                if ((cVarB2.C1() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarG = cVarB2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new v0.d(new e.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            dVar.b(cVarG);
                                            cVarG = null;
                                        }
                                        dVar.b(cVarB2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarG = k.g(dVar);
                    }
                }
            }
        }
    }

    public final void A(l1.b0 b0Var) {
        i0().M1(b0Var);
    }

    public final void A0() {
        u0 u0VarP = P();
        if (u0VarP != null) {
            u0VarP.o2();
            return;
        }
        f0 f0VarK0 = k0();
        if (f0VarK0 != null) {
            f0VarK0.A0();
        }
    }

    public final boolean B() {
        a2.a aVarD;
        k0 k0Var = this.B;
        if (!k0Var.r().d().k()) {
            a2.b bVarB = k0Var.B();
            if (!((bVarB == null || (aVarD = bVarB.d()) == null || !aVarD.k()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    public final void B0() {
        u0 u0VarI0 = i0();
        u0 u0VarN = N();
        while (u0VarI0 != u0VarN) {
            ae.r.d(u0VarI0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            b0 b0Var = (b0) u0VarI0;
            d1 d1VarX1 = b0Var.X1();
            if (d1VarX1 != null) {
                d1VarX1.invalidate();
            }
            u0VarI0 = b0Var.e2();
        }
        d1 d1VarX12 = N().X1();
        if (d1VarX12 != null) {
            d1VarX12.invalidate();
        }
    }

    public final boolean C() {
        return this.f96z;
    }

    public final void C0() {
        if (this.f75e != null) {
            g1(this, false, false, 3, null);
        } else {
            k1(this, false, false, 3, null);
        }
    }

    public final List<y1.d0> D() {
        k0.a aVarX = X();
        ae.r.c(aVarX);
        return aVarX.N0();
    }

    public final void D0() {
        this.B.J();
    }

    public final List<y1.d0> E() {
        return a0().Z0();
    }

    public final void E0() {
        this.f85o = null;
        j0.b(this).p();
    }

    public final List<f0> F() {
        return s0().h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, g2.l] */
    public final g2.l G() {
        if (!this.A.q(w0.a(8)) || this.f85o != null) {
            return this.f85o;
        }
        ae.h0 h0Var = new ae.h0();
        h0Var.f712a = new g2.l();
        j0.b(this).getSnapshotObserver().j(this, new j(h0Var));
        T t10 = h0Var.f712a;
        this.f85o = (g2.l) t10;
        return (g2.l) t10;
    }

    public boolean G0() {
        return this.f81k != null;
    }

    public t0.w H() {
        return this.f93w;
    }

    public boolean H0() {
        return this.X;
    }

    public w2.d I() {
        return this.f90t;
    }

    public final boolean I0() {
        return a0().w1();
    }

    public final int J() {
        return this.f83m;
    }

    public final Boolean J0() {
        k0.a aVarX = X();
        if (aVarX != null) {
            return Boolean.valueOf(aVarX.j());
        }
        return null;
    }

    public final List<f0> K() {
        return this.f77g.b();
    }

    public final boolean K0() {
        return this.f74d;
    }

    public final boolean L() {
        long jW1 = N().W1();
        return w2.b.l(jW1) && w2.b.k(jW1);
    }

    public final boolean L0(w2.b bVar) {
        if (bVar == null || this.f75e == null) {
            return false;
        }
        k0.a aVarX = X();
        ae.r.c(aVarX);
        return aVarX.A1(bVar.t());
    }

    public int M() {
        return this.B.w();
    }

    public final u0 N() {
        return this.A.l();
    }

    public final void N0() {
        if (this.f94x == g.NotUsed) {
            v();
        }
        k0.a aVarX = X();
        ae.r.c(aVarX);
        aVarX.B1();
    }

    @Override // a2.f1
    public boolean O() {
        return G0();
    }

    public final void O0() {
        this.B.L();
    }

    public final void P0() {
        this.B.M();
    }

    public final x Q() {
        return this.f89s;
    }

    public final void Q0() {
        this.B.N();
    }

    public final g R() {
        return this.f94x;
    }

    public final void R0() {
        this.B.O();
    }

    public final k0 S() {
        return this.B;
    }

    public final void S0(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f77g.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this.f77g.g(i10 > i11 ? i10 + i13 : i10));
        }
        V0();
        F0();
        C0();
    }

    public final boolean T() {
        return this.B.z();
    }

    public final e U() {
        return this.B.A();
    }

    public final boolean V() {
        return this.B.C();
    }

    public final void V0() {
        if (!this.f71a) {
            this.f87q = true;
            return;
        }
        f0 f0VarK0 = k0();
        if (f0VarK0 != null) {
            f0VarK0.V0();
        }
    }

    public final boolean W() {
        return this.B.D();
    }

    public final void W0(int i10, int i11) {
        t0.a placementScope;
        u0 u0VarN;
        if (this.f94x == g.NotUsed) {
            v();
        }
        f0 f0VarK0 = k0();
        if (f0VarK0 == null || (u0VarN = f0VarK0.N()) == null || (placementScope = u0VarN.R0()) == null) {
            placementScope = j0.b(this).getPlacementScope();
        }
        t0.a.j(placementScope, a0(), i10, i11, 0.0f, 4, null);
    }

    public final k0.a X() {
        return this.B.E();
    }

    public final f0 Y() {
        return this.f75e;
    }

    public final boolean Y0(w2.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f94x == g.NotUsed) {
            u();
        }
        return a0().G1(bVar.t());
    }

    public final h0 Z() {
        return j0.b(this).getSharedDrawScope();
    }

    @Override // a2.g
    public void a(w2.r rVar) {
        if (this.f91u != rVar) {
            this.f91u = rVar;
            U0();
        }
    }

    public final k0.b a0() {
        return this.B.F();
    }

    public final void a1() {
        int iE = this.f77g.e();
        while (true) {
            iE--;
            if (-1 >= iE) {
                this.f77g.c();
                return;
            }
            T0(this.f77g.d(iE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // a2.g
    public void b(x1 x1Var) {
        if (ae.r.b(this.f92v, x1Var)) {
            return;
        }
        this.f92v = x1Var;
        androidx.compose.ui.node.a aVar = this.A;
        int iA = w0.a(16);
        if ((aVar.i() & iA) != 0) {
            for (e.c cVarK = aVar.k(); cVarK != null; cVarK = cVarK.y1()) {
                if ((cVarK.C1() & iA) != 0) {
                    e.c cVarG = cVarK;
                    v0.d dVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof j1) {
                            ((j1) cVarG).n1();
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                            e.c cVarB2 = ((l) cVarG).b2();
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
                        cVarG = k.g(dVar);
                    }
                }
                if ((cVarK.x1() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final boolean b0() {
        return this.B.G();
    }

    public final void b1(int i10, int i11) {
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("count (" + i11 + ") must be greater than 0").toString());
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            T0(this.f77g.g(i12));
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // a2.e1.b
    public void c() {
        u0 u0VarN = N();
        int iA = w0.a(128);
        boolean zI = x0.i(iA);
        e.c cVarD2 = u0VarN.d2();
        if (!zI && (cVarD2 = cVarD2.E1()) == null) {
            return;
        }
        for (e.c cVarJ2 = u0VarN.j2(zI); cVarJ2 != null && (cVarJ2.x1() & iA) != 0; cVarJ2 = cVarJ2.y1()) {
            if ((cVarJ2.C1() & iA) != 0) {
                e.c cVarG = cVarJ2;
                v0.d dVar = null;
                while (cVarG != 0) {
                    if (cVarG instanceof z) {
                        ((z) cVarG).B(N());
                    } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                        e.c cVarB2 = ((l) cVarG).b2();
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
                    cVarG = k.g(dVar);
                }
            }
            if (cVarJ2 == cVarD2) {
                return;
            }
        }
    }

    public y1.e0 c0() {
        return this.f88r;
    }

    public final void c1() {
        if (this.f94x == g.NotUsed) {
            v();
        }
        a0().H1();
    }

    @Override // a2.g
    public void d(int i10) {
        this.f73c = i10;
    }

    public final g d0() {
        return a0().m1();
    }

    public final void d1(boolean z10) {
        e1 e1Var;
        if (this.f71a || (e1Var = this.f81k) == null) {
            return;
        }
        e1Var.h(this, true, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // a2.g
    public void e(t0.w wVar) {
        this.f93w = wVar;
        h((w2.d) wVar.a(b2.k0.c()));
        a((w2.r) wVar.a(b2.k0.f()));
        b((x1) wVar.a(b2.k0.i()));
        androidx.compose.ui.node.a aVar = this.A;
        int iA = w0.a(32768);
        if ((aVar.i() & iA) != 0) {
            for (e.c cVarK = aVar.k(); cVarK != null; cVarK = cVarK.y1()) {
                if ((cVarK.C1() & iA) != 0) {
                    e.c cVarG = cVarK;
                    v0.d dVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof a2.h) {
                            e.c cVarL0 = ((a2.h) cVarG).L0();
                            if (cVarL0.H1()) {
                                x0.e(cVarL0);
                            } else {
                                cVarL0.X1(true);
                            }
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                            e.c cVarB2 = ((l) cVarG).b2();
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
                        cVarG = k.g(dVar);
                    }
                }
                if ((cVarK.x1() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final g e0() {
        g gVarC1;
        k0.a aVarX = X();
        return (aVarX == null || (gVarC1 = aVarX.c1()) == null) ? g.NotUsed : gVarC1;
    }

    @Override // t0.j
    public void f() {
        androidx.compose.ui.viewinterop.b bVar = this.f82l;
        if (bVar != null) {
            bVar.f();
        }
        y1.x xVar = this.C;
        if (xVar != null) {
            xVar.f();
        }
        u0 u0VarE2 = N().e2();
        for (u0 u0VarI0 = i0(); !ae.r.b(u0VarI0, u0VarE2) && u0VarI0 != null; u0VarI0 = u0VarI0.e2()) {
            u0VarI0.y2();
        }
    }

    public androidx.compose.ui.e f0() {
        return this.F;
    }

    public final void f1(boolean z10, boolean z11) {
        if (!(this.f75e != null)) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
        }
        e1 e1Var = this.f81k;
        if (e1Var == null || this.f84n || this.f71a) {
            return;
        }
        e1Var.d(this, true, z10, z11);
        k0.a aVarX = X();
        ae.r.c(aVarX);
        aVarX.m1(z10);
    }

    @Override // a2.g
    public void g(androidx.compose.ui.e eVar) {
        if (!(!this.f71a || f0() == androidx.compose.ui.e.f2662a)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        if (!(!H0())) {
            throw new IllegalArgumentException("modifier is updated when deactivated".toString());
        }
        this.F = eVar;
        this.A.E(eVar);
        this.B.W();
        if (this.A.q(w0.a(512)) && this.f75e == null) {
            r1(this);
        }
    }

    public final boolean g0() {
        return this.I;
    }

    @Override // y1.t
    public w2.r getLayoutDirection() {
        return this.f91u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // a2.g
    public void h(w2.d dVar) {
        if (ae.r.b(this.f90t, dVar)) {
            return;
        }
        this.f90t = dVar;
        U0();
        androidx.compose.ui.node.a aVar = this.A;
        int iA = w0.a(16);
        if ((aVar.i() & iA) != 0) {
            for (e.c cVarK = aVar.k(); cVarK != null; cVarK = cVarK.y1()) {
                if ((cVarK.C1() & iA) != 0) {
                    e.c cVarG = cVarK;
                    v0.d dVar2 = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof j1) {
                            ((j1) cVarG).w0();
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                            e.c cVarB2 = ((l) cVarG).b2();
                            int i10 = 0;
                            cVarG = cVarG;
                            while (cVarB2 != null) {
                                if ((cVarB2.C1() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarG = cVarB2;
                                    } else {
                                        if (dVar2 == null) {
                                            dVar2 = new v0.d(new e.c[16], 0);
                                        }
                                        if (cVarG != 0) {
                                            dVar2.b(cVarG);
                                            cVarG = 0;
                                        }
                                        dVar2.b(cVarB2);
                                    }
                                }
                                cVarB2 = cVarB2.y1();
                                cVarG = cVarG;
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarG = k.g(dVar2);
                    }
                }
                if ((cVarK.x1() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final androidx.compose.ui.node.a h0() {
        return this.A;
    }

    public final void h1(boolean z10) {
        e1 e1Var;
        if (this.f71a || (e1Var = this.f81k) == null) {
            return;
        }
        e1.r(e1Var, this, false, z10, 2, null);
    }

    @Override // y1.t
    public y1.r i() {
        return N();
    }

    public final u0 i0() {
        return this.A.n();
    }

    @Override // y1.t
    public boolean j() {
        return a0().j();
    }

    public final e1 j0() {
        return this.f81k;
    }

    public final void j1(boolean z10, boolean z11) {
        e1 e1Var;
        if (this.f84n || this.f71a || (e1Var = this.f81k) == null) {
            return;
        }
        e1.t(e1Var, this, false, z10, z11, 2, null);
        a0().q1(z10);
    }

    @Override // t0.j
    public void k() {
        androidx.compose.ui.viewinterop.b bVar = this.f82l;
        if (bVar != null) {
            bVar.k();
        }
        y1.x xVar = this.C;
        if (xVar != null) {
            xVar.k();
        }
        this.X = true;
        m1();
        if (G0()) {
            E0();
        }
    }

    public final f0 k0() {
        f0 f0Var = this.f80j;
        while (true) {
            if (!(f0Var != null && f0Var.f71a)) {
                return f0Var;
            }
            f0Var = f0Var.f80j;
        }
    }

    @Override // y1.v0
    public void l() {
        if (this.f75e != null) {
            g1(this, false, false, 1, null);
        } else {
            k1(this, false, false, 1, null);
        }
        w2.b bVarX = this.B.x();
        if (bVarX != null) {
            e1 e1Var = this.f81k;
            if (e1Var != null) {
                e1Var.l(this, bVarX.t());
                return;
            }
            return;
        }
        e1 e1Var2 = this.f81k;
        if (e1Var2 != null) {
            e1.c(e1Var2, false, 1, null);
        }
    }

    public final int l0() {
        return a0().n1();
    }

    public final void l1(f0 f0Var) {
        if (h.f109a[f0Var.U().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + f0Var.U());
        }
        if (f0Var.W()) {
            g1(f0Var, true, false, 2, null);
            return;
        }
        if (f0Var.V()) {
            f0Var.d1(true);
        }
        if (f0Var.b0()) {
            k1(f0Var, true, false, 2, null);
        } else if (f0Var.T()) {
            f0Var.h1(true);
        }
    }

    @Override // t0.j
    public void m() {
        if (!G0()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
        }
        androidx.compose.ui.viewinterop.b bVar = this.f82l;
        if (bVar != null) {
            bVar.m();
        }
        y1.x xVar = this.C;
        if (xVar != null) {
            xVar.m();
        }
        if (H0()) {
            this.X = false;
            E0();
        } else {
            m1();
        }
        t1(g2.o.b());
        this.A.s();
        this.A.y();
        l1(this);
    }

    public int m0() {
        return this.f72b;
    }

    @Override // a2.g
    public void n(y1.e0 e0Var) {
        if (ae.r.b(this.f88r, e0Var)) {
            return;
        }
        this.f88r = e0Var;
        this.f89s.l(c0());
        C0();
    }

    public final y1.x n0() {
        return this.C;
    }

    public final void n1() {
        v0.d<f0> dVarS0 = s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarS0.n();
            do {
                f0 f0Var = f0VarArrN[i10];
                g gVar = f0Var.f95y;
                f0Var.f94x = gVar;
                if (gVar != g.NotUsed) {
                    f0Var.n1();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public x1 o0() {
        return this.f92v;
    }

    public final void o1(boolean z10) {
        this.f96z = z10;
    }

    public int p0() {
        return this.B.I();
    }

    public final void p1(boolean z10) {
        this.E = z10;
    }

    public final void q1(g gVar) {
        this.f94x = gVar;
    }

    public final v0.d<f0> r0() {
        if (this.f87q) {
            this.f86p.i();
            v0.d<f0> dVar = this.f86p;
            dVar.d(dVar.o(), s0());
            this.f86p.C(f70d0);
            this.f87q = false;
        }
        return this.f86p;
    }

    public final v0.d<f0> s0() {
        v1();
        if (this.f76f == 0) {
            return this.f77g.f();
        }
        v0.d<f0> dVar = this.f78h;
        ae.r.c(dVar);
        return dVar;
    }

    public final void s1(boolean z10) {
        this.I = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(a2.e1 r7) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f0.t(a2.e1):void");
    }

    public final void t0(long j10, t tVar, boolean z10, boolean z11) {
        i0().m2(u0.B.a(), i0().R1(j10), tVar, z10, z11);
    }

    public void t1(int i10) {
        this.f72b = i10;
    }

    public String toString() {
        return b2.z0.a(this, null) + " children: " + F().size() + " measurePolicy: " + c0();
    }

    public final void u() {
        this.f95y = this.f94x;
        this.f94x = g.NotUsed;
        v0.d<f0> dVarS0 = s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarS0.n();
            do {
                f0 f0Var = f0VarArrN[i10];
                if (f0Var.f94x != g.NotUsed) {
                    f0Var.u();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public final void u1(y1.x xVar) {
        this.C = xVar;
    }

    public final void v0(long j10, t tVar, boolean z10, boolean z11) {
        i0().m2(u0.B.b(), i0().R1(j10), tVar, true, z11);
    }

    public final void v1() {
        if (this.f76f > 0) {
            X0();
        }
    }

    public final void x0(int i10, f0 f0Var) {
        if (!(f0Var.f80j == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(f0Var);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(x(this, 0, 1, null));
            sb2.append(" Other tree: ");
            f0 f0Var2 = f0Var.f80j;
            sb2.append(f0Var2 != null ? x(f0Var2, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (!(f0Var.f81k == null)) {
            throw new IllegalStateException(("Cannot insert " + f0Var + " because it already has an owner. This tree: " + x(this, 0, 1, null) + " Other tree: " + x(f0Var, 0, 1, null)).toString());
        }
        f0Var.f80j = this;
        this.f77g.a(i10, f0Var);
        V0();
        if (f0Var.f71a) {
            this.f76f++;
        }
        F0();
        e1 e1Var = this.f81k;
        if (e1Var != null) {
            f0Var.t(e1Var);
        }
        if (f0Var.B.s() > 0) {
            k0 k0Var = this.B;
            k0Var.T(k0Var.s() + 1);
        }
    }

    public final void y() {
        e1 e1Var = this.f81k;
        if (e1Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            f0 f0VarK0 = k0();
            sb2.append(f0VarK0 != null ? x(f0VarK0, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        z0();
        f0 f0VarK02 = k0();
        if (f0VarK02 != null) {
            f0VarK02.A0();
            f0VarK02.C0();
            k0.b bVarA0 = a0();
            g gVar = g.NotUsed;
            bVarA0.J1(gVar);
            k0.a aVarX = X();
            if (aVarX != null) {
                aVarX.D1(gVar);
            }
        }
        this.B.S();
        zd.l<? super e1, md.i0> lVar = this.H;
        if (lVar != null) {
            lVar.invoke(e1Var);
        }
        if (this.A.q(w0.a(8))) {
            E0();
        }
        this.A.z();
        this.f84n = true;
        v0.d<f0> dVarF = this.f77g.f();
        int iO = dVarF.o();
        if (iO > 0) {
            f0[] f0VarArrN = dVarF.n();
            int i10 = 0;
            do {
                f0VarArrN[i10].y();
                i10++;
            } while (i10 < iO);
        }
        this.f84n = false;
        this.A.t();
        e1Var.w(this);
        this.f81k = null;
        r1(null);
        this.f83m = 0;
        a0().D1();
        k0.a aVarX2 = X();
        if (aVarX2 != null) {
            aVarX2.y1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void z() {
        if (U() != e.Idle || T() || b0() || H0() || !j()) {
            return;
        }
        androidx.compose.ui.node.a aVar = this.A;
        int iA = w0.a(256);
        if ((aVar.i() & iA) != 0) {
            for (e.c cVarK = aVar.k(); cVarK != null; cVarK = cVarK.y1()) {
                if ((cVarK.C1() & iA) != 0) {
                    e.c cVarG = cVarK;
                    v0.d dVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof s) {
                            s sVar = (s) cVarG;
                            sVar.l(k.h(sVar, w0.a(256)));
                        } else if (((cVarG.C1() & iA) != 0) && (cVarG instanceof l)) {
                            e.c cVarB2 = ((l) cVarG).b2();
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
                        cVarG = k.g(dVar);
                    }
                }
                if ((cVarK.x1() & iA) == 0) {
                    return;
                }
            }
        }
    }
}
