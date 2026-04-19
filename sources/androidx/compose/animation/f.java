package androidx.compose.animation;

import ae.r;
import ae.s;
import b0.b0;
import b0.u;
import c0.a1;
import c0.e0;
import c0.f1;
import c0.g1;
import c0.j1;
import c0.l1;
import c0.x1;
import f1.b;
import l1.z1;
import md.i0;
import t0.k1;
import t0.k3;
import t0.p3;
import w2.p;
import w2.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j1<androidx.compose.ui.graphics.g, c0.n> f2118a = l1.a(a.f2122a, b.f2123a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a1<Float> f2119b = c0.j.g(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1<w2.n> f2120c = c0.j.g(0.0f, 400.0f, w2.n.b(x1.e(w2.n.f22418b)), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a1<p> f2121d = c0.j.g(0.0f, 400.0f, p.b(x1.f(p.f22421b)), 1, null);

    static final class a extends s implements zd.l<androidx.compose.ui.graphics.g, c0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2122a = new a();

        a() {
            super(1);
        }

        public final c0.n a(long j10) {
            return new c0.n(androidx.compose.ui.graphics.g.f(j10), androidx.compose.ui.graphics.g.g(j10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ c0.n invoke(androidx.compose.ui.graphics.g gVar) {
            return a(gVar.j());
        }
    }

    static final class b extends s implements zd.l<c0.n, androidx.compose.ui.graphics.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2123a = new b();

        b() {
            super(1);
        }

        public final long a(c0.n nVar) {
            return z1.a(nVar.f(), nVar.g());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.g invoke(c0.n nVar) {
            return androidx.compose.ui.graphics.g.b(a(nVar));
        }
    }

    static final class c extends s implements zd.l<f1.b<b0.l>, e0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f2124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f2125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f2124a = hVar;
            this.f2125b = jVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0<Float> invoke(f1.b<b0.l> bVar) {
            b0.n nVarC;
            e0<Float> e0VarB;
            e0<Float> e0VarB2;
            b0.l lVar = b0.l.PreEnter;
            b0.l lVar2 = b0.l.Visible;
            if (bVar.b(lVar, lVar2)) {
                b0.n nVarC2 = this.f2124a.b().c();
                if (nVarC2 != null && (e0VarB2 = nVarC2.b()) != null) {
                    return e0VarB2;
                }
            } else if (bVar.b(lVar2, b0.l.PostExit) && (nVarC = this.f2125b.b().c()) != null && (e0VarB = nVarC.b()) != null) {
                return e0VarB;
            }
            return f.f2119b;
        }
    }

    static final class d extends s implements zd.l<b0.l, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f2126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f2127b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2128a;

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
                f2128a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f2126a = hVar;
            this.f2127b = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[PHI: r3
  0x0032: PHI (r3v7 b0.n) = (r3v6 b0.n), (r3v11 b0.n) binds: [B:14:0x0030, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Float invoke(b0.l r3) {
            /*
                r2 = this;
                int[] r0 = androidx.compose.animation.f.d.a.f2128a
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r3 == r0) goto L36
                r0 = 2
                if (r3 == r0) goto L26
                r0 = 3
                if (r3 != r0) goto L20
                androidx.compose.animation.j r3 = r2.f2127b
                b0.b0 r3 = r3.b()
                b0.n r3 = r3.c()
                if (r3 == 0) goto L36
                goto L32
            L20:
                md.q r3 = new md.q
                r3.<init>()
                throw r3
            L26:
                androidx.compose.animation.h r3 = r2.f2126a
                b0.b0 r3 = r3.b()
                b0.n r3 = r3.c()
                if (r3 == 0) goto L36
            L32:
                float r1 = r3.a()
            L36:
                java.lang.Float r3 = java.lang.Float.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.d.invoke(b0.l):java.lang.Float");
        }
    }

    static final class e extends s implements zd.l<androidx.compose.ui.graphics.d, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p3<Float> f2129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p3<Float> f2130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p3<androidx.compose.ui.graphics.g> f2131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p3<Float> p3Var, p3<Float> p3Var2, p3<androidx.compose.ui.graphics.g> p3Var3) {
            super(1);
            this.f2129a = p3Var;
            this.f2130b = p3Var2;
            this.f2131c = p3Var3;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            p3<Float> p3Var = this.f2129a;
            dVar.b(p3Var != null ? p3Var.getValue().floatValue() : 1.0f);
            p3<Float> p3Var2 = this.f2130b;
            dVar.t(p3Var2 != null ? p3Var2.getValue().floatValue() : 1.0f);
            p3<Float> p3Var3 = this.f2130b;
            dVar.m(p3Var3 != null ? p3Var3.getValue().floatValue() : 1.0f);
            p3<androidx.compose.ui.graphics.g> p3Var4 = this.f2131c;
            dVar.b1(p3Var4 != null ? p3Var4.getValue().j() : androidx.compose.ui.graphics.g.f2806b.a());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return i0.f15558a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.f$f, reason: collision with other inner class name */
    static final class C0042f extends s implements zd.l<f1.b<b0.l>, e0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f2132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f2133b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0042f(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f2132a = hVar;
            this.f2133b = jVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0<Float> invoke(f1.b<b0.l> bVar) {
            u uVarE;
            e0<Float> e0VarA;
            e0<Float> e0VarA2;
            b0.l lVar = b0.l.PreEnter;
            b0.l lVar2 = b0.l.Visible;
            if (bVar.b(lVar, lVar2)) {
                u uVarE2 = this.f2132a.b().e();
                if (uVarE2 != null && (e0VarA2 = uVarE2.a()) != null) {
                    return e0VarA2;
                }
            } else if (bVar.b(lVar2, b0.l.PostExit) && (uVarE = this.f2133b.b().e()) != null && (e0VarA = uVarE.a()) != null) {
                return e0VarA;
            }
            return f.f2119b;
        }
    }

    static final class g extends s implements zd.l<b0.l, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f2134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f2135b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2136a;

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
                f2136a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f2134a = hVar;
            this.f2135b = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[PHI: r3
  0x0032: PHI (r3v7 b0.u) = (r3v6 b0.u), (r3v11 b0.u) binds: [B:14:0x0030, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Float invoke(b0.l r3) {
            /*
                r2 = this;
                int[] r0 = androidx.compose.animation.f.g.a.f2136a
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r3 == r0) goto L36
                r0 = 2
                if (r3 == r0) goto L26
                r0 = 3
                if (r3 != r0) goto L20
                androidx.compose.animation.j r3 = r2.f2135b
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L36
                goto L32
            L20:
                md.q r3 = new md.q
                r3.<init>()
                throw r3
            L26:
                androidx.compose.animation.h r3 = r2.f2134a
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L36
            L32:
                float r1 = r3.b()
            L36:
                java.lang.Float r3 = java.lang.Float.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.g.invoke(b0.l):java.lang.Float");
        }
    }

    static final class h extends s implements zd.l<f1.b<b0.l>, e0<androidx.compose.ui.graphics.g>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f2137a = new h();

        h() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0<androidx.compose.ui.graphics.g> invoke(f1.b<b0.l> bVar) {
            return c0.j.g(0.0f, 0.0f, null, 7, null);
        }
    }

    static final class i extends s implements zd.l<b0.l, androidx.compose.ui.graphics.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.g f2138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f2139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f2140c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2141a;

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
                f2141a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.g gVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f2138a = gVar;
            this.f2139b = hVar;
            this.f2140c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r3
  0x003e: PHI (r3v10 b0.u) = (r3v6 b0.u), (r3v9 b0.u), (r3v14 b0.u), (r3v17 b0.u) binds: [B:17:0x003c, B:20:0x0051, B:9:0x001c, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long a(b0.l r3) {
            /*
                r2 = this;
                int[] r0 = androidx.compose.animation.f.i.a.f2141a
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                r1 = 0
                if (r3 == r0) goto L54
                r0 = 2
                if (r3 == r0) goto L32
                r0 = 3
                if (r3 != r0) goto L2c
                androidx.compose.animation.j r3 = r2.f2140c
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L1f
                goto L3e
            L1f:
                androidx.compose.animation.h r3 = r2.f2139b
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L56
                goto L3e
            L2c:
                md.q r3 = new md.q
                r3.<init>()
                throw r3
            L32:
                androidx.compose.animation.h r3 = r2.f2139b
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L47
            L3e:
                long r0 = r3.c()
                androidx.compose.ui.graphics.g r1 = androidx.compose.ui.graphics.g.b(r0)
                goto L56
            L47:
                androidx.compose.animation.j r3 = r2.f2140c
                b0.b0 r3 = r3.b()
                b0.u r3 = r3.e()
                if (r3 == 0) goto L56
                goto L3e
            L54:
                androidx.compose.ui.graphics.g r1 = r2.f2138a
            L56:
                if (r1 == 0) goto L5d
                long r0 = r1.j()
                goto L63
            L5d:
                androidx.compose.ui.graphics.g$a r3 = androidx.compose.ui.graphics.g.f2806b
                long r0 = r3.a()
            L63:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.i.a(b0.l):long");
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.g invoke(b0.l lVar) {
            return androidx.compose.ui.graphics.g.b(a(lVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends s implements zd.l<p, p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f2142a = new j();

        j() {
            super(1);
        }

        public final long a(long j10) {
            return q.a(0, 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ p invoke(p pVar) {
            return p.b(a(pVar.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class k extends s implements zd.l<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f2143a = new k();

        k() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static final class l extends s implements zd.l<p, p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Integer, Integer> f2144a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(zd.l<? super Integer, Integer> lVar) {
            super(1);
            this.f2144a = lVar;
        }

        public final long a(long j10) {
            return q.a(p.g(j10), this.f2144a.invoke(Integer.valueOf(p.f(j10))).intValue());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ p invoke(p pVar) {
            return p.b(a(pVar.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class m extends s implements zd.l<p, p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f2145a = new m();

        m() {
            super(1);
        }

        public final long a(long j10) {
            return q.a(0, 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ p invoke(p pVar) {
            return p.b(a(pVar.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class n extends s implements zd.l<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f2146a = new n();

        n() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static final class o extends s implements zd.l<p, p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Integer, Integer> f2147a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(zd.l<? super Integer, Integer> lVar) {
            super(1);
            this.f2147a = lVar;
        }

        public final long a(long j10) {
            return q.a(p.g(j10), this.f2147a.invoke(Integer.valueOf(p.f(j10))).intValue());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ p invoke(p pVar) {
            return p.b(a(pVar.j()));
        }
    }

    private static final androidx.compose.animation.j A(k1<androidx.compose.animation.j> k1Var) {
        return k1Var.getValue();
    }

    private static final void B(k1<androidx.compose.animation.j> k1Var, androidx.compose.animation.j jVar) {
        k1Var.setValue(jVar);
    }

    private static final b0.q e(final f1<b0.l> f1Var, final androidx.compose.animation.h hVar, final androidx.compose.animation.j jVar, String str, t0.l lVar, int i10) {
        final f1.a aVarB;
        final f1.a aVarB2;
        lVar.e(642253525);
        if (t0.o.I()) {
            t0.o.U(642253525, i10, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z10 = (hVar.b().c() == null && jVar.b().c() == null) ? false : true;
        boolean z11 = (hVar.b().e() == null && jVar.b().e() == null) ? false : true;
        lVar.e(-1158245383);
        if (z10) {
            j1<Float, c0.m> j1VarB = l1.b(ae.l.f718a);
            lVar.e(-492369756);
            Object objF = lVar.f();
            if (objF == t0.l.f20813a.a()) {
                objF = str + " alpha";
                lVar.E(objF);
            }
            lVar.K();
            aVarB = g1.b(f1Var, j1VarB, (String) objF, lVar, (i10 & 14) | 448, 0);
        } else {
            aVarB = null;
        }
        lVar.K();
        lVar.e(-1158245186);
        if (z11) {
            j1<Float, c0.m> j1VarB2 = l1.b(ae.l.f718a);
            lVar.e(-492369756);
            Object objF2 = lVar.f();
            if (objF2 == t0.l.f20813a.a()) {
                objF2 = str + " scale";
                lVar.E(objF2);
            }
            lVar.K();
            aVarB2 = g1.b(f1Var, j1VarB2, (String) objF2, lVar, (i10 & 14) | 448, 0);
        } else {
            aVarB2 = null;
        }
        lVar.K();
        final f1.a aVarB3 = z11 ? g1.b(f1Var, f2118a, "TransformOriginInterruptionHandling", lVar, (i10 & 14) | 448, 0) : null;
        b0.q qVar = new b0.q() { // from class: b0.m
            @Override // b0.q
            public final zd.l a() {
                return androidx.compose.animation.f.f(aVarB, aVarB2, f1Var, hVar, jVar, aVarB3);
            }
        };
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.l f(f1.a aVar, f1.a aVar2, f1 f1Var, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, f1.a aVar3) {
        u uVarE;
        return new e(aVar != null ? aVar.a(new c(hVar, jVar), new d(hVar, jVar)) : null, aVar2 != null ? aVar2.a(new C0042f(hVar, jVar), new g(hVar, jVar)) : null, aVar3 != null ? aVar3.a(h.f2137a, new i((f1Var.h() != b0.l.PreEnter ? (uVarE = jVar.b().e()) == null && (uVarE = hVar.b().e()) == null : (uVarE = hVar.b().e()) == null && (uVarE = jVar.b().e()) == null) ? null : androidx.compose.ui.graphics.g.b(uVarE.c()), hVar, jVar)) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.e g(c0.f1<b0.l> r42, androidx.compose.animation.h r43, androidx.compose.animation.j r44, java.lang.String r45, t0.l r46, int r47) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.g(c0.f1, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, t0.l, int):androidx.compose.ui.e");
    }

    public static final androidx.compose.animation.h h(e0<p> e0Var, f1.b bVar, boolean z10, zd.l<? super p, p> lVar) {
        return new androidx.compose.animation.i(new b0(null, null, new b0.h(bVar, lVar, e0Var, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.h i(e0 e0Var, f1.b bVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, p.b(x1.f(p.f22421b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = f1.b.f11020a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = j.f2142a;
        }
        return h(e0Var, bVar, z10, lVar);
    }

    public static final androidx.compose.animation.h j(e0<p> e0Var, b.c cVar, boolean z10, zd.l<? super Integer, Integer> lVar) {
        return h(e0Var, v(cVar), z10, new l(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.h k(e0 e0Var, b.c cVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, p.b(x1.f(p.f22421b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = f1.b.f11020a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = k.f2143a;
        }
        return j(e0Var, cVar, z10, lVar);
    }

    public static final androidx.compose.animation.h l(e0<Float> e0Var, float f10) {
        return new androidx.compose.animation.i(new b0(new b0.n(f10, e0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.h m(e0 e0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return l(e0Var, f10);
    }

    public static final androidx.compose.animation.j n(e0<Float> e0Var, float f10) {
        return new androidx.compose.animation.k(new b0(new b0.n(f10, e0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.j o(e0 e0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(e0Var, f10);
    }

    public static final androidx.compose.animation.h p(e0<Float> e0Var, float f10, long j10) {
        return new androidx.compose.animation.i(new b0(null, null, null, new u(f10, j10, e0Var, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.h q(e0 e0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.g.f2806b.a();
        }
        return p(e0Var, f10, j10);
    }

    public static final androidx.compose.animation.j r(e0<p> e0Var, f1.b bVar, boolean z10, zd.l<? super p, p> lVar) {
        return new androidx.compose.animation.k(new b0(null, null, new b0.h(bVar, lVar, e0Var, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.j s(e0 e0Var, f1.b bVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, p.b(x1.f(p.f22421b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = f1.b.f11020a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = m.f2145a;
        }
        return r(e0Var, bVar, z10, lVar);
    }

    public static final androidx.compose.animation.j t(e0<p> e0Var, b.c cVar, boolean z10, zd.l<? super Integer, Integer> lVar) {
        return r(e0Var, v(cVar), z10, new o(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.j u(e0 e0Var, b.c cVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = c0.j.g(0.0f, 400.0f, p.b(x1.f(p.f22421b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = f1.b.f11020a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = n.f2146a;
        }
        return t(e0Var, cVar, z10, lVar);
    }

    private static final f1.b v(b.c cVar) {
        b.a aVar = f1.b.f11020a;
        return r.b(cVar, aVar.l()) ? aVar.m() : r.b(cVar, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.h w(f1<b0.l> f1Var, androidx.compose.animation.h hVar, t0.l lVar, int i10) {
        androidx.compose.animation.h hVarC;
        lVar.e(21614502);
        if (t0.o.I()) {
            t0.o.U(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(f1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = k3.e(hVar, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        if (f1Var.h() == f1Var.n() && f1Var.h() == b0.l.Visible) {
            if (f1Var.r()) {
                y(k1Var, hVar);
            } else {
                hVarC = androidx.compose.animation.h.f2176a.a();
                y(k1Var, hVarC);
            }
        } else if (f1Var.n() == b0.l.Visible) {
            hVarC = x(k1Var).c(hVar);
            y(k1Var, hVarC);
        }
        androidx.compose.animation.h hVarX = x(k1Var);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return hVarX;
    }

    private static final androidx.compose.animation.h x(k1<androidx.compose.animation.h> k1Var) {
        return k1Var.getValue();
    }

    private static final void y(k1<androidx.compose.animation.h> k1Var, androidx.compose.animation.h hVar) {
        k1Var.setValue(hVar);
    }

    public static final androidx.compose.animation.j z(f1<b0.l> f1Var, androidx.compose.animation.j jVar, t0.l lVar, int i10) {
        androidx.compose.animation.j jVarC;
        lVar.e(-1363864804);
        if (t0.o.I()) {
            t0.o.U(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(f1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = k3.e(jVar, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        if (f1Var.h() == f1Var.n() && f1Var.h() == b0.l.Visible) {
            if (f1Var.r()) {
                B(k1Var, jVar);
            } else {
                jVarC = androidx.compose.animation.j.f2179a.a();
                B(k1Var, jVarC);
            }
        } else if (f1Var.n() != b0.l.Visible) {
            jVarC = A(k1Var).c(jVar);
            B(k1Var, jVarC);
        }
        androidx.compose.animation.j jVarA = A(k1Var);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return jVarA;
    }
}
