package le;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f15025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j1 f15026e;

    public g(qd.g gVar, Thread thread, j1 j1Var) {
        super(gVar, true, true);
        this.f15025d = thread;
        this.f15026e = j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T S0() throws Throwable {
        c.a();
        try {
            j1 j1Var = this.f15026e;
            if (j1Var != null) {
                j1.q0(j1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    j1 j1Var2 = this.f15026e;
                    long jT0 = j1Var2 != null ? j1Var2.t0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        c.a();
                        T t10 = (T) j2.h(f0());
                        c0Var = t10 instanceof c0 ? (c0) t10 : null;
                        if (c0Var == null) {
                            return t10;
                        }
                        throw c0Var.f14990a;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jT0);
                } finally {
                    j1 j1Var3 = this.f15026e;
                    if (j1Var3 != null) {
                        j1.l0(j1Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            D(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    @Override // le.i2
    protected boolean j0() {
        return true;
    }

    @Override // le.i2
    protected void x(Object obj) {
        if (ae.r.b(Thread.currentThread(), this.f15025d)) {
            return;
        }
        Thread thread = this.f15025d;
        c.a();
        LockSupport.unpark(thread);
    }
}
