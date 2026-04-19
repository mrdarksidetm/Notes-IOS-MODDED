package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import ae.s;
import android.app.Activity;
import android.content.res.Configuration;
import b2.v0;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import md.i0;
import qd.d;
import qd.i;
import rd.c;
import sd.f;
import t0.a2;
import t0.o;
import t0.v;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class HelperFunctionsKt {
    private static final a2<Activity> LocalActivity = v.d(null, HelperFunctionsKt$LocalActivity$1.INSTANCE, 1, null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayBlockForEntitlementIdentifier$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<CustomerInfo, Boolean> {
        final /* synthetic */ String $entitlement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$entitlement = str;
        }

        @Override // zd.l
        public final Boolean invoke(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            EntitlementInfo entitlementInfo = customerInfo.getEntitlements().get(this.$entitlement);
            boolean z10 = false;
            if (entitlementInfo != null && entitlementInfo.isActive()) {
                z10 = true;
            }
            return Boolean.valueOf(!z10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayPaywall$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<Boolean, i0> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(l<? super Boolean, i0> lVar) {
            super(1);
            this.$result = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            Logger.INSTANCE.e("Error fetching customer info to display paywall", new PurchasesException(purchasesError));
            this.$result.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt$shouldDisplayPaywall$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements l<CustomerInfo, i0> {
        final /* synthetic */ l<Boolean, i0> $result;
        final /* synthetic */ l<CustomerInfo, Boolean> $shouldDisplayBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(l<? super CustomerInfo, Boolean> lVar, l<? super Boolean, i0> lVar2) {
            super(1);
            this.$shouldDisplayBlock = lVar;
            this.$result = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            r.f(customerInfo, "it");
            boolean zBooleanValue = this.$shouldDisplayBlock.invoke(customerInfo).booleanValue();
            Logger.INSTANCE.d(zBooleanValue ? "Displaying paywall according to display logic" : "Not displaying paywall according to display logic");
            this.$result.invoke(Boolean.valueOf(zBooleanValue));
        }
    }

    public static final a2<Activity> getLocalActivity() {
        return LocalActivity;
    }

    public static final boolean isInPreviewMode(t0.l lVar, int i10) {
        if (o.I()) {
            o.U(774792703, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.isInPreviewMode (HelperFunctions.kt:24)");
        }
        boolean zBooleanValue = ((Boolean) lVar.P(v0.a())).booleanValue();
        if (o.I()) {
            o.T();
        }
        return zBooleanValue;
    }

    public static final l<CustomerInfo, Boolean> shouldDisplayBlockForEntitlementIdentifier(String str) {
        r.f(str, "entitlement");
        return new AnonymousClass1(str);
    }

    public static final Object shouldDisplayPaywall(l<? super CustomerInfo, Boolean> lVar, d<? super Boolean> dVar) {
        i iVar = new i(c.c(dVar));
        shouldDisplayPaywall(lVar, new HelperFunctionsKt$shouldDisplayPaywall$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final void shouldDisplayPaywall(l<? super CustomerInfo, Boolean> lVar, l<? super Boolean, i0> lVar2) {
        r.f(lVar, "shouldDisplayBlock");
        r.f(lVar2, "result");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new AnonymousClass3(lVar2), new AnonymousClass4(lVar, lVar2));
    }

    public static final float windowAspectRatio(t0.l lVar, int i10) {
        if (o.I()) {
            o.U(1944383602, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowAspectRatio (HelperFunctions.kt:28)");
        }
        Configuration configuration = (Configuration) lVar.P(androidx.compose.ui.platform.r.f());
        float f10 = configuration.screenHeightDp / configuration.screenWidthDp;
        if (o.I()) {
            o.T();
        }
        return f10;
    }
}
