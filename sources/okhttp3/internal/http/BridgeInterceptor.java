package okhttp3.internal.http;

import ae.r;
import hf.o;
import java.util.List;
import je.v;
import nd.u;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CookieJar f17260a;

    public BridgeInterceptor(CookieJar cookieJar) {
        r.f(cookieJar, "cookieJar");
        this.f17260a = cookieJar;
    }

    private final String b(List<Cookie> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.w();
            }
            Cookie cookie = (Cookie) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.i());
            sb2.append('=');
            sb2.append(cookie.n());
            i10 = i11;
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        ResponseBody responseBodyA;
        r.f(chain, "chain");
        Request requestB = chain.b();
        Request.Builder builderI = requestB.i();
        RequestBody requestBodyA = requestB.a();
        if (requestBodyA != null) {
            MediaType mediaTypeB = requestBodyA.b();
            if (mediaTypeB != null) {
                builderI.f("Content-Type", mediaTypeB.toString());
            }
            long jA = requestBodyA.a();
            if (jA != -1) {
                builderI.f("Content-Length", String.valueOf(jA));
                builderI.i("Transfer-Encoding");
            } else {
                builderI.f("Transfer-Encoding", "chunked");
                builderI.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (requestB.d("Host") == null) {
            builderI.f("Host", Util.T(requestB.j(), false, 1, null));
        }
        if (requestB.d("Connection") == null) {
            builderI.f("Connection", "Keep-Alive");
        }
        if (requestB.d("Accept-Encoding") == null && requestB.d("Range") == null) {
            builderI.f("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<Cookie> listB = this.f17260a.b(requestB.j());
        if (!listB.isEmpty()) {
            builderI.f("Cookie", b(listB));
        }
        if (requestB.d("User-Agent") == null) {
            builderI.f("User-Agent", "okhttp/4.11.0");
        }
        Response responseA = chain.a(builderI.b());
        HttpHeaders.f(this.f17260a, requestB.j(), responseA.G());
        Response.Builder builderS = responseA.M().s(requestB);
        if (z10 && v.t("gzip", Response.E(responseA, "Content-Encoding", null, 2, null), true) && HttpHeaders.b(responseA) && (responseBodyA = responseA.a()) != null) {
            o oVar = new o(responseBodyA.l());
            builderS.l(responseA.G().l().h("Content-Encoding").h("Content-Length").e());
            builderS.b(new RealResponseBody(Response.E(responseA, "Content-Type", null, 2, null), -1L, hf.u.d(oVar)));
        }
        return builderS.c();
    }
}
