package com.revenuecat.purchases_ui_flutter.views;

import ae.r;
import ae.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import ge.o;
import java.util.Map;
import md.i0;
import md.x;
import nd.r0;
import o3.c2;
import sc.b;
import sc.j;
import wc.g;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFooterView implements g {
    private final j methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView nativePaywallFooterView;

    /* JADX INFO: renamed from: com.revenuecat.purchases_ui_flutter.views.PaywallFooterView$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements a<i0> {
        AnonymousClass2() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PaywallFooterView.this.methodChannel.c("onDismiss", null);
        }
    }

    public PaywallFooterView(Context context, int i10, b bVar, Map<String, ? extends Object> map) {
        r.f(context, "context");
        r.f(bVar, "messenger");
        r.f(map, "creationParams");
        this.methodChannel = new j(bVar, "com.revenuecat.purchasesui/PaywallFooterView/" + i10);
        String str = (String) map.get("offeringIdentifier");
        com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView paywallFooterView = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView(context, new AnonymousClass2()) { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallFooterView.1
            @Override // android.widget.FrameLayout, android.view.View
            public void onMeasure(int i11, int i12) {
                super.onMeasure(i11, i12);
                int iD = 0;
                int iD2 = 0;
                for (View view : c2.a(this)) {
                    view.measure(i11, 0);
                    iD = o.d(iD, view.getMeasuredWidth());
                    iD2 = o.d(iD2, view.getMeasuredHeight());
                }
                int iD3 = o.d(iD, getSuggestedMinimumWidth());
                int iD4 = o.d(iD2, getSuggestedMinimumHeight());
                setMeasuredDimension(iD3, iD4);
                this.updateHeight(iD4);
            }
        };
        this.nativePaywallFooterView = paywallFooterView;
        paywallFooterView.setPaywallListener(new PaywallListenerWrapper() { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallFooterView.3
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseCompleted(Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
                r.f(map2, "customerInfo");
                r.f(map3, "storeTransaction");
                PaywallFooterView.this.methodChannel.c("onPurchaseCompleted", r0.h(x.a("customerInfo", map2), x.a("storeTransaction", map3)));
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseError(Map<String, ? extends Object> map2) {
                r.f(map2, "error");
                PaywallFooterView.this.methodChannel.c("onPurchaseError", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseStarted(Map<String, ? extends Object> map2) {
                r.f(map2, "rcPackage");
                PaywallFooterView.this.methodChannel.c("onPurchaseStarted", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreCompleted(Map<String, ? extends Object> map2) {
                r.f(map2, "customerInfo");
                PaywallFooterView.this.methodChannel.c("onRestoreCompleted", map2);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreError(Map<String, ? extends Object> map2) {
                r.f(map2, "error");
                PaywallFooterView.this.methodChannel.c("onRestoreError", map2);
            }
        });
        paywallFooterView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 80));
        paywallFooterView.setOfferingId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHeight(double d10) {
        this.methodChannel.c("onHeightChanged", Double.valueOf(d10));
    }

    @Override // wc.g
    public void dispose() {
    }

    @Override // wc.g
    public View getView() {
        return this.nativePaywallFooterView;
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
}
