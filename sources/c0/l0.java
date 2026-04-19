package c0;

import t0.e2;
import t0.k3;
import t0.o2;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f6095f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0.d<a<?, ?>> f6097b = new v0.d<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.k1 f6098c = k3.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6099d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.k1 f6100e = k3.e(Boolean.TRUE, null, 2, null);

    public final class a<T, V extends q> implements p3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f6101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f6102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j1<T, V> f6103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f6104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final t0.k1 f6105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<T> f6106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e1<T, V> f6107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f6108h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f6109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f6110j;

        public a(T t10, T t11, j1<T, V> j1Var, i<T> iVar, String str) {
            this.f6101a = t10;
            this.f6102b = t11;
            this.f6103c = j1Var;
            this.f6104d = str;
            this.f6105e = k3.e(t10, null, 2, null);
            this.f6106f = iVar;
            this.f6107g = new e1<>(this.f6106f, j1Var, this.f6101a, this.f6102b, null, 16, null);
        }

        public final T c() {
            return this.f6101a;
        }

        public final T f() {
            return this.f6102b;
        }

        @Override // t0.p3
        public T getValue() {
            return this.f6105e.getValue();
        }

        public final boolean i() {
            return this.f6108h;
        }

        public final void j(long j10) {
            l0.this.l(false);
            if (this.f6109i) {
                this.f6109i = false;
                this.f6110j = j10;
            }
            long j11 = j10 - this.f6110j;
            m(this.f6107g.f(j11));
            this.f6108h = this.f6107g.e(j11);
        }

        public final void l() {
            this.f6109i = true;
        }

        public void m(T t10) {
            this.f6105e.setValue(t10);
        }

        public final void n() {
            m(this.f6107g.g());
            this.f6109i = true;
        }

        public final void p(T t10, T t11, i<T> iVar) {
            this.f6101a = t10;
            this.f6102b = t11;
            this.f6106f = iVar;
            this.f6107g = new e1<>(iVar, this.f6103c, t10, t11, null, 16, null);
            l0.this.l(true);
            this.f6108h = false;
            this.f6109i = true;
        }
    }

    @sd.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0.k1<p3<Long>> f6115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0 f6116e;

        static final class a extends ae.s implements zd.l<Long, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0.k1<p3<Long>> f6117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f6118b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ae.e0 f6119c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ le.n0 f6120d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0.k1<p3<Long>> k1Var, l0 l0Var, ae.e0 e0Var, le.n0 n0Var) {
                super(1);
                this.f6117a = k1Var;
                this.f6118b = l0Var;
                this.f6119c = e0Var;
                this.f6120d = n0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(long r7) {
                /*
                    r6 = this;
                    t0.k1<t0.p3<java.lang.Long>> r0 = r6.f6117a
                    java.lang.Object r0 = r0.getValue()
                    t0.p3 r0 = (t0.p3) r0
                    if (r0 == 0) goto L15
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r0 = r0.longValue()
                    goto L16
                L15:
                    r0 = r7
                L16:
                    c0.l0 r2 = r6.f6118b
                    long r2 = c0.l0.a(r2)
                    r4 = -9223372036854775808
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L3b
                    ae.e0 r2 = r6.f6119c
                    float r2 = r2.f701a
                    le.n0 r5 = r6.f6120d
                    qd.g r5 = r5.getCoroutineContext()
                    float r5 = c0.d1.l(r5)
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 != 0) goto L38
                    r2 = r3
                    goto L39
                L38:
                    r2 = r4
                L39:
                    if (r2 != 0) goto L69
                L3b:
                    c0.l0 r2 = r6.f6118b
                    c0.l0.e(r2, r7)
                    c0.l0 r7 = r6.f6118b
                    v0.d r7 = c0.l0.b(r7)
                    int r8 = r7.o()
                    if (r8 <= 0) goto L5b
                    java.lang.Object[] r7 = r7.n()
                    r2 = r4
                L51:
                    r5 = r7[r2]
                    c0.l0$a r5 = (c0.l0.a) r5
                    r5.l()
                    int r2 = r2 + r3
                    if (r2 < r8) goto L51
                L5b:
                    ae.e0 r7 = r6.f6119c
                    le.n0 r8 = r6.f6120d
                    qd.g r8 = r8.getCoroutineContext()
                    float r8 = c0.d1.l(r8)
                    r7.f701a = r8
                L69:
                    ae.e0 r7 = r6.f6119c
                    float r7 = r7.f701a
                    r8 = 0
                    int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                    if (r7 != 0) goto L74
                    r7 = r3
                    goto L75
                L74:
                    r7 = r4
                L75:
                    if (r7 == 0) goto L92
                    c0.l0 r7 = r6.f6118b
                    v0.d r7 = c0.l0.b(r7)
                    int r8 = r7.o()
                    if (r8 <= 0) goto La5
                    java.lang.Object[] r7 = r7.n()
                L87:
                    r0 = r7[r4]
                    c0.l0$a r0 = (c0.l0.a) r0
                    r0.n()
                    int r4 = r4 + r3
                    if (r4 < r8) goto L87
                    goto La5
                L92:
                    c0.l0 r7 = r6.f6118b
                    long r7 = c0.l0.a(r7)
                    long r0 = r0 - r7
                    float r7 = (float) r0
                    ae.e0 r8 = r6.f6119c
                    float r8 = r8.f701a
                    float r7 = r7 / r8
                    long r7 = (long) r7
                    c0.l0 r0 = r6.f6118b
                    c0.l0.c(r0, r7)
                La5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: c0.l0.b.a.a(long):void");
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Long l10) {
                a(l10.longValue());
                return md.i0.f15558a;
            }
        }

        /* JADX INFO: renamed from: c0.l0$b$b, reason: collision with other inner class name */
        static final class C0147b extends ae.s implements zd.a<Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ le.n0 f6121a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0147b(le.n0 n0Var) {
                super(0);
                this.f6121a = n0Var;
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(d1.l(this.f6121a.getCoroutineContext()));
            }
        }

        @sd.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        static final class c extends sd.j implements zd.p<Float, qd.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f6122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ float f6123b;

            c(qd.d<? super c> dVar) {
                super(2, dVar);
            }

            public final Object a(float f10, qd.d<? super Boolean> dVar) {
                return ((c) create(Float.valueOf(f10), dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.f6123b = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ Object invoke(Float f10, qd.d<? super Boolean> dVar) {
                return a(f10.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f6122a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                return sd.a.a(this.f6123b > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0.k1<p3<Long>> k1Var, l0 l0Var, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f6115d = k1Var;
            this.f6116e = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f6115d, this.f6116e, dVar);
            bVar.f6114c = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:12:0x0042). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r8.f6113b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f6112a
                ae.e0 r1 = (ae.e0) r1
                java.lang.Object r4 = r8.f6114c
                le.n0 r4 = (le.n0) r4
                md.u.b(r9)
                r9 = r4
                goto L41
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f6112a
                ae.e0 r1 = (ae.e0) r1
                java.lang.Object r4 = r8.f6114c
                le.n0 r4 = (le.n0) r4
                md.u.b(r9)
                r9 = r4
                r4 = r8
                goto L58
            L31:
                md.u.b(r9)
                java.lang.Object r9 = r8.f6114c
                le.n0 r9 = (le.n0) r9
                ae.e0 r1 = new ae.e0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f701a = r4
            L41:
                r4 = r8
            L42:
                c0.l0$b$a r5 = new c0.l0$b$a
                t0.k1<t0.p3<java.lang.Long>> r6 = r4.f6115d
                c0.l0 r7 = r4.f6116e
                r5.<init>(r6, r7, r1, r9)
                r4.f6114c = r9
                r4.f6112a = r1
                r4.f6113b = r3
                java.lang.Object r5 = c0.j0.a(r5, r4)
                if (r5 != r0) goto L58
                return r0
            L58:
                float r5 = r1.f701a
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L61
                r5 = r3
                goto L62
            L61:
                r5 = 0
            L62:
                if (r5 == 0) goto L42
                c0.l0$b$b r5 = new c0.l0$b$b
                r5.<init>(r9)
                oe.e r5 = t0.f3.p(r5)
                c0.l0$b$c r6 = new c0.l0$b$c
                r7 = 0
                r6.<init>(r7)
                r4.f6114c = r9
                r4.f6112a = r1
                r4.f6113b = r2
                java.lang.Object r5 = oe.g.m(r5, r6, r4)
                if (r5 != r0) goto L42
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.l0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f6125b = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            l0.this.k(lVar, e2.a(this.f6125b | 1));
        }
    }

    public l0(String str) {
        this.f6096a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.f6098c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.f6100e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        v0.d<a<?, ?>> dVar = this.f6097b;
        int iO = dVar.o();
        if (iO > 0) {
            a<?, ?>[] aVarArrN = dVar.n();
            z10 = true;
            int i10 = 0;
            do {
                a<?, ?> aVar = aVarArrN[i10];
                if (!aVar.i()) {
                    aVar.j(j10);
                }
                if (!aVar.i()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < iO);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f6098c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f6100e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a<?, ?> aVar) {
        this.f6097b.b(aVar);
        l(true);
    }

    public final void j(a<?, ?> aVar) {
        this.f6097b.v(aVar);
    }

    public final void k(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-318043801);
        if (t0.o.I()) {
            t0.o.U(-318043801, i10, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        if (objF == t0.l.f20813a.a()) {
            objF = k3.e(null, null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        t0.k1 k1Var = (t0.k1) objF;
        if (h() || g()) {
            t0.l0.d(this, new b(k1Var, this, null), lVarP, 72);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new c(i10));
        }
    }
}
