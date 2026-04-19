package okhttp3.internal.connection;

import ae.r;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f17157a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        r.f(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.d(realInterceptorChain, 0, realInterceptorChain.e().t(realInterceptorChain), null, 0, 0, 0, 61, null).a(realInterceptorChain.i());
    }
}
