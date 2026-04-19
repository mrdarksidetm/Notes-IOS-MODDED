package e0;

import d0.j0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f10461a = new y();

    private y() {
    }

    public final f a() {
        return f.f10316a.a();
    }

    public final p b(t0.l lVar, int i10) {
        lVar.e(1107739818);
        if (t0.o.I()) {
            t0.o.U(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        c0.x xVarB = b0.a0.b(lVar, 0);
        lVar.e(1157296644);
        boolean zN = lVar.N(xVarB);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new h(xVarB, null, 2, 0 == true ? 1 : 0);
            lVar.E(objF);
        }
        lVar.K();
        h hVar = (h) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return hVar;
    }

    public final j0 c(t0.l lVar, int i10) {
        lVar.e(1809802212);
        if (t0.o.I()) {
            t0.o.U(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        j0 j0VarB = d0.b.b(lVar, 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return j0VarB;
    }

    public final boolean d(w2.r rVar, r rVar2, boolean z10) {
        boolean z11 = !z10;
        return (!(rVar == w2.r.Rtl) || rVar2 == r.Vertical) ? z11 : !z11;
    }
}
