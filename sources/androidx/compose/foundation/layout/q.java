package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import w2.h;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class q extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2568r;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2569a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f2569a, 0, 0, 0.0f, 4, null);
        }
    }

    private q(float f10, float f11, float f12, float f13, boolean z10) {
        this.f2564n = f10;
        this.f2565o = f11;
        this.f2566p = f12;
        this.f2567q = f13;
        this.f2568r = z10;
    }

    public /* synthetic */ q(float f10, float f11, float f12, float f13, boolean z10, ae.j jVar) {
        this(f10, f11, f12, f13, z10);
    }

    private final long a2(w2.d dVar) {
        int iD;
        int iD2;
        float f10 = this.f2566p;
        h.a aVar = w2.h.f22405b;
        int i10 = 0;
        int iD3 = !w2.h.o(f10, aVar.c()) ? ge.o.d(dVar.a1(this.f2566p), 0) : Integer.MAX_VALUE;
        int iD4 = !w2.h.o(this.f2567q, aVar.c()) ? ge.o.d(dVar.a1(this.f2567q), 0) : Integer.MAX_VALUE;
        if (w2.h.o(this.f2564n, aVar.c()) || (iD = ge.o.d(ge.o.h(dVar.a1(this.f2564n), iD3), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!w2.h.o(this.f2565o, aVar.c()) && (iD2 = ge.o.d(ge.o.h(dVar.a1(this.f2565o), iD4), 0)) != Integer.MAX_VALUE) {
            i10 = iD2;
        }
        return w2.c.a(iD, iD3, i10, iD4);
    }

    public final void b2(boolean z10) {
        this.f2568r = z10;
    }

    public final void c2(float f10) {
        this.f2567q = f10;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        long jA;
        long jA2 = a2(g0Var);
        if (this.f2568r) {
            jA = w2.c.e(j10, jA2);
        } else {
            float f10 = this.f2564n;
            h.a aVar = w2.h.f22405b;
            jA = w2.c.a(!w2.h.o(f10, aVar.c()) ? w2.b.p(jA2) : ge.o.h(w2.b.p(j10), w2.b.n(jA2)), !w2.h.o(this.f2566p, aVar.c()) ? w2.b.n(jA2) : ge.o.d(w2.b.n(j10), w2.b.p(jA2)), !w2.h.o(this.f2565o, aVar.c()) ? w2.b.o(jA2) : ge.o.h(w2.b.o(j10), w2.b.m(jA2)), !w2.h.o(this.f2567q, aVar.c()) ? w2.b.m(jA2) : ge.o.d(w2.b.m(j10), w2.b.o(jA2)));
        }
        t0 t0VarI = d0Var.I(jA);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    public final void d2(float f10) {
        this.f2566p = f10;
    }

    public final void e2(float f10) {
        this.f2565o = f10;
    }

    public final void f2(float f10) {
        this.f2564n = f10;
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        long jA2 = a2(nVar);
        return w2.b.k(jA2) ? w2.b.m(jA2) : w2.c.f(jA2, mVar.W(i10));
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        long jA2 = a2(nVar);
        return w2.b.l(jA2) ? w2.b.n(jA2) : w2.c.g(jA2, mVar.B(i10));
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        long jA2 = a2(nVar);
        return w2.b.l(jA2) ? w2.b.n(jA2) : w2.c.g(jA2, mVar.E(i10));
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        long jA2 = a2(nVar);
        return w2.b.k(jA2) ? w2.b.m(jA2) : w2.c.f(jA2, mVar.k(i10));
    }
}
