package com.revenuecat.purchases_ui_flutter.views;

import ae.r;
import ae.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import java.util.Map;
import md.i0;
import md.x;
import nd.r0;
import sc.b;
import sc.i;
import sc.j;
import wc.g;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallView implements g, j.c {
    private final j methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallView nativePaywallView;

    /* JADX INFO: renamed from: com.revenuecat.purchases_ui_flutter.views.PaywallView$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {
        AnonymousClass1() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PaywallView.this.methodChannel.c("onDismiss", null);
        }
    }

    public PaywallView(Context context, int i10, b bVar, Map<String, ? extends Object> map) {
        r.f(context, "context");
        r.f(bVar, "messenger");
        r.f(map, "creationParams");
        j jVar = new j(bVar, "com.revenuecat.purchasesui/PaywallView/" + i10);
        this.methodChannel = jVar;
        jVar.e(this);
        String str = (String) map.get("offeringIdentifier");
        com.revenuecat.purchases.ui.revenuecatui.views.PaywallView paywallView = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallView(context, null, null, null, (Boolean) map.get("displayCloseButton"), new AnonymousClass1(), 14, null);
        this.nativePaywallView = paywallView;
        paywallView.setPaywallListener(new PaywallListenerWrapper() { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallView.2
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseCompleted(Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
                r.f(map2, "customerInfo");
                r.f(map3, "storeTransaction");
                PaywallView.this.methodChannel.c("onPurchaseCompleted", r0.h(x.a("customerInfo", map2), x.a("storeTransaction", map3)));
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseError(Map<String, ? extends Object> map2) {
                r.f(map2, "error");
                PaywallView.this.methodChannel.c("onPurchaseError", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseStarted(Map<String, ? extends Object> map2) {
                r.f(map2, "rcPackage");
                PaywallView.this.methodChannel.c("onPurchaseStarted", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreCompleted(Map<String, ? extends Object> map2) {
                r.f(map2, "customerInfo");
                PaywallView.this.methodChannel.c("onRestoreCompleted", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreError(Map<String, ? extends Object> map2) {
                r.f(map2, "error");
                PaywallView.this.methodChannel.c("onRestoreError", map2);
            }
        });
        paywallView.setOfferingId(str);
    }

    @Override // wc.g
    public void dispose() {
    }

    @Override // wc.g
    public View getView() {
        return this.nativePaywallView;
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
        super.onFlutterViewAttached(view);
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        super.onInputConnectionLocked();
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        super.onInputConnectionUnlocked();
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        r.f(iVar, "methodCall");
        r.f(dVar, "result");
        String str = iVar.f20503a;
        dVar.notImplemented();
    }
}
