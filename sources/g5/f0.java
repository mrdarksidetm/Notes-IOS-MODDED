package g5;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements ServiceWorkerClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5.g f11462a;

    public f0(f5.g gVar) {
        this.f11462a = gVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f11462a.shouldInterceptRequest(webResourceRequest);
    }
}
