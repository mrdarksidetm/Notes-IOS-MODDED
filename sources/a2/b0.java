package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends u0 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final a f35a0 = new a(null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final l1.d1 f36b0;
    private a0 X;
    private w2.b Y;
    private p0 Z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private final class b extends p0 {
        public b() {
            super(b0.this);
        }

        @Override // a2.o0
        public int A0(y1.a aVar) {
            int iB = c0.b(this, aVar);
            y1().put(aVar, Integer.valueOf(iB));
            return iB;
        }

        @Override // a2.p0, y1.m
        public int B(int i10) {
            a0 a0VarU2 = b0.this.U2();
            p0 p0VarZ1 = b0.this.V2().Z1();
            ae.r.c(p0VarZ1);
            return a0VarU2.k(this, p0VarZ1, i10);
        }

        @Override // a2.p0, y1.m
        public int E(int i10) {
            a0 a0VarU2 = b0.this.U2();
            p0 p0VarZ1 = b0.this.V2().Z1();
            ae.r.c(p0VarZ1);
            return a0VarU2.v(this, p0VarZ1, i10);
        }

        @Override // y1.d0
        public y1.t0 I(long j10) {
            b0 b0Var = b0.this;
            x0(j10);
            b0Var.Y = w2.b.b(j10);
            a0 a0VarU2 = b0Var.U2();
            p0 p0VarZ1 = b0Var.V2().Z1();
            ae.r.c(p0VarZ1);
            I1(a0VarU2.d(this, p0VarZ1, j10));
            return this;
        }

        @Override // a2.p0, y1.m
        public int W(int i10) {
            a0 a0VarU2 = b0.this.U2();
            p0 p0VarZ1 = b0.this.V2().Z1();
            ae.r.c(p0VarZ1);
            return a0VarU2.j(this, p0VarZ1, i10);
        }

        @Override // a2.p0, y1.m
        public int k(int i10) {
            a0 a0VarU2 = b0.this.U2();
            p0 p0VarZ1 = b0.this.V2().Z1();
            ae.r.c(p0VarZ1);
            return a0VarU2.x(this, p0VarZ1, i10);
        }
    }

    static {
        l1.d1 d1VarA = l1.j.a();
        d1VarA.t(l1.j0.f14524b.b());
        d1VarA.v(1.0f);
        d1VarA.s(l1.e1.f14503a.b());
        f36b0 = d1VarA;
    }

    public b0(f0 f0Var, a0 a0Var) {
        super(f0Var);
        this.X = a0Var;
        this.Z = f0Var.Y() != null ? new b() : null;
    }

    @Override // a2.o0
    public int A0(y1.a aVar) {
        p0 p0VarZ1 = Z1();
        return p0VarZ1 != null ? p0VarZ1.x1(aVar) : c0.b(this, aVar);
    }

    @Override // y1.m
    public int B(int i10) {
        a0 a0Var = this.X;
        y1.l lVar = a0Var instanceof y1.l ? (y1.l) a0Var : null;
        return lVar != null ? lVar.g2(this, V2(), i10) : a0Var.k(this, V2(), i10);
    }

    @Override // y1.m
    public int E(int i10) {
        a0 a0Var = this.X;
        y1.l lVar = a0Var instanceof y1.l ? (y1.l) a0Var : null;
        return lVar != null ? lVar.e2(this, V2(), i10) : a0Var.v(this, V2(), i10);
    }

    @Override // y1.d0
    public y1.t0 I(long j10) {
        y1.f0 f0VarD;
        x0(j10);
        a0 a0VarU2 = U2();
        if (a0VarU2 instanceof y1.l) {
            y1.l lVar = (y1.l) a0VarU2;
            u0 u0VarV2 = V2();
            p0 p0VarZ1 = Z1();
            ae.r.c(p0VarZ1);
            y1.f0 f0VarN0 = p0VarZ1.N0();
            long jA = w2.q.a(f0VarN0.getWidth(), f0VarN0.getHeight());
            w2.b bVar = this.Y;
            ae.r.c(bVar);
            f0VarD = lVar.c2(this, u0VarV2, j10, jA, bVar.t());
        } else {
            f0VarD = a0VarU2.d(this, V2(), j10);
        }
        E2(f0VarD);
        w2();
        return this;
    }

    @Override // a2.u0
    public void P1() {
        if (Z1() == null) {
            X2(new b());
        }
    }

    public final a0 U2() {
        return this.X;
    }

    public final u0 V2() {
        u0 u0VarE2 = e2();
        ae.r.c(u0VarE2);
        return u0VarE2;
    }

    @Override // y1.m
    public int W(int i10) {
        a0 a0Var = this.X;
        y1.l lVar = a0Var instanceof y1.l ? (y1.l) a0Var : null;
        return lVar != null ? lVar.f2(this, V2(), i10) : a0Var.j(this, V2(), i10);
    }

    public final void W2(a0 a0Var) {
        this.X = a0Var;
    }

    protected void X2(p0 p0Var) {
        this.Z = p0Var;
    }

    @Override // a2.u0
    public p0 Z1() {
        return this.Z;
    }

    @Override // a2.u0
    public e.c d2() {
        return this.X.L0();
    }

    @Override // y1.m
    public int k(int i10) {
        a0 a0Var = this.X;
        y1.l lVar = a0Var instanceof y1.l ? (y1.l) a0Var : null;
        return lVar != null ? lVar.d2(this, V2(), i10) : a0Var.x(this, V2(), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a2.u0, y1.t0
    public void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
        super.v0(j10, f10, lVar);
        if (i1()) {
            return;
        }
        x2();
        N0().a();
    }

    @Override // a2.u0
    public void z2(l1.b0 b0Var) {
        V2().M1(b0Var);
        if (j0.b(Y1()).getShowLayoutBounds()) {
            N1(b0Var, f36b0);
        }
    }
}
