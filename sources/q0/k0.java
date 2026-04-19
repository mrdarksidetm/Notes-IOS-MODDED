package q0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.a f18778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.a f18779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0.a f18780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.a f18781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0.a f18782e;

    public k0() {
        this(null, null, null, null, null, 31, null);
    }

    public k0(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, l0.a aVar5) {
        this.f18778a = aVar;
        this.f18779b = aVar2;
        this.f18780c = aVar3;
        this.f18781d = aVar4;
        this.f18782e = aVar5;
    }

    public /* synthetic */ k0(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, l0.a aVar5, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? j0.f18770a.b() : aVar, (i10 & 2) != 0 ? j0.f18770a.e() : aVar2, (i10 & 4) != 0 ? j0.f18770a.d() : aVar3, (i10 & 8) != 0 ? j0.f18770a.c() : aVar4, (i10 & 16) != 0 ? j0.f18770a.a() : aVar5);
    }

    public final l0.a a() {
        return this.f18782e;
    }

    public final l0.a b() {
        return this.f18778a;
    }

    public final l0.a c() {
        return this.f18781d;
    }

    public final l0.a d() {
        return this.f18780c;
    }

    public final l0.a e() {
        return this.f18779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return ae.r.b(this.f18778a, k0Var.f18778a) && ae.r.b(this.f18779b, k0Var.f18779b) && ae.r.b(this.f18780c, k0Var.f18780c) && ae.r.b(this.f18781d, k0Var.f18781d) && ae.r.b(this.f18782e, k0Var.f18782e);
    }

    public int hashCode() {
        return (((((((this.f18778a.hashCode() * 31) + this.f18779b.hashCode()) * 31) + this.f18780c.hashCode()) * 31) + this.f18781d.hashCode()) * 31) + this.f18782e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f18778a + ", small=" + this.f18779b + ", medium=" + this.f18780c + ", large=" + this.f18781d + ", extraLarge=" + this.f18782e + ')';
    }
}
