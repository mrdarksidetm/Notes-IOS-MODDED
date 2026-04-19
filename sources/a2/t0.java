package a2;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    private static final void b(w wVar, o oVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < wVar.c()) {
            int i13 = i10 + 2;
            int iB = wVar.b(i10) - wVar.b(i13);
            int iB2 = wVar.b(i10 + 1) - wVar.b(i13);
            int iB3 = wVar.b(i13);
            i10 += 3;
            while (i11 < iB) {
                oVar.a(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                oVar.d(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    oVar.c(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && f.b(iArr2, i19 + 1) < f.b(iArr2, i19 - 1))) {
                iB = f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 + 1;
            while (i15 > i10 && i20 > i12) {
                if (!oVar.b(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            f.d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final w d(int i10, int i11, o oVar) {
        int i12 = ((i10 + i11) + 1) / 2;
        w wVar = new w(i12 * 3);
        w wVar2 = new w(i12 * 4);
        wVar2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = f.a(new int[i13]);
        int[] iArrA2 = f.a(new int[i13]);
        int[] iArrB = p1.b(new int[5]);
        while (wVar2.d()) {
            int iF = wVar2.f();
            int iF2 = wVar2.f();
            int iF3 = wVar2.f();
            int iF4 = wVar2.f();
            int[] iArr = iArrA;
            int[] iArr2 = iArrA2;
            if (h(iF4, iF3, iF2, iF, oVar, iArrA, iArrA2, iArrB)) {
                if (p1.c(iArrB) > 0) {
                    p1.a(iArrB, wVar);
                }
                wVar2.h(iF4, p1.h(iArrB), iF2, p1.i(iArrB));
                wVar2.h(p1.d(iArrB), iF3, p1.e(iArrB), iF);
            }
            iArrA = iArr;
            iArrA2 = iArr2;
        }
        wVar.j();
        wVar.g(i10, i11, 0);
        return wVar;
    }

    public static final void e(int i10, int i11, o oVar) {
        b(d(i10, i11, oVar), oVar);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = Math.abs(i17) % 2 == 1;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && f.b(iArr, i19 + 1) > f.b(iArr, i19 - 1))) {
                iB = f.b(iArr, i19 + 1);
                i15 = iB;
            } else {
                iB = f.b(iArr, i19 - 1);
                i15 = iB + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 - 1;
            while (i15 < i11 && i20 < i13) {
                if (!oVar.b(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            f.d(iArr, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 + 1 && i16 <= i14 - 1) {
                if (f.b(iArr2, i16) <= i15) {
                    f(iB, i21, i15, i20, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            f.d(iArr, 1, i10);
            f.d(iArr2, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17;
                if (g(i10, i11, i12, i13, oVar, iArr, iArr2, i17, iArr3) || c(i10, i11, i12, i13, oVar, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i17 = i18 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
