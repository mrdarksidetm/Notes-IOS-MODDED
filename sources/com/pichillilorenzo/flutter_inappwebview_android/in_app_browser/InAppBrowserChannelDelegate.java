package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import java.util.HashMap;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(j jVar) {
        super(jVar);
    }

    public void onBrowserCreated() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onBrowserCreated", new HashMap());
    }

    public void onExit() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onExit", new HashMap());
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
        channel.c("onMenuItemClicked", map);
    }
}
