package c5;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f0 extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f6458d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6459e = true;

    f0() {
    }

    @Override // c5.l0
    public void g(View view, Matrix matrix) {
        if (f6458d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6458d = false;
            }
        }
    }

    @Override // c5.l0
    public void h(View view, Matrix matrix) {
        if (f6459e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6459e = false;
            }
        }
    }
}
