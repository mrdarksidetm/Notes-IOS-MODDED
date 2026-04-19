package g5;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class x {
    @Deprecated
    public static int a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void e(WebView webView, f5.u uVar) {
        webView.setWebViewRenderProcessClient(uVar != null ? new q0(uVar) : null);
    }

    public static void f(WebView webView, Executor executor, f5.u uVar) {
        webView.setWebViewRenderProcessClient(executor, uVar != null ? new q0(uVar) : null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
