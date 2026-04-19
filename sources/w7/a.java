package w7;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ha.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ha.a f22504a = new a();

    /* JADX INFO: renamed from: w7.a$a, reason: collision with other inner class name */
    private static final class C0470a implements ga.d<z7.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0470a f22505a = new C0470a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22506b = ga.c.a("window").b(ja.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ga.c f22507c = ga.c.a("logSourceMetrics").b(ja.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ga.c f22508d = ga.c.a("globalMetrics").b(ja.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ga.c f22509e = ga.c.a("appNamespace").b(ja.a.b().c(4).a()).a();

        private C0470a() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.a aVar, ga.e eVar) {
            eVar.add(f22506b, aVar.d());
            eVar.add(f22507c, aVar.c());
            eVar.add(f22508d, aVar.b());
            eVar.add(f22509e, aVar.a());
        }
    }

    private static final class b implements ga.d<z7.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f22510a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22511b = ga.c.a("storageMetrics").b(ja.a.b().c(1).a()).a();

        private b() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.b bVar, ga.e eVar) {
            eVar.add(f22511b, bVar.a());
        }
    }

    private static final class c implements ga.d<z7.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f22512a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22513b = ga.c.a("eventsDroppedCount").b(ja.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ga.c f22514c = ga.c.a("reason").b(ja.a.b().c(3).a()).a();

        private c() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.c cVar, ga.e eVar) {
            eVar.add(f22513b, cVar.a());
            eVar.add(f22514c, cVar.b());
        }
    }

    private static final class d implements ga.d<z7.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f22515a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22516b = ga.c.a("logSource").b(ja.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ga.c f22517c = ga.c.a("logEventDropped").b(ja.a.b().c(2).a()).a();

        private d() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.d dVar, ga.e eVar) {
            eVar.add(f22516b, dVar.b());
            eVar.add(f22517c, dVar.a());
        }
    }

    private static final class e implements ga.d<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f22518a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22519b = ga.c.d("clientMetrics");

        private e() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(l lVar, ga.e eVar) {
            eVar.add(f22519b, lVar.b());
        }
    }

    private static final class f implements ga.d<z7.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f22520a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22521b = ga.c.a("currentCacheSizeBytes").b(ja.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ga.c f22522c = ga.c.a("maxCacheSizeBytes").b(ja.a.b().c(2).a()).a();

        private f() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.e eVar, ga.e eVar2) {
            eVar2.add(f22521b, eVar.a());
            eVar2.add(f22522c, eVar.b());
        }
    }

    private static final class g implements ga.d<z7.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f22523a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ga.c f22524b = ga.c.a("startMs").b(ja.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ga.c f22525c = ga.c.a("endMs").b(ja.a.b().c(2).a()).a();

        private g() {
        }

        @Override // ga.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(z7.f fVar, ga.e eVar) {
            eVar.add(f22524b, fVar.b());
            eVar.add(f22525c, fVar.a());
        }
    }

    private a() {
    }

    @Override // ha.a
    public void configure(ha.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f22518a);
        bVar.registerEncoder(z7.a.class, C0470a.f22505a);
        bVar.registerEncoder(z7.f.class, g.f22523a);
        bVar.registerEncoder(z7.d.class, d.f22515a);
        bVar.registerEncoder(z7.c.class, c.f22512a);
        bVar.registerEncoder(z7.b.class, b.f22510a);
        bVar.registerEncoder(z7.e.class, f.f22520a);
    }
}
