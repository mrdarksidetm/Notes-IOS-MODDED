package i0;

import y1.v0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f12066a;

    public g(h0 h0Var) {
        this.f12066a = h0Var;
    }

    @Override // j0.l
    public int c() {
        return this.f12066a.p().b();
    }

    @Override // j0.l
    public int d() {
        return ((k) nd.c0.j0(this.f12066a.p().c())).getIndex();
    }

    @Override // j0.l
    public void e() {
        v0 v0VarW = this.f12066a.w();
        if (v0VarW != null) {
            v0VarW.l();
        }
    }

    @Override // j0.l
    public boolean f() {
        return !this.f12066a.p().c().isEmpty();
    }

    @Override // j0.l
    public int g() {
        return this.f12066a.m();
    }
}
