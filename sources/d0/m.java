package d0;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f9237a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f9237a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return t1.c.e(t1.d.b(keyEvent), t1.c.f21207a.b()) && d(keyEvent);
    }

    public static final boolean c(a2.h hVar) {
        return e((View) a2.i.a(hVar, androidx.compose.ui.platform.r.j()));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int iB = t1.f.b(t1.d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    private static final boolean e(View view) {
        do {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                return false;
            }
            view = (ViewGroup) parent;
        } while (!view.shouldDelayChildPressedState());
        return true;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return t1.c.e(t1.d.b(keyEvent), t1.c.f21207a.a()) && d(keyEvent);
    }
}
