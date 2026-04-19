package a2;

/* JADX INFO: loaded from: classes.dex */
final class f {
    public static int[] a(int[] iArr) {
        return iArr;
    }

    public static final int b(int[] iArr, int i10) {
        return iArr[i10 + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i10, int i11) {
        iArr[i10 + c(iArr)] = i11;
    }
}
