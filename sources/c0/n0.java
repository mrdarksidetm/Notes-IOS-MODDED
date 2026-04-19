package c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f6166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f6167b;

    private n0(T t10, b0 b0Var) {
        this.f6166a = t10;
        this.f6167b = b0Var;
    }

    public /* synthetic */ n0(Object obj, b0 b0Var, ae.j jVar) {
        this(obj, b0Var);
    }

    public final b0 a() {
        return this.f6167b;
    }

    public final T b() {
        return this.f6166a;
    }

    public final void c(b0 b0Var) {
        this.f6167b = b0Var;
    }

    public final <V extends q> md.s<V, b0> d(zd.l<? super T, ? extends V> lVar) {
        return md.x.a(lVar.invoke(this.f6166a), this.f6167b);
    }
}
