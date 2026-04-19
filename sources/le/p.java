package le;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.a2;

/* JADX INFO: loaded from: classes2.dex */
public class p<T> extends a1<T> implements o<T>, sd.c, g3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15093f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15094g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15095h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd.d<T> f15096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd.g f15097e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(qd.d<? super T> dVar, int i10) {
        super(i10);
        this.f15096d = dVar;
        this.f15097e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f14997a;
    }

    private final f1 B() {
        a2 a2Var = (a2) getContext().get(a2.R);
        if (a2Var == null) {
            return null;
        }
        f1 f1VarE = a2.a.e(a2Var, true, false, new t(this), 2, null);
        b3.b.a(f15095h, this, null, f1VarE);
        return f1VarE;
    }

    private final void C(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d)) {
                if (obj2 instanceof m ? true : obj2 instanceof qe.e0) {
                    F(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof c0;
                    if (z10) {
                        c0 c0Var = (c0) obj2;
                        if (!c0Var.b()) {
                            F(obj, obj2);
                        }
                        if (obj2 instanceof s) {
                            if (!z10) {
                                c0Var = null;
                            }
                            Throwable th = c0Var != null ? c0Var.f14990a : null;
                            if (obj instanceof m) {
                                m((m) obj, th);
                                return;
                            } else {
                                ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                o((qe.e0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof b0) {
                        b0 b0Var = (b0) obj2;
                        if (b0Var.f14983b != null) {
                            F(obj, obj2);
                        }
                        if (obj instanceof qe.e0) {
                            return;
                        }
                        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        m mVar = (m) obj;
                        if (b0Var.c()) {
                            m(mVar, b0Var.f14986e);
                            return;
                        } else {
                            if (b3.b.a(f15094g, this, obj2, b0.b(b0Var, null, mVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof qe.e0) {
                            return;
                        }
                        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (b3.b.a(f15094g, this, obj2, new b0(obj2, (m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (b3.b.a(f15094g, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean D() {
        if (b1.c(this.f14979c)) {
            qd.d<T> dVar = this.f15096d;
            ae.r.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((qe.j) dVar).q()) {
                return true;
            }
        }
        return false;
    }

    private final m E(zd.l<? super Throwable, md.i0> lVar) {
        return lVar instanceof m ? (m) lVar : new x1(lVar);
    }

    private final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void K(Object obj, int i10, zd.l<? super Throwable, md.i0> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof p2)) {
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.c()) {
                        if (lVar != null) {
                            n(lVar, sVar.f14990a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new md.i();
            }
        } while (!b3.b.a(f15094g, this, obj2, M((p2) obj2, obj, i10, lVar, null)));
        t();
        u(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void L(p pVar, Object obj, int i10, zd.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        pVar.K(obj, i10, lVar);
    }

    private final Object M(p2 p2Var, Object obj, int i10, zd.l<? super Throwable, md.i0> lVar, Object obj2) {
        if (obj instanceof c0) {
            return obj;
        }
        if (!b1.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(p2Var instanceof m) && obj2 == null) {
            return obj;
        }
        return new b0(obj, p2Var instanceof m ? (m) p2Var : null, lVar, obj2, null, 16, null);
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15093f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15093f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final qe.h0 O(Object obj, Object obj2, zd.l<? super Throwable, md.i0> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof p2)) {
                if ((obj3 instanceof b0) && obj2 != null && ((b0) obj3).f14985d == obj2) {
                    return q.f15106a;
                }
                return null;
            }
        } while (!b3.b.a(f15094g, this, obj3, M((p2) obj3, obj, this.f14979c, lVar, obj2)));
        t();
        return q.f15106a;
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15093f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15093f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(qe.e0<?> e0Var, Throwable th) {
        int i10 = f15093f.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            e0Var.o(i10, th, getContext());
        } catch (Throwable th2) {
            l0.a(getContext(), new f0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean q(Throwable th) {
        if (!D()) {
            return false;
        }
        qd.d<T> dVar = this.f15096d;
        ae.r.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((qe.j) dVar).s(th);
    }

    private final void t() {
        if (D()) {
            return;
        }
        s();
    }

    private final void u(int i10) {
        if (N()) {
            return;
        }
        b1.a(this, i10);
    }

    private final f1 w() {
        return (f1) f15095h.get(this);
    }

    private final String z() {
        Object objY = y();
        return objY instanceof p2 ? "Active" : objY instanceof s ? "Cancelled" : "Completed";
    }

    public void A() {
        f1 f1VarB = B();
        if (f1VarB != null && isCompleted()) {
            f1VarB.dispose();
            f15095h.set(this, o2.f15092a);
        }
    }

    protected String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (q(th)) {
            return;
        }
        cancel(th);
        t();
    }

    public final void I() {
        Throwable thU;
        qd.d<T> dVar = this.f15096d;
        qe.j jVar = dVar instanceof qe.j ? (qe.j) dVar : null;
        if (jVar == null || (thU = jVar.u(this)) == null) {
            return;
        }
        s();
        cancel(thU);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof b0) && ((b0) obj).f14985d != null) {
            s();
            return false;
        }
        f15093f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f14997a);
        return true;
    }

    @Override // le.a1
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof c0) {
                return;
            }
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (!(!b0Var.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (b3.b.a(f15094g, this, obj2, b0.b(b0Var, null, null, null, null, th, 15, null))) {
                    b0Var.d(this, th);
                    return;
                }
            } else if (b3.b.a(f15094g, this, obj2, new b0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // le.g3
    public void b(qe.e0<?> e0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15093f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        C(e0Var);
    }

    @Override // le.a1
    public final qd.d<T> c() {
        return this.f15096d;
    }

    @Override // le.o
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15094g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p2)) {
                return false;
            }
        } while (!b3.b.a(f15094g, this, obj, new s(this, th, (obj instanceof m) || (obj instanceof qe.e0))));
        p2 p2Var = (p2) obj;
        if (p2Var instanceof m) {
            m((m) obj, th);
        } else if (p2Var instanceof qe.e0) {
            o((qe.e0) obj, th);
        }
        t();
        u(this.f14979c);
        return true;
    }

    @Override // le.o
    public Object d(T t10, Object obj, zd.l<? super Throwable, md.i0> lVar) {
        return O(t10, obj, lVar);
    }

    @Override // le.a1
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // le.o
    public void f(T t10, zd.l<? super Throwable, md.i0> lVar) {
        K(t10, this.f14979c, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // le.a1
    public <T> T g(Object obj) {
        return obj instanceof b0 ? (T) ((b0) obj).f14982a : obj;
    }

    @Override // sd.c
    public sd.c getCallerFrame() {
        qd.d<T> dVar = this.f15096d;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // qd.d
    public qd.g getContext() {
        return this.f15097e;
    }

    @Override // le.a1
    public Object i() {
        return y();
    }

    @Override // le.o
    public boolean isCompleted() {
        return !(y() instanceof p2);
    }

    @Override // le.o
    public void j(j0 j0Var, T t10) {
        qd.d<T> dVar = this.f15096d;
        qe.j jVar = dVar instanceof qe.j ? (qe.j) dVar : null;
        L(this, t10, (jVar != null ? jVar.f19062d : null) == j0Var ? 4 : this.f14979c, null, 4, null);
    }

    @Override // le.o
    public Object l(Throwable th) {
        return O(new c0(th, false, 2, null), null, null);
    }

    public final void m(m mVar, Throwable th) {
        try {
            mVar.e(th);
        } catch (Throwable th2) {
            l0.a(getContext(), new f0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(zd.l<? super Throwable, md.i0> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            l0.a(getContext(), new f0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // le.o
    public void p(zd.l<? super Throwable, md.i0> lVar) {
        C(E(lVar));
    }

    @Override // le.o
    public void r(Object obj) {
        u(this.f14979c);
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        L(this, g0.b(obj, this), this.f14979c, null, 4, null);
    }

    public final void s() {
        f1 f1VarW = w();
        if (f1VarW == null) {
            return;
        }
        f1VarW.dispose();
        f15095h.set(this, o2.f15092a);
    }

    public String toString() {
        return G() + '(' + r0.c(this.f15096d) + "){" + z() + "}@" + r0.b(this);
    }

    public Throwable v(a2 a2Var) {
        return a2Var.getCancellationException();
    }

    public final Object x() {
        a2 a2Var;
        boolean zD = D();
        if (P()) {
            if (w() == null) {
                B();
            }
            if (zD) {
                I();
            }
            return rd.d.e();
        }
        if (zD) {
            I();
        }
        Object objY = y();
        if (objY instanceof c0) {
            throw ((c0) objY).f14990a;
        }
        if (!b1.b(this.f14979c) || (a2Var = (a2) getContext().get(a2.R)) == null || a2Var.isActive()) {
            return g(objY);
        }
        CancellationException cancellationException = a2Var.getCancellationException();
        a(objY, cancellationException);
        throw cancellationException;
    }

    public final Object y() {
        return f15094g.get(this);
    }
}
