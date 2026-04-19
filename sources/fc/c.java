package fc;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.b;

/* JADX INFO: loaded from: classes2.dex */
class c implements sc.b, fc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f11188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, f> f11189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<b>> f11190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f11191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f11192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, b.InterfaceC0419b> f11193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f11195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakHashMap<b.c, d> f11196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f11197j;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f11198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f11200c;

        b(ByteBuffer byteBuffer, int i10, long j10) {
            this.f11198a = byteBuffer;
            this.f11199b = i10;
            this.f11200c = j10;
        }
    }

    /* JADX INFO: renamed from: fc.c$c, reason: collision with other inner class name */
    static class C0269c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f11201a;

        C0269c(ExecutorService executorService) {
            this.f11201a = executorService;
        }

        @Override // fc.c.d
        public void a(Runnable runnable) {
            this.f11201a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ExecutorService f11202a = cc.a.e().b();

        e() {
        }

        @Override // fc.c.i
        public d a(b.d dVar) {
            return dVar.a() ? new h(this.f11202a) : new C0269c(this.f11202a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a f11203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11204b;

        f(b.a aVar, d dVar) {
            this.f11203a = aVar;
            this.f11204b = dVar;
        }
    }

    static class g implements b.InterfaceC0419b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FlutterJNI f11205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f11207c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i10) {
            this.f11205a = flutterJNI;
            this.f11206b = i10;
        }

        @Override // sc.b.InterfaceC0419b
        public void a(ByteBuffer byteBuffer) {
            if (this.f11207c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f11205a.invokePlatformMessageEmptyResponseCallback(this.f11206b);
            } else {
                this.f11205a.invokePlatformMessageResponseCallback(this.f11206b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f11208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f11209b = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f11210c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f11208a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void f() {
            if (this.f11210c.compareAndSet(false, true)) {
                try {
                    Runnable runnablePoll = this.f11209b.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } finally {
                    this.f11210c.set(false);
                    if (!this.f11209b.isEmpty()) {
                        this.f11208a.execute(new Runnable() { // from class: fc.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f11212a.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // fc.c.d
        public void a(Runnable runnable) {
            this.f11209b.add(runnable);
            this.f11208a.execute(new Runnable() { // from class: fc.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11211a.e();
                }
            });
        }
    }

    interface i {
        d a(b.d dVar);
    }

    private static class j implements b.c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f11189b = new HashMap();
        this.f11190c = new HashMap();
        this.f11191d = new Object();
        this.f11192e = new AtomicBoolean(false);
        this.f11193f = new HashMap();
        this.f11194g = 1;
        this.f11195h = new fc.g();
        this.f11196i = new WeakHashMap<>();
        this.f11188a = flutterJNI;
        this.f11197j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i10, final long j10) {
        d dVar = fVar != null ? fVar.f11204b : null;
        gd.e.b("PlatformChannel ScheduleHandler on " + str, i10);
        Runnable runnable = new Runnable() { // from class: fc.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f11182a.m(str, i10, fVar, byteBuffer, j10);
            }
        };
        if (dVar == null) {
            dVar = this.f11195h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i10) {
        if (fVar != null) {
            try {
                cc.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f11203a.a(byteBuffer, new g(this.f11188a, i10));
                return;
            } catch (Error e10) {
                k(e10);
                return;
            } catch (Exception e11) {
                cc.b.c("DartMessenger", "Uncaught exception in binary message listener", e11);
            }
        } else {
            cc.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f11188a.invokePlatformMessageEmptyResponseCallback(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i10, f fVar, ByteBuffer byteBuffer, long j10) {
        gd.e.w("PlatformChannel ScheduleHandler on " + str, i10);
        try {
            gd.e eVarY = gd.e.y("DartMessenger#handleMessageFromDart on " + str);
            try {
                l(fVar, byteBuffer, i10);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (eVarY != null) {
                    eVarY.close();
                }
            } finally {
            }
        } finally {
            this.f11188a.cleanupMessageData(j10);
        }
    }

    @Override // sc.b
    public b.c a(b.d dVar) {
        d dVarA = this.f11197j.a(dVar);
        j jVar = new j();
        this.f11196i.put(jVar, dVarA);
        return jVar;
    }

    @Override // sc.b
    public void b(String str, ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
        gd.e eVarY = gd.e.y("DartMessenger#send on " + str);
        try {
            cc.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i10 = this.f11194g;
            this.f11194g = i10 + 1;
            if (interfaceC0419b != null) {
                this.f11193f.put(Integer.valueOf(i10), interfaceC0419b);
            }
            if (byteBuffer == null) {
                this.f11188a.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.f11188a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // sc.b
    public void d(String str, ByteBuffer byteBuffer) {
        cc.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        b(str, byteBuffer, null);
    }

    @Override // sc.b
    public void e(String str, b.a aVar, b.c cVar) {
        if (aVar == null) {
            cc.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f11191d) {
                this.f11189b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (cVar != null && (dVar = this.f11196i.get(cVar)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        cc.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f11191d) {
            this.f11189b.put(str, new f(aVar, dVar));
            List<b> listRemove = this.f11190c.remove(str);
            if (listRemove == null) {
                return;
            }
            for (b bVar : listRemove) {
                j(str, this.f11189b.get(str), bVar.f11198a, bVar.f11199b, bVar.f11200c);
            }
        }
    }

    @Override // sc.b
    public void f(String str, b.a aVar) {
        e(str, aVar, null);
    }

    @Override // fc.f
    public void g(int i10, ByteBuffer byteBuffer) {
        cc.b.f("DartMessenger", "Received message reply from Dart.");
        b.InterfaceC0419b interfaceC0419bRemove = this.f11193f.remove(Integer.valueOf(i10));
        if (interfaceC0419bRemove != null) {
            try {
                cc.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                interfaceC0419bRemove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e10) {
                k(e10);
            } catch (Exception e11) {
                cc.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e11);
            }
        }
    }

    @Override // fc.f
    public void h(String str, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar;
        boolean z10;
        cc.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f11191d) {
            fVar = this.f11189b.get(str);
            z10 = this.f11192e.get() && fVar == null;
            if (z10) {
                if (!this.f11190c.containsKey(str)) {
                    this.f11190c.put(str, new LinkedList());
                }
                this.f11190c.get(str).add(new b(byteBuffer, i10, j10));
            }
        }
        if (z10) {
            return;
        }
        j(str, fVar, byteBuffer, i10, j10);
    }
}
