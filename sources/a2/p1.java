package a2;

/* JADX INFO: loaded from: classes.dex */
final class p1 {
    public static final void a(int[] iArr, w wVar) {
        int iH;
        int i10;
        if (!f(iArr)) {
            wVar.g(h(iArr), i(iArr), d(iArr) - h(iArr));
            return;
        }
        if (g(iArr)) {
            iH = h(iArr);
        } else {
            if (j(iArr)) {
                iH = h(iArr);
                i10 = i(iArr) + 1;
                wVar.g(iH, i10, c(iArr));
            }
            iH = h(iArr) + 1;
        }
        i10 = i(iArr);
        wVar.g(iH, i10, c(iArr));
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        return e(iArr) - i(iArr) != d(iArr) - h(iArr);
    }

    public static final boolean g(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        return e(iArr) - i(iArr) > d(iArr) - h(iArr);
    }
}
