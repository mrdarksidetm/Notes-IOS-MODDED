package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import f5.q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewAssetLoaderExt implements Disposable {
    public List<PathHandlerExt> customPathHandlers;
    public q loader;

    public static class PathHandlerExt implements q.d, Disposable {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f9083id;

        public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.f9083id = str;
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + str));
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                pathHandlerExtChannelDelegate.dispose();
                this.channelDelegate = null;
            }
        }

        @Override // f5.q.d
        public WebResourceResponse handle(String str) {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                try {
                    WebResourceResponseExt webResourceResponseExtHandle = pathHandlerExtChannelDelegate.handle(str);
                    if (webResourceResponseExtHandle != null) {
                        String contentType = webResourceResponseExtHandle.getContentType();
                        String contentEncoding = webResourceResponseExtHandle.getContentEncoding();
                        byte[] data = webResourceResponseExtHandle.getData();
                        Map<String, String> headers = webResourceResponseExtHandle.getHeaders();
                        Integer statusCode = webResourceResponseExtHandle.getStatusCode();
                        String reasonPhrase = webResourceResponseExtHandle.getReasonPhrase();
                        ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                        return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                    }
                } catch (InterruptedException e10) {
                    Log.e(LOG_TAG, "", e10);
                }
            }
            return null;
        }
    }

    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
        private PathHandlerExt pathHandler;

        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return WebResourceResponseExt.fromMap((Map) obj);
            }
        }

        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return new HandleCallback().decodeResult(obj);
            }
        }

        public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, j jVar) {
            super(jVar);
            this.pathHandler = pathHandlerExt;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }

        public WebResourceResponseExt handle(String str) {
            j channel = getChannel();
            if (channel == null) {
                return null;
            }
            SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            HashMap map = new HashMap();
            map.put("path", str);
            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", map, syncHandleCallback);
        }

        public void handle(String str, HandleCallback handleCallback) {
            j channel = getChannel();
            if (channel == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("path", str);
            channel.d("handle", map, handleCallback);
        }
    }

    public WebViewAssetLoaderExt(q qVar, List<PathHandlerExt> list) {
        this.loader = qVar;
        this.customPathHandlers = list;
    }

    public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
        q.d fVar;
        if (map == null) {
            return null;
        }
        q.b bVar = new q.b();
        String str = (String) map.get("domain");
        Boolean bool = (Boolean) map.get("httpAllowed");
        List<Map> list = (List) map.get("pathHandlers");
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            bVar.c(str);
        }
        if (bool != null) {
            bVar.d(bool.booleanValue());
        }
        if (list != null) {
            for (Map map2 : list) {
                String str2 = (String) map2.get("type");
                String str3 = (String) map2.get("path");
                if (str2 != null && str3 != null) {
                    switch (str2) {
                        case "ResourcesPathHandler":
                            fVar = new q.f(context);
                            break;
                        case "AssetsPathHandler":
                            fVar = new q.a(context);
                            break;
                        case "InternalStoragePathHandler":
                            String str4 = (String) map2.get("directory");
                            if (str4 == null) {
                                break;
                            } else {
                                fVar = new q.c(context, new File(str4));
                                break;
                            }
                            break;
                        default:
                            String str5 = (String) map2.get("id");
                            if (str5 == null) {
                                continue;
                                break;
                            } else {
                                PathHandlerExt pathHandlerExt = new PathHandlerExt(str5, inAppWebViewFlutterPlugin);
                                bVar.a(str3, pathHandlerExt);
                                arrayList.add(pathHandlerExt);
                                break;
                            }
                            break;
                    }
                    bVar.a(str3, fVar);
                }
            }
        }
        return new WebViewAssetLoaderExt(bVar.b(), arrayList);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        Iterator<PathHandlerExt> it = this.customPathHandlers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.customPathHandlers.clear();
    }
}
