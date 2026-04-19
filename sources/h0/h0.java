package h0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import f1.b;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f11663a = new h0();

    private h0() {
    }

    @Override // h0.g0
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (((double) f10) > 0.0d) {
            return eVar.h(new LayoutWeightElement(ge.o.g(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // h0.g0
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, b.c cVar) {
        return eVar.h(new VerticalAlignElement(cVar));
    }
}
