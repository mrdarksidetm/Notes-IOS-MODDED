package q0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.b2;
import t0.e2;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f18567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2.g0 f18568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18570d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j10, i2.g0 g0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, int i10) {
            super(2);
            this.f18567a = j10;
            this.f18568b = g0Var;
            this.f18569c = pVar;
            this.f18570d = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            e0.a(this.f18567a, this.f18568b, this.f18569c, lVar, e2.a(this.f18570d | 1));
        }
    }

    public static final void a(long j10, i2.g0 g0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10) {
        int i11;
        t0.l lVarP = lVar.p(1479790536);
        if ((i10 & 6) == 0) {
            i11 = (lVarP.i(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= lVarP.N(g0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= lVarP.k(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(1479790536, i11, -1, "androidx.compose.material3.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:36)");
            }
            t0.v.b(new b2[]{k.a().c(l1.j0.m(j10)), q0.d().c(((i2.g0) lVarP.P(q0.d())).K(g0Var))}, pVar, lVarP, (i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(j10, g0Var, pVar, i10));
        }
    }
}
