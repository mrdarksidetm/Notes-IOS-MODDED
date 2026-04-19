package l1;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final Shader a(long j10, long j11, List<j0> list, List<Float> list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new LinearGradient(k1.f.o(j10), k1.f.p(j10), k1.f.o(j11), k1.f.p(j11), d(list, iC), e(list2, list, iC), r.a(i10));
    }

    public static final Shader b(long j10, float f10, List<j0> list, List<Float> list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new RadialGradient(k1.f.o(j10), k1.f.p(j10), f10, d(list, iC), e(list2, list, iC), r.a(i10));
    }

    public static final int c(List<j0> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = nd.u.o(list);
        int i10 = 0;
        for (int i11 = 1; i11 < iO; i11++) {
            if (j0.x(list.get(i11).E()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] d(List<j0> list, int i10) {
        int i11;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = l0.i(list.get(i12).E());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iO = nd.u.o(list);
        int size2 = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            long jE = list.get(i14).E();
            if (j0.x(jE) == 0.0f) {
                if (i14 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = l0.i(j0.u(list.get(1).E(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i14 == iO) {
                    i11 = i13 + 1;
                    iArr2[i13] = l0.i(j0.u(list.get(i14 - 1).E(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i13 + 1;
                    iArr2[i13] = l0.i(j0.u(list.get(i14 - 1).E(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 = i15 + 1;
                    iArr2[i15] = l0.i(j0.u(list.get(i14 + 1).E(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = l0.i(jE);
                i13++;
            }
        }
        return iArr2;
    }

    public static final float[] e(List<Float> list, List<j0> list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return nd.c0.z0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iO = nd.u.o(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iO; i12++) {
            long jE = list2.get(i12).E();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / nd.u.o(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (j0.x(jE) == 0.0f) {
                i11 = i13 + 1;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(nd.u.o(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void f(List<j0> list, List<Float> list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
