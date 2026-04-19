package le;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 {
    public static final n0 a(qd.g gVar) {
        if (gVar.get(a2.R) == null) {
            gVar = gVar.plus(g2.b(null, 1, null));
        }
        return new qe.f(gVar);
    }

    public static final n0 b() {
        return new qe.f(w2.b(null, 1, null).plus(d1.c()));
    }

    public static final void c(n0 n0Var, CancellationException cancellationException) {
        a2 a2Var = (a2) n0Var.getCoroutineContext().get(a2.R);
        if (a2Var != null) {
            a2Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n0Var).toString());
    }

    public static /* synthetic */ void d(n0 n0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(n0Var, cancellationException);
    }

    public static final <R> Object e(zd.p<? super n0, ? super qd.d<? super R>, ? extends Object> pVar, qd.d<? super R> dVar) {
        qe.d0 d0Var = new qe.d0(dVar.getContext(), dVar);
        Object objB = re.b.b(d0Var, d0Var, pVar);
        if (objB == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objB;
    }

    public static final void f(n0 n0Var) {
        e2.m(n0Var.getCoroutineContext());
    }

    public static final boolean g(n0 n0Var) {
        a2 a2Var = (a2) n0Var.getCoroutineContext().get(a2.R);
        if (a2Var != null) {
            return a2Var.isActive();
        }
        return true;
    }
}
