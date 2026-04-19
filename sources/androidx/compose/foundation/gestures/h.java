package androidx.compose.foundation.gestures;

import ae.g0;
import ae.s;
import d0.j0;
import e0.p;
import e0.r;
import e0.x;
import e0.z;
import md.i0;
import md.u;
import sd.j;
import t0.k1;
import t0.k3;
import w2.w;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f2367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f2368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j0 f2369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f2371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u1.b f2372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1<Boolean> f2373g = k3.e(Boolean.FALSE, null, 2, null);

    static final class a extends s implements l<k1.f, k1.f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f2376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, x xVar) {
            super(1);
            this.f2375b = i10;
            this.f2376c = xVar;
        }

        public final long a(long j10) {
            long jD = h.this.f2372f.d(j10, this.f2375b);
            long jS = k1.f.s(j10, jD);
            h hVar = h.this;
            float fP = hVar.p(hVar.k(hVar.m(jS)));
            h hVar2 = h.this;
            long jK = hVar2.k(hVar2.q(this.f2376c.a(fP)));
            return k1.f.t(k1.f.t(jD, jK), h.this.f2372f.b(jK, k1.f.s(jS, jK), this.f2375b));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ k1.f invoke(k1.f fVar) {
            return k1.f.d(a(fVar.x()));
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {831}, m = "doFlingAnimation-QWom1Mo")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2378b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2380d;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2378b = obj;
            this.f2380d |= Integer.MIN_VALUE;
            return h.this.d(0L, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {844}, m = "invokeSuspend")
    static final class c extends j implements zd.p<x, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f2382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f2383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2385e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f2387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f2388h;

        static final class a extends s implements l<k1.f, k1.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f2389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f2390b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, x xVar) {
                super(1);
                this.f2389a = hVar;
                this.f2390b = xVar;
            }

            public final long a(long j10) {
                h hVar = this.f2389a;
                return hVar.k(hVar.c(this.f2390b, hVar.k(j10), u1.e.f21506a.b()));
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ k1.f invoke(k1.f fVar) {
                return k1.f.d(a(fVar.x()));
            }
        }

        public static final class b implements x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f2391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l<k1.f, k1.f> f2392b;

            /* JADX WARN: Multi-variable type inference failed */
            b(h hVar, l<? super k1.f, k1.f> lVar) {
                this.f2391a = hVar;
                this.f2392b = lVar;
            }

            @Override // e0.x
            public float a(float f10) {
                h hVar = this.f2391a;
                return hVar.p(this.f2392b.invoke(k1.f.d(hVar.q(f10))).x());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0 g0Var, long j10, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f2387g = g0Var;
            this.f2388h = j10;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x xVar, qd.d<? super i0> dVar) {
            return ((c) create(xVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = h.this.new c(this.f2387g, this.f2388h, dVar);
            cVar.f2385e = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            h hVar;
            g0 g0Var;
            h hVar2;
            long j10;
            Object objE = rd.d.e();
            int i10 = this.f2384d;
            if (i10 == 0) {
                u.b(obj);
                b bVar = new b(h.this, new a(h.this, (x) this.f2385e));
                hVar = h.this;
                g0 g0Var2 = this.f2387g;
                long j11 = this.f2388h;
                p pVar = hVar.f2371e;
                long j12 = g0Var2.f704a;
                float fJ = hVar.j(hVar.o(j11));
                this.f2385e = hVar;
                this.f2381a = hVar;
                this.f2382b = g0Var2;
                this.f2383c = j12;
                this.f2384d = 1;
                obj = pVar.a(bVar, fJ, this);
                if (obj == objE) {
                    return objE;
                }
                g0Var = g0Var2;
                hVar2 = hVar;
                j10 = j12;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f2383c;
                g0Var = (g0) this.f2382b;
                hVar = (h) this.f2381a;
                hVar2 = (h) this.f2385e;
                u.b(obj);
            }
            g0Var.f704a = hVar.s(j10, hVar2.j(((Number) obj).floatValue()));
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {820, 822}, m = "onDragStopped-sF-c-tU")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2394b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2396d;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2394b = obj;
            this.f2396d |= Integer.MIN_VALUE;
            return h.this.g(0L, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {804, 807, 810}, m = "invokeSuspend")
    static final class e extends j implements zd.p<w, qd.d<? super w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f2397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f2399c;

        e(qd.d<? super e> dVar) {
            super(2, dVar);
        }

        public final Object a(long j10, qd.d<? super w> dVar) {
            return ((e) create(w.b(j10), dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            e eVar = h.this.new e(dVar);
            eVar.f2399c = ((w) obj).o();
            return eVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(w wVar, qd.d<? super w> dVar) {
            return a(wVar.o(), dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r6 = rd.b.e()
                int r0 = r13.f2398b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1c
                long r0 = r13.f2397a
                long r2 = r13.f2399c
                md.u.b(r14)
                r9 = r0
                r0 = r14
                goto L89
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                long r2 = r13.f2397a
                long r4 = r13.f2399c
                md.u.b(r14)
                r0 = r14
                r7 = r4
                goto L68
            L2e:
                long r3 = r13.f2399c
                md.u.b(r14)
                r0 = r14
                goto L4c
            L35:
                md.u.b(r14)
                long r4 = r13.f2399c
                androidx.compose.foundation.gestures.h r0 = androidx.compose.foundation.gestures.h.this
                u1.b r0 = androidx.compose.foundation.gestures.h.b(r0)
                r13.f2399c = r4
                r13.f2398b = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L4b
                return r6
            L4b:
                r3 = r4
            L4c:
                w2.w r0 = (w2.w) r0
                long r7 = r0.o()
                long r7 = w2.w.k(r3, r7)
                androidx.compose.foundation.gestures.h r0 = androidx.compose.foundation.gestures.h.this
                r13.f2399c = r3
                r13.f2397a = r7
                r13.f2398b = r2
                java.lang.Object r0 = r0.d(r7, r13)
                if (r0 != r6) goto L65
                return r6
            L65:
                r11 = r3
                r2 = r7
                r7 = r11
            L68:
                w2.w r0 = (w2.w) r0
                long r9 = r0.o()
                androidx.compose.foundation.gestures.h r0 = androidx.compose.foundation.gestures.h.this
                u1.b r0 = androidx.compose.foundation.gestures.h.b(r0)
                long r2 = w2.w.k(r2, r9)
                r13.f2399c = r7
                r13.f2397a = r9
                r13.f2398b = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
                return r6
            L88:
                r2 = r7
            L89:
                w2.w r0 = (w2.w) r0
                long r0 = r0.o()
                long r0 = w2.w.k(r9, r0)
                long r0 = w2.w.k(r2, r0)
                w2.w r0 = w2.w.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(z zVar, r rVar, j0 j0Var, boolean z10, p pVar, u1.b bVar) {
        this.f2367a = zVar;
        this.f2368b = rVar;
        this.f2369c = j0Var;
        this.f2370d = z10;
        this.f2371e = pVar;
        this.f2372f = bVar;
    }

    private final boolean f() {
        return this.f2367a.a() || this.f2367a.c();
    }

    public final long c(x xVar, long j10, int i10) {
        a aVar = new a(i10, xVar);
        j0 j0Var = this.f2369c;
        return (u1.e.e(i10, u1.e.f21506a.c()) || j0Var == null || !f()) ? aVar.invoke(k1.f.d(j10)).x() : j0Var.d(j10, i10, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r13, qd.d<? super w2.w> r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.h.b
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.h$b r0 = (androidx.compose.foundation.gestures.h.b) r0
            int r1 = r0.f2380d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2380d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.h$b r0 = new androidx.compose.foundation.gestures.h$b
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f2378b
            java.lang.Object r0 = rd.b.e()
            int r1 = r4.f2380d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.f2377a
            ae.g0 r13 = (ae.g0) r13
            md.u.b(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            md.u.b(r15)
            ae.g0 r15 = new ae.g0
            r15.<init>()
            r15.f704a = r13
            e0.z r1 = r12.f2367a
            r3 = 0
            androidx.compose.foundation.gestures.h$c r11 = new androidx.compose.foundation.gestures.h$c
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f2377a = r15
            r4.f2380d = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = e0.z.f(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.f704a
            w2.w r13 = w2.w.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.d(long, qd.d):java.lang.Object");
    }

    public final z e() {
        return this.f2367a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r7, qd.d<? super md.i0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.h.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.h$d r0 = (androidx.compose.foundation.gestures.h.d) r0
            int r1 = r0.f2396d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2396d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.h$d r0 = new androidx.compose.foundation.gestures.h$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2394b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f2396d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.f2393a
            androidx.compose.foundation.gestures.h r7 = (androidx.compose.foundation.gestures.h) r7
            md.u.b(r9)
            goto L6f
        L39:
            md.u.b(r9)
            r6.i(r4)
            long r7 = r6.n(r7)
            androidx.compose.foundation.gestures.h$e r9 = new androidx.compose.foundation.gestures.h$e
            r2 = 0
            r9.<init>(r2)
            d0.j0 r2 = r6.f2369c
            if (r2 == 0) goto L60
            boolean r5 = r6.f()
            if (r5 == 0) goto L60
            r0.f2393a = r6
            r0.f2396d = r4
            java.lang.Object r7 = r2.b(r7, r9, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r7 = r6
            goto L6f
        L60:
            w2.w r7 = w2.w.b(r7)
            r0.f2393a = r6
            r0.f2396d = r3
            java.lang.Object r7 = r9.invoke(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L6f:
            r8 = 0
            r7.i(r8)
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.g(long, qd.d):java.lang.Object");
    }

    public final long h(long j10) {
        return this.f2367a.b() ? k1.f.f14338b.c() : q(j(this.f2367a.d(j(p(j10)))));
    }

    public final void i(boolean z10) {
        this.f2373g.setValue(Boolean.valueOf(z10));
    }

    public final float j(float f10) {
        return this.f2370d ? f10 * (-1) : f10;
    }

    public final long k(long j10) {
        return this.f2370d ? k1.f.u(j10, -1.0f) : j10;
    }

    public final boolean l() {
        if (!this.f2367a.b() && !this.f2373g.getValue().booleanValue()) {
            j0 j0Var = this.f2369c;
            if (!(j0Var != null ? j0Var.c() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long m(long j10) {
        return this.f2368b == r.Horizontal ? k1.f.i(j10, 0.0f, 0.0f, 1, null) : k1.f.i(j10, 0.0f, 0.0f, 2, null);
    }

    public final long n(long j10) {
        return this.f2368b == r.Horizontal ? w.e(j10, 0.0f, 0.0f, 1, null) : w.e(j10, 0.0f, 0.0f, 2, null);
    }

    public final float o(long j10) {
        return this.f2368b == r.Horizontal ? w.h(j10) : w.i(j10);
    }

    public final float p(long j10) {
        return this.f2368b == r.Horizontal ? k1.f.o(j10) : k1.f.p(j10);
    }

    public final long q(float f10) {
        return (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? k1.f.f14338b.c() : this.f2368b == r.Horizontal ? k1.g.a(f10, 0.0f) : k1.g.a(0.0f, f10);
    }

    public final void r(z zVar, r rVar, j0 j0Var, boolean z10, p pVar, u1.b bVar) {
        this.f2367a = zVar;
        this.f2368b = rVar;
        this.f2369c = j0Var;
        this.f2370d = z10;
        this.f2371e = pVar;
        this.f2372f = bVar;
    }

    public final long s(long j10, float f10) {
        return this.f2368b == r.Horizontal ? w.e(j10, f10, 0.0f, 2, null) : w.e(j10, 0.0f, f10, 1, null);
    }
}
