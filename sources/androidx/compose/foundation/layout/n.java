package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class n extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2531r;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f2533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f2534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var, g0 g0Var) {
            super(1);
            this.f2533b = t0Var;
            this.f2534c = g0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            if (n.this.a2()) {
                t0.a.j(aVar, this.f2533b, this.f2534c.a1(n.this.b2()), this.f2534c.a1(n.this.c2()), 0.0f, 4, null);
            } else {
                t0.a.f(aVar, this.f2533b, this.f2534c.a1(n.this.b2()), this.f2534c.a1(n.this.c2()), 0.0f, 4, null);
            }
        }
    }

    private n(float f10, float f11, float f12, float f13, boolean z10) {
        this.f2527n = f10;
        this.f2528o = f11;
        this.f2529p = f12;
        this.f2530q = f13;
        this.f2531r = z10;
    }

    public /* synthetic */ n(float f10, float f11, float f12, float f13, boolean z10, ae.j jVar) {
        this(f10, f11, f12, f13, z10);
    }

    public final boolean a2() {
        return this.f2531r;
    }

    public final float b2() {
        return this.f2527n;
    }

    public final float c2() {
        return this.f2528o;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        int iA1 = g0Var.a1(this.f2527n) + g0Var.a1(this.f2529p);
        int iA12 = g0Var.a1(this.f2528o) + g0Var.a1(this.f2530q);
        t0 t0VarI = d0Var.I(w2.c.i(j10, -iA1, -iA12));
        return g0.z0(g0Var, w2.c.g(j10, t0VarI.q0() + iA1), w2.c.f(j10, t0VarI.d0() + iA12), null, new a(t0VarI, g0Var), 4, null);
    }

    public final void d2(float f10) {
        this.f2530q = f10;
    }

    public final void e2(float f10) {
        this.f2529p = f10;
    }

    public final void f2(boolean z10) {
        this.f2531r = z10;
    }

    public final void g2(float f10) {
        this.f2527n = f10;
    }

    public final void h2(float f10) {
        this.f2528o = f10;
    }
}
