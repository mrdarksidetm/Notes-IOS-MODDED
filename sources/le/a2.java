package le;

import java.util.concurrent.CancellationException;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public interface a2 extends g.b {
    public static final b R = b.f14980a;

    public static final class a {
        public static /* synthetic */ void b(a2 a2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            a2Var.cancel(cancellationException);
        }

        public static <R> R c(a2 a2Var, R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(a2Var, r10, pVar);
        }

        public static <E extends g.b> E d(a2 a2Var, g.c<E> cVar) {
            return (E) g.b.a.b(a2Var, cVar);
        }

        public static /* synthetic */ f1 e(a2 a2Var, boolean z10, boolean z11, zd.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return a2Var.invokeOnCompletion(z10, z11, lVar);
        }

        public static qd.g f(a2 a2Var, g.c<?> cVar) {
            return g.b.a.c(a2Var, cVar);
        }

        public static a2 g(a2 a2Var, a2 a2Var2) {
            return a2Var2;
        }

        public static qd.g h(a2 a2Var, qd.g gVar) {
            return g.b.a.d(a2Var, gVar);
        }
    }

    public static final class b implements g.c<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f14980a = new b();

        private b() {
        }
    }

    u attachChild(w wVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    ie.g<a2> getChildren();

    te.a getOnJoin();

    a2 getParent();

    f1 invokeOnCompletion(zd.l<? super Throwable, md.i0> lVar);

    f1 invokeOnCompletion(boolean z10, boolean z11, zd.l<? super Throwable, md.i0> lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(qd.d<? super md.i0> dVar);

    a2 plus(a2 a2Var);

    boolean start();
}
