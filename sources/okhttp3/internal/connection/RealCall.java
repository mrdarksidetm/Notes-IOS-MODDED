package okhttp3.internal.connection;

import ae.r;
import hf.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import md.f;
import md.i0;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class RealCall implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f17190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Request f17191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RealConnectionPool f17193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EventListener f17194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RealCall$timeout$1 f17195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f17196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f17197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExchangeFinder f17198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RealConnection f17199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Exchange f17201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f17205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile Exchange f17206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile RealConnection f17207r;

    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Callback f17208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f17209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RealCall f17210c;

        public AsyncCall(RealCall realCall, Callback callback) {
            r.f(realCall, "this$0");
            r.f(callback, "responseCallback");
            this.f17210c = realCall;
            this.f17208a = callback;
            this.f17209b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            r.f(executorService, "executorService");
            Dispatcher dispatcherN = this.f17210c.k().n();
            if (Util.f17028h && Thread.holdsLock(dispatcherN)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + dispatcherN);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f17210c.v(interruptedIOException);
                    this.f17208a.b(this.f17210c, interruptedIOException);
                    this.f17210c.k().n().f(this);
                }
            } catch (Throwable th) {
                this.f17210c.k().n().f(this);
                throw th;
            }
        }

        public final RealCall b() {
            return this.f17210c;
        }

        public final AtomicInteger c() {
            return this.f17209b;
        }

        public final String d() {
            return this.f17210c.r().j().h();
        }

        public final void e(AsyncCall asyncCall) {
            r.f(asyncCall, "other");
            this.f17209b = asyncCall.f17209b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            Dispatcher dispatcherN;
            String strM = r.m("OkHttp ", this.f17210c.x());
            RealCall realCall = this.f17210c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strM);
            try {
                try {
                    realCall.f17195f.w();
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th2) {
                        z10 = false;
                        th = th2;
                    }
                    try {
                        this.f17208a.a(realCall, realCall.s());
                        dispatcherN = realCall.k().n();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            Platform.f17567a.g().k(r.m("Callback failure for ", realCall.E()), 4, e10);
                        } else {
                            this.f17208a.b(realCall, e10);
                        }
                        dispatcherN = realCall.k().n();
                    } catch (Throwable th3) {
                        th = th3;
                        realCall.cancel();
                        if (!z10) {
                            IOException iOException = new IOException(r.m("canceled due to ", th));
                            f.a(iOException, th);
                            this.f17208a.b(realCall, iOException);
                        }
                        throw th;
                    }
                    dispatcherN.f(this);
                } catch (Throwable th4) {
                    realCall.k().n().f(this);
                    throw th4;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f17211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            r.f(realCall, "referent");
            this.f17211a = obj;
        }

        public final Object a() {
            return this.f17211a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [hf.j0, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        r.f(okHttpClient, "client");
        r.f(request, "originalRequest");
        this.f17190a = okHttpClient;
        this.f17191b = request;
        this.f17192c = z10;
        this.f17193d = okHttpClient.j().a();
        this.f17194e = okHttpClient.q().a(this);
        ?? r22 = new a() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // hf.a
            protected void C() {
                this.f17212o.cancel();
            }
        };
        r22.g(k().g(), TimeUnit.MILLISECONDS);
        this.f17195f = r22;
        this.f17196g = new AtomicBoolean();
        this.f17204o = true;
    }

    private final <E extends IOException> E D(E e10) {
        if (this.f17200k || !x()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w() ? "canceled " : "");
        sb2.append(this.f17192c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
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
    private final <E extends IOException> E e(E e10) {
        Socket socketZ;
        boolean z10 = Util.f17028h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f17199j;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketZ = z();
            }
            if (this.f17199j == null) {
                if (socketZ != null) {
                    Util.m(socketZ);
                }
                this.f17194e.l(this, realConnection);
            } else {
                if (!(socketZ == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) D(e10);
        if (e10 != null) {
            EventListener eventListener = this.f17194e;
            r.c(e11);
            eventListener.e(this, e11);
        } else {
            this.f17194e.d(this);
        }
        return e11;
    }

    private final void f() {
        this.f17197h = Platform.f17567a.g().i("response.body().close()");
        this.f17194e.f(this);
    }

    private final Address h(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierU;
        CertificatePinner certificatePinnerH;
        if (httpUrl.i()) {
            SSLSocketFactory sSLSocketFactoryH = this.f17190a.H();
            hostnameVerifierU = this.f17190a.u();
            sSLSocketFactory = sSLSocketFactoryH;
            certificatePinnerH = this.f17190a.h();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierU = null;
            certificatePinnerH = null;
        }
        return new Address(httpUrl.h(), httpUrl.l(), this.f17190a.p(), this.f17190a.G(), sSLSocketFactory, hostnameVerifierU, certificatePinnerH, this.f17190a.C(), this.f17190a.B(), this.f17190a.A(), this.f17190a.k(), this.f17190a.D());
    }

    public final boolean A() {
        ExchangeFinder exchangeFinder = this.f17198i;
        r.c(exchangeFinder);
        return exchangeFinder.e();
    }

    public final void B(RealConnection realConnection) {
        this.f17207r = realConnection;
    }

    public final void C() {
        if (!(!this.f17200k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f17200k = true;
        x();
    }

    @Override // okhttp3.Call
    public Response a() {
        if (!this.f17196g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        w();
        f();
        try {
            this.f17190a.n().b(this);
            return s();
        } finally {
            this.f17190a.n().g(this);
        }
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.f17205p) {
            return;
        }
        this.f17205p = true;
        Exchange exchange = this.f17206q;
        if (exchange != null) {
            exchange.b();
        }
        RealConnection realConnection = this.f17207r;
        if (realConnection != null) {
            realConnection.d();
        }
        this.f17194e.g(this);
    }

    public final void d(RealConnection realConnection) {
        r.f(realConnection, "connection");
        if (!Util.f17028h || Thread.holdsLock(realConnection)) {
            if (!(this.f17199j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f17199j = realConnection;
            realConnection.n().add(new CallReference(this, this.f17197h));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public RealCall clone() {
        return new RealCall(this.f17190a, this.f17191b, this.f17192c);
    }

    public final void i(Request request, boolean z10) {
        r.f(request, "request");
        if (!(this.f17201l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f17203n)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f17202m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i0 i0Var = i0.f15558a;
        }
        if (z10) {
            this.f17198i = new ExchangeFinder(this.f17193d, h(request.j()), this, this.f17194e);
        }
    }

    public final void j(boolean z10) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f17204o) {
                throw new IllegalStateException("released".toString());
            }
            i0 i0Var = i0.f15558a;
        }
        if (z10 && (exchange = this.f17206q) != null) {
            exchange.d();
        }
        this.f17201l = null;
    }

    public final OkHttpClient k() {
        return this.f17190a;
    }

    public final RealConnection m() {
        return this.f17199j;
    }

    public final EventListener n() {
        return this.f17194e;
    }

    @Override // okhttp3.Call
    public void o(Callback callback) {
        r.f(callback, "responseCallback");
        if (!this.f17196g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        f();
        this.f17190a.n().a(new AsyncCall(this, callback));
    }

    public final boolean p() {
        return this.f17192c;
    }

    public final Exchange q() {
        return this.f17201l;
    }

    public final Request r() {
        return this.f17191b;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response s() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f17190a
            java.util.List r0 = r0.v()
            nd.s.C(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.f17190a
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.f17190a
            okhttp3.CookieJar r1 = r1.m()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.f17190a
            okhttp3.Cache r1 = r1.f()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.f17157a
            r2.add(r0)
            boolean r0 = r11.f17192c
            if (r0 != 0) goto L46
            okhttp3.OkHttpClient r0 = r11.f17190a
            java.util.List r0 = r0.x()
            nd.s.C(r2, r0)
        L46:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.f17192c
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.f17191b
            okhttp3.OkHttpClient r0 = r11.f17190a
            int r6 = r0.i()
            okhttp3.OkHttpClient r0 = r11.f17190a
            int r7 = r0.E()
            okhttp3.OkHttpClient r0 = r11.f17190a
            int r8 = r0.J()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f17191b     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            okhttp3.Response r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.w()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.v(r1)
            return r2
        L7f:
            okhttp3.internal.Util.l(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.v(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        La1:
            if (r0 != 0) goto La6
            r11.v(r1)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.s():okhttp3.Response");
    }

    public final Exchange t(RealInterceptorChain realInterceptorChain) throws IOException {
        r.f(realInterceptorChain, "chain");
        synchronized (this) {
            if (!this.f17204o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f17203n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f17202m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i0 i0Var = i0.f15558a;
        }
        ExchangeFinder exchangeFinder = this.f17198i;
        r.c(exchangeFinder);
        Exchange exchange = new Exchange(this, this.f17194e, exchangeFinder, exchangeFinder.a(this.f17190a, realInterceptorChain));
        this.f17201l = exchange;
        this.f17206q = exchange;
        synchronized (this) {
            this.f17202m = true;
            this.f17203n = true;
        }
        if (this.f17205p) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public final <E extends IOException> E u(Exchange exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        r.f(exchange, "exchange");
        if (!r.b(exchange, this.f17206q)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (!this.f17202m) {
                        if (z11 || !this.f17203n) {
                            z13 = false;
                        }
                    }
                    if (z10) {
                        this.f17202m = false;
                    }
                    if (z11) {
                        this.f17203n = false;
                    }
                    boolean z14 = this.f17202m;
                    boolean z15 = (z14 || this.f17203n) ? false : true;
                    if (!z14 && !this.f17203n && !this.f17204o) {
                        z12 = true;
                    }
                    z13 = z12;
                    z12 = z15;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
            i0 i0Var = i0.f15558a;
        }
        if (z12) {
            this.f17206q = null;
            RealConnection realConnection = this.f17199j;
            if (realConnection != null) {
                realConnection.s();
            }
        }
        return z13 ? (E) e(e10) : e10;
    }

    public final IOException v(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f17204o) {
                this.f17204o = false;
                if (!this.f17202m && !this.f17203n) {
                    z10 = true;
                }
            }
            i0 i0Var = i0.f15558a;
        }
        return z10 ? e(iOException) : iOException;
    }

    @Override // okhttp3.Call
    public boolean w() {
        return this.f17205p;
    }

    public final String x() {
        return this.f17191b.j().n();
    }

    public final Socket z() {
        RealConnection realConnection = this.f17199j;
        r.c(realConnection);
        if (Util.f17028h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> listN = realConnection.n();
        Iterator<Reference<RealCall>> it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (r.b(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listN.remove(i10);
        this.f17199j = null;
        if (listN.isEmpty()) {
            realConnection.C(System.nanoTime());
            if (this.f17193d.c(realConnection)) {
                return realConnection.E();
            }
        }
        return null;
    }
}
