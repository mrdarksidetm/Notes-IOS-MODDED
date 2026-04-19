package p003if;

import ae.r;
import hf.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        r.f(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(f0 f0Var, int i10) {
        r.f(f0Var, "<this>");
        int iA = a(f0Var.M(), i10 + 1, 0, f0Var.N().length);
        return iA >= 0 ? iA : ~iA;
    }
}
