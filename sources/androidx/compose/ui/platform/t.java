package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import l1.z0;

/* JADX INFO: loaded from: classes.dex */
final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f3094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f3095b;

    private t(float[] fArr) {
        this.f3094a = fArr;
        this.f3095b = new int[2];
    }

    public /* synthetic */ t(float[] fArr, ae.j jVar) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        l1.h.b(this.f3094a, matrix);
        b2.x.h(fArr, this.f3094a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        b2.x.i(fArr, f10, f11, this.f3094a);
    }

    private final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f3095b);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.s
    public void a(View view, float[] fArr) {
        z0.h(fArr);
        d(view, fArr);
    }
}
