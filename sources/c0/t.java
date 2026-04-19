package c0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f6200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f6201b;

    public t(double d10, double d11) {
        this.f6200a = d10;
        this.f6201b = d11;
    }

    public final double e() {
        return this.f6201b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Double.compare(this.f6200a, tVar.f6200a) == 0 && Double.compare(this.f6201b, tVar.f6201b) == 0;
    }

    public final double f() {
        return this.f6200a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f6200a) * 31) + Double.hashCode(this.f6201b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f6200a + ", _imaginary=" + this.f6201b + ')';
    }
}
