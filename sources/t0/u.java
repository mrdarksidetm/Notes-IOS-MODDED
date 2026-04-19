package t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<T> f20986a;

    private u(zd.a<? extends T> aVar) {
        this.f20986a = new z0<>(aVar);
    }

    public /* synthetic */ u(zd.a aVar, ae.j jVar) {
        this(aVar);
    }

    public final z0<T> a() {
        return this.f20986a;
    }

    public abstract p3<T> b(T t10, p3<? extends T> p3Var);
}
