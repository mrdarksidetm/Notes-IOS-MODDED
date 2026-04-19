package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import f5.b;
import f5.l;
import f5.r;
import f5.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f9086id;
    public String jsObjectName;
    public r.b listener;
    public b replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, sc.b bVar, String str2, Set<String> set) {
        this.f9086id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new j(bVar, METHOD_CHANNEL_NAME_PREFIX + this.f9086id + "_" + this.jsObjectName));
        if (this.webView instanceof InAppWebView) {
            this.listener = new r.b() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // f5.r.b
                public void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, b bVar2) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = bVar2;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(lVar), uri.toString().equals("null") ? null : uri.toString(), z10);
                    }
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, sc.b bVar, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, bVar, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() throws Exception {
        int i10 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception("allowedOriginRules[" + i10 + "] is null");
            }
            if (str.isEmpty()) {
                throw new Exception("allowedOriginRules[" + i10 + "] is empty");
            }
            if (!"*".equals(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                int port = uri.getPort();
                if (scheme == null) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!path.isEmpty()) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (host != null) {
                    int iIndexOf = host.indexOf("*");
                    if (iIndexOf != 0 || (iIndexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception("allowedOriginRules " + str + " is invalid");
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                    }
                }
                i10++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        String string;
        if (this.webView != null) {
            String strReplaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if ("*".equals(str)) {
                    string = "'*'";
                } else {
                    Uri uri = Uri.parse(str);
                    String str2 = uri.getHost() != null ? "'" + Util.replaceAll(uri.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("{scheme: '");
                    sb2.append(uri.getScheme());
                    sb2.append("', host: ");
                    sb2.append(str2);
                    sb2.append(", port: ");
                    sb2.append(uri.getPort() != -1 ? Integer.valueOf(uri.getPort()) : "null");
                    sb2.append("}");
                    string = sb2.toString();
                }
                arrayList.add(string);
            }
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, "(function() {  var allowedOriginRules = [" + TextUtils.join(", ", arrayList) + "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['" + strReplaceAll + "'] = new FlutterInAppWebViewWebMessageListener('" + strReplaceAll + "');  }})();", UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOriginAllowed(java.lang.String r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.isOriginAllowed(java.lang.String, java.lang.String, int):boolean");
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, j.d dVar) {
        Object data;
        if (this.replyProxy != null && s.a("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
            if (s.a("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                this.replyProxy.b((byte[]) data);
            } else {
                this.replyProxy.a(data.toString());
            }
        }
        dVar.success(Boolean.TRUE);
    }
}
