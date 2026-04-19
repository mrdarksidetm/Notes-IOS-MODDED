package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends d1<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f867b;

    public z(float[] fArr) {
        ae.r.f(fArr, "bufferWithData");
        this.f866a = fArr;
        this.f867b = fArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        float[] fArr = this.f866a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, ge.o.d(i10, fArr.length * 2));
            ae.r.e(fArrCopyOf, "copyOf(this, newSize)");
            this.f866a = fArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f867b;
    }

    public final void e(float f10) {
        d1.c(this, 0, 1, null);
        float[] fArr = this.f866a;
        int iD = d();
        this.f867b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f866a, d());
        ae.r.e(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }
}
