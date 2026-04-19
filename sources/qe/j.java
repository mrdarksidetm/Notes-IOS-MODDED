package qe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.a1;
import le.j1;
import le.r0;
import le.y2;

/* JADX INFO: loaded from: classes2.dex */
public final class j<T> extends a1<T> implements sd.c, qd.d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19061h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final le.j0 f19062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd.d<T> f19063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f19065g;

    /* JADX WARN: Multi-variable type inference failed */
    public j(le.j0 j0Var, qd.d<? super T> dVar) {
        super(-1);
        this.f19062d = j0Var;
        this.f19063e = dVar;
        this.f19064f = k.f19067a;
        this.f19065g = l0.b(getContext());
    }

    private final le.p<?> o() {
        Object obj = f19061h.get(this);
        if (obj instanceof le.p) {
            return (le.p) obj;
        }
        return null;
    }

    @Override // le.a1
    public void a(Object obj, Throwable th) {
        if (obj instanceof le.d0) {
            ((le.d0) obj).f14999b.invoke(th);
        }
    }

    @Override // le.a1
    public qd.d<T> c() {
        return this;
    }

    @Override // sd.c
    public sd.c getCallerFrame() {
        qd.d<T> dVar = this.f19063e;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // qd.d
    public qd.g getContext() {
        return this.f19063e.getContext();
    }

    @Override // le.a1
    public Object i() {
        Object obj = this.f19064f;
        this.f19064f = k.f19067a;
        return obj;
    }

    public final void k() {
        while (f19061h.get(this) == k.f19068b) {
        }
    }

    public final le.p<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19061h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f19061h.set(this, k.f19068b);
                return null;
            }
            if (obj instanceof le.p) {
                if (b3.b.a(f19061h, this, obj, k.f19068b)) {
                    return (le.p) obj;
                }
            } else if (obj != k.f19068b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(qd.g gVar, T t10) {
        this.f19064f = t10;
        this.f14979c = 1;
        this.f19062d.h0(gVar, this);
    }

    public final boolean q() {
        return f19061h.get(this) != null;
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        qd.g context = this.f19063e.getContext();
        Object objD = le.g0.d(obj, null, 1, null);
        if (this.f19062d.i0(context)) {
            this.f19064f = objD;
            this.f14979c = 0;
            this.f19062d.g0(context, this);
            return;
        }
        j1 j1VarB = y2.f15128a.b();
        if (j1VarB.r0()) {
            this.f19064f = objD;
            this.f14979c = 0;
            j1VarB.n0(this);
            return;
        }
        j1VarB.p0(true);
        try {
            qd.g context2 = getContext();
            Object objC = l0.c(context2, this.f19065g);
            try {
                this.f19063e.resumeWith(obj);
                md.i0 i0Var = md.i0.f15558a;
                while (j1VarB.u0()) {
                }
            } finally {
                l0.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19061h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = k.f19068b;
            if (ae.r.b(obj, h0Var)) {
                if (b3.b.a(f19061h, this, h0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (b3.b.a(f19061h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        k();
        le.p<?> pVarO = o();
        if (pVarO != null) {
            pVarO.s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f19062d + ", " + r0.c(this.f19063e) + ']';
    }

    public final Throwable u(le.o<?> oVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19061h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0Var = k.f19068b;
            if (obj != h0Var) {
                if (obj instanceof Throwable) {
                    if (b3.b.a(f19061h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!b3.b.a(f19061h, this, h0Var, oVar));
        return null;
    }
}
