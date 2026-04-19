package cf;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f6951a;

    static {
        Object objB;
        try {
            t.a aVar = md.t.f15576b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            ae.r.e(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objB = md.t.b(je.u.l(property));
        } catch (Throwable th) {
            t.a aVar2 = md.t.f15576b;
            objB = md.t.b(md.u.a(th));
        }
        if (md.t.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f6951a = num != null ? num.intValue() : 2097152;
    }
}
