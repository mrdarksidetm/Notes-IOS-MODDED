package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class w<T, V extends q> implements d<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1<V> f6230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1<T, V> f6231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f6232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V f6233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V f6234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V f6235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T f6236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f6237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6238i;

    public w(o1<V> o1Var, j1<T, V> j1Var, T t10, V v10) {
        this.f6230a = o1Var;
        this.f6231b = j1Var;
        this.f6232c = t10;
        V vInvoke = c().a().invoke(t10);
        this.f6233d = vInvoke;
        this.f6234e = (V) r.e(v10);
        this.f6236g = (T) c().b().invoke(o1Var.c(vInvoke, v10));
        this.f6237h = o1Var.e(vInvoke, v10);
        V v11 = (V) r.e(o1Var.d(b(), vInvoke, v10));
        this.f6235f = v11;
        int iB = v11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v12 = this.f6235f;
            v12.e(i10, ge.o.k(v12.a(i10), -this.f6230a.a(), this.f6230a.a()));
        }
    }

    public w(x<T> xVar, j1<T, V> j1Var, T t10, V v10) {
        this(xVar.a(j1Var), j1Var, t10, v10);
    }

    @Override // c0.d
    public boolean a() {
        return this.f6238i;
    }

    @Override // c0.d
    public long b() {
        return this.f6237h;
    }

    @Override // c0.d
    public j1<T, V> c() {
        return this.f6231b;
    }

    @Override // c0.d
    public V d(long j10) {
        return !e(j10) ? (V) this.f6230a.d(j10, this.f6233d, this.f6234e) : this.f6235f;
    }

    @Override // c0.d
    public T f(long j10) {
        return !e(j10) ? (T) c().b().invoke(this.f6230a.b(j10, this.f6233d, this.f6234e)) : g();
    }

    @Override // c0.d
    public T g() {
        return this.f6236g;
    }
}
