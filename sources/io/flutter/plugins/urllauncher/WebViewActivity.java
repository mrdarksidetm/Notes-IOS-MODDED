package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WebView f13157c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f13155a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebViewClient f13156b = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IntentFilter f13158d = new IntentFilter("close action");

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f13157c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f13157c.loadUrl(str);
                return true;
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f13157c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z10, boolean z11, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z10).putExtra("enableDomStorage", z11).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f13157c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f13157c.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f13157c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f13157c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f13157c.setWebViewClient(this.f13156b);
        this.f13157c.getSettings().setSupportMultipleWindows(true);
        this.f13157c.setWebChromeClient(new c());
        androidx.core.content.a.registerReceiver(this, this.f13155a, this.f13158d, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f13155a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f13157c.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f13157c.goBack();
        return true;
    }
}
