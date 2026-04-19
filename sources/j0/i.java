package j0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13714b = v0.d.f21872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<a> f13715a = new v0.d<>(new a[16], 0);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13717b;

        public a(int i10, int i11) {
            this.f13716a = i10;
            this.f13717b = i11;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException("negative start index".toString());
            }
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException("end index greater than start".toString());
            }
        }

        public final int a() {
            return this.f13717b;
        }

        public final int b() {
            return this.f13716a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13716a == aVar.f13716a && this.f13717b == aVar.f13717b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f13716a) * 31) + Integer.hashCode(this.f13717b);
        }

        public String toString() {
            return "Interval(start=" + this.f13716a + ", end=" + this.f13717b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f13715a.b(aVar);
        return aVar;
    }

    public final int b() {
        int iA = this.f13715a.m().a();
        v0.d<a> dVar = this.f13715a;
        int iO = dVar.o();
        if (iO > 0) {
            int i10 = 0;
            a[] aVarArrN = dVar.n();
            do {
                a aVar = aVarArrN[i10];
                if (aVar.a() > iA) {
                    iA = aVar.a();
                }
                i10++;
            } while (i10 < iO);
        }
        return iA;
    }

    public final int c() {
        int iB = this.f13715a.m().b();
        v0.d<a> dVar = this.f13715a;
        int iO = dVar.o();
        if (iO > 0) {
            a[] aVarArrN = dVar.n();
            int i10 = 0;
            do {
                a aVar = aVarArrN[i10];
                if (aVar.b() < iB) {
                    iB = aVar.b();
                }
                i10++;
            } while (i10 < iO);
        }
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("negative minIndex".toString());
    }

    public final boolean d() {
        return this.f13715a.s();
    }

    public final void e(a aVar) {
        this.f13715a.v(aVar);
    }
}
