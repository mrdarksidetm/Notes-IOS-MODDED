package j0;

import j0.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final List<Integer> a(q qVar, a0 a0Var, i iVar) {
        if (!iVar.d() && a0Var.isEmpty()) {
            return nd.u.m();
        }
        ArrayList arrayList = new ArrayList();
        ge.i iVar2 = iVar.d() ? new ge.i(iVar.c(), Math.min(iVar.b(), qVar.c() - 1)) : ge.i.f11541e.a();
        int size = a0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0.a aVar = a0Var.get(i10);
            int iA = r.a(qVar, aVar.getKey(), aVar.getIndex());
            if (!(iA <= iVar2.n() && iVar2.l() <= iA)) {
                if (iA >= 0 && iA < qVar.c()) {
                    arrayList.add(Integer.valueOf(iA));
                }
            }
        }
        int iL = iVar2.l();
        int iN = iVar2.n();
        if (iL <= iN) {
            while (true) {
                arrayList.add(Integer.valueOf(iL));
                if (iL == iN) {
                    break;
                }
                iL++;
            }
        }
        return arrayList;
    }
}
