package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import f5.l;
import f5.m;
import f5.r;
import f5.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<m> compatPorts;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f9085id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.f9085id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new j(inAppWebViewInterface.getPlugin().messenger, METHOD_CHANNEL_NAME_PREFIX + str));
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(r.d((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, j.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_CLOSE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).a();
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (s.a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<m> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(this);
            return;
        }
        inAppWebViewInterface.evaluateJavascript("(function() {window.flutter_inappwebview._webMessageChannels['" + this.f9085id + "'] = new MessageChannel();})();", null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue(this);
            }
        });
    }

    public void onMessage(int i10, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i10, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, j.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        m mVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            mVar.d((s.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) ? new l((byte[]) data, (m[]) arrayList.toArray(new m[0])) : new l(data != null ? data.toString() : null, (m[]) arrayList.toArray(new m[0])));
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i10, j.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(i10).e(new m.a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                @Override // f5.m.a
                public void onMessage(m mVar, l lVar) {
                    super.onMessage(mVar, lVar);
                    this.onMessage(i10, lVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(lVar) : null);
                }
            });
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("id", this.f9085id);
        return map;
    }
}
