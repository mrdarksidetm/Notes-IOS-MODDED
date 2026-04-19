package h0;

import f1.b;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    static /* synthetic */ androidx.compose.ui.e b(h hVar, androidx.compose.ui.e eVar, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hVar.a(eVar, f10, z10);
    }

    androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10);

    androidx.compose.ui.e c(androidx.compose.ui.e eVar, b.InterfaceC0266b interfaceC0266b);
}
