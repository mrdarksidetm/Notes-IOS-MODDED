package okhttp3;

import ae.j;
import ae.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion E = new Companion(null);
    private static final List<Protocol> F = Util.v(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> G = Util.v(ConnectionSpec.f16772i, ConnectionSpec.f16774k);
    private final int A;
    private final int B;
    private final long C;
    private final RouteDatabase D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dispatcher f16892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionPool f16893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Interceptor> f16894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Interceptor> f16895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EventListener.Factory f16896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Authenticator f16898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f16899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f16900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CookieJar f16901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Cache f16902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Dns f16903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Proxy f16904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProxySelector f16905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Authenticator f16906o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SocketFactory f16907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SSLSocketFactory f16908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final X509TrustManager f16909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<ConnectionSpec> f16910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<Protocol> f16911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HostnameVerifier f16912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final CertificatePinner f16913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CertificateChainCleaner f16914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f16915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f16916y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f16917z;

    public static final class Builder {
        private int A;
        private int B;
        private long C;
        private RouteDatabase D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Dispatcher f16918a = new Dispatcher();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConnectionPool f16919b = new ConnectionPool();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Interceptor> f16920c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Interceptor> f16921d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private EventListener.Factory f16922e = Util.g(EventListener.f16814b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16923f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Authenticator f16924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f16925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f16926i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CookieJar f16927j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Cache f16928k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Dns f16929l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f16930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f16931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Authenticator f16932o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f16933p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f16934q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f16935r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<ConnectionSpec> f16936s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<? extends Protocol> f16937t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f16938u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private CertificatePinner f16939v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private CertificateChainCleaner f16940w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f16941x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f16942y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f16943z;

        public Builder() {
            Authenticator authenticator = Authenticator.f16620b;
            this.f16924g = authenticator;
            this.f16925h = true;
            this.f16926i = true;
            this.f16927j = CookieJar.f16800b;
            this.f16929l = Dns.f16811b;
            this.f16932o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            r.e(socketFactory, "getDefault()");
            this.f16933p = socketFactory;
            Companion companion = OkHttpClient.E;
            this.f16936s = companion.a();
            this.f16937t = companion.b();
            this.f16938u = OkHostnameVerifier.f17612a;
            this.f16939v = CertificatePinner.f16684d;
            this.f16942y = 10000;
            this.f16943z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final SocketFactory A() {
            return this.f16933p;
        }

        public final SSLSocketFactory B() {
            return this.f16934q;
        }

        public final int C() {
            return this.A;
        }

        public final X509TrustManager D() {
            return this.f16935r;
        }

        public final Authenticator a() {
            return this.f16924g;
        }

        public final Cache b() {
            return this.f16928k;
        }

        public final int c() {
            return this.f16941x;
        }

        public final CertificateChainCleaner d() {
            return this.f16940w;
        }

        public final CertificatePinner e() {
            return this.f16939v;
        }

        public final int f() {
            return this.f16942y;
        }

        public final ConnectionPool g() {
            return this.f16919b;
        }

        public final List<ConnectionSpec> h() {
            return this.f16936s;
        }

        public final CookieJar i() {
            return this.f16927j;
        }

        public final Dispatcher j() {
            return this.f16918a;
        }

        public final Dns k() {
            return this.f16929l;
        }

        public final EventListener.Factory l() {
            return this.f16922e;
        }

        public final boolean m() {
            return this.f16925h;
        }

        public final boolean n() {
            return this.f16926i;
        }

        public final HostnameVerifier o() {
            return this.f16938u;
        }

        public final List<Interceptor> p() {
            return this.f16920c;
        }

        public final long q() {
            return this.C;
        }

        public final List<Interceptor> r() {
            return this.f16921d;
        }

        public final int s() {
            return this.B;
        }

        public final List<Protocol> t() {
            return this.f16937t;
        }

        public final Proxy u() {
            return this.f16930m;
        }

        public final Authenticator v() {
            return this.f16932o;
        }

        public final ProxySelector w() {
            return this.f16931n;
        }

        public final int x() {
            return this.f16943z;
        }

        public final boolean y() {
            return this.f16923f;
        }

        public final RouteDatabase z() {
            return this.D;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final List<ConnectionSpec> a() {
            return OkHttpClient.G;
        }

        public final List<Protocol> b() {
            return OkHttpClient.F;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OkHttpClient(okhttp3.OkHttpClient.Builder r4) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    private final void I() {
        boolean z10;
        if (!(!this.f16894c.contains(null))) {
            throw new IllegalStateException(r.m("Null interceptor: ", v()).toString());
        }
        if (!(!this.f16895d.contains(null))) {
            throw new IllegalStateException(r.m("Null network interceptor: ", x()).toString());
        }
        List<ConnectionSpec> list = this.f16910s;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (!z10) {
            if (this.f16908q == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f16914w == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f16909r == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f16908q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f16914w == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f16909r == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!r.b(this.f16913v, CertificatePinner.f16684d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final List<Protocol> A() {
        return this.f16911t;
    }

    public final Proxy B() {
        return this.f16904m;
    }

    public final Authenticator C() {
        return this.f16906o;
    }

    public final ProxySelector D() {
        return this.f16905n;
    }

    public final int E() {
        return this.f16917z;
    }

    public final boolean F() {
        return this.f16897f;
    }

    public final SocketFactory G() {
        return this.f16907p;
    }

    public final SSLSocketFactory H() {
        SSLSocketFactory sSLSocketFactory = this.f16908q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int J() {
        return this.A;
    }

    @Override // okhttp3.Call.Factory
    public Call b(Request request) {
        r.f(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final Authenticator e() {
        return this.f16898g;
    }

    public final Cache f() {
        return this.f16902k;
    }

    public final int g() {
        return this.f16915x;
    }

    public final CertificatePinner h() {
        return this.f16913v;
    }

    public final int i() {
        return this.f16916y;
    }

    public final ConnectionPool j() {
        return this.f16893b;
    }

    public final List<ConnectionSpec> k() {
        return this.f16910s;
    }

    public final CookieJar m() {
        return this.f16901j;
    }

    public final Dispatcher n() {
        return this.f16892a;
    }

    public final Dns p() {
        return this.f16903l;
    }

    public final EventListener.Factory q() {
        return this.f16896e;
    }

    public final boolean r() {
        return this.f16899h;
    }

    public final boolean s() {
        return this.f16900i;
    }

    public final RouteDatabase t() {
        return this.D;
    }

    public final HostnameVerifier u() {
        return this.f16912u;
    }

    public final List<Interceptor> v() {
        return this.f16894c;
    }

    public final List<Interceptor> x() {
        return this.f16895d;
    }

    public final int z() {
        return this.B;
    }
}
