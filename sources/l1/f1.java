package l1;

/* JADX INFO: loaded from: classes.dex */
public interface f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14507a = a.f14508a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f14508a = new a();

        private a() {
        }
    }

    boolean a();

    void b(float f10, float f11);

    void c(float f10, float f11, float f12, float f13, float f14, float f15);

    void close();

    void d(float f10, float f11, float f12, float f13);

    boolean e(f1 f1Var, f1 f1Var2, int i10);

    void f(float f10, float f11, float f12, float f13);

    void g(int i10);

    k1.h getBounds();

    void h(f1 f1Var, long j10);

    int i();

    boolean isEmpty();

    void j(k1.h hVar);

    void k(float f10, float f11);

    void l(k1.h hVar);

    void m(k1.j jVar);

    void n(float f10, float f11, float f12, float f13, float f14, float f15);

    default void o() {
        reset();
    }

    void p(float f10, float f11);

    void q(float f10, float f11);

    void reset();
}
