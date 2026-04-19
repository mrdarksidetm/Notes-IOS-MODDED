package q0;

import androidx.compose.ui.e;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e.c implements a2.h, a2.a0 {

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f18418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, t0 t0Var, int i11) {
            super(1);
            this.f18417a = i10;
            this.f18418b = t0Var;
            this.f18419c = i11;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f18418b, ce.c.d((this.f18417a - this.f18418b.q0()) / 2.0f), ce.c.d((this.f18419c - this.f18418b.d0()) / 2.0f), 0.0f, 4, null);
        }
    }

    @Override // a2.a0
    public y1.f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        long j11 = w.f18925c;
        t0 t0VarI = d0Var.I(j10);
        boolean z10 = H1() && ((Boolean) a2.i.a(this, w.b())).booleanValue();
        int iQ0 = t0VarI.q0();
        if (z10) {
            iQ0 = Math.max(iQ0, g0Var.a1(w2.k.e(j11)));
        }
        int i10 = iQ0;
        int iMax = z10 ? Math.max(t0VarI.d0(), g0Var.a1(w2.k.d(j11))) : t0VarI.d0();
        return y1.g0.z0(g0Var, i10, iMax, null, new a(i10, t0VarI, iMax), 4, null);
    }
}
