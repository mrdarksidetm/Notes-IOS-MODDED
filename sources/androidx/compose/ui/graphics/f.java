package androidx.compose.ui.graphics;

import a2.a0;
import a2.k;
import a2.u0;
import a2.w0;
import ae.j;
import ae.s;
import androidx.compose.ui.e;
import l1.j0;
import l1.n1;
import l1.t1;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class f extends e.c implements a0 {
    private n1 A;
    private long B;
    private long C;
    private int D;
    private l<? super d, i0> E;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2797u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2798v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f2800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private t1 f2801y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2802z;

    static final class a extends s implements l<d, i0> {
        a() {
            super(1);
        }

        public final void a(d dVar) {
            dVar.t(f.this.F());
            dVar.m(f.this.r1());
            dVar.b(f.this.b2());
            dVar.u(f.this.S0());
            dVar.i(f.this.D0());
            dVar.H(f.this.g2());
            dVar.z(f.this.X0());
            dVar.e(f.this.a0());
            dVar.h(f.this.j0());
            dVar.y(f.this.Q0());
            dVar.b1(f.this.V0());
            dVar.d1(f.this.h2());
            dVar.U0(f.this.d2());
            dVar.n(f.this.f2());
            dVar.K0(f.this.c2());
            dVar.e1(f.this.i2());
            dVar.o(f.this.e2());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(d dVar) {
            a(dVar);
            return i0.f15558a;
        }
    }

    static final class b extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2805b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var, f fVar) {
            super(1);
            this.f2804a = t0Var;
            this.f2805b = fVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.r(aVar, this.f2804a, 0, 0, 0.0f, this.f2805b.E, 4, null);
        }
    }

    private f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10) {
        this.f2790n = f10;
        this.f2791o = f11;
        this.f2792p = f12;
        this.f2793q = f13;
        this.f2794r = f14;
        this.f2795s = f15;
        this.f2796t = f16;
        this.f2797u = f17;
        this.f2798v = f18;
        this.f2799w = f19;
        this.f2800x = j10;
        this.f2801y = t1Var;
        this.f2802z = z10;
        this.A = n1Var;
        this.B = j11;
        this.C = j12;
        this.D = i10;
        this.E = new a();
    }

    public /* synthetic */ f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10, j jVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, t1Var, z10, n1Var, j11, j12, i10);
    }

    public final float D0() {
        return this.f2794r;
    }

    public final float F() {
        return this.f2790n;
    }

    @Override // androidx.compose.ui.e.c
    public boolean F1() {
        return false;
    }

    public final void H(float f10) {
        this.f2795s = f10;
    }

    public final void K0(long j10) {
        this.B = j10;
    }

    public final float Q0() {
        return this.f2799w;
    }

    public final float S0() {
        return this.f2793q;
    }

    public final void U0(boolean z10) {
        this.f2802z = z10;
    }

    public final long V0() {
        return this.f2800x;
    }

    public final float X0() {
        return this.f2796t;
    }

    public final float a0() {
        return this.f2797u;
    }

    public final void b(float f10) {
        this.f2792p = f10;
    }

    public final void b1(long j10) {
        this.f2800x = j10;
    }

    public final float b2() {
        return this.f2792p;
    }

    public final long c2() {
        return this.B;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new b(t0VarI, this), 4, null);
    }

    public final void d1(t1 t1Var) {
        this.f2801y = t1Var;
    }

    public final boolean d2() {
        return this.f2802z;
    }

    public final void e(float f10) {
        this.f2797u = f10;
    }

    public final void e1(long j10) {
        this.C = j10;
    }

    public final int e2() {
        return this.D;
    }

    public final n1 f2() {
        return this.A;
    }

    public final float g2() {
        return this.f2795s;
    }

    public final void h(float f10) {
        this.f2798v = f10;
    }

    public final t1 h2() {
        return this.f2801y;
    }

    public final void i(float f10) {
        this.f2794r = f10;
    }

    public final long i2() {
        return this.C;
    }

    public final float j0() {
        return this.f2798v;
    }

    public final void j2() {
        u0 u0VarE2 = k.h(this, w0.a(2)).e2();
        if (u0VarE2 != null) {
            u0VarE2.N2(this.E, true);
        }
    }

    public final void m(float f10) {
        this.f2791o = f10;
    }

    public final void n(n1 n1Var) {
        this.A = n1Var;
    }

    public final void o(int i10) {
        this.D = i10;
    }

    public final float r1() {
        return this.f2791o;
    }

    public final void t(float f10) {
        this.f2790n = f10;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f2790n + ", scaleY=" + this.f2791o + ", alpha = " + this.f2792p + ", translationX=" + this.f2793q + ", translationY=" + this.f2794r + ", shadowElevation=" + this.f2795s + ", rotationX=" + this.f2796t + ", rotationY=" + this.f2797u + ", rotationZ=" + this.f2798v + ", cameraDistance=" + this.f2799w + ", transformOrigin=" + ((Object) g.i(this.f2800x)) + ", shape=" + this.f2801y + ", clip=" + this.f2802z + ", renderEffect=" + this.A + ", ambientShadowColor=" + ((Object) j0.D(this.B)) + ", spotShadowColor=" + ((Object) j0.D(this.C)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.b.g(this.D)) + ')';
    }

    public final void u(float f10) {
        this.f2793q = f10;
    }

    public final void y(float f10) {
        this.f2799w = f10;
    }

    public final void z(float f10) {
        this.f2796t = f10;
    }
}
