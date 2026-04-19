package g5;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import f5.m;
import f5.r;

/* JADX INFO: loaded from: classes.dex */
public class b {

    class a extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.a f11456a;

        a(m.a aVar) {
            this.f11456a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f11456a.onMessage(new androidx.webkit.internal.k(webMessagePort), androidx.webkit.internal.k.h(webMessage));
        }
    }

    /* JADX INFO: renamed from: g5.b$b, reason: collision with other inner class name */
    class C0274b extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.a f11457a;

        C0274b(m.a aVar) {
            this.f11457a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f11457a.onMessage(new androidx.webkit.internal.k(webMessagePort), androidx.webkit.internal.k.h(webMessage));
        }
    }

    class c extends WebView.VisualStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.a f11458a;

        c(r.a aVar) {
            this.f11458a = aVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            this.f11458a.onComplete(j10);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(f5.l lVar) {
        return new WebMessage(lVar.c(), androidx.webkit.internal.k.g(lVar.d()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static f5.l d(WebMessage webMessage) {
        return new f5.l(webMessage.getData(), androidx.webkit.internal.k.k(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, r.a aVar) {
        webView.postVisualStateCallback(j10, new c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, m.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, m.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C0274b(aVar), handler);
    }
}
