package j0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1.d f13741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<q> f13742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Object, a> f13743c = new LinkedHashMap();

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f13744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f13745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f13746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private zd.p<? super t0.l, ? super Integer, md.i0> f13747d;

        /* JADX INFO: renamed from: j0.o$a$a, reason: collision with other inner class name */
        static final class C0322a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f13749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f13750b;

            /* JADX INFO: renamed from: j0.o$a$a$a, reason: collision with other inner class name */
            static final class C0323a extends ae.s implements zd.l<t0.j0, t0.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f13751a;

                /* JADX INFO: renamed from: j0.o$a$a$a$a, reason: collision with other inner class name */
                public static final class C0324a implements t0.i0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f13752a;

                    public C0324a(a aVar) {
                        this.f13752a = aVar;
                    }

                    @Override // t0.i0
                    public void dispose() {
                        this.f13752a.f13747d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0323a(a aVar) {
                    super(1);
                    this.f13751a = aVar;
                }

                @Override // zd.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final t0.i0 invoke(t0.j0 j0Var) {
                    return new C0324a(this.f13751a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0322a(o oVar, a aVar) {
                super(2);
                this.f13749a = oVar;
                this.f13750b = aVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return md.i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (t0.o.I()) {
                    t0.o.U(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                q qVarInvoke = this.f13749a.d().invoke();
                int iF = this.f13750b.f();
                if ((iF >= qVarInvoke.c() || !ae.r.b(qVarInvoke.a(iF), this.f13750b.g())) && (iF = qVarInvoke.b(this.f13750b.g())) != -1) {
                    this.f13750b.f13746c = iF;
                }
                int i11 = iF;
                boolean z10 = i11 != -1;
                o oVar = this.f13749a;
                a aVar = this.f13750b;
                lVar.u(207, Boolean.valueOf(z10));
                boolean zC = lVar.c(z10);
                if (z10) {
                    p.a(qVarInvoke, m0.a(oVar.f13741a), i11, m0.a(aVar.g()), lVar, 0);
                } else {
                    lVar.n(zC);
                }
                lVar.d();
                t0.l0.b(this.f13750b.g(), new C0323a(this.f13750b), lVar, 8);
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.f13744a = obj;
            this.f13745b = obj2;
            this.f13746c = i10;
        }

        private final zd.p<t0.l, Integer, md.i0> c() {
            return b1.c.c(1403994769, true, new C0322a(o.this, this));
        }

        public final zd.p<t0.l, Integer, md.i0> d() {
            zd.p pVar = this.f13747d;
            if (pVar != null) {
                return pVar;
            }
            zd.p<t0.l, Integer, md.i0> pVarC = c();
            this.f13747d = pVarC;
            return pVarC;
        }

        public final Object e() {
            return this.f13745b;
        }

        public final int f() {
            return this.f13746c;
        }

        public final Object g() {
            return this.f13744a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(c1.d dVar, zd.a<? extends q> aVar) {
        this.f13741a = dVar;
        this.f13742b = aVar;
    }

    public final zd.p<t0.l, Integer, md.i0> b(int i10, Object obj, Object obj2) {
        a aVar = this.f13743c.get(obj);
        if (aVar == null || aVar.f() != i10 || !ae.r.b(aVar.e(), obj2)) {
            aVar = new a(i10, obj, obj2);
            this.f13743c.put(obj, aVar);
        }
        return aVar.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = this.f13743c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        q qVarInvoke = this.f13742b.invoke();
        int iB = qVarInvoke.b(obj);
        if (iB != -1) {
            return qVarInvoke.d(iB);
        }
        return null;
    }

    public final zd.a<q> d() {
        return this.f13742b;
    }
}
