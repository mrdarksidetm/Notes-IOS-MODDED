package com.pichillilorenzo.flutter_inappwebview_android;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager;
import com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager;
import com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager;
import com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import io.flutter.embedding.android.b;
import jc.a;
import kc.c;
import wc.i;

/* JADX INFO: loaded from: classes2.dex */
public class InAppWebViewFlutterPlugin implements a, kc.a {
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public Activity activity;
    public c activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public a.InterfaceC0330a flutterAssets;
    public b flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewManager inAppWebViewManager;
    public sc.b messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
    public PlatformUtil platformUtil;
    public PrintJobManager printJobManager;
    public ProcessGlobalConfigManager processGlobalConfigManager;
    public ProxyManager proxyManager;
    public ServiceWorkerManager serviceWorkerManager;
    public TracingControllerManager tracingControllerManager;
    public WebViewFeatureManager webViewFeatureManager;

    private void onAttachedToEngine(Context context, sc.b bVar, Activity activity, i iVar, b bVar2) {
        this.applicationContext = context;
        this.activity = activity;
        this.messenger = bVar;
        this.flutterView = bVar2;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        this.noHistoryCustomTabsActivityCallbacks = new NoHistoryCustomTabsActivityCallbacks(this);
        FlutterWebViewFactory flutterWebViewFactory = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory;
        iVar.a(FlutterWebViewFactory.VIEW_TYPE_ID, flutterWebViewFactory);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewManager = new InAppWebViewManager(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        int i10 = Build.VERSION.SDK_INT;
        this.serviceWorkerManager = new ServiceWorkerManager(this);
        if (i10 >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
        this.proxyManager = new ProxyManager(this);
        this.printJobManager = new PrintJobManager(this);
        this.tracingControllerManager = new TracingControllerManager(this);
        this.processGlobalConfigManager = new ProcessGlobalConfigManager(this);
    }

    @Override // kc.a
    public void onAttachedToActivity(c cVar) {
        this.activityPluginBinding = cVar;
        Activity activity = cVar.getActivity();
        this.activity = activity;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.flutterAssets = bVar.c();
        onAttachedToEngine(bVar.a(), bVar.b(), this.activity, bVar.d(), null);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        Activity activity = this.activity;
        if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        Activity activity = this.activity;
        if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        PlatformUtil platformUtil = this.platformUtil;
        if (platformUtil != null) {
            platformUtil.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager = this.inAppBrowserManager;
        if (inAppBrowserManager != null) {
            inAppBrowserManager.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager != null) {
            headlessInAppWebViewManager.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager != null) {
            chromeSafariBrowserManager.dispose();
            this.chromeSafariBrowserManager = null;
        }
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks = this.noHistoryCustomTabsActivityCallbacks;
        if (noHistoryCustomTabsActivityCallbacks != null) {
            noHistoryCustomTabsActivityCallbacks.dispose();
            this.noHistoryCustomTabsActivityCallbacks = null;
        }
        MyCookieManager myCookieManager = this.myCookieManager;
        if (myCookieManager != null) {
            myCookieManager.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage = this.myWebStorage;
        if (myWebStorage != null) {
            myWebStorage.dispose();
            this.myWebStorage = null;
        }
        CredentialDatabaseHandler credentialDatabaseHandler = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler != null && Build.VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewManager inAppWebViewManager = this.inAppWebViewManager;
        if (inAppWebViewManager != null) {
            inAppWebViewManager.dispose();
            this.inAppWebViewManager = null;
        }
        ServiceWorkerManager serviceWorkerManager = this.serviceWorkerManager;
        if (serviceWorkerManager != null) {
            serviceWorkerManager.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager = this.webViewFeatureManager;
        if (webViewFeatureManager != null) {
            webViewFeatureManager.dispose();
            this.webViewFeatureManager = null;
        }
        ProxyManager proxyManager = this.proxyManager;
        if (proxyManager != null) {
            proxyManager.dispose();
            this.proxyManager = null;
        }
        PrintJobManager printJobManager = this.printJobManager;
        if (printJobManager != null) {
            printJobManager.dispose();
            this.printJobManager = null;
        }
        TracingControllerManager tracingControllerManager = this.tracingControllerManager;
        if (tracingControllerManager != null) {
            tracingControllerManager.dispose();
            this.tracingControllerManager = null;
        }
        ProcessGlobalConfigManager processGlobalConfigManager = this.processGlobalConfigManager;
        if (processGlobalConfigManager != null) {
            processGlobalConfigManager.dispose();
            this.processGlobalConfigManager = null;
        }
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.activityPluginBinding = cVar;
        Activity activity = cVar.getActivity();
        this.activity = activity;
        if (this.noHistoryCustomTabsActivityCallbacks != null) {
            activity.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
        }
    }
}
