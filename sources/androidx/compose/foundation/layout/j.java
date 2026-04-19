package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
abstract class j extends e.c implements a0 {

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2510a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2510a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.l(aVar, this.f2510a, w2.n.f22418b.a(), 0.0f, 2, null);
        }
    }

    public abstract long a2(g0 g0Var, d0 d0Var, long j10);

    public abstract boolean b2();

    @Override // a2.a0
    public final f0 d(g0 g0Var, d0 d0Var, long j10) {
        long jA2 = a2(g0Var, d0Var, j10);
        if (b2()) {
            jA2 = w2.c.e(j10, jA2);
        }
        t0 t0VarI = d0Var.I(jA2);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        return mVar.B(i10);
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        return mVar.E(i10);
    }
}
