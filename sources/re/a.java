package re;

import md.i0;
import md.t;
import md.u;
import qd.d;
import qe.k;
import rd.c;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) throws Throwable {
        t.a aVar = t.f15576b;
        dVar.resumeWith(t.b(u.a(th)));
        throw th;
    }

    public static final void b(d<? super i0> dVar, d<?> dVar2) throws Throwable {
        try {
            d dVarC = c.c(dVar);
            t.a aVar = t.f15576b;
            k.c(dVarC, t.b(i0.f15558a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, l<? super Throwable, i0> lVar) throws Throwable {
        try {
            d dVarC = c.c(c.a(pVar, r10, dVar));
            t.a aVar = t.f15576b;
            k.b(dVarC, t.b(i0.f15558a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) throws Throwable {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
