package v1;

import androidx.compose.ui.e;
import b2.x1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import le.a2;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends e.c implements q0, k0, w2.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.p<? super k0, ? super qd.d<? super md.i0>, ? extends Object> f21970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a2 f21971o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f21975s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p f21972p = p0.f21965a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v0.d<a<?>> f21973q = new v0.d<>(new a[16], 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v0.d<a<?>> f21974r = new v0.d<>(new a[16], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f21976t = w2.p.f22421b.a();

    private final class a<R> implements v1.c, w2.d, qd.d<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.d<R> f21977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ r0 f21978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private le.o<? super p> f21979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private r f21980d = r.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final qd.g f21981e = qd.h.f19040a;

        /* JADX INFO: renamed from: v1.r0$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {728}, m = "withTimeout")
        static final class C0456a<T> extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f21983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f21984b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<R> f21985c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f21986d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0456a(a<R> aVar, qd.d<? super C0456a> dVar) {
                super(dVar);
                this.f21985c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f21984b = obj;
                this.f21986d |= Integer.MIN_VALUE;
                return this.f21985c.P(0L, null, this);
            }
        }

        @sd.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {720, 721}, m = "invokeSuspend")
        static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f21988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<R> f21989c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, a<R> aVar, qd.d<? super b> dVar) {
                super(2, dVar);
                this.f21988b = j10;
                this.f21989c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new b(this.f21988b, this.f21989c, dVar);
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r8.f21987a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    md.u.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    md.u.b(r9)
                    goto L2f
                L20:
                    md.u.b(r9)
                    long r6 = r8.f21988b
                    long r6 = r6 - r2
                    r8.f21987a = r5
                    java.lang.Object r9 = le.x0.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f21987a = r4
                    java.lang.Object r9 = le.x0.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    v1.r0$a<R> r9 = r8.f21989c
                    le.o r9 = v1.r0.a.k(r9)
                    if (r9 == 0) goto L54
                    md.t$a r0 = md.t.f15576b
                    v1.s r0 = new v1.s
                    long r1 = r8.f21988b
                    r0.<init>(r1)
                    java.lang.Object r0 = md.u.a(r0)
                    java.lang.Object r0 = md.t.b(r0)
                    r9.resumeWith(r0)
                L54:
                    md.i0 r9 = md.i0.f15558a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: v1.r0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @sd.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {699}, m = "withTimeoutOrNull")
        static final class c<T> extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f21990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<R> f21991b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f21992c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, qd.d<? super c> dVar) {
                super(dVar);
                this.f21991b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f21990a = obj;
                this.f21992c |= Integer.MIN_VALUE;
                return this.f21991b.P0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(qd.d<? super R> dVar) {
            this.f21977a = dVar;
            this.f21978b = r0.this;
        }

        public final void A(p pVar, r rVar) {
            le.o<? super p> oVar;
            if (rVar != this.f21980d || (oVar = this.f21979c) == null) {
                return;
            }
            this.f21979c = null;
            oVar.resumeWith(md.t.b(pVar));
        }

        @Override // w2.d
        public float G0(float f10) {
            return this.f21978b.G0(f10);
        }

        @Override // v1.c
        public Object J(r rVar, qd.d<? super p> dVar) {
            le.p pVar = new le.p(rd.c.c(dVar), 1);
            pVar.A();
            this.f21980d = rVar;
            this.f21979c = pVar;
            Object objX = pVar.x();
            if (objX == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objX;
        }

        @Override // v1.c
        public p K() {
            return r0.this.f21972p;
        }

        @Override // w2.d
        public long N(long j10) {
            return this.f21978b.N(j10);
        }

        @Override // v1.c
        public long O0() {
            return r0.this.O0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [le.a2] */
        /* JADX WARN: Type inference failed for: r11v3, types: [le.a2] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // v1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object P(long r11, zd.p<? super v1.c, ? super qd.d<? super T>, ? extends java.lang.Object> r13, qd.d<? super T> r14) throws java.lang.Throwable {
            /*
                r10 = this;
                boolean r0 = r14 instanceof v1.r0.a.C0456a
                if (r0 == 0) goto L13
                r0 = r14
                v1.r0$a$a r0 = (v1.r0.a.C0456a) r0
                int r1 = r0.f21986d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21986d = r1
                goto L18
            L13:
                v1.r0$a$a r0 = new v1.r0$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f21984b
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f21986d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.f21983a
                le.a2 r11 = (le.a2) r11
                md.u.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                md.u.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                le.o<? super v1.p> r14 = r10.f21979c
                if (r14 == 0) goto L56
                md.t$a r2 = md.t.f15576b
                v1.s r2 = new v1.s
                r2.<init>(r11)
                java.lang.Object r2 = md.u.a(r2)
                java.lang.Object r2 = md.t.b(r2)
                r14.resumeWith(r2)
            L56:
                v1.r0 r14 = v1.r0.this
                le.n0 r4 = r14.A1()
                r5 = 0
                r6 = 0
                v1.r0$a$b r7 = new v1.r0$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                le.a2 r11 = le.i.d(r4, r5, r6, r7, r8, r9)
                r0.f21983a = r11     // Catch: java.lang.Throwable -> L2d
                r0.f21986d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                v1.d r12 = v1.d.f21904a
                r11.cancel(r12)
                return r14
            L7b:
                v1.d r13 = v1.d.f21904a
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.r0.a.P(long, zd.p, qd.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // v1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object P0(long r5, zd.p<? super v1.c, ? super qd.d<? super T>, ? extends java.lang.Object> r7, qd.d<? super T> r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof v1.r0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                v1.r0$a$c r0 = (v1.r0.a.c) r0
                int r1 = r0.f21992c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21992c = r1
                goto L18
            L13:
                v1.r0$a$c r0 = new v1.r0$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f21990a
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f21992c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                md.u.b(r8)     // Catch: v1.s -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                md.u.b(r8)
                r0.f21992c = r3     // Catch: v1.s -> L3d
                java.lang.Object r8 = r4.P(r5, r7, r0)     // Catch: v1.s -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.r0.a.P0(long, zd.p, qd.d):java.lang.Object");
        }

        @Override // w2.l
        public float Q(long j10) {
            return this.f21978b.Q(j10);
        }

        @Override // v1.c
        public long a() {
            return r0.this.f21976t;
        }

        @Override // w2.d
        public int a1(float f10) {
            return this.f21978b.a1(f10);
        }

        @Override // w2.l
        public long g(float f10) {
            return this.f21978b.g(f10);
        }

        @Override // qd.d
        public qd.g getContext() {
            return this.f21981e;
        }

        @Override // w2.d
        public float getDensity() {
            return this.f21978b.getDensity();
        }

        @Override // v1.c
        public x1 getViewConfiguration() {
            return r0.this.getViewConfiguration();
        }

        @Override // w2.d
        public float l0(int i10) {
            return this.f21978b.l0(i10);
        }

        @Override // w2.d
        public float n0(float f10) {
            return this.f21978b.n0(f10);
        }

        @Override // w2.d
        public float o1(long j10) {
            return this.f21978b.o1(j10);
        }

        @Override // w2.d
        public long q(float f10) {
            return this.f21978b.q(f10);
        }

        @Override // qd.d
        public void resumeWith(Object obj) {
            v0.d dVar = r0.this.f21973q;
            r0 r0Var = r0.this;
            synchronized (dVar) {
                r0Var.f21973q.v(this);
                md.i0 i0Var = md.i0.f15558a;
            }
            this.f21977a.resumeWith(obj);
        }

        @Override // w2.d
        public long w(long j10) {
            return this.f21978b.w(j10);
        }

        public final void x(Throwable th) {
            le.o<? super p> oVar = this.f21979c;
            if (oVar != null) {
                oVar.cancel(th);
            }
            this.f21979c = null;
        }

        @Override // w2.l
        public float y0() {
            return this.f21978b.y0();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21993a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21993a = iArr;
        }
    }

    static final class c extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<R> f21994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f21994a = aVar;
        }

        public final void a(Throwable th) {
            this.f21994a.x(th);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {562}, m = "invokeSuspend")
    static final class d extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21995a;

        d(qd.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return r0.this.new d(dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f21995a;
            if (i10 == 0) {
                md.u.b(obj);
                zd.p<k0, qd.d<? super md.i0>, Object> pVarE2 = r0.this.e2();
                r0 r0Var = r0.this;
                this.f21995a = 1;
                if (pVarE2.invoke(r0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    public r0(zd.p<? super k0, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        this.f21970n = pVar;
    }

    private final void d2(p pVar, r rVar) {
        v0.d<a<?>> dVar;
        int iO;
        synchronized (this.f21973q) {
            v0.d<a<?>> dVar2 = this.f21974r;
            dVar2.d(dVar2.o(), this.f21973q);
        }
        try {
            int i10 = b.f21993a[rVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                v0.d<a<?>> dVar3 = this.f21974r;
                int iO2 = dVar3.o();
                if (iO2 > 0) {
                    int i11 = 0;
                    a<?>[] aVarArrN = dVar3.n();
                    do {
                        aVarArrN[i11].A(pVar, rVar);
                        i11++;
                    } while (i11 < iO2);
                }
            } else if (i10 == 3 && (iO = (dVar = this.f21974r).o()) > 0) {
                int i12 = iO - 1;
                a<?>[] aVarArrN2 = dVar.n();
                do {
                    aVarArrN2[i12].A(pVar, rVar);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.f21974r.i();
        }
    }

    @Override // v1.k0
    public <R> Object B0(zd.p<? super v1.c, ? super qd.d<? super R>, ? extends Object> pVar, qd.d<? super R> dVar) {
        le.p pVar2 = new le.p(rd.c.c(dVar), 1);
        pVar2.A();
        a aVar = new a(pVar2);
        synchronized (this.f21973q) {
            this.f21973q.b(aVar);
            qd.d<md.i0> dVarA = qd.f.a(pVar, aVar, aVar);
            t.a aVar2 = md.t.f15576b;
            dVarA.resumeWith(md.t.b(md.i0.f15558a));
        }
        pVar2.p(new c(aVar));
        Object objX = pVar2.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        w1();
        super.L1();
    }

    public long O0() {
        long jW = w(getViewConfiguration().d());
        long jA = a();
        return k1.m.a(Math.max(0.0f, k1.l.i(jW) - w2.p.g(jA)) / 2.0f, Math.max(0.0f, k1.l.g(jW) - w2.p.f(jA)) / 2.0f);
    }

    @Override // a2.j1
    public void Z(p pVar, r rVar, long j10) {
        this.f21976t = j10;
        if (rVar == r.Initial) {
            this.f21972p = pVar;
        }
        if (this.f21971o == null) {
            this.f21971o = le.k.d(A1(), null, le.p0.UNDISPATCHED, new d(null), 1, null);
        }
        d2(pVar, rVar);
        List<b0> listC = pVar.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!q.d(listC.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            pVar = null;
        }
        this.f21975s = pVar;
    }

    @Override // v1.k0
    public long a() {
        return this.f21976t;
    }

    @Override // a2.j1
    public void c0() {
        boolean z10;
        p pVar = this.f21975s;
        if (pVar == null) {
            return;
        }
        List<b0> listC = pVar.c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= size) {
                break;
            }
            if (!(true ^ listC.get(i10).j())) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        List<b0> listC2 = pVar.c();
        ArrayList arrayList = new ArrayList(listC2.size());
        int size2 = listC2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            b0 b0Var = listC2.get(i11);
            arrayList.add(new b0(b0Var.g(), b0Var.p(), b0Var.i(), false, b0Var.k(), b0Var.p(), b0Var.i(), b0Var.j(), b0Var.j(), 0, 0L, 1536, (ae.j) null));
        }
        p pVar2 = new p(arrayList);
        this.f21972p = pVar2;
        d2(pVar2, r.Initial);
        d2(pVar2, r.Main);
        d2(pVar2, r.Final);
        this.f21975s = null;
    }

    public zd.p<k0, qd.d<? super md.i0>, Object> e2() {
        return this.f21970n;
    }

    public void f2(zd.p<? super k0, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        w1();
        this.f21970n = pVar;
    }

    @Override // w2.d
    public float getDensity() {
        return a2.k.k(this).I().getDensity();
    }

    @Override // v1.k0
    public x1 getViewConfiguration() {
        return a2.k.k(this).o0();
    }

    @Override // a2.j1
    public void n1() {
        w1();
    }

    @Override // a2.j1
    public void w0() {
        w1();
    }

    @Override // v1.q0
    public void w1() {
        a2 a2Var = this.f21971o;
        if (a2Var != null) {
            a2Var.cancel((CancellationException) new j0());
            this.f21971o = null;
        }
    }

    @Override // w2.l
    public float y0() {
        return a2.k.k(this).I().y0();
    }
}
