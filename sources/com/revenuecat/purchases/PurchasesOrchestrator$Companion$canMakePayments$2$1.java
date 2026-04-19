package com.revenuecat.purchases;

import ae.r;
import android.os.Handler;
import com.android.billingclient.api.e;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements c {
    final /* synthetic */ com.android.billingclient.api.a $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ AtomicBoolean $hasResponded;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, AtomicBoolean atomicBoolean, Callback<Boolean> callback, com.android.billingclient.api.a aVar, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$hasResponded = atomicBoolean;
        this.$callback = callback;
        this.$billingClient = aVar;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.a r6, java.util.concurrent.atomic.AtomicBoolean r7, com.revenuecat.purchases.interfaces.Callback r8) {
        /*
            java.lang.String r0 = "Callback has already been called when checking if device can make payments."
            java.lang.String r1 = "$billingClient"
            ae.r.f(r6, r1)
            java.lang.String r1 = "$hasResponded"
            ae.r.f(r7, r1)
            java.lang.String r1 = "$callback"
            ae.r.f(r8, r1)
            r1 = 1
            r6.c()     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L29
            boolean r6 = r7.getAndSet(r1)
            if (r6 == 0) goto L21
        L1b:
            com.revenuecat.purchases.common.LogIntent r6 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR
            com.revenuecat.purchases.common.LogWrapperKt.log(r6, r0)
            goto L4e
        L21:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r8.onReceived(r6)
            goto L4e
        L27:
            r6 = move-exception
            goto L4f
        L29:
            r6 = move-exception
            com.revenuecat.purchases.common.LogIntent r2 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "Exception received when checking if device can make payments: \n%s."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            r5 = 0
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L27
            r4[r5] = r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = java.lang.String.format(r3, r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "format(this, *args)"
            ae.r.e(r6, r3)     // Catch: java.lang.Throwable -> L27
            com.revenuecat.purchases.common.LogWrapperKt.log(r2, r6)     // Catch: java.lang.Throwable -> L27
            boolean r6 = r7.getAndSet(r1)
            if (r6 == 0) goto L21
            goto L1b
        L4e:
            return
        L4f:
            boolean r7 = r7.getAndSet(r1)
            if (r7 == 0) goto L5b
            com.revenuecat.purchases.common.LogIntent r7 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR
            com.revenuecat.purchases.common.LogWrapperKt.log(r7, r0)
            goto L60
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8.onReceived(r7)
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.a, java.util.concurrent.atomic.AtomicBoolean, com.revenuecat.purchases.interfaces.Callback):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(AtomicBoolean atomicBoolean, e eVar, Callback callback, com.android.billingclient.api.a aVar, List list) {
        boolean z10;
        r.f(atomicBoolean, "$hasResponded");
        r.f(eVar, "$billingResult");
        r.f(callback, "$callback");
        r.f(aVar, "$billingClient");
        r.f(list, "$features");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(PurchaseStrings.EXTRA_CONNECTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return;
        }
        try {
            if (!BillingResultExtensionsKt.isSuccessful(eVar)) {
                callback.onReceived(Boolean.FALSE);
                aVar.c();
                return;
            }
            if ((list instanceof Collection) && list.isEmpty()) {
                z10 = true;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e eVarE = aVar.e(((BillingFeature) it.next()).getPlayBillingClientName());
                    r.e(eVarE, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(eVarE)) {
                        z10 = false;
                        break;
                    }
                }
                z10 = true;
            }
            aVar.c();
            callback.onReceived(Boolean.valueOf(z10));
        } catch (IllegalArgumentException e10) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str2);
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // v6.c
    public void onBillingServiceDisconnected() {
        Handler handler = this.$mainHandler;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final AtomicBoolean atomicBoolean = this.$hasResponded;
        final Callback<Boolean> callback = this.$callback;
        handler.post(new Runnable() { // from class: gb.g
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(aVar, atomicBoolean, callback);
            }
        });
    }

    @Override // v6.c
    public void onBillingSetupFinished(final e eVar) {
        r.f(eVar, "billingResult");
        Handler handler = this.$mainHandler;
        final AtomicBoolean atomicBoolean = this.$hasResponded;
        final Callback<Boolean> callback = this.$callback;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final List<BillingFeature> list = this.$features;
        handler.post(new Runnable() { // from class: gb.h
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1(atomicBoolean, eVar, callback, aVar, list);
            }
        });
    }
}
