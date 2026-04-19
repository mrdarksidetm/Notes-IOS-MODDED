package v7;

import java.util.Arrays;
import v7.l;

/* JADX INFO: loaded from: classes.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f22131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f22133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f22136g;

    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f22137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f22138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f22139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f22140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f22141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f22142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f22143g;

        b() {
        }

        @Override // v7.l.a
        public l a() {
            String str = "";
            if (this.f22137a == null) {
                str = " eventTimeMs";
            }
            if (this.f22139c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f22142f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f22137a.longValue(), this.f22138b, this.f22139c.longValue(), this.f22140d, this.f22141e, this.f22142f.longValue(), this.f22143g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v7.l.a
        public l.a b(Integer num) {
            this.f22138b = num;
            return this;
        }

        @Override // v7.l.a
        public l.a c(long j10) {
            this.f22137a = Long.valueOf(j10);
            return this;
        }

        @Override // v7.l.a
        public l.a d(long j10) {
            this.f22139c = Long.valueOf(j10);
            return this;
        }

        @Override // v7.l.a
        public l.a e(o oVar) {
            this.f22143g = oVar;
            return this;
        }

        @Override // v7.l.a
        l.a f(byte[] bArr) {
            this.f22140d = bArr;
            return this;
        }

        @Override // v7.l.a
        l.a g(String str) {
            this.f22141e = str;
            return this;
        }

        @Override // v7.l.a
        public l.a h(long j10) {
            this.f22142f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f22130a = j10;
        this.f22131b = num;
        this.f22132c = j11;
        this.f22133d = bArr;
        this.f22134e = str;
        this.f22135f = j12;
        this.f22136g = oVar;
    }

    @Override // v7.l
    public Integer b() {
        return this.f22131b;
    }

    @Override // v7.l
    public long c() {
        return this.f22130a;
    }

    @Override // v7.l
    public long d() {
        return this.f22132c;
    }

    @Override // v7.l
    public o e() {
        return this.f22136g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f22130a == lVar.c() && ((num = this.f22131b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f22132c == lVar.d()) {
            if (Arrays.equals(this.f22133d, lVar instanceof f ? ((f) lVar).f22133d : lVar.f()) && ((str = this.f22134e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f22135f == lVar.h()) {
                o oVar = this.f22136g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v7.l
    public byte[] f() {
        return this.f22133d;
    }

    @Override // v7.l
    public String g() {
        return this.f22134e;
    }

    @Override // v7.l
    public long h() {
        return this.f22135f;
    }

    public int hashCode() {
        long j10 = this.f22130a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22131b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f22132c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22133d)) * 1000003;
        String str = this.f22134e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f22135f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f22136g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f22130a + ", eventCode=" + this.f22131b + ", eventUptimeMs=" + this.f22132c + ", sourceExtension=" + Arrays.toString(this.f22133d) + ", sourceExtensionJsonProto3=" + this.f22134e + ", timezoneOffsetSeconds=" + this.f22135f + ", networkConnectionInfo=" + this.f22136g + "}";
    }
}
