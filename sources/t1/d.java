package t1;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? c.f21207a.c() : c.f21207a.b() : c.f21207a.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
