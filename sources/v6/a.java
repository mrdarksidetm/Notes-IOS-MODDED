package v6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22049a;

    /* JADX INFO: renamed from: v6.a$a, reason: collision with other inner class name */
    public static final class C0458a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22050a;

        /* synthetic */ C0458a(q qVar) {
        }

        public a a() {
            String str = this.f22050a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f22049a = str;
            return aVar;
        }

        public C0458a b(String str) {
            this.f22050a = str;
            return this;
        }
    }

    /* synthetic */ a(r rVar) {
    }

    public static C0458a b() {
        return new C0458a(null);
    }

    public String a() {
        return this.f22049a;
    }
}
