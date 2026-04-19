package a2;

import a2.e1;
import a2.f0;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0.d<e1.b> f263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0.d<a> f265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w2.b f266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m0 f267i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f270c;

        public a(f0 f0Var, boolean z10, boolean z11) {
            this.f268a = f0Var;
            this.f269b = z10;
            this.f270c = z11;
        }

        public final f0 a() {
            return this.f268a;
        }

        public final boolean b() {
            return this.f270c;
        }

        public final boolean c() {
            return this.f269b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f271a;

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
                iArr[f0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f271a = iArr;
        }
    }

    public q0(f0 f0Var) {
        this.f259a = f0Var;
        e1.a aVar = e1.K;
        n nVar = new n(aVar.a());
        this.f260b = nVar;
        this.f262d = new c1();
        this.f263e = new v0.d<>(new e1.b[16], 0);
        this.f264f = 1L;
        v0.d<a> dVar = new v0.d<>(new a[16], 0);
        this.f265g = dVar;
        this.f267i = aVar.a() ? new m0(f0Var, nVar, dVar.h()) : null;
    }

    public static /* synthetic */ boolean B(q0 q0Var, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q0Var.A(f0Var, z10);
    }

    public static /* synthetic */ boolean D(q0 q0Var, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q0Var.C(f0Var, z10);
    }

    public static /* synthetic */ boolean G(q0 q0Var, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q0Var.F(f0Var, z10);
    }

    public static /* synthetic */ boolean I(q0 q0Var, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q0Var.H(f0Var, z10);
    }

    private final void b() {
        v0.d<e1.b> dVar = this.f263e;
        int iO = dVar.o();
        if (iO > 0) {
            int i10 = 0;
            e1.b[] bVarArrN = dVar.n();
            do {
                bVarArrN[i10].c();
                i10++;
            } while (i10 < iO);
        }
        this.f263e.i();
    }

    public static /* synthetic */ void d(q0 q0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        q0Var.c(z10);
    }

    private final boolean e(f0 f0Var, w2.b bVar) {
        if (f0Var.Y() == null) {
            return false;
        }
        boolean zL0 = bVar != null ? f0Var.L0(bVar) : f0.M0(f0Var, null, 1, null);
        f0 f0VarK0 = f0Var.k0();
        if (zL0 && f0VarK0 != null) {
            if (f0VarK0.Y() == null) {
                I(this, f0VarK0, false, 2, null);
            } else if (f0Var.e0() == f0.g.InMeasureBlock) {
                D(this, f0VarK0, false, 2, null);
            } else if (f0Var.e0() == f0.g.InLayoutBlock) {
                B(this, f0VarK0, false, 2, null);
            }
        }
        return zL0;
    }

    private final boolean f(f0 f0Var, w2.b bVar) {
        boolean zY0 = bVar != null ? f0Var.Y0(bVar) : f0.Z0(f0Var, null, 1, null);
        f0 f0VarK0 = f0Var.k0();
        if (zY0 && f0VarK0 != null) {
            if (f0Var.d0() == f0.g.InMeasureBlock) {
                I(this, f0VarK0, false, 2, null);
            } else if (f0Var.d0() == f0.g.InLayoutBlock) {
                G(this, f0VarK0, false, 2, null);
            }
        }
        return zY0;
    }

    private final void h(f0 f0Var, boolean z10) {
        v0.d<f0> dVarS0 = f0Var.s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            f0[] f0VarArrN = dVarS0.n();
            int i10 = 0;
            do {
                f0 f0Var2 = f0VarArrN[i10];
                if ((!z10 && m(f0Var2)) || (z10 && n(f0Var2))) {
                    if (l0.a(f0Var2) && !z10) {
                        if (f0Var2.W() && this.f260b.e(f0Var2, true)) {
                            w(f0Var2, true, false);
                        } else {
                            g(f0Var2, true);
                        }
                    }
                    u(f0Var2, z10);
                    if (!s(f0Var2, z10)) {
                        h(f0Var2, z10);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
        u(f0Var, z10);
    }

    private final boolean i(f0 f0Var) {
        return f0Var.b0() && m(f0Var);
    }

    private final boolean j(f0 f0Var) {
        return f0Var.W() && n(f0Var);
    }

    private final boolean m(f0 f0Var) {
        return f0Var.d0() == f0.g.InMeasureBlock || f0Var.S().r().d().k();
    }

    private final boolean n(f0 f0Var) {
        a2.a aVarD;
        if (f0Var.e0() != f0.g.InMeasureBlock) {
            a2.b bVarB = f0Var.S().B();
            if (!((bVarB == null || (aVarD = bVarB.d()) == null || !aVarD.k()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    private final boolean s(f0 f0Var, boolean z10) {
        return z10 ? f0Var.W() : f0Var.b0();
    }

    private final void u(f0 f0Var, boolean z10) {
        if (s(f0Var, z10) && this.f260b.e(f0Var, z10)) {
            w(f0Var, z10, false);
        }
    }

    private final boolean w(f0 f0Var, boolean z10, boolean z11) {
        w2.b bVar;
        boolean zE;
        boolean zF;
        int i10 = 0;
        if (f0Var.H0()) {
            return false;
        }
        if (!f0Var.j() && !f0Var.I0() && !i(f0Var) && !ae.r.b(f0Var.J0(), Boolean.TRUE) && !j(f0Var) && !f0Var.B()) {
            return false;
        }
        if (f0Var.W() || f0Var.b0()) {
            if (f0Var == this.f259a) {
                bVar = this.f266h;
                ae.r.c(bVar);
            } else {
                bVar = null;
            }
            zE = (f0Var.W() && z10) ? e(f0Var, bVar) : false;
            zF = f(f0Var, bVar);
        } else {
            zF = false;
            zE = false;
        }
        if (z11) {
            if ((zE || f0Var.V()) && ae.r.b(f0Var.J0(), Boolean.TRUE) && z10) {
                f0Var.N0();
            }
            if (f0Var.T()) {
                boolean z12 = true;
                if (f0Var != this.f259a) {
                    f0 f0VarK0 = f0Var.k0();
                    if (!(f0VarK0 != null && f0VarK0.j()) || !f0Var.I0()) {
                        z12 = false;
                    }
                }
                if (z12) {
                    if (f0Var == this.f259a) {
                        f0Var.W0(0, 0);
                    } else {
                        f0Var.c1();
                    }
                    this.f262d.d(f0Var);
                    m0 m0Var = this.f267i;
                    if (m0Var != null) {
                        m0Var.a();
                    }
                }
            }
        }
        if (this.f265g.s()) {
            v0.d<a> dVar = this.f265g;
            int iO = dVar.o();
            if (iO > 0) {
                a[] aVarArrN = dVar.n();
                do {
                    a aVar = aVarArrN[i10];
                    if (aVar.a().G0()) {
                        if (aVar.c()) {
                            C(aVar.a(), aVar.b());
                        } else {
                            H(aVar.a(), aVar.b());
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
            this.f265g.i();
        }
        return zF;
    }

    static /* synthetic */ boolean x(q0 q0Var, f0 f0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return q0Var.w(f0Var, z10, z11);
    }

    private final void y(f0 f0Var) {
        v0.d<f0> dVarS0 = f0Var.s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarS0.n();
            do {
                f0 f0Var2 = f0VarArrN[i10];
                if (m(f0Var2)) {
                    if (l0.a(f0Var2)) {
                        z(f0Var2, true);
                    } else {
                        y(f0Var2);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
    }

    private final void z(f0 f0Var, boolean z10) {
        w2.b bVar;
        if (f0Var == this.f259a) {
            bVar = this.f266h;
            ae.r.c(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            e(f0Var, bVar);
        } else {
            f(f0Var, bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3 A[PHI: r5
  0x00a3: PHI (r5v2 a2.m0) = (r5v1 a2.m0), (r5v3 a2.m0) binds: [B:60:0x00a1, B:21:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(a2.f0 r5, boolean r6) {
        /*
            r4 = this;
            a2.f0$e r0 = r5.U()
            int[] r1 = a2.q0.b.f271a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9f
            r3 = 2
            if (r0 == r3) goto L23
            r3 = 3
            if (r0 == r3) goto L9f
            r3 = 4
            if (r0 == r3) goto L23
            r3 = 5
            if (r0 != r3) goto L1d
            goto L23
        L1d:
            md.q r5 = new md.q
            r5.<init>()
            throw r5
        L23:
            boolean r0 = r5.W()
            if (r0 != 0) goto L2f
            boolean r0 = r5.V()
            if (r0 == 0) goto L37
        L2f:
            if (r6 != 0) goto L37
            a2.m0 r5 = r4.f267i
            if (r5 == 0) goto La6
            goto La3
        L37:
            r5.P0()
            r5.O0()
            boolean r6 = r5.H0()
            if (r6 == 0) goto L45
            goto La6
        L45:
            a2.f0 r6 = r5.k0()
            java.lang.Boolean r0 = r5.J0()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = ae.r.b(r0, r3)
            if (r0 == 0) goto L75
            if (r6 == 0) goto L5f
            boolean r0 = r6.W()
            if (r0 != r1) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            if (r0 != 0) goto L75
            if (r6 == 0) goto L6c
            boolean r0 = r6.V()
            if (r0 != r1) goto L6c
            r0 = r1
            goto L6d
        L6c:
            r0 = r2
        L6d:
            if (r0 != 0) goto L75
            a2.n r6 = r4.f260b
            r6.c(r5, r1)
            goto L9a
        L75:
            boolean r0 = r5.j()
            if (r0 == 0) goto L9a
            if (r6 == 0) goto L85
            boolean r0 = r6.T()
            if (r0 != r1) goto L85
            r0 = r1
            goto L86
        L85:
            r0 = r2
        L86:
            if (r0 != 0) goto L9a
            if (r6 == 0) goto L92
            boolean r6 = r6.b0()
            if (r6 != r1) goto L92
            r6 = r1
            goto L93
        L92:
            r6 = r2
        L93:
            if (r6 != 0) goto L9a
            a2.n r6 = r4.f260b
            r6.c(r5, r2)
        L9a:
            boolean r5 = r4.f261c
            if (r5 != 0) goto La6
            goto La7
        L9f:
            a2.m0 r5 = r4.f267i
            if (r5 == 0) goto La6
        La3:
            r5.a()
        La6:
            r1 = r2
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q0.A(a2.f0, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(a2.f0 r5, boolean r6) {
        /*
            r4 = this;
            a2.f0 r0 = r5.Y()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto La8
            a2.f0$e r0 = r5.U()
            int[] r3 = a2.q0.b.f271a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r1) goto La6
            r3 = 2
            if (r0 == r3) goto L95
            r3 = 3
            if (r0 == r3) goto L95
            r3 = 4
            if (r0 == r3) goto L95
            r3 = 5
            if (r0 != r3) goto L8f
            boolean r0 = r5.W()
            if (r0 == 0) goto L31
            if (r6 != 0) goto L31
            goto La6
        L31:
            r5.Q0()
            r5.R0()
            boolean r6 = r5.H0()
            if (r6 == 0) goto L3f
            goto La6
        L3f:
            java.lang.Boolean r6 = r5.J0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = ae.r.b(r6, r0)
            if (r6 != 0) goto L51
            boolean r6 = r4.j(r5)
            if (r6 == 0) goto L68
        L51:
            a2.f0 r6 = r5.k0()
            if (r6 == 0) goto L5f
            boolean r6 = r6.W()
            if (r6 != r1) goto L5f
            r6 = r1
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 != 0) goto L68
            a2.n r6 = r4.f260b
            r6.c(r5, r1)
            goto L8a
        L68:
            boolean r6 = r5.j()
            if (r6 != 0) goto L74
            boolean r6 = r4.i(r5)
            if (r6 == 0) goto L8a
        L74:
            a2.f0 r6 = r5.k0()
            if (r6 == 0) goto L82
            boolean r6 = r6.b0()
            if (r6 != r1) goto L82
            r6 = r1
            goto L83
        L82:
            r6 = r2
        L83:
            if (r6 != 0) goto L8a
            a2.n r6 = r4.f260b
            r6.c(r5, r2)
        L8a:
            boolean r5 = r4.f261c
            if (r5 != 0) goto La6
            goto La7
        L8f:
            md.q r5 = new md.q
            r5.<init>()
            throw r5
        L95:
            v0.d<a2.q0$a> r0 = r4.f265g
            a2.q0$a r3 = new a2.q0$a
            r3.<init>(r5, r1, r6)
            r0.b(r3)
            a2.m0 r5 = r4.f267i
            if (r5 == 0) goto La6
            r5.a()
        La6:
            r1 = r2
        La7:
            return r1
        La8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q0.C(a2.f0, boolean):boolean");
    }

    public final void E(f0 f0Var) {
        this.f262d.d(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x007b A[PHI: r5
  0x007b: PHI (r5v2 a2.m0) = (r5v1 a2.m0), (r5v5 a2.m0) binds: [B:47:0x0079, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(a2.f0 r5, boolean r6) {
        /*
            r4 = this;
            a2.f0$e r0 = r5.U()
            int[] r1 = a2.q0.b.f271a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L77
            r3 = 2
            if (r0 == r3) goto L77
            r3 = 3
            if (r0 == r3) goto L77
            r3 = 4
            if (r0 == r3) goto L77
            r3 = 5
            if (r0 != r3) goto L71
            if (r6 != 0) goto L39
            boolean r6 = r5.j()
            boolean r0 = r5.I0()
            if (r6 != r0) goto L39
            boolean r6 = r5.b0()
            if (r6 != 0) goto L34
            boolean r6 = r5.T()
            if (r6 == 0) goto L39
        L34:
            a2.m0 r5 = r4.f267i
            if (r5 == 0) goto L7e
            goto L7b
        L39:
            r5.O0()
            boolean r6 = r5.H0()
            if (r6 == 0) goto L43
            goto L7e
        L43:
            boolean r6 = r5.I0()
            if (r6 == 0) goto L6c
            a2.f0 r6 = r5.k0()
            if (r6 == 0) goto L57
            boolean r0 = r6.T()
            if (r0 != r1) goto L57
            r0 = r1
            goto L58
        L57:
            r0 = r2
        L58:
            if (r0 != 0) goto L6c
            if (r6 == 0) goto L64
            boolean r6 = r6.b0()
            if (r6 != r1) goto L64
            r6 = r1
            goto L65
        L64:
            r6 = r2
        L65:
            if (r6 != 0) goto L6c
            a2.n r6 = r4.f260b
            r6.c(r5, r2)
        L6c:
            boolean r5 = r4.f261c
            if (r5 != 0) goto L7e
            goto L7f
        L71:
            md.q r5 = new md.q
            r5.<init>()
            throw r5
        L77:
            a2.m0 r5 = r4.f267i
            if (r5 == 0) goto L7e
        L7b:
            r5.a()
        L7e:
            r1 = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q0.F(a2.f0, boolean):boolean");
    }

    public final boolean H(f0 f0Var, boolean z10) {
        int i10 = b.f271a[f0Var.U().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f265g.b(new a(f0Var, false, z10));
                m0 m0Var = this.f267i;
                if (m0Var != null) {
                    m0Var.a();
                }
            } else {
                if (i10 != 5) {
                    throw new md.q();
                }
                if (!f0Var.b0() || z10) {
                    f0Var.R0();
                    if (!f0Var.H0()) {
                        if (f0Var.j() || i(f0Var)) {
                            f0 f0VarK0 = f0Var.k0();
                            if (!(f0VarK0 != null && f0VarK0.b0())) {
                                this.f260b.c(f0Var, false);
                            }
                        }
                        if (!this.f261c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void J(long j10) {
        w2.b bVar = this.f266h;
        if (bVar == null ? false : w2.b.g(bVar.t(), j10)) {
            return;
        }
        if (!(!this.f261c)) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
        this.f266h = w2.b.b(j10);
        if (this.f259a.Y() != null) {
            this.f259a.Q0();
        }
        this.f259a.R0();
        n nVar = this.f260b;
        f0 f0Var = this.f259a;
        nVar.c(f0Var, f0Var.Y() != null);
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f262d.e(this.f259a);
        }
        this.f262d.a();
    }

    public final void g(f0 f0Var, boolean z10) {
        if (this.f260b.g(z10)) {
            return;
        }
        if (!this.f261c) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
        }
        if (!(!s(f0Var, z10))) {
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        h(f0Var, z10);
    }

    public final boolean k() {
        return this.f260b.h();
    }

    public final boolean l() {
        return this.f262d.c();
    }

    public final long o() {
        if (this.f261c) {
            return this.f264f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean p(zd.a<md.i0> aVar) {
        boolean z10;
        if (!this.f259a.G0()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.f259a.j()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.f261c)) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        boolean z11 = false;
        if (this.f266h != null) {
            this.f261c = true;
            try {
                if (this.f260b.h()) {
                    n nVar = this.f260b;
                    z10 = false;
                    while (nVar.h()) {
                        boolean z12 = !nVar.f243a.d();
                        f0 f0VarE = (z12 ? nVar.f243a : nVar.f244b).e();
                        boolean zX = x(this, f0VarE, z12, false, 4, null);
                        if (f0VarE == this.f259a && zX) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f261c = false;
                m0 m0Var = this.f267i;
                if (m0Var != null) {
                    m0Var.a();
                }
                z11 = z10;
            } catch (Throwable th) {
                this.f261c = false;
                throw th;
            }
        }
        b();
        return z11;
    }

    public final void q(f0 f0Var, long j10) {
        if (f0Var.H0()) {
            return;
        }
        if (!(!ae.r.b(f0Var, this.f259a))) {
            throw new IllegalArgumentException("measureAndLayout called on root".toString());
        }
        if (!this.f259a.G0()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.f259a.j()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.f261c)) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        if (this.f266h != null) {
            this.f261c = true;
            try {
                this.f260b.i(f0Var);
                boolean zE = e(f0Var, w2.b.b(j10));
                f(f0Var, w2.b.b(j10));
                if ((zE || f0Var.V()) && ae.r.b(f0Var.J0(), Boolean.TRUE)) {
                    f0Var.N0();
                }
                if (f0Var.T() && f0Var.j()) {
                    f0Var.c1();
                    this.f262d.d(f0Var);
                }
                this.f261c = false;
                m0 m0Var = this.f267i;
                if (m0Var != null) {
                    m0Var.a();
                }
            } catch (Throwable th) {
                this.f261c = false;
                throw th;
            }
        }
        b();
    }

    public final void r() {
        if (this.f260b.h()) {
            if (!this.f259a.G0()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
            }
            if (!this.f259a.j()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            if (!(!this.f261c)) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            if (this.f266h != null) {
                this.f261c = true;
                try {
                    if (!this.f260b.g(true)) {
                        if (this.f259a.Y() != null) {
                            z(this.f259a, true);
                        } else {
                            y(this.f259a);
                        }
                    }
                    z(this.f259a, false);
                    this.f261c = false;
                    m0 m0Var = this.f267i;
                    if (m0Var != null) {
                        m0Var.a();
                    }
                } catch (Throwable th) {
                    this.f261c = false;
                    throw th;
                }
            }
        }
    }

    public final void t(f0 f0Var) {
        this.f260b.i(f0Var);
    }

    public final void v(e1.b bVar) {
        this.f263e.b(bVar);
    }
}
