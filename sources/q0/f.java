package q0;

import c0.l1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.f3;
import t0.l;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18575e;

    @sd.d(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {899}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0.k f18577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d1.v<g0.j> f18578c;

        /* JADX INFO: renamed from: q0.f$a$a, reason: collision with other inner class name */
        static final class C0394a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d1.v<g0.j> f18579a;

            C0394a(d1.v<g0.j> vVar) {
                this.f18579a = vVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
            @Override // oe.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(g0.j r1, qd.d<? super md.i0> r2) {
                /*
                    r0 = this;
                    boolean r2 = r1 instanceof g0.g
                    if (r2 == 0) goto La
                L4:
                    d1.v<g0.j> r2 = r0.f18579a
                    r2.add(r1)
                    goto L4b
                La:
                    boolean r2 = r1 instanceof g0.h
                    if (r2 == 0) goto L1a
                    d1.v<g0.j> r2 = r0.f18579a
                    g0.h r1 = (g0.h) r1
                    g0.g r1 = r1.a()
                L16:
                    r2.remove(r1)
                    goto L4b
                L1a:
                    boolean r2 = r1 instanceof g0.d
                    if (r2 == 0) goto L1f
                    goto L4
                L1f:
                    boolean r2 = r1 instanceof g0.e
                    if (r2 == 0) goto L2c
                    d1.v<g0.j> r2 = r0.f18579a
                    g0.e r1 = (g0.e) r1
                    g0.d r1 = r1.a()
                    goto L16
                L2c:
                    boolean r2 = r1 instanceof g0.p
                    if (r2 == 0) goto L31
                    goto L4
                L31:
                    boolean r2 = r1 instanceof g0.q
                    if (r2 == 0) goto L3e
                    d1.v<g0.j> r2 = r0.f18579a
                    g0.q r1 = (g0.q) r1
                    g0.p r1 = r1.a()
                    goto L16
                L3e:
                    boolean r2 = r1 instanceof g0.o
                    if (r2 == 0) goto L4b
                    d1.v<g0.j> r2 = r0.f18579a
                    g0.o r1 = (g0.o) r1
                    g0.p r1 = r1.a()
                    goto L16
                L4b:
                    md.i0 r1 = md.i0.f15558a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: q0.f.a.C0394a.b(g0.j, qd.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0.k kVar, d1.v<g0.j> vVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f18577b = kVar;
            this.f18578c = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f18577b, this.f18578c, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f18576a;
            if (i10 == 0) {
                md.u.b(obj);
                oe.e<g0.j> eVarB = this.f18577b.b();
                C0394a c0394a = new C0394a(this.f18578c);
                this.f18576a = 1;
                if (eVarB.a(c0394a, this) == objE) {
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

    @sd.d(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {952, 960}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.a<w2.h, c0.m> f18581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f18584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0.j f18585f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0.a<w2.h, c0.m> aVar, float f10, boolean z10, f fVar, g0.j jVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f18581b = aVar;
            this.f18582c = f10;
            this.f18583d = z10;
            this.f18584e = fVar;
            this.f18585f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f18581b, this.f18582c, this.f18583d, this.f18584e, this.f18585f, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f18580a;
            if (i10 == 0) {
                md.u.b(obj);
                if (!w2.h.o(this.f18581b.k().r(), this.f18582c)) {
                    if (this.f18583d) {
                        float fR = this.f18581b.k().r();
                        g0.j dVar = null;
                        if (w2.h.o(fR, this.f18584e.f18572b)) {
                            dVar = new g0.p(k1.f.f14338b.c(), null);
                        } else if (w2.h.o(fR, this.f18584e.f18574d)) {
                            dVar = new g0.g();
                        } else if (w2.h.o(fR, this.f18584e.f18573c)) {
                            dVar = new g0.d();
                        }
                        c0.a<w2.h, c0.m> aVar = this.f18581b;
                        float f10 = this.f18582c;
                        g0.j jVar = this.f18585f;
                        this.f18580a = 2;
                        if (p.d(aVar, f10, dVar, jVar, this) == objE) {
                            return objE;
                        }
                    } else {
                        c0.a<w2.h, c0.m> aVar2 = this.f18581b;
                        w2.h hVarI = w2.h.i(this.f18582c);
                        this.f18580a = 1;
                        if (aVar2.t(hVarI, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    private f(float f10, float f11, float f12, float f13, float f14) {
        this.f18571a = f10;
        this.f18572b = f11;
        this.f18573c = f12;
        this.f18574d = f13;
        this.f18575e = f14;
    }

    public /* synthetic */ f(float f10, float f11, float f12, float f13, float f14, ae.j jVar) {
        this(f10, f11, f12, f13, f14);
    }

    private final p3<w2.h> d(boolean z10, g0.k kVar, t0.l lVar, int i10) {
        lVar.e(-1312510462);
        if (t0.o.I()) {
            t0.o.U(-1312510462, i10, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:895)");
        }
        lVar.e(-719928578);
        Object objF = lVar.f();
        l.a aVar = t0.l.f20813a;
        if (objF == aVar.a()) {
            objF = f3.f();
            lVar.E(objF);
        }
        d1.v vVar = (d1.v) objF;
        lVar.K();
        lVar.e(-719928489);
        boolean z11 = true;
        boolean z12 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && lVar.N(kVar)) || (i10 & 48) == 32;
        Object objF2 = lVar.f();
        if (z12 || objF2 == aVar.a()) {
            objF2 = new a(kVar, vVar, null);
            lVar.E(objF2);
        }
        lVar.K();
        t0.l0.d(kVar, (zd.p) objF2, lVar, (i10 >> 3) & 14);
        g0.j jVar = (g0.j) nd.c0.k0(vVar);
        float f10 = !z10 ? this.f18575e : jVar instanceof g0.p ? this.f18572b : jVar instanceof g0.g ? this.f18574d : jVar instanceof g0.d ? this.f18573c : this.f18571a;
        lVar.e(-719926909);
        Object objF3 = lVar.f();
        if (objF3 == aVar.a()) {
            objF3 = new c0.a(w2.h.i(f10), l1.g(w2.h.f22405b), null, null, 12, null);
            lVar.E(objF3);
        }
        c0.a aVar2 = (c0.a) objF3;
        lVar.K();
        w2.h hVarI = w2.h.i(f10);
        lVar.e(-719926825);
        boolean zK = lVar.k(aVar2) | lVar.g(f10) | ((((i10 & 14) ^ 6) > 4 && lVar.c(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !lVar.N(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zK2 = zK | z11 | lVar.k(jVar);
        Object objF4 = lVar.f();
        if (zK2 || objF4 == aVar.a()) {
            Object bVar = new b(aVar2, f10, z10, this, jVar, null);
            lVar.E(bVar);
            objF4 = bVar;
        }
        lVar.K();
        t0.l0.d(hVarI, (zd.p) objF4, lVar, 0);
        p3<w2.h> p3VarG = aVar2.g();
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return p3VarG;
    }

    public final p3<w2.h> e(boolean z10, g0.k kVar, t0.l lVar, int i10) {
        lVar.e(-2045116089);
        if (t0.o.I()) {
            t0.o.U(-2045116089, i10, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:887)");
        }
        p3<w2.h> p3VarD = d(z10, kVar, lVar, (i10 & 896) | (i10 & 14) | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return p3VarD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return w2.h.o(this.f18571a, fVar.f18571a) && w2.h.o(this.f18572b, fVar.f18572b) && w2.h.o(this.f18573c, fVar.f18573c) && w2.h.o(this.f18574d, fVar.f18574d) && w2.h.o(this.f18575e, fVar.f18575e);
    }

    public final float f(boolean z10) {
        return z10 ? this.f18571a : this.f18575e;
    }

    public int hashCode() {
        return (((((((w2.h.p(this.f18571a) * 31) + w2.h.p(this.f18572b)) * 31) + w2.h.p(this.f18573c)) * 31) + w2.h.p(this.f18574d)) * 31) + w2.h.p(this.f18575e);
    }
}
