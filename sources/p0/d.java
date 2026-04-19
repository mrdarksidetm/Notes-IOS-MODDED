package p0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import l1.j0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    private d(boolean z10, float f10, p3<j0> p3Var) {
        super(z10, f10, p3Var, null);
    }

    public /* synthetic */ d(boolean z10, float f10, p3 p3Var, ae.j jVar) {
        this(z10, f10, p3Var);
    }

    private final ViewGroup c(t0.l lVar, int i10) {
        lVar.e(-1737891121);
        if (t0.o.I()) {
            t0.o.U(-1737891121, i10, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:86)");
        }
        Object objP = lVar.P(androidx.compose.ui.platform.r.j());
        while (!(objP instanceof ViewGroup)) {
            ViewParent parent = ((View) objP).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objP + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            objP = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objP;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return viewGroup;
    }

    @Override // p0.e
    public m b(g0.k kVar, boolean z10, float f10, p3<j0> p3Var, p3<f> p3Var2, t0.l lVar, int i10) {
        lVar.e(331259447);
        if (t0.o.I()) {
            t0.o.U(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:63)");
        }
        ViewGroup viewGroupC = c(lVar, (i10 >> 15) & 14);
        lVar.e(1643267293);
        if (viewGroupC.isInEditMode()) {
            lVar.e(511388516);
            boolean zN = lVar.N(kVar) | lVar.N(this);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new b(z10, f10, p3Var, p3Var2, null);
                lVar.E(objF);
            }
            lVar.K();
            b bVar = (b) objF;
            lVar.K();
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return bVar;
        }
        lVar.K();
        lVar.e(1618982084);
        boolean zN2 = lVar.N(kVar) | lVar.N(this) | lVar.N(viewGroupC);
        Object objF2 = lVar.f();
        if (zN2 || objF2 == t0.l.f20813a.a()) {
            objF2 = new a(z10, f10, p3Var, p3Var2, viewGroupC, null);
            lVar.E(objF2);
        }
        lVar.K();
        a aVar = (a) objF2;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return aVar;
    }
}
