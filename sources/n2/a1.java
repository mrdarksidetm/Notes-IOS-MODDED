package n2;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f15756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f15757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f15760e;

    private a1(t tVar, i0 i0Var, int i10, int i11, Object obj) {
        this.f15756a = tVar;
        this.f15757b = i0Var;
        this.f15758c = i10;
        this.f15759d = i11;
        this.f15760e = obj;
    }

    public /* synthetic */ a1(t tVar, i0 i0Var, int i10, int i11, Object obj, ae.j jVar) {
        this(tVar, i0Var, i10, i11, obj);
    }

    public static /* synthetic */ a1 b(a1 a1Var, t tVar, i0 i0Var, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            tVar = a1Var.f15756a;
        }
        if ((i12 & 2) != 0) {
            i0Var = a1Var.f15757b;
        }
        i0 i0Var2 = i0Var;
        if ((i12 & 4) != 0) {
            i10 = a1Var.f15758c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = a1Var.f15759d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = a1Var.f15760e;
        }
        return a1Var.a(tVar, i0Var2, i13, i14, obj);
    }

    public final a1 a(t tVar, i0 i0Var, int i10, int i11, Object obj) {
        return new a1(tVar, i0Var, i10, i11, obj, null);
    }

    public final t c() {
        return this.f15756a;
    }

    public final int d() {
        return this.f15758c;
    }

    public final int e() {
        return this.f15759d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return ae.r.b(this.f15756a, a1Var.f15756a) && ae.r.b(this.f15757b, a1Var.f15757b) && e0.f(this.f15758c, a1Var.f15758c) && f0.e(this.f15759d, a1Var.f15759d) && ae.r.b(this.f15760e, a1Var.f15760e);
    }

    public final i0 f() {
        return this.f15757b;
    }

    public int hashCode() {
        t tVar = this.f15756a;
        int iHashCode = (((((((tVar == null ? 0 : tVar.hashCode()) * 31) + this.f15757b.hashCode()) * 31) + e0.g(this.f15758c)) * 31) + f0.f(this.f15759d)) * 31;
        Object obj = this.f15760e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f15756a + ", fontWeight=" + this.f15757b + ", fontStyle=" + ((Object) e0.h(this.f15758c)) + ", fontSynthesis=" + ((Object) f0.i(this.f15759d)) + ", resourceLoaderCacheKey=" + this.f15760e + ')';
    }
}
