package n2;

import android.graphics.Typeface;
import n2.c1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f15872a = s0.a();

    public c1 a(a1 a1Var, n0 n0Var, zd.l<? super c1.b, md.i0> lVar, zd.l<? super a1, ? extends Object> lVar2) {
        Typeface typefaceA;
        t tVarC = a1Var.c();
        if (tVarC == null ? true : tVarC instanceof n) {
            typefaceA = this.f15872a.a(a1Var.f(), a1Var.d());
        } else if (tVarC instanceof j0) {
            typefaceA = this.f15872a.b((j0) a1Var.c(), a1Var.f(), a1Var.d());
        } else {
            if (!(tVarC instanceof k0)) {
                return null;
            }
            v0 v0VarO = ((k0) a1Var.c()).o();
            ae.r.d(v0VarO, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceA = ((r2.i) v0VarO).a(a1Var.f(), a1Var.d(), a1Var.e());
        }
        return new c1.b(typefaceA, false, 2, null);
    }
}
