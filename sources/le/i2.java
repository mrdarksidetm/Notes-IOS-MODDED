package le;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.a2;
import qd.g;
import qe.s;

/* JADX INFO: loaded from: classes2.dex */
public class i2 implements a2, w, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15038a = AtomicReferenceFieldUpdater.newUpdater(i2.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15039b = AtomicReferenceFieldUpdater.newUpdater(i2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a<T> extends p<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final i2 f15040i;

        public a(qd.d<? super T> dVar, i2 i2Var) {
            super(dVar, 1);
            this.f15040i = i2Var;
        }

        @Override // le.p
        protected String G() {
            return "AwaitContinuation";
        }

        @Override // le.p
        public Throwable v(a2 a2Var) {
            Throwable thE;
            Object objF0 = this.f15040i.f0();
            return (!(objF0 instanceof c) || (thE = ((c) objF0).e()) == null) ? objF0 instanceof c0 ? ((c0) objF0).f14990a : a2Var.getCancellationException() : thE;
        }
    }

    private static final class b extends h2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i2 f15041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f15042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final v f15043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f15044h;

        public b(i2 i2Var, c cVar, v vVar, Object obj) {
            this.f15041e = i2Var;
            this.f15042f = cVar;
            this.f15043g = vVar;
            this.f15044h = obj;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            r(th);
            return md.i0.f15558a;
        }

        @Override // le.e0
        public void r(Throwable th) {
            this.f15041e.R(this.f15042f, this.f15043g, this.f15044h);
        }
    }

    private static final class c implements u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f15045b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f15046c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f15047d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n2 f15048a;

        public c(n2 n2Var, boolean z10, Throwable th) {
            this.f15048a = n2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f15047d.get(this);
        }

        private final void k(Object obj) {
            f15047d.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                l(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                k(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th);
                k(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // le.u1
        public n2 b() {
            return this.f15048a;
        }

        public final Throwable e() {
            return (Throwable) f15046c.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f15045b.get(this) != 0;
        }

        public final boolean h() {
            return d() == j2.f15072e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th != null && !ae.r.b(th, thE)) {
                arrayListC.add(th);
            }
            k(j2.f15072e);
            return arrayListC;
        }

        @Override // le.u1
        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z10) {
            f15045b.set(this, z10 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f15046c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    private final class d extends h2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final te.f<?> f15049e;

        public d(te.f<?> fVar) {
            this.f15049e = fVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            r(th);
            return md.i0.f15558a;
        }

        @Override // le.e0
        public void r(Throwable th) {
            Object objF0 = i2.this.f0();
            if (!(objF0 instanceof c0)) {
                objF0 = j2.h(objF0);
            }
            this.f15049e.c(i2.this, objF0);
        }
    }

    private final class e extends h2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final te.f<?> f15051e;

        public e(te.f<?> fVar) {
            this.f15051e = fVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            r(th);
            return md.i0.f15558a;
        }

        @Override // le.e0
        public void r(Throwable th) {
            this.f15051e.c(i2.this, md.i0.f15558a);
        }
    }

    public static final class f extends s.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i2 f15053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f15054e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qe.s sVar, i2 i2Var, Object obj) {
            super(sVar);
            this.f15053d = i2Var;
            this.f15054e = obj;
        }

        @Override // qe.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(qe.s sVar) {
            if (this.f15053d.f0() == this.f15054e) {
                return null;
            }
            return qe.r.a();
        }
    }

    @sd.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {956, 958}, m = "invokeSuspend")
    static final class g extends sd.i implements zd.p<ie.i<? super a2>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f15058d;

        g(qd.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ie.i<? super a2> iVar, qd.d<? super md.i0> dVar) {
            return ((g) create(iVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            g gVar = i2.this.new g(dVar);
            gVar.f15058d = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r7.f15057c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f15056b
                qe.s r1 = (qe.s) r1
                java.lang.Object r3 = r7.f15055a
                qe.q r3 = (qe.q) r3
                java.lang.Object r4 = r7.f15058d
                ie.i r4 = (ie.i) r4
                md.u.b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                md.u.b(r8)
                goto L88
            L2b:
                md.u.b(r8)
                java.lang.Object r8 = r7.f15058d
                ie.i r8 = (ie.i) r8
                le.i2 r1 = le.i2.this
                java.lang.Object r1 = r1.f0()
                boolean r4 = r1 instanceof le.v
                if (r4 == 0) goto L49
                le.v r1 = (le.v) r1
                le.w r1 = r1.f15120e
                r7.f15057c = r3
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof le.u1
                if (r3 == 0) goto L88
                le.u1 r1 = (le.u1) r1
                le.n2 r1 = r1.b()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                ae.r.d(r3, r4)
                qe.s r3 = (qe.s) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = ae.r.b(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof le.v
                if (r5 == 0) goto L83
                r5 = r1
                le.v r5 = (le.v) r5
                le.w r5 = r5.f15120e
                r8.f15058d = r4
                r8.f15055a = r3
                r8.f15056b = r1
                r8.f15057c = r2
                java.lang.Object r5 = r4.c(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                qe.s r1 = r1.k()
                goto L65
            L88:
                md.i0 r8 = md.i0.f15558a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: le.i2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* synthetic */ class h extends ae.o implements zd.q<i2, te.f<?>, Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f15060a = new h();

        h() {
            super(3, i2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(i2 i2Var, te.f<?> fVar, Object obj) {
            i2Var.v0(fVar, obj);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ md.i0 invoke(i2 i2Var, te.f<?> fVar, Object obj) {
            d(i2Var, fVar, obj);
            return md.i0.f15558a;
        }
    }

    /* synthetic */ class i extends ae.o implements zd.q<i2, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f15061a = new i();

        i() {
            super(3, i2.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // zd.q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i2 i2Var, Object obj, Object obj2) {
            return i2Var.u0(obj, obj2);
        }
    }

    /* synthetic */ class j extends ae.o implements zd.q<i2, te.f<?>, Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f15062a = new j();

        j() {
            super(3, i2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(i2 i2Var, te.f<?> fVar, Object obj) {
            i2Var.B0(fVar, obj);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ md.i0 invoke(i2 i2Var, te.f<?> fVar, Object obj) {
            d(i2Var, fVar, obj);
            return md.i0.f15558a;
        }
    }

    public i2(boolean z10) {
        this._state = z10 ? j2.f15074g : j2.f15073f;
    }

    private final void A0(h2 h2Var) {
        h2Var.e(new n2());
        b3.b.a(f15038a, this, h2Var, h2Var.k());
    }

    private final Object B(qd.d<Object> dVar) {
        a aVar = new a(rd.c.c(dVar), this);
        aVar.A();
        r.a(aVar, invokeOnCompletion(new r2(aVar)));
        Object objX = aVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(te.f<?> fVar, Object obj) {
        if (k0()) {
            fVar.a(invokeOnCompletion(new e(fVar)));
        } else {
            fVar.d(md.i0.f15558a);
        }
    }

    private final int E0(Object obj) {
        if (obj instanceof i1) {
            if (((i1) obj).isActive()) {
                return 0;
            }
            if (!b3.b.a(f15038a, this, obj, j2.f15074g)) {
                return -1;
            }
            y0();
            return 1;
        }
        if (!(obj instanceof t1)) {
            return 0;
        }
        if (!b3.b.a(f15038a, this, obj, ((t1) obj).b())) {
            return -1;
        }
        y0();
        return 1;
    }

    private final String F0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof u1 ? ((u1) obj).isActive() ? "Active" : "New" : obj instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException H0(i2 i2Var, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return i2Var.G0(th, str);
    }

    private final Object J(Object obj) {
        Object objL0;
        do {
            Object objF0 = f0();
            if (!(objF0 instanceof u1) || ((objF0 instanceof c) && ((c) objF0).g())) {
                return j2.f15068a;
            }
            objL0 = L0(objF0, new c0(S(obj), false, 2, null));
        } while (objL0 == j2.f15070c);
        return objL0;
    }

    private final boolean J0(u1 u1Var, Object obj) throws Throwable {
        if (!b3.b.a(f15038a, this, u1Var, j2.g(obj))) {
            return false;
        }
        w0(null);
        x0(obj);
        Q(u1Var, obj);
        return true;
    }

    private final boolean K(Throwable th) {
        if (j0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        u uVarE0 = e0();
        return (uVarE0 == null || uVarE0 == o2.f15092a) ? z10 : uVarE0.a(th) || z10;
    }

    private final boolean K0(u1 u1Var, Throwable th) throws Throwable {
        n2 n2VarD0 = d0(u1Var);
        if (n2VarD0 == null) {
            return false;
        }
        if (!b3.b.a(f15038a, this, u1Var, new c(n2VarD0, false, th))) {
            return false;
        }
        s0(n2VarD0, th);
        return true;
    }

    private final Object L0(Object obj, Object obj2) {
        return !(obj instanceof u1) ? j2.f15068a : ((!(obj instanceof i1) && !(obj instanceof h2)) || (obj instanceof v) || (obj2 instanceof c0)) ? M0((u1) obj, obj2) : J0((u1) obj, obj2) ? obj2 : j2.f15070c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, le.i2] */
    private final Object M0(u1 u1Var, Object obj) throws Throwable {
        n2 n2VarD0 = d0(u1Var);
        if (n2VarD0 == null) {
            return j2.f15070c;
        }
        c cVar = u1Var instanceof c ? (c) u1Var : null;
        if (cVar == null) {
            cVar = new c(n2VarD0, false, null);
        }
        ae.h0 h0Var = new ae.h0();
        synchronized (cVar) {
            if (cVar.g()) {
                return j2.f15068a;
            }
            cVar.j(true);
            if (cVar != u1Var && !b3.b.a(f15038a, this, u1Var, cVar)) {
                return j2.f15070c;
            }
            boolean zF = cVar.f();
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            if (c0Var != null) {
                cVar.a(c0Var.f14990a);
            }
            ?? E = Boolean.valueOf(zF ? false : true).booleanValue() ? cVar.e() : 0;
            h0Var.f712a = E;
            md.i0 i0Var = md.i0.f15558a;
            if (E != 0) {
                s0(n2VarD0, E);
            }
            v vVarV = V(u1Var);
            return (vVarV == null || !N0(cVar, vVarV, obj)) ? T(cVar, obj) : j2.f15069b;
        }
    }

    private final boolean N0(c cVar, v vVar, Object obj) {
        while (a2.a.e(vVar.f15120e, false, false, new b(this, cVar, vVar, obj), 1, null) == o2.f15092a) {
            vVar = r0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    private final void Q(u1 u1Var, Object obj) throws Throwable {
        u uVarE0 = e0();
        if (uVarE0 != null) {
            uVarE0.dispose();
            D0(o2.f15092a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f14990a : null;
        if (!(u1Var instanceof h2)) {
            n2 n2VarB = u1Var.b();
            if (n2VarB != null) {
                t0(n2VarB, th);
                return;
            }
            return;
        }
        try {
            ((h2) u1Var).r(th);
        } catch (Throwable th2) {
            h0(new f0("Exception in completion handler " + u1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(c cVar, v vVar, Object obj) {
        v vVarR0 = r0(vVar);
        if (vVarR0 == null || !N0(cVar, vVarR0, obj)) {
            x(T(cVar, obj));
        }
    }

    private final Throwable S(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new b2(N(), null, this) : th;
        }
        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((q2) obj).U();
    }

    private final Object T(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thY;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f14990a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List<Throwable> listI = cVar.i(th);
            thY = Y(cVar, listI);
            if (thY != null) {
                v(thY, listI);
            }
        }
        if (thY != null && thY != th) {
            obj = new c0(thY, false, 2, null);
        }
        if (thY != null) {
            if (K(thY) || g0(thY)) {
                ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((c0) obj).b();
            }
        }
        if (!zF) {
            w0(thY);
        }
        x0(obj);
        b3.b.a(f15038a, this, cVar, j2.g(obj));
        Q(cVar, obj);
        return obj;
    }

    private final v V(u1 u1Var) {
        v vVar = u1Var instanceof v ? (v) u1Var : null;
        if (vVar != null) {
            return vVar;
        }
        n2 n2VarB = u1Var.b();
        if (n2VarB != null) {
            return r0(n2VarB);
        }
        return null;
    }

    private final Throwable X(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f14990a;
        }
        return null;
    }

    private final Throwable Y(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new b2(N(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof a3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof a3)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final n2 d0(u1 u1Var) {
        n2 n2VarB = u1Var.b();
        if (n2VarB != null) {
            return n2VarB;
        }
        if (u1Var instanceof i1) {
            return new n2();
        }
        if (u1Var instanceof h2) {
            A0((h2) u1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u1Var).toString());
    }

    private final boolean k0() {
        Object objF0;
        do {
            objF0 = f0();
            if (!(objF0 instanceof u1)) {
                return false;
            }
        } while (E0(objF0) < 0);
        return true;
    }

    private final Object l0(qd.d<? super md.i0> dVar) {
        p pVar = new p(rd.c.c(dVar), 1);
        pVar.A();
        r.a(pVar, invokeOnCompletion(new s2(pVar)));
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    private final Object m0(Object obj) throws Throwable {
        Throwable thS = null;
        while (true) {
            Object objF0 = f0();
            if (objF0 instanceof c) {
                synchronized (objF0) {
                    if (((c) objF0).h()) {
                        return j2.f15071d;
                    }
                    boolean zF = ((c) objF0).f();
                    if (obj != null || !zF) {
                        if (thS == null) {
                            thS = S(obj);
                        }
                        ((c) objF0).a(thS);
                    }
                    Throwable thE = zF ^ true ? ((c) objF0).e() : null;
                    if (thE != null) {
                        s0(((c) objF0).b(), thE);
                    }
                    return j2.f15068a;
                }
            }
            if (!(objF0 instanceof u1)) {
                return j2.f15071d;
            }
            if (thS == null) {
                thS = S(obj);
            }
            u1 u1Var = (u1) objF0;
            if (!u1Var.isActive()) {
                Object objL0 = L0(objF0, new c0(thS, false, 2, null));
                if (objL0 == j2.f15068a) {
                    throw new IllegalStateException(("Cannot happen in " + objF0).toString());
                }
                if (objL0 != j2.f15070c) {
                    return objL0;
                }
            } else if (K0(u1Var, thS)) {
                return j2.f15068a;
            }
        }
    }

    private final h2 p0(zd.l<? super Throwable, md.i0> lVar, boolean z10) {
        h2 z1Var;
        if (z10) {
            z1Var = lVar instanceof c2 ? (c2) lVar : null;
            if (z1Var == null) {
                z1Var = new y1(lVar);
            }
        } else {
            z1Var = lVar instanceof h2 ? (h2) lVar : null;
            if (z1Var == null) {
                z1Var = new z1(lVar);
            }
        }
        z1Var.t(this);
        return z1Var;
    }

    private final v r0(qe.s sVar) {
        while (sVar.m()) {
            sVar = sVar.l();
        }
        while (true) {
            sVar = sVar.k();
            if (!sVar.m()) {
                if (sVar instanceof v) {
                    return (v) sVar;
                }
                if (sVar instanceof n2) {
                    return null;
                }
            }
        }
    }

    private final void s0(n2 n2Var, Throwable th) throws Throwable {
        w0(th);
        Object objJ = n2Var.j();
        ae.r.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        f0 f0Var = null;
        for (qe.s sVarK = (qe.s) objJ; !ae.r.b(sVarK, n2Var); sVarK = sVarK.k()) {
            if (sVarK instanceof c2) {
                h2 h2Var = (h2) sVarK;
                try {
                    h2Var.r(th);
                } catch (Throwable th2) {
                    if (f0Var != null) {
                        md.f.a(f0Var, th2);
                    } else {
                        f0Var = new f0("Exception in completion handler " + h2Var + " for " + this, th2);
                        md.i0 i0Var = md.i0.f15558a;
                    }
                }
            }
        }
        if (f0Var != null) {
            h0(f0Var);
        }
        K(th);
    }

    private final void t0(n2 n2Var, Throwable th) throws Throwable {
        Object objJ = n2Var.j();
        ae.r.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        f0 f0Var = null;
        for (qe.s sVarK = (qe.s) objJ; !ae.r.b(sVarK, n2Var); sVarK = sVarK.k()) {
            if (sVarK instanceof h2) {
                h2 h2Var = (h2) sVarK;
                try {
                    h2Var.r(th);
                } catch (Throwable th2) {
                    if (f0Var != null) {
                        md.f.a(f0Var, th2);
                    } else {
                        f0Var = new f0("Exception in completion handler " + h2Var + " for " + this, th2);
                        md.i0 i0Var = md.i0.f15558a;
                    }
                }
            }
        }
        if (f0Var != null) {
            h0(f0Var);
        }
    }

    private final boolean u(Object obj, n2 n2Var, h2 h2Var) {
        int iQ;
        f fVar = new f(h2Var, this, obj);
        do {
            iQ = n2Var.l().q(h2Var, n2Var, fVar);
            if (iQ == 1) {
                return true;
            }
        } while (iQ != 2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof c0) {
            throw ((c0) obj2).f14990a;
        }
        return obj2;
    }

    private final void v(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                md.f.a(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(te.f<?> fVar, Object obj) {
        Object objF0;
        do {
            objF0 = f0();
            if (!(objF0 instanceof u1)) {
                if (!(objF0 instanceof c0)) {
                    objF0 = j2.h(objF0);
                }
                fVar.d(objF0);
                return;
            }
        } while (E0(objF0) < 0);
        fVar.a(invokeOnCompletion(new d(fVar)));
    }

    private final void z0(i1 i1Var) {
        n2 n2Var = new n2();
        Object t1Var = n2Var;
        if (!i1Var.isActive()) {
            t1Var = new t1(n2Var);
        }
        b3.b.a(f15038a, this, i1Var, t1Var);
    }

    @Override // le.w
    public final void A(q2 q2Var) throws Throwable {
        F(q2Var);
    }

    public final void C0(h2 h2Var) {
        Object objF0;
        do {
            objF0 = f0();
            if (!(objF0 instanceof h2)) {
                if (!(objF0 instanceof u1) || ((u1) objF0).b() == null) {
                    return;
                }
                h2Var.n();
                return;
            }
            if (objF0 != h2Var) {
                return;
            }
        } while (!b3.b.a(f15038a, this, objF0, j2.f15074g));
    }

    public final boolean D(Throwable th) {
        return F(th);
    }

    public final void D0(u uVar) {
        f15039b.set(this, uVar);
    }

    public final boolean F(Object obj) throws Throwable {
        Object objM0 = j2.f15068a;
        if (c0() && (objM0 = J(obj)) == j2.f15069b) {
            return true;
        }
        if (objM0 == j2.f15068a) {
            objM0 = m0(obj);
        }
        if (objM0 == j2.f15068a || objM0 == j2.f15069b) {
            return true;
        }
        if (objM0 == j2.f15071d) {
            return false;
        }
        x(objM0);
        return true;
    }

    protected final CancellationException G0(Throwable th, String str) {
        CancellationException b2Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (b2Var == null) {
            if (str == null) {
                str = N();
            }
            b2Var = new b2(str, th, this);
        }
        return b2Var;
    }

    public void I(Throwable th) throws Throwable {
        F(th);
    }

    public final String I0() {
        return q0() + '{' + F0(f0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String N() {
        return "Job was cancelled";
    }

    public boolean O(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return F(th) && a0();
    }

    @Override // le.q2
    public CancellationException U() {
        Throwable thE;
        Object objF0 = f0();
        if (objF0 instanceof c) {
            thE = ((c) objF0).e();
        } else if (objF0 instanceof c0) {
            thE = ((c0) objF0).f14990a;
        } else {
            if (objF0 instanceof u1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objF0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new b2("Parent job is " + F0(objF0), thE, this);
    }

    public final Object W() throws Throwable {
        Object objF0 = f0();
        if (!(!(objF0 instanceof u1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objF0 instanceof c0) {
            throw ((c0) objF0).f14990a;
        }
        return j2.h(objF0);
    }

    public boolean a0() {
        return true;
    }

    @Override // le.a2
    public final u attachChild(w wVar) {
        f1 f1VarE = a2.a.e(this, true, false, new v(wVar), 2, null);
        ae.r.d(f1VarE, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (u) f1VarE;
    }

    protected final te.c<?> b0() {
        h hVar = h.f15060a;
        ae.r.d(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        zd.q qVar = (zd.q) ae.n0.e(hVar, 3);
        i iVar = i.f15061a;
        ae.r.d(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new te.d(this, qVar, (zd.q) ae.n0.e(iVar, 3), null, 8, null);
    }

    public boolean c0() {
        return false;
    }

    @Override // le.a2
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // le.a2
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new b2(N(), null, this);
        }
        I(cancellationException);
    }

    @Override // le.a2
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable b2Var;
        if (th == null || (b2Var = H0(this, th, null, 1, null)) == null) {
            b2Var = new b2(N(), null, this);
        }
        I(b2Var);
        return true;
    }

    public final u e0() {
        return (u) f15039b.get(this);
    }

    public final Object f0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15038a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof qe.a0)) {
                return obj;
            }
            ((qe.a0) obj).a(this);
        }
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) a2.a.c(this, r10, pVar);
    }

    protected boolean g0(Throwable th) {
        return false;
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) a2.a.d(this, cVar);
    }

    @Override // le.a2
    public final CancellationException getCancellationException() {
        Object objF0 = f0();
        if (!(objF0 instanceof c)) {
            if (objF0 instanceof u1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objF0 instanceof c0) {
                return H0(this, ((c0) objF0).f14990a, null, 1, null);
            }
            return new b2(r0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objF0).e();
        if (thE != null) {
            CancellationException cancellationExceptionG0 = G0(thE, r0.a(this) + " is cancelling");
            if (cancellationExceptionG0 != null) {
                return cancellationExceptionG0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // le.a2
    public final ie.g<a2> getChildren() {
        return ie.k.b(new g(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objF0 = f0();
        if (!(objF0 instanceof u1)) {
            return X(objF0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // qd.g.b
    public final g.c<?> getKey() {
        return a2.R;
    }

    @Override // le.a2
    public final te.a getOnJoin() {
        j jVar = j.f15062a;
        ae.r.d(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new te.b(this, (zd.q) ae.n0.e(jVar, 3), null, 4, null);
    }

    @Override // le.a2
    public a2 getParent() {
        u uVarE0 = e0();
        if (uVarE0 != null) {
            return uVarE0.getParent();
        }
        return null;
    }

    public void h0(Throwable th) throws Throwable {
        throw th;
    }

    protected final void i0(a2 a2Var) {
        if (a2Var == null) {
            D0(o2.f15092a);
            return;
        }
        a2Var.start();
        u uVarAttachChild = a2Var.attachChild(this);
        D0(uVarAttachChild);
        if (isCompleted()) {
            uVarAttachChild.dispose();
            D0(o2.f15092a);
        }
    }

    @Override // le.a2
    public final f1 invokeOnCompletion(zd.l<? super Throwable, md.i0> lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    @Override // le.a2
    public final f1 invokeOnCompletion(boolean z10, boolean z11, zd.l<? super Throwable, md.i0> lVar) {
        h2 h2VarP0 = p0(lVar, z10);
        while (true) {
            Object objF0 = f0();
            if (objF0 instanceof i1) {
                i1 i1Var = (i1) objF0;
                if (!i1Var.isActive()) {
                    z0(i1Var);
                } else if (b3.b.a(f15038a, this, objF0, h2VarP0)) {
                    return h2VarP0;
                }
            } else {
                if (!(objF0 instanceof u1)) {
                    if (z11) {
                        c0 c0Var = objF0 instanceof c0 ? (c0) objF0 : null;
                        lVar.invoke(c0Var != null ? c0Var.f14990a : null);
                    }
                    return o2.f15092a;
                }
                n2 n2VarB = ((u1) objF0).b();
                if (n2VarB == null) {
                    ae.r.d(objF0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    A0((h2) objF0);
                } else {
                    f1 f1Var = o2.f15092a;
                    if (z10 && (objF0 instanceof c)) {
                        synchronized (objF0) {
                            thE = ((c) objF0).e();
                            if (thE == null || ((lVar instanceof v) && !((c) objF0).g())) {
                                if (u(objF0, n2VarB, h2VarP0)) {
                                    if (thE == null) {
                                        return h2VarP0;
                                    }
                                    f1Var = h2VarP0;
                                }
                            }
                            md.i0 i0Var = md.i0.f15558a;
                        }
                    }
                    if (thE != null) {
                        if (z11) {
                            lVar.invoke(thE);
                        }
                        return f1Var;
                    }
                    if (u(objF0, n2VarB, h2VarP0)) {
                        return h2VarP0;
                    }
                }
            }
        }
    }

    @Override // le.a2
    public boolean isActive() {
        Object objF0 = f0();
        return (objF0 instanceof u1) && ((u1) objF0).isActive();
    }

    @Override // le.a2
    public final boolean isCancelled() {
        Object objF0 = f0();
        return (objF0 instanceof c0) || ((objF0 instanceof c) && ((c) objF0).f());
    }

    @Override // le.a2
    public final boolean isCompleted() {
        return !(f0() instanceof u1);
    }

    protected boolean j0() {
        return false;
    }

    @Override // le.a2
    public final Object join(qd.d<? super md.i0> dVar) {
        if (k0()) {
            Object objL0 = l0(dVar);
            return objL0 == rd.d.e() ? objL0 : md.i0.f15558a;
        }
        e2.m(dVar.getContext());
        return md.i0.f15558a;
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return a2.a.f(this, cVar);
    }

    public final boolean n0(Object obj) {
        Object objL0;
        do {
            objL0 = L0(f0(), obj);
            if (objL0 == j2.f15068a) {
                return false;
            }
            if (objL0 == j2.f15069b) {
                return true;
            }
        } while (objL0 == j2.f15070c);
        x(objL0);
        return true;
    }

    public final Object o0(Object obj) {
        Object objL0;
        do {
            objL0 = L0(f0(), obj);
            if (objL0 == j2.f15068a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (objL0 == j2.f15070c);
        return objL0;
    }

    @Override // le.a2
    public a2 plus(a2 a2Var) {
        return a2.a.g(this, a2Var);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return a2.a.h(this, gVar);
    }

    public String q0() {
        return r0.a(this);
    }

    @Override // le.a2
    public final boolean start() {
        int iE0;
        do {
            iE0 = E0(f0());
            if (iE0 == 0) {
                return false;
            }
        } while (iE0 != 1);
        return true;
    }

    public String toString() {
        return I0() + '@' + r0.b(this);
    }

    protected void w0(Throwable th) {
    }

    protected void x(Object obj) {
    }

    protected void x0(Object obj) {
    }

    protected void y0() {
    }

    protected final Object z(qd.d<Object> dVar) throws Throwable {
        Object objF0;
        do {
            objF0 = f0();
            if (!(objF0 instanceof u1)) {
                if (objF0 instanceof c0) {
                    throw ((c0) objF0).f14990a;
                }
                return j2.h(objF0);
            }
        } while (E0(objF0) < 0);
        return B(dVar);
    }
}
