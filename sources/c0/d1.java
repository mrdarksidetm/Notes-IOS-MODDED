package c0;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    static final class a<T, V> extends ae.s implements zd.l<c0.h<T, V>, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p<T, T, md.i0> f5960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j1<T, V> f5961b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.p<? super T, ? super T, md.i0> pVar, j1<T, V> j1Var) {
            super(1);
            this.f5960a = pVar;
            this.f5961b = j1Var;
        }

        public final void a(c0.h<T, V> hVar) {
            this.f5960a.invoke(hVar.e(), this.f5961b.b().invoke(hVar.g()));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a((c0.h) obj);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
    static final class b<T, V extends q> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f5963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f5964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f5967f;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5966e = obj;
            this.f5967f |= Integer.MIN_VALUE;
            return d1.c(null, null, 0L, null, this);
        }
    }

    static final class c extends ae.s implements zd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5968a = new c();

        c() {
            super(1);
        }

        public final void a(c0.h hVar) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c0.h) obj);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<Long, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<c0.h<T, V>> f5969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f5970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.d<T, V> f5971c;

        /* JADX INFO: Incorrect field signature: TV; */
        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f5972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k<T, V> f5973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f5974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.l<c0.h<T, V>, md.i0> f5975g;

        static final class a extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k<T, V> f5976a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k<T, V> kVar) {
                super(0);
                this.f5976a = kVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f5976a.q(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lae/h0<Lc0/h<TT;TV;>;>;TT;Lc0/d<TT;TV;>;TV;Lc0/k<TT;TV;>;FLzd/l<-Lc0/h<TT;TV;>;Lmd/i0;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(ae.h0 h0Var, Object obj, c0.d dVar, q qVar, k kVar, float f10, zd.l lVar) {
            super(1);
            this.f5969a = h0Var;
            this.f5970b = obj;
            this.f5971c = dVar;
            this.f5972d = qVar;
            this.f5973e = kVar;
            this.f5974f = f10;
            this.f5975g = lVar;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, c0.h] */
        public final void a(long j10) {
            ae.h0<c0.h<T, V>> h0Var = this.f5969a;
            ?? hVar = new c0.h(this.f5970b, this.f5971c.c(), this.f5972d, j10, this.f5971c.g(), j10, true, new a(this.f5973e));
            d1.k(hVar, j10, this.f5974f, this.f5971c, this.f5973e, this.f5975g);
            h0Var.f712a = hVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Long l10) {
            a(l10.longValue());
            return md.i0.f15558a;
        }
    }

    static final class e extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T, V> f5977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k<T, V> kVar) {
            super(0);
            this.f5977a = kVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5977a.q(false);
        }
    }

    static final class f extends ae.s implements zd.l<Long, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<c0.h<T, V>> f5978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.d<T, V> f5980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k<T, V> f5981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.l<c0.h<T, V>, md.i0> f5982e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ae.h0<c0.h<T, V>> h0Var, float f10, c0.d<T, V> dVar, k<T, V> kVar, zd.l<? super c0.h<T, V>, md.i0> lVar) {
            super(1);
            this.f5978a = h0Var;
            this.f5979b = f10;
            this.f5980c = dVar;
            this.f5981d = kVar;
            this.f5982e = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f5978a.f712a;
            ae.r.c(t10);
            d1.k((c0.h) t10, j10, this.f5979b, this.f5980c, this.f5981d, this.f5982e);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Long l10) {
            a(l10.longValue());
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class g extends ae.s implements zd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f5983a = new g();

        g() {
            super(1);
        }

        public final void a(c0.h hVar) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c0.h) obj);
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class h<R> extends ae.s implements zd.l<Long, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Long, R> f5984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(zd.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f5984a = lVar;
        }

        public final R a(long j10) {
            return this.f5984a.invoke(Long.valueOf(j10 / 1));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, i<Float> iVar, zd.p<? super Float, ? super Float, md.i0> pVar, qd.d<? super md.i0> dVar) {
        Object objD = d(l1.b(ae.l.f718a), sd.a.c(f10), sd.a.c(f11), sd.a.c(f12), iVar, pVar, dVar);
        return objD == rd.d.e() ? objD : md.i0.f15558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, c0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends c0.q> java.lang.Object c(c0.k<T, V> r25, c0.d<T, V> r26, long r27, zd.l<? super c0.h<T, V>, md.i0> r29, qd.d<? super md.i0> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d1.c(c0.k, c0.d, long, zd.l, qd.d):java.lang.Object");
    }

    public static final <T, V extends q> Object d(j1<T, V> j1Var, T t10, T t11, T t12, i<T> iVar, zd.p<? super T, ? super T, md.i0> pVar, qd.d<? super md.i0> dVar) {
        V vG;
        if (t12 == null || (vG = j1Var.a().invoke(t12)) == null) {
            vG = r.g(j1Var.a().invoke(t10));
        }
        Object objF = f(new k(j1Var, t10, vG, 0L, 0L, false, 56, null), new e1(iVar, j1Var, t10, t11, vG), 0L, new a(pVar, j1Var), dVar, 2, null);
        return objF == rd.d.e() ? objF : md.i0.f15558a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, i iVar, zd.p pVar, qd.d dVar, int i10, Object obj) {
        float f13 = (i10 & 4) != 0 ? 0.0f : f12;
        if ((i10 & 8) != 0) {
            iVar = j.g(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f13, iVar, pVar, dVar);
    }

    public static /* synthetic */ Object f(k kVar, c0.d dVar, long j10, zd.l lVar, qd.d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = c.f5968a;
        }
        return c(kVar, dVar, j11, lVar, dVar2);
    }

    public static final <T, V extends q> Object g(k<T, V> kVar, x<T> xVar, boolean z10, zd.l<? super c0.h<T, V>, md.i0> lVar, qd.d<? super md.i0> dVar) throws Throwable {
        Object objC = c(kVar, new w(xVar, kVar.i(), kVar.getValue(), kVar.l()), z10 ? kVar.f() : Long.MIN_VALUE, lVar, dVar);
        return objC == rd.d.e() ? objC : md.i0.f15558a;
    }

    public static /* synthetic */ Object h(k kVar, x xVar, boolean z10, zd.l lVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = g.f5983a;
        }
        return g(kVar, xVar, z10, lVar, dVar);
    }

    private static final <R, T, V extends q> Object i(c0.d<T, V> dVar, zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar2) {
        return dVar.a() ? j0.a(lVar, dVar2) : t0.d1.b(new h(lVar), dVar2);
    }

    private static final <T, V extends q> void j(c0.h<T, V> hVar, long j10, long j11, c0.d<T, V> dVar, k<T, V> kVar, zd.l<? super c0.h<T, V>, md.i0> lVar) {
        hVar.j(j10);
        hVar.l(dVar.f(j11));
        hVar.m(dVar.d(j11));
        if (dVar.e(j11)) {
            hVar.i(hVar.c());
            hVar.k(false);
        }
        m(hVar, kVar);
        lVar.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> void k(c0.h<T, V> hVar, long j10, float f10, c0.d<T, V> dVar, k<T, V> kVar, zd.l<? super c0.h<T, V>, md.i0> lVar) {
        j(hVar, j10, (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? dVar.b() : (long) ((j10 - hVar.d()) / f10), dVar, kVar, lVar);
    }

    public static final float l(qd.g gVar) {
        f1.d dVar = (f1.d) gVar.get(f1.d.P);
        float fW = dVar != null ? dVar.w() : 1.0f;
        if (fW >= 0.0f) {
            return fW;
        }
        throw new IllegalStateException("negative scale factor".toString());
    }

    public static final <T, V extends q> void m(c0.h<T, V> hVar, k<T, V> kVar) {
        kVar.s(hVar.e());
        r.f(kVar.l(), hVar.g());
        kVar.n(hVar.b());
        kVar.p(hVar.c());
        kVar.q(hVar.h());
    }
}
