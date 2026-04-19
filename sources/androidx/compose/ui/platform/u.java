package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class u implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f3096a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f3097b = new int[2];

    @Override // androidx.compose.ui.platform.s
    public void a(View view, float[] fArr) {
        this.f3096a.reset();
        view.transformMatrixToGlobal(this.f3096a);
        while (true) {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                view.getLocationOnScreen(this.f3097b);
                int[] iArr = this.f3097b;
                int i10 = iArr[0];
                int i11 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f3097b;
                this.f3096a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
                l1.h.b(fArr, this.f3096a);
                return;
            }
            view = (View) parent;
        }
    }
}
