package a2;

import a2.f0;
import a2.k0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends u0 {
    public static final a Z = new a(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final l1.d1 f339a0;
    private final q1 X;
    private p0 Y;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private final class b extends p0 {
        public b() {
            super(v.this);
        }

        @Override // a2.o0
        public int A0(y1.a aVar) {
            Integer num = w1().l().get(aVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            y1().put(aVar, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // a2.p0, y1.m
        public int B(int i10) {
            return B1().Q().j(i10);
        }

        @Override // a2.p0
        protected void D1() {
            k0.a aVarX = B1().X();
            ae.r.c(aVarX);
            aVarX.z1();
        }

        @Override // a2.p0, y1.m
        public int E(int i10) {
            return B1().Q().e(i10);
        }

        @Override // y1.d0
        public y1.t0 I(long j10) {
            x0(j10);
            v0.d<f0> dVarS0 = B1().s0();
            int iO = dVarS0.o();
            if (iO > 0) {
                int i10 = 0;
                f0[] f0VarArrN = dVarS0.n();
                do {
                    k0.a aVarX = f0VarArrN[i10].X();
                    ae.r.c(aVarX);
                    aVarX.D1(f0.g.NotUsed);
                    i10++;
                } while (i10 < iO);
            }
            I1(B1().c0().a(this, B1().D(), j10));
            return this;
        }

        @Override // a2.p0, y1.m
        public int W(int i10) {
            return B1().Q().i(i10);
        }

        @Override // a2.p0, y1.m
        public int k(int i10) {
            return B1().Q().d(i10);
        }
    }

    static {
        l1.d1 d1VarA = l1.j.a();
        d1VarA.t(l1.j0.f14524b.h());
        d1VarA.v(1.0f);
        d1VarA.s(l1.e1.f14503a.b());
        f339a0 = d1VarA;
    }

    public v(f0 f0Var) {
        super(f0Var);
        this.X = new q1();
        d2().Z1(this);
        this.Y = f0Var.Y() != null ? new b() : null;
    }

    @Override // a2.o0
    public int A0(y1.a aVar) {
        p0 p0VarZ1 = Z1();
        if (p0VarZ1 != null) {
            return p0VarZ1.A0(aVar);
        }
        Integer num = T1().l().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // y1.m
    public int B(int i10) {
        return Y1().Q().h(i10);
    }

    @Override // y1.m
    public int E(int i10) {
        return Y1().Q().c(i10);
    }

    @Override // y1.d0
    public y1.t0 I(long j10) {
        x0(j10);
        v0.d<f0> dVarS0 = Y1().s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarS0.n();
            do {
                f0VarArrN[i10].a0().J1(f0.g.NotUsed);
                i10++;
            } while (i10 < iO);
        }
        E2(Y1().c0().a(this, Y1().E(), j10));
        w2();
        return this;
    }

    @Override // a2.u0
    public void P1() {
        if (Z1() == null) {
            T2(new b());
        }
    }

    @Override // a2.u0
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public q1 d2() {
        return this.X;
    }

    protected void T2(p0 p0Var) {
        this.Y = p0Var;
    }

    @Override // y1.m
    public int W(int i10) {
        return Y1().Q().g(i10);
    }

    @Override // a2.u0
    public p0 Z1() {
        return this.Y;
    }

    @Override // y1.m
    public int k(int i10) {
        return Y1().Q().b(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[EDGE_INSN: B:39:0x0093->B:37:0x0093 BREAK  A[LOOP:0: B:22:0x0057->B:41:?], SYNTHETIC] */
    @Override // a2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n2(a2.u0.f r19, long r20, a2.t r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r20
            a2.f0 r1 = r18.Y1()
            r10 = r19
            boolean r1 = r10.b(r1)
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L39
            boolean r1 = r0.R2(r8)
            if (r1 == 0) goto L1c
            r13 = r24
        L1a:
            r1 = r12
            goto L3c
        L1c:
            if (r23 == 0) goto L39
            long r1 = r18.a2()
            float r1 = r0.L1(r8, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L34
            r1 = r12
            goto L35
        L34:
            r1 = r11
        L35:
            if (r1 == 0) goto L39
            r13 = r11
            goto L1a
        L39:
            r13 = r24
            r1 = r11
        L3c:
            if (r1 == 0) goto L98
            int r14 = a2.t.d(r22)
            a2.f0 r1 = r18.Y1()
            v0.d r1 = r1.r0()
            int r2 = r1.o()
            if (r2 <= 0) goto L93
            int r2 = r2 - r12
            java.lang.Object[] r15 = r1.n()
            r16 = r2
        L57:
            r1 = r15[r16]
            r17 = r1
            a2.f0 r17 = (a2.f0) r17
            boolean r1 = r17.j()
            if (r1 == 0) goto L8c
            r1 = r19
            r2 = r17
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r13
            r1.d(r2, r3, r5, r6, r7)
            boolean r1 = r22.u()
            if (r1 != 0) goto L79
        L77:
            r1 = r12
            goto L88
        L79:
            a2.u0 r1 = r17.i0()
            boolean r1 = r1.I2()
            if (r1 == 0) goto L87
            r22.a()
            goto L77
        L87:
            r1 = r11
        L88:
            if (r1 != 0) goto L8c
            r1 = r12
            goto L8d
        L8c:
            r1 = r11
        L8d:
            if (r1 != 0) goto L93
            int r16 = r16 + (-1)
            if (r16 >= 0) goto L57
        L93:
            r1 = r22
            a2.t.l(r1, r14)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.v.n2(a2.u0$f, long, a2.t, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a2.u0, y1.t0
    public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        super.v0(j10, f10, lVar);
        if (i1()) {
            return;
        }
        x2();
        Y1().a0().E1();
    }

    @Override // a2.u0
    public void z2(l1.b0 b0Var) {
        e1 e1VarB = j0.b(Y1());
        v0.d<f0> dVarR0 = Y1().r0();
        int iO = dVarR0.o();
        if (iO > 0) {
            int i10 = 0;
            f0[] f0VarArrN = dVarR0.n();
            do {
                f0 f0Var = f0VarArrN[i10];
                if (f0Var.j()) {
                    f0Var.A(b0Var);
                }
                i10++;
            } while (i10 < iO);
        }
        if (e1VarB.getShowLayoutBounds()) {
            N1(b0Var, f339a0);
        }
    }
}
