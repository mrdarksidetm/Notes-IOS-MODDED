package y1;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23295c = w2.q.a(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23296d = u0.f23300b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23297e = w2.n.f22418b.a();

    public static abstract class a {
        public static /* synthetic */ void f(a aVar, t0 t0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.e(t0Var, i10, i11, f10);
        }

        public static /* synthetic */ void h(a aVar, t0 t0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.g(t0Var, j10, f10);
        }

        public static /* synthetic */ void j(a aVar, t0 t0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.i(t0Var, i10, i11, f10);
        }

        public static /* synthetic */ void l(a aVar, t0 t0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.k(t0Var, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void n(a aVar, t0 t0Var, int i10, int i11, float f10, zd.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = u0.f23299a;
            }
            aVar.m(t0Var, i10, i11, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void p(a aVar, t0 t0Var, long j10, float f10, zd.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = u0.f23299a;
            }
            aVar.o(t0Var, j10, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void r(a aVar, t0 t0Var, int i10, int i11, float f10, zd.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = u0.f23299a;
            }
            aVar.q(t0Var, i10, i11, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void t(a aVar, t0 t0Var, long j10, float f10, zd.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = u0.f23299a;
            }
            aVar.s(t0Var, j10, f11, lVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract w2.r c();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int d();

        public final void e(t0 t0Var, int i10, int i11, float f10) {
            long jA = w2.o.a(i10, i11);
            long j10 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(jA) + w2.n.j(j10), w2.n.k(jA) + w2.n.k(j10)), f10, null);
        }

        public final void g(t0 t0Var, long j10, float f10) {
            long j11 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(j10) + w2.n.j(j11), w2.n.k(j10) + w2.n.k(j11)), f10, null);
        }

        public final void i(t0 t0Var, int i10, int i11, float f10) {
            long jA = w2.o.a(i10, i11);
            if (c() != w2.r.Ltr && d() != 0) {
                jA = w2.o.a((d() - t0Var.q0()) - w2.n.j(jA), w2.n.k(jA));
            }
            long j10 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(jA) + w2.n.j(j10), w2.n.k(jA) + w2.n.k(j10)), f10, null);
        }

        public final void k(t0 t0Var, long j10, float f10) {
            if (c() != w2.r.Ltr && d() != 0) {
                j10 = w2.o.a((d() - t0Var.q0()) - w2.n.j(j10), w2.n.k(j10));
            }
            long j11 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(j10) + w2.n.j(j11), w2.n.k(j10) + w2.n.k(j11)), f10, null);
        }

        public final void m(t0 t0Var, int i10, int i11, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            long jA = w2.o.a(i10, i11);
            if (c() != w2.r.Ltr && d() != 0) {
                jA = w2.o.a((d() - t0Var.q0()) - w2.n.j(jA), w2.n.k(jA));
            }
            long j10 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(jA) + w2.n.j(j10), w2.n.k(jA) + w2.n.k(j10)), f10, lVar);
        }

        public final void o(t0 t0Var, long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            if (c() != w2.r.Ltr && d() != 0) {
                j10 = w2.o.a((d() - t0Var.q0()) - w2.n.j(j10), w2.n.k(j10));
            }
            long j11 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(j10) + w2.n.j(j11), w2.n.k(j10) + w2.n.k(j11)), f10, lVar);
        }

        public final void q(t0 t0Var, int i10, int i11, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            long jA = w2.o.a(i10, i11);
            long j10 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(jA) + w2.n.j(j10), w2.n.k(jA) + w2.n.k(j10)), f10, lVar);
        }

        public final void s(t0 t0Var, long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar) {
            long j11 = t0Var.f23297e;
            t0Var.v0(w2.o.a(w2.n.j(j10) + w2.n.j(j11), w2.n.k(j10) + w2.n.k(j11)), f10, lVar);
        }
    }

    private final void u0() {
        this.f23293a = ge.o.l(w2.p.g(this.f23295c), w2.b.p(this.f23296d), w2.b.n(this.f23296d));
        this.f23294b = ge.o.l(w2.p.f(this.f23295c), w2.b.o(this.f23296d), w2.b.m(this.f23296d));
        this.f23297e = w2.o.a((this.f23293a - w2.p.g(this.f23295c)) / 2, (this.f23294b - w2.p.f(this.f23295c)) / 2);
    }

    protected final long c0() {
        return this.f23297e;
    }

    public final int d0() {
        return this.f23294b;
    }

    public int g0() {
        return w2.p.f(this.f23295c);
    }

    protected final long i0() {
        return this.f23295c;
    }

    public int k0() {
        return w2.p.g(this.f23295c);
    }

    protected final long o0() {
        return this.f23296d;
    }

    public final int q0() {
        return this.f23293a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void v0(long j10, float f10, zd.l<? super androidx.compose.ui.graphics.d, md.i0> lVar);

    protected final void w0(long j10) {
        if (w2.p.e(this.f23295c, j10)) {
            return;
        }
        this.f23295c = j10;
        u0();
    }

    protected final void x0(long j10) {
        if (w2.b.g(this.f23296d, j10)) {
            return;
        }
        this.f23296d = j10;
        u0();
    }
}
