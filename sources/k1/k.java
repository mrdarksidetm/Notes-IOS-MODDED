package k1;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final j a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = b.a(f14, f15);
        return new j(f10, f11, f12, f13, jA, jA, jA, jA, null);
    }

    public static final j b(h hVar, long j10, long j11, long j12, long j13) {
        return new j(hVar.f(), hVar.i(), hVar.g(), hVar.c(), j10, j11, j12, j13, null);
    }

    public static final j c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, a.d(j10), a.e(j10));
    }

    public static final boolean d(j jVar) {
        if (a.d(jVar.h()) == a.e(jVar.h())) {
            if (a.d(jVar.h()) == a.d(jVar.i())) {
                if (a.d(jVar.h()) == a.e(jVar.i())) {
                    if (a.d(jVar.h()) == a.d(jVar.c())) {
                        if (a.d(jVar.h()) == a.e(jVar.c())) {
                            if (a.d(jVar.h()) == a.d(jVar.b())) {
                                if (a.d(jVar.h()) == a.e(jVar.b())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final j e(j jVar, long j10) {
        return new j(f.o(j10) + jVar.e(), f.p(j10) + jVar.g(), f.o(j10) + jVar.f(), f.p(j10) + jVar.a(), jVar.h(), jVar.i(), jVar.c(), jVar.b(), null);
    }
}
