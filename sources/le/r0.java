package le;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(qd.d<?> dVar) {
        Object objB;
        if (dVar instanceof qe.j) {
            return dVar.toString();
        }
        try {
            t.a aVar = md.t.f15576b;
            objB = md.t.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            t.a aVar2 = md.t.f15576b;
            objB = md.t.b(md.u.a(th));
        }
        if (md.t.e(objB) != null) {
            objB = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objB;
    }
}
