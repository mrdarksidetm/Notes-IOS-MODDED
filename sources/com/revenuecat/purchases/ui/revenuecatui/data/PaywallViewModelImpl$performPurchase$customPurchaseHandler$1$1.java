package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.o;
import android.app.Activity;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult;
import qd.d;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class PaywallViewModelImpl$performPurchase$customPurchaseHandler$1$1 extends o implements q<Activity, Package, d<? super PurchaseLogicResult>, Object> {
    PaywallViewModelImpl$performPurchase$customPurchaseHandler$1$1(Object obj) {
        super(3, obj, PurchaseLogic.class, "performPurchase", "performPurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // zd.q
    public final Object invoke(Activity activity, Package r32, d<? super PurchaseLogicResult> dVar) {
        return ((PurchaseLogic) this.receiver).performPurchase(activity, r32, dVar);
    }
}
