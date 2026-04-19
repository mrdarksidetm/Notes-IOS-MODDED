package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import md.i0;
import nd.c0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05431 extends s implements l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05431(String str, boolean z10, boolean z11, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z10;
            this.$isRestore = z11;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (r.b(storeTransaction, storeTransaction2)) {
                if (list.isEmpty()) {
                    LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                    syncPurchasesHelper.retrieveCustomerInfo(str, z10, z11, lVar, lVar2);
                } else {
                    String str2 = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
                    r.e(str2, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str2, null, 2, null);
                    lVar2.invoke(c0.Y(list));
                }
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> list) {
            r.f(list, "allPurchases");
            if (!(!list.isEmpty())) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) c0.j0(list);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z10 = this.$isRestore;
            String str = this.$appUserID;
            boolean z11 = this.$appInBackground;
            l<CustomerInfo, i0> lVar = this.$onSuccess;
            l<PurchasesError, i0> lVar2 = this.$onError;
            for (StoreTransaction storeTransaction2 : list) {
                l<PurchasesError, i0> lVar3 = lVar2;
                boolean z12 = z11;
                syncPurchasesHelper.postReceiptHelper.postTokenWithoutConsuming(storeTransaction2.getPurchaseToken(), storeTransaction2.getStoreUserID(), new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, R.styleable.AppCompatTheme_windowNoTitle, null), z10, str, storeTransaction2.getMarketplace(), PostReceiptInitiationSource.RESTORE, new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z11, z10, lVar, lVar3), new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction2, arrayList, storeTransaction, syncPurchasesHelper, str, z12, z10, lVar, lVar3));
                lVar2 = lVar3;
                lVar = lVar;
                z11 = z12;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.$onError.invoke(purchasesError);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper) {
        r.f(billingAbstract, "billing");
        r.f(identityManager, "identityManager");
        r.f(customerInfoHelper, "customerInfoHelper");
        r.f(postReceiptHelper, "postReceiptHelper");
        this.billing = billingAbstract;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(String str, boolean z10, boolean z11, final l<? super CustomerInfo, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.CACHED_OR_FETCHED, z10, z11, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                lVar.invoke(customerInfo);
            }
        });
    }

    public final void syncPurchases(boolean z10, boolean z11, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C05431(currentAppUserID, z11, z10, lVar, lVar2), new AnonymousClass2(lVar2));
    }
}
