package le;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final void a(o<?> oVar, f1 f1Var) {
        oVar.p(new g1(f1Var));
    }

    public static final <T> p<T> b(qd.d<? super T> dVar) {
        if (!(dVar instanceof qe.j)) {
            return new p<>(dVar, 1);
        }
        p<T> pVarM = ((qe.j) dVar).m();
        if (pVarM != null) {
            if (!pVarM.J()) {
                pVarM = null;
            }
            if (pVarM != null) {
                return pVarM;
            }
        }
        return new p<>(dVar, 2);
    }
}
