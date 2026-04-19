package h0;

import f1.b;

/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    static /* synthetic */ androidx.compose.ui.e c(g0 g0Var, androidx.compose.ui.e eVar, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return g0Var.a(eVar, f10, z10);
    }

    androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10);

    androidx.compose.ui.e b(androidx.compose.ui.e eVar, b.c cVar);
}
