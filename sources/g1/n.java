package g1;

import java.util.LinkedHashMap;
import java.util.Map;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, m> f11271a = new LinkedHashMap();

    public final Map<Integer, m> a() {
        return this.f11271a;
    }

    public final i0 b(int i10, String str) {
        zd.l<String, i0> lVarC;
        m mVar = this.f11271a.get(Integer.valueOf(i10));
        if (mVar == null || (lVarC = mVar.c()) == null) {
            return null;
        }
        lVarC.invoke(str);
        return i0.f15558a;
    }
}
