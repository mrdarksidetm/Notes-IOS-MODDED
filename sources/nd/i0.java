package nd;

/* JADX INFO: loaded from: classes2.dex */
public final class i0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f16122b;

    public i0(int i10, T t10) {
        this.f16121a = i10;
        this.f16122b = t10;
    }

    public final int a() {
        return this.f16121a;
    }

    public final T b() {
        return this.f16122b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f16121a == i0Var.f16121a && ae.r.b(this.f16122b, i0Var.f16122b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f16121a) * 31;
        T t10 = this.f16122b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f16121a + ", value=" + this.f16122b + ')';
    }
}
