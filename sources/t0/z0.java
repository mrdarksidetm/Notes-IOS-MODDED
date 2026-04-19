package t0;

/* JADX INFO: loaded from: classes.dex */
public final class z0<T> implements p3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md.l f21047a;

    public z0(zd.a<? extends T> aVar) {
        this.f21047a = md.n.b(aVar);
    }

    private final T c() {
        return (T) this.f21047a.getValue();
    }

    @Override // t0.p3
    public T getValue() {
        return c();
    }
}
