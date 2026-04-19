package d0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.y f9228b;

    private h0(long j10, h0.y yVar) {
        this.f9227a = j10;
        this.f9228b = yVar;
    }

    public /* synthetic */ h0(long j10, h0.y yVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? l1.l0.d(4284900966L) : j10, (i10 & 2) != 0 ? androidx.compose.foundation.layout.m.c(0.0f, 0.0f, 3, null) : yVar, null);
    }

    public /* synthetic */ h0(long j10, h0.y yVar, ae.j jVar) {
        this(j10, yVar);
    }

    public final h0.y a() {
        return this.f9228b;
    }

    public final long b() {
        return this.f9227a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ae.r.b(h0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        h0 h0Var = (h0) obj;
        return l1.j0.w(this.f9227a, h0Var.f9227a) && ae.r.b(this.f9228b, h0Var.f9228b);
    }

    public int hashCode() {
        return (l1.j0.C(this.f9227a) * 31) + this.f9228b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) l1.j0.D(this.f9227a)) + ", drawPadding=" + this.f9228b + ')';
    }
}
