package y7;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements ld.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f23543c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ld.a<T> f23544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f23545b = f23543c;

    private a(ld.a<T> aVar) {
        this.f23544a = aVar;
    }

    public static <P extends ld.a<T>, T> ld.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f23543c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ld.a
    public T get() {
        T t10 = (T) this.f23545b;
        Object obj = f23543c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f23545b;
                if (t10 == obj) {
                    t10 = this.f23544a.get();
                    this.f23545b = b(this.f23545b, t10);
                    this.f23544a = null;
                }
            }
        }
        return t10;
    }
}
