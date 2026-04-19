package y1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {
    f0 a(g0 g0Var, List<? extends d0> list, long j10);

    default int b(n nVar, List<? extends m> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), o.Max, p.Height));
        }
        return a(new q(nVar, nVar.getLayoutDirection()), arrayList, w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int c(n nVar, List<? extends m> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), o.Max, p.Width));
        }
        return a(new q(nVar, nVar.getLayoutDirection()), arrayList, w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int d(n nVar, List<? extends m> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), o.Min, p.Height));
        }
        return a(new q(nVar, nVar.getLayoutDirection()), arrayList, w2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int e(n nVar, List<? extends m> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), o.Min, p.Width));
        }
        return a(new q(nVar, nVar.getLayoutDirection()), arrayList, w2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
