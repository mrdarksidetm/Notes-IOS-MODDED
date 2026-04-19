package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.r0;

/* JADX INFO: loaded from: classes.dex */
class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f19123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f19124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f19125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f19126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19128i;

    d(SeekBar seekBar) {
        super(seekBar);
        this.f19125f = null;
        this.f19126g = null;
        this.f19127h = false;
        this.f19128i = false;
        this.f19123d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f19124e;
        if (drawable != null) {
            if (this.f19127h || this.f19128i) {
                Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable.mutate());
                this.f19124e = drawableJ;
                if (this.f19127h) {
                    androidx.core.graphics.drawable.a.g(drawableJ, this.f19125f);
                }
                if (this.f19128i) {
                    androidx.core.graphics.drawable.a.h(this.f19124e, this.f19126g);
                }
                if (this.f19124e.isStateful()) {
                    this.f19124e.setState(this.f19123d.getDrawableState());
                }
            }
        }
    }

    @Override // r.a
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f19123d.getContext();
        int[] iArr = j.j.T;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f19123d;
        androidx.core.view.h.U(seekBar, seekBar.getContext(), iArr, attributeSet, r0VarU.q(), i10, 0);
        Drawable drawableG = r0VarU.g(j.j.U);
        if (drawableG != null) {
            this.f19123d.setThumb(drawableG);
        }
        j(r0VarU.f(j.j.V));
        int i11 = j.j.X;
        if (r0VarU.r(i11)) {
            this.f19126g = c0.e(r0VarU.j(i11, -1), this.f19126g);
            this.f19128i = true;
        }
        int i12 = j.j.W;
        if (r0VarU.r(i12)) {
            this.f19125f = r0VarU.c(i12);
            this.f19127h = true;
        }
        r0VarU.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.f19124e != null) {
            int max = this.f19123d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f19124e.getIntrinsicWidth();
                int intrinsicHeight = this.f19124e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f19124e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f19123d.getWidth() - this.f19123d.getPaddingLeft()) - this.f19123d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f19123d.getPaddingLeft(), this.f19123d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f19124e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f19124e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f19123d.getDrawableState())) {
            this.f19123d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f19124e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f19124e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19124e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f19123d);
            androidx.core.graphics.drawable.a.e(drawable, androidx.core.view.h.t(this.f19123d));
            if (drawable.isStateful()) {
                drawable.setState(this.f19123d.getDrawableState());
            }
            f();
        }
        this.f19123d.invalidate();
    }
}
