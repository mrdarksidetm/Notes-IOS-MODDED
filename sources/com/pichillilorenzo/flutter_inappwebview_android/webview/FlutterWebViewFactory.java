package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.HashMap;
import sc.p;
import wc.g;
import wc.h;

/* JADX INFO: loaded from: classes2.dex */
public class FlutterWebViewFactory extends h {
    public static final String VIEW_TYPE_ID = "com.pichillilorenzo/flutter_inappwebview";
    private final InAppWebViewFlutterPlugin plugin;

    public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(p.f20515a);
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // wc.h
    public g create(Context context, int i10, Object obj) {
        FlutterWebView flutterWebView;
        View view;
        ViewGroup viewGroup;
        HeadlessInAppWebView headlessInAppWebView;
        HashMap<String, Object> map = (HashMap) obj;
        Object objValueOf = Integer.valueOf(i10);
        String str = (String) map.get("keepAliveId");
        String str2 = (String) map.get("headlessWebViewId");
        HeadlessInAppWebViewManager headlessInAppWebViewManager = this.plugin.headlessInAppWebViewManager;
        if (str2 == null || headlessInAppWebViewManager == null || (headlessInAppWebView = headlessInAppWebViewManager.webViews.get(str2)) == null) {
            flutterWebView = null;
        } else {
            flutterWebView = headlessInAppWebView.disposeAndGetFlutterWebView();
            if (flutterWebView != null) {
                flutterWebView.keepAliveId = str;
            }
        }
        InAppWebViewManager inAppWebViewManager = this.plugin.inAppWebViewManager;
        if (str != null && flutterWebView == null && inAppWebViewManager != null && (flutterWebView = inAppWebViewManager.keepAliveWebViews.get(str)) != null && (view = flutterWebView.getView()) != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeView(view);
        }
        boolean z10 = flutterWebView == null;
        if (flutterWebView == null) {
            if (str != null) {
                objValueOf = str;
            }
            flutterWebView = new FlutterWebView(this.plugin, context, objValueOf, map);
        }
        if (str != null && inAppWebViewManager != null) {
            inAppWebViewManager.keepAliveWebViews.put(str, flutterWebView);
        }
        if (z10) {
            flutterWebView.makeInitialLoad(map);
        }
        return flutterWebView;
    }
}
