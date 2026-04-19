package v5;

import ae.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f22043b;

    public c() {
        this(0.0d, 0.0d, 3, null);
    }

    public c(double d10, double d11) {
        this.f22042a = d10;
        this.f22043b = d11;
    }

    public /* synthetic */ c(double d10, double d11, int i10, j jVar) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
    }

    public final double a() {
        return this.f22042a;
    }

    public final double b() {
        return this.f22043b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22042a == cVar.f22042a) {
            if (this.f22043b == cVar.f22043b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f22042a);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f22043b);
        return (i10 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public String toString() {
        return '{' + this.f22042a + ", " + this.f22043b + '}';
    }
}
