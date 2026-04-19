package f1;

import qd.g;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public interface d extends g.b {
    public static final b P = b.f11041a;

    public static final class a {
        public static <R> R a(d dVar, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(dVar, r10, pVar);
        }

        public static <E extends g.b> E b(d dVar, g.c<E> cVar) {
            return (E) g.b.a.b(dVar, cVar);
        }

        public static qd.g c(d dVar, g.c<?> cVar) {
            return g.b.a.c(dVar, cVar);
        }

        public static qd.g d(d dVar, qd.g gVar) {
            return g.b.a.d(dVar, gVar);
        }
    }

    public static final class b implements g.c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f11041a = new b();

        private b() {
        }
    }

    @Override // qd.g.b
    default g.c<?> getKey() {
        return P;
    }

    float w();
}
