package h0;

import f1.b;
import h0.b;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y1.e0 f11662a;

    static {
        v vVar = v.Vertical;
        b bVar = b.f11594a;
        b.e eVar = null;
        f11662a = new c0(vVar, eVar, bVar.h(), bVar.h().a(), i0.Wrap, k.f11671a.a(f1.b.f11020a.k()), null);
    }

    public static final y1.e0 a(b.m mVar, b.InterfaceC0266b interfaceC0266b, t0.l lVar, int i10) {
        y1.e0 e0Var;
        lVar.e(1089876336);
        if (t0.o.I()) {
            t0.o.U(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:101)");
        }
        if (ae.r.b(mVar, b.f11594a.h()) && ae.r.b(interfaceC0266b, f1.b.f11020a.k())) {
            e0Var = f11662a;
        } else {
            lVar.e(511388516);
            boolean zN = lVar.N(mVar) | lVar.N(interfaceC0266b);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                b.e eVar = null;
                objF = new c0(v.Vertical, eVar, mVar, mVar.a(), i0.Wrap, k.f11671a.a(interfaceC0266b), null);
                lVar.E(objF);
            }
            lVar.K();
            e0Var = (y1.e0) objF;
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return e0Var;
    }
}
