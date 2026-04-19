package t0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(l lVar, zd.p<? super l, ? super Integer, md.i0> pVar) {
        ae.r.d(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((zd.p) ae.n0.e(pVar, 2)).invoke(lVar, 1);
    }
}
