package z5;

import ae.s;
import android.content.Context;
import androidx.compose.ui.platform.r;
import t0.a2;
import t0.l;
import t0.o;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static final class a extends s implements zd.a<x5.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24244a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x5.e invoke() {
            return null;
        }
    }

    public static a2<x5.e> a(a2<x5.e> a2Var) {
        return a2Var;
    }

    public static /* synthetic */ a2 b(a2 a2Var, int i10, ae.j jVar) {
        if ((i10 & 1) != 0) {
            a2Var = v.e(a.f24244a);
        }
        return a(a2Var);
    }

    public static final x5.e c(a2<x5.e> a2Var, l lVar, int i10) {
        if (o.I()) {
            o.U(-617597678, i10, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        x5.e eVarA = (x5.e) lVar.P(a2Var);
        if (eVarA == null) {
            eVarA = x5.a.a((Context) lVar.P(r.g()));
        }
        if (o.I()) {
            o.T();
        }
        return eVarA;
    }
}
