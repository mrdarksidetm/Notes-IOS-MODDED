package androidx.compose.foundation.gestures;

import a2.a1;
import a2.i;
import a2.l;
import a2.z0;
import ae.s;
import android.view.KeyEvent;
import b0.y;
import b2.k0;
import d0.c0;
import d0.j0;
import d0.v;
import e0.p;
import e0.r;
import e0.x;
import e0.z;
import g0.m;
import j1.j;
import j1.q;
import le.k;
import le.n0;
import md.i0;
import md.u;
import t1.a;

/* JADX INFO: loaded from: classes.dex */
final class g extends l implements z0, a2.h, j, t1.e {
    private final e0.g A;
    private final androidx.compose.foundation.gestures.a B;
    private final d C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z f2347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r f2348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j0 f2349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p f2352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private m f2353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final u1.b f2354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final e0.h f2355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final h f2356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final f f2357z;

    static final class a extends s implements zd.l<y1.r, i0> {
        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(y1.r rVar) {
            invoke2(rVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(y1.r rVar) {
            g.this.f2().v2(rVar);
        }
    }

    static final class b extends s implements zd.a<i0> {
        b() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            i.a(g.this, k0.c());
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {442}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f2362c;

        @sd.d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<x, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f2363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f2364b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f2365c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f2366d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, long j10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f2365c = hVar;
                this.f2366d = j10;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x xVar, qd.d<? super i0> dVar) {
                return ((a) create(xVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f2365c, this.f2366d, dVar);
                aVar.f2364b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f2363a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                this.f2365c.c((x) this.f2364b, this.f2366d, u1.e.f21506a.c());
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h hVar, long j10, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f2361b = hVar;
            this.f2362c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new c(this.f2361b, this.f2362c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2360a;
            if (i10 == 0) {
                u.b(obj);
                z zVarE = this.f2361b.e();
                c0 c0Var = c0.UserInput;
                a aVar = new a(this.f2361b, this.f2362c, null);
                this.f2360a = 1;
                if (zVarE.e(c0Var, aVar, this) == objE) {
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

    public g(z zVar, r rVar, j0 j0Var, boolean z10, boolean z11, p pVar, m mVar, e0.f fVar) {
        this.f2347p = zVar;
        this.f2348q = rVar;
        this.f2349r = j0Var;
        this.f2350s = z10;
        this.f2351t = z11;
        this.f2352u = pVar;
        this.f2353v = mVar;
        u1.b bVar = new u1.b();
        this.f2354w = bVar;
        e0.h hVar = new e0.h(y.c(e.f2333g), null, 2, 0 == true ? 1 : 0);
        this.f2355x = hVar;
        z zVar2 = this.f2347p;
        r rVar2 = this.f2348q;
        j0 j0Var2 = this.f2349r;
        boolean z12 = this.f2351t;
        p pVar2 = this.f2352u;
        h hVar2 = new h(zVar2, rVar2, j0Var2, z12, pVar2 == null ? hVar : pVar2, bVar);
        this.f2356y = hVar2;
        f fVar2 = new f(hVar2, this.f2350s);
        this.f2357z = fVar2;
        e0.g gVar = (e0.g) a2(new e0.g(this.f2348q, this.f2347p, this.f2351t, fVar));
        this.A = gVar;
        this.B = (androidx.compose.foundation.gestures.a) a2(new androidx.compose.foundation.gestures.a(this.f2350s));
        a2(u1.d.b(fVar2, bVar));
        a2(q.a());
        a2(new k0.j(gVar));
        a2(new v(new a()));
        this.C = (d) a2(new d(hVar2, this.f2348q, this.f2350s, bVar, this.f2353v));
    }

    private final void h2() {
        this.f2355x.d(y.c((w2.d) i.a(this, k0.c())));
    }

    @Override // t1.e
    public boolean E(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        h2();
        a1.a(this, new b());
    }

    @Override // a2.z0
    public void R0() {
        h2();
    }

    @Override // j1.j
    public void S(androidx.compose.ui.focus.d dVar) {
        dVar.n(false);
    }

    @Override // t1.e
    public boolean V(KeyEvent keyEvent) {
        long jA;
        if (this.f2350s) {
            long jA2 = t1.d.a(keyEvent);
            a.C0429a c0429a = t1.a.f21055b;
            if ((t1.a.p(jA2, c0429a.j()) || t1.a.p(t1.d.a(keyEvent), c0429a.k())) && t1.c.e(t1.d.b(keyEvent), t1.c.f21207a.a()) && !t1.d.c(keyEvent)) {
                h hVar = this.f2356y;
                if (this.f2348q == r.Vertical) {
                    int iF = w2.p.f(this.A.r2());
                    jA = k1.g.a(0.0f, t1.a.p(t1.d.a(keyEvent), c0429a.k()) ? iF : -iF);
                } else {
                    int iG = w2.p.g(this.A.r2());
                    jA = k1.g.a(t1.a.p(t1.d.a(keyEvent), c0429a.k()) ? iG : -iG, 0.0f);
                }
                k.d(A1(), null, null, new c(hVar, jA, null), 3, null);
                return true;
            }
        }
        return false;
    }

    public final e0.g f2() {
        return this.A;
    }

    public final void g2(z zVar, r rVar, j0 j0Var, boolean z10, boolean z11, p pVar, m mVar, e0.f fVar) {
        if (this.f2350s != z10) {
            this.f2357z.a(z10);
            this.B.a2(z10);
        }
        this.f2356y.r(zVar, rVar, j0Var, z11, pVar == null ? this.f2355x : pVar, this.f2354w);
        this.C.h2(rVar, z10, mVar);
        this.A.x2(rVar, zVar, z11, fVar);
        this.f2347p = zVar;
        this.f2348q = rVar;
        this.f2349r = j0Var;
        this.f2350s = z10;
        this.f2351t = z11;
        this.f2352u = pVar;
        this.f2353v = mVar;
    }
}
