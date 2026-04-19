package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import c0.a1;
import c0.f1;
import c0.j;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderKt$placeholder$2 extends s implements q<f1.b<Boolean>, l, Integer, a1<Float>> {
    public static final PlaceholderKt$placeholder$2 INSTANCE = new PlaceholderKt$placeholder$2();

    PlaceholderKt$placeholder$2() {
        super(3);
    }

    public final a1<Float> invoke(f1.b<Boolean> bVar, l lVar, int i10) {
        r.f(bVar, "$this$null");
        lVar.e(-1695007514);
        if (o.I()) {
            o.U(-1695007514, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous> (Placeholder.kt:71)");
        }
        a1<Float> a1VarG = j.g(0.0f, 0.0f, null, 7, null);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return a1VarG;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ a1<Float> invoke(f1.b<Boolean> bVar, l lVar, Integer num) {
        return invoke(bVar, lVar, num.intValue());
    }
}
