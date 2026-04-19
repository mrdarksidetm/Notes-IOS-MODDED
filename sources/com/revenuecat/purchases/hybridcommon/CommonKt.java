package com.revenuecat.purchases.hybridcommon;

import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import je.v;
import je.w;
import md.i0;
import md.q;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import nd.t;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResultAny<Boolean> $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnResultAny<Boolean> onResultAny) {
            super(1);
            this.$onResult = onResultAny;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<AmazonLWAConsentStatus, i0> {
        final /* synthetic */ OnResultAny<Boolean> $onResult;

        /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AmazonLWAConsentStatus.values().length];
                try {
                    iArr[AmazonLWAConsentStatus.CONSENTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AmazonLWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OnResultAny<Boolean> onResultAny) {
            super(1);
            this.$onResult = onResultAny;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            invoke2(amazonLWAConsentStatus);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            r.f(amazonLWAConsentStatus, "it");
            OnResultAny<Boolean> onResultAny = this.$onResult;
            int i10 = WhenMappings.$EnumSwitchMapping$0[amazonLWAConsentStatus.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new q();
                }
                z10 = false;
            }
            onResultAny.onReceived(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$1, reason: invalid class name and case insensitive filesystem */
    static final class C05831 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnNullableResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05831(OnNullableResult onNullableResult) {
            super(1);
            this.$onResult = onNullableResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$2, reason: invalid class name and case insensitive filesystem */
    static final class C05842 extends s implements l<Offerings, i0> {
        final /* synthetic */ OnNullableResult $onResult;
        final /* synthetic */ String $placementIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05842(String str, OnNullableResult onNullableResult) {
            super(1);
            this.$placementIdentifier = str;
            this.$onResult = onNullableResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            r.f(offerings, "it");
            Offering currentOfferingForPlacement = offerings.getCurrentOfferingForPlacement(this.$placementIdentifier);
            this.$onResult.onReceived(currentOfferingForPlacement != null ? OfferingsMapperKt.map(currentOfferingForPlacement) : null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$1, reason: invalid class name and case insensitive filesystem */
    static final class C05851 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05851(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2, reason: invalid class name and case insensitive filesystem */
    static final class C05862 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05862(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C05871 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05871(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C05882 extends s implements l<Offerings, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05882(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            r.f(offerings, "it");
            this.$onResult.onReceived(OfferingsMapperKt.map(offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseCompletedFunction$1, reason: invalid class name and case insensitive filesystem */
    static final class C05891 extends s implements p<StoreTransaction, CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05891(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            invoke2(storeTransaction, customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            i0 i0Var;
            r.f(customerInfo, "customerInfo");
            if (storeTransaction != null) {
                this.$onResult.onReceived(r0.h(x.a("productIdentifier", storeTransaction.getProductIds().get(0)), x.a("customerInfo", CustomerInfoMapperKt.map(customerInfo)), x.a("transaction", StoreTransactionMapperKt.map(storeTransaction))));
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                this.$onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", r0.e()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseErrorFunction$1, reason: invalid class name and case insensitive filesystem */
    static final class C05901 extends s implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05901(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z10) {
            r.f(purchasesError, "error");
            this.$onResult.onError(PurchasesErrorKt.map(purchasesError, q0.c(x.a("userCancelled", Boolean.valueOf(z10)))));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$1, reason: invalid class name and case insensitive filesystem */
    static final class C05911 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05911(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2, reason: invalid class name and case insensitive filesystem */
    static final class C05922 extends s implements p<CustomerInfo, Boolean, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05922(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
            invoke(customerInfo, bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z10) {
            r.f(customerInfo, "customerInfo");
            this.$onResult.onReceived(r0.h(x.a("customerInfo", CustomerInfoMapperKt.map(customerInfo)), x.a("created", Boolean.valueOf(z10))));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C05931 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05931(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2, reason: invalid class name and case insensitive filesystem */
    static final class C05942 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05942(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$1, reason: invalid class name and case insensitive filesystem */
    static final class C05951 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05951(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2, reason: invalid class name and case insensitive filesystem */
    static final class C05962 extends s implements l<Offerings, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Boolean $googleIsPersonalizedPrice;
        final /* synthetic */ String $googleOldProductId;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ OnResult $onResult;
        final /* synthetic */ String $packageIdentifier;
        final /* synthetic */ Map<String, Object> $presentedOfferingContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05962(Map<String, ? extends Object> map, OnResult onResult, Activity activity, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, String str2) {
            super(1);
            this.$presentedOfferingContext = map;
            this.$onResult = onResult;
            this.$activity = activity;
            this.$googleOldProductId = str;
            this.$googleReplacementMode = googleReplacementMode;
            this.$googleIsPersonalizedPrice = bool;
            this.$packageIdentifier = str2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            Package r42;
            List<Package> availablePackages;
            Object next;
            r.f(offerings, "offerings");
            PresentedOfferingContext presentedOfferingContext = CommonKt.toPresentedOfferingContext(this.$presentedOfferingContext);
            if (presentedOfferingContext == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                return;
            }
            Offering offering = offerings.get(presentedOfferingContext.getOfferingIdentifier());
            if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
                r42 = null;
            } else {
                String str = this.$packageIdentifier;
                Iterator<T> it = availablePackages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (v.t(((Package) next).getIdentifier(), str, true)) {
                            break;
                        }
                    }
                }
                r42 = (Package) next;
            }
            if (r42 == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + this.$packageIdentifier), null, 1, null));
                return;
            }
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, r42);
            builder.presentedOfferingContext(presentedOfferingContext);
            if (this.$googleOldProductId != null && (!v.v(r0))) {
                builder.oldProductId(this.$googleOldProductId);
                GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$1, reason: invalid class name and case insensitive filesystem */
    static final class C05971 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05971(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$2, reason: invalid class name and case insensitive filesystem */
    static final class C05982 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05982(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C05991 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05991(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C06001 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06001(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C06012 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06012(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$setLogHandlerWithOnResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C06021 extends s implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06021(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            r.f(map, "logDetails");
            this.$onResult.onReceived(map);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C06031 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06031(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    static final class C06042 extends s implements l<Offerings, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06042(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            r.f(offerings, "it");
            this.$onResult.onReceived(OfferingsMapperKt.map(offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C06051 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06051(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C06062 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06062(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(customerInfo));
        }
    }

    public static final void canMakePayments(Context context, List<Integer> list, final OnResultAny<Boolean> onResultAny) {
        r.f(context, "context");
        r.f(list, "features");
        r.f(onResultAny, "onResult");
        ArrayList arrayList = new ArrayList();
        try {
            BillingFeature[] billingFeatureArrValues = BillingFeature.values();
            ArrayList arrayList2 = new ArrayList(nd.v.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(billingFeatureArrValues[((Number) it.next()).intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.Companion.canMakePayments(context, arrayList, new Callback() { // from class: rb.b
                @Override // com.revenuecat.purchases.interfaces.Callback
                public final void onReceived(Object obj) {
                    CommonKt.canMakePayments$lambda$3(onResultAny, (Boolean) obj);
                }
            });
        } catch (IndexOutOfBoundsException unused) {
            onResultAny.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void canMakePayments$lambda$3(OnResultAny onResultAny, Boolean bool) {
        r.f(onResultAny, "$onResult");
        r.e(bool, "it");
        onResultAny.onReceived(bool);
    }

    public static final Map<String, Map<String, Object>> checkTrialOrIntroductoryPriceEligibility(List<String> list) {
        r.f(list, "productIdentifiers");
        ArrayList arrayList = new ArrayList(nd.v.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x.a((String) it.next(), r0.h(x.a("status", 0), x.a(b.f7429c, "Status indeterminate."))));
        }
        return r0.r(arrayList);
    }

    public static final void configure(Context context, String str, String str2, PlatformInfo platformInfo) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        configure$default(context, str, str2, null, platformInfo, null, null, null, null, null, 1000, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        configure$default(context, str, str2, str3, platformInfo, null, null, null, null, null, 992, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        configure$default(context, str, str2, str3, platformInfo, store, null, null, null, null, 960, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, null, null, null, 896, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, null, null, 768, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4) {
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, null, 512, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2) {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        r.f(context, "context");
        r.f(str, "apiKey");
        r.f(platformInfo, "platformInfo");
        r.f(store, ProductResponseJsonKeys.STORE);
        r.f(dangerousSettings, "dangerousSettings");
        Purchases.Companion.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder builderDangerousSettings = new PurchasesConfiguration.Builder(context, str).appUserID(str2).store(store).dangerousSettings(dangerousSettings);
        if (str3 != null && (purchasesAreCompletedBy = toPurchasesAreCompletedBy(str3)) != null) {
            builderDangerousSettings.purchasesAreCompletedBy(purchasesAreCompletedBy);
        }
        if (bool != null) {
            builderDangerousSettings.showInAppMessagesAutomatically(bool.booleanValue());
        }
        if (str4 != null) {
            try {
                builderDangerousSettings.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str4));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str4 + com.amazon.a.a.o.c.a.b.f7490a);
                i0 i0Var = i0.f15558a;
            }
        }
        if (bool2 != null) {
            builderDangerousSettings.pendingTransactionsForPrepaidPlansEnabled(bool2.booleanValue());
        }
        Purchases.Companion.configure(builderDangerousSettings.build());
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, int i10, Object obj) {
        configure(context, str, str2, (i10 & 8) != 0 ? null : str3, platformInfo, (i10 & 32) != 0 ? Store.PLAY_STORE : store, (i10 & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : bool2);
    }

    public static final Integer convertToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        return null;
    }

    public static final void errorLog(String str) {
        r.f(str, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", str);
        }
    }

    public static final void getAmazonLWAConsentStatus(OnResultAny<Boolean> onResultAny) {
        r.f(onResultAny, "onResult");
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(Purchases.Companion.getSharedInstance(), new AnonymousClass1(onResultAny), new AnonymousClass2(onResultAny));
    }

    public static final String getAppUserID() {
        return Purchases.Companion.getSharedInstance().getAppUserID();
    }

    public static final void getCurrentOfferingForPlacement(String str, OnNullableResult onNullableResult) {
        r.f(str, "placementIdentifier");
        r.f(onNullableResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new C05831(onNullableResult), new C05842(str, onNullableResult));
    }

    public static final void getCustomerInfo(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new C05851(onResult), new C05862(onResult));
    }

    public static final GoogleReplacementMode getGoogleReplacementMode(Integer num) throws InvalidReplacementModeException {
        GoogleReplacementMode googleReplacementMode = null;
        if (num != null) {
            int iIntValue = num.intValue();
            GoogleReplacementMode[] googleReplacementModeArrValues = GoogleReplacementMode.values();
            int length = googleReplacementModeArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                GoogleReplacementMode googleReplacementMode2 = googleReplacementModeArrValues[i10];
                if (googleReplacementMode2.getPlayBillingClientMode() == iIntValue) {
                    googleReplacementMode = googleReplacementMode2;
                    break;
                }
                i10++;
            }
            if (googleReplacementMode == null) {
                throw new InvalidReplacementModeException();
            }
        }
        return googleReplacementMode;
    }

    public static final void getOfferings(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new C05871(onResult), new C05882(onResult));
    }

    public static final void getProductInfo(List<String> list, String str, OnResultList onResultList) {
        Purchases sharedInstance;
        r.f(list, "productIDs");
        r.f(str, "type");
        r.f(onResultList, "onResult");
        CommonKt$getProductInfo$onError$1 commonKt$getProductInfo$onError$1 = new CommonKt$getProductInfo$onError$1(onResultList);
        CommonKt$getProductInfo$onReceived$1 commonKt$getProductInfo$onReceived$1 = new CommonKt$getProductInfo$onReceived$1(onResultList);
        ProductType productTypeMapStringToProductType = mapStringToProductType(str);
        ProductType productType = ProductType.SUBS;
        if (productTypeMapStringToProductType == productType) {
            sharedInstance = Purchases.Companion.getSharedInstance();
        } else {
            sharedInstance = Purchases.Companion.getSharedInstance();
            productType = ProductType.INAPP;
        }
        ListenerConversionsCommonKt.getProductsWith(sharedInstance, list, productType, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", r0.e());
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.Companion.getProxyURL());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<StoreTransaction, CustomerInfo, i0> getPurchaseCompletedFunction(OnResult onResult) {
        return new C05891(onResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<PurchasesError, Boolean, i0> getPurchaseErrorFunction(OnResult onResult) {
        return new C05901(onResult);
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.Companion.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final boolean isAnonymous() {
        return Purchases.Companion.getSharedInstance().isAnonymous();
    }

    public static final boolean isWebPurchaseRedemptionURL(String str) {
        r.f(str, "urlString");
        return toWebPurchaseRedemption(str) != null;
    }

    public static final void logIn(String str, OnResult onResult) {
        r.f(str, "appUserID");
        r.f(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.Companion.getSharedInstance(), str, new C05911(onResult), new C05922(onResult));
    }

    public static final void logOut(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.Companion.getSharedInstance(), new C05931(onResult), new C05942(onResult));
    }

    public static final ProductType mapStringToProductType(String str) {
        MappedProductCategory mappedProductCategory;
        r.f(str, "type");
        MappedProductCategory[] mappedProductCategoryArrValues = MappedProductCategory.values();
        int length = mappedProductCategoryArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = mappedProductCategoryArrValues[i10];
            if (v.t(mappedProductCategory.getValue(), str, true)) {
                break;
            }
            i10++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        r.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (r.b(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (!r.b(lowerCase, "inapp")) {
            warnLog("Unrecognized product type: " + str + "... Defaulting to INAPP");
        }
        return ProductType.INAPP;
    }

    public static final void purchasePackage(Activity activity, String str, Map<String, ? extends Object> map, String str2, Integer num, Boolean bool, OnResult onResult) {
        r.f(str, "packageIdentifier");
        r.f(map, "presentedOfferingContext");
        r.f(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new C05951(onResult), new C05962(map, onResult, activity, str2, googleReplacementMode, bool, str));
            } else {
                onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchasePackage."), null, 1, null));
        }
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        r.f(str, "productIdentifier");
        r.f(str2, "type");
        r.f(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            ProductType productTypeMapStringToProductType = mapStringToProductType(str2);
            if (activity == null) {
                onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
                return;
            }
            CommonKt$purchaseProduct$onReceiveStoreProducts$1 commonKt$purchaseProduct$onReceiveStoreProducts$1 = new CommonKt$purchaseProduct$onReceiveStoreProducts$1(activity, map, str4, googleReplacementMode, bool, onResult, str, productTypeMapStringToProductType, str3);
            ProductType productType = ProductType.SUBS;
            if (productTypeMapStringToProductType != productType) {
                ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), t.d(str), ProductType.INAPP, new C05982(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
            } else {
                ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), t.d((String) c0.Y(w.C0(str, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null))), productType, new C05971(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
            }
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseProduct."), null, 1, null));
        }
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        PurchasesError purchasesError;
        r.f(str, "productIdentifier");
        r.f(str2, "optionIdentifier");
        r.f(onResult, "onResult");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.getSharedInstance().getStore() != Store.PLAY_STORE) {
            purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store.");
        } else {
            try {
                GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
                if (activity == null) {
                    onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
                    return;
                } else {
                    ListenerConversionsCommonKt.getProductsWith(companion.getSharedInstance(), t.d(str), ProductType.SUBS, new C05991(onResult), new CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(activity, map, str3, bool, onResult, str, str2, googleReplacementMode));
                    return;
                }
            } catch (InvalidReplacementModeException unused) {
                purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseSubscriptionOption.");
            }
        }
        onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
    }

    public static final void redeemWebPurchase(String str, final OnResult onResult) {
        r.f(str, "urlString");
        r.f(onResult, "onResult");
        WebPurchaseRedemption webPurchaseRedemption = toWebPurchaseRedemption(str);
        if (webPurchaseRedemption == null) {
            onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Invalid URL for web purchase redemption", r0.e()));
        } else {
            Purchases.Companion.getSharedInstance().redeemWebPurchase(webPurchaseRedemption, new RedeemWebPurchaseListener() { // from class: rb.a
                @Override // com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener
                public final void handleResult(RedeemWebPurchaseListener.Result result) {
                    CommonKt.redeemWebPurchase$lambda$10(onResult, result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void redeemWebPurchase$lambda$10(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        Object obfuscatedEmail;
        String str;
        r.f(onResult, "$onResult");
        r.f(result, "result");
        Map<String, ?> mapJ = r0.j(x.a("result", toResultName(result)));
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            obfuscatedEmail = CustomerInfoMapperKt.map(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo());
            str = "customerInfo";
        } else if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            obfuscatedEmail = PurchasesErrorKt.map$default(((RedeemWebPurchaseListener.Result.Error) result).getError(), null, 1, null);
            str = "error";
        } else {
            if (!(result instanceof RedeemWebPurchaseListener.Result.Expired)) {
                if (!r.b(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
                    r.b(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE);
                }
                onResult.onReceived(mapJ);
            }
            obfuscatedEmail = ((RedeemWebPurchaseListener.Result.Expired) result).getObfuscatedEmail();
            str = "obfuscatedEmail";
        }
        mapJ.put(str, obfuscatedEmail);
        onResult.onReceived(mapJ);
    }

    public static final void restorePurchases(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.Companion.getSharedInstance(), new C06001(onResult), new C06012(onResult));
    }

    public static final void setAllowSharingAppStoreAccount(boolean z10) {
        Purchases.Companion.getSharedInstance().setAllowSharingPlayStoreAccount(z10);
    }

    public static final void setDebugLogsEnabled(boolean z10) {
        Purchases.Companion.setDebugLogsEnabled(z10);
    }

    public static final void setLogHandler(l<? super Map<String, String>, i0> lVar) {
        r.f(lVar, "callback");
        Purchases.Companion.setLogHandler(new LogHandlerWithMapping(lVar));
    }

    public static final void setLogHandlerWithOnResult(OnResult onResult) {
        r.f(onResult, "onResult");
        setLogHandler(new C06021(onResult));
    }

    public static final void setLogLevel(String str) {
        r.f(str, "level");
        try {
            Purchases.Companion.setLogLevel(LogLevel.valueOf(str));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + str);
        }
    }

    public static final void setProxyURLString(String str) {
        Purchases.Companion.setProxyURL(str != null ? new URL(str) : null);
    }

    public static final void setPurchasesAreCompletedBy(String str) {
        r.f(str, "purchasesAreCompletedBy");
        PurchasesAreCompletedBy purchasesAreCompletedBy = toPurchasesAreCompletedBy(str);
        if (purchasesAreCompletedBy != null) {
            Purchases.Companion.getSharedInstance().setPurchasesAreCompletedBy(purchasesAreCompletedBy);
        }
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, null, 2, null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.Companion.getSharedInstance(), activity, null, 2, null);
        } else {
            Purchases.Companion.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    public static final void syncAttributesAndOfferingsIfNeeded(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(Purchases.Companion.getSharedInstance(), new C06031(onResult), new C06042(onResult));
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.Companion.getSharedInstance(), null, 1, null);
    }

    public static final void syncPurchases(OnResult onResult) {
        r.f(onResult, "onResult");
        ListenerConversionsKt.syncPurchasesWith(Purchases.Companion.getSharedInstance(), new C06051(onResult), new C06062(onResult));
    }

    public static final PresentedOfferingContext toPresentedOfferingContext(Map<String, ? extends Object> map) {
        r.f(map, "<this>");
        Object obj = map.get("offeringIdentifier");
        PresentedOfferingContext.TargetingContext targetingContext = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("targetingContext");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 != null) {
            Integer numConvertToInt = convertToInt(map2.get("revision"));
            Object obj4 = map2.get("ruleId");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            if (numConvertToInt != null && str3 != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(numConvertToInt.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    private static final PurchasesAreCompletedBy toPurchasesAreCompletedBy(String str) {
        try {
            return PurchasesAreCompletedBy.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static final String toResultName(RedeemWebPurchaseListener.Result result) {
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            return "SUCCESS";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            return "ERROR";
        }
        if (r.b(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            return "PURCHASE_BELONGS_TO_OTHER_USER";
        }
        if (r.b(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
            return "INVALID_TOKEN";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            return "EXPIRED";
        }
        throw new q();
    }

    private static final WebPurchaseRedemption toWebPurchaseRedemption(String str) {
        try {
            return Purchases.Companion.parseAsWebPurchaseRedemption(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
            errorLog("Error parsing WebPurchaseRedemption from URL: " + str + ". Error: " + th);
            return null;
        }
    }

    public static final void warnLog(String str) {
        r.f(str, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", str);
        }
    }
}
