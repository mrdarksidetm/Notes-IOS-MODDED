package com.revenuecat.purchases.amazon.purchasing;

import ae.j;
import ae.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.api.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyAmazonBillingActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRAS_PURCHASING_SERVICE_PROVIDER = "purchasing_service_provider";
    public static final String EXTRAS_REQUEST_ID = "request_id";
    public static final String EXTRAS_RESULT_RECEIVER = "result_receiver";
    public static final String EXTRAS_SKU = "sku";
    private ProxyAmazonBillingDelegate proxyAmazonBillingDelegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Intent newStartIntent(Context context, ResultReceiver resultReceiver, String str, PurchasingServiceProvider purchasingServiceProvider) {
            r.f(context, "context");
            r.f(resultReceiver, "resultReceiver");
            r.f(str, "sku");
            r.f(purchasingServiceProvider, "purchasingServiceProvider");
            Intent intent = new Intent(context, (Class<?>) ProxyAmazonBillingActivity.class);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
            intent.putExtra("sku", str);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER, purchasingServiceProvider);
            return intent;
        }
    }

    public static /* synthetic */ void getProxyAmazonBillingDelegate$purchases_defaultsRelease$annotations() {
    }

    public final ProxyAmazonBillingDelegate getProxyAmazonBillingDelegate$purchases_defaultsRelease() {
        return this.proxyAmazonBillingDelegate;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(R.style.ProxyAmazonBillingActivityTheme);
        super.onCreate(bundle);
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = new ProxyAmazonBillingDelegate();
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
        proxyAmazonBillingDelegate.onCreate(this, bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = this.proxyAmazonBillingDelegate;
        if (proxyAmazonBillingDelegate != null) {
            proxyAmazonBillingDelegate.onDestroy(this);
        }
        this.proxyAmazonBillingDelegate = null;
    }

    public final void setProxyAmazonBillingDelegate$purchases_defaultsRelease(ProxyAmazonBillingDelegate proxyAmazonBillingDelegate) {
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
    }
}
