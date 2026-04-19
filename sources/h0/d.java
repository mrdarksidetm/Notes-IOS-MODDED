package h0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.e2;
import t0.o2;
import y1.b1;
import y1.d1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    static final class a extends ae.s implements zd.p<d1, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.e0 f11636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.q<e, t0.l, Integer, md.i0> f11637b;

        /* JADX INFO: renamed from: h0.d$a$a, reason: collision with other inner class name */
        static final class C0281a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zd.q<e, t0.l, Integer, md.i0> f11638a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f11639b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0281a(zd.q<? super e, ? super t0.l, ? super Integer, md.i0> qVar, f fVar) {
                super(2);
                this.f11638a = qVar;
                this.f11639b = fVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return md.i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (t0.o.I()) {
                    t0.o.U(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f11638a.invoke(this.f11639b, lVar, 0);
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(y1.e0 e0Var, zd.q<? super e, ? super t0.l, ? super Integer, md.i0> qVar) {
            super(2);
            this.f11636a = e0Var;
            this.f11637b = qVar;
        }

        public final y1.f0 a(d1 d1Var, long j10) {
            return this.f11636a.a(d1Var, d1Var.F0(md.i0.f15558a, b1.c.c(-1945019079, true, new C0281a(this.f11637b, new f(d1Var, j10, null)))), j10);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ y1.f0 invoke(d1 d1Var, w2.b bVar) {
            return a(d1Var, bVar.t());
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1.b f11641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.q<e, t0.l, Integer, md.i0> f11643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11645f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, f1.b bVar, boolean z10, zd.q<? super e, ? super t0.l, ? super Integer, md.i0> qVar, int i10, int i11) {
            super(2);
            this.f11640a = eVar;
            this.f11641b = bVar;
            this.f11642c = z10;
            this.f11643d = qVar;
            this.f11644e = i10;
            this.f11645f = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.a(this.f11640a, this.f11641b, this.f11642c, this.f11643d, lVar, e2.a(this.f11644e | 1), this.f11645f);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, f1.b bVar, boolean z10, zd.q<? super e, ? super t0.l, ? super Integer, md.i0> qVar, t0.l lVar, int i10, int i11) {
        int i12;
        t0.l lVarP = lVar.p(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(bVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= lVarP.c(z10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= lVarP.k(qVar) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f2662a;
            }
            if (i14 != 0) {
                bVar = f1.b.f11020a.o();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (t0.o.I()) {
                t0.o.U(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            int i16 = i12 >> 3;
            y1.e0 e0VarG = androidx.compose.foundation.layout.d.g(bVar, z10, lVarP, (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i16 & 14));
            lVarP.e(1021372304);
            boolean zK = lVarP.k(qVar) | lVarP.N(e0VarG);
            Object objF = lVarP.f();
            if (zK || objF == t0.l.f20813a.a()) {
                objF = new a(e0VarG, qVar);
                lVarP.E(objF);
            }
            lVarP.K();
            b1.a(eVar, (zd.p) objF, lVarP, i12 & 14, 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        f1.b bVar2 = bVar;
        boolean z11 = z10;
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(eVar2, bVar2, z11, qVar, i10, i11));
        }
    }
}
