package okhttp3;

import ae.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class Address {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dns f16608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f16609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f16610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f16611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CertificatePinner f16612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Authenticator f16613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f16614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f16615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HttpUrl f16616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<Protocol> f16617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<ConnectionSpec> f16618k;

    public Address(String str, int i10, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        r.f(str, "uriHost");
        r.f(dns, "dns");
        r.f(socketFactory, "socketFactory");
        r.f(authenticator, "proxyAuthenticator");
        r.f(list, "protocols");
        r.f(list2, "connectionSpecs");
        r.f(proxySelector, "proxySelector");
        this.f16608a = dns;
        this.f16609b = socketFactory;
        this.f16610c = sSLSocketFactory;
        this.f16611d = hostnameVerifier;
        this.f16612e = certificatePinner;
        this.f16613f = authenticator;
        this.f16614g = proxy;
        this.f16615h = proxySelector;
        this.f16616i = new HttpUrl.Builder().v(sSLSocketFactory != null ? "https" : "http").l(str).r(i10).a();
        this.f16617j = Util.U(list);
        this.f16618k = Util.U(list2);
    }

    public final CertificatePinner a() {
        return this.f16612e;
    }

    public final List<ConnectionSpec> b() {
        return this.f16618k;
    }

    public final Dns c() {
        return this.f16608a;
    }

    public final boolean d(Address address) {
        r.f(address, "that");
        return r.b(this.f16608a, address.f16608a) && r.b(this.f16613f, address.f16613f) && r.b(this.f16617j, address.f16617j) && r.b(this.f16618k, address.f16618k) && r.b(this.f16615h, address.f16615h) && r.b(this.f16614g, address.f16614g) && r.b(this.f16610c, address.f16610c) && r.b(this.f16611d, address.f16611d) && r.b(this.f16612e, address.f16612e) && this.f16616i.l() == address.f16616i.l();
    }

    public final HostnameVerifier e() {
        return this.f16611d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (r.b(this.f16616i, address.f16616i) && d(address)) {
                return true;
            }
        }
        return false;
    }

    public final List<Protocol> f() {
        return this.f16617j;
    }

    public final Proxy g() {
        return this.f16614g;
    }

    public final Authenticator h() {
        return this.f16613f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f16616i.hashCode()) * 31) + this.f16608a.hashCode()) * 31) + this.f16613f.hashCode()) * 31) + this.f16617j.hashCode()) * 31) + this.f16618k.hashCode()) * 31) + this.f16615h.hashCode()) * 31) + Objects.hashCode(this.f16614g)) * 31) + Objects.hashCode(this.f16610c)) * 31) + Objects.hashCode(this.f16611d)) * 31) + Objects.hashCode(this.f16612e);
    }

    public final ProxySelector i() {
        return this.f16615h;
    }

    public final SocketFactory j() {
        return this.f16609b;
    }

    public final SSLSocketFactory k() {
        return this.f16610c;
    }

    public final HttpUrl l() {
        return this.f16616i;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f16616i.h());
        sb2.append(':');
        sb2.append(this.f16616i.l());
        sb2.append(", ");
        Object obj = this.f16614g;
        if (obj != null) {
            str = "proxy=";
        } else {
            obj = this.f16615h;
            str = "proxySelector=";
        }
        sb2.append(r.m(str, obj));
        sb2.append('}');
        return sb2.toString();
    }
}
