package o3;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
