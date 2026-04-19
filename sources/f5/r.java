package f5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.internal.a;
import g5.l0;
import g5.m0;
import g5.n0;
import g5.x;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f11157a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f11158b = Uri.parse("");

    public interface a {
        void onComplete(long j10);
    }

    public interface b {
        void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, f5.b bVar);
    }

    public static f a(WebView webView, String str, Set<String> set) {
        if (androidx.webkit.internal.m.V.d()) {
            return j(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw androidx.webkit.internal.m.a();
    }

    public static void b(WebView webView, String str, Set<String> set, b bVar) {
        if (!androidx.webkit.internal.m.U.d()) {
            throw androidx.webkit.internal.m.a();
        }
        j(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return g().createWebView(webView);
    }

    public static m[] d(WebView webView) {
        a.b bVar = androidx.webkit.internal.m.E;
        if (bVar.c()) {
            return androidx.webkit.internal.k.k(g5.b.c(webView));
        }
        if (bVar.d()) {
            return j(webView).c();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return g5.i.a();
        }
        try {
            return h();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo f(Context context) {
        PackageInfo packageInfoE = e();
        return packageInfoE != null ? packageInfoE : i(context);
    }

    private static n0 g() {
        return l0.d();
    }

    private static PackageInfo h() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static PackageInfo i(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static m0 j(WebView webView) {
        return new m0(c(webView));
    }

    public static Uri k() {
        a.f fVar = androidx.webkit.internal.m.f4976j;
        if (fVar.c()) {
            return g5.m.b();
        }
        if (fVar.d()) {
            return g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static String l() {
        if (androidx.webkit.internal.m.X.d()) {
            return g().getStatics().getVariationsHeader();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static boolean m() {
        if (androidx.webkit.internal.m.R.d()) {
            return g().getStatics().isMultiProcessEnabled();
        }
        throw androidx.webkit.internal.m.a();
    }

    public static void n(WebView webView, l lVar, Uri uri) {
        if (f11157a.equals(uri)) {
            uri = f11158b;
        }
        a.b bVar = androidx.webkit.internal.m.F;
        if (bVar.c() && lVar.e() == 0) {
            g5.b.j(webView, androidx.webkit.internal.k.f(lVar), uri);
        } else {
            if (!bVar.d() || !androidx.webkit.internal.j.a(lVar.e())) {
                throw androidx.webkit.internal.m.a();
            }
            j(webView).d(lVar, uri);
        }
    }

    public static void o(Set<String> set, ValueCallback<Boolean> valueCallback) {
        a.f fVar = androidx.webkit.internal.m.f4975i;
        a.f fVar2 = androidx.webkit.internal.m.f4974h;
        if (fVar.d()) {
            g().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.c()) {
            g5.m.d(arrayList, valueCallback);
        } else {
            if (!fVar2.d()) {
                throw androidx.webkit.internal.m.a();
            }
            g().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void p(List<String> list, ValueCallback<Boolean> valueCallback) {
        o(new HashSet(list), valueCallback);
    }

    public static void q(WebView webView, u uVar) {
        a.h hVar = androidx.webkit.internal.m.O;
        if (hVar.c()) {
            x.e(webView, uVar);
        } else {
            if (!hVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            j(webView).e(null, uVar);
        }
    }

    public static void r(Context context, ValueCallback<Boolean> valueCallback) {
        a.f fVar = androidx.webkit.internal.m.f4969e;
        if (fVar.c()) {
            g5.m.f(context, valueCallback);
        } else {
            if (!fVar.d()) {
                throw androidx.webkit.internal.m.a();
            }
            g().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
