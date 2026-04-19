package b0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w2.d f5144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5145c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f5146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f5147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f5148c;

        public a(float f10, float f11, long j10) {
            this.f5146a = f10;
            this.f5147b = f11;
            this.f5148c = j10;
        }

        public final float a(long j10) {
            long j11 = this.f5148c;
            return this.f5147b * Math.signum(this.f5146a) * b0.a.f5030a.b(j11 > 0 ? j10 / j11 : 1.0f).a();
        }

        public final float b(long j10) {
            long j11 = this.f5148c;
            return (((b0.a.f5030a.b(j11 > 0 ? j10 / j11 : 1.0f).b() * Math.signum(this.f5146a)) * this.f5147b) / this.f5148c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f5146a, aVar.f5146a) == 0 && Float.compare(this.f5147b, aVar.f5147b) == 0 && this.f5148c == aVar.f5148c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f5146a) * 31) + Float.hashCode(this.f5147b)) * 31) + Long.hashCode(this.f5148c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f5146a + ", distance=" + this.f5147b + ", duration=" + this.f5148c + ')';
        }
    }

    public o(float f10, w2.d dVar) {
        this.f5143a = f10;
        this.f5144b = dVar;
        this.f5145c = a(dVar);
    }

    private final float a(w2.d dVar) {
        return p.c(0.84f, dVar.getDensity());
    }

    private final double e(float f10) {
        return b0.a.f5030a.a(f10, this.f5143a * this.f5145c);
    }

    public final float b(float f10) {
        return (float) (((double) (this.f5143a * this.f5145c)) * Math.exp((((double) p.f5149a) / (((double) p.f5149a) - 1.0d)) * e(f10)));
    }

    public final long c(float f10) {
        return (long) (Math.exp(e(f10) / (((double) p.f5149a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        double dE = e(f10);
        double d10 = ((double) p.f5149a) - 1.0d;
        return new a(f10, (float) (((double) (this.f5143a * this.f5145c)) * Math.exp((((double) p.f5149a) / d10) * dE)), (long) (Math.exp(dE / d10) * 1000.0d));
    }
}
