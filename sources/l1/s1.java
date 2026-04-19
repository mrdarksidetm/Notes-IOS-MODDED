package l1;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14570d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s1 f14571e = new s1(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14574c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final s1 a() {
            return s1.f14571e;
        }
    }

    private s1(long j10, long j11, float f10) {
        this.f14572a = j10;
        this.f14573b = j11;
        this.f14574c = f10;
    }

    public /* synthetic */ s1(long j10, long j11, float f10, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? l0.d(4278190080L) : j10, (i10 & 2) != 0 ? k1.f.f14338b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }

    public /* synthetic */ s1(long j10, long j11, float f10, ae.j jVar) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f14574c;
    }

    public final long c() {
        return this.f14572a;
    }

    public final long d() {
        return this.f14573b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (j0.w(this.f14572a, s1Var.f14572a) && k1.f.l(this.f14573b, s1Var.f14573b)) {
            return (this.f14574c > s1Var.f14574c ? 1 : (this.f14574c == s1Var.f14574c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((j0.C(this.f14572a) * 31) + k1.f.q(this.f14573b)) * 31) + Float.hashCode(this.f14574c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) j0.D(this.f14572a)) + ", offset=" + ((Object) k1.f.v(this.f14573b)) + ", blurRadius=" + this.f14574c + ')';
    }
}
