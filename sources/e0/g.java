package e0;

import androidx.compose.ui.e;
import java.util.concurrent.CancellationException;
import le.a2;
import le.e2;
import le.g2;
import le.n0;
import le.p0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e.c implements k0.h, a2.z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r f10321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f10322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f f10324q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y1.r f10326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y1.r f10327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private k1.h f10328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10329v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c0 f10332y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f10325r = new e();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f10330w = w2.p.f22421b.a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zd.a<k1.h> f10333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final le.o<i0> f10334b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zd.a<k1.h> aVar, le.o<? super i0> oVar) {
            this.f10333a = aVar;
            this.f10334b = oVar;
        }

        public final le.o<i0> a() {
            return this.f10334b;
        }

        public final zd.a<k1.h> b() {
            return this.f10333a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                le.o<md.i0> r0 = r4.f10334b
                qd.g r0 = r0.getContext()
                le.m0$a r1 = le.m0.f15088c
                qd.g$b r0 = r0.get(r1)
                le.m0 r0 = (le.m0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.g0()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = je.a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                ae.r.e(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                zd.a<k1.h> r0 = r4.f10333a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                le.o<md.i0> r0 = r4.f10334b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.g.a.toString():java.lang.String");
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10335a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10335a = iArr;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {190}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10337b;

        @sd.d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {195}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<x, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f10340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f10341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a2 f10342d;

            /* JADX INFO: renamed from: e0.g$c$a$a, reason: collision with other inner class name */
            static final class C0243a extends ae.s implements zd.l<Float, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f10343a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x f10344b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a2 f10345c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0243a(g gVar, x xVar, a2 a2Var) {
                    super(1);
                    this.f10343a = gVar;
                    this.f10344b = xVar;
                    this.f10345c = a2Var;
                }

                public final void a(float f10) {
                    float f11 = this.f10343a.f10323p ? 1.0f : -1.0f;
                    float fA = f11 * this.f10344b.a(f11 * f10);
                    if (Math.abs(fA) < Math.abs(f10)) {
                        g2.e(this.f10345c, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ i0 invoke(Float f10) {
                    a(f10.floatValue());
                    return i0.f15558a;
                }
            }

            static final class b extends ae.s implements zd.a<i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f10346a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g gVar) {
                    super(0);
                    this.f10346a = gVar;
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    e eVar = this.f10346a.f10325r;
                    g gVar = this.f10346a;
                    while (true) {
                        if (!eVar.f10313a.s()) {
                            break;
                        }
                        k1.h hVarInvoke = ((a) eVar.f10313a.t()).b().invoke();
                        if (!(hVarInvoke == null ? true : g.t2(gVar, hVarInvoke, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) eVar.f10313a.x(eVar.f10313a.o() - 1)).a().resumeWith(md.t.b(i0.f15558a));
                        }
                    }
                    if (this.f10346a.f10329v) {
                        k1.h hVarQ2 = this.f10346a.q2();
                        if (hVarQ2 != null && g.t2(this.f10346a, hVarQ2, 0L, 1, null)) {
                            this.f10346a.f10329v = false;
                        }
                    }
                    this.f10346a.f10332y.j(this.f10346a.l2());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, a2 a2Var, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10341c = gVar;
                this.f10342d = a2Var;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x xVar, qd.d<? super i0> dVar) {
                return ((a) create(xVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10341c, this.f10342d, dVar);
                aVar.f10340b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f10339a;
                if (i10 == 0) {
                    md.u.b(obj);
                    x xVar = (x) this.f10340b;
                    this.f10341c.f10332y.j(this.f10341c.l2());
                    c0 c0Var = this.f10341c.f10332y;
                    C0243a c0243a = new C0243a(this.f10341c, xVar, this.f10342d);
                    b bVar = new b(this.f10341c);
                    this.f10339a = 1;
                    if (c0Var.h(c0243a, bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
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
            cVar.f10337b = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10336a;
            try {
                try {
                    if (i10 == 0) {
                        md.u.b(obj);
                        a2 a2VarN = e2.n(((n0) this.f10337b).getCoroutineContext());
                        g.this.f10331x = true;
                        z zVar = g.this.f10322o;
                        a aVar = new a(g.this, a2VarN, null);
                        this.f10336a = 1;
                        if (z.f(zVar, null, aVar, this, 1, null) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    g.this.f10325r.d();
                    g.this.f10331x = false;
                    g.this.f10325r.b(null);
                    g.this.f10329v = false;
                    return i0.f15558a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                g.this.f10331x = false;
                g.this.f10325r.b(null);
                g.this.f10329v = false;
                throw th;
            }
        }
    }

    public g(r rVar, z zVar, boolean z10, f fVar) {
        this.f10321n = rVar;
        this.f10322o = zVar;
        this.f10323p = z10;
        this.f10324q = fVar;
        this.f10332y = new c0(this.f10324q.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float l2() {
        f fVar;
        float fI;
        float fC;
        float fG;
        if (w2.p.e(this.f10330w, w2.p.f22421b.a())) {
            return 0.0f;
        }
        k1.h hVarP2 = p2();
        if (hVarP2 == null) {
            hVarP2 = this.f10329v ? q2() : null;
            if (hVarP2 == null) {
                return 0.0f;
            }
        }
        long jC = w2.q.c(this.f10330w);
        int i10 = b.f10335a[this.f10321n.ordinal()];
        if (i10 == 1) {
            fVar = this.f10324q;
            fI = hVarP2.i();
            fC = hVarP2.c() - hVarP2.i();
            fG = k1.l.g(jC);
        } else {
            if (i10 != 2) {
                throw new md.q();
            }
            fVar = this.f10324q;
            fI = hVarP2.f();
            fC = hVarP2.g() - hVarP2.f();
            fG = k1.l.i(jC);
        }
        return fVar.a(fI, fC, fG);
    }

    private final int m2(long j10, long j11) {
        int iF;
        int iF2;
        int i10 = b.f10335a[this.f10321n.ordinal()];
        if (i10 == 1) {
            iF = w2.p.f(j10);
            iF2 = w2.p.f(j11);
        } else {
            if (i10 != 2) {
                throw new md.q();
            }
            iF = w2.p.g(j10);
            iF2 = w2.p.g(j11);
        }
        return ae.r.g(iF, iF2);
    }

    private final int n2(long j10, long j11) {
        float fG;
        float fG2;
        int i10 = b.f10335a[this.f10321n.ordinal()];
        if (i10 == 1) {
            fG = k1.l.g(j10);
            fG2 = k1.l.g(j11);
        } else {
            if (i10 != 2) {
                throw new md.q();
            }
            fG = k1.l.i(j10);
            fG2 = k1.l.i(j11);
        }
        return Float.compare(fG, fG2);
    }

    private final k1.h o2(k1.h hVar, long j10) {
        return hVar.q(k1.f.w(w2(hVar, j10)));
    }

    private final k1.h p2() {
        v0.d dVar = this.f10325r.f10313a;
        int iO = dVar.o();
        k1.h hVar = null;
        if (iO > 0) {
            int i10 = iO - 1;
            Object[] objArrN = dVar.n();
            do {
                k1.h hVarInvoke = ((a) objArrN[i10]).b().invoke();
                if (hVarInvoke != null) {
                    if (n2(hVarInvoke.h(), w2.q.c(this.f10330w)) > 0) {
                        return hVar == null ? hVarInvoke : hVar;
                    }
                    hVar = hVarInvoke;
                }
                i10--;
            } while (i10 >= 0);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k1.h q2() {
        y1.r rVar;
        y1.r rVar2 = this.f10326s;
        if (rVar2 != null) {
            if (!rVar2.v()) {
                rVar2 = null;
            }
            if (rVar2 != null && (rVar = this.f10327t) != null) {
                if (!rVar.v()) {
                    rVar = null;
                }
                if (rVar != null) {
                    return rVar2.A(rVar, false);
                }
            }
        }
        return null;
    }

    private final boolean s2(k1.h hVar, long j10) {
        long jW2 = w2(hVar, j10);
        return Math.abs(k1.f.o(jW2)) <= 0.5f && Math.abs(k1.f.p(jW2)) <= 0.5f;
    }

    static /* synthetic */ boolean t2(g gVar, k1.h hVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = gVar.f10330w;
        }
        return gVar.s2(hVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2() {
        if (!(!this.f10331x)) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        le.k.d(A1(), null, p0.UNDISPATCHED, new c(null), 1, null);
    }

    private final long w2(k1.h hVar, long j10) {
        long jC = w2.q.c(j10);
        int i10 = b.f10335a[this.f10321n.ordinal()];
        if (i10 == 1) {
            return k1.g.a(0.0f, this.f10324q.a(hVar.i(), hVar.c() - hVar.i(), k1.l.g(jC)));
        }
        if (i10 == 2) {
            return k1.g.a(this.f10324q.a(hVar.f(), hVar.g() - hVar.f(), k1.l.i(jC)), 0.0f);
        }
        throw new md.q();
    }

    @Override // a2.z
    public void B(y1.r rVar) {
        this.f10326s = rVar;
    }

    @Override // k0.h
    public Object T(zd.a<k1.h> aVar, qd.d<? super i0> dVar) {
        k1.h hVarInvoke = aVar.invoke();
        boolean z10 = false;
        if (hVarInvoke != null && !t2(this, hVarInvoke, 0L, 1, null)) {
            z10 = true;
        }
        if (!z10) {
            return i0.f15558a;
        }
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        if (this.f10325r.c(new a(aVar, pVar)) && !this.f10331x) {
            u2();
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : i0.f15558a;
    }

    @Override // a2.z
    public void f(long j10) {
        k1.h hVarQ2;
        long j11 = this.f10330w;
        this.f10330w = j10;
        if (m2(j10, j11) < 0 && (hVarQ2 = q2()) != null) {
            k1.h hVar = this.f10328u;
            if (hVar == null) {
                hVar = hVarQ2;
            }
            if (!this.f10331x && !this.f10329v && s2(hVar, j11) && !s2(hVarQ2, j10)) {
                this.f10329v = true;
                u2();
            }
            this.f10328u = hVarQ2;
        }
    }

    public final long r2() {
        return this.f10330w;
    }

    @Override // k0.h
    public k1.h v0(k1.h hVar) {
        if (!w2.p.e(this.f10330w, w2.p.f22421b.a())) {
            return o2(hVar, this.f10330w);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final void v2(y1.r rVar) {
        this.f10327t = rVar;
    }

    public final void x2(r rVar, z zVar, boolean z10, f fVar) {
        this.f10321n = rVar;
        this.f10322o = zVar;
        this.f10323p = z10;
        this.f10324q = fVar;
    }
}
