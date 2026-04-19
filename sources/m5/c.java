package m5;

/* JADX INFO: loaded from: classes.dex */
public interface c extends m5.a {

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0351a f15415b = new C0351a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15416c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f15417d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15418a;

        /* JADX INFO: renamed from: m5.c$a$a, reason: collision with other inner class name */
        public static final class C0351a {
            private C0351a() {
            }

            public /* synthetic */ C0351a(ae.j jVar) {
                this();
            }
        }

        private a(String str) {
            this.f15418a = str;
        }

        public String toString() {
            return this.f15418a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15419b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15420c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f15421d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15422a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }
        }

        private b(String str) {
            this.f15422a = str;
        }

        public String toString() {
            return this.f15422a;
        }
    }

    /* JADX INFO: renamed from: m5.c$c, reason: collision with other inner class name */
    public static final class C0352c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15423b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0352c f15424c = new C0352c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0352c f15425d = new C0352c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15426a;

        /* JADX INFO: renamed from: m5.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }
        }

        private C0352c(String str) {
            this.f15426a = str;
        }

        public String toString() {
            return this.f15426a;
        }
    }

    boolean a();

    a b();

    b c();

    C0352c getState();
}
