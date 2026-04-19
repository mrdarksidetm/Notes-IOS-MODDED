package d0;

import a2.g;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import l1.v0;
import t0.e2;
import t0.o2;
import t0.u3;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    public static final class a extends ae.s implements zd.a<a2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f9304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zd.a aVar) {
            super(0);
            this.f9304a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.g, java.lang.Object] */
        @Override // zd.a
        public final a2.g invoke() {
            return this.f9304a.invoke();
        }
    }

    static final class b implements y1.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9305a = new b();

        static final class a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f9306a = new a();

            a() {
                super(1);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
            }
        }

        b() {
        }

        @Override // y1.e0
        public final y1.f0 a(y1.g0 g0Var, List<? extends y1.d0> list, long j10) {
            return y1.g0.z0(g0Var, w2.b.p(j10), w2.b.o(j10), null, a.f9306a, 4, null);
        }
    }

    static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1.c f9307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f9309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1.b f9310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y1.f f9311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f9312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l1.k0 f9313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9315i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o1.c cVar, String str, androidx.compose.ui.e eVar, f1.b bVar, y1.f fVar, float f10, l1.k0 k0Var, int i10, int i11) {
            super(2);
            this.f9307a = cVar;
            this.f9308b = str;
            this.f9309c = eVar;
            this.f9310d = bVar;
            this.f9311e = fVar;
            this.f9312f = f10;
            this.f9313g = k0Var;
            this.f9314h = i10;
            this.f9315i = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            x.a(this.f9307a, this.f9308b, this.f9309c, this.f9310d, this.f9311e, this.f9312f, this.f9313g, lVar, e2.a(this.f9314h | 1), this.f9315i);
        }
    }

    static final class d extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f9316a = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
            g2.v.t(xVar, this.f9316a);
            g2.v.y(xVar, g2.i.f11320b.d());
        }
    }

    public static final void a(o1.c cVar, String str, androidx.compose.ui.e eVar, f1.b bVar, y1.f fVar, float f10, l1.k0 k0Var, t0.l lVar, int i10, int i11) {
        t0.l lVarP = lVar.p(1142754848);
        androidx.compose.ui.e eVar2 = (i11 & 4) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        f1.b bVarE = (i11 & 8) != 0 ? f1.b.f11020a.e() : bVar;
        y1.f fVarB = (i11 & 16) != 0 ? y1.f.f23237a.b() : fVar;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        l1.k0 k0Var2 = (i11 & 64) != 0 ? null : k0Var;
        if (t0.o.I()) {
            t0.o.U(1142754848, i10, -1, "androidx.compose.foundation.Image (Image.kt:243)");
        }
        androidx.compose.ui.e eVarD = androidx.compose.ui.e.f2662a;
        if (str != null) {
            lVarP.e(-175855396);
            boolean zN = lVarP.N(str);
            Object objF = lVarP.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new d(str);
                lVarP.E(objF);
            }
            lVarP.K();
            eVarD = g2.o.d(eVarD, false, (zd.l) objF, 1, null);
        }
        androidx.compose.ui.e eVarB = androidx.compose.ui.draw.d.b(i1.g.b(eVar2.h(eVarD)), cVar, false, bVarE, fVarB, f11, k0Var2, 2, null);
        b bVar2 = b.f9305a;
        lVarP.e(544976794);
        int iA = t0.i.a(lVarP, 0);
        androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(lVarP, eVarB);
        t0.w wVarB = lVarP.B();
        g.a aVar = a2.g.J;
        zd.a<a2.g> aVarA = aVar.a();
        lVarP.e(1405779621);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(new a(aVarA));
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, bVar2, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        u3.b(lVarA, eVarC, aVar.f());
        zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
        if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new c(cVar, str, eVar2, bVarE, fVarB, f11, k0Var2, i10, i11));
        }
    }

    public static final void b(v0 v0Var, String str, androidx.compose.ui.e eVar, f1.b bVar, y1.f fVar, float f10, l1.k0 k0Var, int i10, t0.l lVar, int i11, int i12) {
        lVar.e(-1396260732);
        androidx.compose.ui.e eVar2 = (i12 & 4) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        f1.b bVarE = (i12 & 8) != 0 ? f1.b.f11020a.e() : bVar;
        y1.f fVarB = (i12 & 16) != 0 ? y1.f.f23237a.b() : fVar;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        l1.k0 k0Var2 = (i12 & 64) != 0 ? null : k0Var;
        int iB = (i12 & 128) != 0 ? n1.f.S.b() : i10;
        if (t0.o.I()) {
            t0.o.U(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(v0Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = o1.b.b(v0Var, 0L, 0L, iB, 6, null);
            lVar.E(objF);
        }
        lVar.K();
        a((o1.a) objF, str, eVar2, bVarE, fVarB, f11, k0Var2, lVar, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
    }
}
