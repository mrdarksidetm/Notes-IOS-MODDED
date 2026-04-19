package com.pichillilorenzo.flutter_inappwebview_android;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import f5.s;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewFeatureManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        boolean zB;
        String str = iVar.f20503a;
        str.hashCode();
        if (str.equals("isStartupFeatureSupported")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                return;
            }
            zB = s.b(this.plugin.activity, (String) iVar.a("startupFeature"));
        } else {
            if (!str.equals("isFeatureSupported")) {
                dVar.notImplemented();
                return;
            }
            zB = s.a((String) iVar.a("feature"));
        }
        dVar.success(Boolean.valueOf(zB));
    }
}
