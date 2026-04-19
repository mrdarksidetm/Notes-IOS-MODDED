package t0;

/* JADX INFO: loaded from: classes.dex */
final class h0 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<j0, i0> f20778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f20779b;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(zd.l<? super j0, ? extends i0> lVar) {
        this.f20778a = lVar;
    }

    @Override // t0.k2
    public void b() {
    }

    @Override // t0.k2
    public void c() {
        i0 i0Var = this.f20779b;
        if (i0Var != null) {
            i0Var.dispose();
        }
        this.f20779b = null;
    }

    @Override // t0.k2
    public void d() {
        this.f20779b = this.f20778a.invoke(l0.f20816a);
    }
}
