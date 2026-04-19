package c0;

import c0.q;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class h<T, V extends q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1<T, V> f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f6062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.a<md.i0> f6064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.k1 f6065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private V f6066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6068h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t0.k1 f6069i;

    public h(T t10, j1<T, V> j1Var, V v10, long j10, T t11, long j11, boolean z10, zd.a<md.i0> aVar) {
        this.f6061a = j1Var;
        this.f6062b = t11;
        this.f6063c = j11;
        this.f6064d = aVar;
        this.f6065e = k3.e(t10, null, 2, null);
        this.f6066f = (V) r.e(v10);
        this.f6067g = j10;
        this.f6069i = k3.e(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        k(false);
        this.f6064d.invoke();
    }

    public final long b() {
        return this.f6068h;
    }

    public final long c() {
        return this.f6067g;
    }

    public final long d() {
        return this.f6063c;
    }

    public final T e() {
        return this.f6065e.getValue();
    }

    public final T f() {
        return this.f6061a.b().invoke(this.f6066f);
    }

    public final V g() {
        return this.f6066f;
    }

    public final boolean h() {
        return ((Boolean) this.f6069i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f6068h = j10;
    }

    public final void j(long j10) {
        this.f6067g = j10;
    }

    public final void k(boolean z10) {
        this.f6069i.setValue(Boolean.valueOf(z10));
    }

    public final void l(T t10) {
        this.f6065e.setValue(t10);
    }

    public final void m(V v10) {
        this.f6066f = v10;
    }
}
