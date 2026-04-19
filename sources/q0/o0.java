package q0;

import a2.g;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import l1.m1;
import l1.t1;
import t0.a2;
import t0.b2;
import t0.q2;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<w2.h> f18798a = t0.v.d(null, a.f18799a, 1, null);

    static final class a extends ae.s implements zd.a<w2.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18799a = new a();

        a() {
            super(0);
        }

        public final float a() {
            return w2.h.m(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ w2.h invoke() {
            return w2.h.i(a());
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f18801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f18802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f18803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0.i f18804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f18805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18806g;

        static final class a extends ae.s implements zd.l<g2.x, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f18807a = new a();

            a() {
                super(1);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
                invoke2(xVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(g2.x xVar) {
                g2.v.s(xVar, true);
            }
        }

        /* JADX INFO: renamed from: q0.o0$b$b, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
        static final class C0397b extends sd.j implements zd.p<v1.k0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18808a;

            C0397b(qd.d<? super C0397b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new C0397b(dVar);
            }

            @Override // zd.p
            public final Object invoke(v1.k0 k0Var, qd.d<? super md.i0> dVar) {
                return ((C0397b) create(k0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f18808a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, t1 t1Var, long j10, float f10, d0.i iVar, float f11, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            super(2);
            this.f18800a = eVar;
            this.f18801b = t1Var;
            this.f18802c = j10;
            this.f18803d = f10;
            this.f18804e = iVar;
            this.f18805f = f11;
            this.f18806g = pVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 3) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-70914509, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:115)");
            }
            androidx.compose.ui.e eVarD = v1.p0.d(g2.o.c(o0.e(this.f18800a, this.f18801b, o0.f(this.f18802c, this.f18803d, lVar, 0), this.f18804e, ((w2.d) lVar.P(b2.k0.c())).G0(this.f18805f)), false, a.f18807a), md.i0.f15558a, new C0397b(null));
            zd.p<t0.l, Integer, md.i0> pVar = this.f18806g;
            lVar.e(733328855);
            y1.e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), true, lVar, 48);
            lVar.e(-1323940314);
            int iA = t0.i.a(lVar, 0);
            t0.w wVarB = lVar.B();
            g.a aVar = a2.g.J;
            zd.a<a2.g> aVarA = aVar.a();
            zd.q<q2<a2.g>, t0.l, Integer, md.i0> qVarA = y1.u.a(eVarD);
            if (!(lVar.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVar.r();
            if (lVar.l()) {
                lVar.O(aVarA);
            } else {
                lVar.D();
            }
            t0.l lVarA = u3.a(lVar);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            pVar.invoke(lVar, 0);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f18810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f18811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f18812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0.i f18813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0.m f18814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f18815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ zd.a<md.i0> f18816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f18817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18818j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, t1 t1Var, long j10, float f10, d0.i iVar, g0.m mVar, boolean z10, zd.a<md.i0> aVar, float f11, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
            super(2);
            this.f18809a = eVar;
            this.f18810b = t1Var;
            this.f18811c = j10;
            this.f18812d = f10;
            this.f18813e = iVar;
            this.f18814f = mVar;
            this.f18815g = z10;
            this.f18816h = aVar;
            this.f18817i = f11;
            this.f18818j = pVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 3) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(1279702876, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:221)");
            }
            androidx.compose.ui.e eVarC = androidx.compose.foundation.e.c(o0.e(w.c(this.f18809a), this.f18810b, o0.f(this.f18811c, this.f18812d, lVar, 0), this.f18813e, ((w2.d) lVar.P(b2.k0.c())).G0(this.f18817i)), this.f18814f, p0.n.e(false, 0.0f, 0L, lVar, 0, 7), this.f18815g, null, null, this.f18816h, 24, null);
            zd.p<t0.l, Integer, md.i0> pVar = this.f18818j;
            lVar.e(733328855);
            y1.e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), true, lVar, 48);
            lVar.e(-1323940314);
            int iA = t0.i.a(lVar, 0);
            t0.w wVarB = lVar.B();
            g.a aVar = a2.g.J;
            zd.a<a2.g> aVarA = aVar.a();
            zd.q<q2<a2.g>, t0.l, Integer, md.i0> qVarA = y1.u.a(eVarC);
            if (!(lVar.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVar.r();
            if (lVar.l()) {
                lVar.O(aVarA);
            } else {
                lVar.D();
            }
            t0.l lVarA = u3.a(lVar);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            pVar.invoke(lVar, 0);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    public static final void a(androidx.compose.ui.e eVar, t1 t1Var, long j10, long j11, float f10, float f11, d0.i iVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10, int i11) {
        lVar.e(-513881741);
        androidx.compose.ui.e eVar2 = (i11 & 1) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        t1 t1VarA = (i11 & 2) != 0 ? m1.a() : t1Var;
        long jB = (i11 & 4) != 0 ? y.f18928a.a(lVar, 6).B() : j10;
        long jC = (i11 & 8) != 0 ? i.c(jB, lVar, (i10 >> 6) & 14) : j11;
        float fM = (i11 & 16) != 0 ? w2.h.m(0) : f10;
        float fM2 = (i11 & 32) != 0 ? w2.h.m(0) : f11;
        d0.i iVar2 = (i11 & 64) != 0 ? null : iVar;
        if (t0.o.I()) {
            t0.o.U(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        a2<w2.h> a2Var = f18798a;
        float fM3 = w2.h.m(((w2.h) lVar.P(a2Var)).r() + fM);
        t0.v.b(new b2[]{k.a().c(l1.j0.m(jC)), a2Var.c(w2.h.i(fM3))}, b1.c.b(lVar, -70914509, true, new b(eVar2, t1VarA, jB, fM3, iVar2, fM2, pVar)), lVar, 48);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
    }

    public static final void b(zd.a<md.i0> aVar, androidx.compose.ui.e eVar, boolean z10, t1 t1Var, long j10, long j11, float f10, float f11, d0.i iVar, g0.m mVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10, int i11, int i12) {
        g0.m mVar2;
        lVar.e(-789752804);
        androidx.compose.ui.e eVar2 = (i12 & 2) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        t1 t1VarA = (i12 & 8) != 0 ? m1.a() : t1Var;
        long jB = (i12 & 16) != 0 ? y.f18928a.a(lVar, 6).B() : j10;
        long jC = (i12 & 32) != 0 ? i.c(jB, lVar, (i10 >> 12) & 14) : j11;
        float fM = (i12 & 64) != 0 ? w2.h.m(0) : f10;
        float fM2 = (i12 & 128) != 0 ? w2.h.m(0) : f11;
        d0.i iVar2 = (i12 & 256) != 0 ? null : iVar;
        if ((i12 & 512) != 0) {
            lVar.e(-746940902);
            Object objF = lVar.f();
            if (objF == t0.l.f20813a.a()) {
                objF = g0.l.a();
                lVar.E(objF);
            }
            mVar2 = (g0.m) objF;
            lVar.K();
        } else {
            mVar2 = mVar;
        }
        if (t0.o.I()) {
            t0.o.U(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        a2<w2.h> a2Var = f18798a;
        float fM3 = w2.h.m(((w2.h) lVar.P(a2Var)).r() + fM);
        t0.v.b(new b2[]{k.a().c(l1.j0.m(jC)), a2Var.c(w2.h.i(fM3))}, b1.c.b(lVar, 1279702876, true, new c(eVar2, t1VarA, jB, fM3, iVar2, mVar2, z11, aVar, fM2, pVar)), lVar, 48);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, t1 t1Var, long j10, d0.i iVar, float f10) {
        t1 t1Var2;
        androidx.compose.ui.e eVarE;
        androidx.compose.ui.e eVarC = androidx.compose.ui.graphics.c.c(eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, t1Var, false, null, 0L, 0L, 0, 124895, null);
        if (iVar != null) {
            t1Var2 = t1Var;
            eVarE = d0.g.e(androidx.compose.ui.e.f2662a, iVar, t1Var2);
        } else {
            t1Var2 = t1Var;
            eVarE = androidx.compose.ui.e.f2662a;
        }
        return i1.g.a(androidx.compose.foundation.c.c(eVarC.h(eVarE), j10, t1Var2), t1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, float f10, t0.l lVar, int i10) {
        lVar.e(-2079918090);
        if (t0.o.I()) {
            t0.o.U(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        int i11 = i10 << 3;
        long jA = i.a(y.f18928a.a(lVar, 6), j10, f10, lVar, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 896));
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return jA;
    }
}
