package w7;

import w7.n;

/* JADX INFO: loaded from: classes.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f22538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.c<?> f22540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u7.e<?, byte[]> f22541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u7.b f22542e;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f22543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u7.c<?> f22545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u7.e<?, byte[]> f22546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private u7.b f22547e;

        b() {
        }

        @Override // w7.n.a
        public n a() {
            String str = "";
            if (this.f22543a == null) {
                str = " transportContext";
            }
            if (this.f22544b == null) {
                str = str + " transportName";
            }
            if (this.f22545c == null) {
                str = str + " event";
            }
            if (this.f22546d == null) {
                str = str + " transformer";
            }
            if (this.f22547e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f22543a, this.f22544b, this.f22545c, this.f22546d, this.f22547e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.n.a
        n.a b(u7.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f22547e = bVar;
            return this;
        }

        @Override // w7.n.a
        n.a c(u7.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f22545c = cVar;
            return this;
        }

        @Override // w7.n.a
        n.a d(u7.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f22546d = eVar;
            return this;
        }

        @Override // w7.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f22543a = oVar;
            return this;
        }

        @Override // w7.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f22544b = str;
            return this;
        }
    }

    private c(o oVar, String str, u7.c<?> cVar, u7.e<?, byte[]> eVar, u7.b bVar) {
        this.f22538a = oVar;
        this.f22539b = str;
        this.f22540c = cVar;
        this.f22541d = eVar;
        this.f22542e = bVar;
    }

    @Override // w7.n
    public u7.b b() {
        return this.f22542e;
    }

    @Override // w7.n
    u7.c<?> c() {
        return this.f22540c;
    }

    @Override // w7.n
    u7.e<?, byte[]> e() {
        return this.f22541d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f22538a.equals(nVar.f()) && this.f22539b.equals(nVar.g()) && this.f22540c.equals(nVar.c()) && this.f22541d.equals(nVar.e()) && this.f22542e.equals(nVar.b());
    }

    @Override // w7.n
    public o f() {
        return this.f22538a;
    }

    @Override // w7.n
    public String g() {
        return this.f22539b;
    }

    public int hashCode() {
        return ((((((((this.f22538a.hashCode() ^ 1000003) * 1000003) ^ this.f22539b.hashCode()) * 1000003) ^ this.f22540c.hashCode()) * 1000003) ^ this.f22541d.hashCode()) * 1000003) ^ this.f22542e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f22538a + ", transportName=" + this.f22539b + ", event=" + this.f22540c + ", transformer=" + this.f22541d + ", encoding=" + this.f22542e + "}";
    }
}
