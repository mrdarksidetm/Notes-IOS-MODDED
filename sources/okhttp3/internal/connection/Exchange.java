package okhttp3.internal.connection;

import ae.r;
import hf.c;
import hf.g0;
import hf.i0;
import hf.l;
import hf.m;
import hf.u;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class Exchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RealCall f17162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventListener f17163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExchangeFinder f17164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExchangeCodec f17165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RealConnection f17168g;

    private final class RequestBodySink extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f17169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f17171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Exchange f17173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, g0 g0Var, long j10) {
            super(g0Var);
            r.f(exchange, "this$0");
            r.f(g0Var, "delegate");
            this.f17173f = exchange;
            this.f17169b = j10;
        }

        private final <E extends IOException> E a(E e10) {
            if (this.f17170c) {
                return e10;
            }
            this.f17170c = true;
            return (E) this.f17173f.a(this.f17171d, false, true, e10);
        }

        @Override // hf.l, hf.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17172e) {
                return;
            }
            this.f17172e = true;
            long j10 = this.f17169b;
            if (j10 != -1 && this.f17171d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // hf.l, hf.g0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // hf.l, hf.g0
        public void v(c cVar, long j10) throws IOException {
            r.f(cVar, "source");
            if (!(!this.f17172e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f17169b;
            if (j11 == -1 || this.f17171d + j10 <= j11) {
                try {
                    super.v(cVar, j10);
                    this.f17171d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f17169b + " bytes but received " + (this.f17171d + j10));
        }
    }

    public final class ResponseBodySource extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f17174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Exchange f17179g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, i0 i0Var, long j10) {
            super(i0Var);
            r.f(exchange, "this$0");
            r.f(i0Var, "delegate");
            this.f17179g = exchange;
            this.f17174b = j10;
            this.f17176d = true;
            if (j10 == 0) {
                b(null);
            }
        }

        @Override // hf.m, hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            if (!(!this.f17178f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jX = a().X(cVar, j10);
                if (this.f17176d) {
                    this.f17176d = false;
                    this.f17179g.i().w(this.f17179g.g());
                }
                if (jX == -1) {
                    b(null);
                    return -1L;
                }
                long j11 = this.f17175c + jX;
                long j12 = this.f17174b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f17174b + " bytes but received " + j11);
                }
                this.f17175c = j11;
                if (j11 == j12) {
                    b(null);
                }
                return jX;
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f17177e) {
                return e10;
            }
            this.f17177e = true;
            if (e10 == null && this.f17176d) {
                this.f17176d = false;
                this.f17179g.i().w(this.f17179g.g());
            }
            return (E) this.f17179g.a(this.f17175c, true, false, e10);
        }

        @Override // hf.m, hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17178f) {
                return;
            }
            this.f17178f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        r.f(realCall, "call");
        r.f(eventListener, "eventListener");
        r.f(exchangeFinder, "finder");
        r.f(exchangeCodec, "codec");
        this.f17162a = realCall;
        this.f17163b = eventListener;
        this.f17164c = exchangeFinder;
        this.f17165d = exchangeCodec;
        this.f17168g = exchangeCodec.e();
    }

    private final void u(IOException iOException) {
        this.f17167f = true;
        this.f17164c.h(iOException);
        this.f17165d.e().H(this.f17162a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            u(e10);
        }
        if (z11) {
            EventListener eventListener = this.f17163b;
            RealCall realCall = this.f17162a;
            if (e10 != null) {
                eventListener.s(realCall, e10);
            } else {
                eventListener.q(realCall, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f17163b.x(this.f17162a, e10);
            } else {
                this.f17163b.v(this.f17162a, j10);
            }
        }
        return (E) this.f17162a.u(this, z11, z10, e10);
    }

    public final void b() {
        this.f17165d.cancel();
    }

    public final g0 c(Request request, boolean z10) {
        r.f(request, "request");
        this.f17166e = z10;
        RequestBody requestBodyA = request.a();
        r.c(requestBodyA);
        long jA = requestBodyA.a();
        this.f17163b.r(this.f17162a);
        return new RequestBodySink(this, this.f17165d.h(request, jA), jA);
    }

    public final void d() {
        this.f17165d.cancel();
        this.f17162a.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f17165d.a();
        } catch (IOException e10) {
            this.f17163b.s(this.f17162a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f17165d.f();
        } catch (IOException e10) {
            this.f17163b.s(this.f17162a, e10);
            u(e10);
            throw e10;
        }
    }

    public final RealCall g() {
        return this.f17162a;
    }

    public final RealConnection h() {
        return this.f17168g;
    }

    public final EventListener i() {
        return this.f17163b;
    }

    public final ExchangeFinder j() {
        return this.f17164c;
    }

    public final boolean k() {
        return this.f17167f;
    }

    public final boolean l() {
        return !r.b(this.f17164c.d().l().h(), this.f17168g.A().a().l().h());
    }

    public final boolean m() {
        return this.f17166e;
    }

    public final RealWebSocket.Streams n() {
        this.f17162a.C();
        return this.f17165d.e().x(this);
    }

    public final void o() {
        this.f17165d.e().z();
    }

    public final void p() {
        this.f17162a.u(this, true, false, null);
    }

    public final ResponseBody q(Response response) throws IOException {
        r.f(response, "response");
        try {
            String strE = Response.E(response, "Content-Type", null, 2, null);
            long jG = this.f17165d.g(response);
            return new RealResponseBody(strE, jG, u.d(new ResponseBodySource(this, this.f17165d.c(response), jG)));
        } catch (IOException e10) {
            this.f17163b.x(this.f17162a, e10);
            u(e10);
            throw e10;
        }
    }

    public final Response.Builder r(boolean z10) throws IOException {
        try {
            Response.Builder builderD = this.f17165d.d(z10);
            if (builderD != null) {
                builderD.m(this);
            }
            return builderD;
        } catch (IOException e10) {
            this.f17163b.x(this.f17162a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(Response response) {
        r.f(response, "response");
        this.f17163b.y(this.f17162a, response);
    }

    public final void t() {
        this.f17163b.z(this.f17162a);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(Request request) throws IOException {
        r.f(request, "request");
        try {
            this.f17163b.u(this.f17162a);
            this.f17165d.b(request);
            this.f17163b.t(this.f17162a, request);
        } catch (IOException e10) {
            this.f17163b.s(this.f17162a, e10);
            u(e10);
            throw e10;
        }
    }
}
