package okhttp3;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.Closeable;
import java.util.List;
import nd.u;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Request f16975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Protocol f16976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handshake f16979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Headers f16980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ResponseBody f16981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Response f16982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Response f16983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Response f16984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f16985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f16986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Exchange f16987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CacheControl f16988n;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Request f16989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Protocol f16990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f16992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handshake f16993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Headers.Builder f16994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ResponseBody f16995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Response f16996h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Response f16997i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Response f16998j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f16999k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f17000l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Exchange f17001m;

        public Builder() {
            this.f16991c = -1;
            this.f16994f = new Headers.Builder();
        }

        public Builder(Response response) {
            r.f(response, "response");
            this.f16991c = -1;
            this.f16989a = response.Y();
            this.f16990b = response.Q();
            this.f16991c = response.w();
            this.f16992d = response.I();
            this.f16993e = response.A();
            this.f16994f = response.G().l();
            this.f16995g = response.a();
            this.f16996h = response.L();
            this.f16997i = response.l();
            this.f16998j = response.P();
            this.f16999k = response.Z();
            this.f17000l = response.U();
            this.f17001m = response.y();
        }

        private final void e(Response response) {
            if (response == null) {
                return;
            }
            if (!(response.a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(String str, Response response) {
            if (response == null) {
                return;
            }
            if (!(response.a() == null)) {
                throw new IllegalArgumentException(r.m(str, ".body != null").toString());
            }
            if (!(response.L() == null)) {
                throw new IllegalArgumentException(r.m(str, ".networkResponse != null").toString());
            }
            if (!(response.l() == null)) {
                throw new IllegalArgumentException(r.m(str, ".cacheResponse != null").toString());
            }
            if (!(response.P() == null)) {
                throw new IllegalArgumentException(r.m(str, ".priorResponse != null").toString());
            }
        }

        public final void A(Response response) {
            this.f16996h = response;
        }

        public final void B(Response response) {
            this.f16998j = response;
        }

        public final void C(Protocol protocol) {
            this.f16990b = protocol;
        }

        public final void D(long j10) {
            this.f17000l = j10;
        }

        public final void E(Request request) {
            this.f16989a = request;
        }

        public final void F(long j10) {
            this.f16999k = j10;
        }

        public Builder a(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            i().a(str, str2);
            return this;
        }

        public Builder b(ResponseBody responseBody) {
            u(responseBody);
            return this;
        }

        public Response c() {
            int i10 = this.f16991c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(r.m("code < 0: ", Integer.valueOf(h())).toString());
            }
            Request request = this.f16989a;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f16990b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f16992d;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.f16993e, this.f16994f.e(), this.f16995g, this.f16996h, this.f16997i, this.f16998j, this.f16999k, this.f17000l, this.f17001m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public Builder d(Response response) {
            f("cacheResponse", response);
            v(response);
            return this;
        }

        public Builder g(int i10) {
            w(i10);
            return this;
        }

        public final int h() {
            return this.f16991c;
        }

        public final Headers.Builder i() {
            return this.f16994f;
        }

        public Builder j(Handshake handshake) {
            x(handshake);
            return this;
        }

        public Builder k(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            i().i(str, str2);
            return this;
        }

        public Builder l(Headers headers) {
            r.f(headers, "headers");
            y(headers.l());
            return this;
        }

        public final void m(Exchange exchange) {
            r.f(exchange, "deferredTrailers");
            this.f17001m = exchange;
        }

        public Builder n(String str) {
            r.f(str, "message");
            z(str);
            return this;
        }

        public Builder o(Response response) {
            f("networkResponse", response);
            A(response);
            return this;
        }

        public Builder p(Response response) {
            e(response);
            B(response);
            return this;
        }

        public Builder q(Protocol protocol) {
            r.f(protocol, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
            C(protocol);
            return this;
        }

        public Builder r(long j10) {
            D(j10);
            return this;
        }

        public Builder s(Request request) {
            r.f(request, "request");
            E(request);
            return this;
        }

        public Builder t(long j10) {
            F(j10);
            return this;
        }

        public final void u(ResponseBody responseBody) {
            this.f16995g = responseBody;
        }

        public final void v(Response response) {
            this.f16997i = response;
        }

        public final void w(int i10) {
            this.f16991c = i10;
        }

        public final void x(Handshake handshake) {
            this.f16993e = handshake;
        }

        public final void y(Headers.Builder builder) {
            r.f(builder, "<set-?>");
            this.f16994f = builder;
        }

        public final void z(String str) {
            this.f16992d = str;
        }
    }

    public Response(Request request, Protocol protocol, String str, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        r.f(request, "request");
        r.f(protocol, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
        r.f(str, "message");
        r.f(headers, "headers");
        this.f16975a = request;
        this.f16976b = protocol;
        this.f16977c = str;
        this.f16978d = i10;
        this.f16979e = handshake;
        this.f16980f = headers;
        this.f16981g = responseBody;
        this.f16982h = response;
        this.f16983i = response2;
        this.f16984j = response3;
        this.f16985k = j10;
        this.f16986l = j11;
        this.f16987m = exchange;
    }

    public static /* synthetic */ String E(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.C(str, str2);
    }

    public final Handshake A() {
        return this.f16979e;
    }

    public final String C(String str, String str2) {
        r.f(str, "name");
        String strA = this.f16980f.a(str);
        return strA == null ? str2 : strA;
    }

    public final Headers G() {
        return this.f16980f;
    }

    public final boolean H() {
        int i10 = this.f16978d;
        return 200 <= i10 && i10 < 300;
    }

    public final String I() {
        return this.f16977c;
    }

    public final Response L() {
        return this.f16982h;
    }

    public final Builder M() {
        return new Builder(this);
    }

    public final Response P() {
        return this.f16984j;
    }

    public final Protocol Q() {
        return this.f16976b;
    }

    public final long U() {
        return this.f16986l;
    }

    public final Request Y() {
        return this.f16975a;
    }

    public final long Z() {
        return this.f16985k;
    }

    public final ResponseBody a() {
        return this.f16981g;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.f16988n;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlB = CacheControl.f16659n.b(this.f16980f);
        this.f16988n = cacheControlB;
        return cacheControlB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f16981g;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final Response l() {
        return this.f16983i;
    }

    public final List<Challenge> o() {
        String str;
        Headers headers = this.f16980f;
        int i10 = this.f16978d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return u.m();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.a(headers, str);
    }

    public String toString() {
        return "Response{protocol=" + this.f16976b + ", code=" + this.f16978d + ", message=" + this.f16977c + ", url=" + this.f16975a.j() + '}';
    }

    public final int w() {
        return this.f16978d;
    }

    public final Exchange y() {
        return this.f16987m;
    }
}
