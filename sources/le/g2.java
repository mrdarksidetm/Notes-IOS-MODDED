package le;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import le.a2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g2 {
    public static final a0 a(a2 a2Var) {
        return new d2(a2Var);
    }

    public static /* synthetic */ a0 b(a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a2Var = null;
        }
        return e2.a(a2Var);
    }

    public static final void c(a2 a2Var, String str, Throwable th) {
        a2Var.cancel(o1.a(str, th));
    }

    public static final void d(qd.g gVar, CancellationException cancellationException) {
        a2 a2Var = (a2) gVar.get(a2.R);
        if (a2Var != null) {
            a2Var.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void e(a2 a2Var, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        e2.c(a2Var, str, th);
    }

    public static /* synthetic */ void f(qd.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        e2.d(gVar, cancellationException);
    }

    public static final Object g(a2 a2Var, qd.d<? super md.i0> dVar) {
        a2.a.b(a2Var, null, 1, null);
        Object objJoin = a2Var.join(dVar);
        return objJoin == rd.d.e() ? objJoin : md.i0.f15558a;
    }

    public static final void h(qd.g gVar, CancellationException cancellationException) {
        ie.g<a2> children;
        a2 a2Var = (a2) gVar.get(a2.R);
        if (a2Var == null || (children = a2Var.getChildren()) == null) {
            return;
        }
        Iterator<a2> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void i(qd.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        e2.h(gVar, cancellationException);
    }

    public static final f1 j(a2 a2Var, f1 f1Var) {
        return a2Var.invokeOnCompletion(new h1(f1Var));
    }

    public static final void k(a2 a2Var) {
        if (!a2Var.isActive()) {
            throw a2Var.getCancellationException();
        }
    }

    public static final void l(qd.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.R);
        if (a2Var != null) {
            e2.l(a2Var);
        }
    }

    public static final a2 m(qd.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.R);
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final boolean n(qd.g gVar) {
        a2 a2Var = (a2) gVar.get(a2.R);
        if (a2Var != null) {
            return a2Var.isActive();
        }
        return true;
    }
}
