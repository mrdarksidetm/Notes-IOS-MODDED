package qd;

import ae.r;
import md.i0;
import md.t;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final <R, T> d<i0> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        r.f(pVar, "<this>");
        r.f(dVar, "completion");
        return new i(rd.c.c(rd.c.a(pVar, r10, dVar)), rd.d.e());
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        r.f(pVar, "<this>");
        r.f(dVar, "completion");
        d dVarC = rd.c.c(rd.c.a(pVar, r10, dVar));
        t.a aVar = t.f15576b;
        dVarC.resumeWith(t.b(i0.f15558a));
    }
}
