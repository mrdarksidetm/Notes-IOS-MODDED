package b0;

import c0.j1;
import c0.l1;
import l1.j0;
import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.l<m1.c, j1<j0, c0.p>> f5101a = a.f5102a;

    static final class a extends ae.s implements zd.l<m1.c, j1<j0, c0.p>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5102a = new a();

        /* JADX INFO: renamed from: b0.i$a$a, reason: collision with other inner class name */
        static final class C0122a extends ae.s implements zd.l<j0, c0.p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0122a f5103a = new C0122a();

            C0122a() {
                super(1);
            }

            public final c0.p a(long j10) {
                long jS = j0.s(j10, m1.g.f15198a.t());
                return new c0.p(j0.q(jS), j0.n(jS), j0.o(jS), j0.p(jS));
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ c0.p invoke(j0 j0Var) {
                return a(j0Var.E());
            }
        }

        static final class b extends ae.s implements zd.l<c0.p, j0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m1.c f5104a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m1.c cVar) {
                super(1);
                this.f5104a = cVar;
            }

            public final long a(c0.p pVar) {
                return j0.s(l0.a(ge.o.k(pVar.g(), 0.0f, 1.0f), ge.o.k(pVar.h(), -0.5f, 0.5f), ge.o.k(pVar.i(), -0.5f, 0.5f), ge.o.k(pVar.f(), 0.0f, 1.0f), m1.g.f15198a.t()), this.f5104a);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ j0 invoke(c0.p pVar) {
                return j0.m(a(pVar));
            }
        }

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1<j0, c0.p> invoke(m1.c cVar) {
            return l1.a(C0122a.f5103a, new b(cVar));
        }
    }

    public static final zd.l<m1.c, j1<j0, c0.p>> a(j0.a aVar) {
        return f5101a;
    }
}
