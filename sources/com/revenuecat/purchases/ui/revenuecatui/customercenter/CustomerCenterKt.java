package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.ExperimentalPreviewRevenueCatUIPurchasesAPI;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel;
import md.i0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt$CustomerCenter$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            CustomerCenterKt.CustomerCenter(this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    @ExperimentalPreviewRevenueCatUIPurchasesAPI
    public static final void CustomerCenter(e eVar, l lVar, int i10, int i11) {
        int i12;
        l lVarP = lVar.p(-199765785);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(-199765785, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenter (CustomerCenter.kt:12)");
            }
            InternalCustomerCenterKt.InternalCustomerCenter(eVar, (CustomerCenterViewModel) null, lVarP, i12 & 14, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(eVar, i10, i11));
    }
}
