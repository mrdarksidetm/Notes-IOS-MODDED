package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import java.util.HashMap;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, j jVar) {
        super(jVar);
        this.headlessWebView = headlessInAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Size2D size;
        Boolean bool;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "getSize":
                HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
                Map<String, Object> map = null;
                if (headlessInAppWebView != null && (size = headlessInAppWebView.getSize()) != null) {
                    map = size.toMap();
                }
                dVar.success(map);
                break;
            case "dispose":
                HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
                if (headlessInAppWebView2 != null) {
                    headlessInAppWebView2.dispose();
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            case "setSize":
                if (this.headlessWebView != null) {
                    Size2D size2DFromMap = Size2D.fromMap((Map) iVar.a("size"));
                    if (size2DFromMap != null) {
                        this.headlessWebView.setSize(size2DFromMap);
                    }
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }

    public void onWebViewCreated() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onWebViewCreated", new HashMap());
    }
}
