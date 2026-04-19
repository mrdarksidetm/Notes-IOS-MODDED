package le;

import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {
    public static final Object a(long j10, qd.d<? super md.i0> dVar) {
        if (j10 <= 0) {
            return md.i0.f15558a;
        }
        p pVar = new p(rd.c.c(dVar), 1);
        pVar.A();
        if (j10 < Long.MAX_VALUE) {
            b(pVar.getContext()).Y(j10, pVar);
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    public static final w0 b(qd.g gVar) {
        g.b bVar = gVar.get(qd.e.U);
        w0 w0Var = bVar instanceof w0 ? (w0) bVar : null;
        return w0Var == null ? t0.a() : w0Var;
    }
}
