package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import java.util.Map;
import md.i0;
import org.json.JSONObject;
import zd.l;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super CustomerInfo, i0> lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2, reason: invalid class name */
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
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    static final class C05151 extends s implements l<Map<String, ? extends SubscriberAttribute>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ String $marketplace;
        final /* synthetic */ q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> $onError;
        final /* synthetic */ l<PostReceiptResponse, i0> $onSuccess;
        final /* synthetic */ PaywallEvent $presentedPaywall;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ ReceiptInfo $receiptInfo;
        final /* synthetic */ String $storeUserID;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01861 extends s implements l<PostReceiptResponse, i0> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ l<PostReceiptResponse, i0> $onSuccess;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01861(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, l<? super PostReceiptResponse, i0> lVar) {
                super(1);
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = lVar;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(PostReceiptResponse postReceiptResponse) {
                invoke2(postReceiptResponse);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PostReceiptResponse postReceiptResponse) {
                r.f(postReceiptResponse, "postReceiptResponse");
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends s implements q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> $onError;
            final /* synthetic */ PaywallEvent $presentedPaywall;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(PaywallEvent paywallEvent, PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
                super(3);
                this.$presentedPaywall = paywallEvent;
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = qVar;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                r.f(purchasesError, "error");
                r.f(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
                PaywallEvent paywallEvent = this.$presentedPaywall;
                if (paywallEvent != null) {
                    this.this$0.paywallPresentedCache.cachePresentedPaywall(paywallEvent);
                }
                if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05151(String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallEvent paywallEvent, l<? super PostReceiptResponse, i0> lVar, q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z10;
            this.$receiptInfo = receiptInfo;
            this.$storeUserID = str3;
            this.$marketplace = str4;
            this.$initiationSource = postReceiptInitiationSource;
            this.$presentedPaywall = paywallEvent;
            this.$onSuccess = lVar;
            this.$onError = qVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends SubscriberAttribute> map) {
            invoke2((Map<String, SubscriberAttribute>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, SubscriberAttribute> map) {
            r.f(map, "unsyncedSubscriberAttributesByKey");
            Backend backend = PostReceiptHelper.this.backend;
            String str = this.$purchaseToken;
            String str2 = this.$appUserID;
            boolean z10 = this.$isRestore;
            boolean finishTransactions = PostReceiptHelper.this.getFinishTransactions();
            Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
            ReceiptInfo receiptInfo = this.$receiptInfo;
            String str3 = this.$storeUserID;
            String str4 = this.$marketplace;
            PostReceiptInitiationSource postReceiptInitiationSource = this.$initiationSource;
            PaywallEvent paywallEvent = this.$presentedPaywall;
            backend.postReceiptData(str, str2, z10, finishTransactions, backendMap, receiptInfo, str3, str4, postReceiptInitiationSource, paywallEvent != null ? paywallEvent.toPaywallPostReceiptData$purchases_defaultsRelease() : null, new C01861(PostReceiptHelper.this, this.$appUserID, map, this.$onSuccess), new AnonymousClass2(this.$presentedPaywall, PostReceiptHelper.this, this.$appUserID, map, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1, reason: invalid class name and case insensitive filesystem */
    static final class C05161 extends s implements l<PostReceiptResponse, i0> {
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05161(String str, l<? super CustomerInfo, i0> lVar) {
            super(1);
            this.$purchaseToken = str;
            this.$onSuccess = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PostReceiptResponse postReceiptResponse) {
            invoke2(postReceiptResponse);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PostReceiptResponse postReceiptResponse) {
            r.f(postReceiptResponse, "postReceiptResponse");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2, reason: invalid class name and case insensitive filesystem */
    static final class C05172 extends s implements q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements l<CustomerInfo, i0> {
            final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(l<? super CustomerInfo, i0> lVar) {
                super(1);
                this.$onSuccess = lVar;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                r.f(customerInfo, "it");
                this.$onSuccess.invoke(customerInfo);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01872 extends s implements zd.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ l<PurchasesError, i0> $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01872(l<? super PurchasesError, i0> lVar, PurchasesError purchasesError) {
                super(0);
                this.$onError = lVar;
                this.$backendError = purchasesError;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05172(String str, String str2, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(3);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            r.f(purchasesError, "backendError");
            r.f(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new C01872(this.$onError, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05181 extends s implements l<PostReceiptResponse, i0> {
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05181(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = pVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PostReceiptResponse postReceiptResponse) {
            invoke2(postReceiptResponse);
            return i0.f15558a;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(com.revenuecat.purchases.common.networking.PostReceiptResponse r7) {
            /*
                r6 = this;
                java.lang.String r0 = "postReceiptResponse"
                ae.r.f(r7, r0)
                java.util.Map r0 = r7.getProductInfoByProductId()
                if (r0 == 0) goto L5b
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L42
                java.lang.Object r3 = r0.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                java.util.List r5 = r1.getProductIds()
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L1a
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                r2.put(r4, r3)
                goto L1a
            L42:
                java.util.Collection r0 = r2.values()
                if (r0 == 0) goto L5b
                java.lang.Object r0 = nd.s.Z(r0)
                com.revenuecat.purchases.common.networking.PostReceiptProductInfo r0 = (com.revenuecat.purchases.common.networking.PostReceiptProductInfo) r0
                if (r0 == 0) goto L5b
                java.lang.Boolean r0 = r0.getShouldConsume()
                if (r0 == 0) goto L5b
                boolean r0 = r0.booleanValue()
                goto L5c
            L5b:
                r0 = 1
            L5c:
                com.revenuecat.purchases.PostReceiptHelper r1 = com.revenuecat.purchases.PostReceiptHelper.this
                com.revenuecat.purchases.common.BillingAbstract r1 = com.revenuecat.purchases.PostReceiptHelper.access$getBilling$p(r1)
                com.revenuecat.purchases.PostReceiptHelper r2 = com.revenuecat.purchases.PostReceiptHelper.this
                boolean r2 = com.revenuecat.purchases.PostReceiptHelper.access$getFinishTransactions(r2)
                com.revenuecat.purchases.models.StoreTransaction r3 = r6.$purchase
                com.revenuecat.purchases.PostReceiptInitiationSource r4 = r6.$initiationSource
                r1.consumeAndSave(r2, r3, r0, r4)
                zd.p<com.revenuecat.purchases.models.StoreTransaction, com.revenuecat.purchases.CustomerInfo, md.i0> r0 = r6.$onSuccess
                if (r0 == 0) goto L7c
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                com.revenuecat.purchases.CustomerInfo r7 = r7.getCustomerInfo()
                r0.invoke(r1, r7)
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PostReceiptHelper.C05181.invoke2(com.revenuecat.purchases.common.networking.PostReceiptResponse):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    static final class C05192 extends s implements q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $onError;
        final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements l<CustomerInfo, i0> {
            final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = pVar;
                this.$purchase = storeTransaction;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                p<StoreTransaction, CustomerInfo, i0> pVar = this.$onSuccess;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01882 extends s implements zd.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01882(p<? super StoreTransaction, ? super PurchasesError, i0> pVar, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = pVar;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                p<StoreTransaction, PurchasesError, i0> pVar = this.$onError;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05192(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = pVar;
            this.$onError = pVar2;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            r.f(purchasesError, "backendError");
            r.f(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new C01882(this.$onError, this.$purchase, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C05201 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ zd.a<i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05201(zd.a<i0> aVar) {
            super(1);
            this.$onError = aVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billingAbstract, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache) {
        r.f(appConfig, "appConfig");
        r.f(backend, "backend");
        r.f(billingAbstract, "billing");
        r.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        r.f(deviceCache, "deviceCache");
        r.f(subscriberAttributesManager, "subscriberAttributesManager");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(paywallPresentedCache, "paywallPresentedCache");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billingAbstract;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
    }

    private final void calculateOfflineCustomerInfo(String str, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(str, new AnonymousClass1(lVar), new AnonymousClass2(lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, l<? super PostReceiptResponse, i0> lVar, q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new C05151(str2, str, z10, receiptInfo, str3, str4, postReceiptInitiationSource, this.paywallPresentedCache.getAndRemovePresentedEvent(), lVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, l<? super CustomerInfo, i0> lVar, zd.a<i0> aVar) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(str, lVar, new C05201(aVar));
        } else {
            aVar.invoke();
        }
    }

    public final void postTokenWithoutConsuming(String str, String str2, ReceiptInfo receiptInfo, boolean z10, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "purchaseToken");
        r.f(receiptInfo, "receiptInfo");
        r.f(str3, "appUserID");
        r.f(postReceiptInitiationSource, "initiationSource");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        postReceiptAndSubscriberAttributes(str3, str, z10, receiptInfo, str2, str4, postReceiptInitiationSource, new C05161(str, lVar), new C05172(str, str3, lVar, lVar2));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        r.f(storeTransaction, "purchase");
        r.f(str, "appUserID");
        r.f(postReceiptInitiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(str, storeTransaction.getPurchaseToken(), z10, new ReceiptInfo(storeTransaction.getProductIds(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getSubscriptionOptionId(), storeProduct, null, null, storeTransaction.getReplacementMode(), 48, null), storeTransaction.getStoreUserID(), storeTransaction.getMarketplace(), postReceiptInitiationSource, new C05181(storeTransaction, postReceiptInitiationSource, pVar), new C05192(storeTransaction, postReceiptInitiationSource, str, pVar, pVar2));
    }
}
