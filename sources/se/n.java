package se;

import ae.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20579b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f20580c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f20581d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f20582e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<h> f20583a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f20567b.b() == 1) {
            f20582e.incrementAndGet(this);
        }
        int i10 = f20580c.get(this) & 127;
        while (this.f20583a.get(i10) != null) {
            Thread.yield();
        }
        this.f20583a.lazySet(i10, hVar);
        f20580c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            if (hVar.f20567b.b() == 1) {
                f20582e.decrementAndGet(this);
            }
        }
    }

    private final int d() {
        return f20580c.get(this) - f20581d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20581d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f20580c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f20583a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f20579b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f20567b.b() == 1) == z10) {
                }
            }
            int i10 = f20581d.get(this);
            int i11 = f20580c.get(this);
            while (i10 != i11) {
                if (z10 && f20582e.get(this) == 0) {
                    return null;
                }
                i11--;
                h hVarM = m(i11, z10);
                if (hVarM != null) {
                    return hVarM;
                }
            }
            return null;
        } while (!b3.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f20581d.get(this);
        int i12 = f20580c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f20582e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarM = m(i11, z10);
            if (hVarM != null) {
                return hVarM;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f20583a.get(i11);
        if (hVar != null) {
            if ((hVar.f20567b.b() == 1) == z10 && ne.i.a(this.f20583a, i11, hVar, null)) {
                if (z10) {
                    f20582e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, se.h] */
    private final long o(int i10, h0<h> h0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f20579b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f20567b.b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = l.f20575f.a() - r12.f20566a;
            long j10 = l.f20571b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!b3.b.a(atomicReferenceFieldUpdater, this, r12, null));
        h0Var.f712a = r12;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f20579b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f20579b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f20579b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f20579b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i10, h0<h> h0Var) {
        T tI = i10 == 3 ? i() : l(i10);
        if (tI == 0) {
            return o(i10, h0Var);
        }
        h0Var.f712a = tI;
        return -1L;
    }
}
