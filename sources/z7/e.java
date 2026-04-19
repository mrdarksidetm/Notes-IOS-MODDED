package z7;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f24286c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24288b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24289a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24290b = 0;

        a() {
        }

        public e a() {
            return new e(this.f24289a, this.f24290b);
        }

        public a b(long j10) {
            this.f24289a = j10;
            return this;
        }

        public a c(long j10) {
            this.f24290b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f24287a = j10;
        this.f24288b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24287a;
    }

    public long b() {
        return this.f24288b;
    }
}
