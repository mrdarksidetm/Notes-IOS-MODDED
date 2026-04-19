package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p0 f1843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p0 f1844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f1845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1846e = 0;

    public q(ImageView imageView) {
        this.f1842a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1845d == null) {
            this.f1845d = new p0();
        }
        p0 p0Var = this.f1845d;
        p0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.c.a(this.f1842a);
        if (colorStateListA != null) {
            p0Var.f1841d = true;
            p0Var.f1838a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.c.b(this.f1842a);
        if (modeB != null) {
            p0Var.f1840c = true;
            p0Var.f1839b = modeB;
        }
        if (!p0Var.f1841d && !p0Var.f1840c) {
            return false;
        }
        k.i(drawable, p0Var, this.f1842a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1843b != null;
    }

    void b() {
        if (this.f1842a.getDrawable() != null) {
            this.f1842a.getDrawable().setLevel(this.f1846e);
        }
    }

    void c() {
        Drawable drawable = this.f1842a.getDrawable();
        if (drawable != null) {
            c0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            p0 p0Var = this.f1844c;
            if (p0Var != null) {
                k.i(drawable, p0Var, this.f1842a.getDrawableState());
                return;
            }
            p0 p0Var2 = this.f1843b;
            if (p0Var2 != null) {
                k.i(drawable, p0Var2, this.f1842a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        p0 p0Var = this.f1844c;
        if (p0Var != null) {
            return p0Var.f1838a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        p0 p0Var = this.f1844c;
        if (p0Var != null) {
            return p0Var.f1839b;
        }
        return null;
    }

    boolean f() {
        return !(this.f1842a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iM;
        Context context = this.f1842a.getContext();
        int[] iArr = j.j.P;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1842a;
        androidx.core.view.h.U(imageView, imageView.getContext(), iArr, attributeSet, r0VarU.q(), i10, 0);
        try {
            Drawable drawable = this.f1842a.getDrawable();
            if (drawable == null && (iM = r0VarU.m(j.j.Q, -1)) != -1 && (drawable = l.a.b(this.f1842a.getContext(), iM)) != null) {
                this.f1842a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.b(drawable);
            }
            int i11 = j.j.R;
            if (r0VarU.r(i11)) {
                androidx.core.widget.c.c(this.f1842a, r0VarU.c(i11));
            }
            int i12 = j.j.S;
            if (r0VarU.r(i12)) {
                androidx.core.widget.c.d(this.f1842a, c0.e(r0VarU.j(i12, -1), null));
            }
        } finally {
            r0VarU.v();
        }
    }

    void h(Drawable drawable) {
        this.f1846e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = l.a.b(this.f1842a.getContext(), i10);
            if (drawableB != null) {
                c0.b(drawableB);
            }
            this.f1842a.setImageDrawable(drawableB);
        } else {
            this.f1842a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f1844c == null) {
            this.f1844c = new p0();
        }
        p0 p0Var = this.f1844c;
        p0Var.f1838a = colorStateList;
        p0Var.f1841d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f1844c == null) {
            this.f1844c = new p0();
        }
        p0 p0Var = this.f1844c;
        p0Var.f1839b = mode;
        p0Var.f1840c = true;
        c();
    }
}
