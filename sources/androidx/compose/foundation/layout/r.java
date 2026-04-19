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
final class r extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2571o;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2572a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f2572a, 0, 0, 0.0f, 4, null);
        }
    }

    private r(float f10, float f11) {
        this.f2570n = f10;
        this.f2571o = f11;
    }

    public /* synthetic */ r(float f10, float f11, ae.j jVar) {
        this(f10, f11);
    }

    public final void a2(float f10) {
        this.f2571o = f10;
    }

    public final void b2(float f10) {
        this.f2570n = f10;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        float f10 = this.f2570n;
        h.a aVar = w2.h.f22405b;
        t0 t0VarI = d0Var.I(w2.c.a((w2.h.o(f10, aVar.c()) || w2.b.p(j10) != 0) ? w2.b.p(j10) : ge.o.d(ge.o.h(g0Var.a1(this.f2570n), w2.b.n(j10)), 0), w2.b.n(j10), (w2.h.o(this.f2571o, aVar.c()) || w2.b.o(j10) != 0) ? w2.b.o(j10) : ge.o.d(ge.o.h(g0Var.a1(this.f2571o), w2.b.m(j10)), 0), w2.b.m(j10)));
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        return ge.o.d(mVar.W(i10), !w2.h.o(this.f2571o, w2.h.f22405b.c()) ? nVar.a1(this.f2571o) : 0);
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        return ge.o.d(mVar.B(i10), !w2.h.o(this.f2570n, w2.h.f22405b.c()) ? nVar.a1(this.f2570n) : 0);
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        return ge.o.d(mVar.E(i10), !w2.h.o(this.f2570n, w2.h.f22405b.c()) ? nVar.a1(this.f2570n) : 0);
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        return ge.o.d(mVar.k(i10), !w2.h.o(this.f2571o, w2.h.f22405b.c()) ? nVar.a1(this.f2571o) : 0);
    }
}
