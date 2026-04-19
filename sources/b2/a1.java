package b2;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class a1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.p<T, Matrix, md.i0> f5180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f5181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Matrix f5182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f5183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f5184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5185f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5186g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5187h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(zd.p<? super T, ? super Matrix, md.i0> pVar) {
        this.f5180a = pVar;
    }

    public final float[] a(T t10) {
        float[] fArrC = this.f5184e;
        if (fArrC == null) {
            fArrC = l1.z0.c(null, 1, null);
            this.f5184e = fArrC;
        }
        if (this.f5186g) {
            this.f5187h = y0.a(b(t10), fArrC);
            this.f5186g = false;
        }
        if (this.f5187h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(T t10) {
        float[] fArrC = this.f5183d;
        if (fArrC == null) {
            fArrC = l1.z0.c(null, 1, null);
            this.f5183d = fArrC;
        }
        if (!this.f5185f) {
            return fArrC;
        }
        Matrix matrix = this.f5181b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5181b = matrix;
        }
        this.f5180a.invoke(t10, matrix);
        Matrix matrix2 = this.f5182c;
        if (matrix2 == null || !ae.r.b(matrix, matrix2)) {
            l1.h.b(fArrC, matrix);
            this.f5181b = matrix2;
            this.f5182c = matrix;
        }
        this.f5185f = false;
        return fArrC;
    }

    public final void c() {
        this.f5185f = true;
        this.f5186g = true;
    }
}
