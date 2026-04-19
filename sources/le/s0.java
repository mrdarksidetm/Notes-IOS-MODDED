package le;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import le.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends k1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0 f15110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f15111j;

    static {
        Long l10;
        s0 s0Var = new s0();
        f15110i = s0Var;
        j1.q0(s0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f15111j = timeUnit.toNanos(l10.longValue());
    }

    private s0() {
    }

    private final synchronized void M0() {
        if (P0()) {
            debugStatus = 3;
            G0();
            ae.r.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread N0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean O0() {
        return debugStatus == 4;
    }

    private final boolean P0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean Q0() {
        if (P0()) {
            return false;
        }
        debugStatus = 1;
        ae.r.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void R0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // le.k1
    public void C0(Runnable runnable) {
        if (O0()) {
            R0();
        }
        super.C0(runnable);
    }

    @Override // le.k1, le.w0
    public f1 l(long j10, Runnable runnable, qd.g gVar) {
        return J0(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zE0;
        y2.f15128a.d(this);
        c.a();
        try {
            if (!Q0()) {
                if (zE0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jT0 = t0();
                if (jT0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f15111j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        M0();
                        c.a();
                        if (E0()) {
                            return;
                        }
                        w0();
                        return;
                    }
                    jT0 = ge.o.i(jT0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jT0 > 0) {
                    if (P0()) {
                        _thread = null;
                        M0();
                        c.a();
                        if (E0()) {
                            return;
                        }
                        w0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jT0);
                }
            }
        } finally {
            _thread = null;
            M0();
            c.a();
            if (!E0()) {
                w0();
            }
        }
    }

    @Override // le.k1, le.j1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // le.l1
    protected Thread w0() {
        Thread thread = _thread;
        return thread == null ? N0() : thread;
    }

    @Override // le.l1
    protected void x0(long j10, k1.c cVar) {
        R0();
    }
}
