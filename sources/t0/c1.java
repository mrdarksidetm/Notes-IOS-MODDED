package t0;

import qd.g;

/* JADX INFO: loaded from: classes.dex */
public interface c1 extends g.b {
    public static final b W = b.f20635a;

    public static final class a {
        public static <R> R a(c1 c1Var, R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(c1Var, r10, pVar);
        }

        public static <E extends g.b> E b(c1 c1Var, g.c<E> cVar) {
            return (E) g.b.a.b(c1Var, cVar);
        }

        public static qd.g c(c1 c1Var, g.c<?> cVar) {
            return g.b.a.c(c1Var, cVar);
        }

        public static qd.g d(c1 c1Var, qd.g gVar) {
            return g.b.a.d(c1Var, gVar);
        }
    }

    public static final class b implements g.c<c1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f20635a = new b();

        private b() {
        }
    }

    <R> Object M(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar);

    @Override // qd.g.b
    default g.c<?> getKey() {
        return W;
    }
}
