package g5;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends ServiceWorkerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5.g f11459a;

    public b0(f5.g gVar) {
        this.f11459a = gVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f11459a.shouldInterceptRequest(webResourceRequest);
    }
}
