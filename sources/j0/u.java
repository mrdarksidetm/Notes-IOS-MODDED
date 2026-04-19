package j0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.e2;
import t0.f3;
import t0.l;
import t0.o2;
import t0.p3;
import y1.b1;
import y1.c1;
import y1.d1;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    static final class a extends ae.s implements zd.q<c1.d, t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f13765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<v, w2.b, y1.f0> f13767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p3<zd.a<q>> f13768d;

        /* JADX INFO: renamed from: j0.u$a$a, reason: collision with other inner class name */
        static final class C0325a extends ae.s implements zd.p<d1, w2.b, y1.f0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f13769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.p<v, w2.b, y1.f0> f13770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0325a(o oVar, zd.p<? super v, ? super w2.b, ? extends y1.f0> pVar) {
                super(2);
                this.f13769a = oVar;
                this.f13770b = pVar;
            }

            public final y1.f0 a(d1 d1Var, long j10) {
                return this.f13770b.invoke(new w(this.f13769a, d1Var), w2.b.b(j10));
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ y1.f0 invoke(d1 d1Var, w2.b bVar) {
                return a(d1Var, bVar.t());
            }
        }

        static final class b extends ae.s implements zd.a<q> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p3<zd.a<q>> f13771a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(p3<? extends zd.a<? extends q>> p3Var) {
                super(0);
                this.f13771a = p3Var;
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q invoke() {
                return this.f13771a.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0 b0Var, androidx.compose.ui.e eVar, zd.p<? super v, ? super w2.b, ? extends y1.f0> pVar, p3<? extends zd.a<? extends q>> p3Var) {
            super(3);
            this.f13765a = b0Var;
            this.f13766b = eVar;
            this.f13767c = pVar;
            this.f13768d = p3Var;
        }

        public final void a(c1.d dVar, t0.l lVar, int i10) {
            if (t0.o.I()) {
                t0.o.U(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
            }
            p3<zd.a<q>> p3Var = this.f13768d;
            lVar.e(-492369756);
            Object objF = lVar.f();
            l.a aVar = t0.l.f20813a;
            if (objF == aVar.a()) {
                objF = new o(dVar, new b(p3Var));
                lVar.E(objF);
            }
            lVar.K();
            o oVar = (o) objF;
            lVar.e(-492369756);
            Object objF2 = lVar.f();
            if (objF2 == aVar.a()) {
                objF2 = new c1(new s(oVar));
                lVar.E(objF2);
            }
            lVar.K();
            c1 c1Var = (c1) objF2;
            b0 b0Var = this.f13765a;
            lVar.e(-1523807258);
            if (b0Var != null) {
                d0.a(this.f13765a, oVar, c1Var, lVar, (c1.f23222f << 6) | 64);
                md.i0 i0Var = md.i0.f15558a;
            }
            lVar.K();
            androidx.compose.ui.e eVar = this.f13766b;
            zd.p<v, w2.b, y1.f0> pVar = this.f13767c;
            lVar.e(511388516);
            boolean zN = lVar.N(oVar) | lVar.N(pVar);
            Object objF3 = lVar.f();
            if (zN || objF3 == aVar.a()) {
                objF3 = new C0325a(oVar, pVar);
                lVar.E(objF3);
            }
            lVar.K();
            b1.b(c1Var, eVar, (zd.p) objF3, lVar, c1.f23222f, 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ md.i0 invoke(c1.d dVar, t0.l lVar, Integer num) {
            a(dVar, lVar, num.intValue());
            return md.i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<q> f13772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f13774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<v, w2.b, y1.f0> f13775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13777f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.a<? extends q> aVar, androidx.compose.ui.e eVar, b0 b0Var, zd.p<? super v, ? super w2.b, ? extends y1.f0> pVar, int i10, int i11) {
            super(2);
            this.f13772a = aVar;
            this.f13773b = eVar;
            this.f13774c = b0Var;
            this.f13775d = pVar;
            this.f13776e = i10;
            this.f13777f = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            u.a(this.f13772a, this.f13773b, this.f13774c, this.f13775d, lVar, e2.a(this.f13776e | 1), this.f13777f);
        }
    }

    public static final void a(zd.a<? extends q> aVar, androidx.compose.ui.e eVar, b0 b0Var, zd.p<? super v, ? super w2.b, ? extends y1.f0> pVar, t0.l lVar, int i10, int i11) {
        int i12;
        t0.l lVarP = lVar.p(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= lVarP.N(b0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= lVarP.k(pVar) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f2662a;
            }
            if (i14 != 0) {
                b0Var = null;
            }
            if (t0.o.I()) {
                t0.o.U(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:77)");
            }
            h0.a(b1.c.b(lVarP, -1488997347, true, new a(b0Var, eVar, pVar, f3.o(aVar, lVarP, i12 & 14))), lVarP, 6);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        b0 b0Var2 = b0Var;
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(aVar, eVar2, b0Var2, pVar, i10, i11));
        }
    }
}
