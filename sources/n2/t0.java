package n2;

import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f15889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.d f15891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15892f;

    private t0(int i10, i0 i0Var, int i11, h0.d dVar, int i12) {
        this.f15888b = i10;
        this.f15889c = i0Var;
        this.f15890d = i11;
        this.f15891e = dVar;
        this.f15892f = i12;
    }

    public /* synthetic */ t0(int i10, i0 i0Var, int i11, h0.d dVar, int i12, ae.j jVar) {
        this(i10, i0Var, i11, dVar, i12);
    }

    @Override // n2.s
    public int a() {
        return this.f15892f;
    }

    @Override // n2.s
    public i0 b() {
        return this.f15889c;
    }

    @Override // n2.s
    public int c() {
        return this.f15890d;
    }

    public final int d() {
        return this.f15888b;
    }

    public final h0.d e() {
        return this.f15891e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f15888b == t0Var.f15888b && ae.r.b(b(), t0Var.b()) && e0.f(c(), t0Var.c()) && ae.r.b(this.f15891e, t0Var.f15891e) && c0.e(a(), t0Var.a());
    }

    public int hashCode() {
        return (((((((this.f15888b * 31) + b().hashCode()) * 31) + e0.g(c())) * 31) + c0.f(a())) * 31) + this.f15891e.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f15888b + ", weight=" + b() + ", style=" + ((Object) e0.h(c())) + ", loadingStrategy=" + ((Object) c0.g(a())) + ')';
    }
}
