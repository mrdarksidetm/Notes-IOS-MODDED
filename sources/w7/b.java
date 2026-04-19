package w7;

import java.util.Map;
import w7.i;

/* JADX INFO: loaded from: classes.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f22527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f22528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f22531f;

    /* JADX INFO: renamed from: w7.b$b, reason: collision with other inner class name */
    static final class C0471b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f22533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f22534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f22535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f22536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f22537f;

        C0471b() {
        }

        @Override // w7.i.a
        public i d() {
            String str = "";
            if (this.f22532a == null) {
                str = " transportName";
            }
            if (this.f22534c == null) {
                str = str + " encodedPayload";
            }
            if (this.f22535d == null) {
                str = str + " eventMillis";
            }
            if (this.f22536e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f22537f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f22532a, this.f22533b, this.f22534c, this.f22535d.longValue(), this.f22536e.longValue(), this.f22537f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f22537f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // w7.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f22537f = map;
            return this;
        }

        @Override // w7.i.a
        public i.a g(Integer num) {
            this.f22533b = num;
            return this;
        }

        @Override // w7.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f22534c = hVar;
            return this;
        }

        @Override // w7.i.a
        public i.a i(long j10) {
            this.f22535d = Long.valueOf(j10);
            return this;
        }

        @Override // w7.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f22532a = str;
            return this;
        }

        @Override // w7.i.a
        public i.a k(long j10) {
            this.f22536e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f22526a = str;
        this.f22527b = num;
        this.f22528c = hVar;
        this.f22529d = j10;
        this.f22530e = j11;
        this.f22531f = map;
    }

    @Override // w7.i
    protected Map<String, String> c() {
        return this.f22531f;
    }

    @Override // w7.i
    public Integer d() {
        return this.f22527b;
    }

    @Override // w7.i
    public h e() {
        return this.f22528c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f22526a.equals(iVar.j()) && ((num = this.f22527b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f22528c.equals(iVar.e()) && this.f22529d == iVar.f() && this.f22530e == iVar.k() && this.f22531f.equals(iVar.c());
    }

    @Override // w7.i
    public long f() {
        return this.f22529d;
    }

    public int hashCode() {
        int iHashCode = (this.f22526a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f22527b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f22528c.hashCode()) * 1000003;
        long j10 = this.f22529d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22530e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f22531f.hashCode();
    }

    @Override // w7.i
    public String j() {
        return this.f22526a;
    }

    @Override // w7.i
    public long k() {
        return this.f22530e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f22526a + ", code=" + this.f22527b + ", encodedPayload=" + this.f22528c + ", eventMillis=" + this.f22529d + ", uptimeMillis=" + this.f22530e + ", autoMetadata=" + this.f22531f + "}";
    }
}
