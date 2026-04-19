package c5;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class j0 extends h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f6464g = true;

    j0() {
    }

    @Override // c5.l0
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f6464g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f6464g = false;
            }
        }
    }
}
