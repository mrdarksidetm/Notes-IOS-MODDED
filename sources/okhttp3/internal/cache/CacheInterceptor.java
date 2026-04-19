package okhttp3.internal.cache;

import ae.j;
import ae.r;
import hf.c;
import hf.d;
import hf.e;
import hf.g0;
import hf.i0;
import hf.j0;
import hf.u;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import je.v;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f17032b = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f17033a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String strF = headers.f(i11);
                String strN = headers.n(i11);
                if ((!v.t("Warning", strF, true) || !v.G(strN, "1", false, 2, null)) && (d(strF) || !e(strF) || headers2.a(strF) == null)) {
                    builder.c(strF, strN);
                }
                i11 = i12;
            }
            int size2 = headers2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String strF2 = headers2.f(i10);
                if (!d(strF2) && e(strF2)) {
                    builder.c(strF2, headers2.n(i10));
                }
                i10 = i13;
            }
            return builder.e();
        }

        private final boolean d(String str) {
            return v.t("Content-Length", str, true) || v.t("Content-Encoding", str, true) || v.t("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (v.t("Connection", str, true) || v.t("Keep-Alive", str, true) || v.t("Proxy-Authenticate", str, true) || v.t("Proxy-Authorization", str, true) || v.t("TE", str, true) || v.t("Trailers", str, true) || v.t("Transfer-Encoding", str, true) || v.t("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response f(Response response) {
            return (response == null ? null : response.a()) != null ? response.M().b(null).c() : response;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f17033a = cache;
    }

    private final Response b(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        g0 g0VarB = cacheRequest.b();
        ResponseBody responseBodyA = response.a();
        r.c(responseBodyA);
        final e eVarL = responseBodyA.l();
        final d dVarC = u.c(g0VarB);
        i0 i0Var = new i0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f17034a;

            @Override // hf.i0
            public long X(c cVar, long j10) throws IOException {
                r.f(cVar, "sink");
                try {
                    long jX = eVarL.X(cVar, j10);
                    if (jX != -1) {
                        cVar.G(dVarC.d(), cVar.size() - jX, jX);
                        dVarC.s();
                        return jX;
                    }
                    if (!this.f17034a) {
                        this.f17034a = true;
                        dVarC.close();
                    }
                    return -1L;
                } catch (IOException e10) {
                    if (!this.f17034a) {
                        this.f17034a = true;
                        cacheRequest.a();
                    }
                    throw e10;
                }
            }

            @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.f17034a && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f17034a = true;
                    cacheRequest.a();
                }
                eVarL.close();
            }

            @Override // hf.i0
            public j0 e() {
                return eVarL.e();
            }
        };
        return response.M().b(new RealResponseBody(Response.E(response, "Content-Type", null, 2, null), response.a().a(), u.d(i0Var))).c();
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        ResponseBody responseBodyA;
        ResponseBody responseBodyA2;
        r.f(chain, "chain");
        Call call = chain.call();
        Cache cache = this.f17033a;
        Response responseB = cache == null ? null : cache.b(chain.b());
        CacheStrategy cacheStrategyB = new CacheStrategy.Factory(System.currentTimeMillis(), chain.b(), responseB).b();
        Request requestB = cacheStrategyB.b();
        Response responseA = cacheStrategyB.a();
        Cache cache2 = this.f17033a;
        if (cache2 != null) {
            cache2.G(cacheStrategyB);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        EventListener eventListenerN = realCall != null ? realCall.n() : null;
        if (eventListenerN == null) {
            eventListenerN = EventListener.f16814b;
        }
        if (responseB != null && responseA == null && (responseBodyA2 = responseB.a()) != null) {
            Util.l(responseBodyA2);
        }
        if (requestB == null && responseA == null) {
            Response responseC = new Response.Builder().s(chain.b()).q(Protocol.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(Util.f17023c).t(-1L).r(System.currentTimeMillis()).c();
            eventListenerN.A(call, responseC);
            return responseC;
        }
        if (requestB == null) {
            r.c(responseA);
            Response responseC2 = responseA.M().d(f17032b.f(responseA)).c();
            eventListenerN.b(call, responseC2);
            return responseC2;
        }
        if (responseA != null) {
            eventListenerN.a(call, responseA);
        } else if (this.f17033a != null) {
            eventListenerN.c(call);
        }
        try {
            Response responseA2 = chain.a(requestB);
            if (responseA2 == null && responseB != null && responseBodyA != null) {
            }
            if (responseA != null) {
                boolean z10 = false;
                if (responseA2 != null && responseA2.w() == 304) {
                    z10 = true;
                }
                if (z10) {
                    Response.Builder builderM = responseA.M();
                    Companion companion = f17032b;
                    Response responseC3 = builderM.l(companion.c(responseA.G(), responseA2.G())).t(responseA2.Z()).r(responseA2.U()).d(companion.f(responseA)).o(companion.f(responseA2)).c();
                    ResponseBody responseBodyA3 = responseA2.a();
                    r.c(responseBodyA3);
                    responseBodyA3.close();
                    Cache cache3 = this.f17033a;
                    r.c(cache3);
                    cache3.E();
                    this.f17033a.H(responseA, responseC3);
                    eventListenerN.b(call, responseC3);
                    return responseC3;
                }
                ResponseBody responseBodyA4 = responseA.a();
                if (responseBodyA4 != null) {
                    Util.l(responseBodyA4);
                }
            }
            r.c(responseA2);
            Response.Builder builderM2 = responseA2.M();
            Companion companion2 = f17032b;
            Response responseC4 = builderM2.d(companion2.f(responseA)).o(companion2.f(responseA2)).c();
            if (this.f17033a != null) {
                if (HttpHeaders.b(responseC4) && CacheStrategy.f17038c.a(responseC4, requestB)) {
                    Response responseB2 = b(this.f17033a.w(responseC4), responseC4);
                    if (responseA != null) {
                        eventListenerN.c(call);
                    }
                    return responseB2;
                }
                if (HttpMethod.f17268a.a(requestB.h())) {
                    try {
                        this.f17033a.y(requestB);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseC4;
        } finally {
            if (responseB != null && (responseBodyA = responseB.a()) != null) {
                Util.l(responseBodyA);
            }
        }
    }
}
