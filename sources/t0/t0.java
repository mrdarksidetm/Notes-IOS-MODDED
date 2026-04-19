package t0;

/* JADX INFO: loaded from: classes.dex */
final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v0.b<Object> f20974c;

    public t0(d2 d2Var, int i10, v0.b<Object> bVar) {
        this.f20972a = d2Var;
        this.f20973b = i10;
        this.f20974c = bVar;
    }

    public final v0.b<Object> a() {
        return this.f20974c;
    }

    public final int b() {
        return this.f20973b;
    }

    public final d2 c() {
        return this.f20972a;
    }

    public final boolean d() {
        return this.f20972a.v(this.f20974c);
    }

    public final void e(v0.b<Object> bVar) {
        this.f20974c = bVar;
    }
}
