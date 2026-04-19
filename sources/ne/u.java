package ne;

import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public interface u<E> {

    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return uVar.h(th);
        }
    }

    Object b(E e10, qd.d<? super i0> dVar);

    void e(zd.l<? super Throwable, i0> lVar);

    boolean h(Throwable th);

    Object i(E e10);

    boolean k();
}
