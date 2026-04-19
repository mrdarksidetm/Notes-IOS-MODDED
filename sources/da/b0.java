package da;

/* JADX INFO: loaded from: classes2.dex */
class b0<T> implements ma.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ma.a<Object> f9852c = new ma.a() { // from class: da.z
        @Override // ma.a
        public final void a(ma.b bVar) {
            b0.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ma.b<Object> f9853d = new ma.b() { // from class: da.a0
        @Override // ma.b
        public final Object get() {
            return b0.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ma.a<T> f9854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ma.b<T> f9855b;

    private b0(ma.a<T> aVar, ma.b<T> bVar) {
        this.f9854a = aVar;
        this.f9855b = bVar;
    }

    static <T> b0<T> c() {
        return new b0<>(f9852c, f9853d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(ma.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    void f(ma.b<T> bVar) {
        ma.a<T> aVar;
        if (this.f9855b != f9853d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f9854a;
            this.f9854a = null;
            this.f9855b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // ma.b
    public T get() {
        return this.f9855b.get();
    }
}
