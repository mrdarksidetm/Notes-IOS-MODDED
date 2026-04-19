package t0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20909a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20910b;

    public final void a() {
        this.f20910b = 0;
    }

    public final int b() {
        return this.f20910b;
    }

    public final int c(int i10) {
        int i11 = this.f20910b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f20909a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f20910b == 0;
    }

    public final int e() {
        return this.f20909a[this.f20910b - 1];
    }

    public final int f(int i10) {
        return this.f20909a[i10];
    }

    public final int g(int i10) {
        return this.f20910b > 0 ? e() : i10;
    }

    public final int h() {
        int[] iArr = this.f20909a;
        int i10 = this.f20910b - 1;
        this.f20910b = i10;
        return iArr[i10];
    }

    public final void i(int i10) {
        int i11 = this.f20910b;
        int[] iArr = this.f20909a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f20909a = iArrCopyOf;
        }
        int[] iArr2 = this.f20909a;
        int i12 = this.f20910b;
        this.f20910b = i12 + 1;
        iArr2[i12] = i10;
    }
}
