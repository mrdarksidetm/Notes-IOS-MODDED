package c0;

/* JADX INFO: loaded from: classes.dex */
public final class k0<T> implements i<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6089d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0<T> f6090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f6091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6092c;

    private k0(a0<T> a0Var, w0 w0Var, long j10) {
        this.f6090a = a0Var;
        this.f6091b = w0Var;
        this.f6092c = j10;
    }

    public /* synthetic */ k0(a0 a0Var, w0 w0Var, long j10, ae.j jVar) {
        this(a0Var, w0Var, j10);
    }

    @Override // c0.i
    public <V extends q> m1<V> a(j1<T, V> j1Var) {
        return new t1(this.f6090a.a((j1) j1Var), this.f6091b, this.f6092c, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return ae.r.b(k0Var.f6090a, this.f6090a) && k0Var.f6091b == this.f6091b && b1.d(k0Var.f6092c, this.f6092c);
    }

    public int hashCode() {
        return (((this.f6090a.hashCode() * 31) + this.f6091b.hashCode()) * 31) + b1.e(this.f6092c);
    }
}
