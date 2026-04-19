package ue;

import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: ue.a$a, reason: collision with other inner class name */
    public static final class C0444a {
        public static /* synthetic */ Object a(a aVar, Object obj, qd.d dVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj, dVar);
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.b(obj);
        }
    }

    Object a(Object obj, qd.d<? super i0> dVar);

    void b(Object obj);
}
