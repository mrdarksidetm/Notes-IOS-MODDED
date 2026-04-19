package le;

/* JADX INFO: loaded from: classes2.dex */
public interface o<T> extends qd.d<T> {

    public static final class a {
        public static /* synthetic */ boolean a(o oVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return oVar.cancel(th);
        }
    }

    boolean cancel(Throwable th);

    Object d(T t10, Object obj, zd.l<? super Throwable, md.i0> lVar);

    void f(T t10, zd.l<? super Throwable, md.i0> lVar);

    boolean isCompleted();

    void j(j0 j0Var, T t10);

    Object l(Throwable th);

    void p(zd.l<? super Throwable, md.i0> lVar);

    void r(Object obj);
}
