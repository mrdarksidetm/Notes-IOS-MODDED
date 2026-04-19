package okhttp3.internal.http2;

import ae.f0;
import ae.h0;
import ae.j;
import ae.r;
import hf.c;
import hf.d;
import hf.e;
import hf.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import md.i0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Connection implements Closeable {
    public static final Companion C = new Companion(null);
    private static final Settings D;
    private final ReaderRunnable A;
    private final Set<Integer> B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Listener f17370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, Http2Stream> f17371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TaskRunner f17376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TaskQueue f17377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final TaskQueue f17378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TaskQueue f17379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PushObserver f17380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f17384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f17385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f17386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Settings f17387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Settings f17388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f17389u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f17390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f17391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f17392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Socket f17393y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Http2Writer f17394z;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskRunner f17396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f17397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e f17399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f17400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Listener f17401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PushObserver f17402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f17403i;

        public Builder(boolean z10, TaskRunner taskRunner) {
            r.f(taskRunner, "taskRunner");
            this.f17395a = z10;
            this.f17396b = taskRunner;
            this.f17401g = Listener.f17405b;
            this.f17402h = PushObserver.f17530b;
        }

        public final Http2Connection a() {
            return new Http2Connection(this);
        }

        public final boolean b() {
            return this.f17395a;
        }

        public final String c() {
            String str = this.f17398d;
            if (str != null) {
                return str;
            }
            r.t("connectionName");
            return null;
        }

        public final Listener d() {
            return this.f17401g;
        }

        public final int e() {
            return this.f17403i;
        }

        public final PushObserver f() {
            return this.f17402h;
        }

        public final d g() {
            d dVar = this.f17400f;
            if (dVar != null) {
                return dVar;
            }
            r.t("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f17397c;
            if (socket != null) {
                return socket;
            }
            r.t("socket");
            return null;
        }

        public final e i() {
            e eVar = this.f17399e;
            if (eVar != null) {
                return eVar;
            }
            r.t("source");
            return null;
        }

        public final TaskRunner j() {
            return this.f17396b;
        }

        public final Builder k(Listener listener) {
            r.f(listener, "listener");
            n(listener);
            return this;
        }

        public final Builder l(int i10) {
            o(i10);
            return this;
        }

        public final void m(String str) {
            r.f(str, "<set-?>");
            this.f17398d = str;
        }

        public final void n(Listener listener) {
            r.f(listener, "<set-?>");
            this.f17401g = listener;
        }

        public final void o(int i10) {
            this.f17403i = i10;
        }

        public final void p(d dVar) {
            r.f(dVar, "<set-?>");
            this.f17400f = dVar;
        }

        public final void q(Socket socket) {
            r.f(socket, "<set-?>");
            this.f17397c = socket;
        }

        public final void r(e eVar) {
            r.f(eVar, "<set-?>");
            this.f17399e = eVar;
        }

        public final Builder s(Socket socket, String str, e eVar, d dVar) {
            String strM;
            r.f(socket, "socket");
            r.f(str, "peerName");
            r.f(eVar, "source");
            r.f(dVar, "sink");
            q(socket);
            if (b()) {
                strM = Util.f17029i + ' ' + str;
            } else {
                strM = r.m("MockWebServer ", str);
            }
            m(strM);
            r(eVar);
            p(dVar);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Settings a() {
            return Http2Connection.D;
        }
    }

    public static abstract class Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f17404a = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Listener f17405b = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void b(Http2Stream http2Stream) {
                r.f(http2Stream, "stream");
                http2Stream.d(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            r.f(http2Connection, "connection");
            r.f(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Http2Reader f17406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Http2Connection f17407b;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            r.f(http2Connection, "this$0");
            r.f(http2Reader, "reader");
            this.f17407b = http2Connection;
            this.f17406a = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void a() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void b(int i10, ErrorCode errorCode, f fVar) {
            int i11;
            Object[] array;
            r.f(errorCode, "errorCode");
            r.f(fVar, "debugData");
            fVar.F();
            Http2Connection http2Connection = this.f17407b;
            synchronized (http2Connection) {
                i11 = 0;
                array = http2Connection.q0().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                http2Connection.f17375g = true;
                i0 i0Var = i0.f15558a;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i11 < length) {
                Http2Stream http2Stream = http2StreamArr[i11];
                i11++;
                if (http2Stream.j() > i10 && http2Stream.t()) {
                    http2Stream.y(ErrorCode.REFUSED_STREAM);
                    this.f17407b.C0(http2Stream.j());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void c(final boolean z10, final Settings settings) {
            r.f(settings, "settings");
            TaskQueue taskQueue = this.f17407b.f17377i;
            final String strM = r.m(this.f17407b.i0(), " applyAndAckSettings");
            final boolean z11 = true;
            taskQueue.i(new Task(strM, z11, this, z10, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f17421e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ boolean f17422f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Http2Connection.ReaderRunnable f17423g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f17424h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ Settings f17425i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strM, z11);
                    this.f17421e = strM;
                    this.f17422f = z11;
                    this.f17423g = this;
                    this.f17424h = z10;
                    this.f17425i = settings;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    this.f17423g.l(this.f17424h, this.f17425i);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void d(boolean z10, int i10, int i11, List<Header> list) {
            r.f(list, "headerBlock");
            if (this.f17407b.B0(i10)) {
                this.f17407b.y0(i10, list, z10);
                return;
            }
            final Http2Connection http2Connection = this.f17407b;
            synchronized (http2Connection) {
                Http2Stream http2StreamP0 = http2Connection.p0(i10);
                if (http2StreamP0 != null) {
                    i0 i0Var = i0.f15558a;
                    http2StreamP0.x(Util.P(list), z10);
                    return;
                }
                if (http2Connection.f17375g) {
                    return;
                }
                if (i10 <= http2Connection.j0()) {
                    return;
                }
                if (i10 % 2 == http2Connection.l0() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i10, http2Connection, false, z10, Util.P(list));
                http2Connection.E0(i10);
                http2Connection.q0().put(Integer.valueOf(i10), http2Stream);
                TaskQueue taskQueueI = http2Connection.f17376h.i();
                final String str = http2Connection.i0() + '[' + i10 + "] onStream";
                final boolean z11 = true;
                taskQueueI.i(new Task(str, z11, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f17412e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f17413f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Http2Connection f17414g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ Http2Stream f17415h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str, z11);
                        this.f17412e = str;
                        this.f17413f = z11;
                        this.f17414g = http2Connection;
                        this.f17415h = http2Stream;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        try {
                            this.f17414g.k0().b(this.f17415h);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.f17567a.g().k(r.m("Http2Connection.Listener failure for ", this.f17414g.i0()), 4, e10);
                            try {
                                this.f17415h.d(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void e(int i10, long j10) {
            Object obj;
            if (i10 == 0) {
                Http2Connection http2Connection = this.f17407b;
                synchronized (http2Connection) {
                    http2Connection.f17392x = http2Connection.r0() + j10;
                    http2Connection.notifyAll();
                    i0 i0Var = i0.f15558a;
                    obj = http2Connection;
                }
            } else {
                Http2Stream http2StreamP0 = this.f17407b.p0(i10);
                if (http2StreamP0 == null) {
                    return;
                }
                synchronized (http2StreamP0) {
                    http2StreamP0.a(j10);
                    i0 i0Var2 = i0.f15558a;
                    obj = http2StreamP0;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void f(boolean z10, int i10, e eVar, int i11) {
            r.f(eVar, "source");
            if (this.f17407b.B0(i10)) {
                this.f17407b.x0(i10, eVar, i11, z10);
                return;
            }
            Http2Stream http2StreamP0 = this.f17407b.p0(i10);
            if (http2StreamP0 == null) {
                this.f17407b.P0(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.f17407b.K0(j10);
                eVar.skip(j10);
                return;
            }
            http2StreamP0.w(eVar, i11);
            if (z10) {
                http2StreamP0.x(Util.f17022b, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void h(boolean z10, final int i10, final int i11) {
            if (!z10) {
                TaskQueue taskQueue = this.f17407b.f17377i;
                final String strM = r.m(this.f17407b.i0(), " ping");
                final Http2Connection http2Connection = this.f17407b;
                final boolean z11 = true;
                taskQueue.i(new Task(strM, z11, http2Connection, i10, i11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f17416e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f17417f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Http2Connection f17418g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ int f17419h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    final /* synthetic */ int f17420i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strM, z11);
                        this.f17416e = strM;
                        this.f17417f = z11;
                        this.f17418g = http2Connection;
                        this.f17419h = i10;
                        this.f17420i = i11;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        this.f17418g.N0(true, this.f17419h, this.f17420i);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f17407b;
            synchronized (http2Connection2) {
                if (i10 == 1) {
                    http2Connection2.f17382n++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        http2Connection2.f17385q++;
                        http2Connection2.notifyAll();
                    }
                    i0 i0Var = i0.f15558a;
                } else {
                    http2Connection2.f17384p++;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void i(int i10, int i11, int i12, boolean z10) {
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() throws Throwable {
            m();
            return i0.f15558a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void j(int i10, ErrorCode errorCode) {
            r.f(errorCode, "errorCode");
            if (this.f17407b.B0(i10)) {
                this.f17407b.A0(i10, errorCode);
                return;
            }
            Http2Stream http2StreamC0 = this.f17407b.C0(i10);
            if (http2StreamC0 == null) {
                return;
            }
            http2StreamC0.y(errorCode);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void k(int i10, int i11, List<Header> list) {
            r.f(list, "requestHeaders");
            this.f17407b.z0(i11, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void l(boolean z10, Settings settings) {
            ?? r13;
            long jC;
            int i10;
            Http2Stream[] http2StreamArr;
            r.f(settings, "settings");
            final h0 h0Var = new h0();
            Http2Writer http2WriterT0 = this.f17407b.t0();
            final Http2Connection http2Connection = this.f17407b;
            synchronized (http2WriterT0) {
                synchronized (http2Connection) {
                    Settings settingsN0 = http2Connection.n0();
                    if (z10) {
                        r13 = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.g(settingsN0);
                        settings2.g(settings);
                        r13 = settings2;
                    }
                    h0Var.f712a = r13;
                    jC = ((long) r13.c()) - ((long) settingsN0.c());
                    i10 = 0;
                    if (jC == 0 || http2Connection.q0().isEmpty()) {
                        http2StreamArr = null;
                    } else {
                        Object[] array = http2Connection.q0().values().toArray(new Http2Stream[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        http2StreamArr = (Http2Stream[]) array;
                    }
                    http2Connection.G0((Settings) h0Var.f712a);
                    TaskQueue taskQueue = http2Connection.f17379k;
                    final String strM = r.m(http2Connection.i0(), " onSettings");
                    final boolean z11 = true;
                    taskQueue.i(new Task(strM, z11, http2Connection, h0Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ String f17408e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        final /* synthetic */ boolean f17409f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        final /* synthetic */ Http2Connection f17410g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        final /* synthetic */ h0 f17411h;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(strM, z11);
                            this.f17408e = strM;
                            this.f17409f = z11;
                            this.f17410g = http2Connection;
                            this.f17411h = h0Var;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // okhttp3.internal.concurrent.Task
                        public long f() {
                            this.f17410g.k0().a(this.f17410g, (Settings) this.f17411h.f712a);
                            return -1L;
                        }
                    }, 0L);
                    i0 i0Var = i0.f15558a;
                }
                try {
                    http2Connection.t0().a((Settings) h0Var.f712a);
                } catch (IOException e10) {
                    http2Connection.g0(e10);
                }
                i0 i0Var2 = i0.f15558a;
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i10 < length) {
                    Http2Stream http2Stream = http2StreamArr[i10];
                    i10++;
                    synchronized (http2Stream) {
                        http2Stream.a(jC);
                        i0 i0Var3 = i0.f15558a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
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
        public void m() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f17406a.l(this);
                    while (this.f17406a.b(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    this.f17407b.Z(errorCode, errorCode3, e10);
                    Util.l(this.f17406a);
                    throw th;
                }
                try {
                    this.f17407b.Z(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e12) {
                    e10 = e12;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.f17407b;
                    http2Connection.Z(errorCode4, errorCode4, e10);
                    errorCode = http2Connection;
                }
                errorCode3 = this.f17406a;
                Util.l(errorCode3);
            } catch (Throwable th2) {
                th = th2;
                this.f17407b.Z(errorCode, errorCode3, e10);
                Util.l(this.f17406a);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.h(7, 65535);
        settings.h(5, 16384);
        D = settings;
    }

    public Http2Connection(Builder builder) {
        r.f(builder, "builder");
        boolean zB = builder.b();
        this.f17369a = zB;
        this.f17370b = builder.d();
        this.f17371c = new LinkedHashMap();
        String strC = builder.c();
        this.f17372d = strC;
        this.f17374f = builder.b() ? 3 : 2;
        TaskRunner taskRunnerJ = builder.j();
        this.f17376h = taskRunnerJ;
        TaskQueue taskQueueI = taskRunnerJ.i();
        this.f17377i = taskQueueI;
        this.f17378j = taskRunnerJ.i();
        this.f17379k = taskRunnerJ.i();
        this.f17380l = builder.f();
        Settings settings = new Settings();
        if (builder.b()) {
            settings.h(7, 16777216);
        }
        this.f17387s = settings;
        this.f17388t = D;
        this.f17392x = r2.c();
        this.f17393y = builder.h();
        this.f17394z = new Http2Writer(builder.g(), zB);
        this.A = new ReaderRunnable(this, new Http2Reader(builder.i(), zB));
        this.B = new LinkedHashSet();
        if (builder.e() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            final String strM = r.m(strC, " ping");
            taskQueueI.i(new Task(strM, this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f17452e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Http2Connection f17453f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ long f17454g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strM, false, 2, null);
                    this.f17452e = strM;
                    this.f17453f = this;
                    this.f17454g = nanos;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    boolean z10;
                    synchronized (this.f17453f) {
                        if (this.f17453f.f17382n < this.f17453f.f17381m) {
                            z10 = true;
                        } else {
                            this.f17453f.f17381m++;
                            z10 = false;
                        }
                    }
                    Http2Connection http2Connection = this.f17453f;
                    if (z10) {
                        http2Connection.g0(null);
                        return -1L;
                    }
                    http2Connection.N0(false, 1, 0);
                    return this.f17454g;
                }
            }, nanos);
        }
    }

    public static /* synthetic */ void J0(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.f17146i;
        }
        http2Connection.I0(z10, taskRunner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        Z(errorCode, errorCode, iOException);
    }

    private final Http2Stream v0(int i10, List<Header> list, boolean z10) {
        int iL0;
        Http2Stream http2Stream;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f17394z) {
            synchronized (this) {
                if (l0() > 1073741823) {
                    H0(ErrorCode.REFUSED_STREAM);
                }
                if (this.f17375g) {
                    throw new ConnectionShutdownException();
                }
                iL0 = l0();
                F0(l0() + 2);
                http2Stream = new Http2Stream(iL0, this, z12, false, null);
                z11 = !z10 || s0() >= r0() || http2Stream.r() >= http2Stream.q();
                if (http2Stream.u()) {
                    q0().put(Integer.valueOf(iL0), http2Stream);
                }
                i0 i0Var = i0.f15558a;
            }
            if (i10 == 0) {
                t0().A(z12, iL0, list);
            } else {
                if (!(true ^ h0())) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                t0().G(i10, iL0, list);
            }
        }
        if (z11) {
            this.f17394z.flush();
        }
        return http2Stream;
    }

    public final void A0(final int i10, final ErrorCode errorCode) {
        r.f(errorCode, "errorCode");
        TaskQueue taskQueue = this.f17378j;
        final String str = this.f17372d + '[' + i10 + "] onReset";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10, this, i10, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17444e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17445f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Http2Connection f17446g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f17447h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ ErrorCode f17448i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z10);
                this.f17444e = str;
                this.f17445f = z10;
                this.f17446g = this;
                this.f17447h = i10;
                this.f17448i = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                this.f17446g.f17380l.d(this.f17447h, this.f17448i);
                synchronized (this.f17446g) {
                    this.f17446g.B.remove(Integer.valueOf(this.f17447h));
                    i0 i0Var = i0.f15558a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final boolean B0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized Http2Stream C0(int i10) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.f17371c.remove(Integer.valueOf(i10));
        notifyAll();
        return http2StreamRemove;
    }

    public final void D0() {
        synchronized (this) {
            long j10 = this.f17384p;
            long j11 = this.f17383o;
            if (j10 < j11) {
                return;
            }
            this.f17383o = j11 + 1;
            this.f17386r = System.nanoTime() + ((long) 1000000000);
            i0 i0Var = i0.f15558a;
            TaskQueue taskQueue = this.f17377i;
            final String strM = r.m(this.f17372d, " ping");
            final boolean z10 = true;
            taskQueue.i(new Task(strM, z10, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f17449e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ boolean f17450f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Http2Connection f17451g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strM, z10);
                    this.f17449e = strM;
                    this.f17450f = z10;
                    this.f17451g = this;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    this.f17451g.N0(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void E0(int i10) {
        this.f17373e = i10;
    }

    public final void F0(int i10) {
        this.f17374f = i10;
    }

    public final void G0(Settings settings) {
        r.f(settings, "<set-?>");
        this.f17388t = settings;
    }

    public final void H0(ErrorCode errorCode) {
        r.f(errorCode, "statusCode");
        synchronized (this.f17394z) {
            f0 f0Var = new f0();
            synchronized (this) {
                if (this.f17375g) {
                    return;
                }
                this.f17375g = true;
                f0Var.f703a = j0();
                i0 i0Var = i0.f15558a;
                t0().y(f0Var.f703a, errorCode, Util.f17021a);
            }
        }
    }

    public final void I0(boolean z10, TaskRunner taskRunner) {
        r.f(taskRunner, "taskRunner");
        if (z10) {
            this.f17394z.b();
            this.f17394z.I(this.f17387s);
            if (this.f17387s.c() != 65535) {
                this.f17394z.L(0, r6 - 65535);
            }
        }
        TaskQueue taskQueueI = taskRunner.i();
        final String str = this.f17372d;
        final ReaderRunnable readerRunnable = this.A;
        final boolean z11 = true;
        taskQueueI.i(new Task(str, z11, readerRunnable) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17141e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17142f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a<i0> f17143g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z11);
                this.f17141e = str;
                this.f17142f = z11;
                this.f17143g = readerRunnable;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                this.f17143g.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final synchronized void K0(long j10) {
        long j11 = this.f17389u + j10;
        this.f17389u = j11;
        long j12 = j11 - this.f17390v;
        if (j12 >= this.f17387s.c() / 2) {
            Q0(0, j12);
            this.f17390v += j12;
        }
    }

    public final void L0(int i10, boolean z10, c cVar, long j10) {
        int iMin;
        long j11;
        if (j10 == 0) {
            this.f17394z.l(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (s0() >= r0()) {
                    try {
                        if (!q0().containsKey(Integer.valueOf(i10))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j10, r0() - s0()), t0().C());
                j11 = iMin;
                this.f17391w = s0() + j11;
                i0 i0Var = i0.f15558a;
            }
            j10 -= j11;
            this.f17394z.l(z10 && j10 == 0, i10, cVar, iMin);
        }
    }

    public final void M0(int i10, boolean z10, List<Header> list) {
        r.f(list, "alternating");
        this.f17394z.A(z10, i10, list);
    }

    public final void N0(boolean z10, int i10, int i11) {
        try {
            this.f17394z.E(z10, i10, i11);
        } catch (IOException e10) {
            g0(e10);
        }
    }

    public final void O0(int i10, ErrorCode errorCode) {
        r.f(errorCode, "statusCode");
        this.f17394z.H(i10, errorCode);
    }

    public final void P0(final int i10, final ErrorCode errorCode) {
        r.f(errorCode, "errorCode");
        TaskQueue taskQueue = this.f17377i;
        final String str = this.f17372d + '[' + i10 + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10, this, i10, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17455e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17456f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Http2Connection f17457g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f17458h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ ErrorCode f17459i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z10);
                this.f17455e = str;
                this.f17456f = z10;
                this.f17457g = this;
                this.f17458h = i10;
                this.f17459i = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    this.f17457g.O0(this.f17458h, this.f17459i);
                    return -1L;
                } catch (IOException e10) {
                    this.f17457g.g0(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void Q0(final int i10, final long j10) {
        TaskQueue taskQueue = this.f17377i;
        final String str = this.f17372d + '[' + i10 + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10, this, i10, j10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17460e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17461f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Http2Connection f17462g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f17463h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ long f17464i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z10);
                this.f17460e = str;
                this.f17461f = z10;
                this.f17462g = this;
                this.f17463h = i10;
                this.f17464i = j10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    this.f17462g.t0().L(this.f17463h, this.f17464i);
                    return -1L;
                } catch (IOException e10) {
                    this.f17462g.g0(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void Z(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i10;
        r.f(errorCode, "connectionCode");
        r.f(errorCode2, "streamCode");
        if (Util.f17028h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            H0(errorCode);
        } catch (IOException unused) {
        }
        Object[] array = null;
        synchronized (this) {
            if (!q0().isEmpty()) {
                array = q0().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                q0().clear();
            }
            i0 i0Var = i0.f15558a;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.d(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            t0().close();
        } catch (IOException unused3) {
        }
        try {
            o0().close();
        } catch (IOException unused4) {
        }
        this.f17377i.o();
        this.f17378j.o();
        this.f17379k.o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Z(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.f17394z.flush();
    }

    public final boolean h0() {
        return this.f17369a;
    }

    public final String i0() {
        return this.f17372d;
    }

    public final int j0() {
        return this.f17373e;
    }

    public final Listener k0() {
        return this.f17370b;
    }

    public final int l0() {
        return this.f17374f;
    }

    public final Settings m0() {
        return this.f17387s;
    }

    public final Settings n0() {
        return this.f17388t;
    }

    public final Socket o0() {
        return this.f17393y;
    }

    public final synchronized Http2Stream p0(int i10) {
        return this.f17371c.get(Integer.valueOf(i10));
    }

    public final Map<Integer, Http2Stream> q0() {
        return this.f17371c;
    }

    public final long r0() {
        return this.f17392x;
    }

    public final long s0() {
        return this.f17391w;
    }

    public final Http2Writer t0() {
        return this.f17394z;
    }

    public final synchronized boolean u0(long j10) {
        if (this.f17375g) {
            return false;
        }
        if (this.f17384p < this.f17383o) {
            if (j10 >= this.f17386r) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream w0(List<Header> list, boolean z10) {
        r.f(list, "requestHeaders");
        return v0(0, list, z10);
    }

    public final void x0(final int i10, e eVar, final int i11, final boolean z10) {
        r.f(eVar, "source");
        final c cVar = new c();
        long j10 = i11;
        eVar.b0(j10);
        eVar.X(cVar, j10);
        TaskQueue taskQueue = this.f17378j;
        final String str = this.f17372d + '[' + i10 + "] onData";
        final boolean z11 = true;
        taskQueue.i(new Task(str, z11, this, i10, cVar, i11, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17426e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17427f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Http2Connection f17428g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f17429h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ c f17430i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f17431j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f17432k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z11);
                this.f17426e = str;
                this.f17427f = z11;
                this.f17428g = this;
                this.f17429h = i10;
                this.f17430i = cVar;
                this.f17431j = i11;
                this.f17432k = z10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    boolean zA = this.f17428g.f17380l.a(this.f17429h, this.f17430i, this.f17431j, this.f17432k);
                    if (zA) {
                        this.f17428g.t0().H(this.f17429h, ErrorCode.CANCEL);
                    }
                    if (!zA && !this.f17432k) {
                        return -1L;
                    }
                    synchronized (this.f17428g) {
                        this.f17428g.B.remove(Integer.valueOf(this.f17429h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void y0(final int i10, final List<Header> list, final boolean z10) {
        r.f(list, "requestHeaders");
        TaskQueue taskQueue = this.f17378j;
        final String str = this.f17372d + '[' + i10 + "] onHeaders";
        final boolean z11 = true;
        taskQueue.i(new Task(str, z11, this, i10, list, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17433e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f17434f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Http2Connection f17435g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f17436h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ List f17437i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f17438j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z11);
                this.f17433e = str;
                this.f17434f = z11;
                this.f17435g = this;
                this.f17436h = i10;
                this.f17437i = list;
                this.f17438j = z10;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                boolean zC = this.f17435g.f17380l.c(this.f17436h, this.f17437i, this.f17438j);
                if (zC) {
                    try {
                        this.f17435g.t0().H(this.f17436h, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zC && !this.f17438j) {
                    return -1L;
                }
                synchronized (this.f17435g) {
                    this.f17435g.B.remove(Integer.valueOf(this.f17436h));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void z0(final int i10, final List<Header> list) {
        r.f(list, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i10))) {
                P0(i10, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i10));
            TaskQueue taskQueue = this.f17378j;
            final String str = this.f17372d + '[' + i10 + "] onRequest";
            final boolean z10 = true;
            taskQueue.i(new Task(str, z10, this, i10, list) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f17439e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ boolean f17440f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Http2Connection f17441g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ int f17442h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ List f17443i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str, z10);
                    this.f17439e = str;
                    this.f17440f = z10;
                    this.f17441g = this;
                    this.f17442h = i10;
                    this.f17443i = list;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    if (!this.f17441g.f17380l.b(this.f17442h, this.f17443i)) {
                        return -1L;
                    }
                    try {
                        this.f17441g.t0().H(this.f17442h, ErrorCode.CANCEL);
                        synchronized (this.f17441g) {
                            this.f17441g.B.remove(Integer.valueOf(this.f17442h));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }
}
