package a2;

import androidx.compose.ui.e;
import n1.a;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements n1.f, n1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n1.a f148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f149b;

    public h0(n1.a aVar) {
        this.f148a = aVar;
    }

    public /* synthetic */ h0(n1.a aVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new n1.a() : aVar);
    }

    @Override // w2.d
    public float G0(float f10) {
        return this.f148a.G0(f10);
    }

    @Override // n1.f
    public n1.d M0() {
        return this.f148a.M0();
    }

    @Override // w2.d
    public long N(long j10) {
        return this.f148a.N(j10);
    }

    @Override // w2.l
    public float Q(long j10) {
        return this.f148a.Q(j10);
    }

    @Override // n1.f
    public void R(l1.z zVar, long j10, long j11, float f10, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.R(zVar, j10, j11, f10, gVar, k0Var, i10);
    }

    @Override // n1.f
    public void T0(long j10, long j11, long j12, long j13, n1.g gVar, float f10, l1.k0 k0Var, int i10) {
        this.f148a.T0(j10, j11, j12, j13, gVar, f10, k0Var, i10);
    }

    @Override // n1.f
    public void X(l1.f1 f1Var, long j10, float f10, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.X(f1Var, j10, f10, gVar, k0Var, i10);
    }

    @Override // w2.d
    public int a1(float f10) {
        return this.f148a.a1(f10);
    }

    @Override // n1.f
    public void b0(long j10, long j11, long j12, float f10, int i10, l1.g1 g1Var, float f11, l1.k0 k0Var, int i11) {
        this.f148a.b0(j10, j11, j12, f10, i10, g1Var, f11, k0Var, i11);
    }

    @Override // n1.f
    public long c() {
        return this.f148a.c();
    }

    public final void d(l1.b0 b0Var, long j10, u0 u0Var, e.c cVar) {
        int iA = w0.a(4);
        v0.d dVar = null;
        while (cVar != null) {
            if (cVar instanceof q) {
                f(b0Var, j10, u0Var, (q) cVar);
            } else if (((cVar.C1() & iA) != 0) && (cVar instanceof l)) {
                int i10 = 0;
                for (e.c cVarB2 = ((l) cVar).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                    if ((cVarB2.C1() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            cVar = cVarB2;
                        } else {
                            if (dVar == null) {
                                dVar = new v0.d(new e.c[16], 0);
                            }
                            if (cVar != null) {
                                dVar.b(cVar);
                                cVar = null;
                            }
                            dVar.b(cVarB2);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            cVar = k.g(dVar);
        }
    }

    public final void f(l1.b0 b0Var, long j10, u0 u0Var, q qVar) {
        q qVar2 = this.f149b;
        this.f149b = qVar;
        n1.a aVar = this.f148a;
        w2.r layoutDirection = u0Var.getLayoutDirection();
        a.C0358a c0358aR = aVar.r();
        w2.d dVarA = c0358aR.a();
        w2.r rVarB = c0358aR.b();
        l1.b0 b0VarC = c0358aR.c();
        long jD = c0358aR.d();
        a.C0358a c0358aR2 = aVar.r();
        c0358aR2.j(u0Var);
        c0358aR2.k(layoutDirection);
        c0358aR2.i(b0Var);
        c0358aR2.l(j10);
        b0Var.h();
        qVar.A(this);
        b0Var.p();
        a.C0358a c0358aR3 = aVar.r();
        c0358aR3.j(dVarA);
        c0358aR3.k(rVarB);
        c0358aR3.i(b0VarC);
        c0358aR3.l(jD);
        this.f149b = qVar2;
    }

    @Override // n1.f
    public void f0(l1.v0 v0Var, long j10, long j11, long j12, long j13, float f10, n1.g gVar, l1.k0 k0Var, int i10, int i11) {
        this.f148a.f0(v0Var, j10, j11, j12, j13, f10, gVar, k0Var, i10, i11);
    }

    @Override // n1.f
    public void f1(l1.f1 f1Var, l1.z zVar, float f10, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.f1(f1Var, zVar, f10, gVar, k0Var, i10);
    }

    @Override // w2.l
    public long g(float f10) {
        return this.f148a.g(f10);
    }

    @Override // w2.d
    public float getDensity() {
        return this.f148a.getDensity();
    }

    @Override // n1.f
    public w2.r getLayoutDirection() {
        return this.f148a.getLayoutDirection();
    }

    @Override // n1.f
    public long h1() {
        return this.f148a.h1();
    }

    public final void j(q qVar, l1.b0 b0Var) {
        u0 u0VarH = k.h(qVar, w0.a(4));
        u0VarH.Y1().Z().f(b0Var, w2.q.c(u0VarH.a()), u0VarH, qVar);
    }

    @Override // n1.f
    public void j1(long j10, float f10, long j11, float f11, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.j1(j10, f10, j11, f11, gVar, k0Var, i10);
    }

    @Override // n1.f
    public void k1(long j10, long j11, long j12, float f10, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.k1(j10, j11, j12, f10, gVar, k0Var, i10);
    }

    @Override // w2.d
    public float l0(int i10) {
        return this.f148a.l0(i10);
    }

    @Override // w2.d
    public float n0(float f10) {
        return this.f148a.n0(f10);
    }

    @Override // w2.d
    public float o1(long j10) {
        return this.f148a.o1(j10);
    }

    @Override // n1.f
    public void p0(l1.z zVar, long j10, long j11, long j12, float f10, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.p0(zVar, j10, j11, j12, f10, gVar, k0Var, i10);
    }

    @Override // w2.d
    public long q(float f10) {
        return this.f148a.q(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // n1.c
    public void u1() {
        l1.b0 b0VarD = M0().d();
        q qVar = this.f149b;
        ae.r.c(qVar);
        e.c cVarB = i0.b(qVar);
        if (cVarB == 0) {
            u0 u0VarH = k.h(qVar, w0.a(4));
            if (u0VarH.d2() == qVar.L0()) {
                u0VarH = u0VarH.e2();
                ae.r.c(u0VarH);
            }
            u0VarH.z2(b0VarD);
            return;
        }
        int iA = w0.a(4);
        v0.d dVar = null;
        while (cVarB != 0) {
            if (cVarB instanceof q) {
                j((q) cVarB, b0VarD);
            } else {
                if (((cVarB.C1() & iA) != 0) && (cVarB instanceof l)) {
                    e.c cVarB2 = ((l) cVarB).b2();
                    int i10 = 0;
                    cVarB = cVarB;
                    while (cVarB2 != null) {
                        if ((cVarB2.C1() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVarB = cVarB2;
                            } else {
                                if (dVar == null) {
                                    dVar = new v0.d(new e.c[16], 0);
                                }
                                if (cVarB != 0) {
                                    dVar.b(cVarB);
                                    cVarB = 0;
                                }
                                dVar.b(cVarB2);
                            }
                        }
                        cVarB2 = cVarB2.y1();
                        cVarB = cVarB;
                    }
                    if (i10 == 1) {
                    }
                }
            }
            cVarB = k.g(dVar);
        }
    }

    @Override // n1.f
    public void v1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, n1.g gVar, l1.k0 k0Var, int i10) {
        this.f148a.v1(j10, f10, f11, z10, j11, j12, f12, gVar, k0Var, i10);
    }

    @Override // w2.d
    public long w(long j10) {
        return this.f148a.w(j10);
    }

    @Override // w2.l
    public float y0() {
        return this.f148a.y0();
    }
}
