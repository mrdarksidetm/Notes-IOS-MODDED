package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.a.a.o.b;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import f5.p;
import f5.r;
import f5.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public InAppWebViewSettings customSettings;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public Object f9084id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts;
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale;

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21, reason: invalid class name */
    static /* synthetic */ class AnonymousClass21 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class DownloadStartListener implements DownloadListener {
        DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j10, URLUtil.guessFileName(str, str3, str4), null);
            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }

    public InAppWebView(Context context) {
        super(context);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.f9084id = obj;
        this.channelDelegate = new WebViewChannelDelegate(this, new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        Activity activity = inAppWebViewFlutterPlugin.activity;
        if (activity != null) {
            activity.registerForContextMenu(this);
        }
    }

    @Deprecated
    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
            }
        });
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(hitTestResultFromWebViewHitTestResult);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void addWebMessageListener(WebMessageListener webMessageListener) {
        if (s.a("WEB_MESSAGE_LISTENER")) {
            r.b(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                        return;
                    }
                    int i10 = InAppWebView.this.contextMenuPoint.x;
                    int i11 = (int) (((double) (Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext()))) + (((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d));
                    InAppWebView.this.contextMenuPoint.y = i11;
                    InAppWebView.this.onFloatingActionGlobalLayout(i10, i11);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String string = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(string, valueCallback);
        }
        Iterator<String> itKeys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String strJoin = TextUtils.join(", ", arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, strJoin).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, string).replace(PluginScriptsUtil.VAR_RESULT_UUID, string), contentWorld), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @Deprecated
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createCompatWebMessageChannel() {
        String string = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(string, this);
        this.webMessageChannels.put(string, webMessageChannel);
        return webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel webMessageChannelCreateCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(webMessageChannelCreateCompatWebMessageChannel);
        return webMessageChannelCreateCompatWebMessageChannel;
    }

    public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
        PackageInfo packageInfoF = r.f(getContext());
        if (packageInfoF == null) {
            Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        boolean z10 = false;
        boolean z11 = "com.android.webview".equals(packageInfoF.packageName) || "com.google.android.webview".equals(packageInfoF.packageName) || "com.android.chrome".equals(packageInfoF.packageName);
        if (z11) {
            String str = packageInfoF.versionName;
            if (str == null) {
                str = "";
            }
            try {
                z10 = (str.contains(".") ? Integer.parseInt(str.split("\\.")[0]) : 0) >= 73;
            } catch (NumberFormatException unused) {
            }
        }
        if (z10 || !z11) {
            Log.d(LOG_TAG, "Using InAppWebViewClientCompat implementation");
            return new InAppWebViewClientCompat(inAppBrowserDelegate);
        }
        Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
        return new InAppWebViewClient(inAppBrowserDelegate);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InAppWebViewManager inAppWebViewManager;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        if (Build.VERSION.SDK_INT >= 29 && s.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            r.q(this, null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.20
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        FindInteractionController findInteractionController = this.findInteractionController;
        if (findInteractionController != null) {
            findInteractionController.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null) {
            webViewAssetLoaderExt.dispose();
            this.webViewAssetLoaderExt = null;
        }
        Integer num = this.windowId;
        if (num != null && (inAppWebViewFlutterPlugin = this.plugin) != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
            inAppWebViewManager.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient != null) {
            inAppWebViewRenderProcessClient.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient != null) {
            inAppWebViewChromeClient.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface != null) {
            javaScriptBridgeInterface.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl("about:blank");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageListeners() {
        Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z10, final PluginScript pluginScript) {
        evaluateJavascript("window." + str, null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (!((str2 == null || str2.equalsIgnoreCase("null")) ? false : true)) {
                    if (z10) {
                        InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(pluginScript);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript("window." + str + " = " + z10 + ";", null, null);
                if (z10) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(pluginScript);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        int size = webBackForwardListCopyBackForwardList.getSize();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
            HashMap map = new HashMap();
            map.put("originalUrl", itemAtIndex.getOriginalUrl());
            map.put(b.S, itemAtIndex.getTitle());
            map.put("url", itemAtIndex.getUrl());
            arrayList.add(map);
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("list", arrayList);
        map2.put("currentIndex", Integer.valueOf(currentIndex));
        return map2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getCustomSettings() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Looper getWebViewLooper() {
        return Build.VERSION.SDK_INT >= 28 ? super.getWebViewLooper() : Looper.getMainLooper();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public float getZoomScale() {
        return this.zoomScale;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = "";
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get(b.S);
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = "";
        }
        injectDeferredObject(str, null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);", null);
    }

    public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
        String str3;
        final String strReplace;
        final String string = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String string2 = jSONArray.toString();
            str3 = String.format(str2, string2.substring(1, string2.length() - 1));
        } else {
            str3 = str;
        }
        if (string == null || valueCallback == null) {
            strReplace = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(string, valueCallback);
            strReplace = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, string);
        }
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
            @Override // java.lang.Runnable
            public void run() {
                InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(strReplace, contentWorld), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str4) {
                        ValueCallback valueCallback2;
                        AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                        if (string != null || (valueCallback2 = valueCallback) == null) {
                            return;
                        }
                        valueCallback2.onReceiveValue(str4);
                    }
                });
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String strReplaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + strReplaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + strReplaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + strReplaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @TargetApi(21)
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback2;
                Boolean bool;
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase(b.ag)) {
                    valueCallback2 = valueCallback;
                    bool = Boolean.FALSE;
                } else {
                    valueCallback2 = valueCallback;
                    bool = Boolean.TRUE;
                }
                valueCallback2.onReceiveValue(bool);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadFile(String str) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    boolean zIsAcceptingText;
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        try {
                            zIsAcceptingText = inputMethodManager.isAcceptingText();
                        } catch (Exception unused) {
                            zIsAcceptingText = false;
                        }
                    } else {
                        zIsAcceptingText = false;
                    }
                    View view2 = InAppWebView.this.containerView;
                    if (view2 == null || inputMethodManager == null || zIsAcceptingText) {
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
                }
            }, 128L);
        }
        return inputConnectionOnCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i10, int i11) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i12 = i10 - (width2 / 2);
        if (i12 < 0) {
            i12 = 0;
        } else if (i12 + width2 > width) {
            i12 = width - width2;
        }
        float f10 = i11 - (height * 1.5f);
        if (f10 < 0.0f) {
            f10 = i11 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i12 + getScrollX(), ((int) f10) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i10, i11, z10, z11);
        boolean z12 = canScrollHorizontally() && z10;
        boolean z13 = canScrollVertically() && z11;
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z13 && i11 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z12 || z13) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i10, i11, z12, z13);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i10, i11);
        }
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            adjustFloatingContextMenuPosition();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i10);
        } else if (i10 != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0540 A[LOOP:0: B:167:0x053a->B:169:0x0540, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02df  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepare() {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.prepare():void");
    }

    public void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
        if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public String printCurrentPage(PrintJobSettings printJobSettings) {
        Activity activity;
        PrintAttributes.MediaSize mediaSize;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return null;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return null;
        }
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getTitle() != null ? getTitle() : getUrl());
        sb2.append(" Document");
        String string = sb2.toString();
        if (printJobSettings != null) {
            String str = printJobSettings.jobName;
            if (str != null && !str.isEmpty()) {
                string = printJobSettings.jobName;
            }
            Integer num = printJobSettings.orientation;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                } else if (iIntValue == 1) {
                    mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
                }
                builder.setMediaSize(mediaSize);
            }
            MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
            if (mediaSizeExt != null) {
                builder.setMediaSize(mediaSizeExt.toMediaSize());
            }
            Integer num2 = printJobSettings.colorMode;
            if (num2 != null) {
                builder.setColorMode(num2.intValue());
            }
            Integer num3 = printJobSettings.duplexMode;
            if (num3 != null) {
                builder.setDuplexMode(num3.intValue());
            }
            ResolutionExt resolutionExt = printJobSettings.resolution;
            if (resolutionExt != null) {
                builder.setResolution(resolutionExt.toResolution());
            }
        }
        PrintJob printJobPrint = printManager.print(string, createPrintDocumentAdapter(string), builder.build());
        if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
            return null;
        }
        String string2 = UUID.randomUUID().toString();
        PrintJobController printJobController = new PrintJobController(string2, printJobPrint, printJobSettings, this.plugin);
        this.plugin.printJobManager.jobs.put(printJobController.f9075id, printJobController);
        return string2;
    }

    public ActionMode rebuildActionMode(final ActionMode actionMode, final ActionMode.Callback callback) {
        boolean z10;
        View view;
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        actionMode.hide(3000L);
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu.booleanValue()) {
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, (ViewGroup) this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map<String, Object> map2 = (Map) this.contextMenu.get("settings");
            if (map2 != null) {
                contextMenuSettings.parse2(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String string = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
                textView.setText(string);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        callback.onActionItemClicked(actionMode, menuItem);
                        WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                        if (webViewChannelDelegate != null) {
                            webViewChannelDelegate.onContextMenuActionItemClicked(itemId, string);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int iIntValue = ((Integer) map3.get("id")).intValue();
            final String str = (String) map3.get(b.S);
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InAppWebView.this.hideContextMenu();
                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                    if (webViewChannelDelegate != null) {
                        webViewChannelDelegate.onContextMenuActionItemClicked(iIntValue, str);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i11 = point != null ? point.x : 0;
        final int i12 = point != null ? point.y : 0;
        this.contextMenuPoint = new Point(i11, i12);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                    if (linearLayout4 != null) {
                        linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i11, i12);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i11, i12));
            if (z10) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestFocusNodeHref() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put("src", bundlePeekData.getString("src"));
        map.put("url", bundlePeekData.getString("url"));
        map.put(b.S, bundlePeekData.getString(b.S));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestImageRef() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestImageRef(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put("url", bundlePeekData.getString("url"));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", getScrollX() + num.intValue()), PropertyValuesHolder.ofInt("scrollY", getScrollY() + num2.intValue())).setDuration(300L).start();
        } else {
            scrollBy(num.intValue(), num2.intValue());
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    public void setCacheEnabled(boolean z10) {
        WebSettings settings = getSettings();
        if (!z10) {
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z10) {
        WebSettings settings = getSettings();
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(z10 ? userAgentString.replace("Mobile", "eliboM").replace("Android", "diordnA") : userAgentString.replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z10);
        settings.setLoadWithOverviewMode(z10);
        settings.setSupportZoom(z10);
        settings.setBuiltInZoomControls(z10);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInFullscreen(boolean z10) {
        this.inFullscreen = z10;
    }

    public void setIncognito(boolean z10) {
        WebSettings settings = getSettings();
        if (!z10) {
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
            return;
        }
        CookieManager.getInstance().removeAllCookies(null);
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
        clearHistory();
        clearCache(true);
        clearFormData();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @SuppressLint({"RestrictedApi"})
    public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> map) {
        Map<String, Object> map2;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        WebSettings settings = getSettings();
        if (map.get("javaScriptEnabled") != null) {
            Boolean bool = this.customSettings.javaScriptEnabled;
            Boolean bool2 = inAppWebViewSettings.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (map.get("useShouldInterceptAjaxRequest") != null) {
            Boolean bool3 = this.customSettings.useShouldInterceptAjaxRequest;
            Boolean bool4 = inAppWebViewSettings.useShouldInterceptAjaxRequest;
            if (bool3 != bool4) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("interceptOnlyAsyncAjaxRequests") != null) {
            Boolean bool5 = this.customSettings.interceptOnlyAsyncAjaxRequests;
            Boolean bool6 = inAppWebViewSettings.interceptOnlyAsyncAjaxRequests;
            if (bool5 != bool6) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE, bool6.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
            }
        }
        if (map.get("useShouldInterceptFetchRequest") != null) {
            Boolean bool7 = this.customSettings.useShouldInterceptFetchRequest;
            Boolean bool8 = inAppWebViewSettings.useShouldInterceptFetchRequest;
            if (bool7 != bool8) {
                enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool8.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("useOnLoadResource") != null) {
            Boolean bool9 = this.customSettings.useOnLoadResource;
            Boolean bool10 = inAppWebViewSettings.useOnLoadResource;
            if (bool9 != bool10) {
                enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool10.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool11 = this.customSettings.javaScriptCanOpenWindowsAutomatically;
            Boolean bool12 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically;
            if (bool11 != bool12) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool12.booleanValue());
            }
        }
        if (map.get("builtInZoomControls") != null) {
            Boolean bool13 = this.customSettings.builtInZoomControls;
            Boolean bool14 = inAppWebViewSettings.builtInZoomControls;
            if (bool13 != bool14) {
                settings.setBuiltInZoomControls(bool14.booleanValue());
            }
        }
        if (map.get("displayZoomControls") != null) {
            Boolean bool15 = this.customSettings.displayZoomControls;
            Boolean bool16 = inAppWebViewSettings.displayZoomControls;
            if (bool15 != bool16) {
                settings.setDisplayZoomControls(bool16.booleanValue());
            }
        }
        if (map.get("safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != inAppWebViewSettings.safeBrowsingEnabled) {
            if (s.a("SAFE_BROWSING_ENABLE")) {
                p.q(settings, inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            } else if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            }
        }
        if (map.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool17 = this.customSettings.mediaPlaybackRequiresUserGesture;
            Boolean bool18 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture;
            if (bool17 != bool18) {
                settings.setMediaPlaybackRequiresUserGesture(bool18.booleanValue());
            }
        }
        if (map.get("databaseEnabled") != null) {
            Boolean bool19 = this.customSettings.databaseEnabled;
            Boolean bool20 = inAppWebViewSettings.databaseEnabled;
            if (bool19 != bool20) {
                settings.setDatabaseEnabled(bool20.booleanValue());
            }
        }
        if (map.get("domStorageEnabled") != null) {
            Boolean bool21 = this.customSettings.domStorageEnabled;
            Boolean bool22 = inAppWebViewSettings.domStorageEnabled;
            if (bool21 != bool22) {
                settings.setDomStorageEnabled(bool22.booleanValue());
            }
        }
        if (map.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (map.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
            String str3 = inAppWebViewSettings.userAgent;
            settings.setUserAgentString(((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent) + " " + this.customSettings.applicationNameForUserAgent);
        }
        if (map.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (map.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (map.get("thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != inAppWebViewSettings.thirdPartyCookiesEnabled) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (map.get("useWideViewPort") != null) {
            Boolean bool23 = this.customSettings.useWideViewPort;
            Boolean bool24 = inAppWebViewSettings.useWideViewPort;
            if (bool23 != bool24) {
                settings.setUseWideViewPort(bool24.booleanValue());
            }
        }
        if (map.get("supportZoom") != null) {
            Boolean bool25 = this.customSettings.supportZoom;
            Boolean bool26 = inAppWebViewSettings.supportZoom;
            if (bool25 != bool26) {
                settings.setSupportZoom(bool26.booleanValue());
            }
        }
        if (map.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (map.get("verticalScrollBarEnabled") != null) {
            Boolean bool27 = this.customSettings.verticalScrollBarEnabled;
            Boolean bool28 = inAppWebViewSettings.verticalScrollBarEnabled;
            if (bool27 != bool28) {
                setVerticalScrollBarEnabled(bool28.booleanValue());
            }
        }
        if (map.get("horizontalScrollBarEnabled") != null) {
            Boolean bool29 = this.customSettings.horizontalScrollBarEnabled;
            Boolean bool30 = inAppWebViewSettings.horizontalScrollBarEnabled;
            if (bool29 != bool30) {
                setHorizontalScrollBarEnabled(bool30.booleanValue());
            }
        }
        boolean z10 = false;
        if (map.get("transparentBackground") != null) {
            Boolean bool31 = this.customSettings.transparentBackground;
            Boolean bool32 = inAppWebViewSettings.transparentBackground;
            if (bool31 != bool32) {
                if (bool32.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (map.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (map.get("supportMultipleWindows") != null) {
            Boolean bool33 = this.customSettings.supportMultipleWindows;
            Boolean bool34 = inAppWebViewSettings.supportMultipleWindows;
            if (bool33 != bool34) {
                settings.setSupportMultipleWindows(bool34.booleanValue());
            }
        }
        if (map.get("useOnDownloadStart") != null) {
            Boolean bool35 = this.customSettings.useOnDownloadStart;
            Boolean bool36 = inAppWebViewSettings.useOnDownloadStart;
            if (bool35 != bool36) {
                if (bool36.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (map.get("allowContentAccess") != null) {
            Boolean bool37 = this.customSettings.allowContentAccess;
            Boolean bool38 = inAppWebViewSettings.allowContentAccess;
            if (bool37 != bool38) {
                settings.setAllowContentAccess(bool38.booleanValue());
            }
        }
        if (map.get("allowFileAccess") != null) {
            Boolean bool39 = this.customSettings.allowFileAccess;
            Boolean bool40 = inAppWebViewSettings.allowFileAccess;
            if (bool39 != bool40) {
                settings.setAllowFileAccess(bool40.booleanValue());
            }
        }
        if (map.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool41 = this.customSettings.allowFileAccessFromFileURLs;
            Boolean bool42 = inAppWebViewSettings.allowFileAccessFromFileURLs;
            if (bool41 != bool42) {
                settings.setAllowFileAccessFromFileURLs(bool42.booleanValue());
            }
        }
        if (map.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool43 = this.customSettings.allowUniversalAccessFromFileURLs;
            Boolean bool44 = inAppWebViewSettings.allowUniversalAccessFromFileURLs;
            if (bool43 != bool44) {
                settings.setAllowUniversalAccessFromFileURLs(bool44.booleanValue());
            }
        }
        if (map.get("cacheEnabled") != null) {
            Boolean bool45 = this.customSettings.cacheEnabled;
            Boolean bool46 = inAppWebViewSettings.cacheEnabled;
            if (bool45 != bool46) {
                setCacheEnabled(bool46.booleanValue());
            }
        }
        if (map.get("appCachePath") != null && ((str2 = this.customSettings.appCachePath) == null || !str2.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (map.get("blockNetworkImage") != null) {
            Boolean bool47 = this.customSettings.blockNetworkImage;
            Boolean bool48 = inAppWebViewSettings.blockNetworkImage;
            if (bool47 != bool48) {
                settings.setBlockNetworkImage(bool48.booleanValue());
            }
        }
        if (map.get("blockNetworkLoads") != null) {
            Boolean bool49 = this.customSettings.blockNetworkLoads;
            Boolean bool50 = inAppWebViewSettings.blockNetworkLoads;
            if (bool49 != bool50) {
                settings.setBlockNetworkLoads(bool50.booleanValue());
            }
        }
        if (map.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (map.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (map.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (map.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (map.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (map.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (s.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                p.k(settings, inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            } else {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (map.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (map.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (map.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            if (s.a("FORCE_DARK")) {
                p.m(settings, inAppWebViewSettings.forceDark.intValue());
            } else if (i10 >= 29) {
                settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
            }
        }
        if (map.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && s.a("FORCE_DARK_STRATEGY")) {
            p.n(settings, inAppWebViewSettings.forceDarkStrategy.intValue());
        }
        if (map.get("geolocationEnabled") != null) {
            Boolean bool51 = this.customSettings.geolocationEnabled;
            Boolean bool52 = inAppWebViewSettings.geolocationEnabled;
            if (bool51 != bool52) {
                settings.setGeolocationEnabled(bool52.booleanValue());
            }
        }
        if (map.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewSettings.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
                settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
            }
        }
        if (map.get("loadWithOverviewMode") != null) {
            Boolean bool53 = this.customSettings.loadWithOverviewMode;
            Boolean bool54 = inAppWebViewSettings.loadWithOverviewMode;
            if (bool53 != bool54) {
                settings.setLoadWithOverviewMode(bool54.booleanValue());
            }
        }
        if (map.get("loadsImagesAutomatically") != null) {
            Boolean bool55 = this.customSettings.loadsImagesAutomatically;
            Boolean bool56 = inAppWebViewSettings.loadsImagesAutomatically;
            if (bool55 != bool56) {
                settings.setLoadsImagesAutomatically(bool56.booleanValue());
            }
        }
        if (map.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (map.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (map.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (map.get("needInitialFocus") != null) {
            Boolean bool57 = this.customSettings.needInitialFocus;
            Boolean bool58 = inAppWebViewSettings.needInitialFocus;
            if (bool57 != bool58) {
                settings.setNeedInitialFocus(bool58.booleanValue());
            }
        }
        if (map.get("offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != inAppWebViewSettings.offscreenPreRaster) {
            if (s.a("OFF_SCREEN_PRERASTER")) {
                p.o(settings, inAppWebViewSettings.offscreenPreRaster.booleanValue());
            } else {
                settings.setOffscreenPreRaster(inAppWebViewSettings.offscreenPreRaster.booleanValue());
            }
        }
        if (map.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (map.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (map.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (map.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i11 = AnonymousClass21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i11 == 1) {
                setDesktopMode(true);
            } else if (i11 == 2 || i11 == 3) {
                setDesktopMode(false);
            }
        }
        if (map.get("saveFormData") != null) {
            Boolean bool59 = this.customSettings.saveFormData;
            Boolean bool60 = inAppWebViewSettings.saveFormData;
            if (bool59 != bool60) {
                settings.setSaveFormData(bool60.booleanValue());
            }
        }
        if (map.get("incognito") != null) {
            Boolean bool61 = this.customSettings.incognito;
            Boolean bool62 = inAppWebViewSettings.incognito;
            if (bool61 != bool62) {
                setIncognito(bool62.booleanValue());
            }
        }
        if (this.customSettings.useHybridComposition.booleanValue() && map.get("hardwareAcceleration") != null) {
            Boolean bool63 = this.customSettings.hardwareAcceleration;
            Boolean bool64 = inAppWebViewSettings.hardwareAcceleration;
            if (bool63 != bool64) {
                if (bool64.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(0, null);
                }
            }
        }
        if (map.get("regexToCancelSubFramesLoading") != null && ((str = this.customSettings.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
            if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map3 : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map3.get("trigger")), ContentBlockerAction.fromMap(map3.get("action"))));
            }
        }
        if (map.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (map.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (map.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (map.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (map.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (map.get("disableVerticalScroll") != null) {
            Boolean bool65 = this.customSettings.disableVerticalScroll;
            Boolean bool66 = inAppWebViewSettings.disableVerticalScroll;
            if (bool65 != bool66) {
                setVerticalScrollBarEnabled(!bool66.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (map.get("disableHorizontalScroll") != null) {
            Boolean bool67 = this.customSettings.disableHorizontalScroll;
            Boolean bool68 = inAppWebViewSettings.disableHorizontalScroll;
            if (bool67 != bool68) {
                if (!bool68.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                    z10 = true;
                }
                setHorizontalScrollBarEnabled(z10);
            }
        }
        if (map.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (map.get("networkAvailable") != null) {
            Boolean bool69 = this.customSettings.networkAvailable;
            Boolean bool70 = inAppWebViewSettings.networkAvailable;
            if (bool69 != bool70) {
                setNetworkAvailable(bool70.booleanValue());
            }
        }
        if (map.get("rendererPriorityPolicy") != null && (((map2 = this.customSettings.rendererPriorityPolicy) == null || map2.get("rendererRequestedPriority") != inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            if (map.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
            }
            if (map.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
            }
            if (map.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
            }
            if (map.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (map.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && s.a("ALGORITHMIC_DARKENING") && i12 >= 29) {
            p.j(settings, inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (map.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && s.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            p.l(settings, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (map.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && s.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            p.p(settings, inAppWebViewSettings.requestedWithHeaderOriginAllowList);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt != null) {
                webViewAssetLoaderExt.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setUserContentController(UserContentController userContentController) {
        this.userContentController = userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        Map<String, Object> map;
        return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback, i10) : rebuildActionMode(super.startActionMode(callback, i10), callback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void takeScreenshot(final Map<String, Object> map, final j.d dVar) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
            @Override // java.lang.Runnable
            public void run() {
                Bitmap.CompressFormat compressFormatValueOf;
                Bitmap bitmap;
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    int iIntValue = 100;
                    Map map2 = map;
                    if (map2 != null) {
                        Map map3 = (Map) map2.get("rect");
                        if (map3 != null) {
                            compressFormatValueOf = compressFormat;
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, (int) Math.floor((((Double) map3.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map3.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(bitmapCreateBitmap.getWidth(), (int) Math.floor((((Double) map3.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(bitmapCreateBitmap.getHeight(), (int) Math.floor((((Double) map3.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                        } else {
                            compressFormatValueOf = compressFormat;
                        }
                        Double d10 = (Double) map.get("snapshotWidth");
                        if (d10 != null) {
                            int iFloor = (int) Math.floor((d10.doubleValue() * ((double) pixelDensity)) + 0.5d);
                            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iFloor, (int) (iFloor / (bitmapCreateBitmap.getWidth() / bitmapCreateBitmap.getHeight())), true);
                        }
                        bitmap = bitmapCreateBitmap;
                        try {
                            compressFormatValueOf = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e10) {
                            Log.e(InAppWebView.LOG_TAG, "", e10);
                        }
                        iIntValue = ((Integer) map.get("quality")).intValue();
                    } else {
                        compressFormatValueOf = compressFormat;
                        bitmap = bitmapCreateBitmap;
                    }
                    bitmap.compress(compressFormatValueOf, iIntValue, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(InAppWebView.LOG_TAG, "", e11);
                    }
                    bitmap.recycle();
                    dVar.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e12) {
                    Log.e(InAppWebView.LOG_TAG, "", e12);
                    dVar.success(null);
                }
            }
        });
    }
}
