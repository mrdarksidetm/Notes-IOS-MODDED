package v6;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22059a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22060a;

        /* synthetic */ a(u0 u0Var) {
        }

        public o a() {
            if (this.f22060a != null) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f22060a = str;
            return this;
        }
    }

    /* synthetic */ o(a aVar, v0 v0Var) {
        this.f22059a = aVar.f22060a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f22059a;
    }
}
