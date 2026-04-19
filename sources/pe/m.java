package pe;

/* JADX INFO: loaded from: classes2.dex */
public interface m<T> extends oe.e<T> {

    public static final class a {
        public static /* synthetic */ oe.e a(m mVar, qd.g gVar, int i10, ne.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                gVar = qd.h.f19040a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = ne.a.SUSPEND;
            }
            return mVar.c(gVar, i10, aVar);
        }
    }

    oe.e<T> c(qd.g gVar, int i10, ne.a aVar);
}
