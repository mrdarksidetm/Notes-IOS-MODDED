package h0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import f1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11664a = new i();

    private i() {
    }

    @Override // h0.h
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return eVar.h(new LayoutWeightElement(ge.o.g(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // h0.h
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, b.InterfaceC0266b interfaceC0266b) {
        return eVar.h(new HorizontalAlignElement(interfaceC0266b));
    }
}
