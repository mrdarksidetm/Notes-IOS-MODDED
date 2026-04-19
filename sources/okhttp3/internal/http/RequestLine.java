package okhttp3.internal.http;

import ae.r;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RequestLine f17281a = new RequestLine();

    private RequestLine() {
    }

    private final boolean b(Request request, Proxy.Type type) {
        return !request.g() && type == Proxy.Type.HTTP;
    }

    public final String a(Request request, Proxy.Type type) {
        r.f(request, "request");
        r.f(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.h());
        sb2.append(' ');
        RequestLine requestLine = f17281a;
        boolean zB = requestLine.b(request, type);
        HttpUrl httpUrlJ = request.j();
        if (zB) {
            sb2.append(httpUrlJ);
        } else {
            sb2.append(requestLine.c(httpUrlJ));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(HttpUrl httpUrl) {
        r.f(httpUrl, "url");
        String strD = httpUrl.d();
        String strF = httpUrl.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + ((Object) strF);
    }
}
