package c5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class h0 extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f6460f = true;

    h0() {
    }

    @Override // c5.l0
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f6460f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6460f = false;
            }
        }
    }
}
