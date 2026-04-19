package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import f5.c;
import f5.d;
import f5.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static d proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final j.d dVar) {
        d dVar2 = proxyController;
        if (dVar2 != null) {
            dVar2.a(new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    dVar.success(Boolean.TRUE);
                }
            });
        }
    }

    public static void init() {
        if (proxyController == null && s.a("PROXY_OVERRIDE")) {
            proxyController = d.b();
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final j.d dVar) {
        if (proxyController != null) {
            c.a aVar = new c.a();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (it2.hasNext()) {
                aVar.b(it2.next());
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    aVar.d(proxyRuleExt.getUrl(), proxyRuleExt.getSchemeFilter());
                } else {
                    aVar.c(proxyRuleExt.getUrl());
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                aVar.g();
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                aVar.i();
            }
            if (proxySettings.reverseBypassEnabled != null && s.a("PROXY_OVERRIDE_REVERSE_BYPASS")) {
                aVar.k(proxySettings.reverseBypassEnabled.booleanValue());
            }
            proxyController.c(aVar.e(), new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    dVar.success(Boolean.TRUE);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        init();
        String str = iVar.f20503a;
        str.hashCode();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(dVar);
                return;
            }
        } else if (!str.equals("setProxyOverride")) {
            dVar.notImplemented();
            return;
        } else if (proxyController != null) {
            HashMap map = (HashMap) iVar.a("settings");
            ProxySettings proxySettings = new ProxySettings();
            if (map != null) {
                proxySettings.parse2((Map<String, Object>) map);
            }
            setProxyOverride(proxySettings, dVar);
            return;
        }
        dVar.success(Boolean.FALSE);
    }
}
