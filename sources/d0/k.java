package d0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.e2;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f9233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<n1.f, md.i0> f9234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, zd.l<? super n1.f, md.i0> lVar, int i10) {
            super(2);
            this.f9233a = eVar;
            this.f9234b = lVar;
            this.f9235c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            k.a(this.f9233a, this.f9234b, lVar, e2.a(this.f9235c | 1));
        }
    }

    public static final void a(androidx.compose.ui.e eVar, zd.l<? super n1.f, md.i0> lVar, t0.l lVar2, int i10) {
        int i11;
        t0.l lVarP = lVar2.p(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            h0.j0.a(androidx.compose.ui.draw.b.b(eVar, lVar), lVarP, 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(eVar, lVar, i10));
        }
    }
}
