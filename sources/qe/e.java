package qe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qe.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<N extends e<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19050a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19051b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N n10 = (N) g();
        while (n10 != null && n10.h()) {
            n10 = (N) f19051b.get(n10);
        }
        return n10;
    }

    private final N d() {
        e eVarE;
        N n10 = (N) e();
        ae.r.c(n10);
        while (n10.h() && (eVarE = n10.e()) != null) {
            n10 = (N) eVarE;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f19050a.get(this);
    }

    public final void b() {
        f19051b.lazySet(this, null);
    }

    public final N e() {
        Object objF = f();
        if (objF == d.f19048a) {
            return null;
        }
        return (N) objF;
    }

    public final N g() {
        return (N) f19051b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return b3.b.a(f19050a, this, null, d.f19048a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            e eVarC = c();
            e eVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19051b;
            do {
                obj = atomicReferenceFieldUpdater.get(eVarD);
            } while (!b3.b.a(atomicReferenceFieldUpdater, eVarD, obj, ((e) obj) == null ? null : eVarC));
            if (eVarC != null) {
                f19050a.set(eVarC, eVarD);
            }
            if (!eVarD.h() || eVarD.i()) {
                if (eVarC == null || !eVarC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return b3.b.a(f19050a, this, null, n10);
    }
}
