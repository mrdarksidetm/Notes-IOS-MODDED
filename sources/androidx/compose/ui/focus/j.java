package androidx.compose.ui.focus;

import a2.f0;
import ae.r;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class j implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f2734a = new j();

    private j() {
    }

    private final v0.d<f0> b(f0 f0Var) {
        v0.d<f0> dVar = new v0.d<>(new f0[16], 0);
        while (f0Var != null) {
            dVar.a(0, f0Var);
            f0Var = f0Var.k0();
        }
        return dVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (focusTargetNode == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (focusTargetNode2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        int i10 = 0;
        if (!i.g(focusTargetNode) || !i.g(focusTargetNode2)) {
            if (i.g(focusTargetNode)) {
                return -1;
            }
            return i.g(focusTargetNode2) ? 1 : 0;
        }
        f0 f0VarK = a2.k.k(focusTargetNode);
        f0 f0VarK2 = a2.k.k(focusTargetNode2);
        if (r.b(f0VarK, f0VarK2)) {
            return 0;
        }
        v0.d<f0> dVarB = b(f0VarK);
        v0.d<f0> dVarB2 = b(f0VarK2);
        int iMin = Math.min(dVarB.o() - 1, dVarB2.o() - 1);
        if (iMin >= 0) {
            while (r.b(dVarB.n()[i10], dVarB2.n()[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return r.g(dVarB.n()[i10].l0(), dVarB2.n()[i10].l0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
