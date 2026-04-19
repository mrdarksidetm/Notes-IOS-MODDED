package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallResourceProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String applicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static final ResourceProvider toResourceProvider(Context context) {
        r.f(context, "<this>");
        return new PaywallResourceProvider(context);
    }
}
