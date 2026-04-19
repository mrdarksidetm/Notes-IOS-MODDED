package com.revenuecat.purchases.ui.revenuecatui;

import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchaseLogic {
    Object performPurchase(Activity activity, Package r22, d<? super PurchaseLogicResult> dVar);

    Object performRestore(CustomerInfo customerInfo, d<? super PurchaseLogicResult> dVar);
}
