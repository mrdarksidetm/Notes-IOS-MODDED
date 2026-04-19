package g5;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f11486a;

    public r0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f11486a = webkitToCompatConverterBoundaryInterface;
    }

    public a0 a(CookieManager cookieManager) {
        return new a0((WebViewCookieManagerBoundaryInterface) nf.a.a(WebViewCookieManagerBoundaryInterface.class, this.f11486a.convertCookieManager(cookieManager)));
    }

    public SafeBrowsingResponse b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f11486a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler c(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f11486a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public ServiceWorkerWebSettings d(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f11486a.convertServiceWorkerSettings(invocationHandler);
    }

    public InvocationHandler e(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f11486a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public k0 f(WebSettings webSettings) {
        return new k0((WebSettingsBoundaryInterface) nf.a.a(WebSettingsBoundaryInterface.class, this.f11486a.convertSettings(webSettings)));
    }

    public WebMessagePort g(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f11486a.convertWebMessagePort(invocationHandler);
    }

    public InvocationHandler h(WebMessagePort webMessagePort) {
        return this.f11486a.convertWebMessagePort(webMessagePort);
    }

    public WebResourceError i(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f11486a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler j(WebResourceError webResourceError) {
        return this.f11486a.convertWebResourceError(webResourceError);
    }

    public j0 k(WebResourceRequest webResourceRequest) {
        return new j0((WebResourceRequestBoundaryInterface) nf.a.a(WebResourceRequestBoundaryInterface.class, this.f11486a.convertWebResourceRequest(webResourceRequest)));
    }
}
