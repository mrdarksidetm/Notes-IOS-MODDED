package androidx.compose.foundation.layout;

import h0.u;
import y1.d0;
import y1.g0;

/* JADX INFO: loaded from: classes.dex */
final class h extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f2507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2508o;

    public h(u uVar, boolean z10) {
        this.f2507n = uVar;
        this.f2508o = z10;
    }

    @Override // androidx.compose.foundation.layout.j
    public long a2(g0 g0Var, d0 d0Var, long j10) {
        int iW = this.f2507n == u.Min ? d0Var.W(w2.b.n(j10)) : d0Var.k(w2.b.n(j10));
        if (iW < 0) {
            iW = 0;
        }
        return w2.b.f22395b.d(iW);
    }

    @Override // androidx.compose.foundation.layout.j
    public boolean b2() {
        return this.f2508o;
    }

    public void c2(boolean z10) {
        this.f2508o = z10;
    }

    public final void d2(u uVar) {
        this.f2507n = uVar;
    }

    @Override // a2.a0
    public int j(y1.n nVar, y1.m mVar, int i10) {
        return this.f2507n == u.Min ? mVar.W(i10) : mVar.k(i10);
    }

    @Override // a2.a0
    public int x(y1.n nVar, y1.m mVar, int i10) {
        return this.f2507n == u.Min ? mVar.W(i10) : mVar.k(i10);
    }
}
