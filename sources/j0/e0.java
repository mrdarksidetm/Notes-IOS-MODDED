package j0;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {
    boolean a();

    default float b() {
        return c() + (g() * 500);
    }

    int c();

    g2.b d();

    default float e() {
        return a() ? b() + 100 : b();
    }

    Object f(int i10, qd.d<? super md.i0> dVar);

    int g();

    Object h(float f10, qd.d<? super md.i0> dVar);
}
