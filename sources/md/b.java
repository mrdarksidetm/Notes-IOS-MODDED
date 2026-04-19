package md;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15538a;

    static {
        t.a aVar = t.f15576b;
        f15538a = t.b(rd.d.e());
    }

    public static final <T, R> R b(a<T, R> aVar, T t10) {
        ae.r.f(aVar, "<this>");
        return (R) new d(aVar.a(), t10).b();
    }
}
