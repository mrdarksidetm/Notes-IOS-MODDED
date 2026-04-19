package z7;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f24291c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24293b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24294a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24295b = 0;

        a() {
        }

        public f a() {
            return new f(this.f24294a, this.f24295b);
        }

        public a b(long j10) {
            this.f24295b = j10;
            return this;
        }

        public a c(long j10) {
            this.f24294a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f24292a = j10;
        this.f24293b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24293b;
    }

    public long b() {
        return this.f24292a;
    }
}
