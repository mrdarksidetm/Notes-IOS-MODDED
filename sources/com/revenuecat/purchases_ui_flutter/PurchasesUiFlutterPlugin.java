package com.revenuecat.purchases_ui_flutter;

import ae.r;
import android.app.Activity;
import android.util.Log;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.ui.PaywallHelpersKt;
import com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.hybridcommon.ui.PresentPaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases_ui_flutter.views.PaywallFooterViewFactory;
import com.revenuecat.purchases_ui_flutter.views.PaywallViewFactory;
import dc.h;
import jc.a;
import kc.c;
import sc.b;
import sc.j;
import wc.i;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesUiFlutterPlugin implements a, j.c, kc.a {
    private final String TAG = "PurchasesUIFlutter";
    private Activity activity;
    private j channel;

    private final h getActivityFragment() {
        Activity activity = this.activity;
        if (activity instanceof h) {
            return (h) activity;
        }
        Log.e(this.TAG, "Paywalls require your activity to subclass FlutterFragmentActivity");
        return null;
    }

    private final void presentPaywall(final j.d dVar, String str, String str2, Boolean bool) {
        h activityFragment = getActivityFragment();
        if (activityFragment != null) {
            PaywallHelpersKt.presentPaywallFromFragment(activityFragment, new PresentPaywallOptions(str2 != null ? new PaywallSource.OfferingIdentifier(str2) : PaywallSource.DefaultOffering.INSTANCE, str, new PaywallResultListener() { // from class: com.revenuecat.purchases_ui_flutter.PurchasesUiFlutterPlugin.presentPaywall.2
                @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener
                public void onPaywallResult(PaywallResult paywallResult) {
                    PaywallResultListener.DefaultImpls.onPaywallResult(this, paywallResult);
                }

                @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener
                public void onPaywallResult(String str3) {
                    r.f(str3, "paywallResult");
                    dVar.success(str3);
                }
            }, bool, null, 16, null));
        } else {
            dVar.error(String.valueOf(PurchasesErrorCode.UnknownError.getCode()), "Make sure your MainActivity inherits from FlutterFragmentActivity", null);
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(c cVar) {
        r.f(cVar, "binding");
        this.activity = cVar.getActivity();
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        i iVarD = bVar.d();
        b bVarB = bVar.b();
        r.e(bVarB, "getBinaryMessenger(...)");
        iVarD.a("com.revenuecat.purchasesui/PaywallView", new PaywallViewFactory(bVarB));
        i iVarD2 = bVar.d();
        b bVarB2 = bVar.b();
        r.e(bVarB2, "getBinaryMessenger(...)");
        iVarD2.a("com.revenuecat.purchasesui/PaywallFooterView", new PaywallFooterViewFactory(bVarB2));
        j jVar = new j(bVar.b(), "purchases_ui_flutter");
        this.channel = jVar;
        jVar.e(this);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.channel;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
    }

    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, j.d dVar) {
        String str;
        r.f(iVar, "call");
        r.f(dVar, "result");
        String str2 = iVar.f20503a;
        if (r.b(str2, "presentPaywall")) {
            str = null;
        } else {
            if (!r.b(str2, "presentPaywallIfNeeded")) {
                dVar.notImplemented();
                return;
            }
            str = (String) iVar.a("requiredEntitlementIdentifier");
        }
        presentPaywall(dVar, str, (String) iVar.a("offeringIdentifier"), (Boolean) iVar.a("displayCloseButton"));
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        r.f(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
