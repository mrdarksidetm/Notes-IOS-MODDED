package j5;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13924c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f13925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j5.a f13926b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final b a(float f10, float f11) {
            return new b(c.f13927b.a(f10), j5.a.f13919b.a(f11), null);
        }
    }

    private b(c cVar, j5.a aVar) {
        this.f13925a = cVar;
        this.f13926b = aVar;
    }

    public /* synthetic */ b(c cVar, j5.a aVar, j jVar) {
        this(cVar, aVar);
    }

    public final j5.a a() {
        return this.f13926b;
    }

    public final c b() {
        return this.f13925a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        b bVar = (b) obj;
        return r.b(this.f13925a, bVar.f13925a) && r.b(this.f13926b, bVar.f13926b);
    }

    public int hashCode() {
        return (this.f13925a.hashCode() * 31) + this.f13926b.hashCode();
    }

    public String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.f13925a + ", windowHeightSizeClass=" + this.f13926b + " }";
    }
}
