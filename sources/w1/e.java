package w1;

import java.util.List;
import t0.k1;
import t0.k3;
import v1.b0;
import v1.f;
import v1.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1 f22394a = k3.e(Boolean.FALSE, null, 2, null);

    public static final void c(d dVar, b0 b0Var) {
        if (h()) {
            e(dVar, b0Var);
        } else {
            d(dVar, b0Var);
        }
    }

    private static final void d(d dVar, b0 b0Var) {
        if (q.b(b0Var)) {
            dVar.f(b0Var.i());
            dVar.e();
        }
        long jL = b0Var.l();
        List<f> listF = b0Var.f();
        int i10 = 0;
        int size = listF.size();
        while (i10 < size) {
            f fVar = listF.get(i10);
            long jS = k1.f.s(fVar.b(), jL);
            long jB = fVar.b();
            dVar.f(k1.f.t(dVar.c(), jS));
            dVar.a(fVar.c(), dVar.c());
            i10++;
            jL = jB;
        }
        dVar.f(k1.f.t(dVar.c(), k1.f.s(b0Var.i(), jL)));
        dVar.a(b0Var.p(), dVar.c());
    }

    private static final void e(d dVar, b0 b0Var) {
        if (q.b(b0Var)) {
            dVar.e();
        }
        if (!q.d(b0Var)) {
            List<f> listF = b0Var.f();
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = listF.get(i10);
                dVar.a(fVar.c(), fVar.a());
            }
            dVar.a(b0Var.p(), b0Var.h());
        }
        if (q.d(b0Var) && b0Var.p() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(b0Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i10, boolean z10) {
        float fAbs = 0.0f;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            if (f10 == f11) {
                return 0.0f;
            }
            return (z10 ? fArr[0] : fArr[0] - fArr[1]) / (f10 - f11);
        }
        int i11 = i10 - 1;
        for (int i12 = i11; i12 > 0; i12--) {
            int i13 = i12 - 1;
            if (!(fArr2[i12] == fArr2[i13])) {
                float fSignum = Math.signum(fAbs) * ((float) Math.sqrt(2 * Math.abs(fAbs)));
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (fArr2[i12] - fArr2[i13]);
                fAbs += (f12 - fSignum) * Math.abs(f12);
                if (i12 == i11) {
                    fAbs *= 0.5f;
                }
            }
        }
        return Math.signum(fAbs) * ((float) Math.sqrt(2 * Math.abs(fAbs)));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean h() {
        return ((Boolean) f22394a.getValue()).booleanValue();
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            float[] fArr8 = fArr4[i19];
            for (int i20 = 0; i20 < i10; i20++) {
                fArr7[i20] = fArr8[i20];
            }
            for (int i21 = 0; i21 < i19; i21++) {
                float[] fArr9 = fArr5[i21];
                float fG = g(fArr7, fArr9);
                for (int i22 = 0; i22 < i10; i22++) {
                    fArr7[i22] = fArr7[i22] - (fArr9[i22] * fG);
                }
            }
            float fSqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f10 = 1.0f / fSqrt;
            for (int i23 = 0; i23 < i10; i23++) {
                fArr7[i23] = fArr7[i23] * f10;
            }
            float[] fArr10 = fArr6[i19];
            int i24 = 0;
            while (i24 < i13) {
                fArr10[i24] = i24 < i19 ? 0.0f : g(fArr7, fArr4[i24]);
                i24++;
            }
            i19++;
        }
        int i25 = i13 - 1;
        for (int i26 = i25; -1 < i26; i26--) {
            fArr3[i26] = g(fArr5[i26], fArr2);
            int i27 = i26 + 1;
            if (i27 <= i25) {
                int i28 = i25;
                while (true) {
                    fArr3[i26] = fArr3[i26] - (fArr6[i26][i28] * fArr3[i28]);
                    if (i28 != i27) {
                        i28--;
                    }
                }
            }
            fArr3[i26] = fArr3[i26] / fArr6[i26][i26];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
        } else {
            aVar.d(j10);
            aVar.c(f10);
        }
    }
}
