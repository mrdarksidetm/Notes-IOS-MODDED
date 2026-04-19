package v1;

import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointerIcon f21883b;

    public final PointerIcon a() {
        return this.f21883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ae.r.b(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return ae.r.b(this.f21883b, ((a) obj).f21883b);
    }

    public int hashCode() {
        return this.f21883b.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f21883b + ')';
    }
}
