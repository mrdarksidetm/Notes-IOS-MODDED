package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1880b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1881a;

    public t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        r0 r0VarU = r0.u(context, attributeSet, j.j.Y1, i10, i11);
        int i12 = j.j.f13475a2;
        if (r0VarU.r(i12)) {
            b(r0VarU.a(i12, false));
        }
        setBackgroundDrawable(r0VarU.f(j.j.Z1));
        r0VarU.v();
    }

    private void b(boolean z10) {
        if (f1880b) {
            this.f1881a = z10;
        } else {
            androidx.core.widget.d.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1880b && this.f1881a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1880b && this.f1881a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1880b && this.f1881a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
