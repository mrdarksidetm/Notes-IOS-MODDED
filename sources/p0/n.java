package p0;

import c0.d0;
import c0.i1;
import d0.y;
import l1.j0;
import t0.f3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i1<Float> f17845a = new i1<>(15, 0, d0.d(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0.i<Float> c(g0.j jVar) {
        if ((jVar instanceof g0.g) || (!(jVar instanceof g0.d) && !(jVar instanceof g0.b))) {
            return f17845a;
        }
        return new i1(45, 0, d0.d(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0.i<Float> d(g0.j jVar) {
        return ((jVar instanceof g0.g) || (jVar instanceof g0.d) || !(jVar instanceof g0.b)) ? f17845a : new i1(150, 0, d0.d(), 2, null);
    }

    public static final y e(boolean z10, float f10, long j10, t0.l lVar, int i10, int i11) {
        lVar.e(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = w2.h.f22405b.c();
        }
        if ((i11 & 4) != 0) {
            j10 = j0.f14524b.j();
        }
        if (t0.o.I()) {
            t0.o.U(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:80)");
        }
        p3 p3VarO = f3.o(j0.m(j10), lVar, (i10 >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z10);
        w2.h hVarI = w2.h.i(f10);
        lVar.e(511388516);
        boolean zN = lVar.N(boolValueOf) | lVar.N(hVarI);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new d(z10, f10, p3VarO, null);
            lVar.E(objF);
        }
        lVar.K();
        d dVar = (d) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return dVar;
    }
}
