package z7;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f24267c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24269b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24270a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f24271b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f24270a, this.f24271b);
        }

        public a b(long j10) {
            this.f24270a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f24271b = bVar;
            return this;
        }
    }

    public enum b implements ja.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24280a;

        b(int i10) {
            this.f24280a = i10;
        }

        @Override // ja.c
        public int d() {
            return this.f24280a;
        }
    }

    c(long j10, b bVar) {
        this.f24268a = j10;
        this.f24269b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24268a;
    }

    public b b() {
        return this.f24269b;
    }
}
