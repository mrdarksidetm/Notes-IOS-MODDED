package v6;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22057a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22058a;

        /* synthetic */ a(s0 s0Var) {
        }

        public n a() {
            if (this.f22058a != null) {
                return new n(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f22058a = str;
            return this;
        }
    }

    /* synthetic */ n(a aVar, t0 t0Var) {
        this.f22057a = aVar.f22058a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f22057a;
    }
}
