package m1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f15284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f15285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f15286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f15287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f15288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f15289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f15290g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r2 == 0.0d) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.x.<init>(double, double, double, double, double, double, double):void");
    }

    public /* synthetic */ x(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, ae.j jVar) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }

    public final double a() {
        return this.f15285b;
    }

    public final double b() {
        return this.f15286c;
    }

    public final double c() {
        return this.f15287d;
    }

    public final double d() {
        return this.f15288e;
    }

    public final double e() {
        return this.f15289f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.f15284a, xVar.f15284a) == 0 && Double.compare(this.f15285b, xVar.f15285b) == 0 && Double.compare(this.f15286c, xVar.f15286c) == 0 && Double.compare(this.f15287d, xVar.f15287d) == 0 && Double.compare(this.f15288e, xVar.f15288e) == 0 && Double.compare(this.f15289f, xVar.f15289f) == 0 && Double.compare(this.f15290g, xVar.f15290g) == 0;
    }

    public final double f() {
        return this.f15290g;
    }

    public final double g() {
        return this.f15284a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f15284a) * 31) + Double.hashCode(this.f15285b)) * 31) + Double.hashCode(this.f15286c)) * 31) + Double.hashCode(this.f15287d)) * 31) + Double.hashCode(this.f15288e)) * 31) + Double.hashCode(this.f15289f)) * 31) + Double.hashCode(this.f15290g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f15284a + ", a=" + this.f15285b + ", b=" + this.f15286c + ", c=" + this.f15287d + ", d=" + this.f15288e + ", e=" + this.f15289f + ", f=" + this.f15290g + ')';
    }
}
