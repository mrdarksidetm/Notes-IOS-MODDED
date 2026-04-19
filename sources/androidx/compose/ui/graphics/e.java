package androidx.compose.ui.graphics;

import ae.r;
import k1.l;
import l1.j0;
import l1.m1;
import l1.n1;
import l1.t1;
import l1.u0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2770a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2776g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2781l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2785p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n1 f2789t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2771b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2772c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2773d = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2777h = u0.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2778i = u0.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2782m = 8.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2783n = g.f2806b.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private t1 f2784o = m1.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2786q = b.f2766a.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f2787r = l.f14359b.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private w2.d f2788s = w2.f.b(1.0f, 0.0f, 2, null);

    public final void A(w2.d dVar) {
        this.f2788s = dVar;
    }

    public void B(long j10) {
        this.f2787r = j10;
    }

    @Override // androidx.compose.ui.graphics.d
    public float D0() {
        return this.f2775f;
    }

    @Override // androidx.compose.ui.graphics.d
    public float F() {
        return this.f2771b;
    }

    @Override // androidx.compose.ui.graphics.d
    public void H(float f10) {
        if (this.f2776g == f10) {
            return;
        }
        this.f2770a |= 32;
        this.f2776g = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void K0(long j10) {
        if (j0.w(this.f2777h, j10)) {
            return;
        }
        this.f2770a |= 64;
        this.f2777h = j10;
    }

    @Override // androidx.compose.ui.graphics.d
    public float Q0() {
        return this.f2782m;
    }

    @Override // androidx.compose.ui.graphics.d
    public float S0() {
        return this.f2774e;
    }

    @Override // androidx.compose.ui.graphics.d
    public void U0(boolean z10) {
        if (this.f2785p != z10) {
            this.f2770a |= 16384;
            this.f2785p = z10;
        }
    }

    @Override // androidx.compose.ui.graphics.d
    public long V0() {
        return this.f2783n;
    }

    @Override // androidx.compose.ui.graphics.d
    public float X0() {
        return this.f2779j;
    }

    @Override // androidx.compose.ui.graphics.d
    public float a0() {
        return this.f2780k;
    }

    @Override // androidx.compose.ui.graphics.d
    public void b(float f10) {
        if (this.f2773d == f10) {
            return;
        }
        this.f2770a |= 4;
        this.f2773d = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void b1(long j10) {
        if (g.e(this.f2783n, j10)) {
            return;
        }
        this.f2770a |= 4096;
        this.f2783n = j10;
    }

    public float d() {
        return this.f2773d;
    }

    @Override // androidx.compose.ui.graphics.d
    public void d1(t1 t1Var) {
        if (r.b(this.f2784o, t1Var)) {
            return;
        }
        this.f2770a |= 8192;
        this.f2784o = t1Var;
    }

    @Override // androidx.compose.ui.graphics.d
    public void e(float f10) {
        if (this.f2780k == f10) {
            return;
        }
        this.f2770a |= 512;
        this.f2780k = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void e1(long j10) {
        if (j0.w(this.f2778i, j10)) {
            return;
        }
        this.f2770a |= 128;
        this.f2778i = j10;
    }

    public long f() {
        return this.f2777h;
    }

    @Override // w2.d
    public float getDensity() {
        return this.f2788s.getDensity();
    }

    @Override // androidx.compose.ui.graphics.d
    public void h(float f10) {
        if (this.f2781l == f10) {
            return;
        }
        this.f2770a |= 1024;
        this.f2781l = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void i(float f10) {
        if (this.f2775f == f10) {
            return;
        }
        this.f2770a |= 16;
        this.f2775f = f10;
    }

    public boolean j() {
        return this.f2785p;
    }

    @Override // androidx.compose.ui.graphics.d
    public float j0() {
        return this.f2781l;
    }

    public int k() {
        return this.f2786q;
    }

    public final int l() {
        return this.f2770a;
    }

    @Override // androidx.compose.ui.graphics.d
    public void m(float f10) {
        if (this.f2772c == f10) {
            return;
        }
        this.f2770a |= 2;
        this.f2772c = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void n(n1 n1Var) {
        if (r.b(this.f2789t, n1Var)) {
            return;
        }
        this.f2770a |= 131072;
        this.f2789t = n1Var;
    }

    @Override // androidx.compose.ui.graphics.d
    public void o(int i10) {
        if (b.e(this.f2786q, i10)) {
            return;
        }
        this.f2770a |= 32768;
        this.f2786q = i10;
    }

    public n1 p() {
        return this.f2789t;
    }

    public float r() {
        return this.f2776g;
    }

    @Override // androidx.compose.ui.graphics.d
    public float r1() {
        return this.f2772c;
    }

    public t1 s() {
        return this.f2784o;
    }

    @Override // androidx.compose.ui.graphics.d
    public void t(float f10) {
        if (this.f2771b == f10) {
            return;
        }
        this.f2770a |= 1;
        this.f2771b = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void u(float f10) {
        if (this.f2774e == f10) {
            return;
        }
        this.f2770a |= 8;
        this.f2774e = f10;
    }

    public long v() {
        return this.f2778i;
    }

    public final void x() {
        t(1.0f);
        m(1.0f);
        b(1.0f);
        u(0.0f);
        i(0.0f);
        H(0.0f);
        K0(u0.a());
        e1(u0.a());
        z(0.0f);
        e(0.0f);
        h(0.0f);
        y(8.0f);
        b1(g.f2806b.a());
        d1(m1.a());
        U0(false);
        n(null);
        o(b.f2766a.a());
        B(l.f14359b.a());
        this.f2770a = 0;
    }

    @Override // androidx.compose.ui.graphics.d
    public void y(float f10) {
        if (this.f2782m == f10) {
            return;
        }
        this.f2770a |= 2048;
        this.f2782m = f10;
    }

    @Override // w2.l
    public float y0() {
        return this.f2788s.y0();
    }

    @Override // androidx.compose.ui.graphics.d
    public void z(float f10) {
        if (this.f2779j == f10) {
            return;
        }
        this.f2770a |= 256;
        this.f2779j = f10;
    }
}
