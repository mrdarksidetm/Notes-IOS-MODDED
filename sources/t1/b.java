package t1;

import ae.r;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyEvent f21206a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f21206a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && r.b(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21206a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f21206a;
    }

    public int hashCode() {
        return d(this.f21206a);
    }

    public String toString() {
        return e(this.f21206a);
    }
}
