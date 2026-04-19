package oe;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qe.h0 f16507a = new qe.h0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qe.h0 f16508b = new qe.h0("PENDING");

    public static final <T> s<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) pe.p.f18356a;
        }
        return new g0(t10);
    }

    public static final <T> e<T> d(f0<? extends T> f0Var, qd.g gVar, int i10, ne.a aVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && aVar == ne.a.DROP_OLDEST) ? f0Var : x.e(f0Var, gVar, i10, aVar);
    }
}
