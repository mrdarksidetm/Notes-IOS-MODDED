package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallResourceProvider implements ResourceProvider {
    private final String applicationName;
    private final Resources resources;

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallResourceProvider(Context context) {
        r.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        r.e(applicationContext, "context.applicationContext");
        String strApplicationName = PaywallResourceProviderKt.applicationName(applicationContext);
        Resources resources = context.getResources();
        r.e(resources, "context.resources");
        this(strApplicationName, resources);
    }

    public PaywallResourceProvider(String str, Resources resources) {
        r.f(str, "applicationName");
        r.f(resources, "resources");
        this.applicationName = str;
        this.resources = resources;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getApplicationName() {
        return this.applicationName;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public Locale getLocale() {
        Locale locale = this.resources.getConfiguration().getLocales().get(0);
        r.e(locale, "resources.configuration.locales.get(0)");
        return locale;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getString(int i10, Object... objArr) {
        r.f(objArr, "formatArgs");
        String string = this.resources.getString(i10, Arrays.copyOf(objArr, objArr.length));
        r.e(string, "resources.getString(resId, *formatArgs)");
        return string;
    }
}
