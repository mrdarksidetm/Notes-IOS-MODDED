package t0;

/* JADX INFO: loaded from: classes.dex */
final class z1<T> implements y1<T>, k1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f21048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ k1<T> f21049b;

    public z1(k1<T> k1Var, qd.g gVar) {
        this.f21048a = gVar;
        this.f21049b = k1Var;
    }

    @Override // le.n0
    public qd.g getCoroutineContext() {
        return this.f21048a;
    }

    @Override // t0.k1, t0.p3
    public T getValue() {
        return this.f21049b.getValue();
    }

    @Override // t0.k1
    public void setValue(T t10) {
        this.f21049b.setValue(t10);
    }
}
