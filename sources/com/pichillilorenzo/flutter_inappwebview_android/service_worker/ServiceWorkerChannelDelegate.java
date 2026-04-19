package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import f5.h;
import f5.s;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, j jVar) {
        super(jVar);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        f5.i iVarB;
        boolean zA;
        Object objValueOf;
        ServiceWorkerManager.init();
        h hVar = ServiceWorkerManager.serviceWorkerController;
        iVarB = hVar != null ? hVar.b() : null;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "getAllowContentAccess":
                if (iVarB != null && s.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    zA = iVarB.a();
                    objValueOf = Boolean.valueOf(zA);
                    dVar.success(objValueOf);
                    break;
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) iVar.a("isNull"));
                    objValueOf = Boolean.TRUE;
                    dVar.success(objValueOf);
                    break;
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case "getCacheMode":
                if (iVarB != null && s.a("SERVICE_WORKER_CACHE_MODE")) {
                    objValueOf = Integer.valueOf(iVarB.d());
                    dVar.success(objValueOf);
                    break;
                } else {
                    dVar.success(null);
                    break;
                }
                break;
            case "getAllowFileAccess":
                if (iVarB != null && s.a("SERVICE_WORKER_FILE_ACCESS")) {
                    zA = iVarB.b();
                    objValueOf = Boolean.valueOf(zA);
                    dVar.success(objValueOf);
                    break;
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            case "setCacheMode":
                if (iVarB != null && s.a("SERVICE_WORKER_CACHE_MODE")) {
                    iVarB.h(((Integer) iVar.a("mode")).intValue());
                }
                objValueOf = Boolean.TRUE;
                dVar.success(objValueOf);
                break;
            case "setBlockNetworkLoads":
                if (iVarB != null && s.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    iVarB.g(((Boolean) iVar.a("flag")).booleanValue());
                }
                objValueOf = Boolean.TRUE;
                dVar.success(objValueOf);
                break;
            case "setAllowContentAccess":
                if (iVarB != null && s.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    iVarB.e(((Boolean) iVar.a("allow")).booleanValue());
                }
                objValueOf = Boolean.TRUE;
                dVar.success(objValueOf);
                break;
            case "setAllowFileAccess":
                if (iVarB != null && s.a("SERVICE_WORKER_FILE_ACCESS")) {
                    iVarB.f(((Boolean) iVar.a("allow")).booleanValue());
                }
                objValueOf = Boolean.TRUE;
                dVar.success(objValueOf);
                break;
            case "getBlockNetworkLoads":
                if (iVarB != null && s.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    zA = iVarB.c();
                    objValueOf = Boolean.valueOf(zA);
                    dVar.success(objValueOf);
                    break;
                }
                objValueOf = Boolean.FALSE;
                dVar.success(objValueOf);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        j channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        j channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.d("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }
}
