package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import com.google.android.gms.common.api.a;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class s extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h0.m f2573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private zd.p<? super w2.p, ? super w2.r, w2.n> f2575p;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f2578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0 f2580e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, t0 t0Var, int i11, g0 g0Var) {
            super(1);
            this.f2577b = i10;
            this.f2578c = t0Var;
            this.f2579d = i11;
            this.f2580e = g0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.h(aVar, this.f2578c, s.this.a2().invoke(w2.p.b(w2.q.a(this.f2577b - this.f2578c.q0(), this.f2579d - this.f2578c.d0())), this.f2580e.getLayoutDirection()).n(), 0.0f, 2, null);
        }
    }

    public s(h0.m mVar, boolean z10, zd.p<? super w2.p, ? super w2.r, w2.n> pVar) {
        this.f2573n = mVar;
        this.f2574o = z10;
        this.f2575p = pVar;
    }

    public final zd.p<w2.p, w2.r, w2.n> a2() {
        return this.f2575p;
    }

    public final void b2(zd.p<? super w2.p, ? super w2.r, w2.n> pVar) {
        this.f2575p = pVar;
    }

    public final void c2(h0.m mVar) {
        this.f2573n = mVar;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        h0.m mVar = this.f2573n;
        h0.m mVar2 = h0.m.Vertical;
        int iP = mVar != mVar2 ? 0 : w2.b.p(j10);
        h0.m mVar3 = this.f2573n;
        h0.m mVar4 = h0.m.Horizontal;
        int iO = mVar3 == mVar4 ? w2.b.o(j10) : 0;
        h0.m mVar5 = this.f2573n;
        int iM = a.e.API_PRIORITY_OTHER;
        int iN = (mVar5 == mVar2 || !this.f2574o) ? w2.b.n(j10) : Integer.MAX_VALUE;
        if (this.f2573n == mVar4 || !this.f2574o) {
            iM = w2.b.m(j10);
        }
        t0 t0VarI = d0Var.I(w2.c.a(iP, iN, iO, iM));
        int iL = ge.o.l(t0VarI.q0(), w2.b.p(j10), w2.b.n(j10));
        int iL2 = ge.o.l(t0VarI.d0(), w2.b.o(j10), w2.b.m(j10));
        return g0.z0(g0Var, iL, iL2, null, new a(iL, t0VarI, iL2, g0Var), 4, null);
    }

    public final void d2(boolean z10) {
        this.f2574o = z10;
    }
}
