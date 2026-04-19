package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import androidx.browser.customtabs.a;
import java.util.List;
import java.util.Map;
import y.b;
import y.c;

/* JADX INFO: loaded from: classes2.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public c builder;

    private void prepareCustomTabs() {
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
        this.builder.c(c0032a.a());
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.b(this.customSettings.additionalTrustedOrigins);
        }
        y.a aVar = this.customSettings.displayMode;
        if (aVar != null) {
            this.builder.d(aVar);
        }
        this.builder.e(this.customSettings.screenOrientation.intValue());
    }

    private void prepareCustomTabsIntent(b bVar) {
        Intent intentA = bVar.a();
        String packageNameToUse = this.customSettings.packageName;
        if (packageNameToUse == null) {
            packageNameToUse = CustomTabsHelper.getPackageNameToUse(this);
        }
        intentA.setPackage(packageNameToUse);
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, intentA);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            androidx.browser.customtabs.c.c(intentA);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri uri = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new c(uri);
        prepareCustomTabs();
        b bVarA = this.builder.a(this.customTabsSession);
        prepareCustomTabsIntent(bVarA);
        CustomTabActivityHelper.openTrustedWebActivity(this, bVarA, uri, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
