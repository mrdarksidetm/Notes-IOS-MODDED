package b2;

/* JADX INFO: loaded from: classes.dex */
public interface x1 {
    long a();

    long b();

    long c();

    default long d() {
        float f10 = 48;
        return w2.i.b(w2.h.m(f10), w2.h.m(f10));
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();
}
