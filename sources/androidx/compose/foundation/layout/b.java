package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import w2.p;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2476o;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2477a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f2477a, 0, 0, 0.0f, 4, null);
        }
    }

    public b(float f10, boolean z10) {
        this.f2475n = f10;
        this.f2476o = z10;
    }

    private final long a2(long j10) {
        if (this.f2476o) {
            long jE2 = e2(this, j10, false, 1, null);
            p.a aVar = w2.p.f22421b;
            if (!w2.p.e(jE2, aVar.a())) {
                return jE2;
            }
            long jG2 = g2(this, j10, false, 1, null);
            if (!w2.p.e(jG2, aVar.a())) {
                return jG2;
            }
            long jI2 = i2(this, j10, false, 1, null);
            if (!w2.p.e(jI2, aVar.a())) {
                return jI2;
            }
            long jK2 = k2(this, j10, false, 1, null);
            if (!w2.p.e(jK2, aVar.a())) {
                return jK2;
            }
            long jD2 = d2(j10, false);
            if (!w2.p.e(jD2, aVar.a())) {
                return jD2;
            }
            long jF2 = f2(j10, false);
            if (!w2.p.e(jF2, aVar.a())) {
                return jF2;
            }
            long jH2 = h2(j10, false);
            if (!w2.p.e(jH2, aVar.a())) {
                return jH2;
            }
            long jJ2 = j2(j10, false);
            if (!w2.p.e(jJ2, aVar.a())) {
                return jJ2;
            }
        } else {
            long jG22 = g2(this, j10, false, 1, null);
            p.a aVar2 = w2.p.f22421b;
            if (!w2.p.e(jG22, aVar2.a())) {
                return jG22;
            }
            long jE22 = e2(this, j10, false, 1, null);
            if (!w2.p.e(jE22, aVar2.a())) {
                return jE22;
            }
            long jK22 = k2(this, j10, false, 1, null);
            if (!w2.p.e(jK22, aVar2.a())) {
                return jK22;
            }
            long jI22 = i2(this, j10, false, 1, null);
            if (!w2.p.e(jI22, aVar2.a())) {
                return jI22;
            }
            long jF22 = f2(j10, false);
            if (!w2.p.e(jF22, aVar2.a())) {
                return jF22;
            }
            long jD22 = d2(j10, false);
            if (!w2.p.e(jD22, aVar2.a())) {
                return jD22;
            }
            long jJ22 = j2(j10, false);
            if (!w2.p.e(jJ22, aVar2.a())) {
                return jJ22;
            }
            long jH22 = h2(j10, false);
            if (!w2.p.e(jH22, aVar2.a())) {
                return jH22;
            }
        }
        return w2.p.f22421b.a();
    }

    private final long d2(long j10, boolean z10) {
        int iD;
        int iM = w2.b.m(j10);
        if (iM != Integer.MAX_VALUE && (iD = ce.c.d(iM * this.f2475n)) > 0) {
            long jA = w2.q.a(iD, iM);
            if (!z10 || w2.c.h(j10, jA)) {
                return jA;
            }
        }
        return w2.p.f22421b.a();
    }

    static /* synthetic */ long e2(b bVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return bVar.d2(j10, z10);
    }

    private final long f2(long j10, boolean z10) {
        int iD;
        int iN = w2.b.n(j10);
        if (iN != Integer.MAX_VALUE && (iD = ce.c.d(iN / this.f2475n)) > 0) {
            long jA = w2.q.a(iN, iD);
            if (!z10 || w2.c.h(j10, jA)) {
                return jA;
            }
        }
        return w2.p.f22421b.a();
    }

    static /* synthetic */ long g2(b bVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return bVar.f2(j10, z10);
    }

    private final long h2(long j10, boolean z10) {
        int iO = w2.b.o(j10);
        int iD = ce.c.d(iO * this.f2475n);
        if (iD > 0) {
            long jA = w2.q.a(iD, iO);
            if (!z10 || w2.c.h(j10, jA)) {
                return jA;
            }
        }
        return w2.p.f22421b.a();
    }

    static /* synthetic */ long i2(b bVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return bVar.h2(j10, z10);
    }

    private final long j2(long j10, boolean z10) {
        int iP = w2.b.p(j10);
        int iD = ce.c.d(iP / this.f2475n);
        if (iD > 0) {
            long jA = w2.q.a(iP, iD);
            if (!z10 || w2.c.h(j10, jA)) {
                return jA;
            }
        }
        return w2.p.f22421b.a();
    }

    static /* synthetic */ long k2(b bVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return bVar.j2(j10, z10);
    }

    public final void b2(float f10) {
        this.f2475n = f10;
    }

    public final void c2(boolean z10) {
        this.f2476o = z10;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        long jA2 = a2(j10);
        if (!w2.p.e(jA2, w2.p.f22421b.a())) {
            j10 = w2.b.f22395b.c(w2.p.g(jA2), w2.p.f(jA2));
        }
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        return i10 != Integer.MAX_VALUE ? ce.c.d(i10 / this.f2475n) : mVar.W(i10);
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        return i10 != Integer.MAX_VALUE ? ce.c.d(i10 * this.f2475n) : mVar.B(i10);
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        return i10 != Integer.MAX_VALUE ? ce.c.d(i10 * this.f2475n) : mVar.E(i10);
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        return i10 != Integer.MAX_VALUE ? ce.c.d(i10 / this.f2475n) : mVar.k(i10);
    }
}
