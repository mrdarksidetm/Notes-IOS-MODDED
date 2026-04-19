package y7;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<Object> f23546b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f23547a;

    private c(T t10) {
        this.f23547a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // ld.a
    public T get() {
        return this.f23547a;
    }
}
