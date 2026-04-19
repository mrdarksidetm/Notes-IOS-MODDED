package okhttp3;

import ae.j;
import ae.r;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f16813a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EventListener f16814b = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public interface Factory {
        EventListener a(Call call);
    }

    public void A(Call call, Response response) {
        r.f(call, "call");
        r.f(response, "response");
    }

    public void B(Call call, Handshake handshake) {
        r.f(call, "call");
    }

    public void C(Call call) {
        r.f(call, "call");
    }

    public void a(Call call, Response response) {
        r.f(call, "call");
        r.f(response, "cachedResponse");
    }

    public void b(Call call, Response response) {
        r.f(call, "call");
        r.f(response, "response");
    }

    public void c(Call call) {
        r.f(call, "call");
    }

    public void d(Call call) {
        r.f(call, "call");
    }

    public void e(Call call, IOException iOException) {
        r.f(call, "call");
        r.f(iOException, "ioe");
    }

    public void f(Call call) {
        r.f(call, "call");
    }

    public void g(Call call) {
        r.f(call, "call");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        r.f(call, "call");
        r.f(inetSocketAddress, "inetSocketAddress");
        r.f(proxy, "proxy");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        r.f(call, "call");
        r.f(inetSocketAddress, "inetSocketAddress");
        r.f(proxy, "proxy");
        r.f(iOException, "ioe");
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        r.f(call, "call");
        r.f(inetSocketAddress, "inetSocketAddress");
        r.f(proxy, "proxy");
    }

    public void k(Call call, Connection connection) {
        r.f(call, "call");
        r.f(connection, "connection");
    }

    public void l(Call call, Connection connection) {
        r.f(call, "call");
        r.f(connection, "connection");
    }

    public void m(Call call, String str, List<InetAddress> list) {
        r.f(call, "call");
        r.f(str, "domainName");
        r.f(list, "inetAddressList");
    }

    public void n(Call call, String str) {
        r.f(call, "call");
        r.f(str, "domainName");
    }

    public void o(Call call, HttpUrl httpUrl, List<Proxy> list) {
        r.f(call, "call");
        r.f(httpUrl, "url");
        r.f(list, "proxies");
    }

    public void p(Call call, HttpUrl httpUrl) {
        r.f(call, "call");
        r.f(httpUrl, "url");
    }

    public void q(Call call, long j10) {
        r.f(call, "call");
    }

    public void r(Call call) {
        r.f(call, "call");
    }

    public void s(Call call, IOException iOException) {
        r.f(call, "call");
        r.f(iOException, "ioe");
    }

    public void t(Call call, Request request) {
        r.f(call, "call");
        r.f(request, "request");
    }

    public void u(Call call) {
        r.f(call, "call");
    }

    public void v(Call call, long j10) {
        r.f(call, "call");
    }

    public void w(Call call) {
        r.f(call, "call");
    }

    public void x(Call call, IOException iOException) {
        r.f(call, "call");
        r.f(iOException, "ioe");
    }

    public void y(Call call, Response response) {
        r.f(call, "call");
        r.f(response, "response");
    }

    public void z(Call call) {
        r.f(call, "call");
    }
}
