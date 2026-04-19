package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class z2 implements zd.l<Throwable, md.i0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15132d = AtomicIntegerFieldUpdater.newUpdater(z2.class, "_state");
    private volatile int _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2 f15133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f15134b = Thread.currentThread();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f15135c;

    public z2(a2 a2Var) {
        this.f15133a = a2Var;
    }

    private final Void b(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15132d;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw new md.i();
                    }
                }
            } else if (f15132d.compareAndSet(this, i10, 1)) {
                f1 f1Var = this.f15135c;
                if (f1Var != null) {
                    f1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void c(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f15132d;
        do {
            i10 = atomicIntegerFieldUpdater2.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new md.i();
            }
            atomicIntegerFieldUpdater = f15132d;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f15134b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void d() {
        int i10;
        this.f15135c = this.f15133a.invokeOnCompletion(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15132d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new md.i();
            }
        } while (!f15132d.compareAndSet(this, i10, 0));
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        c(th);
        return md.i0.f15558a;
    }
}
