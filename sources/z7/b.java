package z7;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f24264b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f24265a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f24266a = null;

        a() {
        }

        public b a() {
            return new b(this.f24266a);
        }

        public a b(e eVar) {
            this.f24266a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f24265a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f24265a;
    }
}
