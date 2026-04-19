package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1732b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1733c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1734d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1735e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1736f;

    i(CheckedTextView checkedTextView) {
        this.f1731a = checkedTextView;
    }

    void a() {
        Drawable drawableA = t3.b.a(this.f1731a);
        if (drawableA != null) {
            if (this.f1734d || this.f1735e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawableA).mutate();
                if (this.f1734d) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f1732b);
                }
                if (this.f1735e) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f1733c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1731a.getDrawableState());
                }
                this.f1731a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f1732b;
    }

    PorterDuff.Mode c() {
        return this.f1733c;
    }

    void d(AttributeSet attributeSet, int i10) {
        boolean z10;
        int iM;
        int iM2;
        Context context = this.f1731a.getContext();
        int[] iArr = j.j.P0;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f1731a;
        androidx.core.view.h.U(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, r0VarU.q(), i10, 0);
        try {
            int i11 = j.j.R0;
            if (!r0VarU.r(i11) || (iM2 = r0VarU.m(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f1731a;
                    checkedTextView2.setCheckMarkDrawable(l.a.b(checkedTextView2.getContext(), iM2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10) {
                int i12 = j.j.Q0;
                if (r0VarU.r(i12) && (iM = r0VarU.m(i12, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.f1731a;
                    checkedTextView3.setCheckMarkDrawable(l.a.b(checkedTextView3.getContext(), iM));
                }
            }
            int i13 = j.j.S0;
            if (r0VarU.r(i13)) {
                t3.b.b(this.f1731a, r0VarU.c(i13));
            }
            int i14 = j.j.T0;
            if (r0VarU.r(i14)) {
                t3.b.c(this.f1731a, c0.e(r0VarU.j(i14, -1), null));
            }
        } finally {
            r0VarU.v();
        }
    }

    void e() {
        if (this.f1736f) {
            this.f1736f = false;
        } else {
            this.f1736f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f1732b = colorStateList;
        this.f1734d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f1733c = mode;
        this.f1735e = true;
        a();
    }
}
