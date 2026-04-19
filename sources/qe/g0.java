package qe;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f19056a = new b.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19058c;

    static {
        Object objB;
        Object objB2;
        try {
            t.a aVar = md.t.f15576b;
            objB = md.t.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            t.a aVar2 = md.t.f15576b;
            objB = md.t.b(md.u.a(th));
        }
        if (md.t.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f19057b = (String) objB;
        try {
            objB2 = md.t.b(g0.class.getCanonicalName());
        } catch (Throwable th2) {
            t.a aVar3 = md.t.f15576b;
            objB2 = md.t.b(md.u.a(th2));
        }
        if (md.t.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f19058c = (String) objB2;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
