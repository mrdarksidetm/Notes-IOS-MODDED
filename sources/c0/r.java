package c0;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final m a(float f10) {
        return new m(f10);
    }

    public static final n b(float f10, float f11) {
        return new n(f10, f11);
    }

    public static final o c(float f10, float f11, float f12) {
        return new o(f10, f11, f12);
    }

    public static final p d(float f10, float f11, float f12, float f13) {
        return new p(f10, f11, f12, f13);
    }

    public static final <T extends q> T e(T t10) {
        T t11 = (T) g(t10);
        int iB = t11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends q> void f(T t10, T t11) {
        int iB = t10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    public static final <T extends q> T g(T t10) {
        T t11 = (T) t10.c();
        ae.r.d(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }
}
