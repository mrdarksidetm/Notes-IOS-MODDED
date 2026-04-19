package se;

import ae.r;
import com.google.android.gms.common.api.a;
import ge.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import le.r0;
import md.i0;
import qe.c0;
import qe.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0422a f20529h = new C0422a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f20530i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f20531j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f20532k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0 f20533l = new h0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20536c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final se.d f20538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se.d f20539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0<c> f20540g;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: se.a$a, reason: collision with other inner class name */
    public static final class C0422a {
        private C0422a() {
        }

        public /* synthetic */ C0422a(ae.j jVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20541a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20541a = iArr;
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f20542i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f20543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ae.h0<h> f20544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f20545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f20548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f20549g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f20543a = new n();
            this.f20544b = new ae.h0<>();
            this.f20545c = d.DORMANT;
            this.nextParkedWorker = a.f20533l;
            this.f20548f = ee.c.f10965a.c();
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f20531j.addAndGet(a.this, -2097152L);
            if (this.f20545c != d.TERMINATED) {
                this.f20545c = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.U();
            }
        }

        private final void d(h hVar) {
            int iB = hVar.f20567b.b();
            k(iB);
            c(iB);
            a.this.M(hVar);
            b(iB);
        }

        private final h e(boolean z10) {
            h hVarO;
            h hVarO2;
            if (z10) {
                boolean z11 = m(a.this.f20534a * 2) == 0;
                if (z11 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarG = this.f20543a.g();
                if (hVarG != null) {
                    return hVarG;
                }
                if (!z11 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        private final h f() {
            h hVarH = this.f20543a.h();
            if (hVarH != null) {
                return hVarH;
            }
            h hVarD = a.this.f20539f.d();
            return hVarD == null ? v(1) : hVarD;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f20542i;
        }

        private final void k(int i10) {
            this.f20546d = 0L;
            if (this.f20545c == d.PARKING) {
                this.f20545c = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f20533l;
        }

        private final void n() {
            if (this.f20546d == 0) {
                this.f20546d = System.nanoTime() + a.this.f20536c;
            }
            LockSupport.parkNanos(a.this.f20536c);
            if (System.nanoTime() - this.f20546d >= 0) {
                this.f20546d = 0L;
                w();
            }
        }

        private final h o() {
            se.d dVar;
            if (m(2) == 0) {
                h hVarD = a.this.f20538e.d();
                if (hVarD != null) {
                    return hVarD;
                }
                dVar = a.this.f20539f;
            } else {
                h hVarD2 = a.this.f20539f.d();
                if (hVarD2 != null) {
                    return hVarD2;
                }
                dVar = a.this.f20538e;
            }
            return dVar.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f20545c != d.TERMINATED) {
                    h hVarG = g(this.f20549g);
                    if (hVarG != null) {
                        this.f20547e = 0L;
                        d(hVarG);
                    } else {
                        this.f20549g = false;
                        if (this.f20547e == 0) {
                            t();
                        } else if (z10) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f20547e);
                            this.f20547e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f20545c != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20531j;
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (a.f20531j.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f20545c = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.H(this);
                return;
            }
            f20542i.set(this, -1);
            while (l() && f20542i.get(this) == -1 && !a.this.isTerminated() && this.f20545c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f20531j.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM = m(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM++;
                if (iM > i11) {
                    iM = 1;
                }
                c cVarB = aVar.f20540g.b(iM);
                if (cVarB != null && cVarB != this) {
                    long jN = cVarB.f20543a.n(i10, this.f20544b);
                    if (jN == -1) {
                        ae.h0<h> h0Var = this.f20544b;
                        h hVar = h0Var.f712a;
                        h0Var.f712a = null;
                        return hVar;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f20547e = jMin;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f20540g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f20531j.get(aVar) & 2097151)) <= aVar.f20534a) {
                    return;
                }
                if (f20542i.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    q(0);
                    aVar.L(this, i10, 0);
                    int andDecrement = (int) (a.f20531j.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c cVarB = aVar.f20540g.b(andDecrement);
                        r.c(cVarB);
                        c cVar = cVarB;
                        aVar.f20540g.c(i10, cVar);
                        cVar.q(i10);
                        aVar.L(cVar, andDecrement, i10);
                    }
                    aVar.f20540g.c(andDecrement, null);
                    i0 i0Var = i0.f15558a;
                    this.f20545c = d.TERMINATED;
                }
            }
        }

        public final h g(boolean z10) {
            return s() ? e(z10) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f20548f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f20548f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & a.e.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f20537d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f20545c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f20531j.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f20545c = dVar;
            }
            return z10;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f20534a = i10;
        this.f20535b = i11;
        this.f20536c = j10;
        this.f20537d = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f20538e = new se.d();
        this.f20539f = new se.d();
        this.f20540g = new c0<>((i10 + 1) * 2);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void C(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f20576g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.A(runnable, iVar, z10);
    }

    private final int E(c cVar) {
        int iH;
        do {
            Object objI = cVar.i();
            if (objI == f20533l) {
                return -1;
            }
            if (objI == null) {
                return 0;
            }
            cVar = (c) objI;
            iH = cVar.h();
        } while (iH == 0);
        return iH;
    }

    private final c G() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20530i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f20540g.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iE = E(cVarB);
            if (iE >= 0 && f20530i.compareAndSet(this, j10, ((long) iE) | j11)) {
                cVarB.r(f20533l);
                return cVarB;
            }
        }
    }

    private final void Q(long j10, boolean z10) {
        if (z10 || h0() || Z(j10)) {
            return;
        }
        h0();
    }

    private final h Y(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f20545c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f20567b.b() == 0 && cVar.f20545c == d.BLOCKING) {
            return hVar;
        }
        cVar.f20549g = true;
        return cVar.f20543a.a(hVar, z10);
    }

    private final boolean Z(long j10) {
        if (o.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f20534a) {
            int iO = o();
            if (iO == 1 && this.f20534a > 1) {
                o();
            }
            if (iO > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean g0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f20531j.get(aVar);
        }
        return aVar.Z(j10);
    }

    private final boolean h0() {
        c cVarG;
        do {
            cVarG = G();
            if (cVarG == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarG, -1, 0));
        LockSupport.unpark(cVarG);
        return true;
    }

    private final boolean l(h hVar) {
        return (hVar.f20567b.b() == 1 ? this.f20539f : this.f20538e).a(hVar);
    }

    private final int o() {
        synchronized (this.f20540g) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20531j;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            int iD = o.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (iD >= this.f20534a) {
                return 0;
            }
            if (i10 >= this.f20535b) {
                return 0;
            }
            int i11 = ((int) (f20531j.get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f20540g.b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f20540g.c(i11, cVar);
            if (!(i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = iD + 1;
            cVar.start();
            return i12;
        }
    }

    private final c y() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !r.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void A(Runnable runnable, i iVar, boolean z10) {
        le.c.a();
        h hVarW = w(runnable, iVar);
        boolean z11 = false;
        boolean z12 = hVarW.f20567b.b() == 1;
        long jAddAndGet = z12 ? f20531j.addAndGet(this, 2097152L) : 0L;
        c cVarY = y();
        h hVarY = Y(cVarY, hVarW, z10);
        if (hVarY != null && !l(hVarY)) {
            throw new RejectedExecutionException(this.f20537d + " was terminated");
        }
        if (z10 && cVarY != null) {
            z11 = true;
        }
        if (z12) {
            Q(jAddAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            U();
        }
    }

    public final boolean H(c cVar) {
        long j10;
        int iH;
        if (cVar.i() != f20533l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20530i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.f20540g.b((int) (2097151 & j10)));
        } while (!f20530i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iH)));
        return true;
    }

    public final void L(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20530i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iE = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iE == i10) {
                iE = i11 == 0 ? E(cVar) : i11;
            }
            if (iE >= 0 && f20530i.compareAndSet(this, j10, j11 | ((long) iE))) {
                return;
            }
        }
    }

    public final void M(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = se.a.f20532k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            se.a$c r0 = r7.y()
            qe.c0<se.a$c> r1 = r7.f20540g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L23:
            qe.c0<se.a$c> r4 = r7.f20540g
            java.lang.Object r4 = r4.b(r1)
            ae.r.c(r4)
            se.a$c r4 = (se.a.c) r4
            if (r4 == r0) goto L44
        L30:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L30
        L3d:
            se.n r4 = r4.f20543a
            se.d r5 = r7.f20539f
            r4.f(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            se.d r8 = r7.f20539f
            r8.b()
            se.d r8 = r7.f20538e
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            se.h r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            se.d r8 = r7.f20538e
            java.lang.Object r8 = r8.d()
            se.h r8 = (se.h) r8
            if (r8 != 0) goto L83
            se.d r8 = r7.f20539f
            java.lang.Object r8 = r8.d()
            se.h r8 = (se.h) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            se.a$d r8 = se.a.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = se.a.f20530i
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = se.a.f20531j
            r8.set(r7, r0)
            return
        L83:
            r7.M(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: se.a.P(long):void");
    }

    public final void U() {
        if (h0() || g0(this, 0L, 1, null)) {
            return;
        }
        h0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        P(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return f20532k.get(this) != 0;
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int iA = this.f20540g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f20540g.b(i15);
            if (cVarB != null) {
                int iE = cVarB.f20543a.e();
                int i16 = b.f20541a[cVarB.f20545c.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(iE);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(iE);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (iE > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(iE);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = f20531j.get(this);
        return this.f20537d + '@' + r0.b(this) + "[Pool Size {core = " + this.f20534a + ", max = " + this.f20535b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20538e.c() + ", global blocking queue size = " + this.f20539f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f20534a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final h w(Runnable runnable, i iVar) {
        long jA = l.f20575f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f20566a = jA;
        hVar.f20567b = iVar;
        return hVar;
    }
}
