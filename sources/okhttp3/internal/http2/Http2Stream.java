package okhttp3.internal.http2;

import ae.j;
import ae.r;
import hf.a;
import hf.c;
import hf.e;
import hf.g0;
import hf.j0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import md.i0;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Stream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Companion f17486o = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Http2Connection f17488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f17492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<Headers> f17493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FramingSource f17495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final FramingSink f17496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final StreamTimeout f17497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final StreamTimeout f17498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ErrorCode f17499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f17500n;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public final class FramingSink implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f17502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Headers f17503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Http2Stream f17505e;

        public FramingSink(Http2Stream http2Stream, boolean z10) {
            r.f(http2Stream, "this$0");
            this.f17505e = http2Stream;
            this.f17501a = z10;
            this.f17502b = new c();
        }

        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            Http2Stream http2Stream = this.f17505e;
            synchronized (http2Stream) {
                http2Stream.s().w();
                while (http2Stream.r() >= http2Stream.q() && !l() && !b() && http2Stream.h() == null) {
                    try {
                        http2Stream.F();
                    } finally {
                        http2Stream.s().D();
                    }
                }
                http2Stream.s().D();
                http2Stream.c();
                jMin = Math.min(http2Stream.q() - http2Stream.r(), this.f17502b.size());
                http2Stream.D(http2Stream.r() + jMin);
                z11 = z10 && jMin == this.f17502b.size();
                i0 i0Var = i0.f15558a;
            }
            this.f17505e.s().w();
            try {
                this.f17505e.g().L0(this.f17505e.j(), z11, this.f17502b, jMin);
            } finally {
                http2Stream = this.f17505e;
            }
        }

        public final boolean b() {
            return this.f17504d;
        }

        @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = this.f17505e;
            if (Util.f17028h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.f17505e;
            synchronized (http2Stream2) {
                if (b()) {
                    return;
                }
                boolean z10 = http2Stream2.h() == null;
                i0 i0Var = i0.f15558a;
                if (!this.f17505e.o().f17501a) {
                    boolean z11 = this.f17502b.size() > 0;
                    if (this.f17503c != null) {
                        while (this.f17502b.size() > 0) {
                            a(false);
                        }
                        Http2Connection http2ConnectionG = this.f17505e.g();
                        int iJ = this.f17505e.j();
                        Headers headers = this.f17503c;
                        r.c(headers);
                        http2ConnectionG.M0(iJ, z10, Util.O(headers));
                    } else if (z11) {
                        while (this.f17502b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        this.f17505e.g().L0(this.f17505e.j(), true, null, 0L);
                    }
                }
                synchronized (this.f17505e) {
                    o(true);
                    i0 i0Var2 = i0.f15558a;
                }
                this.f17505e.g().flush();
                this.f17505e.b();
            }
        }

        @Override // hf.g0
        public j0 e() {
            return this.f17505e.s();
        }

        @Override // hf.g0, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = this.f17505e;
            if (Util.f17028h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.f17505e;
            synchronized (http2Stream2) {
                http2Stream2.c();
                i0 i0Var = i0.f15558a;
            }
            while (this.f17502b.size() > 0) {
                a(false);
                this.f17505e.g().flush();
            }
        }

        public final boolean l() {
            return this.f17501a;
        }

        public final void o(boolean z10) {
            this.f17504d = z10;
        }

        @Override // hf.g0
        public void v(c cVar, long j10) throws IOException {
            r.f(cVar, "source");
            Http2Stream http2Stream = this.f17505e;
            if (!Util.f17028h || !Thread.holdsLock(http2Stream)) {
                this.f17502b.v(cVar, j10);
                while (this.f17502b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
        }
    }

    public final class FramingSource implements hf.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f17506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f17508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f17509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Headers f17510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Http2Stream f17512g;

        public FramingSource(Http2Stream http2Stream, long j10, boolean z10) {
            r.f(http2Stream, "this$0");
            this.f17512g = http2Stream;
            this.f17506a = j10;
            this.f17507b = z10;
            this.f17508c = new c();
            this.f17509d = new c();
        }

        private final void E(long j10) {
            Http2Stream http2Stream = this.f17512g;
            if (!Util.f17028h || !Thread.holdsLock(http2Stream)) {
                this.f17512g.g().K0(j10);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
        }

        public final void A(boolean z10) {
            this.f17507b = z10;
        }

        public final void C(Headers headers) {
            this.f17510e = headers;
        }

        @Override // hf.i0
        public long X(c cVar, long j10) throws IOException {
            long jX;
            boolean z10;
            r.f(cVar, "sink");
            long j11 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(r.m("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            while (true) {
                IOException iOExceptionI = null;
                Http2Stream http2Stream = this.f17512g;
                synchronized (http2Stream) {
                    http2Stream.m().w();
                    try {
                        if (http2Stream.h() != null && !b() && (iOExceptionI = http2Stream.i()) == null) {
                            ErrorCode errorCodeH = http2Stream.h();
                            r.c(errorCodeH);
                            iOExceptionI = new StreamResetException(errorCodeH);
                        }
                        if (a()) {
                            throw new IOException("stream closed");
                        }
                        if (l().size() > j11) {
                            jX = l().X(cVar, Math.min(j10, l().size()));
                            http2Stream.C(http2Stream.l() + jX);
                            long jL = http2Stream.l() - http2Stream.k();
                            if (iOExceptionI == null && jL >= http2Stream.g().m0().c() / 2) {
                                http2Stream.g().Q0(http2Stream.j(), jL);
                                http2Stream.B(http2Stream.l());
                            }
                        } else if (b() || iOExceptionI != null) {
                            jX = -1;
                        } else {
                            http2Stream.F();
                            jX = -1;
                            z10 = true;
                            http2Stream.m().D();
                            i0 i0Var = i0.f15558a;
                        }
                        z10 = false;
                        http2Stream.m().D();
                        i0 i0Var2 = i0.f15558a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (jX != -1) {
                        E(jX);
                        return jX;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j11 = 0;
            }
        }

        public final boolean a() {
            return this.f17511f;
        }

        public final boolean b() {
            return this.f17507b;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            Http2Stream http2Stream = this.f17512g;
            synchronized (http2Stream) {
                y(true);
                size = l().size();
                l().b();
                http2Stream.notifyAll();
                i0 i0Var = i0.f15558a;
            }
            if (size > 0) {
                E(size);
            }
            this.f17512g.b();
        }

        @Override // hf.i0
        public j0 e() {
            return this.f17512g.m();
        }

        public final c l() {
            return this.f17509d;
        }

        public final c o() {
            return this.f17508c;
        }

        public final void w(e eVar, long j10) throws EOFException {
            boolean zB;
            boolean z10;
            boolean z11;
            long size;
            r.f(eVar, "source");
            Http2Stream http2Stream = this.f17512g;
            if (Util.f17028h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            while (j10 > 0) {
                synchronized (this.f17512g) {
                    zB = b();
                    z10 = true;
                    z11 = l().size() + j10 > this.f17506a;
                    i0 i0Var = i0.f15558a;
                }
                if (z11) {
                    eVar.skip(j10);
                    this.f17512g.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (zB) {
                    eVar.skip(j10);
                    return;
                }
                long jX = eVar.X(this.f17508c, j10);
                if (jX == -1) {
                    throw new EOFException();
                }
                j10 -= jX;
                Http2Stream http2Stream2 = this.f17512g;
                synchronized (http2Stream2) {
                    if (a()) {
                        size = o().size();
                        o().b();
                    } else {
                        if (l().size() != 0) {
                            z10 = false;
                        }
                        l().T(o());
                        if (z10) {
                            http2Stream2.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    E(size);
                }
            }
        }

        public final void y(boolean z10) {
            this.f17511f = z10;
        }
    }

    public final class StreamTimeout extends a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Http2Stream f17513o;

        public StreamTimeout(Http2Stream http2Stream) {
            r.f(http2Stream, "this$0");
            this.f17513o = http2Stream;
        }

        @Override // hf.a
        protected void C() {
            this.f17513o.f(ErrorCode.CANCEL);
            this.f17513o.g().D0();
        }

        public final void D() throws IOException {
            if (x()) {
                throw y(null);
            }
        }

        @Override // hf.a
        protected IOException y(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, Headers headers) {
        r.f(http2Connection, "connection");
        this.f17487a = i10;
        this.f17488b = http2Connection;
        this.f17492f = http2Connection.n0().c();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f17493g = arrayDeque;
        this.f17495i = new FramingSource(this, http2Connection.m0().c(), z11);
        this.f17496j = new FramingSink(this, z10);
        this.f17497k = new StreamTimeout(this);
        this.f17498l = new StreamTimeout(this);
        if (headers == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean e(ErrorCode errorCode, IOException iOException) {
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().b() && o().l()) {
                return false;
            }
            z(errorCode);
            A(iOException);
            notifyAll();
            i0 i0Var = i0.f15558a;
            this.f17488b.C0(this.f17487a);
            return true;
        }
    }

    public final void A(IOException iOException) {
        this.f17500n = iOException;
    }

    public final void B(long j10) {
        this.f17490d = j10;
    }

    public final void C(long j10) {
        this.f17489c = j10;
    }

    public final void D(long j10) {
        this.f17491e = j10;
    }

    public final synchronized Headers E() {
        Headers headersRemoveFirst;
        this.f17497k.w();
        while (this.f17493g.isEmpty() && this.f17499m == null) {
            try {
                F();
            } catch (Throwable th) {
                this.f17497k.D();
                throw th;
            }
        }
        this.f17497k.D();
        if (!(!this.f17493g.isEmpty())) {
            IOException iOException = this.f17500n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f17499m;
            r.c(errorCode);
            throw new StreamResetException(errorCode);
        }
        headersRemoveFirst = this.f17493g.removeFirst();
        r.e(headersRemoveFirst, "headersQueue.removeFirst()");
        return headersRemoveFirst;
    }

    public final void F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final j0 G() {
        return this.f17498l;
    }

    public final void a(long j10) {
        this.f17492f += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z10 = !p().b() && p().a() && (o().l() || o().b());
            zU = u();
            i0 i0Var = i0.f15558a;
        }
        if (z10) {
            d(ErrorCode.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f17488b.C0(this.f17487a);
        }
    }

    public final void c() throws IOException {
        if (this.f17496j.b()) {
            throw new IOException("stream closed");
        }
        if (this.f17496j.l()) {
            throw new IOException("stream finished");
        }
        if (this.f17499m != null) {
            IOException iOException = this.f17500n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f17499m;
            r.c(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void d(ErrorCode errorCode, IOException iOException) {
        r.f(errorCode, "rstStatusCode");
        if (e(errorCode, iOException)) {
            this.f17488b.O0(this.f17487a, errorCode);
        }
    }

    public final void f(ErrorCode errorCode) {
        r.f(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f17488b.P0(this.f17487a, errorCode);
        }
    }

    public final Http2Connection g() {
        return this.f17488b;
    }

    public final synchronized ErrorCode h() {
        return this.f17499m;
    }

    public final IOException i() {
        return this.f17500n;
    }

    public final int j() {
        return this.f17487a;
    }

    public final long k() {
        return this.f17490d;
    }

    public final long l() {
        return this.f17489c;
    }

    public final StreamTimeout m() {
        return this.f17497k;
    }

    public final g0 n() {
        synchronized (this) {
            if (!(this.f17494h || t())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            i0 i0Var = i0.f15558a;
        }
        return this.f17496j;
    }

    public final FramingSink o() {
        return this.f17496j;
    }

    public final FramingSource p() {
        return this.f17495i;
    }

    public final long q() {
        return this.f17492f;
    }

    public final long r() {
        return this.f17491e;
    }

    public final StreamTimeout s() {
        return this.f17498l;
    }

    public final boolean t() {
        return this.f17488b.h0() == ((this.f17487a & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f17499m != null) {
            return false;
        }
        if ((this.f17495i.b() || this.f17495i.a()) && (this.f17496j.l() || this.f17496j.b())) {
            if (this.f17494h) {
                return false;
            }
        }
        return true;
    }

    public final j0 v() {
        return this.f17497k;
    }

    public final void w(e eVar, int i10) {
        r.f(eVar, "source");
        if (!Util.f17028h || !Thread.holdsLock(this)) {
            this.f17495i.w(eVar, i10);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final void x(Headers headers, boolean z10) {
        boolean zU;
        r.f(headers, "headers");
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f17494h && z10) {
                p().C(headers);
            } else {
                this.f17494h = true;
                this.f17493g.add(headers);
            }
            if (z10) {
                p().A(true);
            }
            zU = u();
            notifyAll();
            i0 i0Var = i0.f15558a;
        }
        if (zU) {
            return;
        }
        this.f17488b.C0(this.f17487a);
    }

    public final synchronized void y(ErrorCode errorCode) {
        r.f(errorCode, "errorCode");
        if (this.f17499m == null) {
            this.f17499m = errorCode;
            notifyAll();
        }
    }

    public final void z(ErrorCode errorCode) {
        this.f17499m = errorCode;
    }
}
