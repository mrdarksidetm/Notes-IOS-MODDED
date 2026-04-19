package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import hf.g0;
import hf.i0;
import hf.j0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f17465g = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f17466h = Util.v("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<String> f17467i = Util.v("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RealConnection f17468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RealInterceptorChain f17469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Http2Connection f17470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Http2Stream f17471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Protocol f17472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f17473f;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final List<Header> a(Request request) {
            r.f(request, "request");
            Headers headersF = request.f();
            ArrayList arrayList = new ArrayList(headersF.size() + 4);
            arrayList.add(new Header(Header.f17336g, request.h()));
            arrayList.add(new Header(Header.f17337h, RequestLine.f17281a.c(request.j())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new Header(Header.f17339j, strD));
            }
            arrayList.add(new Header(Header.f17338i, request.j().p()));
            int i10 = 0;
            int size = headersF.size();
            while (i10 < size) {
                int i11 = i10 + 1;
                String strF = headersF.f(i10);
                Locale locale = Locale.US;
                r.e(locale, "US");
                String lowerCase = strF.toLowerCase(locale);
                r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.f17466h.contains(lowerCase) || (r.b(lowerCase, "te") && r.b(headersF.n(i10), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headersF.n(i10)));
                }
                i10 = i11;
            }
            return arrayList;
        }

        public final Response.Builder b(Headers headers, Protocol protocol) throws ProtocolException {
            r.f(headers, "headerBlock");
            r.f(protocol, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLineA = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strF = headers.f(i10);
                String strN = headers.n(i10);
                if (r.b(strF, ":status")) {
                    statusLineA = StatusLine.f17284d.a(r.m("HTTP/1.1 ", strN));
                } else if (!Http2ExchangeCodec.f17467i.contains(strF)) {
                    builder.c(strF, strN);
                }
                i10 = i11;
            }
            if (statusLineA != null) {
                return new Response.Builder().q(protocol).g(statusLineA.f17286b).n(statusLineA.f17287c).l(builder.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        r.f(okHttpClient, "client");
        r.f(realConnection, "connection");
        r.f(realInterceptorChain, "chain");
        r.f(http2Connection, "http2Connection");
        this.f17468a = realConnection;
        this.f17469b = realInterceptorChain;
        this.f17470c = http2Connection;
        List<Protocol> listA = okHttpClient.A();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f17472e = listA.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        Http2Stream http2Stream = this.f17471d;
        r.c(http2Stream);
        http2Stream.n().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) throws IOException {
        r.f(request, "request");
        if (this.f17471d != null) {
            return;
        }
        this.f17471d = this.f17470c.w0(f17465g.a(request), request.a() != null);
        if (this.f17473f) {
            Http2Stream http2Stream = this.f17471d;
            r.c(http2Stream);
            http2Stream.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.f17471d;
        r.c(http2Stream2);
        j0 j0VarV = http2Stream2.v();
        long jH = this.f17469b.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0VarV.g(jH, timeUnit);
        Http2Stream http2Stream3 = this.f17471d;
        r.c(http2Stream3);
        http2Stream3.G().g(this.f17469b.j(), timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public i0 c(Response response) {
        r.f(response, "response");
        Http2Stream http2Stream = this.f17471d;
        r.c(http2Stream);
        return http2Stream.p();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.f17473f = true;
        Http2Stream http2Stream = this.f17471d;
        if (http2Stream == null) {
            return;
        }
        http2Stream.f(ErrorCode.CANCEL);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean z10) throws IOException {
        Http2Stream http2Stream = this.f17471d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder builderB = f17465g.b(http2Stream.E(), this.f17472e);
        if (z10 && builderB.h() == 100) {
            return null;
        }
        return builderB;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection e() {
        return this.f17468a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.f17470c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        r.f(response, "response");
        if (HttpHeaders.b(response)) {
            return Util.u(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public g0 h(Request request, long j10) {
        r.f(request, "request");
        Http2Stream http2Stream = this.f17471d;
        r.c(http2Stream);
        return http2Stream.n();
    }
}
