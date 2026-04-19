package androidx.compose.animation;

import ae.s;
import b0.b0;
import b0.q;
import b0.r;
import c0.e0;
import c0.f1;
import c0.n;
import md.i0;
import t0.p3;
import w2.n;
import w2.o;
import w2.p;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class g extends r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f1<b0.l> f2148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private f1<b0.l>.a<p, n> f2149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f1<b0.l>.a<w2.n, n> f2150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f1<b0.l>.a<w2.n, n> f2151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.compose.animation.h f2152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j f2153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f2154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2155u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private f1.b f2158x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f2156v = b0.g.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f2157w = w2.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final zd.l<f1.b<b0.l>, e0<p>> f2159y = new h();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final zd.l<f1.b<b0.l>, e0<w2.n>> f2160z = new i();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2161a;

        static {
            int[] iArr = new int[b0.l.values().length];
            try {
                iArr[b0.l.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.l.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.l.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2161a = iArr;
        }
    }

    static final class b extends s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var) {
            super(1);
            this.f2162a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.f(aVar, this.f2162a, 0, 0, 0.0f, 4, null);
        }
    }

    static final class c extends s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f2165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<androidx.compose.ui.graphics.d, i0> f2166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(t0 t0Var, long j10, long j11, zd.l<? super androidx.compose.ui.graphics.d, i0> lVar) {
            super(1);
            this.f2163a = t0Var;
            this.f2164b = j10;
            this.f2165c = j11;
            this.f2166d = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            aVar.q(this.f2163a, w2.n.j(this.f2165c) + w2.n.j(this.f2164b), w2.n.k(this.f2165c) + w2.n.k(this.f2164b), 0.0f, this.f2166d);
        }
    }

    static final class d extends s implements zd.l<b0.l, p> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10) {
            super(1);
            this.f2168b = j10;
        }

        public final long a(b0.l lVar) {
            return g.this.l2(lVar, this.f2168b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ p invoke(b0.l lVar) {
            return p.b(a(lVar));
        }
    }

    static final class e extends s implements zd.l<f1.b<b0.l>, e0<w2.n>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2169a = new e();

        e() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0<w2.n> invoke(f1.b<b0.l> bVar) {
            return androidx.compose.animation.f.f2120c;
        }
    }

    static final class f extends s implements zd.l<b0.l, w2.n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10) {
            super(1);
            this.f2171b = j10;
        }

        public final long a(b0.l lVar) {
            return g.this.n2(lVar, this.f2171b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.n invoke(b0.l lVar) {
            return w2.n.b(a(lVar));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    static final class C0043g extends s implements zd.l<b0.l, w2.n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0043g(long j10) {
            super(1);
            this.f2173b = j10;
        }

        public final long a(b0.l lVar) {
            return g.this.m2(lVar, this.f2173b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ w2.n invoke(b0.l lVar) {
            return w2.n.b(a(lVar));
        }
    }

    static final class h extends s implements zd.l<f1.b<b0.l>, e0<p>> {
        h() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r4
  0x001b: PHI (r4v6 b0.h) = (r4v5 b0.h), (r4v10 b0.h) binds: [B:10:0x0036, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c0.e0<w2.p> invoke(c0.f1.b<b0.l> r4) {
            /*
                r3 = this;
                b0.l r0 = b0.l.PreEnter
                b0.l r1 = b0.l.Visible
                boolean r0 = r4.b(r0, r1)
                r2 = 0
                if (r0 == 0) goto L20
                androidx.compose.animation.g r4 = androidx.compose.animation.g.this
                androidx.compose.animation.h r4 = r4.b2()
                b0.b0 r4 = r4.b()
                b0.h r4 = r4.a()
                if (r4 == 0) goto L3d
            L1b:
                c0.e0 r2 = r4.b()
                goto L3d
            L20:
                b0.l r0 = b0.l.PostExit
                boolean r4 = r4.b(r1, r0)
                if (r4 == 0) goto L39
                androidx.compose.animation.g r4 = androidx.compose.animation.g.this
                androidx.compose.animation.j r4 = r4.c2()
                b0.b0 r4 = r4.b()
                b0.h r4 = r4.a()
                if (r4 == 0) goto L3d
                goto L1b
            L39:
                c0.a1 r2 = androidx.compose.animation.f.d()
            L3d:
                if (r2 != 0) goto L43
                c0.a1 r2 = androidx.compose.animation.f.d()
            L43:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.h.invoke(c0.f1$b):c0.e0");
        }
    }

    static final class i extends s implements zd.l<f1.b<b0.l>, e0<w2.n>> {
        i() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0<w2.n> invoke(f1.b<b0.l> bVar) {
            b0 b0VarB;
            b0.l lVar = b0.l.PreEnter;
            b0.l lVar2 = b0.l.Visible;
            if (!bVar.b(lVar, lVar2)) {
                if (bVar.b(lVar2, b0.l.PostExit)) {
                    b0VarB = g.this.c2().b();
                }
                return androidx.compose.animation.f.f2120c;
            }
            b0VarB = g.this.b2().b();
            b0VarB.f();
            return androidx.compose.animation.f.f2120c;
        }
    }

    public g(f1<b0.l> f1Var, f1<b0.l>.a<p, n> aVar, f1<b0.l>.a<w2.n, n> aVar2, f1<b0.l>.a<w2.n, n> aVar3, androidx.compose.animation.h hVar, j jVar, q qVar) {
        this.f2148n = f1Var;
        this.f2149o = aVar;
        this.f2150p = aVar2;
        this.f2151q = aVar3;
        this.f2152r = hVar;
        this.f2153s = jVar;
        this.f2154t = qVar;
    }

    private final void g2(long j10) {
        this.f2155u = true;
        this.f2157w = j10;
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        super.K1();
        this.f2155u = false;
        this.f2156v = b0.g.a();
    }

    public final f1.b a2() {
        b0.h hVarA;
        f1.b bVarA;
        if (this.f2148n.l().b(b0.l.PreEnter, b0.l.Visible)) {
            b0.h hVarA2 = this.f2152r.b().a();
            if (hVarA2 == null || (bVarA = hVarA2.a()) == null) {
                hVarA = this.f2153s.b().a();
                if (hVarA == null) {
                    return null;
                }
                return hVarA.a();
            }
            return bVarA;
        }
        b0.h hVarA3 = this.f2153s.b().a();
        if (hVarA3 == null || (bVarA = hVarA3.a()) == null) {
            hVarA = this.f2152r.b().a();
            if (hVarA == null) {
                return null;
            }
            return hVarA.a();
        }
        return bVarA;
    }

    public final androidx.compose.animation.h b2() {
        return this.f2152r;
    }

    public final j c2() {
        return this.f2153s;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        p3<w2.n> p3VarA;
        p3<w2.n> p3VarA2;
        if (this.f2148n.h() == this.f2148n.n()) {
            this.f2158x = null;
        } else if (this.f2158x == null) {
            f1.b bVarA2 = a2();
            if (bVarA2 == null) {
                bVarA2 = f1.b.f11020a.o();
            }
            this.f2158x = bVarA2;
        }
        if (g0Var.C0()) {
            t0 t0VarI = d0Var.I(j10);
            long jA = w2.q.a(t0VarI.q0(), t0VarI.d0());
            this.f2156v = jA;
            g2(j10);
            return g0.z0(g0Var, p.g(jA), p.f(jA), null, new b(t0VarI), 4, null);
        }
        zd.l<androidx.compose.ui.graphics.d, i0> lVarA = this.f2154t.a();
        t0 t0VarI2 = d0Var.I(j10);
        long jA2 = w2.q.a(t0VarI2.q0(), t0VarI2.d0());
        long j11 = b0.g.b(this.f2156v) ? this.f2156v : jA2;
        f1<b0.l>.a<p, n> aVar = this.f2149o;
        p3<p> p3VarA3 = aVar != null ? aVar.a(this.f2159y, new d(j11)) : null;
        if (p3VarA3 != null) {
            jA2 = p3VarA3.getValue().j();
        }
        long jD = w2.c.d(j10, jA2);
        f1<b0.l>.a<w2.n, n> aVar2 = this.f2150p;
        long jA3 = (aVar2 == null || (p3VarA2 = aVar2.a(e.f2169a, new f(j11))) == null) ? w2.n.f22418b.a() : p3VarA2.getValue().n();
        f1<b0.l>.a<w2.n, n> aVar3 = this.f2151q;
        long jA4 = (aVar3 == null || (p3VarA = aVar3.a(this.f2160z, new C0043g(j11))) == null) ? w2.n.f22418b.a() : p3VarA.getValue().n();
        f1.b bVar = this.f2158x;
        long jA5 = bVar != null ? bVar.a(j11, jD, w2.r.Ltr) : w2.n.f22418b.a();
        return g0.z0(g0Var, p.g(jD), p.f(jD), null, new c(t0VarI2, o.a(w2.n.j(jA5) + w2.n.j(jA4), w2.n.k(jA5) + w2.n.k(jA4)), jA3, lVarA), 4, null);
    }

    public final void d2(androidx.compose.animation.h hVar) {
        this.f2152r = hVar;
    }

    public final void e2(j jVar) {
        this.f2153s = jVar;
    }

    public final void f2(q qVar) {
        this.f2154t = qVar;
    }

    public final void h2(f1<b0.l>.a<w2.n, n> aVar) {
        this.f2150p = aVar;
    }

    public final void i2(f1<b0.l>.a<p, n> aVar) {
        this.f2149o = aVar;
    }

    public final void j2(f1<b0.l>.a<w2.n, n> aVar) {
        this.f2151q = aVar;
    }

    public final void k2(f1<b0.l> f1Var) {
        this.f2148n = f1Var;
    }

    public final long l2(b0.l lVar, long j10) {
        zd.l<p, p> lVarD;
        int i10 = a.f2161a[lVar.ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            b0.h hVarA = this.f2152r.b().a();
            if (hVarA == null || (lVarD = hVarA.d()) == null) {
                return j10;
            }
        } else {
            if (i10 != 3) {
                throw new md.q();
            }
            b0.h hVarA2 = this.f2153s.b().a();
            if (hVarA2 == null || (lVarD = hVarA2.d()) == null) {
                return j10;
            }
        }
        return lVarD.invoke(p.b(j10)).j();
    }

    public final long m2(b0.l lVar, long j10) {
        this.f2152r.b().f();
        n.a aVar = w2.n.f22418b;
        long jA = aVar.a();
        this.f2153s.b().f();
        long jA2 = aVar.a();
        int i10 = a.f2161a[lVar.ordinal()];
        if (i10 == 1) {
            return aVar.a();
        }
        if (i10 == 2) {
            return jA;
        }
        if (i10 == 3) {
            return jA2;
        }
        throw new md.q();
    }

    public final long n2(b0.l lVar, long j10) {
        int i10;
        if (this.f2158x != null && a2() != null && !ae.r.b(this.f2158x, a2()) && (i10 = a.f2161a[lVar.ordinal()]) != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new md.q();
            }
            b0.h hVarA = this.f2153s.b().a();
            if (hVarA != null) {
                long j11 = hVarA.d().invoke(p.b(j10)).j();
                f1.b bVarA2 = a2();
                ae.r.c(bVarA2);
                w2.r rVar = w2.r.Ltr;
                long jA = bVarA2.a(j10, j11, rVar);
                f1.b bVar = this.f2158x;
                ae.r.c(bVar);
                long jA2 = bVar.a(j10, j11, rVar);
                return o.a(w2.n.j(jA) - w2.n.j(jA2), w2.n.k(jA) - w2.n.k(jA2));
            }
        }
        return w2.n.f22418b.a();
    }
}
