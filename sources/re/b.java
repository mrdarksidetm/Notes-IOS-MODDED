package re;

import ae.n0;
import le.a3;
import le.c0;
import le.j2;
import md.t;
import md.u;
import qd.d;
import qd.g;
import qe.d0;
import qe.l0;
import sd.f;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        Object objA;
        d dVarA = f.a(dVar);
        try {
            g context = dVar.getContext();
            Object objC = l0.c(context, null);
            try {
                objA = ((p) n0.e(pVar, 2)).invoke(r10, dVarA);
                if (objA == rd.d.e()) {
                    return;
                }
            } finally {
                l0.a(context, objC);
            }
        } catch (Throwable th) {
            t.a aVar = t.f15576b;
            objA = u.a(th);
        }
        dVarA.resumeWith(t.b(objA));
    }

    public static final <T, R> Object b(d0<? super T> d0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object c0Var;
        Object objO0;
        try {
            c0Var = ((p) n0.e(pVar, 2)).invoke(r10, d0Var);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var == rd.d.e() || (objO0 = d0Var.o0(c0Var)) == j2.f15069b) {
            return rd.d.e();
        }
        if (objO0 instanceof c0) {
            throw ((c0) objO0).f14990a;
        }
        return j2.h(objO0);
    }

    public static final <T, R> Object c(d0<? super T> d0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) throws Throwable {
        Object c0Var;
        Object objO0;
        try {
            c0Var = ((p) n0.e(pVar, 2)).invoke(r10, d0Var);
        } catch (Throwable th) {
            c0Var = new c0(th, false, 2, null);
        }
        if (c0Var == rd.d.e() || (objO0 = d0Var.o0(c0Var)) == j2.f15069b) {
            return rd.d.e();
        }
        if (objO0 instanceof c0) {
            Throwable th2 = ((c0) objO0).f14990a;
            if (((th2 instanceof a3) && ((a3) th2).f14981a == d0Var) ? false : true) {
                throw th2;
            }
            if (c0Var instanceof c0) {
                throw ((c0) c0Var).f14990a;
            }
        } else {
            c0Var = j2.h(objO0);
        }
        return c0Var;
    }
}
