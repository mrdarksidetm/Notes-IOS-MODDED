package a4;

/* JADX INFO: loaded from: classes.dex */
final class c<T> extends n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f417b;

    public c(T t10, int i10) {
        super(null);
        this.f416a = t10;
        this.f417b = i10;
    }

    public final void a() {
        T t10 = this.f416a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f417b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f416a;
    }
}
