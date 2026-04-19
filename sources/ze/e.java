package ze;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {
        public static <T> T a(e eVar, we.a<? extends T> aVar) {
            r.f(aVar, "deserializer");
            return aVar.deserialize(eVar);
        }
    }

    byte A();

    int B(ye.f fVar);

    short C();

    float E();

    e F(ye.f fVar);

    double H();

    c c(ye.f fVar);

    boolean h();

    char i();

    int q();

    Void r();

    String s();

    long u();

    <T> T v(we.a<? extends T> aVar);

    boolean w();
}
