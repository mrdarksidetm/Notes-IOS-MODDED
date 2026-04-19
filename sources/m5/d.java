package m5;

import ae.r;
import android.graphics.Rect;
import m5.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15427d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i5.b f15428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.C0352c f15430c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final void a(i5.b bVar) {
            r.f(bVar, "bounds");
            if (!((bVar.d() == 0 && bVar.a() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(bVar.b() == 0 || bVar.c() == 0)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15431b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f15432c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f15433d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15434a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final b a() {
                return b.f15432c;
            }

            public final b b() {
                return b.f15433d;
            }
        }

        private b(String str) {
            this.f15434a = str;
        }

        public String toString() {
            return this.f15434a;
        }
    }

    public d(i5.b bVar, b bVar2, c.C0352c c0352c) {
        r.f(bVar, "featureBounds");
        r.f(bVar2, "type");
        r.f(c0352c, "state");
        this.f15428a = bVar;
        this.f15429b = bVar2;
        this.f15430c = c0352c;
        f15427d.a(bVar);
    }

    @Override // m5.c
    public boolean a() {
        b bVar = this.f15429b;
        b.a aVar = b.f15431b;
        if (r.b(bVar, aVar.b())) {
            return true;
        }
        return r.b(this.f15429b, aVar.a()) && r.b(getState(), c.C0352c.f15425d);
    }

    @Override // m5.c
    public c.a b() {
        return (this.f15428a.d() == 0 || this.f15428a.a() == 0) ? c.a.f15416c : c.a.f15417d;
    }

    @Override // m5.c
    public c.b c() {
        return this.f15428a.d() > this.f15428a.a() ? c.b.f15421d : c.b.f15420c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return r.b(this.f15428a, dVar.f15428a) && r.b(this.f15429b, dVar.f15429b) && r.b(getState(), dVar.getState());
    }

    @Override // m5.a
    public Rect getBounds() {
        return this.f15428a.f();
    }

    @Override // m5.c
    public c.C0352c getState() {
        return this.f15430c;
    }

    public int hashCode() {
        return (((this.f15428a.hashCode() * 31) + this.f15429b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f15428a + ", type=" + this.f15429b + ", state=" + getState() + " }";
    }
}
