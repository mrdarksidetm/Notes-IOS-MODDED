package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.HashMap;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener, j jVar) {
        super(jVar);
        this.webMessageListener = webMessageListener;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        String str = iVar.f20503a;
        str.hashCode();
        if (!str.equals("postMessage")) {
            dVar.notImplemented();
            return;
        }
        WebMessageListener webMessageListener = this.webMessageListener;
        if (webMessageListener == null || !(webMessageListener.webView instanceof InAppWebView)) {
            dVar.success(Boolean.FALSE);
        } else {
            this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) iVar.a("message")), dVar);
        }
    }

    public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
        map.put("sourceOrigin", str);
        map.put("isMainFrame", Boolean.valueOf(z10));
        channel.c("onPostMessage", map);
    }
}
