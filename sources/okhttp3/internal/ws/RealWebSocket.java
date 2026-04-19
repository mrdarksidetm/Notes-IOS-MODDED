package okhttp3.internal.ws;

import ae.j;
import ae.r;
import ge.i;
import hf.d;
import hf.e;
import hf.f;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import je.v;
import md.i0;
import nd.t;
import okhttp3.Call;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;

/* JADX INFO: loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Companion f17622y = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List<Protocol> f17623z = t.d(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebSocketListener f17624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Random f17625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebSocketExtensions f17627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Call f17630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Task f17631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebSocketReader f17632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WebSocketWriter f17633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TaskQueue f17634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f17635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Streams f17636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<f> f17637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque<Object> f17638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f17639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17647x;

    public static final class Close {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f17649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f17650c;

        public Close(int i10, f fVar, long j10) {
            this.f17648a = i10;
            this.f17649b = fVar;
            this.f17650c = j10;
        }

        public final long a() {
            return this.f17650c;
        }

        public final int b() {
            return this.f17648a;
        }

        public final f c() {
            return this.f17649b;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public static final class Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f17652b;

        public final f a() {
            return this.f17652b;
        }

        public final int b() {
            return this.f17651a;
        }
    }

    public static abstract class Streams implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f17653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f17654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f17655c;

        public Streams(boolean z10, e eVar, d dVar) {
            r.f(eVar, "source");
            r.f(dVar, "sink");
            this.f17653a = z10;
            this.f17654b = eVar;
            this.f17655c = dVar;
        }

        public final boolean a() {
            return this.f17653a;
        }

        public final d b() {
            return this.f17655c;
        }

        public final e l() {
            return this.f17654b;
        }
    }

    private final class WriterTask extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RealWebSocket f17656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket realWebSocket) {
            super(r.m(realWebSocket.f17635l, " writer"), false, 2, null);
            r.f(realWebSocket, "this$0");
            this.f17656e = realWebSocket;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() {
            try {
                return this.f17656e.t() ? 0L : -1L;
            } catch (IOException e10) {
                this.f17656e.n(e10, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.f17671f && webSocketExtensions.f17667b == null) {
            return webSocketExtensions.f17669d == null || new i(8, 15).t(webSocketExtensions.f17669d.intValue());
        }
        return false;
    }

    private final void s() {
        if (!Util.f17028h || Thread.holdsLock(this)) {
            Task task = this.f17631h;
            if (task != null) {
                TaskQueue.j(this.f17634k, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void a(f fVar) {
        r.f(fVar, "payload");
        if (!this.f17643t && (!this.f17640q || !this.f17638o.isEmpty())) {
            this.f17637n.add(fVar);
            s();
            this.f17645v++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void b(f fVar) {
        r.f(fVar, "bytes");
        this.f17624a.d(this, fVar);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void c(String str) {
        r.f(str, "text");
        this.f17624a.e(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void d(f fVar) {
        r.f(fVar, "payload");
        this.f17646w++;
        this.f17647x = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void e(int i10, String str) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        r.f(str, "reason");
        boolean z10 = true;
        if (!(i10 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f17641r != -1) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f17641r = i10;
            this.f17642s = str;
            streams = null;
            if (this.f17640q && this.f17638o.isEmpty()) {
                Streams streams2 = this.f17636m;
                this.f17636m = null;
                webSocketReader = this.f17632i;
                this.f17632i = null;
                webSocketWriter = this.f17633j;
                this.f17633j = null;
                this.f17634k.o();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            i0 i0Var = i0.f15558a;
        }
        try {
            this.f17624a.b(this, i10, str);
            if (streams != null) {
                this.f17624a.a(this, i10, str);
            }
        } finally {
            if (streams != null) {
                Util.l(streams);
            }
            if (webSocketReader != null) {
                Util.l(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.l(webSocketWriter);
            }
        }
    }

    public void j() {
        Call call = this.f17630g;
        r.c(call);
        call.cancel();
    }

    public final void k(Response response, Exchange exchange) throws ProtocolException {
        r.f(response, "response");
        if (response.w() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.w() + ' ' + response.I() + '\'');
        }
        String strE = Response.E(response, "Connection", null, 2, null);
        if (!v.t("Upgrade", strE, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strE) + '\'');
        }
        String strE2 = Response.E(response, "Upgrade", null, 2, null);
        if (!v.t("websocket", strE2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strE2) + '\'');
        }
        String strE3 = Response.E(response, "Sec-WebSocket-Accept", null, 2, null);
        String strA = f.f11960d.d(r.m(this.f17629f, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).D().a();
        if (r.b(strA, strE3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + ((Object) strE3) + '\'');
    }

    public boolean l(int i10, String str) {
        return m(i10, str, 60000L);
    }

    public final synchronized boolean m(int i10, String str, long j10) {
        WebSocketProtocol.f17672a.c(i10);
        f fVarD = null;
        if (str != null) {
            fVarD = f.f11960d.d(str);
            if (!(((long) fVarD.F()) <= 123)) {
                throw new IllegalArgumentException(r.m("reason.size() > 123: ", str).toString());
            }
        }
        if (!this.f17643t && !this.f17640q) {
            this.f17640q = true;
            this.f17638o.add(new Close(i10, fVarD, j10));
            s();
            return true;
        }
        return false;
    }

    public final void n(Exception exc, Response response) {
        r.f(exc, "e");
        synchronized (this) {
            if (this.f17643t) {
                return;
            }
            this.f17643t = true;
            Streams streams = this.f17636m;
            this.f17636m = null;
            WebSocketReader webSocketReader = this.f17632i;
            this.f17632i = null;
            WebSocketWriter webSocketWriter = this.f17633j;
            this.f17633j = null;
            this.f17634k.o();
            i0 i0Var = i0.f15558a;
            try {
                this.f17624a.c(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.l(streams);
                }
                if (webSocketReader != null) {
                    Util.l(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.l(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener o() {
        return this.f17624a;
    }

    public final void p(String str, Streams streams) {
        r.f(str, "name");
        r.f(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f17627d;
        r.c(webSocketExtensions);
        synchronized (this) {
            this.f17635l = str;
            this.f17636m = streams;
            this.f17633j = new WebSocketWriter(streams.a(), streams.b(), this.f17625b, webSocketExtensions.f17666a, webSocketExtensions.a(streams.a()), this.f17628e);
            this.f17631h = new WriterTask(this);
            long j10 = this.f17626c;
            if (j10 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                TaskQueue taskQueue = this.f17634k;
                final String strM = r.m(str, " ping");
                taskQueue.i(new Task(strM, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f17659e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ RealWebSocket f17660f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ long f17661g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strM, false, 2, null);
                        this.f17659e = strM;
                        this.f17660f = this;
                        this.f17661g = nanos;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        this.f17660f.u();
                        return this.f17661g;
                    }
                }, nanos);
            }
            if (!this.f17638o.isEmpty()) {
                s();
            }
            i0 i0Var = i0.f15558a;
        }
        this.f17632i = new WebSocketReader(streams.a(), streams.l(), this, webSocketExtensions.f17666a, webSocketExtensions.a(!streams.a()));
    }

    public final void r() {
        while (this.f17641r == -1) {
            WebSocketReader webSocketReader = this.f17632i;
            r.c(webSocketReader);
            webSocketReader.a();
        }
    }

    public final boolean t() {
        Streams streams;
        String str;
        WebSocketReader webSocketReader;
        Closeable closeable;
        synchronized (this) {
            if (this.f17643t) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.f17633j;
            f fVarPoll = this.f17637n.poll();
            final boolean z10 = true;
            int i10 = -1;
            Object obj = null;
            if (fVarPoll == null) {
                Object objPoll = this.f17638o.poll();
                if (objPoll instanceof Close) {
                    int i11 = this.f17641r;
                    str = this.f17642s;
                    if (i11 != -1) {
                        Streams streams2 = this.f17636m;
                        this.f17636m = null;
                        webSocketReader = this.f17632i;
                        this.f17632i = null;
                        closeable = this.f17633j;
                        this.f17633j = null;
                        this.f17634k.o();
                        obj = objPoll;
                        i10 = i11;
                        streams = streams2;
                    } else {
                        long jA = ((Close) objPoll).a();
                        TaskQueue taskQueue = this.f17634k;
                        final String strM = r.m(this.f17635l, " cancel");
                        taskQueue.i(new Task(strM, z10, this) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            final /* synthetic */ String f17662e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            final /* synthetic */ boolean f17663f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            final /* synthetic */ RealWebSocket f17664g;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(strM, z10);
                                this.f17662e = strM;
                                this.f17663f = z10;
                                this.f17664g = this;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long f() {
                                this.f17664g.j();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(jA));
                        i10 = i11;
                        streams = null;
                        webSocketReader = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    streams = null;
                    str = null;
                    webSocketReader = null;
                }
                closeable = webSocketReader;
                obj = objPoll;
            } else {
                streams = null;
                str = null;
                webSocketReader = null;
                closeable = null;
            }
            i0 i0Var = i0.f15558a;
            try {
                if (fVarPoll != null) {
                    r.c(webSocketWriter);
                    webSocketWriter.w(fVarPoll);
                } else if (obj instanceof Message) {
                    Message message = (Message) obj;
                    r.c(webSocketWriter);
                    webSocketWriter.l(message.b(), message.a());
                    synchronized (this) {
                        this.f17639p -= (long) message.a().F();
                    }
                } else {
                    if (!(obj instanceof Close)) {
                        throw new AssertionError();
                    }
                    Close close = (Close) obj;
                    r.c(webSocketWriter);
                    webSocketWriter.a(close.b(), close.c());
                    if (streams != null) {
                        WebSocketListener webSocketListener = this.f17624a;
                        r.c(str);
                        webSocketListener.a(this, i10, str);
                    }
                }
                return true;
            } finally {
                if (streams != null) {
                    Util.l(streams);
                }
                if (webSocketReader != null) {
                    Util.l(webSocketReader);
                }
                if (closeable != null) {
                    Util.l(closeable);
                }
            }
        }
    }

    public final void u() {
        synchronized (this) {
            if (this.f17643t) {
                return;
            }
            WebSocketWriter webSocketWriter = this.f17633j;
            if (webSocketWriter == null) {
                return;
            }
            int i10 = this.f17647x ? this.f17644u : -1;
            this.f17644u++;
            this.f17647x = true;
            i0 i0Var = i0.f15558a;
            if (i10 == -1) {
                try {
                    webSocketWriter.o(f.f11961e);
                    return;
                } catch (IOException e10) {
                    n(e10, null);
                    return;
                }
            }
            n(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f17626c + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
        }
    }
}
