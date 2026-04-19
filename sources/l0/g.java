package l0;

import w2.h;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f14486a = a(50);

    public static final f a(int i10) {
        return b(c.a(i10));
    }

    public static final f b(b bVar) {
        return new f(bVar, bVar, bVar, bVar);
    }

    public static final f c(float f10) {
        return b(c.b(f10));
    }

    public static final f d(float f10, float f11, float f12, float f13) {
        return new f(c.b(f10), c.b(f11), c.b(f12), c.b(f13));
    }

    public static /* synthetic */ f e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.m(0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.m(0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.m(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final f f() {
        return f14486a;
    }
}
