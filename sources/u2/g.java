package u2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f21544d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21546b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0440a f21547a = new C0440a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f21548b = c(0.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f21549c = c(0.5f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f21550d = c(-1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f21551e = c(1.0f);

        /* JADX INFO: renamed from: u2.g$a$a, reason: collision with other inner class name */
        public static final class C0440a {
            private C0440a() {
            }

            public /* synthetic */ C0440a(ae.j jVar) {
                this();
            }

            public final float a() {
                return a.f21549c;
            }

            public final float b() {
                return a.f21550d;
            }
        }

        public static float c(float f10) {
            boolean z10 = true;
            if (!(0.0f <= f10 && f10 <= 1.0f)) {
                if (!(f10 == -1.0f)) {
                    z10 = false;
                }
            }
            if (z10) {
                return f10;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        public static final boolean d(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int e(float f10) {
            return Float.hashCode(f10);
        }

        public static String f(float f10) {
            if (f10 == f21548b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f21549c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f21550d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f21551e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final g a() {
            return g.f21544d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21552a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f21553b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f21554c = c(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f21555d = c(17);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f21556e = c(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return c.f21555d;
            }

            public final int b() {
                return c.f21556e;
            }
        }

        private static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static int e(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean f(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean g(int i10) {
            return (i10 & 16) > 0;
        }

        public static String h(int i10) {
            return i10 == f21553b ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f21554c ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f21555d ? "LineHeightStyle.Trim.Both" : i10 == f21556e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    static {
        ae.j jVar = null;
        f21543c = new b(jVar);
        f21544d = new g(a.f21547a.b(), c.f21552a.a(), jVar);
    }

    private g(float f10, int i10) {
        this.f21545a = f10;
        this.f21546b = i10;
    }

    public /* synthetic */ g(float f10, int i10, ae.j jVar) {
        this(f10, i10);
    }

    public final float b() {
        return this.f21545a;
    }

    public final int c() {
        return this.f21546b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return a.d(this.f21545a, gVar.f21545a) && c.d(this.f21546b, gVar.f21546b);
    }

    public int hashCode() {
        return (a.e(this.f21545a) * 31) + c.e(this.f21546b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.f21545a)) + ", trim=" + ((Object) c.h(this.f21546b)) + ')';
    }
}
