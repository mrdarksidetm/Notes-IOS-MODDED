package h0;

import f1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11671a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f11672b = a.f11675e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f11673c = e.f11678e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f11674d = c.f11676e;

    private static final class a extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f11675e = new a();

        private a() {
            super(null);
        }

        @Override // h0.k
        public int a(int i10, w2.r rVar, y1.t0 t0Var, int i11) {
            return i10 / 2;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final k a(b.InterfaceC0266b interfaceC0266b) {
            return new d(interfaceC0266b);
        }

        public final k b(b.c cVar) {
            return new f(cVar);
        }
    }

    private static final class c extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f11676e = new c();

        private c() {
            super(null);
        }

        @Override // h0.k
        public int a(int i10, w2.r rVar, y1.t0 t0Var, int i11) {
            if (rVar == w2.r.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    private static final class d extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b.InterfaceC0266b f11677e;

        public d(b.InterfaceC0266b interfaceC0266b) {
            super(null);
            this.f11677e = interfaceC0266b;
        }

        @Override // h0.k
        public int a(int i10, w2.r rVar, y1.t0 t0Var, int i11) {
            return this.f11677e.a(0, i10, rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && ae.r.b(this.f11677e, ((d) obj).f11677e);
        }

        public int hashCode() {
            return this.f11677e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f11677e + ')';
        }
    }

    private static final class e extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f11678e = new e();

        private e() {
            super(null);
        }

        @Override // h0.k
        public int a(int i10, w2.r rVar, y1.t0 t0Var, int i11) {
            if (rVar == w2.r.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    private static final class f extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b.c f11679e;

        public f(b.c cVar) {
            super(null);
            this.f11679e = cVar;
        }

        @Override // h0.k
        public int a(int i10, w2.r rVar, y1.t0 t0Var, int i11) {
            return this.f11679e.a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && ae.r.b(this.f11679e, ((f) obj).f11679e);
        }

        public int hashCode() {
            return this.f11679e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f11679e + ')';
        }
    }

    private k() {
    }

    public /* synthetic */ k(ae.j jVar) {
        this();
    }

    public abstract int a(int i10, w2.r rVar, y1.t0 t0Var, int i11);

    public Integer b(y1.t0 t0Var) {
        return null;
    }

    public boolean c() {
        return false;
    }
}
