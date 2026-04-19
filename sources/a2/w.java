package a2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f342b;

    public w(int i10) {
        this.f341a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f341a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        if (i12 >= i13) {
            return i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1];
        }
        return true;
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iE = e(i10, i11, i12);
            i(i10, iE - i12, i12);
            i(iE + i12, i11, i12);
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.f341a;
        t0.i(iArr, i10, i11);
        t0.i(iArr, i10 + 1, i11 + 1);
        t0.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f341a[i10];
    }

    public final int c() {
        return this.f342b;
    }

    public final boolean d() {
        return this.f342b != 0;
    }

    public final int f() {
        int[] iArr = this.f341a;
        int i10 = this.f342b - 1;
        this.f342b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f342b;
        int i14 = i13 + 3;
        int[] iArr = this.f341a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f341a = iArrCopyOf;
        }
        int[] iArr2 = this.f341a;
        iArr2[i13 + 0] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f342b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f342b;
        int i15 = i14 + 4;
        int[] iArr = this.f341a;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f341a = iArrCopyOf;
        }
        int[] iArr2 = this.f341a;
        iArr2[i14 + 0] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f342b = i15;
    }

    public final void j() {
        int i10 = this.f342b;
        if (!(i10 % 3 == 0)) {
            throw new IllegalStateException("Array size not a multiple of 3".toString());
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
