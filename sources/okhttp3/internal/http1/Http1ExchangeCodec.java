package okhttp3.internal.http1;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import hf.c;
import hf.d;
import hf.e;
import hf.g0;
import hf.i0;
import hf.j0;
import hf.n;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import je.v;
import je.w;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Companion f17291h = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f17292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RealConnection f17293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f17294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f17295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HeadersReader f17297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Headers f17298g;

    private abstract class AbstractSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f17299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17301c;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            r.f(http1ExchangeCodec, "this$0");
            this.f17301c = http1ExchangeCodec;
            this.f17299a = new n(http1ExchangeCodec.f17294c.e());
        }

        @Override // hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            try {
                return this.f17301c.f17294c.X(cVar, j10);
            } catch (IOException e10) {
                this.f17301c.e().z();
                b();
                throw e10;
            }
        }

        protected final boolean a() {
            return this.f17300b;
        }

        public final void b() {
            if (this.f17301c.f17296e == 6) {
                return;
            }
            if (this.f17301c.f17296e != 5) {
                throw new IllegalStateException(r.m("state: ", Integer.valueOf(this.f17301c.f17296e)));
            }
            this.f17301c.r(this.f17299a);
            this.f17301c.f17296e = 6;
        }

        @Override // hf.i0
        public j0 e() {
            return this.f17299a;
        }

        protected final void l(boolean z10) {
            this.f17300b = z10;
        }
    }

    private final class ChunkedSink implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f17302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17304c;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            r.f(http1ExchangeCodec, "this$0");
            this.f17304c = http1ExchangeCodec;
            this.f17302a = new n(http1ExchangeCodec.f17295d.e());
        }

        @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f17303b) {
                return;
            }
            this.f17303b = true;
            this.f17304c.f17295d.z("0\r\n\r\n");
            this.f17304c.r(this.f17302a);
            this.f17304c.f17296e = 3;
        }

        @Override // hf.g0
        public j0 e() {
            return this.f17302a;
        }

        @Override // hf.g0, java.io.Flushable
        public synchronized void flush() {
            if (this.f17303b) {
                return;
            }
            this.f17304c.f17295d.flush();
        }

        @Override // hf.g0
        public void v(c cVar, long j10) {
            r.f(cVar, "source");
            if (!(!this.f17303b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.f17304c.f17295d.D(j10);
            this.f17304c.f17295d.z("\r\n");
            this.f17304c.f17295d.v(cVar, j10);
            this.f17304c.f17295d.z("\r\n");
        }
    }

    private final class ChunkedSource extends AbstractSource {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HttpUrl f17305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f17306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17308g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            r.f(http1ExchangeCodec, "this$0");
            r.f(httpUrl, "url");
            this.f17308g = http1ExchangeCodec;
            this.f17305d = httpUrl;
            this.f17306e = -1L;
            this.f17307f = true;
        }

        private final void o() throws ProtocolException {
            if (this.f17306e != -1) {
                this.f17308g.f17294c.J();
            }
            try {
                this.f17306e = this.f17308g.f17294c.d0();
                String string = w.W0(this.f17308g.f17294c.J()).toString();
                if (this.f17306e >= 0) {
                    if (!(string.length() > 0) || v.G(string, ";", false, 2, null)) {
                        if (this.f17306e == 0) {
                            this.f17307f = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.f17308g;
                            http1ExchangeCodec.f17298g = http1ExchangeCodec.f17297f.a();
                            OkHttpClient okHttpClient = this.f17308g.f17292a;
                            r.c(okHttpClient);
                            CookieJar cookieJarM = okHttpClient.m();
                            HttpUrl httpUrl = this.f17305d;
                            Headers headers = this.f17308g.f17298g;
                            r.c(headers);
                            HttpHeaders.f(cookieJarM, httpUrl, headers);
                            b();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17306e + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(r.m("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f17307f) {
                return -1L;
            }
            long j11 = this.f17306e;
            if (j11 == 0 || j11 == -1) {
                o();
                if (!this.f17307f) {
                    return -1L;
                }
            }
            long jX = super.X(cVar, Math.min(j10, this.f17306e));
            if (jX != -1) {
                this.f17306e -= jX;
                return jX;
            }
            this.f17308g.e().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f17307f && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17308g.e().z();
                b();
            }
            l(true);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private final class FixedLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f17309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17310e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j10) {
            super(http1ExchangeCodec);
            r.f(http1ExchangeCodec, "this$0");
            this.f17310e = http1ExchangeCodec;
            this.f17309d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(r.m("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f17309d;
            if (j11 == 0) {
                return -1L;
            }
            long jX = super.X(cVar, Math.min(j11, j10));
            if (jX == -1) {
                this.f17310e.e().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f17309d - jX;
            this.f17309d = j12;
            if (j12 == 0) {
                b();
            }
            return jX;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f17309d != 0 && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17310e.e().z();
                b();
            }
            l(true);
        }
    }

    private final class KnownLengthSink implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f17311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17313c;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            r.f(http1ExchangeCodec, "this$0");
            this.f17313c = http1ExchangeCodec;
            this.f17311a = new n(http1ExchangeCodec.f17295d.e());
        }

        @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f17312b) {
                return;
            }
            this.f17312b = true;
            this.f17313c.r(this.f17311a);
            this.f17313c.f17296e = 3;
        }

        @Override // hf.g0
        public j0 e() {
            return this.f17311a;
        }

        @Override // hf.g0, java.io.Flushable
        public void flush() {
            if (this.f17312b) {
                return;
            }
            this.f17313c.f17295d.flush();
        }

        @Override // hf.g0
        public void v(c cVar, long j10) {
            r.f(cVar, "source");
            if (!(!this.f17312b)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.k(cVar.size(), 0L, j10);
            this.f17313c.f17295d.v(cVar, j10);
        }
    }

    private final class UnknownLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f17315e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            r.f(http1ExchangeCodec, "this$0");
            this.f17315e = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(r.m("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f17314d) {
                return -1L;
            }
            long jX = super.X(cVar, j10);
            if (jX != -1) {
                return jX;
            }
            this.f17314d = true;
            b();
            return -1L;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f17314d) {
                b();
            }
            l(true);
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, e eVar, d dVar) {
        r.f(realConnection, "connection");
        r.f(eVar, "source");
        r.f(dVar, "sink");
        this.f17292a = okHttpClient;
        this.f17293b = realConnection;
        this.f17294c = eVar;
        this.f17295d = dVar;
        this.f17297f = new HeadersReader(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(n nVar) {
        j0 j0VarJ = nVar.j();
        nVar.k(j0.f11991e);
        j0VarJ.a();
        j0VarJ.b();
    }

    private final boolean s(Request request) {
        return v.t("chunked", request.d("Transfer-Encoding"), true);
    }

    private final boolean t(Response response) {
        return v.t("chunked", Response.E(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final g0 u() {
        int i10 = this.f17296e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17296e = 2;
        return new ChunkedSink(this);
    }

    private final i0 v(HttpUrl httpUrl) {
        int i10 = this.f17296e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17296e = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final i0 w(long j10) {
        int i10 = this.f17296e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17296e = 5;
        return new FixedLengthSource(this, j10);
    }

    private final g0 x() {
        int i10 = this.f17296e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17296e = 2;
        return new KnownLengthSink(this);
    }

    private final i0 y() {
        int i10 = this.f17296e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17296e = 5;
        e().z();
        return new UnknownLengthSource(this);
    }

    public final void A(Headers headers, String str) {
        r.f(headers, "headers");
        r.f(str, "requestLine");
        int i10 = this.f17296e;
        if (!(i10 == 0)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        this.f17295d.z(str).z("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f17295d.z(headers.f(i11)).z(": ").z(headers.n(i11)).z("\r\n");
        }
        this.f17295d.z("\r\n");
        this.f17296e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        this.f17295d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) {
        r.f(request, "request");
        RequestLine requestLine = RequestLine.f17281a;
        Proxy.Type type = e().A().b().type();
        r.e(type, "connection.route().proxy.type()");
        A(request.f(), requestLine.a(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public i0 c(Response response) {
        long jU;
        r.f(response, "response");
        if (!HttpHeaders.b(response)) {
            jU = 0;
        } else {
            if (t(response)) {
                return v(response.Y().j());
            }
            jU = Util.u(response);
            if (jU == -1) {
                return y();
            }
        }
        return w(jU);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        e().d();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean z10) {
        int i10 = this.f17296e;
        boolean z11 = false;
        if (!(i10 == 1 || i10 == 2 || i10 == 3)) {
            throw new IllegalStateException(r.m("state: ", Integer.valueOf(i10)).toString());
        }
        try {
            StatusLine statusLineA = StatusLine.f17284d.a(this.f17297f.b());
            Response.Builder builderL = new Response.Builder().q(statusLineA.f17285a).g(statusLineA.f17286b).n(statusLineA.f17287c).l(this.f17297f.a());
            if (z10 && statusLineA.f17286b == 100) {
                return null;
            }
            int i11 = statusLineA.f17286b;
            if (i11 != 100) {
                if (102 <= i11 && i11 < 200) {
                    z11 = true;
                }
                if (!z11) {
                    this.f17296e = 4;
                    return builderL;
                }
            }
            this.f17296e = 3;
            return builderL;
        } catch (EOFException e10) {
            throw new IOException(r.m("unexpected end of stream on ", e().A().a().l().n()), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection e() {
        return this.f17293b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.f17295d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        r.f(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return Util.u(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public g0 h(Request request, long j10) throws ProtocolException {
        r.f(request, "request");
        if (request.a() != null && request.a().c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j10 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void z(Response response) {
        r.f(response, "response");
        long jU = Util.u(response);
        if (jU == -1) {
            return;
        }
        i0 i0VarW = w(jU);
        Util.L(i0VarW, a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        i0VarW.close();
    }
}
