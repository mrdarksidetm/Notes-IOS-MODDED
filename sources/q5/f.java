package q5;

import ae.r;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18984a = new f();

    private f() {
    }

    public final int a(DisplayCutout displayCutout) {
        r.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        r.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        r.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        r.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
