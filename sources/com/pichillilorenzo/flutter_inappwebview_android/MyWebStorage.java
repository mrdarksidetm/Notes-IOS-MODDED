package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class MyWebStorage extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void getOrigins(final j.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                        HashMap map2 = new HashMap();
                        map2.put("origin", origin.getOrigin());
                        map2.put("quota", Long.valueOf(origin.getQuota()));
                        map2.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(map2);
                    }
                    dVar.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final j.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l10) {
                    dVar.success(l10);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final j.d dVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            dVar.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l10) {
                    dVar.success(l10);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Boolean bool;
        init();
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "getQuotaForOrigin":
                getQuotaForOrigin((String) iVar.a("origin"), dVar);
                break;
            case "deleteAllData":
                WebStorage webStorage = webStorageManager;
                if (webStorage != null) {
                    webStorage.deleteAllData();
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            case "deleteOrigin":
                if (webStorageManager != null) {
                    webStorageManager.deleteOrigin((String) iVar.a("origin"));
                    bool = Boolean.TRUE;
                    dVar.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                dVar.success(bool);
                break;
            case "getOrigins":
                getOrigins(dVar);
                break;
            case "getUsageForOrigin":
                getUsageForOrigin((String) iVar.a("origin"), dVar);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
