package n2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15788b;

    public f(int i10) {
        this.f15788b = i10;
    }

    @Override // n2.o0
    public i0 b(i0 i0Var) {
        int i10 = this.f15788b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? i0Var : new i0(ge.o.l(i0Var.t() + this.f15788b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f15788b == ((f) obj).f15788b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f15788b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f15788b + ')';
    }
}
