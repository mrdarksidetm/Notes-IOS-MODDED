package com.revenuecat.purchases.amazon;

import ae.f0;
import ae.j;
import ae.o;
import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import ke.a;
import md.i0;
import md.q;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import nd.t;
import nd.v;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    private final Handler mainHandler;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<l<PurchasesError, i0>> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$consumeAndSave$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$findPurchaseInPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    static final class C05441 extends s implements l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ l<StoreTransaction, i0> $onCompletion;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05441(l<? super StoreTransaction, i0> lVar, String str, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$onCompletion = lVar;
            this.$productId = str;
            this.$onError = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> list) {
            Object next;
            r.f(list, "it");
            String str = this.$productId;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (r.b(str, ((StoreTransaction) next).getProductIds().get(0))) {
                        break;
                    }
                }
            }
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
            r.e(str2, "format(this, *args)");
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1, reason: invalid class name and case insensitive filesystem */
    static final class C05451 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<AmazonLWAConsentStatus, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01891 extends s implements l<UserData, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<AmazonLWAConsentStatus, i0> $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LWAConsentStatus.values().length];
                    try {
                        iArr[LWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01891(AmazonBilling amazonBilling, l<? super AmazonLWAConsentStatus, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(UserData userData) {
                invoke2(userData);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserData userData) {
                AmazonLWAConsentStatus amazonLWAConsentStatus;
                r.f(userData, "userData");
                LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                if (lWAConsentStatus == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_LWA_CONSENT_STATUS_NULL_STORE_PROBLEM));
                    return;
                }
                l<AmazonLWAConsentStatus, i0> lVar = this.$onSuccess;
                int i10 = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                if (i10 == 1) {
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                } else {
                    if (i10 != 2) {
                        throw new q();
                    }
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                }
                lVar.invoke(amazonLWAConsentStatus);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$2, reason: invalid class name */
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
                r.f(purchasesError, "error");
                String str = String.format(BillingStrings.BILLING_AMAZON_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1));
                r.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05451(l<? super PurchasesError, i0> lVar, l<? super AmazonLWAConsentStatus, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C01891(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    static final class C05461 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<String, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01901 extends s implements l<UserData, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<String, i0> $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01901(AmazonBilling amazonBilling, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(UserData userData) {
                invoke2(userData);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserData userData) {
                r.f(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$2, reason: invalid class name */
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
                r.f(purchasesError, "error");
                String str = String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{purchasesError}, 1));
                r.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05461(l<? super PurchasesError, i0> lVar, l<? super String, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C01901(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$1, reason: invalid class name and case insensitive filesystem */
    static final class C05471 extends s implements l<JSONObject, i0> {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05471(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) throws JSONException {
            invoke2(jSONObject);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) throws JSONException {
            r.f(jSONObject, "response");
            Object obj = jSONObject.get(b.L);
            r.d(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(t.d(storeTransaction));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<PurchasesError, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C05481 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01911 extends s implements p<Receipt, UserData, i0> {
            final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01911(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingContext = presentedOfferingContext;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(Receipt receipt, UserData userData) {
                invoke2(receipt, userData);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Receipt receipt, UserData userData) {
                r.f(receipt, b.D);
                r.f(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements l<PurchasesError, i0> {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                r.f(purchasesError, "it");
                this.this$0.onPurchaseError(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05481(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, new C01911(AmazonBilling.this, amazonStoreProduct, this.$presentedOfferingContext), new AnonymousClass2(AmazonBilling.this));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$2, reason: invalid class name and case insensitive filesystem */
    static final class C05492 extends s implements l<JSONObject, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<String, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05492(l<? super PurchasesError, i0> lVar, String str, l<? super String, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$purchaseToken = str;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            r.f(jSONObject, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{jSONObject.toString()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(jSONObject);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(jSONObject));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(q0.c(x.a(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(l<? super PurchasesError, i0> lVar) {
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
            r.f(purchasesError, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05501 extends s implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05501(l<? super List<StoreTransaction>, i0> lVar) {
            super(1);
            this.$onReceivePurchaseHistory = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> map) {
            r.f(map, "it");
            this.$onReceivePurchaseHistory.invoke(c0.C0(map.values()));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C05511 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<List<? extends StoreProduct>, i0> $onReceive;
        final /* synthetic */ Set<String> $productIds;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01921 extends s implements l<UserData, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<List<? extends StoreProduct>, i0> $onReceive;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01931 extends s implements l<List<? extends StoreProduct>, i0> {
                final /* synthetic */ l<List<? extends StoreProduct>, i0> $onReceive;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C01931(AmazonBilling amazonBilling, Date date, l<? super List<? extends StoreProduct>, i0> lVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$onReceive = lVar;
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
                    invoke2(list);
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends StoreProduct> list) {
                    r.f(list, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(true, this.$requestStartTime);
                    this.$onReceive.invoke(list);
                }
            }

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends s implements l<PurchasesError, i0> {
                final /* synthetic */ l<PurchasesError, i0> $onError;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(AmazonBilling amazonBilling, Date date, l<? super PurchasesError, i0> lVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
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
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(false, this.$requestStartTime);
                    this.$onError.invoke(purchasesError);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01921(AmazonBilling amazonBilling, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = lVar;
                this.$onError = lVar2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(UserData userData) {
                invoke2(userData);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserData userData) {
                r.f(userData, "userData");
                Date now = this.this$0.dateProvider.getNow();
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                r.e(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, new C01931(this.this$0, now, this.$onReceive), new AnonymousClass2(this.this$0, now, this.$onError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05511(l<? super PurchasesError, i0> lVar, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$productIds = set;
            this.$onReceive = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C01921(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C05521 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01941 extends s implements p<List<? extends Receipt>, UserData, i0> {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01951 extends s implements p<Map<String, ? extends String>, Map<String, ? extends PurchasesError>, i0> {
                final /* synthetic */ List<Receipt> $filteredReceipts;
                final /* synthetic */ l<PurchasesError, i0> $onError;
                final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C01951(AmazonBilling amazonBilling, l<? super PurchasesError, i0> lVar, List<Receipt> list, UserData userData, l<? super Map<String, StoreTransaction>, i0> lVar2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = lVar;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = lVar2;
                }

                @Override // zd.p
                public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map, Map<String, ? extends PurchasesError> map2) {
                    invoke2((Map<String, String>) map, (Map<String, PurchasesError>) map2);
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, String> map, Map<String, PurchasesError> map2) {
                    Object mapOfReceiptHashesToRestoredPurchases;
                    l lVar;
                    r.f(map, "tokensToSkusMap");
                    r.f(map2, "errors");
                    this.this$0.logErrorsIfAny(map2);
                    if (map.isEmpty()) {
                        mapOfReceiptHashesToRestoredPurchases = new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID);
                        lVar = this.$onError;
                    } else {
                        mapOfReceiptHashesToRestoredPurchases = this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, map, this.$userData);
                        lVar = this.$onSuccess;
                    }
                    lVar.invoke(mapOfReceiptHashesToRestoredPurchases);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01941(AmazonBilling amazonBilling, Date date, boolean z10, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(2);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$filterOnlyActivePurchases = z10;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(List<? extends Receipt> list, UserData userData) {
                invoke2((List<Receipt>) list, userData);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Receipt> list, UserData userData) {
                r.f(list, b.G);
                r.f(userData, "userData");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(true, this.$requestStartTime);
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    this.$onSuccess.invoke(r0.e());
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                r.e(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, list, new C01951(this.this$0, this.$onError, list, userData, this.$onSuccess));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements l<PurchasesError, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(AmazonBilling amazonBilling, Date date, l<? super PurchasesError, i0> lVar) {
                super(1);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
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
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(false, this.$requestStartTime);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05521(l<? super PurchasesError, i0> lVar, boolean z10, l<? super Map<String, StoreTransaction>, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$filterOnlyActivePurchases = z10;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                Date now = AmazonBilling.this.dateProvider.getNow();
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new C01941(AmazonBilling.this, now, this.$filterOnlyActivePurchases, this.$onSuccess, this.$onError), new AnonymousClass2(AmazonBilling.this, now, this.$onError));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider) {
        super(purchasesStateProvider);
        r.f(context, "applicationContext");
        r.f(amazonBackend, "amazonBackend");
        r.f(amazonCache, "cache");
        r.f(handler, "mainHandler");
        r.f(purchasesStateProvider, "stateProvider");
        r.f(purchasingServiceProvider, "purchasingServiceProvider");
        r.f(productDataResponseListener, "productDataHandler");
        r.f(purchaseResponseListener, "purchaseHandler");
        r.f(purchaseUpdatesResponseListener, "purchaseUpdatesHandler");
        r.f(userDataResponseListener, "userDataHandler");
        r.f(dateProvider, "dateProvider");
        this.applicationContext = context;
        this.amazonBackend = amazonBackend;
        this.cache = amazonCache;
        this.finishTransactions = z10;
        this.mainHandler = handler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataResponseListener;
        this.purchaseHandler = purchaseResponseListener;
        this.purchaseUpdatesHandler = purchaseUpdatesResponseListener;
        this.userDataHandler = userDataResponseListener;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i10, j jVar) {
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i10 & 128) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        this(context, amazonBackend, amazonCache, z10, handler, purchasesStateProvider, diagnosticsTracker, defaultPurchasingServiceProvider, (i10 & 256) != 0 ? new ProductDataHandler(defaultPurchasingServiceProvider, handler) : productDataResponseListener, (i10 & 512) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context) : purchaseResponseListener, (i10 & 1024) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i10 & 2048) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler, null, 4, null) : userDataResponseListener, (i10 & 4096) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, DeviceCache deviceCache, boolean z10, Handler handler, BackendHelper backendHelper, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker) {
        this(context, new AmazonBackend(backendHelper), new AmazonCache(deviceCache), z10, handler, purchasesStateProvider, diagnosticsTracker, null, null, null, null, null, null, 8064, null);
        r.f(context, "applicationContext");
        r.f(deviceCache, "cache");
        r.f(handler, "mainHandler");
        r.f(backendHelper, "backendHelper");
        r.f(purchasesStateProvider, "stateProvider");
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                final l<PurchasesError, i0> lVarRemove = this.serviceRequests.remove();
                runOnUIThread(new Runnable() { // from class: hb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVarRemove.invoke(null);
                    }
                });
            }
            i0 i0Var = i0.f15558a;
        }
    }

    private final synchronized void executeRequestOnUIThread(l<? super PurchasesError, i0> lVar) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(lVar);
            if (isConnected()) {
                executePendingRequests();
            } else {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String str, List<Receipt> list, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar) {
        AmazonBilling amazonBilling = this;
        Map<String, String> receiptSkus = amazonBilling.cache.getReceiptSkus();
        Map mapV = r0.v(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Receipt> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Receipt) next).getProductType() == ProductType.SUBSCRIPTION)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.x(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(x.a(receipt.getReceiptId(), receipt.getSku()));
        }
        r0.n(mapV, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj2).getReceiptId())) {
                arrayList4.add(obj2);
            }
        }
        if (arrayList4.isEmpty()) {
            pVar.invoke(mapV, linkedHashMap);
            return;
        }
        f0 f0Var = new f0();
        f0Var.f703a = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            r.e(receiptId, "receipt.receiptId");
            amazonBackend.getAmazonReceiptData(receiptId, str, new AmazonBilling$getMissingSkusForReceipts$1$1(mapV, receipt2, f0Var, this, pVar, linkedHashMap), new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, f0Var, pVar, mapV));
            amazonBilling = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getString(b.L);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(t.d(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        r.e(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        r.e(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C05471(receipt, presentedOfferingContext, userData, this), new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> map) {
        if (!map.isEmpty()) {
            String strH0 = c0.h0(map.keySet(), "\n", null, null, 0, null, null, 62, null);
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPTS, Arrays.copyOf(new Object[]{strH0}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError purchasesError) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    private final void queryPurchases(boolean z10, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        executeRequestOnUIThread(new C05521(lVar2, z10, lVar));
    }

    private final void runOnUIThread(Runnable runnable) {
        if (r.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private final boolean shouldFinishTransactions() {
        if (this.finishTransactions) {
            return true;
        }
        LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_NOT_FINISHING_TRANSACTIONS);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling amazonBilling) {
        r.f(amazonBilling, "this$0");
        amazonBilling.startConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            md.s sVarA = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                r.e(receiptId, "receipt.receiptId");
                sVarA = x.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (sVarA != null) {
                arrayList.add(sVarA);
            }
        }
        return r0.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean z10, Date date) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m20trackAmazonQueryProductDetailsRequestVtjQ1oo(DurationExtensionsKt.between(a.f14459b, date, this.dateProvider.getNow()), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAmazonQueryPurchasesRequestIfNeeded(boolean z10, Date date) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m21trackAmazonQueryPurchasesRequestVtjQ1oo(DurationExtensionsKt.between(a.f14459b, date, this.dateProvider.getNow()), z10);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, boolean z11, PostReceiptInitiationSource postReceiptInitiationSource) {
        r.f(storeTransaction, "purchase");
        r.f(postReceiptInitiationSource, "initiationSource");
        if (!shouldFinishTransactions() || storeTransaction.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (z10) {
            executeRequestOnUIThread(new AnonymousClass1(storeTransaction));
        }
        this.cache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String str, com.revenuecat.purchases.ProductType productType, String str2, l<? super StoreTransaction, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(productType, "productType");
        r.f(str2, "productId");
        r.f(lVar, "onCompletion");
        r.f(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str3 = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        queryAllPurchases(str, new C05441(lVar, str2, lVar2), lVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getAmazonLWAConsentStatus(l<? super AmazonLWAConsentStatus, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        executeRequestOnUIThread(new C05451(lVar2, lVar));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> set, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(set, b.O);
        r.f(str, b.f7439m);
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        this.productDataHandler.getProductData(set, str, lVar, lVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        executeRequestOnUIThread(new C05461(lVar2, lVar));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(l<? super UserData, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        this.userDataHandler.getUserData(lVar, lVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        r.f(activity, "activity");
        r.f(str, "appUserID");
        r.f(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product != null) {
            AmazonStoreProduct storeProduct = product.getStoreProduct();
            if (shouldFinishTransactions()) {
                if (replaceProductInfo != null) {
                    LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
                    return;
                } else {
                    executeRequestOnUIThread(new C05481(activity, str, storeProduct, presentedOfferingContext));
                    return;
                }
            }
            return;
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
        String str2 = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
        r.e(str2, "format(this, *args)");
        PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str2);
        LogUtilsKt.errorLog(purchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String str, String str2, String str3, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "productID");
        r.f(str2, "purchaseToken");
        r.f(str3, "storeUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        String str4 = this.cache.getReceiptSkus().get(str2);
        if (str4 != null) {
            lVar.invoke(str4);
        } else {
            this.amazonBackend.getAmazonReceiptData(str2, str3, new C05492(lVar2, str2, lVar), new AnonymousClass3(lVar2));
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        r.f(productDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(productDataResponse);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        r.f(purchaseResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(purchaseResponse);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        r.f(purchaseUpdatesResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        r.f(userDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(userDataResponse);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p<? super Receipt, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar) {
        r.f(handler, "mainHandler");
        r.f(activity, "activity");
        r.f(str, "appUserID");
        r.f(storeProduct, "storeProduct");
        r.f(pVar, "onSuccess");
        r.f(lVar, "onError");
        this.purchaseHandler.purchase(handler, activity, str, storeProduct, pVar, lVar);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String str, l<? super List<StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onReceivePurchaseHistory");
        r.f(lVar2, "onReceivePurchaseHistoryError");
        queryPurchases(false, (l<? super Map<String, StoreTransaction>, i0>) new C05501(lVar), lVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(productType, "productType");
        r.f(set, "productIds");
        r.f(lVar, "onReceive");
        r.f(lVar2, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new C05511(lVar2, set, lVar));
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String str, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        if (shouldFinishTransactions()) {
            queryPurchases(true, lVar, lVar2);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar) {
        r.f(pVar, "onSuccess");
        r.f(lVar, "onError");
        this.purchaseUpdatesHandler.queryPurchases(pVar, lVar);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, zd.a<i0> aVar) {
        r.f(activity, "activity");
        r.f(list, "inAppMessageTypes");
        r.f(aVar, "subscriptionStatusChange");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j10) {
        runOnUIThread(new Runnable() { // from class: hb.a
            @Override // java.lang.Runnable
            public final void run() {
                AmazonBilling.startConnectionOnMainThread$lambda$0(this.f11867a);
            }
        });
    }
}
