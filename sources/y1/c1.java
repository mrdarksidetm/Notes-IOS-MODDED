package y1;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23222f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f23223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f23224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.p<a2.f0, c1, md.i0> f23225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<a2.f0, t0.q, md.i0> f23226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.p<a2.f0, zd.p<? super d1, ? super w2.b, ? extends f0>, md.i0> f23227e;

    public interface a {
        default int a() {
            return 0;
        }

        default void b(int i10, long j10) {
        }

        void dispose();
    }

    static final class b extends ae.s implements zd.p<a2.f0, t0.q, md.i0> {
        b() {
            super(2);
        }

        public final void a(a2.f0 f0Var, t0.q qVar) {
            c1.this.h().I(qVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(a2.f0 f0Var, t0.q qVar) {
            a(f0Var, qVar);
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.p<a2.f0, zd.p<? super d1, ? super w2.b, ? extends f0>, md.i0> {
        c() {
            super(2);
        }

        public final void a(a2.f0 f0Var, zd.p<? super d1, ? super w2.b, ? extends f0> pVar) {
            f0Var.n(c1.this.h().u(pVar));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(a2.f0 f0Var, zd.p<? super d1, ? super w2.b, ? extends f0> pVar) {
            a(f0Var, pVar);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.p<a2.f0, c1, md.i0> {
        d() {
            super(2);
        }

        public final void a(a2.f0 f0Var, c1 c1Var) {
            c1 c1Var2 = c1.this;
            x xVarN0 = f0Var.n0();
            if (xVarN0 == null) {
                xVarN0 = new x(f0Var, c1.this.f23223a);
                f0Var.u1(xVarN0);
            }
            c1Var2.f23224b = xVarN0;
            c1.this.h().B();
            c1.this.h().J(c1.this.f23223a);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(a2.f0 f0Var, c1 c1Var) {
            a(f0Var, c1Var);
            return md.i0.f15558a;
        }
    }

    public c1() {
        this(j0.f23266a);
    }

    public c1(e1 e1Var) {
        this.f23223a = e1Var;
        this.f23225c = new d();
        this.f23226d = new b();
        this.f23227e = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x h() {
        x xVar = this.f23224b;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void d() {
        h().z();
    }

    public final zd.p<a2.f0, t0.q, md.i0> e() {
        return this.f23226d;
    }

    public final zd.p<a2.f0, zd.p<? super d1, ? super w2.b, ? extends f0>, md.i0> f() {
        return this.f23227e;
    }

    public final zd.p<a2.f0, c1, md.i0> g() {
        return this.f23225c;
    }

    public final a i(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
        return h().G(obj, pVar);
    }
}
