package g2;

/* JADX INFO: loaded from: classes.dex */
public final class w<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.p<T, T, T> f11419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11420c;

    static final class a extends ae.s implements zd.p<T, T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11421a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        public final T invoke(T t10, T t11) {
            return t10 == null ? t11 : t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(String str, zd.p<? super T, ? super T, ? extends T> pVar) {
        this.f11418a = str;
        this.f11419b = pVar;
    }

    public /* synthetic */ w(String str, zd.p pVar, int i10, ae.j jVar) {
        this(str, (i10 & 2) != 0 ? a.f11421a : pVar);
    }

    public w(String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f11420c = z10;
    }

    public w(String str, boolean z10, zd.p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.f11420c = z10;
    }

    public final String a() {
        return this.f11418a;
    }

    public final boolean b() {
        return this.f11420c;
    }

    public final T c(T t10, T t11) {
        return this.f11419b.invoke(t10, t11);
    }

    public final void d(x xVar, he.j<?> jVar, T t10) {
        xVar.a(this, t10);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f11418a;
    }
}
