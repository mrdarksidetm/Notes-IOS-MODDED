package ze;

import ae.r;
import we.h;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    public static final class a {
        public static d a(f fVar, ye.f fVar2, int i10) {
            r.f(fVar2, "descriptor");
            return fVar.c(fVar2);
        }

        public static void b(f fVar) {
        }

        public static <T> void c(f fVar, h<? super T> hVar, T t10) {
            r.f(hVar, "serializer");
            if (hVar.getDescriptor().c()) {
                fVar.D(hVar, t10);
            } else if (t10 == null) {
                fVar.g();
            } else {
                fVar.u();
                fVar.D(hVar, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, h<? super T> hVar, T t10) {
            r.f(hVar, "serializer");
            hVar.serialize(fVar, t10);
        }
    }

    void A(int i10);

    void C(long j10);

    <T> void D(h<? super T> hVar, T t10);

    void F(String str);

    df.c a();

    d c(ye.f fVar);

    void f(ye.f fVar, int i10);

    void g();

    void h(double d10);

    void i(short s10);

    void l(byte b10);

    void n(boolean z10);

    d p(ye.f fVar, int i10);

    void q(float f10);

    void t(char c10);

    void u();

    f z(ye.f fVar);
}
