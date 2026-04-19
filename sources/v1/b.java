package v1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21885b;

    public b(int i10) {
        this.f21885b = i10;
    }

    public final int a() {
        return this.f21885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ae.r.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f21885b == ((b) obj).f21885b;
    }

    public int hashCode() {
        return this.f21885b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f21885b + ')';
    }
}
