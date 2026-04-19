package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.h;
import com.amazon.a.a.o.b;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, j jVar) {
        super(jVar);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onClosed", new HashMap());
    }

    public void onCompletedInitialLoad() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onCompletedInitialLoad", new HashMap());
    }

    public void onGreatestScrollPercentageIncreased(int i10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("scrollPercentage", Integer.valueOf(i10));
        channel.c("onGreatestScrollPercentageIncreased", map);
    }

    public void onItemActionPerform(int i10, String str, String str2) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        map.put("url", str);
        map.put(b.S, str2);
        channel.c("onItemActionPerform", map);
    }

    public void onMessageChannelReady() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onMessageChannelReady", new HashMap());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        h hVar;
        String str;
        Object objValueOf;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        boolean zO;
        String str2 = iVar.f20503a;
        str2.hashCode();
        byte b10 = -1;
        switch (str2.hashCode()) {
            case -1526944655:
                if (str2.equals("isEngagementSignalsApiAvailable")) {
                    b10 = 0;
                }
                break;
            case -675108676:
                if (str2.equals("launchUrl")) {
                    b10 = 1;
                }
                break;
            case -334843312:
                if (str2.equals("updateSecondaryToolbar")) {
                    b10 = 2;
                }
                break;
            case 50870385:
                if (str2.equals("updateActionButton")) {
                    b10 = 3;
                }
                break;
            case 94756344:
                if (str2.equals("close")) {
                    b10 = 4;
                }
                break;
            case 1256059502:
                if (str2.equals("validateRelationship")) {
                    b10 = 5;
                }
                break;
            case 1392239787:
                if (str2.equals("requestPostMessageChannel")) {
                    b10 = 6;
                }
                break;
            case 1490029383:
                if (str2.equals("postMessage")) {
                    b10 = 7;
                }
                break;
            case 2000053463:
                if (str2.equals("mayLaunchUrl")) {
                    b10 = 8;
                }
                break;
        }
        switch (b10) {
            case 0:
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity != null && (hVar = chromeCustomTabsActivity.customTabsSession) != null) {
                    try {
                        dVar.success(Boolean.valueOf(hVar.h(new Bundle())));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 1:
                if (this.chromeCustomTabsActivity != null && (str = (String) iVar.a("url")) != null) {
                    this.chromeCustomTabsActivity.launchUrl(str, (Map) iVar.a("headers"), (String) iVar.a("referrer"), (List) iVar.a("otherLikelyURLs"));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 2:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) iVar.a("secondaryToolbar")));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 3:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) iVar.a("icon"), (String) iVar.a(b.f7429c));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 4:
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 != null) {
                    chromeCustomTabsActivity2.onStop();
                    this.chromeCustomTabsActivity.onDestroy();
                    this.chromeCustomTabsActivity.close();
                    ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                    if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                        Intent intent = new Intent(activity, activity.getClass());
                        intent.addFlags(67108864);
                        intent.addFlags(536870912);
                        activity.startActivity(intent);
                    }
                    this.chromeCustomTabsActivity.dispose();
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 5:
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 != null && chromeCustomTabsActivity3.customTabsSession != null) {
                    zO = this.chromeCustomTabsActivity.customTabsSession.o(((Integer) iVar.a("relation")).intValue(), Uri.parse((String) iVar.a("origin")), null);
                    objValueOf = Boolean.valueOf(zO);
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 6:
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 != null && chromeCustomTabsActivity4.customTabsSession != null) {
                    String str3 = (String) iVar.a("sourceOrigin");
                    String str4 = (String) iVar.a("targetOrigin");
                    zO = this.chromeCustomTabsActivity.customTabsSession.k(Uri.parse(str3), str4 != null ? Uri.parse(str4) : null, new Bundle());
                    objValueOf = Boolean.valueOf(zO);
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case 7:
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                objValueOf = Integer.valueOf((chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) ? -3 : this.chromeCustomTabsActivity.customTabsSession.j((String) iVar.a("message"), new Bundle()));
                dVar.success(objValueOf);
                break;
            case 8:
                if (this.chromeCustomTabsActivity != null) {
                    zO = this.chromeCustomTabsActivity.mayLaunchUrl((String) iVar.a("url"), (List) iVar.a("otherLikelyURLs"));
                    objValueOf = Boolean.valueOf(zO);
                    dVar.success(objValueOf);
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }

    public void onNavigationEvent(int i10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("navigationEvent", Integer.valueOf(i10));
        channel.c("onNavigationEvent", map);
    }

    public void onOpened() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onOpened", new HashMap());
    }

    public void onPostMessage(String str) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("message", str);
        channel.c("onPostMessage", map);
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("relation", Integer.valueOf(i10));
        map.put("requestedOrigin", uri.toString());
        map.put("result", Boolean.valueOf(z10));
        channel.c("onRelationshipValidationResult", map);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("url", str2);
        channel.c("onSecondaryItemActionPerform", map);
    }

    public void onServiceConnected() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onServiceConnected", new HashMap());
    }

    public void onSessionEnded(boolean z10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("didUserInteract", Boolean.valueOf(z10));
        channel.c("onSessionEnded", map);
    }

    public void onVerticalScrollEvent(boolean z10) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("isDirectionUp", Boolean.valueOf(z10));
        channel.c("onVerticalScrollEvent", map);
    }
}
