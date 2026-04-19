package com.revenuecat.purchases.utils;

import ae.r;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultIsDebugBuildProvider implements IsDebugBuildProvider {
    private final Context context;

    public DefaultIsDebugBuildProvider(Context context) {
        r.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        r.e(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    @Override // com.revenuecat.purchases.utils.IsDebugBuildProvider
    public boolean invoke() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }
}
