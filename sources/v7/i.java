package v7;

import v7.o;

/* JADX INFO: loaded from: classes.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f22159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f22160b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f22161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f22162b;

        b() {
        }

        @Override // v7.o.a
        public o a() {
            return new i(this.f22161a, this.f22162b);
        }

        @Override // v7.o.a
        public o.a b(o.b bVar) {
            this.f22162b = bVar;
            return this;
        }

        @Override // v7.o.a
        public o.a c(o.c cVar) {
            this.f22161a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f22159a = cVar;
        this.f22160b = bVar;
    }

    @Override // v7.o
    public o.b b() {
        return this.f22160b;
    }

    @Override // v7.o
    public o.c c() {
        return this.f22159a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f22159a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f22160b;
            o.b bVarB = oVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f22159a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f22160b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f22159a + ", mobileSubtype=" + this.f22160b + "}";
    }
}
