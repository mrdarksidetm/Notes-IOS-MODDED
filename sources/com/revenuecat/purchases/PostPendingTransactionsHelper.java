package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PostPendingTransactionsHelper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import nd.u;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<StoreTransaction, CustomerInfo, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            invoke2(storeTransaction, customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            r.f(storeTransaction, "<anonymous parameter 0>");
            r.f(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<StoreTransaction, PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            invoke2(storeTransaction, purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            r.f(storeTransaction, "<anonymous parameter 0>");
            r.f(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billingAbstract, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper) {
        r.f(appConfig, "appConfig");
        r.f(deviceCache, "deviceCache");
        r.f(billingAbstract, "billing");
        r.f(dispatcher, "dispatcher");
        r.f(identityManager, "identityManager");
        r.f(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callCompletionFromResults(List<StoreTransaction> list, List<? extends Result<CustomerInfo, PurchasesError>> list2, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        if (list.size() == list2.size()) {
            int i10 = 0;
            for (Object obj : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u.w();
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (lVar != null) {
                        lVar.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i10 == list2.size() - 1 && lVar2 != null) {
                        r.d(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        lVar2.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postTransactionsWithCompletion(List<StoreTransaction> list, boolean z10, String str, l<? super PurchasesError, i0> lVar, l<? super CustomerInfo, i0> lVar2) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(list, z10, str, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, new AnonymousClass1(arrayList, this, list, lVar, lVar2), new AnonymousClass2(arrayList, this, list, lVar, lVar2));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.NO_PENDING_PURCHASES_TO_SYNC);
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z10, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, l lVar, l lVar2) {
        r.f(postPendingTransactionsHelper, "this$0");
        r.f(str, "$appUserID");
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(postPendingTransactionsHelper, z10, str, lVar, lVar2), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(lVar));
    }

    public final void syncPendingPurchaseQueue(final boolean z10, final l<? super PurchasesError, i0> lVar, final l<? super CustomerInfo, i0> lVar2) {
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
            final String currentAppUserID = this.identityManager.getCurrentAppUserID();
            Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: gb.c
                @Override // java.lang.Runnable
                public final void run() {
                    PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$0(this.f11505a, currentAppUserID, z10, lVar, lVar2);
                }
            }, null, 2, null);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
    }
}
