package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k1 extends l1 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15076f = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_queue");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15077g = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15078h = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o<md.i0> f15079c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, o<? super md.i0> oVar) {
            super(j10);
            this.f15079c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15079c.j(k1.this, md.i0.f15558a);
        }

        @Override // le.k1.c
        public String toString() {
            return super.toString() + this.f15079c;
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f15081c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f15081c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15081c.run();
        }

        @Override // le.k1.c
        public String toString() {
            return super.toString() + this.f15081c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, f1, qe.o0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15083b = -1;

        public c(long j10) {
            this.f15082a = j10;
        }

        @Override // qe.o0
        public qe.n0<?> b() {
            Object obj = this._heap;
            if (obj instanceof qe.n0) {
                return (qe.n0) obj;
            }
            return null;
        }

        @Override // qe.o0
        public void c(qe.n0<?> n0Var) {
            if (!(this._heap != n1.f15090a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = n0Var;
        }

        @Override // le.f1
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == n1.f15090a) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.g(this);
                }
                this._heap = n1.f15090a;
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        @Override // qe.o0
        public int getIndex() {
            return this.f15083b;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f15082a - cVar.f15082a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int j(long r8, le.k1.d r10, le.k1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                qe.h0 r1 = le.n1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                qe.o0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                le.k1$c r0 = (le.k1.c) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = le.k1.z0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f15084c = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f15082a     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f15084c     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f15082a     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f15084c     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f15082a = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: le.k1.c.j(long, le.k1$d, le.k1):int");
        }

        public final boolean l(long j10) {
            return j10 - this.f15082a >= 0;
        }

        @Override // qe.o0
        public void setIndex(int i10) {
            this.f15083b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15082a + ']';
        }
    }

    public static final class d extends qe.n0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15084c;

        public d(long j10) {
            this.f15084c = j10;
        }
    }

    private final void A0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15076f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (b3.b.a(f15076f, this, null, n1.f15091b)) {
                    return;
                }
            } else if (obj instanceof qe.u) {
                ((qe.u) obj).d();
                return;
            } else {
                if (obj == n1.f15091b) {
                    return;
                }
                qe.u uVar = new qe.u(8, true);
                ae.r.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.a((Runnable) obj);
                if (b3.b.a(f15076f, this, obj, uVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable B0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15076f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof qe.u) {
                ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                qe.u uVar = (qe.u) obj;
                Object objJ = uVar.j();
                if (objJ != qe.u.f19102h) {
                    return (Runnable) objJ;
                }
                b3.b.a(f15076f, this, obj, uVar.i());
            } else {
                if (obj == n1.f15091b) {
                    return null;
                }
                if (b3.b.a(f15076f, this, obj, null)) {
                    ae.r.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean D0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15076f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (b3.b.a(f15076f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof qe.u) {
                ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                qe.u uVar = (qe.u) obj;
                int iA = uVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    b3.b.a(f15076f, this, obj, uVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == n1.f15091b) {
                    return false;
                }
                qe.u uVar2 = new qe.u(8, true);
                ae.r.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.a((Runnable) obj);
                uVar2.a(runnable);
                if (b3.b.a(f15076f, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    private final void F0() {
        c cVarI;
        le.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f15077g.get(this);
            if (dVar == null || (cVarI = dVar.i()) == null) {
                return;
            } else {
                x0(jNanoTime, cVarI);
            }
        }
    }

    private final int I0(long j10, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15077g;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            b3.b.a(atomicReferenceFieldUpdater, this, null, new d(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            ae.r.c(obj);
            dVar = (d) obj;
        }
        return cVar.j(j10, dVar, this);
    }

    private final void K0(boolean z10) {
        f15078h.set(this, z10 ? 1 : 0);
    }

    private final boolean L0(c cVar) {
        d dVar = (d) f15077g.get(this);
        return (dVar != null ? dVar.e() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f15078h.get(this) != 0;
    }

    public void C0(Runnable runnable) {
        if (D0(runnable)) {
            y0();
        } else {
            s0.f15110i.C0(runnable);
        }
    }

    protected boolean E0() {
        if (!s0()) {
            return false;
        }
        d dVar = (d) f15077g.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f15076f.get(this);
        if (obj != null) {
            if (obj instanceof qe.u) {
                return ((qe.u) obj).g();
            }
            if (obj != n1.f15091b) {
                return false;
            }
        }
        return true;
    }

    protected final void G0() {
        f15076f.set(this, null);
        f15077g.set(this, null);
    }

    public final void H0(long j10, c cVar) {
        int iI0 = I0(j10, cVar);
        if (iI0 == 0) {
            if (L0(cVar)) {
                y0();
            }
        } else if (iI0 == 1) {
            x0(j10, cVar);
        } else if (iI0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    protected final f1 J0(long j10, Runnable runnable) {
        long jC = n1.c(j10);
        if (jC >= 4611686018427387903L) {
            return o2.f15092a;
        }
        le.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        H0(jNanoTime, bVar);
        return bVar;
    }

    @Override // le.w0
    public void Y(long j10, o<? super md.i0> oVar) {
        long jC = n1.c(j10);
        if (jC < 4611686018427387903L) {
            le.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, oVar);
            H0(jNanoTime, aVar);
            r.a(oVar, aVar);
        }
    }

    @Override // le.j0
    public final void g0(qd.g gVar, Runnable runnable) {
        C0(runnable);
    }

    @Override // le.w0
    public f1 l(long j10, Runnable runnable, qd.g gVar) {
        return w0.a.a(this, j10, runnable, gVar);
    }

    @Override // le.j1
    protected long o0() {
        c cVarE;
        if (super.o0() == 0) {
            return 0L;
        }
        Object obj = f15076f.get(this);
        if (obj != null) {
            if (!(obj instanceof qe.u)) {
                return obj == n1.f15091b ? Long.MAX_VALUE : 0L;
            }
            if (!((qe.u) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f15077g.get(this);
        if (dVar == null || (cVarE = dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarE.f15082a;
        le.c.a();
        return ge.o.e(j10 - System.nanoTime(), 0L);
    }

    @Override // le.j1
    public void shutdown() {
        y2.f15128a.c();
        K0(true);
        A0();
        while (t0() <= 0) {
        }
        F0();
    }

    @Override // le.j1
    public long t0() {
        c cVarH;
        if (u0()) {
            return 0L;
        }
        d dVar = (d) f15077g.get(this);
        if (dVar != null && !dVar.d()) {
            le.c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    cVarH = null;
                    if (cVarB != null) {
                        c cVar = cVarB;
                        if (cVar.l(jNanoTime) ? D0(cVar) : false) {
                            cVarH = dVar.h(0);
                        }
                    }
                }
            } while (cVarH != null);
        }
        Runnable runnableB0 = B0();
        if (runnableB0 == null) {
            return o0();
        }
        runnableB0.run();
        return 0L;
    }
}
