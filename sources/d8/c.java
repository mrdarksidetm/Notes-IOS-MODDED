package d8;

import d8.f;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f.c> f9779c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f9780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f9781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<f.c> f9782c;

        b() {
        }

        @Override // d8.f.b.a
        public f.b a() {
            String str = "";
            if (this.f9780a == null) {
                str = " delta";
            }
            if (this.f9781b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f9782c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f9780a.longValue(), this.f9781b.longValue(), this.f9782c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d8.f.b.a
        public f.b.a b(long j10) {
            this.f9780a = Long.valueOf(j10);
            return this;
        }

        @Override // d8.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f9782c = set;
            return this;
        }

        @Override // d8.f.b.a
        public f.b.a d(long j10) {
            this.f9781b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f9777a = j10;
        this.f9778b = j11;
        this.f9779c = set;
    }

    @Override // d8.f.b
    long b() {
        return this.f9777a;
    }

    @Override // d8.f.b
    Set<f.c> c() {
        return this.f9779c;
    }

    @Override // d8.f.b
    long d() {
        return this.f9778b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f9777a == bVar.b() && this.f9778b == bVar.d() && this.f9779c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f9777a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f9778b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f9779c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f9777a + ", maxAllowedDelay=" + this.f9778b + ", flags=" + this.f9779c + "}";
    }
}
