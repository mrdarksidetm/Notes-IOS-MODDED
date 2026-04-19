package j5;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0327a f13919b = new C0327a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13920c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f13921d = new a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13922e = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13923a;

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C0327a {
        private C0327a() {
        }

        public /* synthetic */ C0327a(j jVar) {
            this();
        }

        public final a a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 480.0f ? a.f13920c : f10 < 900.0f ? a.f13921d : a.f13922e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f10).toString());
        }
    }

    private a(int i10) {
        this.f13923a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f13923a == ((a) obj).f13923a;
    }

    public int hashCode() {
        return this.f13923a;
    }

    public String toString() {
        return "WindowHeightSizeClass: " + (r.b(this, f13920c) ? "COMPACT" : r.b(this, f13921d) ? "MEDIUM" : r.b(this, f13922e) ? "EXPANDED" : "UNKNOWN");
    }
}
