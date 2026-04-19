package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class g extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h0.m f2504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2505o;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var) {
            super(1);
            this.f2506a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.j(aVar, this.f2506a, 0, 0, 0.0f, 4, null);
        }
    }

    public g(h0.m mVar, float f10) {
        this.f2504n = mVar;
        this.f2505o = f10;
    }

    public final void a2(h0.m mVar) {
        this.f2504n = mVar;
    }

    public final void b2(float f10) {
        this.f2505o = f10;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        int iP;
        int iN;
        int iM;
        int iL;
        if (!w2.b.j(j10) || this.f2504n == h0.m.Vertical) {
            iP = w2.b.p(j10);
            iN = w2.b.n(j10);
        } else {
            iP = ge.o.l(ce.c.d(w2.b.n(j10) * this.f2505o), w2.b.p(j10), w2.b.n(j10));
            iN = iP;
        }
        if (!w2.b.i(j10) || this.f2504n == h0.m.Horizontal) {
            int iO = w2.b.o(j10);
            iM = w2.b.m(j10);
            iL = iO;
        } else {
            iL = ge.o.l(ce.c.d(w2.b.m(j10) * this.f2505o), w2.b.o(j10), w2.b.m(j10));
            iM = iL;
        }
        t0 t0VarI = d0Var.I(w2.c.a(iP, iN, iL, iM));
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI), 4, null);
    }
}
