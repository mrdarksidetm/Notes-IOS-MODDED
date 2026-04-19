package com.revenuecat.purchases.deeplinks;

import ae.j;
import ae.r;
import ae.s;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.CustomerInfoUpdateHandler;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import md.i0;
import zd.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class WebPurchaseRedemptionHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final IdentityManager identityManager;
    private final Handler mainHandler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper$dispatchResult$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {
        final /* synthetic */ RedeemWebPurchaseListener.Result $result;
        final /* synthetic */ RedeemWebPurchaseListener $resultListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
            super(0);
            this.$resultListener = redeemWebPurchaseListener;
            this.$result = result;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$resultListener.handleResult(this.$result);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper$handleRedeemWebPurchase$1, reason: invalid class name and case insensitive filesystem */
    static final class C05661 extends s implements l<RedeemWebPurchaseListener.Result, i0> {
        final /* synthetic */ RedeemWebPurchaseListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05661(RedeemWebPurchaseListener redeemWebPurchaseListener) {
            super(1);
            this.$listener = redeemWebPurchaseListener;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(RedeemWebPurchaseListener.Result result) {
            invoke2(result);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RedeemWebPurchaseListener.Result result) {
            r.f(result, "result");
            if (result instanceof RedeemWebPurchaseListener.Result.Success) {
                LogUtilsKt.debugLog("Successfully redeemed web purchase. Updating customer info.");
                WebPurchaseRedemptionHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                WebPurchaseRedemptionHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo());
            } else {
                LogUtilsKt.errorLog$default("Error redeeming web purchase: " + result, null, 2, null);
            }
            WebPurchaseRedemptionHelper.this.dispatchResult(this.$listener, result);
        }
    }

    public WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler) {
        r.f(backend, "backend");
        r.f(identityManager, "identityManager");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        this.backend = backend;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.mainHandler = handler;
    }

    public /* synthetic */ WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler, int i10, j jVar) {
        this(backend, identityManager, offlineEntitlementsManager, customerInfoUpdateHandler, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    private final void dispatch(final a<i0> aVar) {
        if (r.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: nb.a
            @Override // java.lang.Runnable
            public final void run() {
                WebPurchaseRedemptionHelper.dispatch$lambda$0(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(a aVar) {
        r.f(aVar, "$tmp0");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchResult(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
        dispatch(new AnonymousClass1(redeemWebPurchaseListener, result));
    }

    public final void handleRedeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        r.f(webPurchaseRedemption, "webPurchaseRedemption");
        r.f(redeemWebPurchaseListener, "listener");
        LogUtilsKt.debugLog("Starting web purchase redemption.");
        this.backend.postRedeemWebPurchase(this.identityManager.getCurrentAppUserID(), webPurchaseRedemption.getRedemptionToken$purchases_defaultsRelease(), new C05661(redeemWebPurchaseListener));
    }
}
