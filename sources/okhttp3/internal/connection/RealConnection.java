package okhttp3.internal.connection;

import ae.j;
import ae.r;
import hf.d;
import hf.e;
import hf.j0;
import hf.u;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import je.o;
import je.v;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Companion f17213t = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RealConnectionPool f17214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Route f17215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f17216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f17217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handshake f17218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Protocol f17219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Http2Connection f17220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f17221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f17222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<Reference<RealCall>> f17229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f17230s;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17231a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f17231a = iArr;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        r.f(realConnectionPool, "connectionPool");
        r.f(route, "route");
        this.f17214c = realConnectionPool;
        this.f17215d = route;
        this.f17228q = 1;
        this.f17229r = new ArrayList();
        this.f17230s = Long.MAX_VALUE;
    }

    private final boolean B(List<Route> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.b().type() == Proxy.Type.DIRECT && this.f17215d.b().type() == Proxy.Type.DIRECT && r.b(this.f17215d.d(), route.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void F(int i10) throws SocketException {
        Socket socket = this.f17217f;
        r.c(socket);
        e eVar = this.f17221j;
        r.c(eVar);
        d dVar = this.f17222k;
        r.c(dVar);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionA = new Http2Connection.Builder(true, TaskRunner.f17146i).s(socket, this.f17215d.a().l().h(), eVar, dVar).k(this).l(i10).a();
        this.f17220i = http2ConnectionA;
        this.f17228q = Http2Connection.C.a().d();
        Http2Connection.J0(http2ConnectionA, false, null, 3, null);
    }

    private final boolean G(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        HttpUrl httpUrlL = this.f17215d.a().l();
        if (httpUrl.l() != httpUrlL.l()) {
            return false;
        }
        if (r.b(httpUrl.h(), httpUrlL.h())) {
            return true;
        }
        if (this.f17224m || (handshake = this.f17218g) == null) {
            return false;
        }
        r.c(handshake);
        return e(httpUrl, handshake);
    }

    private final boolean e(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> listD = handshake.d();
        return (listD.isEmpty() ^ true) && OkHostnameVerifier.f17612a.e(httpUrl.h(), (X509Certificate) listD.get(0));
    }

    private final void h(int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f17215d.b();
        Address addressA = this.f17215d.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : WhenMappings.f17231a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = addressA.j().createSocket();
            r.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f17216e = socketCreateSocket;
        eventListener.j(call, this.f17215d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            Platform.f17567a.g().f(socketCreateSocket, this.f17215d.d(), i10);
            try {
                this.f17221j = u.d(u.l(socketCreateSocket));
                this.f17222k = u.c(u.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (r.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(r.m("Failed to connect to ", this.f17215d.d()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address addressA = this.f17215d.a();
        SSLSocketFactory sSLSocketFactoryK = addressA.k();
        SSLSocket sSLSocket = null;
        try {
            r.c(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f17216e, addressA.l().h(), addressA.l().l(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecA = connectionSpecSelector.a(sSLSocket2);
                if (connectionSpecA.h()) {
                    Platform.f17567a.g().e(sSLSocket2, addressA.l().h(), addressA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f16822e;
                r.e(session, "sslSocketSession");
                Handshake handshakeA = companion.a(session);
                HostnameVerifier hostnameVerifierE = addressA.e();
                r.c(hostnameVerifierE);
                if (hostnameVerifierE.verify(addressA.l().h(), session)) {
                    CertificatePinner certificatePinnerA = addressA.a();
                    r.c(certificatePinnerA);
                    this.f17218g = new Handshake(handshakeA.e(), handshakeA.a(), handshakeA.c(), new RealConnection$connectTls$1(certificatePinnerA, handshakeA, addressA));
                    certificatePinnerA.b(addressA.l().h(), new RealConnection$connectTls$2(this));
                    String strH = connectionSpecA.h() ? Platform.f17567a.g().h(sSLSocket2) : null;
                    this.f17217f = sSLSocket2;
                    this.f17221j = u.d(u.l(sSLSocket2));
                    this.f17222k = u.c(u.h(sSLSocket2));
                    this.f17219h = strH != null ? Protocol.f16946b.a(strH) : Protocol.HTTP_1_1;
                    Platform.f17567a.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> listD = handshakeA.d();
                if (!(!listD.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + addressA.l().h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listD.get(0);
                throw new SSLPeerUnverifiedException(o.h("\n              |Hostname " + addressA.l().h() + " not verified:\n              |    certificate: " + CertificatePinner.f16683c.a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.f17612a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.f17567a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.m(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i10, int i11, int i12, Call call, EventListener eventListener) throws IOException {
        Request requestL = l();
        HttpUrl httpUrlJ = requestL.j();
        int i13 = 0;
        while (i13 < 21) {
            i13++;
            h(i10, i11, call, eventListener);
            requestL = k(i11, i12, requestL, httpUrlJ);
            if (requestL == null) {
                return;
            }
            Socket socket = this.f17216e;
            if (socket != null) {
                Util.m(socket);
            }
            this.f17216e = null;
            this.f17222k = null;
            this.f17221j = null;
            eventListener.h(call, this.f17215d.d(), this.f17215d.b(), null);
        }
    }

    private final Request k(int i10, int i11, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.S(httpUrl, true) + " HTTP/1.1";
        while (true) {
            e eVar = this.f17221j;
            r.c(eVar);
            d dVar = this.f17222k;
            r.c(dVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, eVar, dVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.e().g(i10, timeUnit);
            dVar.e().g(i11, timeUnit);
            http1ExchangeCodec.A(request.f(), str);
            http1ExchangeCodec.a();
            Response.Builder builderD = http1ExchangeCodec.d(false);
            r.c(builderD);
            Response responseC = builderD.s(request).c();
            http1ExchangeCodec.z(responseC);
            int iW = responseC.w();
            if (iW == 200) {
                if (eVar.d().q() && dVar.d().q()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iW != 407) {
                throw new IOException(r.m("Unexpected response code for CONNECT: ", Integer.valueOf(responseC.w())));
            }
            Request requestA = this.f17215d.a().h().a(this.f17215d, responseC);
            if (requestA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (v.t("close", Response.E(responseC, "Connection", null, 2, null), true)) {
                return requestA;
            }
            request = requestA;
        }
    }

    private final Request l() {
        Request requestB = new Request.Builder().q(this.f17215d.a().l()).h("CONNECT", null).f("Host", Util.S(this.f17215d.a().l(), true)).f("Proxy-Connection", "Keep-Alive").f("User-Agent", "okhttp/4.11.0").b();
        Request requestA = this.f17215d.a().h().a(this.f17215d, new Response.Builder().s(requestB).q(Protocol.HTTP_1_1).g(407).n("Preemptive Authenticate").b(Util.f17023c).t(-1L).r(-1L).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return requestA == null ? requestB : requestA;
    }

    private final void m(ConnectionSpecSelector connectionSpecSelector, int i10, Call call, EventListener eventListener) throws Throwable {
        if (this.f17215d.a().k() != null) {
            eventListener.C(call);
            i(connectionSpecSelector);
            eventListener.B(call, this.f17218g);
            if (this.f17219h == Protocol.HTTP_2) {
                F(i10);
                return;
            }
            return;
        }
        List<Protocol> listF = this.f17215d.a().f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(protocol)) {
            this.f17217f = this.f17216e;
            this.f17219h = Protocol.HTTP_1_1;
        } else {
            this.f17217f = this.f17216e;
            this.f17219h = protocol;
            F(i10);
        }
    }

    public Route A() {
        return this.f17215d;
    }

    public final void C(long j10) {
        this.f17230s = j10;
    }

    public final void D(boolean z10) {
        this.f17223l = z10;
    }

    public Socket E() {
        Socket socket = this.f17217f;
        r.c(socket);
        return socket;
    }

    public final synchronized void H(RealCall realCall, IOException iOException) {
        int i10;
        r.f(realCall, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f17535a == ErrorCode.REFUSED_STREAM) {
                int i11 = this.f17227p + 1;
                this.f17227p = i11;
                if (i11 > 1) {
                    this.f17223l = true;
                    i10 = this.f17225n;
                    this.f17225n = i10 + 1;
                }
            } else if (((StreamResetException) iOException).f17535a != ErrorCode.CANCEL || !realCall.w()) {
                this.f17223l = true;
                i10 = this.f17225n;
                this.f17225n = i10 + 1;
            }
        } else if (!v() || (iOException instanceof ConnectionShutdownException)) {
            this.f17223l = true;
            if (this.f17226o == 0) {
                if (iOException != null) {
                    g(realCall.k(), this.f17215d, iOException);
                }
                i10 = this.f17225n;
                this.f17225n = i10 + 1;
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void a(Http2Connection http2Connection, Settings settings) {
        r.f(http2Connection, "connection");
        r.f(settings, "settings");
        this.f17228q = settings.d();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void b(Http2Stream http2Stream) {
        r.f(http2Stream, "stream");
        http2Stream.d(ErrorCode.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f17216e;
        if (socket == null) {
            return;
        }
        Util.m(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.f(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void g(OkHttpClient okHttpClient, Route route, IOException iOException) {
        r.f(okHttpClient, "client");
        r.f(route, "failedRoute");
        r.f(iOException, "failure");
        if (route.b().type() != Proxy.Type.DIRECT) {
            Address addressA = route.a();
            addressA.i().connectFailed(addressA.l().q(), route.b().address(), iOException);
        }
        okHttpClient.t().b(route);
    }

    public final List<Reference<RealCall>> n() {
        return this.f17229r;
    }

    public final long o() {
        return this.f17230s;
    }

    public final boolean p() {
        return this.f17223l;
    }

    public final int q() {
        return this.f17225n;
    }

    public Handshake r() {
        return this.f17218g;
    }

    public final synchronized void s() {
        this.f17226o++;
    }

    public final boolean t(Address address, List<Route> list) {
        r.f(address, "address");
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f17229r.size() >= this.f17228q || this.f17223l || !this.f17215d.a().d(address)) {
            return false;
        }
        if (r.b(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f17220i == null || list == null || !B(list) || address.e() != OkHostnameVerifier.f17612a || !G(address.l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerA = address.a();
            r.c(certificatePinnerA);
            String strH = address.l().h();
            Handshake handshakeR = r();
            r.c(handshakeR);
            certificatePinnerA.a(strH, handshakeR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        CipherSuite cipherSuiteA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f17215d.a().l().h());
        sb2.append(':');
        sb2.append(this.f17215d.a().l().l());
        sb2.append(", proxy=");
        sb2.append(this.f17215d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f17215d.d());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f17218g;
        Object obj = "none";
        if (handshake != null && (cipherSuiteA = handshake.a()) != null) {
            obj = cipherSuiteA;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f17219h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long jO;
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f17216e;
        r.c(socket);
        Socket socket2 = this.f17217f;
        r.c(socket2);
        e eVar = this.f17221j;
        r.c(eVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f17220i;
        if (http2Connection != null) {
            return http2Connection.u0(jNanoTime);
        }
        synchronized (this) {
            jO = jNanoTime - o();
        }
        if (jO < 10000000000L || !z10) {
            return true;
        }
        return Util.F(socket2, eVar);
    }

    public final boolean v() {
        return this.f17220i != null;
    }

    public final ExchangeCodec w(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        r.f(okHttpClient, "client");
        r.f(realInterceptorChain, "chain");
        Socket socket = this.f17217f;
        r.c(socket);
        e eVar = this.f17221j;
        r.c(eVar);
        d dVar = this.f17222k;
        r.c(dVar);
        Http2Connection http2Connection = this.f17220i;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.k());
        j0 j0VarE = eVar.e();
        long jH = realInterceptorChain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0VarE.g(jH, timeUnit);
        dVar.e().g(realInterceptorChain.j(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, eVar, dVar);
    }

    public final RealWebSocket.Streams x(final Exchange exchange) throws SocketException {
        r.f(exchange, "exchange");
        Socket socket = this.f17217f;
        r.c(socket);
        final e eVar = this.f17221j;
        r.c(eVar);
        final d dVar = this.f17222k;
        r.c(dVar);
        socket.setSoTimeout(0);
        z();
        return new RealWebSocket.Streams(dVar, exchange) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f17237e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Exchange f17238f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true, this.f17236d, dVar);
                this.f17237e = dVar;
                this.f17238f = exchange;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f17238f.a(-1L, true, true, null);
            }
        };
    }

    public final synchronized void y() {
        this.f17224m = true;
    }

    public final synchronized void z() {
        this.f17223l = true;
    }
}
