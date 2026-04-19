package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView;
import f5.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FlutterWebView implements PlatformWebView {
    static final String LOG_TAG = "IAWFlutterWebView";
    public String keepAliveId;
    public PullToRefreshLayout pullToRefreshLayout;
    public InAppWebView webView;

    public FlutterWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context, Object obj, HashMap<String, Object> map) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        this.keepAliveId = (String) map.get("keepAliveId");
        Map<String, Object> map2 = (Map) map.get("initialSettings");
        Map map3 = (Map) map.get("contextMenu");
        Integer num = (Integer) map.get("windowId");
        List list = (List) map.get("initialUserScripts");
        Map<String, Object> map4 = (Map) map.get("pullToRefreshSettings");
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse2(map2);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UserScript.fromMap((Map) it.next()));
            }
        }
        this.webView = new InAppWebView(context, inAppWebViewFlutterPlugin, obj, num, inAppWebViewSettings, map3, inAppWebViewSettings.useHybridComposition.booleanValue() ? null : inAppWebViewFlutterPlugin.flutterView, arrayList);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
        pullToRefreshSettings.parse2(map4);
        PullToRefreshLayout pullToRefreshLayout = new PullToRefreshLayout(context, inAppWebViewFlutterPlugin, obj, pullToRefreshSettings);
        this.pullToRefreshLayout = pullToRefreshLayout;
        pullToRefreshLayout.addView(this.webView);
        this.pullToRefreshLayout.prepare();
        FindInteractionController findInteractionController = new FindInteractionController(this.webView, inAppWebViewFlutterPlugin, obj, null);
        this.webView.findInteractionController = findInteractionController;
        findInteractionController.prepare();
        this.webView.prepare();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public void dispose() {
        InAppWebView inAppWebView;
        if (this.keepAliveId != null || (inAppWebView = this.webView) == null) {
            return;
        }
        inAppWebView.dispose();
        this.webView = null;
        PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
        if (pullToRefreshLayout != null) {
            pullToRefreshLayout.dispose();
            this.pullToRefreshLayout = null;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public View getView() {
        PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
        return pullToRefreshLayout != null ? pullToRefreshLayout : this.webView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView
    @SuppressLint({"RestrictedApi"})
    public void makeInitialLoad(HashMap<String, Object> map) {
        URLRequest uRLRequestFromMap;
        InAppWebViewManager inAppWebViewManager;
        Message message;
        if (this.webView == null) {
            return;
        }
        Integer num = (Integer) map.get("windowId");
        Map map2 = (Map) map.get("initialUrlRequest");
        String str = (String) map.get("initialFile");
        Map map3 = (Map) map.get("initialData");
        if (num != null) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.webView.plugin;
            if (inAppWebViewFlutterPlugin == null || (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) == null || (message = inAppWebViewManager.windowWebViewMessages.get(num)) == null) {
                return;
            }
            ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
            message.sendToTarget();
            if (s.a("DOCUMENT_START_SCRIPT")) {
                this.webView.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InAppWebView inAppWebView = FlutterWebView.this.webView;
                        if (inAppWebView != null) {
                            inAppWebView.prepareAndAddUserScripts();
                        }
                    }
                });
                return;
            }
            return;
        }
        if (str != null) {
            try {
                this.webView.loadFile(str);
                return;
            } catch (IOException e10) {
                Log.e(LOG_TAG, str + " asset file cannot be found!", e10);
                return;
            }
        }
        if (map3 != null) {
            this.webView.loadDataWithBaseURL((String) map3.get("baseUrl"), (String) map3.get("data"), (String) map3.get("mimeType"), (String) map3.get("encoding"), (String) map3.get("historyUrl"));
            return;
        }
        if (map2 == null || (uRLRequestFromMap = URLRequest.fromMap(map2)) == null) {
            return;
        }
        this.webView.loadUrl(uRLRequestFromMap);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public void onFlutterViewAttached(View view) {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.setContainerView(view);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public void onFlutterViewDetached() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.setContainerView(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public void onInputConnectionLocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.lockInputConnection();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView, wc.g
    public void onInputConnectionUnlocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.unlockInputConnection();
    }
}
