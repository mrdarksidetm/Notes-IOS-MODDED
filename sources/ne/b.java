package ne;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.g3;
import md.i0;
import md.t;
import qe.e0;
import qe.f0;
import qe.g0;
import qe.h0;
import qe.q0;
import qe.z;

/* JADX INFO: loaded from: classes2.dex */
public class b<E> implements d<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16149d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16150e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16151f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16152g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16153h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16154i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16155j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16156k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16157l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd.l<E, i0> f16159b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.q<te.f<?>, Object, Object, zd.l<Throwable, i0>> f16160c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    private final class a implements f<E>, g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f16161a = ne.c.f16185p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private le.p<? super Boolean> f16162b;

        public a() {
        }

        private final Object f(j<E> jVar, int i10, long j10, qd.d<? super Boolean> dVar) {
            Boolean boolA;
            b<E> bVar = b.this;
            le.p pVarB = le.r.b(rd.c.c(dVar));
            try {
                this.f16162b = pVarB;
                Object objZ0 = bVar.z0(jVar, i10, j10, this);
                if (objZ0 == ne.c.f16182m) {
                    bVar.k0(this, jVar, i10);
                } else {
                    zd.l<Throwable, i0> lVarA = null;
                    if (objZ0 == ne.c.f16184o) {
                        if (j10 < bVar.N()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f16154i.get(bVar);
                        while (true) {
                            if (bVar.U()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f16150e.getAndIncrement(bVar);
                            int i11 = ne.c.f16171b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (jVar2.f19053c != j11) {
                                j jVarG = bVar.G(j11, jVar2);
                                if (jVarG != null) {
                                    jVar2 = jVarG;
                                }
                            }
                            Object objZ02 = bVar.z0(jVar2, i12, andIncrement, this);
                            if (objZ02 == ne.c.f16182m) {
                                bVar.k0(this, jVar2, i12);
                                break;
                            }
                            if (objZ02 == ne.c.f16184o) {
                                if (andIncrement < bVar.N()) {
                                    jVar2.b();
                                }
                            } else {
                                if (objZ02 == ne.c.f16183n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                jVar2.b();
                                this.f16161a = objZ02;
                                this.f16162b = null;
                                boolA = sd.a.a(true);
                                zd.l<E, i0> lVar = bVar.f16159b;
                                if (lVar != null) {
                                    lVarA = z.a(lVar, objZ02, pVarB.getContext());
                                }
                            }
                        }
                    } else {
                        jVar.b();
                        this.f16161a = objZ0;
                        this.f16162b = null;
                        boolA = sd.a.a(true);
                        zd.l<E, i0> lVar2 = bVar.f16159b;
                        if (lVar2 != null) {
                            lVarA = z.a(lVar2, objZ0, pVarB.getContext());
                        }
                    }
                    pVarB.f(boolA, lVarA);
                }
                Object objX = pVarB.x();
                if (objX == rd.d.e()) {
                    sd.f.c(dVar);
                }
                return objX;
            } catch (Throwable th) {
                pVarB.I();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.f16161a = ne.c.z();
            Throwable thJ = b.this.J();
            if (thJ == null) {
                return false;
            }
            throw g0.a(thJ);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            Object objA;
            le.p<? super Boolean> pVar = this.f16162b;
            ae.r.c(pVar);
            this.f16162b = null;
            this.f16161a = ne.c.z();
            Throwable thJ = b.this.J();
            if (thJ == null) {
                t.a aVar = md.t.f15576b;
                objA = Boolean.FALSE;
            } else {
                t.a aVar2 = md.t.f15576b;
                objA = md.u.a(thJ);
            }
            pVar.resumeWith(md.t.b(objA));
        }

        @Override // ne.f
        public Object a(qd.d<? super Boolean> dVar) throws Throwable {
            boolean zG;
            j<E> jVar;
            b<E> bVar = b.this;
            j<E> jVar2 = (j) b.f16154i.get(bVar);
            while (true) {
                if (bVar.U()) {
                    zG = g();
                    break;
                }
                long andIncrement = b.f16150e.getAndIncrement(bVar);
                int i10 = ne.c.f16171b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (jVar2.f19053c != j10) {
                    j<E> jVarG = bVar.G(j10, jVar2);
                    if (jVarG == null) {
                        continue;
                    } else {
                        jVar = jVarG;
                    }
                } else {
                    jVar = jVar2;
                }
                Object objZ0 = bVar.z0(jVar, i11, andIncrement, null);
                if (objZ0 == ne.c.f16182m) {
                    throw new IllegalStateException("unreachable".toString());
                }
                if (objZ0 == ne.c.f16184o) {
                    if (andIncrement < bVar.N()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    if (objZ0 == ne.c.f16183n) {
                        return f(jVar, i11, andIncrement, dVar);
                    }
                    jVar.b();
                    this.f16161a = objZ0;
                    zG = true;
                }
            }
            return sd.a.a(zG);
        }

        @Override // le.g3
        public void b(e0<?> e0Var, int i10) {
            le.p<? super Boolean> pVar = this.f16162b;
            if (pVar != null) {
                pVar.b(e0Var, i10);
            }
        }

        public final boolean i(E e10) {
            le.p<? super Boolean> pVar = this.f16162b;
            ae.r.c(pVar);
            this.f16162b = null;
            this.f16161a = e10;
            Boolean bool = Boolean.TRUE;
            zd.l<E, i0> lVar = b.this.f16159b;
            return ne.c.B(pVar, bool, lVar != null ? z.a(lVar, e10, pVar.getContext()) : null);
        }

        public final void j() {
            Object objA;
            le.p<? super Boolean> pVar = this.f16162b;
            ae.r.c(pVar);
            this.f16162b = null;
            this.f16161a = ne.c.z();
            Throwable thJ = b.this.J();
            if (thJ == null) {
                t.a aVar = md.t.f15576b;
                objA = Boolean.FALSE;
            } else {
                t.a aVar2 = md.t.f15576b;
                objA = md.u.a(thJ);
            }
            pVar.resumeWith(md.t.b(objA));
        }

        @Override // ne.f
        public E next() throws Throwable {
            E e10 = (E) this.f16161a;
            if (!(e10 != ne.c.f16185p)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f16161a = ne.c.f16185p;
            if (e10 != ne.c.z()) {
                return e10;
            }
            throw g0.a(b.this.K());
        }
    }

    /* JADX INFO: renamed from: ne.b$b, reason: collision with other inner class name */
    private static final class C0365b implements g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final le.o<Boolean> f16164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ le.p<Boolean> f16165b;

        public final le.o<Boolean> a() {
            return this.f16164a;
        }

        @Override // le.g3
        public void b(e0<?> e0Var, int i10) {
            this.f16165b.b(e0Var, i10);
        }
    }

    static final class c extends ae.s implements zd.q<te.f<?>, Object, Object, zd.l<? super Throwable, ? extends i0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<E> f16166a;

        static final class a extends ae.s implements zd.l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f16167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<E> f16168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ te.f<?> f16169c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, te.f<?> fVar) {
                super(1);
                this.f16167a = obj;
                this.f16168b = bVar;
                this.f16169c = fVar;
            }

            public final void a(Throwable th) {
                if (this.f16167a != ne.c.z()) {
                    z.b(this.f16168b.f16159b, this.f16167a, this.f16169c.getContext());
                }
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
                a(th);
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f16166a = bVar;
        }

        @Override // zd.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zd.l<Throwable, i0> invoke(te.f<?> fVar, Object obj, Object obj2) {
            return new a(obj2, this.f16166a, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, zd.l<? super E, i0> lVar) {
        this.f16158a = i10;
        this.f16159b = lVar;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd = ne.c.A(i10);
        this.completedExpandBuffersAndPauseFlag = I();
        j jVar = new j(0L, null, this, 3);
        this.sendSegment = jVar;
        this.receiveSegment = jVar;
        if (Y()) {
            jVar = ne.c.f16170a;
            ae.r.d(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar;
        this.f16160c = lVar != 0 ? new c(this) : null;
        this._closeCause = ne.c.f16188s;
    }

    private final void A(long j10) {
        o0(B(j10));
    }

    private final Object A0(j<E> jVar, int i10, long j10, Object obj) {
        while (true) {
            Object objW = jVar.w(i10);
            if (objW == null || objW == ne.c.f16174e) {
                if (j10 < (f16149d.get(this) & 1152921504606846975L)) {
                    if (jVar.r(i10, objW, ne.c.f16177h)) {
                        E();
                        return ne.c.f16184o;
                    }
                } else {
                    if (obj == null) {
                        return ne.c.f16183n;
                    }
                    if (jVar.r(i10, objW, obj)) {
                        E();
                        return ne.c.f16182m;
                    }
                }
            } else {
                if (objW != ne.c.f16173d) {
                    if (objW != ne.c.f16179j && objW != ne.c.f16177h) {
                        if (objW == ne.c.z()) {
                            E();
                            return ne.c.f16184o;
                        }
                        if (objW != ne.c.f16176g && jVar.r(i10, objW, ne.c.f16175f)) {
                            boolean z10 = objW instanceof v;
                            if (z10) {
                                objW = ((v) objW).f16207a;
                            }
                            if (w0(objW, jVar, i10)) {
                                jVar.A(i10, ne.c.f16178i);
                                E();
                                return jVar.y(i10);
                            }
                            jVar.A(i10, ne.c.f16179j);
                            jVar.x(i10, false);
                            if (z10) {
                                E();
                            }
                            return ne.c.f16184o;
                        }
                    }
                    return ne.c.f16184o;
                }
                if (jVar.r(i10, objW, ne.c.f16178i)) {
                    E();
                    return jVar.y(i10);
                }
            }
        }
    }

    private final j<E> B(long j10) {
        j<E> jVarY = y();
        if (X()) {
            long jZ = Z(jVarY);
            if (jZ != -1) {
                D(jZ);
            }
        }
        x(jVarY, j10);
        return jVarY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B0(j<E> jVar, int i10, E e10, long j10, Object obj, boolean z10) {
        jVar.B(i10, e10);
        if (z10) {
            return C0(jVar, i10, e10, j10, obj, z10);
        }
        Object objW = jVar.w(i10);
        if (objW == null) {
            if (v(j10)) {
                if (jVar.r(i10, null, ne.c.f16173d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (jVar.r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (objW instanceof g3) {
            jVar.s(i10);
            if (v0(objW, e10)) {
                jVar.A(i10, ne.c.f16178i);
                i0();
                return 0;
            }
            if (jVar.t(i10, ne.c.f16180k) != ne.c.f16180k) {
                jVar.x(i10, true);
            }
            return 5;
        }
        return C0(jVar, i10, e10, j10, obj, z10);
    }

    private final void C() {
        k();
    }

    private final int C0(j<E> jVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objW = jVar.w(i10);
            if (objW == null) {
                if (!v(j10) || z10) {
                    if (z10) {
                        if (jVar.r(i10, null, ne.c.f16179j)) {
                            jVar.x(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (jVar.r(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (jVar.r(i10, null, ne.c.f16173d)) {
                    return 1;
                }
            } else {
                if (objW != ne.c.f16174e) {
                    if (objW == ne.c.f16180k) {
                        jVar.s(i10);
                        return 5;
                    }
                    if (objW == ne.c.f16177h) {
                        jVar.s(i10);
                        return 5;
                    }
                    h0 h0VarZ = ne.c.z();
                    jVar.s(i10);
                    if (objW == h0VarZ) {
                        C();
                        return 4;
                    }
                    if (objW instanceof v) {
                        objW = ((v) objW).f16207a;
                    }
                    if (v0(objW, e10)) {
                        jVar.A(i10, ne.c.f16178i);
                        i0();
                        return 0;
                    }
                    if (jVar.t(i10, ne.c.f16180k) != ne.c.f16180k) {
                        jVar.x(i10, true);
                    }
                    return 5;
                }
                if (jVar.r(i10, objW, ne.c.f16173d)) {
                    return 1;
                }
            }
        }
    }

    private final void D0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16150e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f16150e.compareAndSet(this, j11, j10));
    }

    private final void E() {
        if (Y()) {
            return;
        }
        j<E> jVar = (j) f16155j.get(this);
        while (true) {
            long andIncrement = f16151f.getAndIncrement(this);
            int i10 = ne.c.f16171b;
            long j10 = andIncrement / ((long) i10);
            long jN = N();
            long j11 = jVar.f19053c;
            if (jN <= andIncrement) {
                if (j11 < j10 && jVar.e() != 0) {
                    d0(j10, jVar);
                }
                Q(this, 0L, 1, null);
                return;
            }
            if (j11 != j10) {
                j<E> jVarF = F(j10, jVar, andIncrement);
                if (jVarF == null) {
                    continue;
                } else {
                    jVar = jVarF;
                }
            }
            boolean zX0 = x0(jVar, (int) (andIncrement % ((long) i10)), andIncrement);
            Q(this, 0L, 1, null);
            if (zX0) {
                return;
            }
        }
    }

    private final void E0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16149d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f16149d.compareAndSet(this, j11, ne.c.w(j12, (int) (j11 >> 60))));
    }

    private final j<E> F(long j10, j<E> jVar, long j11) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16155j;
        zd.p pVar = (zd.p) ne.c.y();
        do {
            objC = qe.d.c(jVar, j10, pVar);
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
        if (f0.c(objC)) {
            C();
            d0(j10, jVar);
        } else {
            j<E> jVar2 = (j) f0.b(objC);
            long j12 = jVar2.f19053c;
            if (j12 <= j10) {
                return jVar2;
            }
            int i10 = ne.c.f16171b;
            if (f16151f.compareAndSet(this, j11 + 1, ((long) i10) * j12)) {
                P((jVar2.f19053c * ((long) i10)) - j11);
                return null;
            }
        }
        Q(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j<E> G(long j10, j<E> jVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16154i;
        zd.p pVar = (zd.p) ne.c.y();
        do {
            objC = qe.d.c(jVar, j10, pVar);
            if (!f0.c(objC)) {
                e0 e0VarB = f0.b(objC);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
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
            } else {
                break;
            }
        } while (!z10);
        if (f0.c(objC)) {
            C();
            if (jVar.f19053c * ((long) ne.c.f16171b) >= N()) {
                return null;
            }
        } else {
            jVar = (j) f0.b(objC);
            if (!Y() && j10 <= I() / ((long) ne.c.f16171b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16155j;
                while (true) {
                    e0 e0Var2 = (e0) atomicReferenceFieldUpdater2.get(this);
                    if (e0Var2.f19053c >= jVar.f19053c || !jVar.q()) {
                        break;
                    }
                    if (b3.b.a(atomicReferenceFieldUpdater2, this, e0Var2, jVar)) {
                        if (e0Var2.m()) {
                            e0Var2.k();
                        }
                    } else if (jVar.m()) {
                        jVar.k();
                    }
                }
            }
            long j11 = jVar.f19053c;
            if (j11 <= j10) {
                return jVar;
            }
            int i10 = ne.c.f16171b;
            D0(j11 * ((long) i10));
            if (jVar.f19053c * ((long) i10) >= N()) {
                return null;
            }
        }
        jVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j<E> H(long j10, j<E> jVar) {
        Object objC;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16153h;
        zd.p pVar = (zd.p) ne.c.y();
        do {
            objC = qe.d.c(jVar, j10, pVar);
            if (!f0.c(objC)) {
                e0 e0VarB = f0.b(objC);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
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
            } else {
                break;
            }
        } while (!z10);
        if (f0.c(objC)) {
            C();
            if (jVar.f19053c * ((long) ne.c.f16171b) >= L()) {
                return null;
            }
        } else {
            jVar = (j) f0.b(objC);
            long j11 = jVar.f19053c;
            if (j11 <= j10) {
                return jVar;
            }
            int i10 = ne.c.f16171b;
            E0(j11 * ((long) i10));
            if (jVar.f19053c * ((long) i10) >= L()) {
                return null;
            }
        }
        jVar.b();
        return null;
    }

    private final long I() {
        return f16151f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable K() {
        Throwable thJ = J();
        return thJ == null ? new m("Channel was closed") : thJ;
    }

    private final void P(long j10) {
        if ((f16152g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f16152g.get(this) & 4611686018427387904L) != 0);
        }
    }

    static /* synthetic */ void Q(b bVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bVar.P(j10);
    }

    private final void R() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16157l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!b3.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? ne.c.f16186q : ne.c.f16187r));
        if (obj == null) {
            return;
        }
        ((zd.l) obj).invoke(J());
    }

    private final boolean S(j<E> jVar, int i10, long j10) {
        Object objW;
        do {
            objW = jVar.w(i10);
            if (objW != null && objW != ne.c.f16174e) {
                if (objW == ne.c.f16173d) {
                    return true;
                }
                if (objW == ne.c.f16179j || objW == ne.c.z() || objW == ne.c.f16178i || objW == ne.c.f16177h) {
                    return false;
                }
                if (objW == ne.c.f16176g) {
                    return true;
                }
                return objW != ne.c.f16175f && j10 == L();
            }
        } while (!jVar.r(i10, objW, ne.c.f16177h));
        E();
        return false;
    }

    private final boolean T(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            B(j10 & 1152921504606846975L);
            if (z10 && O()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            A(j10 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean V(long j10) {
        return T(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W(long j10) {
        return T(j10, false);
    }

    private final boolean Y() {
        long jI = I();
        return jI == 0 || jI == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (ne.j) r8.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long Z(ne.j<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = ne.c.f16171b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f19053c
            int r5 = ne.c.f16171b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.L()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            qe.h0 r2 = ne.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            qe.h0 r2 = ne.c.f16173d
            if (r1 != r2) goto L39
            return r3
        L2c:
            qe.h0 r2 = ne.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            qe.e r8 = r8.g()
            ne.j r8 = (ne.j) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.Z(ne.j):long");
    }

    private final void a0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16149d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, ne.c.w(1152921504606846975L & j10, 1)));
    }

    private final void b0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16149d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, ne.c.w(1152921504606846975L & j10, 3)));
    }

    private final void c0() {
        long j10;
        long j11;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16149d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else {
                if (i11 != 1) {
                    return;
                }
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, ne.c.w(j11, i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d0(long j10, j<E> jVar) {
        boolean z10;
        j<E> jVar2;
        j<E> jVar3;
        while (jVar.f19053c < j10 && (jVar3 = (j) jVar.e()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.h() || (jVar2 = (j) jVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16155j;
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (e0Var.f19053c >= jVar.f19053c) {
                        break;
                    }
                    if (!jVar.q()) {
                        z10 = false;
                        break;
                    } else if (b3.b.a(atomicReferenceFieldUpdater, this, e0Var, jVar)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (jVar.m()) {
                        jVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(le.o<? super E> oVar) {
        t.a aVar = md.t.f15576b;
        oVar.resumeWith(md.t.b(md.u.a(K())));
    }

    private final Object g0(E e10, qd.d<? super i0> dVar) {
        Throwable thM;
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        zd.l<E, i0> lVar = this.f16159b;
        if (lVar == null || (thM = z.d(lVar, e10, null, 2, null)) == null) {
            thM = M();
        } else {
            md.f.a(thM, M());
        }
        t.a aVar = md.t.f15576b;
        pVar.resumeWith(md.t.b(md.u.a(thM)));
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(E e10, le.o<? super i0> oVar) {
        zd.l<E, i0> lVar = this.f16159b;
        if (lVar != null) {
            z.b(lVar, e10, oVar.getContext());
        }
        Throwable thM = M();
        t.a aVar = md.t.f15576b;
        oVar.resumeWith(md.t.b(md.u.a(thM)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(g3 g3Var, j<E> jVar, int i10) {
        j0();
        g3Var.b(jVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(g3 g3Var, j<E> jVar, int i10) {
        g3Var.b(jVar, i10 + ne.c.f16171b);
    }

    static /* synthetic */ <E> Object m0(b<E> bVar, qd.d<? super E> dVar) throws Throwable {
        j<E> jVar = (j) f16154i.get(bVar);
        while (!bVar.U()) {
            long andIncrement = f16150e.getAndIncrement(bVar);
            int i10 = ne.c.f16171b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (jVar.f19053c != j10) {
                j<E> jVarG = bVar.G(j10, jVar);
                if (jVarG == null) {
                    continue;
                } else {
                    jVar = jVarG;
                }
            }
            Object objZ0 = bVar.z0(jVar, i11, andIncrement, null);
            if (objZ0 == ne.c.f16182m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objZ0 != ne.c.f16184o) {
                if (objZ0 == ne.c.f16183n) {
                    return bVar.n0(jVar, i11, andIncrement, dVar);
                }
                jVar.b();
                return objZ0;
            }
            if (andIncrement < bVar.N()) {
                jVar.b();
            }
        }
        throw g0.a(bVar.K());
    }

    private final Object n0(j<E> jVar, int i10, long j10, qd.d<? super E> dVar) {
        le.p pVarB = le.r.b(rd.c.c(dVar));
        try {
            Object objZ0 = z0(jVar, i10, j10, pVarB);
            if (objZ0 == ne.c.f16182m) {
                k0(pVarB, jVar, i10);
            } else {
                zd.l<Throwable, i0> lVarA = null;
                lVarA = null;
                if (objZ0 == ne.c.f16184o) {
                    if (j10 < N()) {
                        jVar.b();
                    }
                    j jVar2 = (j) f16154i.get(this);
                    while (true) {
                        if (U()) {
                            f0(pVarB);
                            break;
                        }
                        long andIncrement = f16150e.getAndIncrement(this);
                        int i11 = ne.c.f16171b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (jVar2.f19053c != j11) {
                            j jVarG = G(j11, jVar2);
                            if (jVarG != null) {
                                jVar2 = jVarG;
                            }
                        }
                        objZ0 = z0(jVar2, i12, andIncrement, pVarB);
                        if (objZ0 == ne.c.f16182m) {
                            le.p pVar = pVarB instanceof g3 ? pVarB : null;
                            if (pVar != null) {
                                k0(pVar, jVar2, i12);
                            }
                        } else if (objZ0 == ne.c.f16184o) {
                            if (andIncrement < N()) {
                                jVar2.b();
                            }
                        } else {
                            if (objZ0 == ne.c.f16183n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            jVar2.b();
                            zd.l<E, i0> lVar = this.f16159b;
                            if (lVar != null) {
                                lVarA = z.a(lVar, objZ0, pVarB.getContext());
                            }
                        }
                    }
                } else {
                    jVar.b();
                    zd.l<E, i0> lVar2 = this.f16159b;
                    if (lVar2 != null) {
                        lVarA = z.a(lVar2, objZ0, pVarB.getContext());
                    }
                }
                pVarB.f(objZ0, lVarA);
            }
            Object objX = pVarB.x();
            if (objX == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objX;
        } catch (Throwable th) {
            pVarB.I();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r12.s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        r12 = (ne.j) r12.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o0(ne.j<E> r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.o0(ne.j):void");
    }

    private final void p0(g3 g3Var) {
        r0(g3Var, true);
    }

    private final void q0(g3 g3Var) {
        r0(g3Var, false);
    }

    private final void r0(g3 g3Var, boolean z10) {
        qd.d dVarA;
        Object objB;
        if (g3Var instanceof C0365b) {
            dVarA = ((C0365b) g3Var).a();
            t.a aVar = md.t.f15576b;
            objB = Boolean.FALSE;
        } else if (g3Var instanceof le.o) {
            dVarA = (qd.d) g3Var;
            t.a aVar2 = md.t.f15576b;
            objB = md.u.a(z10 ? K() : M());
        } else {
            if (!(g3Var instanceof s)) {
                if (g3Var instanceof a) {
                    ((a) g3Var).j();
                    return;
                } else {
                    if (g3Var instanceof te.f) {
                        ((te.f) g3Var).c(this, ne.c.z());
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + g3Var).toString());
                }
            }
            dVarA = ((s) g3Var).f16206a;
            t.a aVar3 = md.t.f15576b;
            objB = h.b(h.f16193b.a(J()));
        }
        dVarA.resumeWith(md.t.b(objB));
    }

    static /* synthetic */ <E> Object s0(b<E> bVar, E e10, qd.d<? super i0> dVar) {
        j<E> jVar = (j) f16153h.get(bVar);
        while (true) {
            long andIncrement = f16149d.getAndIncrement(bVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zW = bVar.W(andIncrement);
            int i10 = ne.c.f16171b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar.f19053c != j11) {
                j<E> jVarH = bVar.H(j11, jVar);
                if (jVarH != null) {
                    jVar = jVarH;
                } else if (zW) {
                    Object objG0 = bVar.g0(e10, dVar);
                    if (objG0 == rd.d.e()) {
                        return objG0;
                    }
                }
            }
            int iB0 = bVar.B0(jVar, i11, e10, j10, null, zW);
            if (iB0 == 0) {
                jVar.b();
                break;
            }
            if (iB0 == 1) {
                break;
            }
            if (iB0 != 2) {
                if (iB0 == 3) {
                    Object objT0 = bVar.t0(jVar, i11, e10, j10, dVar);
                    if (objT0 == rd.d.e()) {
                        return objT0;
                    }
                } else if (iB0 == 4) {
                    if (j10 < bVar.L()) {
                        jVar.b();
                    }
                    Object objG02 = bVar.g0(e10, dVar);
                    if (objG02 == rd.d.e()) {
                        return objG02;
                    }
                } else if (iB0 == 5) {
                    jVar.b();
                }
            } else if (zW) {
                jVar.p();
                Object objG03 = bVar.g0(e10, dVar);
                if (objG03 == rd.d.e()) {
                    return objG03;
                }
            }
        }
        return i0.f15558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t0(ne.j<E> r21, int r22, E r23, long r24, qd.d<? super md.i0> r26) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.t0(ne.j, int, java.lang.Object, long, qd.d):java.lang.Object");
    }

    private final boolean u0(long j10) {
        if (W(j10)) {
            return false;
        }
        return !v(j10 & 1152921504606846975L);
    }

    private final boolean v(long j10) {
        return j10 < I() || j10 < L() + ((long) this.f16158a);
    }

    private final boolean v0(Object obj, E e10) {
        if (obj instanceof te.f) {
            return ((te.f) obj).c(this, e10);
        }
        if (obj instanceof s) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            le.p<h<? extends E>> pVar = sVar.f16206a;
            h hVarB = h.b(h.f16193b.c(e10));
            zd.l<E, i0> lVar = this.f16159b;
            return ne.c.B(pVar, hVarB, lVar != null ? z.a(lVar, e10, sVar.f16206a.getContext()) : null);
        }
        if (obj instanceof a) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof le.o) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            le.o oVar = (le.o) obj;
            zd.l<E, i0> lVar2 = this.f16159b;
            return ne.c.B(oVar, e10, lVar2 != null ? z.a(lVar2, e10, oVar.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean w0(Object obj, j<E> jVar, int i10) {
        le.o<Boolean> oVarA;
        Object obj2;
        if (obj instanceof le.o) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            oVarA = (le.o) obj;
            obj2 = i0.f15558a;
        } else {
            if (obj instanceof te.f) {
                ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                te.h hVarH = ((te.e) obj).h(this, i0.f15558a);
                if (hVarH == te.h.REREGISTER) {
                    jVar.s(i10);
                }
                return hVarH == te.h.SUCCESSFUL;
            }
            if (!(obj instanceof C0365b)) {
                throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
            }
            oVarA = ((C0365b) obj).a();
            obj2 = Boolean.TRUE;
        }
        return ne.c.C(oVarA, obj2, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0 = qe.n.c(r0, r4);
        r9.x(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(ne.j<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = qe.n.b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = ne.c.f16171b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f19053c
            int r6 = ne.c.f16171b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L50
            qe.h0 r5 = ne.c.k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof ne.v
            if (r5 == 0) goto L41
            qe.h0 r5 = ne.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            ne.v r4 = (ne.v) r4
            le.g3 r4 = r4.f16207a
        L39:
            java.lang.Object r0 = qe.n.c(r0, r4)
            r9.x(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof le.g3
            if (r5 == 0) goto L5d
            qe.h0 r5 = ne.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            qe.h0 r5 = ne.c.z()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.p()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            qe.e r9 = r9.g()
            ne.j r9 = (ne.j) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            le.g3 r0 = (le.g3) r0
            r8.p0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            ae.r.d(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            le.g3 r10 = (le.g3) r10
            r8.p0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.x(ne.j, long):void");
    }

    private final boolean x0(j<E> jVar, int i10, long j10) {
        Object objW = jVar.w(i10);
        if (!(objW instanceof g3) || j10 < f16150e.get(this) || !jVar.r(i10, objW, ne.c.f16176g)) {
            return y0(jVar, i10, j10);
        }
        if (w0(objW, jVar, i10)) {
            jVar.A(i10, ne.c.f16173d);
            return true;
        }
        jVar.A(i10, ne.c.f16179j);
        jVar.x(i10, false);
        return false;
    }

    private final j<E> y() {
        Object obj = f16155j.get(this);
        j jVar = (j) f16153h.get(this);
        if (jVar.f19053c > ((j) obj).f19053c) {
            obj = jVar;
        }
        j jVar2 = (j) f16154i.get(this);
        if (jVar2.f19053c > ((j) obj).f19053c) {
            obj = jVar2;
        }
        return (j) qe.d.b((qe.e) obj);
    }

    private final boolean y0(j<E> jVar, int i10, long j10) {
        while (true) {
            Object objW = jVar.w(i10);
            if (objW instanceof g3) {
                if (j10 < f16150e.get(this)) {
                    if (jVar.r(i10, objW, new v((g3) objW))) {
                        return true;
                    }
                } else if (jVar.r(i10, objW, ne.c.f16176g)) {
                    if (w0(objW, jVar, i10)) {
                        jVar.A(i10, ne.c.f16173d);
                        return true;
                    }
                    jVar.A(i10, ne.c.f16179j);
                    jVar.x(i10, false);
                    return false;
                }
            } else {
                if (objW == ne.c.f16179j) {
                    return false;
                }
                if (objW == null) {
                    if (jVar.r(i10, objW, ne.c.f16174e)) {
                        return true;
                    }
                } else {
                    if (objW == ne.c.f16173d || objW == ne.c.f16177h || objW == ne.c.f16178i || objW == ne.c.f16180k || objW == ne.c.z()) {
                        return true;
                    }
                    if (objW != ne.c.f16175f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z0(j<E> jVar, int i10, long j10, Object obj) {
        Object objW = jVar.w(i10);
        if (objW == null) {
            if (j10 >= (f16149d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ne.c.f16183n;
                }
                if (jVar.r(i10, objW, obj)) {
                    E();
                    return ne.c.f16182m;
                }
            }
        } else if (objW == ne.c.f16173d && jVar.r(i10, objW, ne.c.f16178i)) {
            E();
            return jVar.y(i10);
        }
        return A0(jVar, i10, j10, obj);
    }

    protected final void D(long j10) {
        q0 q0VarD;
        j<E> jVar = (j) f16154i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16150e;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f16158a) + j11, I())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = ne.c.f16171b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (jVar.f19053c != j12) {
                    j<E> jVarG = G(j12, jVar);
                    if (jVarG == null) {
                        continue;
                    } else {
                        jVar = jVarG;
                    }
                }
                Object objZ0 = z0(jVar, i11, j11, null);
                if (objZ0 != ne.c.f16184o) {
                    jVar.b();
                    zd.l<E, i0> lVar = this.f16159b;
                    if (lVar != null && (q0VarD = z.d(lVar, objZ0, null, 2, null)) != null) {
                        throw q0VarD;
                    }
                } else if (j11 < N()) {
                    jVar.b();
                }
            }
        }
    }

    public final void F0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (Y()) {
            return;
        }
        while (I() <= j10) {
        }
        int i10 = ne.c.f16172c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jI = I();
            if (jI == (4611686018427387903L & f16152g.get(this)) && jI == I()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16152g;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, ne.c.v(j11 & 4611686018427387903L, true)));
        while (true) {
            long jI2 = I();
            atomicLongFieldUpdater = f16152g;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (jI2 == j14 && jI2 == I()) {
                break;
            } else if (!z10) {
                atomicLongFieldUpdater.compareAndSet(this, j13, ne.c.v(j14, true));
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, ne.c.v(j12 & 4611686018427387903L, false)));
    }

    protected final Throwable J() {
        return (Throwable) f16156k.get(this);
    }

    public final long L() {
        return f16150e.get(this);
    }

    protected final Throwable M() {
        Throwable thJ = J();
        return thJ == null ? new n("Channel was closed") : thJ;
    }

    public final long N() {
        return f16149d.get(this) & 1152921504606846975L;
    }

    public final boolean O() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16154i;
            j<E> jVarG = (j) atomicReferenceFieldUpdater.get(this);
            long jL = L();
            if (N() <= jL) {
                return false;
            }
            int i10 = ne.c.f16171b;
            long j10 = jL / ((long) i10);
            if (jVarG.f19053c == j10 || (jVarG = G(j10, jVarG)) != null) {
                jVarG.b();
                if (S(jVarG, (int) (jL % ((long) i10)), jL)) {
                    return true;
                }
                f16150e.compareAndSet(this, jL, jL + 1);
            } else if (((j) atomicReferenceFieldUpdater.get(this)).f19053c < j10) {
                return false;
            }
        }
    }

    public boolean U() {
        return V(f16149d.get(this));
    }

    protected boolean X() {
        return false;
    }

    @Override // ne.u
    public Object b(E e10, qd.d<? super i0> dVar) {
        return s0(this, e10, dVar);
    }

    @Override // ne.t
    public Object c(qd.d<? super E> dVar) {
        return m0(this, dVar);
    }

    @Override // ne.t
    public final void cancel(CancellationException cancellationException) {
        w(cancellationException);
    }

    @Override // ne.u
    public void e(zd.l<? super Throwable, i0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16157l;
        if (b3.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != ne.c.f16186q) {
                if (obj == ne.c.f16187r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!b3.b.a(f16157l, this, ne.c.f16186q, ne.c.f16187r));
        lVar.invoke(J());
    }

    protected void e0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ne.t
    public Object g() {
        j jVar;
        long j10 = f16150e.get(this);
        long j11 = f16149d.get(this);
        if (V(j11)) {
            return h.f16193b.a(J());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return h.f16193b.b();
        }
        Object obj = ne.c.f16180k;
        j jVar2 = (j) f16154i.get(this);
        while (!U()) {
            long andIncrement = f16150e.getAndIncrement(this);
            int i10 = ne.c.f16171b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (jVar2.f19053c != j12) {
                j jVarG = G(j12, jVar2);
                if (jVarG == null) {
                    continue;
                } else {
                    jVar = jVarG;
                }
            } else {
                jVar = jVar2;
            }
            Object objZ0 = z0(jVar, i11, andIncrement, obj);
            if (objZ0 == ne.c.f16182m) {
                g3 g3Var = obj instanceof g3 ? (g3) obj : null;
                if (g3Var != null) {
                    k0(g3Var, jVar, i11);
                }
                F0(andIncrement);
                jVar.p();
                return h.f16193b.b();
            }
            if (objZ0 != ne.c.f16184o) {
                if (objZ0 == ne.c.f16183n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                jVar.b();
                return h.f16193b.c(objZ0);
            }
            if (andIncrement < N()) {
                jVar.b();
            }
            jVar2 = jVar;
        }
        return h.f16193b.a(J());
    }

    @Override // ne.u
    public boolean h(Throwable th) {
        return z(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        return ne.h.f16193b.c(md.i0.f15558a);
     */
    @Override // ne.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ne.b.f16149d
            long r0 = r0.get(r14)
            boolean r0 = r14.u0(r0)
            if (r0 == 0) goto L13
            ne.h$b r15 = ne.h.f16193b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            qe.h0 r8 = ne.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m()
            java.lang.Object r0 = r0.get(r14)
            ne.j r0 = (ne.j) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = n()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = o(r14, r1)
            int r1 = ne.c.f16171b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f19053c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            ne.j r1 = d(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = u(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.L()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.p()
        L8e:
            ne.h$b r15 = ne.h.f16193b
            java.lang.Throwable r0 = r14.M()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof le.g3
            if (r15 == 0) goto La0
            le.g3 r8 = (le.g3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            s(r14, r8, r13, r12)
        La6:
            r13.p()
            ne.h$b r15 = ne.h.f16193b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            ne.h$b r15 = ne.h.f16193b
            md.i0 r0 = md.i0.f15558a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.i(java.lang.Object):java.lang.Object");
    }

    protected void i0() {
    }

    @Override // ne.t
    public f<E> iterator() {
        return new a();
    }

    protected void j0() {
    }

    @Override // ne.u
    public boolean k() {
        return W(f16149d.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d9, code lost:
    
        r3 = (ne.j) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e0, code lost:
    
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.b.toString():java.lang.String");
    }

    public boolean w(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return z(th, true);
    }

    protected boolean z(Throwable th, boolean z10) {
        if (z10) {
            a0();
        }
        boolean zA = b3.b.a(f16156k, this, ne.c.f16188s, th);
        if (z10) {
            b0();
        } else {
            c0();
        }
        C();
        e0();
        if (zA) {
            R();
        }
        return zA;
    }
}
