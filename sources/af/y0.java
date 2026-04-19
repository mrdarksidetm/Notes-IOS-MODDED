package af;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ye.f[] f863a = new ye.f[0];

    public static final Set<String> a(ye.f fVar) {
        ae.r.f(fVar, "<this>");
        if (fVar instanceof l) {
            return ((l) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int iF = fVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            hashSet.add(fVar.g(i10));
        }
        return hashSet;
    }

    public static final ye.f[] b(List<? extends ye.f> list) {
        ye.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (ye.f[]) list.toArray(new ye.f[0])) == null) ? f863a : fVarArr;
    }
}
