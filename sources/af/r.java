package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends d1<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f815b;

    public r(double[] dArr) {
        ae.r.f(dArr, "bufferWithData");
        this.f814a = dArr;
        this.f815b = dArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        double[] dArr = this.f814a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, ge.o.d(i10, dArr.length * 2));
            ae.r.e(dArrCopyOf, "copyOf(this, newSize)");
            this.f814a = dArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f815b;
    }

    public final void e(double d10) {
        d1.c(this, 0, 1, null);
        double[] dArr = this.f814a;
        int iD = d();
        this.f815b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f814a, d());
        ae.r.e(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }
}
