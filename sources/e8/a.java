package e8;

import e8.e;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10707f;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f10708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f10709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f10710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f10712e;

        b() {
        }

        @Override // e8.e.a
        e a() {
            String str = "";
            if (this.f10708a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f10709b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f10710c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f10711d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f10712e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f10708a.longValue(), this.f10709b.intValue(), this.f10710c.intValue(), this.f10711d.longValue(), this.f10712e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e8.e.a
        e.a b(int i10) {
            this.f10710c = Integer.valueOf(i10);
            return this;
        }

        @Override // e8.e.a
        e.a c(long j10) {
            this.f10711d = Long.valueOf(j10);
            return this;
        }

        @Override // e8.e.a
        e.a d(int i10) {
            this.f10709b = Integer.valueOf(i10);
            return this;
        }

        @Override // e8.e.a
        e.a e(int i10) {
            this.f10712e = Integer.valueOf(i10);
            return this;
        }

        @Override // e8.e.a
        e.a f(long j10) {
            this.f10708a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f10703b = j10;
        this.f10704c = i10;
        this.f10705d = i11;
        this.f10706e = j11;
        this.f10707f = i12;
    }

    @Override // e8.e
    int b() {
        return this.f10705d;
    }

    @Override // e8.e
    long c() {
        return this.f10706e;
    }

    @Override // e8.e
    int d() {
        return this.f10704c;
    }

    @Override // e8.e
    int e() {
        return this.f10707f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10703b == eVar.f() && this.f10704c == eVar.d() && this.f10705d == eVar.b() && this.f10706e == eVar.c() && this.f10707f == eVar.e();
    }

    @Override // e8.e
    long f() {
        return this.f10703b;
    }

    public int hashCode() {
        long j10 = this.f10703b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10704c) * 1000003) ^ this.f10705d) * 1000003;
        long j11 = this.f10706e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10707f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f10703b + ", loadBatchSize=" + this.f10704c + ", criticalSectionEnterTimeoutMs=" + this.f10705d + ", eventCleanUpAge=" + this.f10706e + ", maxBlobByteSizePerRow=" + this.f10707f + "}";
    }
}
