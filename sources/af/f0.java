package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends d1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f757b;

    public f0(int[] iArr) {
        ae.r.f(iArr, "bufferWithData");
        this.f756a = iArr;
        this.f757b = iArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        int[] iArr = this.f756a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, ge.o.d(i10, iArr.length * 2));
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f756a = iArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f757b;
    }

    public final void e(int i10) {
        d1.c(this, 0, 1, null);
        int[] iArr = this.f756a;
        int iD = d();
        this.f757b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f756a, d());
        ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }
}
