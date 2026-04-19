package okhttp3.internal.http;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HttpMethod f17268a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean b(String str) {
        r.f(str, "method");
        return (r.b(str, "GET") || r.b(str, "HEAD")) ? false : true;
    }

    public static final boolean e(String str) {
        r.f(str, "method");
        return r.b(str, "POST") || r.b(str, "PUT") || r.b(str, "PATCH") || r.b(str, "PROPPATCH") || r.b(str, "REPORT");
    }

    public final boolean a(String str) {
        r.f(str, "method");
        return r.b(str, "POST") || r.b(str, "PATCH") || r.b(str, "PUT") || r.b(str, "DELETE") || r.b(str, "MOVE");
    }

    public final boolean c(String str) {
        r.f(str, "method");
        return !r.b(str, "PROPFIND");
    }

    public final boolean d(String str) {
        r.f(str, "method");
        return r.b(str, "PROPFIND");
    }
}
