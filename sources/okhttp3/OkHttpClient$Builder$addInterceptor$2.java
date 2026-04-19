package okhttp3;

import ae.r;
import okhttp3.Interceptor;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l<Interceptor.Chain, Response> f16944a;

    @Override // okhttp3.Interceptor
    public final Response a(Interceptor.Chain chain) {
        r.f(chain, "chain");
        return this.f16944a.invoke(chain);
    }
}
