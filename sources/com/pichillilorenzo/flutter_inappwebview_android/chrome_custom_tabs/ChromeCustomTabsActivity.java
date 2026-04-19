package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.h;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sc.j;
import x.b;

/* JADX INFO: loaded from: classes2.dex */
public class ChromeCustomTabsActivity extends Activity implements Disposable {
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public c.d builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public h customTabsSession;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f9069id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public CustomTabsSecondaryToolbar secondaryToolbar;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    protected boolean onOpened = false;
    protected boolean onCompletedInitialLoad = false;
    protected boolean isBindSuccess = false;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();

    private PendingIntent createPendingIntent(int i10) {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i10);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f9069id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f9070id : null);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, i10, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    private void prepareCustomTabs() {
        c.d dVar = this.builder;
        if (dVar == null) {
            return;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
        dVar.l(bool != null ? bool.booleanValue() ? 1 : 2 : chromeCustomTabsSettings.shareState.intValue());
        a.C0032a c0032a = new a.C0032a();
        String str = this.customSettings.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            c0032a.e(Color.parseColor(this.customSettings.toolbarBackgroundColor));
        }
        String str2 = this.customSettings.navigationBarColor;
        if (str2 != null && !str2.isEmpty()) {
            c0032a.b(Color.parseColor(this.customSettings.navigationBarColor));
        }
        String str3 = this.customSettings.navigationBarDividerColor;
        if (str3 != null && !str3.isEmpty()) {
            c0032a.c(Color.parseColor(this.customSettings.navigationBarDividerColor));
        }
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            c0032a.d(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        this.builder.e(c0032a.a());
        this.builder.m(this.customSettings.showTitle.booleanValue());
        this.builder.o(this.customSettings.enableUrlBarHiding.booleanValue());
        this.builder.g(this.customSettings.instantAppsEnabled.booleanValue());
        if (this.customSettings.startAnimations.size() == 2) {
            this.builder.n(this, this.customSettings.startAnimations.get(0).getIdentifier(this), this.customSettings.startAnimations.get(1).getIdentifier(this));
        }
        if (this.customSettings.exitAnimations.size() == 2) {
            this.builder.f(this, this.customSettings.exitAnimations.get(0).getIdentifier(this), this.customSettings.exitAnimations.get(1).getIdentifier(this));
        }
        for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            this.builder.a(customTabsMenuItem.getLabel(), createPendingIntent(customTabsMenuItem.getId()));
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            this.builder.c(BitmapFactory.decodeByteArray(icon, 0, icon.length, options), this.actionButton.getDescription(), createPendingIntent(this.actionButton.getId()), this.actionButton.isShouldTint());
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
        if (customTabsSecondaryToolbar != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
            int size = this.secondaryToolbar.getClickableIDs().size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.secondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
            }
            this.builder.h(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
        }
    }

    private void prepareCustomTabsIntent(c cVar) {
        String str = this.customSettings.packageName;
        if (str != null) {
            cVar.f2017a.setPackage(str);
        } else {
            cVar.f2017a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, cVar.f2017a);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            c.c(cVar.f2017a);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }

    public void customTabsConnected() {
        String str;
        h session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                Bundle bundle = new Bundle();
                if (this.customTabsSession.h(bundle)) {
                    this.customTabsSession.m(new b() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
                        @Override // x.b
                        public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i10);
                            }
                        }

                        @Override // x.b
                        public void onSessionEnded(boolean z10, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onSessionEnded(z10);
                            }
                        }

                        @Override // x.b
                        public void onVerticalScrollEvent(boolean z10, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z10);
                            }
                        }
                    }, bundle);
                }
            } catch (Throwable th) {
                Log.d(LOG_TAG, "Custom Tabs Engagement Signals API not supported", th);
            }
        }
        if (!this.isBindSuccess || (str = this.initialUrl) == null) {
            return;
        }
        launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.f9069id)) {
            this.manager.browsers.put(this.f9069id, null);
        }
        this.manager = null;
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f9069id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f9070id : null);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        launchUrlWithSession(this.customTabsSession, str, map, str2, list);
    }

    public void launchUrlWithSession(h hVar, String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new c.d(hVar);
        prepareCustomTabs();
        c cVarB = this.builder.b();
        prepareCustomTabsIntent(cVarB);
        CustomTabActivityHelper.openCustomTab(this, cVarB, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri uri = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                bundle.putString("android.support.customtabs.otherurls.URL", it.next());
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(uri, null, arrayList);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.f9069id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            return;
        }
        chromeSafariBrowserManager.browsers.put(this.f9069id, this);
        this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new j(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.f9069id));
        this.initialUrl = extras.getString("url");
        this.initialHeaders = (Map) extras.getSerializable("headers");
        this.initialReferrer = extras.getString("referrer");
        this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
        ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
        this.customSettings = chromeCustomTabsSettings;
        chromeCustomTabsSettings.parse2((Map<String, Object>) extras.getSerializable("settings"));
        this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
        this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
        Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
        }
        if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
            Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
            String str = this.f9069id;
            map.put(str, str);
        }
        this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity.this.customTabsConnected();
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onServiceConnected();
                }
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                this.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new x.a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
            @Override // x.a
            public void extraCallback(String str2, Bundle bundle2) {
            }

            @Override // x.a
            public void onMessageChannelReady(Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onMessageChannelReady();
                }
            }

            @Override // x.a
            public void onNavigationEvent(int i10, Bundle bundle2) {
                if (i10 == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onOpened) {
                        chromeCustomTabsActivity.onOpened = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onOpened();
                        }
                    }
                }
                if (i10 == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
                        chromeCustomTabsActivity2.onCompletedInitialLoad = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                        if (chromeCustomTabsChannelDelegate2 != null) {
                            chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                        }
                    }
                }
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate3 != null) {
                    chromeCustomTabsChannelDelegate3.onNavigationEvent(i10);
                }
            }

            @Override // x.a
            public void onPostMessage(String str2, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onPostMessage(str2);
                }
            }

            @Override // x.a
            public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i10, uri, z10);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onStart() {
        String str;
        super.onStart();
        boolean zBindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
        this.isBindSuccess = zBindCustomTabsService;
        if (zBindCustomTabsService || (str = this.initialUrl) == null) {
            return;
        }
        launchUrlWithSession(null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession == null || this.actionButton == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        this.customTabsSession.l(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), str);
        this.actionButton.setIcon(bArr);
        this.actionButton.setDescription(str);
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession == null) {
            return;
        }
        AndroidResource layout = customTabsSecondaryToolbar.getLayout();
        RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
        int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
        int size = customTabsSecondaryToolbar.getClickableIDs().size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = customTabsSecondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
        }
        this.customTabsSession.n(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
        this.secondaryToolbar = customTabsSecondaryToolbar;
    }
}
