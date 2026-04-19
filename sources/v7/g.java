package v7;

import java.util.List;
import v7.m;

/* JADX INFO: loaded from: classes.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f22146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f22147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<l> f22149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f22150g;

    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f22151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f22152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k f22153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f22154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f22155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<l> f22156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f22157g;

        b() {
        }

        @Override // v7.m.a
        public m a() {
            String str = "";
            if (this.f22151a == null) {
                str = " requestTimeMs";
            }
            if (this.f22152b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f22151a.longValue(), this.f22152b.longValue(), this.f22153c, this.f22154d, this.f22155e, this.f22156f, this.f22157g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v7.m.a
        public m.a b(k kVar) {
            this.f22153c = kVar;
            return this;
        }

        @Override // v7.m.a
        public m.a c(List<l> list) {
            this.f22156f = list;
            return this;
        }

        @Override // v7.m.a
        m.a d(Integer num) {
            this.f22154d = num;
            return this;
        }

        @Override // v7.m.a
        m.a e(String str) {
            this.f22155e = str;
            return this;
        }

        @Override // v7.m.a
        public m.a f(p pVar) {
            this.f22157g = pVar;
            return this;
        }

        @Override // v7.m.a
        public m.a g(long j10) {
            this.f22151a = Long.valueOf(j10);
            return this;
        }

        @Override // v7.m.a
        public m.a h(long j10) {
            this.f22152b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f22144a = j10;
        this.f22145b = j11;
        this.f22146c = kVar;
        this.f22147d = num;
        this.f22148e = str;
        this.f22149f = list;
        this.f22150g = pVar;
    }

    @Override // v7.m
    public k b() {
        return this.f22146c;
    }

    @Override // v7.m
    public List<l> c() {
        return this.f22149f;
    }

    @Override // v7.m
    public Integer d() {
        return this.f22147d;
    }

    @Override // v7.m
    public String e() {
        return this.f22148e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f22144a == mVar.g() && this.f22145b == mVar.h() && ((kVar = this.f22146c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f22147d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f22148e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f22149f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f22150g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // v7.m
    public p f() {
        return this.f22150g;
    }

    @Override // v7.m
    public long g() {
        return this.f22144a;
    }

    @Override // v7.m
    public long h() {
        return this.f22145b;
    }

    public int hashCode() {
        long j10 = this.f22144a;
        long j11 = this.f22145b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f22146c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f22147d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f22148e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f22149f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f22150g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f22144a + ", requestUptimeMs=" + this.f22145b + ", clientInfo=" + this.f22146c + ", logSource=" + this.f22147d + ", logSourceName=" + this.f22148e + ", logEvents=" + this.f22149f + ", qosTier=" + this.f22150g + "}";
    }
}
