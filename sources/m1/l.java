package m1;

import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15247e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f15248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f15249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f15250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f15251i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    static {
        float[] fArrB = m1.a.f15184b.a().b();
        j jVar = j.f15235a;
        float[] fArrK = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(fArrB, jVar.b().c(), jVar.e().c()));
        f15248f = fArrK;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f15249g = fArr;
        f15250h = d.j(fArrK);
        f15251i = d.j(fArr);
    }

    public l(String str, int i10) {
        super(str, b.f15189a.a(), i10, null);
    }

    @Override // m1.c
    public float[] b(float[] fArr) {
        d.m(f15248f, fArr);
        double d10 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d10));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d10));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d10));
        d.m(f15249g, fArr);
        return fArr;
    }

    @Override // m1.c
    public float e(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // m1.c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // m1.c
    public long j(float f10, float f11, float f12) {
        float fK = ge.o.k(f10, 0.0f, 1.0f);
        float fK2 = ge.o.k(f11, -0.5f, 0.5f);
        float fK3 = ge.o.k(f12, -0.5f, 0.5f);
        float[] fArr = f15251i;
        float fN = d.n(fArr, fK, fK2, fK3);
        float fO = d.o(fArr, fK, fK2, fK3);
        float fP = d.p(fArr, fK, fK2, fK3);
        float f13 = fN * fN * fN;
        float f14 = fO * fO * fO;
        float f15 = fP * fP * fP;
        float[] fArr2 = f15250h;
        float fN2 = d.n(fArr2, f13, f14, f15);
        float fO2 = d.o(fArr2, f13, f14, f15);
        return (((long) Float.floatToRawIntBits(fN2)) << 32) | (((long) Float.floatToRawIntBits(fO2)) & 4294967295L);
    }

    @Override // m1.c
    public float[] l(float[] fArr) {
        fArr[0] = ge.o.k(fArr[0], 0.0f, 1.0f);
        fArr[1] = ge.o.k(fArr[1], -0.5f, 0.5f);
        fArr[2] = ge.o.k(fArr[2], -0.5f, 0.5f);
        d.m(f15251i, fArr);
        float f10 = fArr[0];
        fArr[0] = f10 * f10 * f10;
        float f11 = fArr[1];
        fArr[1] = f11 * f11 * f11;
        float f12 = fArr[2];
        fArr[2] = f12 * f12 * f12;
        d.m(f15250h, fArr);
        return fArr;
    }

    @Override // m1.c
    public float m(float f10, float f11, float f12) {
        float fK = ge.o.k(f10, 0.0f, 1.0f);
        float fK2 = ge.o.k(f11, -0.5f, 0.5f);
        float fK3 = ge.o.k(f12, -0.5f, 0.5f);
        float[] fArr = f15251i;
        float fN = d.n(fArr, fK, fK2, fK3);
        float fO = d.o(fArr, fK, fK2, fK3);
        float fP = d.p(fArr, fK, fK2, fK3);
        float f13 = fP * fP * fP;
        return d.p(f15250h, fN * fN * fN, fO * fO * fO, f13);
    }

    @Override // m1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f15248f;
        float fN = d.n(fArr, f10, f11, f12);
        float fO = d.o(fArr, f10, f11, f12);
        float fP = d.p(fArr, f10, f11, f12);
        double d10 = 0.33333334f;
        float fSignum = Math.signum(fN) * ((float) Math.pow(Math.abs(fN), d10));
        float fSignum2 = Math.signum(fO) * ((float) Math.pow(Math.abs(fO), d10));
        float fSignum3 = Math.signum(fP) * ((float) Math.pow(Math.abs(fP), d10));
        float[] fArr2 = f15249g;
        return l0.a(d.n(fArr2, fSignum, fSignum2, fSignum3), d.o(fArr2, fSignum, fSignum2, fSignum3), d.p(fArr2, fSignum, fSignum2, fSignum3), f13, cVar);
    }
}
