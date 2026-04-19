package c5;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class k0 extends j0 {
    k0() {
    }

    @Override // c5.d0, c5.l0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // c5.h0, c5.l0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // c5.d0, c5.l0
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // c5.j0, c5.l0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // c5.f0, c5.l0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c5.f0, c5.l0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
