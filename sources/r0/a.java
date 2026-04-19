package r0;

import ae.r;
import java.util.ArrayList;
import java.util.List;
import l1.l1;
import m5.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(List<? extends m5.c> list) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (m5.c cVar : list) {
            if (r.b(cVar.c(), c.b.f15421d) && r.b(cVar.getState(), c.C0352c.f15425d)) {
                z10 = true;
            }
            arrayList.add(new c(l1.b(cVar.getBounds()), r.b(cVar.getState(), c.C0352c.f15424c), r.b(cVar.c(), c.b.f15420c), cVar.a(), r.b(cVar.b(), c.a.f15417d)));
        }
        return new d(z10, arrayList);
    }
}
