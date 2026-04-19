package c5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class d0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6439c = true;

    d0() {
    }

    @Override // c5.l0
    public void a(View view) {
    }

    @Override // c5.l0
    public float b(View view) {
        if (f6439c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6439c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // c5.l0
    public void c(View view) {
    }

    @Override // c5.l0
    public void e(View view, float f10) {
        if (f6439c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f6439c = false;
            }
        }
        view.setAlpha(f10);
    }
}
