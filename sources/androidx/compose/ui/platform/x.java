package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f3103a = new x();

    private x() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
            float rawY = motionEvent.getRawY(i10);
            if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
