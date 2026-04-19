package okhttp3.internal.connection;

import ae.j;
import ae.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import nd.t;
import nd.u;
import nd.z;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteSelector {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Companion f17249i = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Address f17250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RouteDatabase f17251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Call f17252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EventListener f17253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<? extends Proxy> f17254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f17256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Route> f17257h;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            r.f(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            r.e(hostAddress, str);
            return hostAddress;
        }
    }

    public static final class Selection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Route> f17258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17259b;

        public Selection(List<Route> list) {
            r.f(list, "routes");
            this.f17258a = list;
        }

        public final List<Route> a() {
            return this.f17258a;
        }

        public final boolean b() {
            return this.f17259b < this.f17258a.size();
        }

        public final Route c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.f17258a;
            int i10 = this.f17259b;
            this.f17259b = i10 + 1;
            return list.get(i10);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        r.f(address, "address");
        r.f(routeDatabase, "routeDatabase");
        r.f(call, "call");
        r.f(eventListener, "eventListener");
        this.f17250a = address;
        this.f17251b = routeDatabase;
        this.f17252c = call;
        this.f17253d = eventListener;
        this.f17254e = u.m();
        this.f17256g = u.m();
        this.f17257h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f17255f < this.f17254e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List<? extends Proxy> list = this.f17254e;
            int i10 = this.f17255f;
            this.f17255f = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f17250a.l().h() + "; exhausted proxy configurations: " + this.f17254e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iL;
        List<InetAddress> listA;
        ArrayList arrayList = new ArrayList();
        this.f17256g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f17250a.l().h();
            iL = this.f17250a.l().l();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(r.m("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass()).toString());
            }
            Companion companion = f17249i;
            r.e(socketAddressAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = companion.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        boolean z10 = false;
        if (1 <= iL && iL < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        if (Util.i(strH)) {
            listA = t.d(InetAddress.getByName(strH));
        } else {
            this.f17253d.n(this.f17252c, strH);
            listA = this.f17250a.c().a(strH);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f17250a.c() + " returned no addresses for " + strH);
            }
            this.f17253d.m(this.f17252c, strH, listA);
        }
        Iterator<InetAddress> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iL));
        }
    }

    private final void f(HttpUrl httpUrl, Proxy proxy) {
        this.f17253d.p(this.f17252c, httpUrl);
        List<Proxy> listG = g(proxy, httpUrl, this);
        this.f17254e = listG;
        this.f17255f = 0;
        this.f17253d.o(this.f17252c, httpUrl, listG);
    }

    private static final List<Proxy> g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return t.d(proxy);
        }
        URI uriQ = httpUrl.q();
        if (uriQ.getHost() == null) {
            return Util.v(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = routeSelector.f17250a.i().select(uriQ);
        if (listSelect == null || listSelect.isEmpty()) {
            return Util.v(Proxy.NO_PROXY);
        }
        r.e(listSelect, "proxiesOrNull");
        return Util.U(listSelect);
    }

    public final boolean a() {
        return b() || (this.f17257h.isEmpty() ^ true);
    }

    public final Selection c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.f17256g.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.f17250a, proxyD, it.next());
                if (this.f17251b.c(route)) {
                    this.f17257h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            z.C(arrayList, this.f17257h);
            this.f17257h.clear();
        }
        return new Selection(arrayList);
    }
}
