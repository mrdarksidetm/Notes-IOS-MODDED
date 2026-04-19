package p0;

import c0.d0;
import c0.i1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import l1.j0;
import le.a2;
import le.n0;
import le.o0;
import le.x;
import le.z;
import md.i0;
import md.u;
import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k1.f f17796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f17799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Float f17800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k1.f f17801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0.a<Float, c0.m> f17802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0.a<Float, c0.m> f17803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0.a<Float, c0.m> f17804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x<i0> f17805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k1 f17806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k1 f17807l;

    @sd.d(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "animate")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17809b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17811d;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17809b = obj;
            this.f17811d |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<n0, qd.d<? super a2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17813b;

        @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {R.styleable.AppCompatTheme_popupMenuStyle}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17815a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f17816b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f17816b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f17816b, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f17815a;
                if (i10 == 0) {
                    u.b(obj);
                    c0.a aVar = this.f17816b.f17802g;
                    Float fC = sd.a.c(1.0f);
                    i1 i1VarI = c0.j.i(75, 0, d0.d(), 2, null);
                    this.f17815a = 1;
                    if (c0.a.f(aVar, fC, i1VarI, null, null, this, 12, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        /* JADX INFO: renamed from: p0.g$b$b, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
        static final class C0379b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f17818b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0379b(g gVar, qd.d<? super C0379b> dVar) {
                super(2, dVar);
                this.f17818b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new C0379b(this.f17818b, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((C0379b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f17817a;
                if (i10 == 0) {
                    u.b(obj);
                    c0.a aVar = this.f17818b.f17803h;
                    Float fC = sd.a.c(1.0f);
                    i1 i1VarI = c0.j.i(225, 0, d0.c(), 2, null);
                    this.f17817a = 1;
                    if (c0.a.f(aVar, fC, i1VarI, null, null, this, 12, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
        static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f17820b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g gVar, qd.d<? super c> dVar) {
                super(2, dVar);
                this.f17820b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new c(this.f17820b, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f17819a;
                if (i10 == 0) {
                    u.b(obj);
                    c0.a aVar = this.f17820b.f17804i;
                    Float fC = sd.a.c(1.0f);
                    i1 i1VarI = c0.j.i(225, 0, d0.d(), 2, null);
                    this.f17819a = 1;
                    if (c0.a.f(aVar, fC, i1VarI, null, null, this, 12, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        b(qd.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = g.this.new b(dVar);
            bVar.f17813b = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super a2> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f17812a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n0 n0Var = (n0) this.f17813b;
            le.k.d(n0Var, null, null, new a(g.this, null), 3, null);
            le.k.d(n0Var, null, null, new C0379b(g.this, null), 3, null);
            return le.k.d(n0Var, null, null, new c(g.this, null), 3, null);
        }
    }

    @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super a2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17822b;

        @sd.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f17825b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f17825b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f17825b, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f17824a;
                if (i10 == 0) {
                    u.b(obj);
                    c0.a aVar = this.f17825b.f17802g;
                    Float fC = sd.a.c(0.0f);
                    i1 i1VarI = c0.j.i(150, 0, d0.d(), 2, null);
                    this.f17824a = 1;
                    if (c0.a.f(aVar, fC, i1VarI, null, null, this, 12, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        c(qd.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = g.this.new c(dVar);
            cVar.f17822b = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super a2> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f17821a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return le.k.d((n0) this.f17822b, null, null, new a(g.this, null), 3, null);
        }
    }

    private g(k1.f fVar, float f10, boolean z10) {
        this.f17796a = fVar;
        this.f17797b = f10;
        this.f17798c = z10;
        this.f17802g = c0.b.b(0.0f, 0.0f, 2, null);
        this.f17803h = c0.b.b(0.0f, 0.0f, 2, null);
        this.f17804i = c0.b.b(0.0f, 0.0f, 2, null);
        this.f17805j = z.a(null);
        Boolean bool = Boolean.FALSE;
        this.f17806k = k3.e(bool, null, 2, null);
        this.f17807l = k3.e(bool, null, 2, null);
    }

    public /* synthetic */ g(k1.f fVar, float f10, boolean z10, ae.j jVar) {
        this(fVar, f10, z10);
    }

    private final Object f(qd.d<? super i0> dVar) {
        Object objE = o0.e(new b(null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    private final Object g(qd.d<? super i0> dVar) {
        Object objE = o0.e(new c(null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.f17807l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j() {
        return ((Boolean) this.f17806k.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f17807l.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f17806k.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p0.g.a
            if (r0 == 0) goto L13
            r0 = r7
            p0.g$a r0 = (p0.g.a) r0
            int r1 = r0.f17811d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17811d = r1
            goto L18
        L13:
            p0.g$a r0 = new p0.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17809b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f17811d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            md.u.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f17808a
            p0.g r2 = (p0.g) r2
            md.u.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f17808a
            p0.g r2 = (p0.g) r2
            md.u.b(r7)
            goto L56
        L47:
            md.u.b(r7)
            r0.f17808a = r6
            r0.f17811d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            le.x<md.i0> r7 = r2.f17805j
            r0.f17808a = r2
            r0.f17811d = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f17808a = r7
            r0.f17811d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.d(qd.d):java.lang.Object");
    }

    public final void e(n1.f fVar, long j10) {
        if (this.f17799d == null) {
            this.f17799d = Float.valueOf(h.b(fVar.c()));
        }
        if (this.f17800e == null) {
            this.f17800e = Float.valueOf(Float.isNaN(this.f17797b) ? h.a(fVar, this.f17798c, fVar.c()) : fVar.G0(this.f17797b));
        }
        if (this.f17796a == null) {
            this.f17796a = k1.f.d(fVar.h1());
        }
        if (this.f17801f == null) {
            this.f17801f = k1.f.d(k1.g.a(k1.l.i(fVar.c()) / 2.0f, k1.l.g(fVar.c()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? this.f17802g.m().floatValue() : 1.0f;
        Float f10 = this.f17799d;
        ae.r.c(f10);
        float fFloatValue2 = f10.floatValue();
        Float f11 = this.f17800e;
        ae.r.c(f11);
        float fA = y2.b.a(fFloatValue2, f11.floatValue(), this.f17803h.m().floatValue());
        k1.f fVar2 = this.f17796a;
        ae.r.c(fVar2);
        float fO = k1.f.o(fVar2.x());
        k1.f fVar3 = this.f17801f;
        ae.r.c(fVar3);
        float fA2 = y2.b.a(fO, k1.f.o(fVar3.x()), this.f17804i.m().floatValue());
        k1.f fVar4 = this.f17796a;
        ae.r.c(fVar4);
        float fP = k1.f.p(fVar4.x());
        k1.f fVar5 = this.f17801f;
        ae.r.c(fVar5);
        long jA = k1.g.a(fA2, y2.b.a(fP, k1.f.p(fVar5.x()), this.f17804i.m().floatValue()));
        long jU = j0.u(j10, j0.x(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f17798c) {
            n1.f.s1(fVar, jU, fA, jA, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return;
        }
        float fI = k1.l.i(fVar.c());
        float fG = k1.l.g(fVar.c());
        int iB = l1.i0.f14518a.b();
        n1.d dVarM0 = fVar.M0();
        long jC = dVarM0.c();
        dVarM0.d().h();
        dVarM0.a().b(0.0f, 0.0f, fI, fG, iB);
        n1.f.s1(fVar, jU, fA, jA, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
        dVarM0.d().p();
        dVarM0.b(jC);
    }

    public final void h() {
        k(true);
        this.f17805j.L(i0.f15558a);
    }
}
