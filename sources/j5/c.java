package j5;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13927b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f13928c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f13929d = new c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f13930e = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13931a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final c a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 600.0f ? c.f13928c : f10 < 840.0f ? c.f13929d : c.f13930e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f10).toString());
        }
    }

    private c(int i10) {
        this.f13931a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f13931a == ((c) obj).f13931a;
    }

    public int hashCode() {
        return this.f13931a;
    }

    public String toString() {
        return "WindowWidthSizeClass: " + (r.b(this, f13928c) ? "COMPACT" : r.b(this, f13929d) ? "MEDIUM" : r.b(this, f13930e) ? "EXPANDED" : "UNKNOWN");
    }
}
