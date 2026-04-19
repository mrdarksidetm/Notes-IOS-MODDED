package a2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f244b;

    public n(boolean z10) {
        this.f243a = new m(z10);
        this.f244b = new m(z10);
    }

    public final void c(f0 f0Var, boolean z10) {
        m mVar;
        if (z10) {
            mVar = this.f243a;
        } else if (this.f243a.b(f0Var)) {
            return;
        } else {
            mVar = this.f244b;
        }
        mVar.a(f0Var);
    }

    public final boolean d(f0 f0Var) {
        return this.f243a.b(f0Var) || this.f244b.b(f0Var);
    }

    public final boolean e(f0 f0Var, boolean z10) {
        boolean zB = this.f243a.b(f0Var);
        return z10 ? zB : zB || this.f244b.b(f0Var);
    }

    public final boolean f() {
        return this.f244b.d() && this.f243a.d();
    }

    public final boolean g(boolean z10) {
        return (z10 ? this.f243a : this.f244b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(f0 f0Var) {
        return this.f244b.f(f0Var) || this.f243a.f(f0Var);
    }
}
