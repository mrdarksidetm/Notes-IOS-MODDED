package a2;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f38b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zd.l<b1, md.i0> f40d = a.f42a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f41a;

    static final class a extends ae.s implements zd.l<b1, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42a = new a();

        a() {
            super(1);
        }

        public final void a(b1 b1Var) {
            if (b1Var.O()) {
                b1Var.b().R0();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(b1 b1Var) {
            a(b1Var);
            return md.i0.f15558a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final zd.l<b1, md.i0> a() {
            return b1.f40d;
        }
    }

    public b1(z0 z0Var) {
        this.f41a = z0Var;
    }

    @Override // a2.f1
    public boolean O() {
        return this.f41a.L0().H1();
    }

    public final z0 b() {
        return this.f41a;
    }
}
