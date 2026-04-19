package com.revenuecat.purchases.hybridcommon;

import ae.r;
import ae.s;
import android.app.Activity;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.v;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $optionIdentifier;
    final /* synthetic */ Map<String, Object> $presentedOfferingContext;
    final /* synthetic */ String $productIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(Activity activity, Map<String, ? extends Object> map, String str, Boolean bool, OnResult onResult, String str2, String str3, GoogleReplacementMode googleReplacementMode) {
        super(1);
        this.$activity = activity;
        this.$presentedOfferingContext = map;
        this.$googleOldProductId = str;
        this.$googleIsPersonalizedPrice = bool;
        this.$onResult = onResult;
        this.$productIdentifier = str2;
        this.$optionIdentifier = str3;
        this.$googleReplacementMode = googleReplacementMode;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> list) {
        SubscriptionOption subscriptionOption;
        PresentedOfferingContext presentedOfferingContext;
        SubscriptionOption next;
        r.f(list, "storeProducts");
        String str = this.$productIdentifier;
        String str2 = this.$optionIdentifier;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                subscriptionOption = null;
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (r.b(storeProduct.getPurchasingData().getProductId(), str) && r.b(next.getId(), str2)) {
                            break;
                        }
                    }
                }
                subscriptionOption = next;
            } else {
                subscriptionOption = null;
            }
            if (subscriptionOption != null) {
                break;
            }
        }
        if (subscriptionOption == null) {
            this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + this.$productIdentifier + ':' + this.$optionIdentifier), null, 1, null));
            return;
        }
        PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, subscriptionOption);
        Map<String, Object> map = this.$presentedOfferingContext;
        if (map != null && (presentedOfferingContext = CommonKt.toPresentedOfferingContext(map)) != null) {
            builder.presentedOfferingContext(presentedOfferingContext);
        }
        String str3 = this.$googleOldProductId;
        String str4 = str3 == null || v.v(str3) ? null : str3;
        if (str4 != null) {
            GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
            builder.oldProductId(str4);
            if (googleReplacementMode != null) {
                builder.googleReplacementMode(googleReplacementMode);
            }
        }
        Boolean bool = this.$googleIsPersonalizedPrice;
        if (bool != null) {
            bool.booleanValue();
            builder.isPersonalizedPrice(bool.booleanValue());
        }
        ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
    }
}
