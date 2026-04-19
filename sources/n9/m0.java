package n9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements Comparator<c> {
    m0() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(c cVar, c cVar2) {
        c cVar3 = cVar;
        c cVar4 = cVar2;
        w8.m.k(cVar3);
        w8.m.k(cVar4);
        int iU = cVar3.u();
        int iU2 = cVar4.u();
        if (iU != iU2) {
            return iU >= iU2 ? 1 : -1;
        }
        int iX = cVar3.x();
        int iX2 = cVar4.x();
        if (iX == iX2) {
            return 0;
        }
        return iX < iX2 ? -1 : 1;
    }
}
