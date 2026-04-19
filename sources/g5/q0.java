package g5;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f5.u f11485a;

    public q0(f5.u uVar) {
        this.f11485a = uVar;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f11485a.onRenderProcessResponsive(webView, androidx.webkit.internal.n.b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f11485a.onRenderProcessUnresponsive(webView, androidx.webkit.internal.n.b(webViewRenderProcess));
    }
}
