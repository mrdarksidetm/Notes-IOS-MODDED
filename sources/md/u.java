package md;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class u {
    public static final Object a(Throwable th) {
        ae.r.f(th, "exception");
        return new t.b(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof t.b) {
            throw ((t.b) obj).f15578a;
        }
    }
}
