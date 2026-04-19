package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public final class e1<T, V extends q> implements d<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1<V> f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1<T, V> f5989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f5990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f5991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V f5992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V f5993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V f5994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f5995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V f5996i;

    public e1(i<T> iVar, j1<T, V> j1Var, T t10, T t11, V v10) {
        this(iVar.a(j1Var), j1Var, t10, t11, v10);
    }

    public /* synthetic */ e1(i iVar, j1 j1Var, Object obj, Object obj2, q qVar, int i10, ae.j jVar) {
        this((i<Object>) iVar, (j1<Object, q>) j1Var, obj, obj2, (i10 & 16) != 0 ? null : qVar);
    }

    public e1(m1<V> m1Var, j1<T, V> j1Var, T t10, T t11, V v10) {
        this.f5988a = m1Var;
        this.f5989b = j1Var;
        this.f5990c = t10;
        this.f5991d = t11;
        V vInvoke = c().a().invoke(t10);
        this.f5992e = vInvoke;
        V vInvoke2 = c().a().invoke(g());
        this.f5993f = vInvoke2;
        V v11 = (v10 == null || (v11 = (V) r.e(v10)) == null) ? (V) r.g(c().a().invoke(t10)) : v11;
        this.f5994g = v11;
        this.f5995h = m1Var.b(vInvoke, vInvoke2, v11);
        this.f5996i = (V) m1Var.c(vInvoke, vInvoke2, v11);
    }

    @Override // c0.d
    public boolean a() {
        return this.f5988a.a();
    }

    @Override // c0.d
    public long b() {
        return this.f5995h;
    }

    @Override // c0.d
    public j1<T, V> c() {
        return this.f5989b;
    }

    @Override // c0.d
    public V d(long j10) {
        return !e(j10) ? (V) this.f5988a.g(j10, this.f5992e, this.f5993f, this.f5994g) : this.f5996i;
    }

    @Override // c0.d
    public T f(long j10) {
        if (e(j10)) {
            return g();
        }
        q qVarD = this.f5988a.d(j10, this.f5992e, this.f5993f, this.f5994g);
        int iB = qVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (!(!Float.isNaN(qVarD.a(i10)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + qVarD + ". Animation: " + this + ", playTimeNanos: " + j10).toString());
            }
        }
        return (T) c().b().invoke(qVarD);
    }

    @Override // c0.d
    public T g() {
        return this.f5991d;
    }

    public final T h() {
        return this.f5990c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f5990c + " -> " + g() + ",initial velocity: " + this.f5994g + ", duration: " + f.b(this) + " ms,animationSpec: " + this.f5988a;
    }
}
