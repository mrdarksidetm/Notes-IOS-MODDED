package g5;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class p0 implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f11474c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f5.u f11476b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f5.u f11477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f11478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f5.t f11479c;

        a(f5.u uVar, WebView webView, f5.t tVar) {
            this.f11477a = uVar;
            this.f11478b = webView;
            this.f11479c = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11477a.onRenderProcessUnresponsive(this.f11478b, this.f11479c);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f5.u f11481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f11482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f5.t f11483c;

        b(f5.u uVar, WebView webView, f5.t tVar) {
            this.f11481a = uVar;
            this.f11482b = webView;
            this.f11483c = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11481a.onRenderProcessResponsive(this.f11482b, this.f11483c);
        }
    }

    public p0(Executor executor, f5.u uVar) {
        this.f11475a = executor;
        this.f11476b = uVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f11474c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        androidx.webkit.internal.n nVarC = androidx.webkit.internal.n.c(invocationHandler);
        f5.u uVar = this.f11476b;
        Executor executor = this.f11475a;
        if (executor == null) {
            uVar.onRenderProcessResponsive(webView, nVarC);
        } else {
            executor.execute(new b(uVar, webView, nVarC));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        androidx.webkit.internal.n nVarC = androidx.webkit.internal.n.c(invocationHandler);
        f5.u uVar = this.f11476b;
        Executor executor = this.f11475a;
        if (executor == null) {
            uVar.onRenderProcessUnresponsive(webView, nVarC);
        } else {
            executor.execute(new a(uVar, webView, nVarC));
        }
    }
}
