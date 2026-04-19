package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import f5.g;
import f5.h;
import f5.s;
import java.io.ByteArrayInputStream;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static h serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    private static final class DummyServiceWorkerClientCompat extends g {
        static final g INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        @Override // f5.g
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    private g dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && s.a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = h.a();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        h hVar = serviceWorkerController;
        if (hVar != null) {
            hVar.c(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new g() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                @Override // f5.g
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt webResourceResponseExtShouldInterceptRequest;
                    WebResourceRequestExt webResourceRequestExtFromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            webResourceResponseExtShouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(webResourceRequestExtFromWebResourceRequest);
                        } catch (InterruptedException e10) {
                            Log.e(ServiceWorkerManager.LOG_TAG, "", e10);
                            return null;
                        }
                    } else {
                        webResourceResponseExtShouldInterceptRequest = null;
                    }
                    if (webResourceResponseExtShouldInterceptRequest == null) {
                        return null;
                    }
                    String contentType = webResourceResponseExtShouldInterceptRequest.getContentType();
                    String contentEncoding = webResourceResponseExtShouldInterceptRequest.getContentEncoding();
                    byte[] data = webResourceResponseExtShouldInterceptRequest.getData();
                    Map<String, String> headers = webResourceResponseExtShouldInterceptRequest.getHeaders();
                    Integer statusCode = webResourceResponseExtShouldInterceptRequest.getStatusCode();
                    String reasonPhrase = webResourceResponseExtShouldInterceptRequest.getReasonPhrase();
                    ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                    return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                }
            });
        }
    }
}
