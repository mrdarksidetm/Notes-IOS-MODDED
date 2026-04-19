package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.a;
import f5.t;
import g5.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class n extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<WebViewRenderProcess, n> f4994c = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<WebViewRenderProcess> f4996b;

    class a implements Callable<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f4997a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f4997a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new n(this.f4997a);
        }
    }

    public n(WebViewRenderProcess webViewRenderProcess) {
        this.f4996b = new WeakReference<>(webViewRenderProcess);
    }

    public n(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f4995a = webViewRendererBoundaryInterface;
    }

    public static n b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, n> weakHashMap = f4994c;
        n nVar = weakHashMap.get(webViewRenderProcess);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, nVar2);
        return nVar2;
    }

    public static n c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) nf.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (n) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // f5.t
    public boolean a() {
        a.h hVar = m.K;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcess = this.f4996b.get();
            return webViewRenderProcess != null && x.g(webViewRenderProcess);
        }
        if (hVar.d()) {
            return this.f4995a.terminate();
        }
        throw m.a();
    }
}
