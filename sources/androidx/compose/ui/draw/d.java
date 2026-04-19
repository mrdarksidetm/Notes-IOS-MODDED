package androidx.compose.ui.draw;

import l1.k0;
import y1.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, o1.c cVar, boolean z10, f1.b bVar, f fVar, float f10, k0 k0Var) {
        return eVar.h(new PainterElement(cVar, z10, bVar, fVar, f10, k0Var));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, o1.c cVar, boolean z10, f1.b bVar, f fVar, float f10, k0 k0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            bVar = f1.b.f11020a.e();
        }
        f1.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            fVar = f.f23237a.c();
        }
        f fVar2 = fVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            k0Var = null;
        }
        return a(eVar, cVar, z11, bVar2, fVar2, f11, k0Var);
    }
}
