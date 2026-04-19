package v7;

import v7.k;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f22126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7.a f22127b;

    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f22128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v7.a f22129b;

        b() {
        }

        @Override // v7.k.a
        public k a() {
            return new e(this.f22128a, this.f22129b);
        }

        @Override // v7.k.a
        public k.a b(v7.a aVar) {
            this.f22129b = aVar;
            return this;
        }

        @Override // v7.k.a
        public k.a c(k.b bVar) {
            this.f22128a = bVar;
            return this;
        }
    }

    private e(k.b bVar, v7.a aVar) {
        this.f22126a = bVar;
        this.f22127b = aVar;
    }

    @Override // v7.k
    public v7.a b() {
        return this.f22127b;
    }

    @Override // v7.k
    public k.b c() {
        return this.f22126a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f22126a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            v7.a aVar = this.f22127b;
            v7.a aVarB = kVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f22126a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        v7.a aVar = this.f22127b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f22126a + ", androidClientInfo=" + this.f22127b + "}";
    }
}
