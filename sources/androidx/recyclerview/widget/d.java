package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.m implements RecyclerView.r {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.s C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f4825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f4826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f4829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f4830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f4832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f4833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f4834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f4835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f4836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f4837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f4838p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f4841s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f4848z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4839q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4840r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4842t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4843u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4844v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4845w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f4846x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f4847y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.o(500);
        }
    }

    class b extends RecyclerView.s {
        b() {
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4851a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4851a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4851a) {
                this.f4851a = false;
                return;
            }
            if (((Float) d.this.f4848z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.w(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.t();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0113d implements ValueAnimator.AnimatorUpdateListener {
        C0113d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4825c.setAlpha(iFloatValue);
            d.this.f4826d.setAlpha(iFloatValue);
            d.this.t();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4848z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f4825c = stateListDrawable;
        this.f4826d = drawable;
        this.f4829g = stateListDrawable2;
        this.f4830h = drawable2;
        this.f4827e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4828f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4831i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4832j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4823a = i11;
        this.f4824b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0113d());
        h(recyclerView);
    }

    private void i() {
        this.f4841s.removeCallbacks(this.B);
    }

    private void j() {
        this.f4841s.o0(this);
        this.f4841s.p0(this);
        this.f4841s.q0(this.C);
        i();
    }

    private void k(Canvas canvas) {
        int i10 = this.f4840r;
        int i11 = this.f4831i;
        int i12 = this.f4837o;
        int i13 = this.f4836n;
        this.f4829g.setBounds(0, 0, i13, i11);
        this.f4830h.setBounds(0, 0, this.f4839q, this.f4832j);
        canvas.translate(0.0f, i10 - i11);
        this.f4830h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f4829g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void l(Canvas canvas) {
        int i10 = this.f4839q;
        int i11 = this.f4827e;
        int i12 = i10 - i11;
        int i13 = this.f4834l;
        int i14 = this.f4833k;
        int i15 = i13 - (i14 / 2);
        this.f4825c.setBounds(0, 0, i11, i14);
        this.f4826d.setBounds(0, 0, this.f4828f, this.f4840r);
        if (q()) {
            this.f4826d.draw(canvas);
            canvas.translate(this.f4827e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4825c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i12 = this.f4827e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f4826d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f4825c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    private int[] m() {
        int[] iArr = this.f4847y;
        int i10 = this.f4824b;
        iArr[0] = i10;
        iArr[1] = this.f4839q - i10;
        return iArr;
    }

    private int[] n() {
        int[] iArr = this.f4846x;
        int i10 = this.f4824b;
        iArr[0] = i10;
        iArr[1] = this.f4840r - i10;
        return iArr;
    }

    private void p(float f10) {
        int[] iArrM = m();
        float fMax = Math.max(iArrM[0], Math.min(iArrM[1], f10));
        if (Math.abs(this.f4837o - fMax) < 2.0f) {
            return;
        }
        int iV = v(this.f4838p, fMax, iArrM, this.f4841s.computeHorizontalScrollRange(), this.f4841s.computeHorizontalScrollOffset(), this.f4839q);
        if (iV != 0) {
            this.f4841s.scrollBy(iV, 0);
        }
        this.f4838p = fMax;
    }

    private boolean q() {
        return androidx.core.view.h.t(this.f4841s) == 1;
    }

    private void u(int i10) {
        i();
        this.f4841s.postDelayed(this.B, i10);
    }

    private int v(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void x() {
        this.f4841s.c(this);
        this.f4841s.e(this);
        this.f4841s.f(this.C);
    }

    private void z(float f10) {
        int[] iArrN = n();
        float fMax = Math.max(iArrN[0], Math.min(iArrN[1], f10));
        if (Math.abs(this.f4834l - fMax) < 2.0f) {
            return;
        }
        int iV = v(this.f4835m, fMax, iArrN, this.f4841s.computeVerticalScrollRange(), this.f4841s.computeVerticalScrollOffset(), this.f4840r);
        if (iV != 0) {
            this.f4841s.scrollBy(0, iV);
        }
        this.f4835m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4844v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zS = s(motionEvent.getX(), motionEvent.getY());
            boolean zR = r(motionEvent.getX(), motionEvent.getY());
            if (zS || zR) {
                if (zR) {
                    this.f4845w = 1;
                    this.f4838p = (int) motionEvent.getX();
                } else if (zS) {
                    this.f4845w = 2;
                    this.f4835m = (int) motionEvent.getY();
                }
                w(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4844v == 2) {
            this.f4835m = 0.0f;
            this.f4838p = 0.0f;
            w(1);
            this.f4845w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4844v == 2) {
            y();
            if (this.f4845w == 1) {
                p(motionEvent.getX());
            }
            if (this.f4845w == 2) {
                z(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f4844v;
        if (i10 == 1) {
            boolean zS = s(motionEvent.getX(), motionEvent.getY());
            boolean zR = r(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zS && !zR) {
                return false;
            }
            if (zR) {
                this.f4845w = 1;
                this.f4838p = (int) motionEvent.getX();
            } else if (zS) {
                this.f4845w = 2;
                this.f4835m = (int) motionEvent.getY();
            }
            w(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.f4839q != this.f4841s.getWidth() || this.f4840r != this.f4841s.getHeight()) {
            this.f4839q = this.f4841s.getWidth();
            this.f4840r = this.f4841s.getHeight();
            w(0);
        } else if (this.A != 0) {
            if (this.f4842t) {
                l(canvas);
            }
            if (this.f4843u) {
                k(canvas);
            }
        }
    }

    public void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4841s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            j();
        }
        this.f4841s = recyclerView;
        if (recyclerView != null) {
            x();
        }
    }

    void o(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f4848z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f4848z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4848z.setDuration(i10);
        this.f4848z.start();
    }

    boolean r(float f10, float f11) {
        if (f11 >= this.f4840r - this.f4831i) {
            int i10 = this.f4837o;
            int i11 = this.f4836n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean s(float f10, float f11) {
        if (!q() ? f10 >= this.f4839q - this.f4827e : f10 <= this.f4827e / 2) {
            int i10 = this.f4834l;
            int i11 = this.f4833k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void t() {
        this.f4841s.invalidate();
    }

    void w(int i10) {
        int i11;
        if (i10 == 2 && this.f4844v != 2) {
            this.f4825c.setState(D);
            i();
        }
        if (i10 == 0) {
            t();
        } else {
            y();
        }
        if (this.f4844v != 2 || i10 == 2) {
            i11 = i10 == 1 ? 1500 : 1200;
            this.f4844v = i10;
        }
        this.f4825c.setState(E);
        u(i11);
        this.f4844v = i10;
    }

    public void y() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f4848z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f4848z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4848z.setDuration(500L);
        this.f4848z.setStartDelay(0L);
        this.f4848z.start();
    }
}
