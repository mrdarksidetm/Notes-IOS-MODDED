package i2;

import u2.k;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12383a;

        static {
            int[] iArr = new int[w2.r.values().length];
            try {
                iArr[w2.r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w2.r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12383a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y b(x xVar, w wVar) {
        if (wVar == null) {
            return null;
        }
        return c.a(xVar, wVar);
    }

    public static final g0 c(g0 g0Var, w2.r rVar) {
        return new g0(b0.d(g0Var.A()), t.c(g0Var.x(), rVar), g0Var.y());
    }

    public static final int d(w2.r rVar, int i10) {
        k.a aVar = u2.k.f21574b;
        if (u2.k.j(i10, aVar.a())) {
            int i11 = a.f12383a[rVar.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new md.q();
        }
        if (!u2.k.j(i10, aVar.f())) {
            return i10;
        }
        int i12 = a.f12383a[rVar.ordinal()];
        if (i12 == 1) {
            return aVar.d();
        }
        if (i12 == 2) {
            return aVar.e();
        }
        throw new md.q();
    }
}
