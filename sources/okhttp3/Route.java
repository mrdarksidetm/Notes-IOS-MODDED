package okhttp3;

import ae.r;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class Route {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Address f17010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f17011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f17012c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        r.f(address, "address");
        r.f(proxy, "proxy");
        r.f(inetSocketAddress, "socketAddress");
        this.f17010a = address;
        this.f17011b = proxy;
        this.f17012c = inetSocketAddress;
    }

    public final Address a() {
        return this.f17010a;
    }

    public final Proxy b() {
        return this.f17011b;
    }

    public final boolean c() {
        return this.f17010a.k() != null && this.f17011b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f17012c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (r.b(route.f17010a, this.f17010a) && r.b(route.f17011b, this.f17011b) && r.b(route.f17012c, this.f17012c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f17010a.hashCode()) * 31) + this.f17011b.hashCode()) * 31) + this.f17012c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f17012c + '}';
    }
}
