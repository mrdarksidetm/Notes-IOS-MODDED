package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.R;
import l1.j0;
import md.i0;
import o1.c;
import q0.k;
import q0.v;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class CloseButtonKt$CloseButton$1$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ j0 $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseButtonKt$CloseButton$1$1(j0 j0Var) {
        super(2);
        this.$color = j0Var;
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
            o.U(170484435, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton.<anonymous>.<anonymous> (CloseButton.kt:29)");
        }
        c cVarD = f2.c.d(R.drawable.close, lVar, 0);
        j0 j0Var = this.$color;
        lVar.e(-1361205404);
        if (j0Var == null) {
            j0Var = (j0) lVar.P(k.a());
        }
        long jE = j0Var.E();
        lVar.K();
        v.a(cVarD, null, null, jE, lVar, 56, 4);
        if (o.I()) {
            o.T();
        }
    }
}
