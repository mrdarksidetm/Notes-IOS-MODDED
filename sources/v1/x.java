package v1;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, w wVar, boolean z10) {
        return eVar.h(new PointerHoverIconModifierElement(wVar, z10));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(eVar, wVar, z10);
    }
}
