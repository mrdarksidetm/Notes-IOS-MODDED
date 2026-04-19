package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.HashMap;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, j jVar) {
        super(jVar);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Object objValueOf;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "setSlingshotDistance":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) iVar.a("slingshotDistance")).intValue());
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "setRefreshing":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setRefreshing(((Boolean) iVar.a("refreshing")).booleanValue());
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "getDefaultSlingshotDistance":
                objValueOf = -1;
                dVar.success(objValueOf);
                break;
            case "setEnabled":
                if (this.pullToRefreshView != null) {
                    Boolean bool = (Boolean) iVar.a("enabled");
                    PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
                    pullToRefreshLayout.settings.enabled = bool;
                    pullToRefreshLayout.setEnabled(bool.booleanValue());
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "setColor":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) iVar.a("color")));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "setBackgroundColor":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) iVar.a("color")));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "setDistanceToTriggerSync":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) iVar.a("distanceToTriggerSync")).intValue());
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "isRefreshing":
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                objValueOf = Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing());
                dVar.success(objValueOf);
                break;
            case "setSize":
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setSize(((Integer) iVar.a("size")).intValue());
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                dVar.success(objValueOf);
                break;
            case "isEnabled":
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                objValueOf = pullToRefreshLayout3 != null ? Boolean.valueOf(pullToRefreshLayout3.isEnabled()) : Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }

    public void onRefresh() {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.c("onRefresh", new HashMap());
    }
}
