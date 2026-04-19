package okhttp3.internal.connection;

import ae.r;
import java.io.IOException;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RealConnectionPool f17180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Address f17181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RealCall f17182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EventListener f17183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RouteSelector.Selection f17184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RouteSelector f17185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Route f17189j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        r.f(realConnectionPool, "connectionPool");
        r.f(address, "address");
        r.f(realCall, "call");
        r.f(eventListener, "eventListener");
        this.f17180a = realConnectionPool;
        this.f17181b = address;
        this.f17182c = realCall;
        this.f17183d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.connection.RealConnection b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection realConnectionB = b(i10, i11, i12, i13, z10);
            if (realConnectionB.u(z11)) {
                return realConnectionB;
            }
            realConnectionB.z();
            if (this.f17189j == null) {
                RouteSelector.Selection selection = this.f17184e;
                if (selection == null ? true : selection.b()) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f17185f;
                    if (!(routeSelector != null ? routeSelector.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route f() {
        RealConnection realConnectionM;
        if (this.f17186g > 1 || this.f17187h > 1 || this.f17188i > 0 || (realConnectionM = this.f17182c.m()) == null) {
            return null;
        }
        synchronized (realConnectionM) {
            if (realConnectionM.q() != 0) {
                return null;
            }
            if (Util.j(realConnectionM.A().a().l(), d().l())) {
                return realConnectionM.A();
            }
            return null;
        }
    }

    public final ExchangeCodec a(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        r.f(okHttpClient, "client");
        r.f(realInterceptorChain, "chain");
        try {
            return c(realInterceptorChain.f(), realInterceptorChain.h(), realInterceptorChain.j(), okHttpClient.z(), okHttpClient.F(), !r.b(realInterceptorChain.i().h(), "GET")).w(okHttpClient, realInterceptorChain);
        } catch (IOException e10) {
            h(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            h(e11.c());
            throw e11;
        }
    }

    public final Address d() {
        return this.f17181b;
    }

    public final boolean e() {
        RouteSelector routeSelector;
        boolean z10 = false;
        if (this.f17186g == 0 && this.f17187h == 0 && this.f17188i == 0) {
            return false;
        }
        if (this.f17189j != null) {
            return true;
        }
        Route routeF = f();
        if (routeF != null) {
            this.f17189j = routeF;
            return true;
        }
        RouteSelector.Selection selection = this.f17184e;
        if (selection != null && selection.b()) {
            z10 = true;
        }
        if (z10 || (routeSelector = this.f17185f) == null) {
            return true;
        }
        return routeSelector.a();
    }

    public final boolean g(HttpUrl httpUrl) {
        r.f(httpUrl, "url");
        HttpUrl httpUrlL = this.f17181b.l();
        return httpUrl.l() == httpUrlL.l() && r.b(httpUrl.h(), httpUrlL.h());
    }

    public final void h(IOException iOException) {
        r.f(iOException, "e");
        this.f17189j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f17535a == ErrorCode.REFUSED_STREAM) {
            this.f17186g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f17187h++;
        } else {
            this.f17188i++;
        }
    }
}
