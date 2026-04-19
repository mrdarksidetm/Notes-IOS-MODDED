package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d1<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f755b;

    public f(boolean[] zArr) {
        ae.r.f(zArr, "bufferWithData");
        this.f754a = zArr;
        this.f755b = zArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        boolean[] zArr = this.f754a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, ge.o.d(i10, zArr.length * 2));
            ae.r.e(zArrCopyOf, "copyOf(this, newSize)");
            this.f754a = zArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f755b;
    }

    public final void e(boolean z10) {
        d1.c(this, 0, 1, null);
        boolean[] zArr = this.f754a;
        int iD = d();
        this.f755b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f754a, d());
        ae.r.e(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }
}
