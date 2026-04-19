package l1;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {
    static /* synthetic */ void j(b0 b0Var, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = i0.f14518a.b();
        }
        b0Var.b(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void m(b0 b0Var, f1 f1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = i0.f14518a.b();
        }
        b0Var.a(f1Var, i10);
    }

    static /* synthetic */ void r(b0 b0Var, k1.h hVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = i0.f14518a.b();
        }
        b0Var.e(hVar, i10);
    }

    void a(f1 f1Var, int i10);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(float f10, float f11);

    default void e(k1.h hVar, int i10) {
        b(hVar.f(), hVar.i(), hVar.g(), hVar.c(), i10);
    }

    void f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, d1 d1Var);

    default void g(k1.h hVar, d1 d1Var) {
        u(hVar.f(), hVar.i(), hVar.g(), hVar.c(), d1Var);
    }

    void h();

    void i();

    void k(v0 v0Var, long j10, long j11, long j12, long j13, d1 d1Var);

    void l(float[] fArr);

    void n(k1.h hVar, d1 d1Var);

    void o(f1 f1Var, d1 d1Var);

    void p();

    void q(long j10, long j11, d1 d1Var);

    void s(float f10, float f11, float f12, float f13, float f14, float f15, d1 d1Var);

    void t();

    void u(float f10, float f11, float f12, float f13, d1 d1Var);

    void v(long j10, float f10, d1 d1Var);
}
