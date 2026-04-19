package n1;

import k1.l;
import k1.m;
import l1.f1;
import l1.g1;
import l1.k0;
import l1.s0;
import l1.v;
import l1.v0;
import l1.z;
import w2.n;
import w2.q;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public interface f extends w2.d {
    public static final a S = a.f15733a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15733a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15734b = v.f14592a.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15735c = s0.f14565a.a();

        private a() {
        }

        public final int a() {
            return f15734b;
        }

        public final int b() {
            return f15735c;
        }
    }

    static /* synthetic */ void D(f fVar, long j10, long j11, long j12, float f10, int i10, g1 g1Var, float f11, k0 k0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fVar.b0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? k.f15737f.a() : i10, (i12 & 32) != 0 ? null : g1Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : k0Var, (i12 & 256) != 0 ? S.a() : i11);
    }

    static /* synthetic */ void H0(f fVar, z zVar, long j10, long j11, float f10, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i11 & 2) != 0 ? k1.f.f14338b.c() : j10;
        fVar.R(zVar, jC, (i11 & 4) != 0 ? fVar.s0(fVar.c(), jC) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f15736a : gVar, (i11 & 32) != 0 ? null : k0Var, (i11 & 64) != 0 ? S.a() : i10);
    }

    static /* synthetic */ void Y0(f fVar, v0 v0Var, long j10, long j11, long j12, long j13, float f10, g gVar, k0 k0Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i12 & 2) != 0 ? n.f22418b.a() : j10;
        long jA2 = (i12 & 4) != 0 ? q.a(v0Var.getWidth(), v0Var.getHeight()) : j11;
        fVar.f0(v0Var, jA, jA2, (i12 & 8) != 0 ? n.f22418b.a() : j12, (i12 & 16) != 0 ? jA2 : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? j.f15736a : gVar, (i12 & 128) != 0 ? null : k0Var, (i12 & 256) != 0 ? S.a() : i10, (i12 & 512) != 0 ? S.b() : i11);
    }

    static /* synthetic */ void e0(f fVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i11 & 16) != 0 ? k1.f.f14338b.c() : j11;
        fVar.v1(j10, f10, f11, z10, jC, (i11 & 32) != 0 ? fVar.s0(fVar.c(), jC) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? j.f15736a : gVar, (i11 & 256) != 0 ? null : k0Var, (i11 & 512) != 0 ? S.a() : i10);
    }

    static /* synthetic */ void h0(f fVar, f1 f1Var, z zVar, float f10, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = j.f15736a;
        }
        g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            k0Var = null;
        }
        k0 k0Var2 = k0Var;
        if ((i11 & 32) != 0) {
            i10 = S.a();
        }
        fVar.f1(f1Var, zVar, f11, gVar2, k0Var2, i10);
    }

    static /* synthetic */ void l1(f fVar, z zVar, long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i11 & 2) != 0 ? k1.f.f14338b.c() : j10;
        fVar.p0(zVar, jC, (i11 & 4) != 0 ? fVar.s0(fVar.c(), jC) : j11, (i11 & 8) != 0 ? k1.a.f14332a.a() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? j.f15736a : gVar, (i11 & 64) != 0 ? null : k0Var, (i11 & 128) != 0 ? S.a() : i10);
    }

    static /* synthetic */ void r0(f fVar, long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i11 & 2) != 0 ? k1.f.f14338b.c() : j11;
        fVar.k1(j10, jC, (i11 & 4) != 0 ? fVar.s0(fVar.c(), jC) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? j.f15736a : gVar, (i11 & 32) != 0 ? null : k0Var, (i11 & 64) != 0 ? S.a() : i10);
    }

    private default long s0(long j10, long j11) {
        return m.a(l.i(j10) - k1.f.o(j11), l.g(j10) - k1.f.p(j11));
    }

    static /* synthetic */ void s1(f fVar, long j10, float f10, long j11, float f11, g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        fVar.j1(j10, (i11 & 2) != 0 ? l.h(fVar.c()) / 2.0f : f10, (i11 & 4) != 0 ? fVar.h1() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? j.f15736a : gVar, (i11 & 32) != 0 ? null : k0Var, (i11 & 64) != 0 ? S.a() : i10);
    }

    d M0();

    void R(z zVar, long j10, long j11, float f10, g gVar, k0 k0Var, int i10);

    void T0(long j10, long j11, long j12, long j13, g gVar, float f10, k0 k0Var, int i10);

    void X(f1 f1Var, long j10, float f10, g gVar, k0 k0Var, int i10);

    void b0(long j10, long j11, long j12, float f10, int i10, g1 g1Var, float f11, k0 k0Var, int i11);

    default long c() {
        return M0().c();
    }

    default void f0(v0 v0Var, long j10, long j11, long j12, long j13, float f10, g gVar, k0 k0Var, int i10, int i11) {
        Y0(this, v0Var, j10, j11, j12, j13, f10, gVar, k0Var, i10, 0, 512, null);
    }

    void f1(f1 f1Var, z zVar, float f10, g gVar, k0 k0Var, int i10);

    r getLayoutDirection();

    default long h1() {
        return m.b(M0().c());
    }

    void j1(long j10, float f10, long j11, float f11, g gVar, k0 k0Var, int i10);

    void k1(long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10);

    void p0(z zVar, long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10);

    void v1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, k0 k0Var, int i10);
}
