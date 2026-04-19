package y1;

import a2.g;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.e2;
import t0.o2;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f23202a = new a();

    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    public static final class b extends ae.s implements zd.a<a2.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f23203a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zd.a aVar) {
            super(0);
            this.f23203a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.f0, java.lang.Object] */
        @Override // zd.a
        public final a2.f0 invoke() {
            return this.f23203a.invoke();
        }
    }

    static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<d1, w2.b, f0> f23205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, zd.p<? super d1, ? super w2.b, ? extends f0> pVar, int i10, int i11) {
            super(2);
            this.f23204a = eVar;
            this.f23205b = pVar;
            this.f23206c = i10;
            this.f23207d = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            b1.a(this.f23204a, this.f23205b, lVar, e2.a(this.f23206c | 1), this.f23207d);
        }
    }

    static final class d extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f23208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c1 c1Var) {
            super(0);
            this.f23208a = c1Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f23208a.d();
        }
    }

    static final class e extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f23209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<d1, w2.b, f0> f23211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23213e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(c1 c1Var, androidx.compose.ui.e eVar, zd.p<? super d1, ? super w2.b, ? extends f0> pVar, int i10, int i11) {
            super(2);
            this.f23209a = c1Var;
            this.f23210b = eVar;
            this.f23211c = pVar;
            this.f23212d = i10;
            this.f23213e = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            b1.b(this.f23209a, this.f23210b, this.f23211c, lVar, e2.a(this.f23212d | 1), this.f23213e);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, zd.p<? super d1, ? super w2.b, ? extends f0> pVar, t0.l lVar, int i10, int i11) {
        int i12;
        t0.l lVarP = lVar.p(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f2662a;
            }
            if (t0.o.I()) {
                t0.o.U(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)");
            }
            lVarP.e(-492369756);
            Object objF = lVarP.f();
            if (objF == t0.l.f20813a.a()) {
                objF = new c1();
                lVarP.E(objF);
            }
            lVarP.K();
            c1 c1Var = (c1) objF;
            int i14 = i12 << 3;
            b(c1Var, eVar, pVar, lVarP, (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i14 & 896), 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new c(eVar, pVar, i10, i11));
        }
    }

    public static final void b(c1 c1Var, androidx.compose.ui.e eVar, zd.p<? super d1, ? super w2.b, ? extends f0> pVar, t0.l lVar, int i10, int i11) {
        t0.l lVarP = lVar.p(-511989831);
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f2662a;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if (t0.o.I()) {
            t0.o.U(-511989831, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)");
        }
        int iA = t0.i.a(lVarP, 0);
        t0.q qVarC = t0.i.c(lVarP, 0);
        androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(lVarP, eVar2);
        t0.w wVarB = lVarP.B();
        zd.a<a2.f0> aVarA = a2.f0.Y.a();
        lVarP.e(1405779621);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(new b(aVarA));
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, c1Var, c1Var.g());
        u3.b(lVarA, qVarC, c1Var.e());
        u3.b(lVarA, pVar, c1Var.f());
        g.a aVar = a2.g.J;
        u3.b(lVarA, wVarB, aVar.g());
        u3.b(lVarA, eVarC, aVar.f());
        zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
        if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        lVarP.L();
        lVarP.K();
        if (!lVarP.s()) {
            t0.l0.e(new d(c1Var), lVarP, 0);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new e(c1Var, eVar2, pVar, i10, i11));
        }
    }
}
