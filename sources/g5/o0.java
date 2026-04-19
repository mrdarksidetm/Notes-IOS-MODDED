package g5;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class o0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f11473a;

    public o0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f11473a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // g5.n0
    public String[] a() {
        return this.f11473a.getSupportedFeatures();
    }

    @Override // g5.n0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) nf.a.a(WebViewProviderBoundaryInterface.class, this.f11473a.createWebView(webView));
    }

    @Override // g5.n0
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) nf.a.a(ProxyControllerBoundaryInterface.class, this.f11473a.getProxyController());
    }

    @Override // g5.n0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) nf.a.a(ServiceWorkerControllerBoundaryInterface.class, this.f11473a.getServiceWorkerController());
    }

    @Override // g5.n0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) nf.a.a(StaticsBoundaryInterface.class, this.f11473a.getStatics());
    }

    @Override // g5.n0
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) nf.a.a(TracingControllerBoundaryInterface.class, this.f11473a.getTracingController());
    }

    @Override // g5.n0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) nf.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f11473a.getWebkitToCompatConverter());
    }
}
