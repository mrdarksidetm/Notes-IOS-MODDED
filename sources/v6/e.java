package v6;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22051a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22052a;

        /* synthetic */ a(d0 d0Var) {
        }

        public e a() {
            String str = this.f22052a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            e eVar = new e(null);
            eVar.f22051a = str;
            return eVar;
        }

        public a b(String str) {
            this.f22052a = str;
            return this;
        }
    }

    /* synthetic */ e(e0 e0Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f22051a;
    }
}
