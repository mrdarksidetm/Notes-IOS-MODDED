package u2;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f21596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p f21597e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21599b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final p a() {
            return p.f21596d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21600a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f21601b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f21602c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f21603d = d(3);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final int a() {
                return b.f21602c;
            }

            public final int b() {
                return b.f21601b;
            }

            public final int c() {
                return b.f21603d;
            }
        }

        private static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }
    }

    static {
        ae.j jVar = null;
        f21595c = new a(jVar);
        b.a aVar = b.f21600a;
        f21596d = new p(aVar.a(), false, jVar);
        f21597e = new p(aVar.b(), true, jVar);
    }

    private p(int i10, boolean z10) {
        this.f21598a = i10;
        this.f21599b = z10;
    }

    public /* synthetic */ p(int i10, boolean z10, ae.j jVar) {
        this(i10, z10);
    }

    public final int b() {
        return this.f21598a;
    }

    public final boolean c() {
        return this.f21599b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return b.e(this.f21598a, pVar.f21598a) && this.f21599b == pVar.f21599b;
    }

    public int hashCode() {
        return (b.f(this.f21598a) * 31) + Boolean.hashCode(this.f21599b);
    }

    public String toString() {
        return r.b(this, f21596d) ? "TextMotion.Static" : r.b(this, f21597e) ? "TextMotion.Animated" : "Invalid";
    }
}
