package x2;

import md.i0;
import z.d0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f22944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile d0<a> f22945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f22946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22947e;

    static {
        b bVar = new b();
        f22943a = bVar;
        f22944b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f22945c = new d0<>(0, 1, null);
        Object[] objArr = new Object[0];
        f22946d = objArr;
        synchronized (objArr) {
            bVar.h(f22945c, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(f22945c, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(f22945c, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(f22945c, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(f22945c, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            i0 i0Var = i0.f15558a;
        }
        if (!(bVar.e(f22945c.h(0)) - 0.01f > 1.03f)) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
        }
        f22947e = 8;
    }

    private b() {
    }

    private final a a(a aVar, a aVar2, float f10) {
        float[] fArr = f22944b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f22944b[i10];
            fArr2[i10] = d.f22952a.b(aVar.b(f11), aVar2.b(f11), f10);
        }
        return new c(f22944b, fArr2);
    }

    private final a c(float f10) {
        return f22945c.f(d(f10));
    }

    private final int d(float f10) {
        return (int) (f10 * 100.0f);
    }

    private final float e(int i10) {
        return i10 / 100.0f;
    }

    private final void g(float f10, a aVar) {
        synchronized (f22946d) {
            d0<a> d0VarClone = f22945c.clone();
            f22943a.h(d0VarClone, f10, aVar);
            f22945c = d0VarClone;
            i0 i0Var = i0.f15558a;
        }
    }

    private final void h(d0<a> d0Var, float f10, a aVar) {
        d0Var.i(d(f10), aVar);
    }

    public final a b(float f10) {
        a aVarK;
        a aVarA;
        if (!f(f10)) {
            return null;
        }
        a aVarC = f22943a.c(f10);
        if (aVarC != null) {
            return aVarC;
        }
        int iG = f22945c.g(d(f10));
        if (iG >= 0) {
            return f22945c.k(iG);
        }
        int i10 = (-(iG + 1)) - 1;
        int i11 = i10 + 1;
        float fE = 1.0f;
        if (i11 >= f22945c.j()) {
            aVarA = new c(new float[]{1.0f}, new float[]{f10});
        } else {
            if (i10 < 0) {
                float[] fArr = f22944b;
                aVarK = new c(fArr, fArr);
            } else {
                fE = e(f22945c.h(i10));
                aVarK = f22945c.k(i10);
            }
            aVarA = a(aVarK, f22945c.k(i11), d.f22952a.a(0.0f, 1.0f, fE, e(f22945c.h(i11)), f10));
        }
        g(f10, aVarA);
        return aVarA;
    }

    public final boolean f(float f10) {
        return f10 >= 1.03f;
    }
}
