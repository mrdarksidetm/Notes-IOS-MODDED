package hf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class a extends j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0291a f11911i = new C0291a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f11912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f11913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f11914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f11915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f11916n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f11918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f11919h;

    /* JADX INFO: renamed from: hf.a$a, reason: collision with other inner class name */
    public static final class C0291a {
        private C0291a() {
        }

        public /* synthetic */ C0291a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(a aVar) {
            ReentrantLock reentrantLockF = a.f11911i.f();
            reentrantLockF.lock();
            try {
                if (!aVar.f11917f) {
                    return false;
                }
                aVar.f11917f = false;
                for (a aVar2 = a.f11916n; aVar2 != null; aVar2 = aVar2.f11918g) {
                    if (aVar2.f11918g == aVar) {
                        aVar2.f11918g = aVar.f11918g;
                        aVar.f11918g = null;
                        return false;
                    }
                }
                return true;
            } finally {
                reentrantLockF.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x001a, B:8:0x002a, B:11:0x0036, B:12:0x003f, B:17:0x0050, B:18:0x0058, B:20:0x0061, B:23:0x0071, B:24:0x0076, B:26:0x0086, B:27:0x008f, B:16:0x0049, B:30:0x0095, B:31:0x009a, B:32:0x009b, B:33:0x00a6), top: B:37:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x001a, B:8:0x002a, B:11:0x0036, B:12:0x003f, B:17:0x0050, B:18:0x0058, B:20:0x0061, B:23:0x0071, B:24:0x0076, B:26:0x0086, B:27:0x008f, B:16:0x0049, B:30:0x0095, B:31:0x009a, B:32:0x009b, B:33:0x00a6), top: B:37:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EDGE_INSN: B:38:0x0076->B:24:0x0076 BREAK  A[LOOP:0: B:18:0x0058->B:23:0x0071], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(hf.a r6, long r7, boolean r9) {
            /*
                r5 = this;
                hf.a$a r0 = hf.a.f11911i
                java.util.concurrent.locks.ReentrantLock r0 = r0.f()
                r0.lock()
                boolean r1 = hf.a.n(r6)     // Catch: java.lang.Throwable -> La7
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L9b
                hf.a.t(r6, r2)     // Catch: java.lang.Throwable -> La7
                hf.a r1 = hf.a.k()     // Catch: java.lang.Throwable -> La7
                if (r1 != 0) goto L2a
                hf.a r1 = new hf.a     // Catch: java.lang.Throwable -> La7
                r1.<init>()     // Catch: java.lang.Throwable -> La7
                hf.a.s(r1)     // Catch: java.lang.Throwable -> La7
                hf.a$b r1 = new hf.a$b     // Catch: java.lang.Throwable -> La7
                r1.<init>()     // Catch: java.lang.Throwable -> La7
                r1.start()     // Catch: java.lang.Throwable -> La7
            L2a:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La7
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L44
                if (r9 == 0) goto L44
                long r3 = r6.c()     // Catch: java.lang.Throwable -> La7
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> La7
            L3f:
                long r7 = r7 + r1
                hf.a.v(r6, r7)     // Catch: java.lang.Throwable -> La7
                goto L50
            L44:
                if (r3 == 0) goto L47
                goto L3f
            L47:
                if (r9 == 0) goto L95
                long r7 = r6.c()     // Catch: java.lang.Throwable -> La7
                hf.a.v(r6, r7)     // Catch: java.lang.Throwable -> La7
            L50:
                long r7 = hf.a.r(r6, r1)     // Catch: java.lang.Throwable -> La7
                hf.a r9 = hf.a.k()     // Catch: java.lang.Throwable -> La7
            L58:
                ae.r.c(r9)     // Catch: java.lang.Throwable -> La7
                hf.a r3 = hf.a.p(r9)     // Catch: java.lang.Throwable -> La7
                if (r3 == 0) goto L76
                hf.a r3 = hf.a.p(r9)     // Catch: java.lang.Throwable -> La7
                ae.r.c(r3)     // Catch: java.lang.Throwable -> La7
                long r3 = hf.a.r(r3, r1)     // Catch: java.lang.Throwable -> La7
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L71
                goto L76
            L71:
                hf.a r9 = hf.a.p(r9)     // Catch: java.lang.Throwable -> La7
                goto L58
            L76:
                hf.a r7 = hf.a.p(r9)     // Catch: java.lang.Throwable -> La7
                hf.a.u(r6, r7)     // Catch: java.lang.Throwable -> La7
                hf.a.u(r9, r6)     // Catch: java.lang.Throwable -> La7
                hf.a r6 = hf.a.k()     // Catch: java.lang.Throwable -> La7
                if (r9 != r6) goto L8f
                hf.a$a r6 = hf.a.f11911i     // Catch: java.lang.Throwable -> La7
                java.util.concurrent.locks.Condition r6 = r6.e()     // Catch: java.lang.Throwable -> La7
                r6.signal()     // Catch: java.lang.Throwable -> La7
            L8f:
                md.i0 r6 = md.i0.f15558a     // Catch: java.lang.Throwable -> La7
                r0.unlock()
                return
            L95:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> La7
                r6.<init>()     // Catch: java.lang.Throwable -> La7
                throw r6     // Catch: java.lang.Throwable -> La7
            L9b:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La7
                r7.<init>(r6)     // Catch: java.lang.Throwable -> La7
                throw r7     // Catch: java.lang.Throwable -> La7
            La7:
                r6 = move-exception
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.a.C0291a.g(hf.a, long, boolean):void");
        }

        public final a c() throws InterruptedException {
            a aVar = a.f11916n;
            ae.r.c(aVar);
            a aVar2 = aVar.f11918g;
            long jNanoTime = System.nanoTime();
            if (aVar2 == null) {
                e().await(a.f11914l, TimeUnit.MILLISECONDS);
                a aVar3 = a.f11916n;
                ae.r.c(aVar3);
                if (aVar3.f11918g != null || System.nanoTime() - jNanoTime < a.f11915m) {
                    return null;
                }
                return a.f11916n;
            }
            long jZ = aVar2.z(jNanoTime);
            if (jZ > 0) {
                e().await(jZ, TimeUnit.NANOSECONDS);
                return null;
            }
            a aVar4 = a.f11916n;
            ae.r.c(aVar4);
            aVar4.f11918g = aVar2.f11918g;
            aVar2.f11918g = null;
            return aVar2;
        }

        public final Condition e() {
            return a.f11913k;
        }

        public final ReentrantLock f() {
            return a.f11912j;
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockF;
            a aVarC;
            while (true) {
                try {
                    C0291a c0291a = a.f11911i;
                    reentrantLockF = c0291a.f();
                    reentrantLockF.lock();
                    try {
                        aVarC = c0291a.c();
                    } finally {
                        reentrantLockF.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (aVarC == a.f11916n) {
                    a.f11916n = null;
                    return;
                }
                md.i0 i0Var = md.i0.f15558a;
                reentrantLockF.unlock();
                if (aVarC != null) {
                    aVarC.C();
                }
            }
        }
    }

    public static final class c implements g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f11921b;

        c(g0 g0Var) {
            this.f11921b = g0Var;
        }

        @Override // hf.g0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a e() {
            return a.this;
        }

        @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            g0 g0Var = this.f11921b;
            aVar.w();
            try {
                g0Var.close();
                md.i0 i0Var = md.i0.f15558a;
                if (aVar.x()) {
                    throw aVar.q(null);
                }
            } catch (IOException e10) {
                if (!aVar.x()) {
                    throw e10;
                }
                throw aVar.q(e10);
            } finally {
                aVar.x();
            }
        }

        @Override // hf.g0, java.io.Flushable
        public void flush() throws IOException {
            a aVar = a.this;
            g0 g0Var = this.f11921b;
            aVar.w();
            try {
                g0Var.flush();
                md.i0 i0Var = md.i0.f15558a;
                if (aVar.x()) {
                    throw aVar.q(null);
                }
            } catch (IOException e10) {
                if (!aVar.x()) {
                    throw e10;
                }
                throw aVar.q(e10);
            } finally {
                aVar.x();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f11921b + ')';
        }

        @Override // hf.g0
        public void v(hf.c cVar, long j10) throws IOException {
            ae.r.f(cVar, "source");
            o0.b(cVar.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                d0 d0Var = cVar.f11933a;
                while (true) {
                    ae.r.c(d0Var);
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (d0Var.f11950c - d0Var.f11949b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    d0Var = d0Var.f11953f;
                }
                a aVar = a.this;
                g0 g0Var = this.f11921b;
                aVar.w();
                try {
                    g0Var.v(cVar, j11);
                    md.i0 i0Var = md.i0.f15558a;
                    if (aVar.x()) {
                        throw aVar.q(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!aVar.x()) {
                        throw e10;
                    }
                    throw aVar.q(e10);
                } finally {
                    aVar.x();
                }
            }
        }
    }

    public static final class d implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f11923b;

        d(i0 i0Var) {
            this.f11923b = i0Var;
        }

        @Override // hf.i0
        public long X(hf.c cVar, long j10) throws IOException {
            ae.r.f(cVar, "sink");
            a aVar = a.this;
            i0 i0Var = this.f11923b;
            aVar.w();
            try {
                long jX = i0Var.X(cVar, j10);
                if (aVar.x()) {
                    throw aVar.q(null);
                }
                return jX;
            } catch (IOException e10) {
                if (aVar.x()) {
                    throw aVar.q(e10);
                }
                throw e10;
            } finally {
                aVar.x();
            }
        }

        @Override // hf.i0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a e() {
            return a.this;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            i0 i0Var = this.f11923b;
            aVar.w();
            try {
                i0Var.close();
                md.i0 i0Var2 = md.i0.f15558a;
                if (aVar.x()) {
                    throw aVar.q(null);
                }
            } catch (IOException e10) {
                if (!aVar.x()) {
                    throw e10;
                }
                throw aVar.q(e10);
            } finally {
                aVar.x();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f11923b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f11912j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        ae.r.e(conditionNewCondition, "lock.newCondition()");
        f11913k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f11914l = millis;
        f11915m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z(long j10) {
        return this.f11919h - j10;
    }

    public final g0 A(g0 g0Var) {
        ae.r.f(g0Var, "sink");
        return new c(g0Var);
    }

    public final i0 B(i0 i0Var) {
        ae.r.f(i0Var, "source");
        return new d(i0Var);
    }

    protected void C() {
    }

    public final IOException q(IOException iOException) {
        return y(iOException);
    }

    public final void w() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            f11911i.g(this, jH, zE);
        }
    }

    public final boolean x() {
        return f11911i.d(this);
    }

    protected IOException y(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
