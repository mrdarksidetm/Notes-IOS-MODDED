package j0;

import android.view.View;
import t0.e2;
import t0.o2;
import y1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f13635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f13636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f13637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13638d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, o oVar, c1 c1Var, int i10) {
            super(2);
            this.f13635a = b0Var;
            this.f13636b = oVar;
            this.f13637c = c1Var;
            this.f13638d = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d0.a(this.f13635a, this.f13636b, this.f13637c, lVar, e2.a(this.f13638d | 1));
        }
    }

    public static final void a(b0 b0Var, o oVar, c1 c1Var, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(1113453182);
        if (t0.o.I()) {
            t0.o.U(1113453182, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) lVarP.P(androidx.compose.ui.platform.r.j());
        int i11 = c1.f23222f;
        lVarP.e(1618982084);
        boolean zN = lVarP.N(c1Var) | lVarP.N(b0Var) | lVarP.N(view);
        Object objF = lVarP.f();
        if (zN || objF == t0.l.f20813a.a()) {
            lVarP.E(new c0(b0Var, c1Var, oVar, view));
        }
        lVarP.K();
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(b0Var, oVar, c1Var, i10));
        }
    }
}
