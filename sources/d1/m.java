package d1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f9386b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f9387c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f9388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9389e;

    public m() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f9388d = iArr;
    }

    private final int b() {
        int length = this.f9388d.length;
        if (this.f9389e >= length) {
            int i10 = 0;
            int i11 = length * 2;
            int[] iArr = new int[i11];
            while (i10 < i11) {
                int i12 = i10 + 1;
                iArr[i10] = i12;
                i10 = i12;
            }
            nd.o.k(this.f9388d, iArr, 0, 0, 0, 14, null);
            this.f9388d = iArr;
        }
        int i13 = this.f9389e;
        this.f9389e = this.f9388d[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.f9386b;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        nd.o.k(iArr, iArr2, 0, 0, 0, 14, null);
        nd.o.k(this.f9387c, iArr3, 0, 0, 0, 14, null);
        this.f9386b = iArr2;
        this.f9387c = iArr3;
    }

    private final void d(int i10) {
        this.f9388d[i10] = this.f9389e;
        this.f9389e = i10;
    }

    private final void g(int i10) {
        int i11;
        int[] iArr = this.f9386b;
        int i12 = this.f9385a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f9385a || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] >= iArr[i10]) {
                    return;
                }
                i(i14, i10);
                i10 = i14;
            } else {
                if (i11 >= iArr[i10]) {
                    return;
                }
                i(i13, i10);
                i10 = i13;
            }
        }
    }

    private final void h(int i10) {
        int[] iArr = this.f9386b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            i(i12, i10);
            i10 = i12;
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.f9386b;
        int[] iArr2 = this.f9387c;
        int[] iArr3 = this.f9388d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int i10) {
        c(this.f9385a + 1);
        int i11 = this.f9385a;
        this.f9385a = i11 + 1;
        int iB = b();
        this.f9386b[i11] = i10;
        this.f9387c[i11] = iB;
        this.f9388d[iB] = i11;
        h(i11);
        return iB;
    }

    public final int e(int i10) {
        return this.f9385a > 0 ? this.f9386b[0] : i10;
    }

    public final void f(int i10) {
        int i11 = this.f9388d[i10];
        i(i11, this.f9385a - 1);
        this.f9385a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
