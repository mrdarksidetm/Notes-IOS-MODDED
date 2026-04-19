package m1;

import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15194d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15197c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private c(String str, long j10, int i10) {
        this.f15195a = str;
        this.f15196b = j10;
        this.f15197c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, ae.j jVar) {
        this(str, j10, i10);
    }

    public final float[] a(float f10, float f11, float f12) {
        float[] fArr = new float[b.f(this.f15196b)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return b(fArr);
    }

    public abstract float[] b(float[] fArr);

    public final int c() {
        return b.f(this.f15196b);
    }

    public final int d() {
        return this.f15197c;
    }

    public abstract float e(int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15197c == cVar.f15197c && ae.r.b(this.f15195a, cVar.f15195a)) {
            return b.e(this.f15196b, cVar.f15196b);
        }
        return false;
    }

    public abstract float f(int i10);

    public final long g() {
        return this.f15196b;
    }

    public final String h() {
        return this.f15195a;
    }

    public int hashCode() {
        return (((this.f15195a.hashCode() * 31) + b.g(this.f15196b)) * 31) + this.f15197c;
    }

    public boolean i() {
        return false;
    }

    public long j(float f10, float f11, float f12) {
        float[] fArrK = k(f10, f11, f12);
        float f13 = fArrK[0];
        float f14 = fArrK[1];
        return (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
    }

    public final float[] k(float f10, float f11, float f12) {
        return l(new float[]{f10, f11, f12});
    }

    public abstract float[] l(float[] fArr);

    public float m(float f10, float f11, float f12) {
        return k(f10, f11, f12)[2];
    }

    public long n(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArrA = a(f10, f11, f12);
        return l0.a(fArrA[0], fArrA[1], fArrA[2], f13, cVar);
    }

    public String toString() {
        return this.f15195a + " (id=" + this.f15197c + ", model=" + ((Object) b.h(this.f15196b)) + ')';
    }
}
