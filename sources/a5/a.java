package a5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import n3.g;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f549g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f550h = new n4.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f551i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f557f;

    /* JADX INFO: renamed from: a5.a$a, reason: collision with other inner class name */
    class C0019a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f558a;

        C0019a(c cVar) {
            this.f558a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.n(fFloatValue, this.f558a);
            a.this.b(fFloatValue, this.f558a, false);
            a.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f560a;

        b(c cVar) {
            this.f560a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            a.this.b(1.0f, this.f560a, true);
            this.f560a.A();
            this.f560a.l();
            a aVar = a.this;
            if (!aVar.f557f) {
                aVar.f556e += 1.0f;
                return;
            }
            aVar.f557f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f560a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f556e = 0.0f;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f562a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f569h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f570i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f571j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f572k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f573l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f574m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f575n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f576o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f577p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f578q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f579r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f580s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f581t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f582u;

        c() {
            Paint paint = new Paint();
            this.f563b = paint;
            Paint paint2 = new Paint();
            this.f564c = paint2;
            Paint paint3 = new Paint();
            this.f565d = paint3;
            this.f566e = 0.0f;
            this.f567f = 0.0f;
            this.f568g = 0.0f;
            this.f569h = 5.0f;
            this.f577p = 1.0f;
            this.f581t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f572k = this.f566e;
            this.f573l = this.f567f;
            this.f574m = this.f568g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f562a;
            float f10 = this.f578q;
            float fMin = (this.f569h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f579r * this.f577p) / 2.0f, this.f569h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f566e;
            float f12 = this.f568g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f567f + f12) * 360.0f) - f13;
            this.f563b.setColor(this.f582u);
            this.f563b.setAlpha(this.f581t);
            float f15 = this.f569h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f565d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f563b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f575n) {
                Path path = this.f576o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f576o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f579r * this.f577p) / 2.0f;
                this.f576o.moveTo(0.0f, 0.0f);
                this.f576o.lineTo(this.f579r * this.f577p, 0.0f);
                Path path3 = this.f576o;
                float f13 = this.f579r;
                float f14 = this.f577p;
                path3.lineTo((f13 * f14) / 2.0f, this.f580s * f14);
                this.f576o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f569h / 2.0f));
                this.f576o.close();
                this.f564c.setColor(this.f582u);
                this.f564c.setAlpha(this.f581t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f576o, this.f564c);
                canvas.restore();
            }
        }

        int c() {
            return this.f581t;
        }

        float d() {
            return this.f567f;
        }

        int e() {
            return this.f570i[f()];
        }

        int f() {
            return (this.f571j + 1) % this.f570i.length;
        }

        float g() {
            return this.f566e;
        }

        int h() {
            return this.f570i[this.f571j];
        }

        float i() {
            return this.f573l;
        }

        float j() {
            return this.f574m;
        }

        float k() {
            return this.f572k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f572k = 0.0f;
            this.f573l = 0.0f;
            this.f574m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f581t = i10;
        }

        void o(float f10, float f11) {
            this.f579r = (int) f10;
            this.f580s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f577p) {
                this.f577p = f10;
            }
        }

        void q(float f10) {
            this.f578q = f10;
        }

        void r(int i10) {
            this.f582u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f563b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f571j = i10;
            this.f582u = this.f570i[i10];
        }

        void u(int[] iArr) {
            this.f570i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f567f = f10;
        }

        void w(float f10) {
            this.f568g = f10;
        }

        void x(boolean z10) {
            if (this.f575n != z10) {
                this.f575n = z10;
            }
        }

        void y(float f10) {
            this.f566e = f10;
        }

        void z(float f10) {
            this.f569h = f10;
            this.f563b.setStrokeWidth(f10);
        }
    }

    public a(Context context) {
        this.f554c = ((Context) g.h(context)).getResources();
        c cVar = new c();
        this.f552a = cVar;
        cVar.u(f551i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f553b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f552a;
        float f14 = this.f554c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f552a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0019a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f549g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f555d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f557f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f550h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f550h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f556e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f552a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f553b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f552a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f552a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f552a.u(iArr);
        this.f552a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f552a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f552a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f555d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f552a.y(f10);
        this.f552a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f552a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 11.0f;
            f11 = 3.0f;
            f12 = 12.0f;
            f13 = 6.0f;
        } else {
            f10 = 7.5f;
            f11 = 2.5f;
            f12 = 10.0f;
            f13 = 5.0f;
        }
        i(f10, f11, f12, f13);
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        cVar.r(f10 > 0.75f ? c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f552a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f552a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f555d.cancel();
        this.f552a.A();
        if (this.f552a.d() != this.f552a.g()) {
            this.f557f = true;
            animator = this.f555d;
            j10 = 666;
        } else {
            this.f552a.t(0);
            this.f552a.m();
            animator = this.f555d;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f555d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f555d.cancel();
        h(0.0f);
        this.f552a.x(false);
        this.f552a.t(0);
        this.f552a.m();
        invalidateSelf();
    }
}
