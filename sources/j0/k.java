package j0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, l lVar, i iVar, boolean z10, w2.r rVar, e0.r rVar2, boolean z11, t0.l lVar2, int i10) {
        lVar2.e(1331498025);
        if (t0.o.I()) {
            t0.o.U(1331498025, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z11) {
            Object[] objArr = {lVar, iVar, Boolean.valueOf(z10), rVar, rVar2};
            lVar2.e(-568225417);
            boolean zN = false;
            for (int i11 = 0; i11 < 5; i11++) {
                zN |= lVar2.N(objArr[i11]);
            }
            Object objF = lVar2.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new j(lVar, iVar, z10, rVar, rVar2);
                lVar2.E(objF);
            }
            lVar2.K();
            eVar = eVar.h((androidx.compose.ui.e) objF);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
