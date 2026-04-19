package i2;

import i2.d;
import java.util.List;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final p a(String str, g0 g0Var, List<d.b<a0>> list, List<d.b<u>> list2, w2.d dVar, t.b bVar) {
        return r2.e.a(str, g0Var, list, list2, dVar, bVar);
    }

    public static /* synthetic */ p b(String str, g0 g0Var, List list, List list2, w2.d dVar, t.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = nd.u.m();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = nd.u.m();
        }
        return a(str, g0Var, list3, list2, dVar, bVar);
    }
}
