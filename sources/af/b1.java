package af;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 {
    public static final int a(ye.f fVar, ye.f[] fVarArr) {
        ae.r.f(fVar, "<this>");
        ae.r.f(fVarArr, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(fVarArr);
        Iterable<ye.f> iterableA = ye.h.a(fVar);
        Iterator<ye.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strA = it.next().a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<ye.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            ye.j jVarE = it2.next().e();
            iHashCode2 = i12 + (jVarE != null ? jVarE.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
