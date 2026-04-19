package b2;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static zd.l<? super p2.z, ? extends p2.z> f5425a = a.f5426a;

    static final class a extends ae.s implements zd.l<p2.z, p2.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5426a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p2.z invoke(p2.z zVar) {
            return zVar;
        }
    }

    private static final float d(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 0] * fArr2[0 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    public static final w2.r e(Configuration configuration) {
        return g(configuration.getLayoutDirection());
    }

    public static final zd.l<p2.z, p2.z> f() {
        return f5425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w2.r g(int i10) {
        return (i10 == 0 || i10 != 1) ? w2.r.Ltr : w2.r.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(float[] fArr, float[] fArr2) {
        float fD = d(fArr2, 0, fArr, 0);
        float fD2 = d(fArr2, 0, fArr, 1);
        float fD3 = d(fArr2, 0, fArr, 2);
        float fD4 = d(fArr2, 0, fArr, 3);
        float fD5 = d(fArr2, 1, fArr, 0);
        float fD6 = d(fArr2, 1, fArr, 1);
        float fD7 = d(fArr2, 1, fArr, 2);
        float fD8 = d(fArr2, 1, fArr, 3);
        float fD9 = d(fArr2, 2, fArr, 0);
        float fD10 = d(fArr2, 2, fArr, 1);
        float fD11 = d(fArr2, 2, fArr, 2);
        float fD12 = d(fArr2, 2, fArr, 3);
        float fD13 = d(fArr2, 3, fArr, 0);
        float fD14 = d(fArr2, 3, fArr, 1);
        float fD15 = d(fArr2, 3, fArr, 2);
        float fD16 = d(fArr2, 3, fArr, 3);
        fArr[0] = fD;
        fArr[1] = fD2;
        fArr[2] = fD3;
        fArr[3] = fD4;
        fArr[4] = fD5;
        fArr[5] = fD6;
        fArr[6] = fD7;
        fArr[7] = fD8;
        fArr[8] = fD9;
        fArr[9] = fD10;
        fArr[10] = fD11;
        fArr[11] = fD12;
        fArr[12] = fD13;
        fArr[13] = fD14;
        fArr[14] = fD15;
        fArr[15] = fD16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float f10, float f11, float[] fArr2) {
        l1.z0.h(fArr2);
        l1.z0.n(fArr2, f10, f11, 0.0f, 4, null);
        h(fArr, fArr2);
    }
}
