package qe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import le.p2;
import qe.e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0<S extends e0<S>> extends e<S> implements p2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f19052d = AtomicIntegerFieldUpdater.newUpdater(e0.class, "cleanedAndPointers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19053c;
    private volatile int cleanedAndPointers;

    public e0(long j10, S s10, int i10) {
        super(s10);
        this.f19053c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // qe.e
    public boolean h() {
        return f19052d.get(this) == n() && !i();
    }

    public final boolean m() {
        return f19052d.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, qd.g gVar);

    public final void p() {
        if (f19052d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19052d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
