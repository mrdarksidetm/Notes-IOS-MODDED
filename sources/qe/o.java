package qe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import le.f1;
import le.t0;
import le.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends le.j0 implements w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f19080h = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final le.j0 f19081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ w0 f19083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t<Runnable> f19084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f19085g;
    private volatile int runningWorkers;

    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f19086a;

        public a(Runnable runnable) {
            this.f19086a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f19086a.run();
                } catch (Throwable th) {
                    le.l0.a(qd.h.f19040a, th);
                }
                Runnable runnableM0 = o.this.m0();
                if (runnableM0 == null) {
                    return;
                }
                this.f19086a = runnableM0;
                i10++;
                if (i10 >= 16 && o.this.f19081c.i0(o.this)) {
                    o.this.f19081c.g0(o.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(le.j0 j0Var, int i10) {
        this.f19081c = j0Var;
        this.f19082d = i10;
        w0 w0Var = j0Var instanceof w0 ? (w0) j0Var : null;
        this.f19083e = w0Var == null ? t0.a() : w0Var;
        this.f19084f = new t<>(false);
        this.f19085g = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable m0() {
        while (true) {
            Runnable runnableD = this.f19084f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f19085g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19080h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f19084f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean n0() {
        boolean z10;
        synchronized (this.f19085g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19080h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f19082d) {
                z10 = false;
            } else {
                atomicIntegerFieldUpdater.incrementAndGet(this);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // le.w0
    public void Y(long j10, le.o<? super md.i0> oVar) {
        this.f19083e.Y(j10, oVar);
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        Runnable runnableM0;
        this.f19084f.a(runnable);
        if (f19080h.get(this) >= this.f19082d || !n0() || (runnableM0 = m0()) == null) {
            return;
        }
        this.f19081c.g0(this, new a(runnableM0));
    }

    @Override // le.j0
    public void h0(qd.g gVar, Runnable runnable) {
        Runnable runnableM0;
        this.f19084f.a(runnable);
        if (f19080h.get(this) >= this.f19082d || !n0() || (runnableM0 = m0()) == null) {
            return;
        }
        this.f19081c.h0(this, new a(runnableM0));
    }

    @Override // le.j0
    public le.j0 j0(int i10) {
        p.a(i10);
        return i10 >= this.f19082d ? this : super.j0(i10);
    }

    @Override // le.w0
    public f1 l(long j10, Runnable runnable, qd.g gVar) {
        return this.f19083e.l(j10, runnable, gVar);
    }
}
