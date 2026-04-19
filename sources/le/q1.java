package le;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends p1 implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f15107d;

    public q1(Executor executor) {
        this.f15107d = executor;
        qe.c.a(l0());
    }

    private final void k0(qd.g gVar, RejectedExecutionException rejectedExecutionException) {
        e2.d(gVar, o1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> m0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, qd.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            k0(gVar, e10);
            return null;
        }
    }

    @Override // le.w0
    public void Y(long j10, o<? super md.i0> oVar) {
        Executor executorL0 = l0();
        ScheduledExecutorService scheduledExecutorService = executorL0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorL0 : null;
        ScheduledFuture<?> scheduledFutureM0 = scheduledExecutorService != null ? m0(scheduledExecutorService, new t2(this, oVar), oVar.getContext(), j10) : null;
        if (scheduledFutureM0 != null) {
            e2.j(oVar, scheduledFutureM0);
        } else {
            s0.f15110i.Y(j10, oVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorL0 = l0();
        ExecutorService executorService = executorL0 instanceof ExecutorService ? (ExecutorService) executorL0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof q1) && ((q1) obj).l0() == l0();
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        try {
            Executor executorL0 = l0();
            c.a();
            executorL0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            k0(gVar, e10);
            d1.b().g0(gVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(l0());
    }

    @Override // le.w0
    public f1 l(long j10, Runnable runnable, qd.g gVar) {
        Executor executorL0 = l0();
        ScheduledExecutorService scheduledExecutorService = executorL0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorL0 : null;
        ScheduledFuture<?> scheduledFutureM0 = scheduledExecutorService != null ? m0(scheduledExecutorService, runnable, gVar, j10) : null;
        return scheduledFutureM0 != null ? new e1(scheduledFutureM0) : s0.f15110i.l(j10, runnable, gVar);
    }

    public Executor l0() {
        return this.f15107d;
    }

    @Override // le.j0
    public String toString() {
        return l0().toString();
    }
}
