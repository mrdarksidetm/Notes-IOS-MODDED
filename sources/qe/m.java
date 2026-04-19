package qe;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f19077a;

    static {
        Object objB;
        try {
            t.a aVar = md.t.f15576b;
            objB = md.t.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            t.a aVar2 = md.t.f15576b;
            objB = md.t.b(md.u.a(th));
        }
        f19077a = md.t.h(objB);
    }

    public static final boolean a() {
        return f19077a;
    }
}
