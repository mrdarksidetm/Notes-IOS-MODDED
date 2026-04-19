package b2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements a2.d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f5353n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5354o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final zd.p<m0, Matrix, md.i0> f5355p = a.f5369a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.i f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zd.l<? super l1.b0, md.i0> f5357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zd.a<md.i0> f5358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d1 f5360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l1.d1 f5363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a1<m0> f5364i = new a1<>(f5355p);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l1.c0 f5365j = new l1.c0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5366k = androidx.compose.ui.graphics.g.f2806b.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m0 f5367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5368m;

    static final class a extends ae.s implements zd.p<m0, Matrix, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5369a = new a();

        a() {
            super(2);
        }

        public final void a(m0 m0Var, Matrix matrix) {
            m0Var.I(matrix);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(m0 m0Var, Matrix matrix) {
            a(m0Var, matrix);
            return md.i0.f15558a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public k1(androidx.compose.ui.platform.i iVar, zd.l<? super l1.b0, md.i0> lVar, zd.a<md.i0> aVar) {
        this.f5356a = iVar;
        this.f5357b = lVar;
        this.f5358c = aVar;
        this.f5360e = new d1(iVar.getDensity());
        m0 h1Var = Build.VERSION.SDK_INT >= 29 ? new h1(iVar) : new f1(iVar);
        h1Var.G(true);
        h1Var.l(false);
        this.f5367l = h1Var;
    }

    private final void j(l1.b0 b0Var) {
        if (this.f5367l.E() || this.f5367l.B()) {
            this.f5360e.a(b0Var);
        }
    }

    private final void k(boolean z10) {
        if (z10 != this.f5359d) {
            this.f5359d = z10;
            this.f5356a.i0(this, z10);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            k2.f5370a.a(this.f5356a);
        } else {
            this.f5356a.invalidate();
        }
    }

    @Override // a2.d1
    public void a(k1.d dVar, boolean z10) {
        if (!z10) {
            l1.z0.g(this.f5364i.b(this.f5367l), dVar);
            return;
        }
        float[] fArrA = this.f5364i.a(this.f5367l);
        if (fArrA == null) {
            dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            l1.z0.g(fArrA, dVar);
        }
    }

    @Override // a2.d1
    public void b(zd.l<? super l1.b0, md.i0> lVar, zd.a<md.i0> aVar) {
        k(false);
        this.f5361f = false;
        this.f5362g = false;
        this.f5366k = androidx.compose.ui.graphics.g.f2806b.a();
        this.f5357b = lVar;
        this.f5358c = aVar;
    }

    @Override // a2.d1
    public boolean c(long j10) {
        float fO = k1.f.o(j10);
        float fP = k1.f.p(j10);
        if (this.f5367l.B()) {
            return 0.0f <= fO && fO < ((float) this.f5367l.getWidth()) && 0.0f <= fP && fP < ((float) this.f5367l.getHeight());
        }
        if (this.f5367l.E()) {
            return this.f5360e.f(j10);
        }
        return true;
    }

    @Override // a2.d1
    public void d(l1.b0 b0Var) {
        Canvas canvasD = l1.c.d(b0Var);
        if (canvasD.isHardwareAccelerated()) {
            h();
            boolean z10 = this.f5367l.J() > 0.0f;
            this.f5362g = z10;
            if (z10) {
                b0Var.t();
            }
            this.f5367l.j(canvasD);
            if (this.f5362g) {
                b0Var.i();
                return;
            }
            return;
        }
        float fC = this.f5367l.c();
        float fC2 = this.f5367l.C();
        float f10 = this.f5367l.f();
        float fG = this.f5367l.g();
        if (this.f5367l.a() < 1.0f) {
            l1.d1 d1VarA = this.f5363h;
            if (d1VarA == null) {
                d1VarA = l1.j.a();
                this.f5363h = d1VarA;
            }
            d1VarA.b(this.f5367l.a());
            canvasD.saveLayer(fC, fC2, f10, fG, d1VarA.j());
        } else {
            b0Var.h();
        }
        b0Var.c(fC, fC2);
        b0Var.l(this.f5364i.b(this.f5367l));
        j(b0Var);
        zd.l<? super l1.b0, md.i0> lVar = this.f5357b;
        if (lVar != null) {
            lVar.invoke(b0Var);
        }
        b0Var.p();
        k(false);
    }

    @Override // a2.d1
    public void destroy() {
        if (this.f5367l.x()) {
            this.f5367l.q();
        }
        this.f5357b = null;
        this.f5358c = null;
        this.f5361f = true;
        k(false);
        this.f5356a.o0();
        this.f5356a.n0(this);
    }

    @Override // a2.d1
    public long e(long j10, boolean z10) {
        if (!z10) {
            return l1.z0.f(this.f5364i.b(this.f5367l), j10);
        }
        float[] fArrA = this.f5364i.a(this.f5367l);
        return fArrA != null ? l1.z0.f(fArrA, j10) : k1.f.f14338b.a();
    }

    @Override // a2.d1
    public void f(long j10) {
        int iG = w2.p.g(j10);
        int iF = w2.p.f(j10);
        float f10 = iG;
        this.f5367l.k(androidx.compose.ui.graphics.g.f(this.f5366k) * f10);
        float f11 = iF;
        this.f5367l.s(androidx.compose.ui.graphics.g.g(this.f5366k) * f11);
        m0 m0Var = this.f5367l;
        if (m0Var.p(m0Var.c(), this.f5367l.C(), this.f5367l.c() + iG, this.f5367l.C() + iF)) {
            this.f5360e.i(k1.m.a(f10, f11));
            this.f5367l.A(this.f5360e.d());
            invalidate();
            this.f5364i.c();
        }
    }

    @Override // a2.d1
    public void g(long j10) {
        int iC = this.f5367l.c();
        int iC2 = this.f5367l.C();
        int iJ = w2.n.j(j10);
        int iK = w2.n.k(j10);
        if (iC == iJ && iC2 == iK) {
            return;
        }
        if (iC != iJ) {
            this.f5367l.d(iJ - iC);
        }
        if (iC2 != iK) {
            this.f5367l.w(iK - iC2);
        }
        l();
        this.f5364i.c();
    }

    @Override // a2.d1
    public void h() {
        if (this.f5359d || !this.f5367l.x()) {
            l1.f1 f1VarC = (!this.f5367l.E() || this.f5360e.e()) ? null : this.f5360e.c();
            zd.l<? super l1.b0, md.i0> lVar = this.f5357b;
            if (lVar != null) {
                this.f5367l.r(this.f5365j, f1VarC, lVar);
            }
            k(false);
        }
    }

    @Override // a2.d1
    public void i(androidx.compose.ui.graphics.e eVar, w2.r rVar, w2.d dVar) {
        zd.a<md.i0> aVar;
        int iL = eVar.l() | this.f5368m;
        int i10 = iL & 4096;
        if (i10 != 0) {
            this.f5366k = eVar.V0();
        }
        boolean z10 = false;
        boolean z11 = this.f5367l.E() && !this.f5360e.e();
        if ((iL & 1) != 0) {
            this.f5367l.t(eVar.F());
        }
        if ((iL & 2) != 0) {
            this.f5367l.m(eVar.r1());
        }
        if ((iL & 4) != 0) {
            this.f5367l.b(eVar.d());
        }
        if ((iL & 8) != 0) {
            this.f5367l.u(eVar.S0());
        }
        if ((iL & 16) != 0) {
            this.f5367l.i(eVar.D0());
        }
        if ((iL & 32) != 0) {
            this.f5367l.v(eVar.r());
        }
        if ((iL & 64) != 0) {
            this.f5367l.D(l1.l0.i(eVar.f()));
        }
        if ((iL & 128) != 0) {
            this.f5367l.H(l1.l0.i(eVar.v()));
        }
        if ((iL & 1024) != 0) {
            this.f5367l.h(eVar.j0());
        }
        if ((iL & 256) != 0) {
            this.f5367l.z(eVar.X0());
        }
        if ((iL & 512) != 0) {
            this.f5367l.e(eVar.a0());
        }
        if ((iL & 2048) != 0) {
            this.f5367l.y(eVar.Q0());
        }
        if (i10 != 0) {
            this.f5367l.k(androidx.compose.ui.graphics.g.f(this.f5366k) * this.f5367l.getWidth());
            this.f5367l.s(androidx.compose.ui.graphics.g.g(this.f5366k) * this.f5367l.getHeight());
        }
        boolean z12 = eVar.j() && eVar.s() != l1.m1.a();
        if ((iL & 24576) != 0) {
            this.f5367l.F(z12);
            this.f5367l.l(eVar.j() && eVar.s() == l1.m1.a());
        }
        if ((131072 & iL) != 0) {
            this.f5367l.n(eVar.p());
        }
        if ((32768 & iL) != 0) {
            this.f5367l.o(eVar.k());
        }
        boolean zH = this.f5360e.h(eVar.s(), eVar.d(), z12, eVar.r(), rVar, dVar);
        if (this.f5360e.b()) {
            this.f5367l.A(this.f5360e.d());
        }
        if (z12 && !this.f5360e.e()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zH)) {
            invalidate();
        } else {
            l();
        }
        if (!this.f5362g && this.f5367l.J() > 0.0f && (aVar = this.f5358c) != null) {
            aVar.invoke();
        }
        if ((iL & 7963) != 0) {
            this.f5364i.c();
        }
        this.f5368m = eVar.l();
    }

    @Override // a2.d1
    public void invalidate() {
        if (this.f5359d || this.f5361f) {
            return;
        }
        this.f5356a.invalidate();
        k(true);
    }
}
