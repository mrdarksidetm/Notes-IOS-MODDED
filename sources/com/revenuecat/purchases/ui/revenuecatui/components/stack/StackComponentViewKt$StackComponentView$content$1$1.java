package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import java.util.Iterator;
import md.i0;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class StackComponentViewKt$StackComponentView$content$1$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ StackComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackComponentView$content$1$1(StackComponentStyle stackComponentStyle) {
        super(2);
        this.$style = stackComponentStyle;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(1241319765, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView.<anonymous>.<anonymous> (StackComponentView.kt:67)");
        }
        Iterator it = this.$style.getChildren().iterator();
        while (it.hasNext()) {
            ComponentViewKt.ComponentView((ComponentStyle) it.next(), null, lVar, 0, 2);
        }
        if (o.I()) {
            o.T();
        }
    }
}
