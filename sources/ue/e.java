package ue;

import ae.o;
import ae.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.g3;
import le.r;
import md.i0;
import ne.i;
import qe.e0;
import qe.f0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public class e implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21778c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f21779d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21780e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f21781f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21782g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<Throwable, i0> f21784b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* synthetic */ class a extends o implements p<Long, g, g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21785a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g d(long j10, g gVar) {
            return f.j(j10, gVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ g invoke(Long l10, g gVar) {
            return d(l10.longValue(), gVar);
        }
    }

    static final class b extends s implements l<Throwable, i0> {
        b() {
            super(1);
        }

        public final void a(Throwable th) {
            e.this.release();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    /* synthetic */ class c extends o implements p<Long, g, g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21787a = new c();

        c() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g d(long j10, g gVar) {
            return f.j(j10, gVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ g invoke(Long l10, g gVar) {
            return d(l10.longValue(), gVar);
        }
    }

    public e(int i10, int i11) {
        this.f21783a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        g gVar = new g(0L, null, 2);
        this.head = gVar;
        this.tail = gVar;
        this._availablePermits = i10 - i11;
        this.f21784b = new b();
    }

    static /* synthetic */ Object f(e eVar, qd.d<? super i0> dVar) {
        Object objG;
        return (eVar.j() <= 0 && (objG = eVar.g(dVar)) == rd.d.e()) ? objG : i0.f15558a;
    }

    private final Object g(qd.d<? super i0> dVar) {
        le.p pVarB = r.b(rd.c.c(dVar));
        try {
            if (!h(pVarB)) {
                e(pVarB);
            }
            Object objX = pVarB.x();
            if (objX == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objX == rd.d.e() ? objX : i0.f15558a;
        } catch (Throwable th) {
            pVarB.I();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(g3 g3Var) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21780e;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f21781f.getAndIncrement(this);
        a aVar = a.f21785a;
        long j10 = andIncrement / ((long) f.f21793f);
        do {
            objC = qe.d.c(gVar, j10, aVar);
            if (f0.c(objC)) {
                break;
            }
            e0 e0VarB = f0.b(objC);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f19053c >= e0VarB.f19053c) {
                    break;
                }
                if (!e0VarB.q()) {
                    z10 = false;
                    break;
                }
                if (b3.b.a(atomicReferenceFieldUpdater, this, e0Var, e0VarB)) {
                    if (e0Var.m()) {
                        e0Var.k();
                    }
                } else if (e0VarB.m()) {
                    e0VarB.k();
                }
            }
            z10 = true;
        } while (!z10);
        g gVar2 = (g) f0.b(objC);
        int i10 = (int) (andIncrement % ((long) f.f21793f));
        if (i.a(gVar2.r(), i10, null, g3Var)) {
            g3Var.b(gVar2, i10);
            return true;
        }
        if (!i.a(gVar2.r(), i10, f.f21789b, f.f21790c)) {
            return false;
        }
        if (g3Var instanceof le.o) {
            ae.r.d(g3Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((le.o) g3Var).f(i0.f15558a, this.f21784b);
            return true;
        }
        if (g3Var instanceof te.f) {
            ((te.f) g3Var).d(i0.f15558a);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + g3Var).toString());
    }

    private final void i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f21782g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f21783a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int j() {
        int andDecrement;
        do {
            andDecrement = f21782g.getAndDecrement(this);
        } while (andDecrement > this.f21783a);
        return andDecrement;
    }

    private final boolean m(Object obj) {
        if (!(obj instanceof le.o)) {
            if (obj instanceof te.f) {
                return ((te.f) obj).c(this, i0.f15558a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        le.o oVar = (le.o) obj;
        Object objD = oVar.d(i0.f15558a, null, this.f21784b);
        if (objD == null) {
            return false;
        }
        oVar.r(objD);
        return true;
    }

    private final boolean n() {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21778c;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f21779d.getAndIncrement(this);
        long j10 = andIncrement / ((long) f.f21793f);
        c cVar = c.f21787a;
        do {
            objC = qe.d.c(gVar, j10, cVar);
            if (f0.c(objC)) {
                break;
            }
            e0 e0VarB = f0.b(objC);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f19053c >= e0VarB.f19053c) {
                    break;
                }
                if (!e0VarB.q()) {
                    z10 = false;
                    break;
                }
                if (b3.b.a(atomicReferenceFieldUpdater, this, e0Var, e0VarB)) {
                    if (e0Var.m()) {
                        e0Var.k();
                    }
                } else if (e0VarB.m()) {
                    e0VarB.k();
                }
            }
            z10 = true;
        } while (!z10);
        g gVar2 = (g) f0.b(objC);
        gVar2.b();
        if (gVar2.f19053c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) f.f21793f));
        Object andSet = gVar2.r().getAndSet(i10, f.f21789b);
        if (andSet != null) {
            if (andSet == f.f21792e) {
                return false;
            }
            return m(andSet);
        }
        int i11 = f.f21788a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (gVar2.r().get(i10) == f.f21790c) {
                return true;
            }
        }
        return !i.a(gVar2.r(), i10, f.f21789b, f.f21791d);
    }

    @Override // ue.d
    public Object c(qd.d<? super i0> dVar) {
        return f(this, dVar);
    }

    protected final void e(le.o<? super i0> oVar) {
        while (j() <= 0) {
            ae.r.d(oVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (h((g3) oVar)) {
                return;
            }
        }
        oVar.f(i0.f15558a, this.f21784b);
    }

    public int k() {
        return Math.max(f21782g.get(this), 0);
    }

    public boolean l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21782g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f21783a) {
                i();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    @Override // ue.d
    public void release() {
        do {
            int andIncrement = f21782g.getAndIncrement(this);
            if (andIncrement >= this.f21783a) {
                i();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f21783a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!n());
    }
}
