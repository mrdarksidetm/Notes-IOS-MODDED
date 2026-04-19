package l1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14653b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f14654a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private /* synthetic */ z0(float[] fArr) {
        this.f14654a = fArr;
    }

    public static final /* synthetic */ z0 a(float[] fArr) {
        return new z0(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, ae.j jVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof z0) && ae.r.b(fArr, ((z0) obj).o());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float fO = k1.f.o(j10);
        float fP = k1.f.p(j10);
        float f10 = 1 / (((fArr[3] * fO) + (fArr[7] * fP)) + fArr[15]);
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            f10 = 0.0f;
        }
        return k1.g.a(((fArr[0] * fO) + (fArr[4] * fP) + fArr[12]) * f10, f10 * ((fArr[1] * fO) + (fArr[5] * fP) + fArr[13]));
    }

    public static final void g(float[] fArr, k1.d dVar) {
        long jF = f(fArr, k1.g.a(dVar.b(), dVar.d()));
        long jF2 = f(fArr, k1.g.a(dVar.b(), dVar.a()));
        long jF3 = f(fArr, k1.g.a(dVar.c(), dVar.d()));
        long jF4 = f(fArr, k1.g.a(dVar.c(), dVar.a()));
        dVar.i(Math.min(Math.min(k1.f.o(jF), k1.f.o(jF2)), Math.min(k1.f.o(jF3), k1.f.o(jF4))));
        dVar.k(Math.min(Math.min(k1.f.p(jF), k1.f.p(jF2)), Math.min(k1.f.p(jF3), k1.f.p(jF4))));
        dVar.j(Math.max(Math.max(k1.f.o(jF), k1.f.o(jF2)), Math.max(k1.f.o(jF3), k1.f.o(jF4))));
        dVar.h(Math.max(Math.max(k1.f.p(jF), k1.f.p(jF2)), Math.max(k1.f.p(jF3), k1.f.p(jF4))));
    }

    public static final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fCos * f11) + (fSin * f12);
        float f14 = -fSin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (fCos * f15) + (fSin * f16);
        float f18 = fArr[2];
        float f19 = fArr[6];
        float f20 = (fCos * f18) + (fSin * f19);
        float f21 = fArr[3];
        float f22 = fArr[7];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f20;
        fArr[3] = (fCos * f21) + (fSin * f22);
        fArr[4] = (f11 * f14) + (f12 * fCos);
        fArr[5] = (f15 * f14) + (f16 * fCos);
        fArr[6] = (f18 * f14) + (f19 * fCos);
        fArr[7] = (f14 * f21) + (fCos * f22);
    }

    public static final void j(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static final void k(float[] fArr, float[] fArr2) {
        float fB = a1.b(fArr, 0, fArr2, 0);
        float fB2 = a1.b(fArr, 0, fArr2, 1);
        float fB3 = a1.b(fArr, 0, fArr2, 2);
        float fB4 = a1.b(fArr, 0, fArr2, 3);
        float fB5 = a1.b(fArr, 1, fArr2, 0);
        float fB6 = a1.b(fArr, 1, fArr2, 1);
        float fB7 = a1.b(fArr, 1, fArr2, 2);
        float fB8 = a1.b(fArr, 1, fArr2, 3);
        float fB9 = a1.b(fArr, 2, fArr2, 0);
        float fB10 = a1.b(fArr, 2, fArr2, 1);
        float fB11 = a1.b(fArr, 2, fArr2, 2);
        float fB12 = a1.b(fArr, 2, fArr2, 3);
        float fB13 = a1.b(fArr, 3, fArr2, 0);
        float fB14 = a1.b(fArr, 3, fArr2, 1);
        float fB15 = a1.b(fArr, 3, fArr2, 2);
        float fB16 = a1.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static String l(float[] fArr) {
        return je.o.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void m(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void n(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        m(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f14654a, obj);
    }

    public int hashCode() {
        return e(this.f14654a);
    }

    public final /* synthetic */ float[] o() {
        return this.f14654a;
    }

    public String toString() {
        return l(this.f14654a);
    }
}
