package m1;

import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15246e = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public k(String str, int i10) {
        super(str, b.f15189a.a(), i10, null);
    }

    @Override // m1.c
    public float[] b(float[] fArr) {
        float f10 = fArr[0];
        j jVar = j.f15235a;
        float f11 = f10 / jVar.c()[0];
        float f12 = fArr[1] / jVar.c()[1];
        float f13 = fArr[2] / jVar.c()[2];
        float fPow = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float fPow2 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float fPow3 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        fArr[0] = ge.o.k((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = ge.o.k((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = ge.o.k((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // m1.c
    public float e(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // m1.c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // m1.c
    public long j(float f10, float f11, float f12) {
        float fK = (ge.o.k(f10, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fK2 = (ge.o.k(f11, -128.0f, 128.0f) * 0.002f) + fK;
        float f13 = fK2 > 0.20689656f ? fK2 * fK2 * fK2 : (fK2 - 0.13793103f) * 0.12841855f;
        float f14 = fK > 0.20689656f ? fK * fK * fK : (fK - 0.13793103f) * 0.12841855f;
        j jVar = j.f15235a;
        float f15 = f13 * jVar.c()[0];
        return (((long) Float.floatToRawIntBits(f14 * jVar.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32);
    }

    @Override // m1.c
    public float[] l(float[] fArr) {
        fArr[0] = ge.o.k(fArr[0], 0.0f, 100.0f);
        fArr[1] = ge.o.k(fArr[1], -128.0f, 128.0f);
        float fK = ge.o.k(fArr[2], -128.0f, 128.0f);
        fArr[2] = fK;
        float f10 = (fArr[0] + 16.0f) / 116.0f;
        float f11 = (fArr[1] * 0.002f) + f10;
        float f12 = f10 - (fK * 0.005f);
        float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        j jVar = j.f15235a;
        fArr[0] = f13 * jVar.c()[0];
        fArr[1] = f14 * jVar.c()[1];
        fArr[2] = f15 * jVar.c()[2];
        return fArr;
    }

    @Override // m1.c
    public float m(float f10, float f11, float f12) {
        float fK = ((ge.o.k(f10, 0.0f, 100.0f) + 16.0f) / 116.0f) - (ge.o.k(f12, -128.0f, 128.0f) * 0.005f);
        return (fK > 0.20689656f ? fK * fK * fK : 0.12841855f * (fK - 0.13793103f)) * j.f15235a.c()[2];
    }

    @Override // m1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        j jVar = j.f15235a;
        float f14 = f10 / jVar.c()[0];
        float f15 = f11 / jVar.c()[1];
        float f16 = f12 / jVar.c()[2];
        float fPow = f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        float fPow2 = f15 > 0.008856452f ? (float) Math.pow(f15, 0.33333334f) : (f15 * 7.787037f) + 0.13793103f;
        return l0.a(ge.o.k((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), ge.o.k((fPow - fPow2) * 500.0f, -128.0f, 128.0f), ge.o.k((fPow2 - (f16 > 0.008856452f ? (float) Math.pow(f16, 0.33333334f) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f13, cVar);
    }
}
