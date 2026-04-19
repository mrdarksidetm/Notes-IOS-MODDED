package okhttp3;

import ae.r;
import okhttp3.Interceptor;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Interceptor$Companion$invoke$1 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l<Interceptor.Chain, Response> f16855a;

    @Override // okhttp3.Interceptor
    public final Response a(Interceptor.Chain chain) {
        r.f(chain, "it");
        return this.f16855a.invoke(chain);
    }
}
