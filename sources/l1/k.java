package l1;

import android.graphics.Path;
import android.graphics.RectF;
import l1.j1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f14545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f14546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f14547d;

    public k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public k(Path path) {
        this.f14545b = path;
    }

    public /* synthetic */ k(Path path, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new Path() : path);
    }

    private final boolean r(k1.h hVar) {
        if (!(!Float.isNaN(hVar.f()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!Float.isNaN(hVar.i()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!Float.isNaN(hVar.g()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (!Float.isNaN(hVar.c())) {
            return true;
        }
        throw new IllegalStateException("Rect.bottom is NaN".toString());
    }

    @Override // l1.f1
    public boolean a() {
        return this.f14545b.isConvex();
    }

    @Override // l1.f1
    public void b(float f10, float f11) {
        this.f14545b.rMoveTo(f10, f11);
    }

    @Override // l1.f1
    public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f14545b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // l1.f1
    public void close() {
        this.f14545b.close();
    }

    @Override // l1.f1
    public void d(float f10, float f11, float f12, float f13) {
        this.f14545b.quadTo(f10, f11, f12, f13);
    }

    @Override // l1.f1
    public boolean e(f1 f1Var, f1 f1Var2, int i10) {
        j1.a aVar = j1.f14539a;
        Path.Op op = j1.f(i10, aVar.a()) ? Path.Op.DIFFERENCE : j1.f(i10, aVar.b()) ? Path.Op.INTERSECT : j1.f(i10, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : j1.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f14545b;
        if (!(f1Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathS = ((k) f1Var).s();
        if (f1Var2 instanceof k) {
            return path.op(pathS, ((k) f1Var2).s(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // l1.f1
    public void f(float f10, float f11, float f12, float f13) {
        this.f14545b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // l1.f1
    public void g(int i10) {
        this.f14545b.setFillType(h1.d(i10, h1.f14510a.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // l1.f1
    public k1.h getBounds() {
        if (this.f14546c == null) {
            this.f14546c = new RectF();
        }
        RectF rectF = this.f14546c;
        ae.r.c(rectF);
        this.f14545b.computeBounds(rectF, true);
        return new k1.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // l1.f1
    public void h(f1 f1Var, long j10) {
        Path path = this.f14545b;
        if (!(f1Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((k) f1Var).s(), k1.f.o(j10), k1.f.p(j10));
    }

    @Override // l1.f1
    public int i() {
        return this.f14545b.getFillType() == Path.FillType.EVEN_ODD ? h1.f14510a.a() : h1.f14510a.b();
    }

    @Override // l1.f1
    public boolean isEmpty() {
        return this.f14545b.isEmpty();
    }

    @Override // l1.f1
    public void j(k1.h hVar) {
        if (this.f14546c == null) {
            this.f14546c = new RectF();
        }
        RectF rectF = this.f14546c;
        ae.r.c(rectF);
        rectF.set(hVar.f(), hVar.i(), hVar.g(), hVar.c());
        Path path = this.f14545b;
        RectF rectF2 = this.f14546c;
        ae.r.c(rectF2);
        path.addOval(rectF2, Path.Direction.CCW);
    }

    @Override // l1.f1
    public void k(float f10, float f11) {
        this.f14545b.moveTo(f10, f11);
    }

    @Override // l1.f1
    public void l(k1.h hVar) {
        if (!r(hVar)) {
            throw new IllegalStateException("invalid rect".toString());
        }
        if (this.f14546c == null) {
            this.f14546c = new RectF();
        }
        RectF rectF = this.f14546c;
        ae.r.c(rectF);
        rectF.set(hVar.f(), hVar.i(), hVar.g(), hVar.c());
        Path path = this.f14545b;
        RectF rectF2 = this.f14546c;
        ae.r.c(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // l1.f1
    public void m(k1.j jVar) {
        if (this.f14546c == null) {
            this.f14546c = new RectF();
        }
        RectF rectF = this.f14546c;
        ae.r.c(rectF);
        rectF.set(jVar.e(), jVar.g(), jVar.f(), jVar.a());
        if (this.f14547d == null) {
            this.f14547d = new float[8];
        }
        float[] fArr = this.f14547d;
        ae.r.c(fArr);
        fArr[0] = k1.a.d(jVar.h());
        fArr[1] = k1.a.e(jVar.h());
        fArr[2] = k1.a.d(jVar.i());
        fArr[3] = k1.a.e(jVar.i());
        fArr[4] = k1.a.d(jVar.c());
        fArr[5] = k1.a.e(jVar.c());
        fArr[6] = k1.a.d(jVar.b());
        fArr[7] = k1.a.e(jVar.b());
        Path path = this.f14545b;
        RectF rectF2 = this.f14546c;
        ae.r.c(rectF2);
        float[] fArr2 = this.f14547d;
        ae.r.c(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // l1.f1
    public void n(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f14545b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // l1.f1
    public void o() {
        this.f14545b.rewind();
    }

    @Override // l1.f1
    public void p(float f10, float f11) {
        this.f14545b.rLineTo(f10, f11);
    }

    @Override // l1.f1
    public void q(float f10, float f11) {
        this.f14545b.lineTo(f10, f11);
    }

    @Override // l1.f1
    public void reset() {
        this.f14545b.reset();
    }

    public final Path s() {
        return this.f14545b;
    }
}
