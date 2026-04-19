package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class z0<T> extends qe.d0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15130e = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_decision");
    private volatile int _decision;

    public z0(qd.g gVar, qd.d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15130e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15130e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15130e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15130e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // qe.d0, le.a
    protected void O0(Object obj) {
        if (T0()) {
            return;
        }
        qe.k.c(rd.c.c(this.f19049d), g0.a(obj, this.f19049d), null, 2, null);
    }

    public final Object S0() {
        if (U0()) {
            return rd.d.e();
        }
        Object objH = j2.h(f0());
        if (objH instanceof c0) {
            throw ((c0) objH).f14990a;
        }
        return objH;
    }

    @Override // qe.d0, le.i2
    protected void x(Object obj) {
        O0(obj);
    }
}
