package da;

/* JADX INFO: loaded from: classes2.dex */
public class w<T> implements ma.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9920c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f9921a = f9920c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ma.b<T> f9922b;

    public w(ma.b<T> bVar) {
        this.f9922b = bVar;
    }

    @Override // ma.b
    public T get() {
        T t10 = (T) this.f9921a;
        Object obj = f9920c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f9921a;
                if (t10 == obj) {
                    t10 = this.f9922b.get();
                    this.f9921a = t10;
                    this.f9922b = null;
                }
            }
        }
        return t10;
    }
}
