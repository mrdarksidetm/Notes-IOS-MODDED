package b0;

import android.view.ViewConfiguration;
import b2.k0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f5036a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f5036a;
    }

    public static final <T> c0.x<T> b(t0.l lVar, int i10) {
        lVar.e(904445851);
        if (t0.o.I()) {
            t0.o.U(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        w2.d dVar = (w2.d) lVar.P(k0.c());
        Float fValueOf = Float.valueOf(dVar.getDensity());
        lVar.e(1157296644);
        boolean zN = lVar.N(fValueOf);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = c0.z.a(new z(dVar));
            lVar.E(objF);
        }
        lVar.K();
        c0.x<T> xVar = (c0.x) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return xVar;
    }
}
