package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f1747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1748b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1749c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1750d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1751e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1752f;

    j(CompoundButton compoundButton) {
        this.f1747a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.a.a(this.f1747a);
        if (drawableA != null) {
            if (this.f1750d || this.f1751e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawableA).mutate();
                if (this.f1750d) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f1748b);
                }
                if (this.f1751e) {
                    androidx.core.graphics.drawable.a.h(drawableMutate, this.f1749c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1747a.getDrawableState());
                }
                this.f1747a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i10) {
        return i10;
    }

    ColorStateList c() {
        return this.f1748b;
    }

    PorterDuff.Mode d() {
        return this.f1749c;
    }

    void e(AttributeSet attributeSet, int i10) {
        boolean z10;
        int iM;
        int iM2;
        Context context = this.f1747a.getContext();
        int[] iArr = j.j.U0;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f1747a;
        androidx.core.view.h.U(compoundButton, compoundButton.getContext(), iArr, attributeSet, r0VarU.q(), i10, 0);
        try {
            int i11 = j.j.W0;
            if (!r0VarU.r(i11) || (iM2 = r0VarU.m(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1747a;
                    compoundButton2.setButtonDrawable(l.a.b(compoundButton2.getContext(), iM2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10) {
                int i12 = j.j.V0;
                if (r0VarU.r(i12) && (iM = r0VarU.m(i12, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1747a;
                    compoundButton3.setButtonDrawable(l.a.b(compoundButton3.getContext(), iM));
                }
            }
            int i13 = j.j.X0;
            if (r0VarU.r(i13)) {
                androidx.core.widget.a.b(this.f1747a, r0VarU.c(i13));
            }
            int i14 = j.j.Y0;
            if (r0VarU.r(i14)) {
                androidx.core.widget.a.c(this.f1747a, c0.e(r0VarU.j(i14, -1), null));
            }
        } finally {
            r0VarU.v();
        }
    }

    void f() {
        if (this.f1752f) {
            this.f1752f = false;
        } else {
            this.f1752f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1748b = colorStateList;
        this.f1750d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1749c = mode;
        this.f1751e = true;
        a();
    }
}
