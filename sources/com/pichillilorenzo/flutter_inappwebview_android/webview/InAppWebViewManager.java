package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import f5.r;
import f5.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z10) {
        WebView webView = new WebView(context);
        webView.clearCache(z10);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap map = new HashMap();
        map.put("versionName", packageInfo.versionName);
        map.put("packageName", packageInfo.packageName);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, final j.d dVar) {
        Object objL;
        Context context;
        String str = iVar.f20503a;
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    b10 = 0;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    b10 = 1;
                }
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    b10 = 2;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    b10 = 3;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    b10 = 4;
                }
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    b10 = 5;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    b10 = 6;
                }
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    b10 = 7;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    b10 = 8;
                }
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    b10 = 9;
                }
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    b10 = 10;
                }
                break;
        }
        Map<String, Object> mapConvertWebViewPackageToMap = null;
        switch (b10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                objL = Boolean.TRUE;
                dVar.success(objL);
                break;
            case 1:
                WebView.setWebContentsDebuggingEnabled(((Boolean) iVar.a("debuggingEnabled")).booleanValue());
                objL = Boolean.TRUE;
                dVar.success(objL);
                break;
            case 2:
                if (s.a("GET_VARIATIONS_HEADER")) {
                    objL = r.l();
                    dVar.success(objL);
                }
                dVar.success(mapConvertWebViewPackageToMap);
                break;
            case 3:
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dVar.success(Boolean.TRUE);
                    }
                });
                break;
            case 4:
                if (s.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    objL = r.k().toString();
                    dVar.success(objL);
                }
                dVar.success(mapConvertWebViewPackageToMap);
                break;
            case 5:
                if (!s.a("SAFE_BROWSING_ALLOWLIST")) {
                    if (s.a("SAFE_BROWSING_WHITELIST")) {
                        r.p((List) iVar.a("hosts"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                dVar.success(bool);
                            }
                        });
                    }
                    dVar.success(objL);
                } else {
                    r.o(new HashSet((List) iVar.a("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                }
                break;
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    objL = WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext);
                    dVar.success(objL);
                }
                dVar.success(mapConvertWebViewPackageToMap);
                break;
            case 7:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) iVar.a("includeDiskFiles")).booleanValue());
                    }
                }
                objL = Boolean.TRUE;
                dVar.success(objL);
                break;
            case 8:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo packageInfoF = context != null ? r.f(context) : null;
                if (packageInfoF != null) {
                    mapConvertWebViewPackageToMap = convertWebViewPackageToMap(packageInfoF);
                }
                dVar.success(mapConvertWebViewPackageToMap);
                break;
            case 9:
                objL = s.a("MULTI_PROCESS") ? Boolean.valueOf(r.m()) : Boolean.FALSE;
                dVar.success(objL);
                break;
            case 10:
                String str2 = (String) iVar.a("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                objL = Boolean.TRUE;
                dVar.success(objL);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
