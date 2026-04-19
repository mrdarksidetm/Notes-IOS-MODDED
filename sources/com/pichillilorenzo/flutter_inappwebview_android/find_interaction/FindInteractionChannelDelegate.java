package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import java.util.HashMap;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, j jVar) {
        super(jVar);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i10, int i11, boolean z10) {
        FindInteractionController findInteractionController;
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z10 && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i11, i10);
        }
        HashMap map = new HashMap();
        map.put("activeMatchOrdinal", Integer.valueOf(i10));
        map.put("numberOfMatches", Integer.valueOf(i11));
        map.put("isDoneCounting", Boolean.valueOf(z10));
        channel.c("onFindResultReceived", map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Object map;
        FindSession findSession;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "getSearchText":
                FindInteractionController findInteractionController = this.findInteractionController;
                map = findInteractionController != null ? findInteractionController.searchText : Boolean.FALSE;
                dVar.success(map);
                break;
            case "findAll":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) iVar.a("find"));
                }
                map = Boolean.TRUE;
                dVar.success(map);
                break;
            case "findNext":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) iVar.a("forward")).booleanValue());
                }
                map = Boolean.TRUE;
                dVar.success(map);
                break;
            case "setSearchText":
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 != null) {
                    findInteractionController2.searchText = (String) iVar.a("searchText");
                    map = Boolean.TRUE;
                    dVar.success(map);
                    break;
                }
                dVar.success(map);
                break;
            case "clearMatches":
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                map = Boolean.TRUE;
                dVar.success(map);
                break;
            case "getActiveFindSession":
                FindInteractionController findInteractionController4 = this.findInteractionController;
                map = (findInteractionController4 == null || (findSession = findInteractionController4.activeFindSession) == null) ? null : findSession.toMap();
                dVar.success(map);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
