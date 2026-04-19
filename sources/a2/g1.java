package a2;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f131i = d1.z.f9437k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1.z f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<f0, md.i0> f133b = f.f145a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<f0, md.i0> f134c = g.f146a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.l<f0, md.i0> f135d = h.f147a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.l<f0, md.i0> f136e = b.f141a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zd.l<f0, md.i0> f137f = c.f142a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.l<f0, md.i0> f138g = d.f143a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zd.l<f0, md.i0> f139h = e.f144a;

    static final class a extends ae.s implements zd.l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f140a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((f1) obj).O());
        }
    }

    static final class b extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f141a = new b();

        b() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.i1(f0Var, false, 1, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f142a = new c();

        c() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.i1(f0Var, false, 1, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f143a = new d();

        d() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.e1(f0Var, false, 1, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class e extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f144a = new e();

        e() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.e1(f0Var, false, 1, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class f extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f145a = new f();

        f() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.g1(f0Var, false, false, 3, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class g extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f146a = new g();

        g() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0.k1(f0Var, false, false, 3, null);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    static final class h extends ae.s implements zd.l<f0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f147a = new h();

        h() {
            super(1);
        }

        public final void a(f0 f0Var) {
            if (f0Var.O()) {
                f0Var.E0();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(f0 f0Var) {
            a(f0Var);
            return md.i0.f15558a;
        }
    }

    public g1(zd.l<? super zd.a<md.i0>, md.i0> lVar) {
        this.f132a = new d1.z(lVar);
    }

    public static /* synthetic */ void d(g1 g1Var, f0 f0Var, boolean z10, zd.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        g1Var.c(f0Var, z10, aVar);
    }

    public static /* synthetic */ void f(g1 g1Var, f0 f0Var, boolean z10, zd.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        g1Var.e(f0Var, z10, aVar);
    }

    public static /* synthetic */ void h(g1 g1Var, f0 f0Var, boolean z10, zd.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        g1Var.g(f0Var, z10, aVar);
    }

    public final void a(Object obj) {
        this.f132a.k(obj);
    }

    public final void b() {
        this.f132a.l(a.f140a);
    }

    public final void c(f0 f0Var, boolean z10, zd.a<md.i0> aVar) {
        i(f0Var, (!z10 || f0Var.Y() == null) ? this.f137f : this.f138g, aVar);
    }

    public final void e(f0 f0Var, boolean z10, zd.a<md.i0> aVar) {
        i(f0Var, (!z10 || f0Var.Y() == null) ? this.f136e : this.f139h, aVar);
    }

    public final void g(f0 f0Var, boolean z10, zd.a<md.i0> aVar) {
        i(f0Var, (!z10 || f0Var.Y() == null) ? this.f134c : this.f133b, aVar);
    }

    public final <T extends f1> void i(T t10, zd.l<? super T, md.i0> lVar, zd.a<md.i0> aVar) {
        this.f132a.o(t10, lVar, aVar);
    }

    public final void j(f0 f0Var, zd.a<md.i0> aVar) {
        i(f0Var, this.f135d, aVar);
    }

    public final void k() {
        this.f132a.s();
    }

    public final void l() {
        this.f132a.t();
        this.f132a.j();
    }
}
