package l1;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f14509a = new h0();

    private h0() {
    }

    public final void a(Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
