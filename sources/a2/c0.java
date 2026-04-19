package a2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(o0 o0Var, y1.a aVar) {
        o0 o0VarI0 = o0Var.I0();
        if (!(o0VarI0 != null)) {
            throw new IllegalStateException(("Child of " + o0Var + " cannot be null when calculating alignment line").toString());
        }
        if (o0Var.N0().d().containsKey(aVar)) {
            Integer num = o0Var.N0().d().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iE0 = o0VarI0.E0(aVar);
        if (iE0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        o0VarI0.p1(true);
        o0Var.n1(true);
        o0Var.m1();
        o0VarI0.p1(false);
        o0Var.n1(false);
        return iE0 + (aVar instanceof y1.k ? w2.n.k(o0VarI0.W0()) : w2.n.j(o0VarI0.W0()));
    }
}
