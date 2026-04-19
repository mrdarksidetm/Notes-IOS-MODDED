package i0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends j0.n<i> implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f12150d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12151e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zd.p<s, Integer, i0.b> f12152f = a.f12156a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f12153a = new g0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0.j0<i> f12154b = new j0.j0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12155c;

    static final class a extends ae.s implements zd.p<s, Integer, i0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12156a = new a();

        a() {
            super(2);
        }

        public final long a(s sVar, int i10) {
            return f0.a(1);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0.b invoke(s sVar, Integer num) {
            return i0.b.a(a(sVar, num.intValue()));
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public j(zd.l<? super b0, md.i0> lVar) {
        lVar.invoke(this);
    }

    @Override // i0.b0
    public void b(int i10, zd.l<? super Integer, ? extends Object> lVar, zd.p<? super s, ? super Integer, i0.b> pVar, zd.l<? super Integer, ? extends Object> lVar2, zd.r<? super q, ? super Integer, ? super t0.l, ? super Integer, md.i0> rVar) {
        d().c(i10, new i(lVar, pVar == null ? f12152f : pVar, lVar2, rVar));
        if (pVar != null) {
            this.f12155c = true;
        }
    }

    public final boolean g() {
        return this.f12155c;
    }

    @Override // j0.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j0.j0<i> d() {
        return this.f12154b;
    }

    public final g0 i() {
        return this.f12153a;
    }
}
