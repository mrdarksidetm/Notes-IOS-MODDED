package le;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 {
    public static final Object a(qd.d<? super md.i0> dVar) {
        Object objE;
        qd.g context = dVar.getContext();
        e2.m(context);
        qd.d dVarC = rd.c.c(dVar);
        qe.j jVar = dVarC instanceof qe.j ? (qe.j) dVarC : null;
        if (jVar == null) {
            objE = md.i0.f15558a;
        } else {
            if (jVar.f19062d.i0(context)) {
                jVar.n(context, md.i0.f15558a);
            } else {
                h3 h3Var = new h3();
                qd.g gVarPlus = context.plus(h3Var);
                md.i0 i0Var = md.i0.f15558a;
                jVar.n(gVarPlus, i0Var);
                if (h3Var.f15032b && !qe.k.d(jVar)) {
                    objE = i0Var;
                }
            }
            objE = rd.d.e();
        }
        if (objE == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objE == rd.d.e() ? objE : md.i0.f15558a;
    }
}
