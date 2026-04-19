package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1651a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f1654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0 f1655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p0 f1656f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1653c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f1652b = k.b();

    e(View view) {
        this.f1651a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1656f == null) {
            this.f1656f = new p0();
        }
        p0 p0Var = this.f1656f;
        p0Var.a();
        ColorStateList colorStateListM = androidx.core.view.h.m(this.f1651a);
        if (colorStateListM != null) {
            p0Var.f1841d = true;
            p0Var.f1838a = colorStateListM;
        }
        PorterDuff.Mode modeN = androidx.core.view.h.n(this.f1651a);
        if (modeN != null) {
            p0Var.f1840c = true;
            p0Var.f1839b = modeN;
        }
        if (!p0Var.f1841d && !p0Var.f1840c) {
            return false;
        }
        k.i(drawable, p0Var, this.f1651a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1654d != null;
    }

    void b() {
        Drawable background = this.f1651a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            p0 p0Var = this.f1655e;
            if (p0Var != null) {
                k.i(background, p0Var, this.f1651a.getDrawableState());
                return;
            }
            p0 p0Var2 = this.f1654d;
            if (p0Var2 != null) {
                k.i(background, p0Var2, this.f1651a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        p0 p0Var = this.f1655e;
        if (p0Var != null) {
            return p0Var.f1838a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        p0 p0Var = this.f1655e;
        if (p0Var != null) {
            return p0Var.f1839b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1651a.getContext();
        int[] iArr = j.j.K3;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        View view = this.f1651a;
        androidx.core.view.h.U(view, view.getContext(), iArr, attributeSet, r0VarU.q(), i10, 0);
        try {
            int i11 = j.j.L3;
            if (r0VarU.r(i11)) {
                this.f1653c = r0VarU.m(i11, -1);
                ColorStateList colorStateListF = this.f1652b.f(this.f1651a.getContext(), this.f1653c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = j.j.M3;
            if (r0VarU.r(i12)) {
                androidx.core.view.h.a0(this.f1651a, r0VarU.c(i12));
            }
            int i13 = j.j.N3;
            if (r0VarU.r(i13)) {
                androidx.core.view.h.b0(this.f1651a, c0.e(r0VarU.j(i13, -1), null));
            }
        } finally {
            r0VarU.v();
        }
    }

    void f(Drawable drawable) {
        this.f1653c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f1653c = i10;
        k kVar = this.f1652b;
        h(kVar != null ? kVar.f(this.f1651a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1654d == null) {
                this.f1654d = new p0();
            }
            p0 p0Var = this.f1654d;
            p0Var.f1838a = colorStateList;
            p0Var.f1841d = true;
        } else {
            this.f1654d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1655e == null) {
            this.f1655e = new p0();
        }
        p0 p0Var = this.f1655e;
        p0Var.f1838a = colorStateList;
        p0Var.f1841d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1655e == null) {
            this.f1655e = new p0();
        }
        p0 p0Var = this.f1655e;
        p0Var.f1839b = mode;
        p0Var.f1840c = true;
        b();
    }
}
