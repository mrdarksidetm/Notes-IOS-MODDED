package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import h0.y;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class o extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f2535n;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f2537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f2538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var, g0 g0Var, o oVar) {
            super(1);
            this.f2536a = t0Var;
            this.f2537b = g0Var;
            this.f2538c = oVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f2536a, this.f2537b.a1(this.f2538c.a2().d(this.f2537b.getLayoutDirection())), this.f2537b.a1(this.f2538c.a2().c()), 0.0f, 4, null);
        }
    }

    public o(y yVar) {
        this.f2535n = yVar;
    }

    public final y a2() {
        return this.f2535n;
    }

    public final void b2(y yVar) {
        this.f2535n = yVar;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        boolean z10 = false;
        float f10 = 0;
        if (w2.h.l(this.f2535n.d(g0Var.getLayoutDirection()), w2.h.m(f10)) >= 0 && w2.h.l(this.f2535n.c(), w2.h.m(f10)) >= 0 && w2.h.l(this.f2535n.b(g0Var.getLayoutDirection()), w2.h.m(f10)) >= 0 && w2.h.l(this.f2535n.a(), w2.h.m(f10)) >= 0) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iA1 = g0Var.a1(this.f2535n.d(g0Var.getLayoutDirection())) + g0Var.a1(this.f2535n.b(g0Var.getLayoutDirection()));
        int iA12 = g0Var.a1(this.f2535n.c()) + g0Var.a1(this.f2535n.a());
        t0 t0VarI = d0Var.I(w2.c.i(j10, -iA1, -iA12));
        return g0.z0(g0Var, w2.c.g(j10, t0VarI.q0() + iA1), w2.c.f(j10, t0VarI.d0() + iA12), null, new a(t0VarI, g0Var, this), 4, null);
    }
}
