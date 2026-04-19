package fd;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import fd.a;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class h implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f11228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f11229c;

    interface a {
        String a(Intent intent);
    }

    h(final Context context) {
        this(context, new a() { // from class: fd.g
            @Override // fd.h.a
            public final String a(Intent intent) {
                return h.w(context, intent);
            }
        });
    }

    h(Context context, a aVar) {
        this.f11227a = context;
        this.f11228b = aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean t(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            byte b10 = 0;
            if (!it.hasNext()) {
                return false;
            }
            String lowerCase = it.next().toLowerCase(Locale.US);
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (!lowerCase.equals("accept")) {
                        b10 = -1;
                    }
                    break;
                case -1229727188:
                    if (!lowerCase.equals("content-language")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 785670158:
                    if (!lowerCase.equals("content-type")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 802785917:
                    if (!lowerCase.equals("accept-language")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return true;
            }
        }
    }

    private void u() {
        if (this.f11229c == null) {
            throw new a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    private static Bundle v(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(Context context, Intent intent) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return null;
        }
        return componentNameResolveActivity.toShortString();
    }

    private static boolean x(Context context, Uri uri, Bundle bundle, a.C0270a c0270a) {
        androidx.browser.customtabs.c cVarB = new c.d().m(c0270a.b().booleanValue()).b();
        cVarB.f2017a.putExtra("com.android.browser.headers", bundle);
        try {
            cVarB.b(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // fd.a.d
    public Boolean e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f11228b.a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // fd.a.d
    public Boolean g(String str, Boolean bool, a.e eVar, a.C0270a c0270a) {
        u();
        Bundle bundleV = v(eVar.d());
        if (bool.booleanValue() && !t(eVar.d())) {
            if (x(this.f11229c, Uri.parse(str), bundleV, c0270a)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f11229c.startActivity(WebViewActivity.a(this.f11229c, str, eVar.c().booleanValue(), eVar.b().booleanValue(), bundleV));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // fd.a.d
    public Boolean h() {
        return Boolean.valueOf(androidx.browser.customtabs.b.c(this.f11227a, Collections.emptyList()) != null);
    }

    @Override // fd.a.d
    public void m() {
        this.f11227a.sendBroadcast(new Intent("close action"));
    }

    @Override // fd.a.d
    public Boolean n(String str, Map<String, String> map) {
        u();
        try {
            this.f11229c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", v(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    void y(Activity activity) {
        this.f11229c = activity;
    }
}
