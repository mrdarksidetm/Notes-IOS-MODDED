package ze;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, ye.f fVar) {
            r.f(fVar, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, ye.f fVar, int i10, we.a aVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.k(fVar, i10, aVar, obj);
        }
    }

    byte D(ye.f fVar, int i10);

    e G(ye.f fVar, int i10);

    df.c a();

    void d(ye.f fVar);

    char e(ye.f fVar, int i10);

    short f(ye.f fVar, int i10);

    boolean g(ye.f fVar, int i10);

    float j(ye.f fVar, int i10);

    <T> T k(ye.f fVar, int i10, we.a<? extends T> aVar, T t10);

    <T> T l(ye.f fVar, int i10, we.a<? extends T> aVar, T t10);

    String m(ye.f fVar, int i10);

    int n(ye.f fVar);

    int o(ye.f fVar, int i10);

    long t(ye.f fVar, int i10);

    boolean x();

    double y(ye.f fVar, int i10);

    int z(ye.f fVar);
}
