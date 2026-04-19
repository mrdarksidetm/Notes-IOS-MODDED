package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f9070id;
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.browsers = new HashMap();
        String string = UUID.randomUUID().toString();
        this.f9070id = string;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(string, this);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
            if (chromeCustomTabsActivity != null) {
                chromeCustomTabsActivity.close();
                chromeCustomTabsActivity.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.f9070id);
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        String str;
        Object objValueOf;
        Activity activity;
        str = (String) iVar.a("id");
        String str2 = iVar.f20503a;
        str2.hashCode();
        switch (str2) {
            case "getMaxToolbarItems":
                objValueOf = Integer.valueOf(c.a());
                dVar.success(objValueOf);
            case "open":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                    open(this.plugin.activity, str, (String) iVar.a("url"), (HashMap) iVar.a("headers"), (String) iVar.a("referrer"), (ArrayList) iVar.a("otherLikelyURLs"), (HashMap) iVar.a("settings"), (HashMap) iVar.a("actionButton"), (HashMap) iVar.a("secondaryToolbar"), (List) iVar.a("menuItemList"), dVar);
                    return;
                }
                break;
            case "getPackageName":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                objValueOf = (inAppWebViewFlutterPlugin2 == null || inAppWebViewFlutterPlugin2.activity == null) ? null : b.d(this.plugin.activity, (ArrayList) iVar.a("packages"), ((Boolean) iVar.a("ignoreDefault")).booleanValue());
                dVar.success(objValueOf);
            case "isAvailable":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null && (activity = inAppWebViewFlutterPlugin3.activity) != null) {
                    objValueOf = Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity));
                }
                dVar.success(objValueOf);
            default:
                dVar.notImplemented();
                return;
        }
        objValueOf = Boolean.FALSE;
        dVar.success(objValueOf);
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> map, String str3, ArrayList<String> arrayList, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, List<HashMap<String, Object>> list, j.d dVar) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f9070id);
        bundle.putSerializable("headers", map);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", map2);
        bundle.putSerializable("actionButton", map3);
        bundle.putSerializable("secondaryToolbar", map4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(map2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(map2, "isTrustedWebActivity", bool);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            dVar.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) (!bool2.booleanValue() ? !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class : !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class));
        intent.putExtras(bundle);
        if (((Boolean) Util.getOrDefault(map2, "noHistory", bool)).booleanValue()) {
            intent.addFlags(1073741824);
        }
        activity.startActivity(intent);
        dVar.success(Boolean.TRUE);
    }
}
