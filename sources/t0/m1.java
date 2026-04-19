package t0;

/* JADX INFO: loaded from: classes.dex */
public final class m1<N> implements e<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<N> f20865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20867c;

    public m1(e<N> eVar, int i10) {
        this.f20865a = eVar;
        this.f20866b = i10;
    }

    @Override // t0.e
    public void a(int i10, int i11) {
        this.f20865a.a(i10 + (this.f20867c == 0 ? this.f20866b : 0), i11);
    }

    @Override // t0.e
    public N b() {
        return this.f20865a.b();
    }

    @Override // t0.e
    public void c(int i10, N n10) {
        this.f20865a.c(i10 + (this.f20867c == 0 ? this.f20866b : 0), n10);
    }

    @Override // t0.e
    public void clear() {
        o.u("Clear is not valid on OffsetApplier".toString());
        throw new md.i();
    }

    @Override // t0.e
    public void d(N n10) {
        this.f20867c++;
        this.f20865a.d(n10);
    }

    @Override // t0.e
    public void f(int i10, int i11, int i12) {
        int i13 = this.f20867c == 0 ? this.f20866b : 0;
        this.f20865a.f(i10 + i13, i11 + i13, i12);
    }

    @Override // t0.e
    public void g() {
        int i10 = this.f20867c;
        if (!(i10 > 0)) {
            o.u("OffsetApplier up called with no corresponding down".toString());
            throw new md.i();
        }
        this.f20867c = i10 - 1;
        this.f20865a.g();
    }

    @Override // t0.e
    public void h(int i10, N n10) {
        this.f20865a.h(i10 + (this.f20867c == 0 ? this.f20866b : 0), n10);
    }
}
