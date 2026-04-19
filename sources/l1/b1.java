package l1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    public static final class a extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f1 f14492a;

        public a(f1 f1Var) {
            super(null);
            this.f14492a = f1Var;
        }

        public final f1 a() {
            return this.f14492a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ae.r.b(this.f14492a, ((a) obj).f14492a);
        }

        public int hashCode() {
            return this.f14492a.hashCode();
        }
    }

    public static final class b extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1.h f14493a;

        public b(k1.h hVar) {
            super(null);
            this.f14493a = hVar;
        }

        public final k1.h a() {
            return this.f14493a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ae.r.b(this.f14493a, ((b) obj).f14493a);
        }

        public int hashCode() {
            return this.f14493a.hashCode();
        }
    }

    public static final class c extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1.j f14494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f1 f14495b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k1.j jVar) {
            super(0 == true ? 1 : 0);
            f1 f1VarA = null;
            this.f14494a = jVar;
            if (!c1.f(jVar)) {
                f1VarA = p.a();
                f1VarA.m(jVar);
            }
            this.f14495b = f1VarA;
        }

        public final k1.j a() {
            return this.f14494a;
        }

        public final f1 b() {
            return this.f14495b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && ae.r.b(this.f14494a, ((c) obj).f14494a);
        }

        public int hashCode() {
            return this.f14494a.hashCode();
        }
    }

    private b1() {
    }

    public /* synthetic */ b1(ae.j jVar) {
        this();
    }
}
