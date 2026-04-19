package d0;

import androidx.compose.ui.e;
import com.google.android.gms.common.api.a;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends e.c implements a2.a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n0 f9282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9284p;

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f9287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, t0 t0Var) {
            super(1);
            this.f9286b = i10;
            this.f9287c = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            int iL = ge.o.l(o0.this.a2().m(), 0, this.f9286b);
            int i10 = o0.this.b2() ? iL - this.f9286b : -iL;
            t0.a.n(aVar, this.f9287c, o0.this.c2() ? 0 : i10, o0.this.c2() ? i10 : 0, 0.0f, null, 12, null);
        }
    }

    public o0(n0 n0Var, boolean z10, boolean z11) {
        this.f9282n = n0Var;
        this.f9283o = z10;
        this.f9284p = z11;
    }

    public final n0 a2() {
        return this.f9282n;
    }

    public final boolean b2() {
        return this.f9283o;
    }

    public final boolean c2() {
        return this.f9284p;
    }

    @Override // a2.a0
    public y1.f0 d(y1.g0 g0Var, y1.d0 d0Var, long j10) {
        l.a(j10, this.f9284p ? e0.r.Vertical : e0.r.Horizontal);
        boolean z10 = this.f9284p;
        int iN = a.e.API_PRIORITY_OTHER;
        int iM = z10 ? Integer.MAX_VALUE : w2.b.m(j10);
        if (this.f9284p) {
            iN = w2.b.n(j10);
        }
        t0 t0VarI = d0Var.I(w2.b.e(j10, 0, iN, 0, iM, 5, null));
        int iH = ge.o.h(t0VarI.q0(), w2.b.n(j10));
        int iH2 = ge.o.h(t0VarI.d0(), w2.b.m(j10));
        int iD0 = t0VarI.d0() - iH2;
        int iQ0 = t0VarI.q0() - iH;
        if (!this.f9284p) {
            iD0 = iQ0;
        }
        this.f9282n.n(iD0);
        this.f9282n.p(this.f9284p ? iH2 : iH);
        return y1.g0.z0(g0Var, iH, iH2, null, new a(iD0, t0VarI), 4, null);
    }

    public final void d2(boolean z10) {
        this.f9283o = z10;
    }

    public final void e2(n0 n0Var) {
        this.f9282n = n0Var;
    }

    public final void f2(boolean z10) {
        this.f9284p = z10;
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        return this.f9284p ? mVar.W(i10) : mVar.W(a.e.API_PRIORITY_OTHER);
    }

    @Override // a2.a0
    public int k(y1.n nVar, y1.m mVar, int i10) {
        return this.f9284p ? mVar.B(a.e.API_PRIORITY_OTHER) : mVar.B(i10);
    }

    @Override // a2.a0
    public int v(y1.n nVar, y1.m mVar, int i10) {
        return this.f9284p ? mVar.E(a.e.API_PRIORITY_OTHER) : mVar.E(i10);
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        return this.f9284p ? mVar.k(i10) : mVar.k(a.e.API_PRIORITY_OTHER);
    }
}
