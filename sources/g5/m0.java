package g5;

import android.net.Uri;
import f5.r;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f11472a;

    public m0(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f11472a = webViewProviderBoundaryInterface;
    }

    public e0 a(String str, String[] strArr) {
        return e0.a(this.f11472a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, r.b bVar) {
        this.f11472a.addWebMessageListener(str, strArr, nf.a.c(new h0(bVar)));
    }

    public f5.m[] c() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.f11472a.createWebMessageChannel();
        f5.m[] mVarArr = new f5.m[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i10 = 0; i10 < invocationHandlerArrCreateWebMessageChannel.length; i10++) {
            mVarArr[i10] = new androidx.webkit.internal.k(invocationHandlerArrCreateWebMessageChannel[i10]);
        }
        return mVarArr;
    }

    public void d(f5.l lVar, Uri uri) {
        this.f11472a.postMessageToMainFrame(nf.a.c(new androidx.webkit.internal.j(lVar)), uri);
    }

    public void e(Executor executor, f5.u uVar) {
        this.f11472a.setWebViewRendererClient(uVar != null ? nf.a.c(new p0(executor, uVar)) : null);
    }
}
