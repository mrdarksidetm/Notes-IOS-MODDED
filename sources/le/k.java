package le;

import qd.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k {
    public static final <T> u0<T> a(n0 n0Var, qd.g gVar, p0 p0Var, zd.p<? super n0, ? super qd.d<? super T>, ? extends Object> pVar) {
        qd.g gVarD = i0.d(n0Var, gVar);
        v0 k2Var = p0Var.c() ? new k2(gVarD, pVar) : new v0(gVarD, true);
        ((a) k2Var).R0(p0Var, k2Var, pVar);
        return (u0<T>) k2Var;
    }

    public static /* synthetic */ u0 b(n0 n0Var, qd.g gVar, p0 p0Var, zd.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        if ((i10 & 2) != 0) {
            p0Var = p0.DEFAULT;
        }
        return i.a(n0Var, gVar, p0Var, pVar);
    }

    public static final a2 c(n0 n0Var, qd.g gVar, p0 p0Var, zd.p<? super n0, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        qd.g gVarD = i0.d(n0Var, gVar);
        a l2Var = p0Var.c() ? new l2(gVarD, pVar) : new u2(gVarD, true);
        l2Var.R0(p0Var, l2Var, pVar);
        return l2Var;
    }

    public static /* synthetic */ a2 d(n0 n0Var, qd.g gVar, p0 p0Var, zd.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        if ((i10 & 2) != 0) {
            p0Var = p0.DEFAULT;
        }
        return i.c(n0Var, gVar, p0Var, pVar);
    }

    public static final <T> Object e(qd.g gVar, zd.p<? super n0, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) throws Throwable {
        Object objS0;
        qd.g context = dVar.getContext();
        qd.g gVarE = i0.e(context, gVar);
        e2.m(gVarE);
        if (gVarE == context) {
            qe.d0 d0Var = new qe.d0(gVarE, dVar);
            objS0 = re.b.b(d0Var, d0Var, pVar);
        } else {
            e.b bVar = qd.e.U;
            if (ae.r.b(gVarE.get(bVar), context.get(bVar))) {
                e3 e3Var = new e3(gVarE, dVar);
                qd.g context2 = e3Var.getContext();
                Object objC = qe.l0.c(context2, null);
                try {
                    Object objB = re.b.b(e3Var, e3Var, pVar);
                    qe.l0.a(context2, objC);
                    objS0 = objB;
                } catch (Throwable th) {
                    qe.l0.a(context2, objC);
                    throw th;
                }
            } else {
                z0 z0Var = new z0(gVarE, dVar);
                re.a.d(pVar, z0Var, z0Var, null, 4, null);
                objS0 = z0Var.S0();
            }
        }
        if (objS0 == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objS0;
    }
}
