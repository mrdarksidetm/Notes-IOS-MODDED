package g5;

import android.net.Uri;
import android.webkit.WebView;
import f5.r;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r.b f11464a;

    public h0(r.b bVar) {
        this.f11464a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        f5.l lVarC = androidx.webkit.internal.j.c((WebMessageBoundaryInterface) nf.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (lVarC != null) {
            this.f11464a.onPostMessage(webView, lVarC, uri, z10, androidx.webkit.internal.c.c(invocationHandler2));
        }
    }
}
