package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f14489a = c.f14497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f14490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f14491c;

    @Override // l1.b0
    public void a(f1 f1Var, int i10) {
        Canvas canvas = this.f14489a;
        if (!(f1Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((k) f1Var).s(), y(i10));
    }

    @Override // l1.b0
    public void b(float f10, float f11, float f12, float f13, int i10) {
        this.f14489a.clipRect(f10, f11, f12, f13, y(i10));
    }

    @Override // l1.b0
    public void c(float f10, float f11) {
        this.f14489a.translate(f10, f11);
    }

    @Override // l1.b0
    public void d(float f10, float f11) {
        this.f14489a.scale(f10, f11);
    }

    @Override // l1.b0
    public void f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, d1 d1Var) {
        this.f14489a.drawArc(f10, f11, f12, f13, f14, f15, z10, d1Var.j());
    }

    @Override // l1.b0
    public void h() {
        this.f14489a.save();
    }

    @Override // l1.b0
    public void i() {
        e0.f14499a.a(this.f14489a, false);
    }

    @Override // l1.b0
    public void k(v0 v0Var, long j10, long j11, long j12, long j13, d1 d1Var) {
        if (this.f14490b == null) {
            this.f14490b = new Rect();
            this.f14491c = new Rect();
        }
        Canvas canvas = this.f14489a;
        Bitmap bitmapB = g.b(v0Var);
        Rect rect = this.f14490b;
        ae.r.c(rect);
        rect.left = w2.n.j(j10);
        rect.top = w2.n.k(j10);
        rect.right = w2.n.j(j10) + w2.p.g(j11);
        rect.bottom = w2.n.k(j10) + w2.p.f(j11);
        md.i0 i0Var = md.i0.f15558a;
        Rect rect2 = this.f14491c;
        ae.r.c(rect2);
        rect2.left = w2.n.j(j12);
        rect2.top = w2.n.k(j12);
        rect2.right = w2.n.j(j12) + w2.p.g(j13);
        rect2.bottom = w2.n.k(j12) + w2.p.f(j13);
        canvas.drawBitmap(bitmapB, rect, rect2, d1Var.j());
    }

    @Override // l1.b0
    public void l(float[] fArr) {
        if (a1.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        h.a(matrix, fArr);
        this.f14489a.concat(matrix);
    }

    @Override // l1.b0
    public void n(k1.h hVar, d1 d1Var) {
        this.f14489a.saveLayer(hVar.f(), hVar.i(), hVar.g(), hVar.c(), d1Var.j(), 31);
    }

    @Override // l1.b0
    public void o(f1 f1Var, d1 d1Var) {
        Canvas canvas = this.f14489a;
        if (!(f1Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((k) f1Var).s(), d1Var.j());
    }

    @Override // l1.b0
    public void p() {
        this.f14489a.restore();
    }

    @Override // l1.b0
    public void q(long j10, long j11, d1 d1Var) {
        this.f14489a.drawLine(k1.f.o(j10), k1.f.p(j10), k1.f.o(j11), k1.f.p(j11), d1Var.j());
    }

    @Override // l1.b0
    public void s(float f10, float f11, float f12, float f13, float f14, float f15, d1 d1Var) {
        this.f14489a.drawRoundRect(f10, f11, f12, f13, f14, f15, d1Var.j());
    }

    @Override // l1.b0
    public void t() {
        e0.f14499a.a(this.f14489a, true);
    }

    @Override // l1.b0
    public void u(float f10, float f11, float f12, float f13, d1 d1Var) {
        this.f14489a.drawRect(f10, f11, f12, f13, d1Var.j());
    }

    @Override // l1.b0
    public void v(long j10, float f10, d1 d1Var) {
        this.f14489a.drawCircle(k1.f.o(j10), k1.f.p(j10), f10, d1Var.j());
    }

    public final Canvas w() {
        return this.f14489a;
    }

    public final void x(Canvas canvas) {
        this.f14489a = canvas;
    }

    public final Region.Op y(int i10) {
        return i0.d(i10, i0.f14518a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
