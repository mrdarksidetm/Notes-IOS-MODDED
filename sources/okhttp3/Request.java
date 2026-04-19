package okhttp3;

import ae.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.v;
import md.s;
import nd.r0;
import nd.u;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes2.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpUrl f16955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Headers f16957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestBody f16958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Object> f16959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CacheControl f16960f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HttpUrl f16961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Headers.Builder f16963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RequestBody f16964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<Class<?>, Object> f16965e;

        public Builder() {
            this.f16965e = new LinkedHashMap();
            this.f16962b = "GET";
            this.f16963c = new Headers.Builder();
        }

        public Builder(Request request) {
            r.f(request, "request");
            this.f16965e = new LinkedHashMap();
            this.f16961a = request.j();
            this.f16962b = request.h();
            this.f16964d = request.a();
            this.f16965e = request.c().isEmpty() ? new LinkedHashMap<>() : r0.v(request.c());
            this.f16963c = request.f().l();
        }

        public Builder a(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            d().a(str, str2);
            return this;
        }

        public Request b() {
            HttpUrl httpUrl = this.f16961a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f16962b, this.f16963c.e(), this.f16964d, Util.V(this.f16965e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder c(CacheControl cacheControl) {
            r.f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? i("Cache-Control") : f("Cache-Control", string);
        }

        public final Headers.Builder d() {
            return this.f16963c;
        }

        public final Map<Class<?>, Object> e() {
            return this.f16965e;
        }

        public Builder f(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            d().i(str, str2);
            return this;
        }

        public Builder g(Headers headers) {
            r.f(headers, "headers");
            k(headers.l());
            return this;
        }

        public Builder h(String str, RequestBody requestBody) {
            r.f(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (!(true ^ HttpMethod.e(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            l(str);
            j(requestBody);
            return this;
        }

        public Builder i(String str) {
            r.f(str, "name");
            d().h(str);
            return this;
        }

        public final void j(RequestBody requestBody) {
            this.f16964d = requestBody;
        }

        public final void k(Headers.Builder builder) {
            r.f(builder, "<set-?>");
            this.f16963c = builder;
        }

        public final void l(String str) {
            r.f(str, "<set-?>");
            this.f16962b = str;
        }

        public final void m(Map<Class<?>, Object> map) {
            r.f(map, "<set-?>");
            this.f16965e = map;
        }

        public final void n(HttpUrl httpUrl) {
            this.f16961a = httpUrl;
        }

        public <T> Builder o(Class<? super T> cls, T t10) {
            r.f(cls, "type");
            if (t10 == null) {
                e().remove(cls);
            } else {
                if (e().isEmpty()) {
                    m(new LinkedHashMap());
                }
                Map<Class<?>, Object> mapE = e();
                T tCast = cls.cast(t10);
                r.c(tCast);
                mapE.put(cls, tCast);
            }
            return this;
        }

        public Builder p(String str) {
            String strSubstring;
            String str2;
            r.f(str, "url");
            if (!v.E(str, "ws:", true)) {
                if (v.E(str, "wss:", true)) {
                    strSubstring = str.substring(4);
                    r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    str2 = "https:";
                }
                return q(HttpUrl.f16833k.d(str));
            }
            strSubstring = str.substring(3);
            r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            str2 = "http:";
            str = r.m(str2, strSubstring);
            return q(HttpUrl.f16833k.d(str));
        }

        public Builder q(HttpUrl httpUrl) {
            r.f(httpUrl, "url");
            n(httpUrl);
            return this;
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        r.f(httpUrl, "url");
        r.f(str, "method");
        r.f(headers, "headers");
        r.f(map, "tags");
        this.f16955a = httpUrl;
        this.f16956b = str;
        this.f16957c = headers;
        this.f16958d = requestBody;
        this.f16959e = map;
    }

    public final RequestBody a() {
        return this.f16958d;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.f16960f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlB = CacheControl.f16659n.b(this.f16957c);
        this.f16960f = cacheControlB;
        return cacheControlB;
    }

    public final Map<Class<?>, Object> c() {
        return this.f16959e;
    }

    public final String d(String str) {
        r.f(str, "name");
        return this.f16957c.a(str);
    }

    public final List<String> e(String str) {
        r.f(str, "name");
        return this.f16957c.o(str);
    }

    public final Headers f() {
        return this.f16957c;
    }

    public final boolean g() {
        return this.f16955a.i();
    }

    public final String h() {
        return this.f16956b;
    }

    public final Builder i() {
        return new Builder(this);
    }

    public final HttpUrl j() {
        return this.f16955a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(h());
        sb2.append(", url=");
        sb2.append(j());
        if (f().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (s<? extends String, ? extends String> sVar : f()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u.w();
                }
                s<? extends String, ? extends String> sVar2 = sVar;
                String strA = sVar2.a();
                String strB = sVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(c());
        }
        sb2.append('}');
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
