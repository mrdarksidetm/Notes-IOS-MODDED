package com.revenuecat.purchases.ui.revenuecatui;

import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import md.i0;
import qd.d;
import qd.i;
import rd.c;
import sd.f;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PurchaseLogicWithCallback implements PurchaseLogic {
    public static final int $stable = 0;

    @Override // com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic
    public final Object performPurchase(Activity activity, Package r42, d<? super PurchaseLogicResult> dVar) {
        i iVar = new i(c.c(dVar));
        performPurchaseWithCompletion(activity, r42, new PurchaseLogicWithCallback$performPurchase$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public abstract void performPurchaseWithCompletion(Activity activity, Package r22, l<? super PurchaseLogicResult, i0> lVar);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic
    public final Object performRestore(CustomerInfo customerInfo, d<? super PurchaseLogicResult> dVar) {
        i iVar = new i(c.c(dVar));
        performRestoreWithCompletion(customerInfo, new PurchaseLogicWithCallback$performRestore$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public abstract void performRestoreWithCompletion(CustomerInfo customerInfo, l<? super PurchaseLogicResult, i0> lVar);
}
