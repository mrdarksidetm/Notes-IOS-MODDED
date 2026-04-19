package u2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21523a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21527e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return e.f21524b;
        }

        public final int b() {
            return e.f21527e;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21528a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f21529b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f21530c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f21531d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f21532e = d(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return b.f21531d;
            }

            public final int b() {
                return b.f21530c;
            }

            public final int c() {
                return b.f21529b;
            }
        }

        public static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            return e(i10, f21529b) ? "Strategy.Simple" : e(i10, f21530c) ? "Strategy.HighQuality" : e(i10, f21531d) ? "Strategy.Balanced" : e(i10, f21532e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21533a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f21534b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f21535c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f21536d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f21537e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f21538f = e(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return c.f21534b;
            }

            public final int b() {
                return c.f21535c;
            }

            public final int c() {
                return c.f21536d;
            }

            public final int d() {
                return c.f21537e;
            }
        }

        public static int e(int i10) {
            return i10;
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static String g(int i10) {
            return f(i10, f21534b) ? "Strictness.None" : f(i10, f21535c) ? "Strictness.Loose" : f(i10, f21536d) ? "Strictness.Normal" : f(i10, f21537e) ? "Strictness.Strict" : f(i10, f21538f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21539a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f21540b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f21541c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f21542d = c(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return d.f21540b;
            }

            public final int b() {
                return d.f21541c;
            }
        }

        public static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            return d(i10, f21540b) ? "WordBreak.None" : d(i10, f21541c) ? "WordBreak.Phrase" : d(i10, f21542d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        b.a aVar = b.f21528a;
        int iC = aVar.c();
        c.a aVar2 = c.f21533a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f21539a;
        f21524b = c(f.e(iC, iC2, aVar3.a()));
        f21525c = c(f.e(aVar.a(), aVar2.b(), aVar3.b()));
        f21526d = c(f.e(aVar.b(), aVar2.d(), aVar3.a()));
        f21527e = c(0);
    }

    private static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final int e(int i10) {
        return b.d(f.f(i10));
    }

    public static final int f(int i10) {
        return c.e(f.g(i10));
    }

    public static final int g(int i10) {
        return d.c(f.h(i10));
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(e(i10))) + ", strictness=" + ((Object) c.g(f(i10))) + ", wordBreak=" + ((Object) d.e(g(i10))) + ')';
    }
}
