package com.revenuecat.purchases.ui.revenuecatui.activity;

import ae.r;
import android.content.Context;
import android.content.Intent;
import i.a;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallContract extends a<PaywallActivityArgs, PaywallResult> {
    @Override // i.a
    public Intent createIntent(Context context, PaywallActivityArgs paywallActivityArgs) {
        r.f(context, "context");
        r.f(paywallActivityArgs, "args");
        Intent intent = new Intent(context, (Class<?>) PaywallActivity.class);
        intent.putExtra(PaywallActivity.ARGS_EXTRA, paywallActivityArgs);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // i.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult parseResult(int r3, android.content.Intent r4) {
        /*
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L32
            if (r4 != 0) goto L6
            goto L32
        L6:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r1 = "paywall_result"
            if (r3 < r0) goto L17
            java.lang.Class<com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult> r3 = com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult.class
            java.lang.Object r3 = r4.getParcelableExtra(r1, r3)
        L14:
            com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult r3 = (com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult) r3
            goto L21
        L17:
            android.os.Parcelable r3 = r4.getParcelableExtra(r1)
            boolean r4 = r3 instanceof com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult
            if (r4 == 0) goto L20
            goto L14
        L20:
            r3 = 0
        L21:
            if (r3 != 0) goto L31
            com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult$Error r3 = new com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult$Error
            com.revenuecat.purchases.PurchasesError r4 = new com.revenuecat.purchases.PurchasesError
            com.revenuecat.purchases.PurchasesErrorCode r0 = com.revenuecat.purchases.PurchasesErrorCode.UnknownError
            java.lang.String r1 = "PaywallActivity returned null result"
            r4.<init>(r0, r1)
            r3.<init>(r4)
        L31:
            return r3
        L32:
            com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult$Cancelled r3 = com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult.Cancelled.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallContract.parseResult(int, android.content.Intent):com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult");
    }
}
