package af;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    public static final void a(int i10, int i11, ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(fVar.g(i13));
            }
            i12 >>>= 1;
        }
        throw new we.c(arrayList, fVar.a());
    }
}
