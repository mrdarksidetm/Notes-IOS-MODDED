package h0;

import f1.b;
import h0.b;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y1.e0 f11661a;

    static {
        v vVar = v.Horizontal;
        b bVar = b.f11594a;
        b.m mVar = null;
        f11661a = new c0(vVar, bVar.g(), mVar, bVar.g().a(), i0.Wrap, k.f11671a.b(f1.b.f11020a.l()), null);
    }

    public static final y1.e0 a(b.e eVar, b.c cVar, t0.l lVar, int i10) {
        y1.e0 e0Var;
        lVar.e(-837807694);
        if (t0.o.I()) {
            t0.o.U(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (ae.r.b(eVar, b.f11594a.g()) && ae.r.b(cVar, f1.b.f11020a.l())) {
            e0Var = f11661a;
        } else {
            lVar.e(511388516);
            boolean zN = lVar.N(eVar) | lVar.N(cVar);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                b.m mVar = null;
                objF = new c0(v.Horizontal, eVar, mVar, eVar.a(), i0.Wrap, k.f11671a.b(cVar), null);
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
