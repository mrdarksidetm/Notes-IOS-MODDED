package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.e0;
import n2.h0;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements p0 {
    private final Typeface d(String str, i0 i0Var, int i10) {
        e0.a aVar = e0.f15784b;
        if (e0.f(i10, aVar.b()) && ae.r.b(i0Var, i0.f15808b.g())) {
            if (str == null || str.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), i0Var.t(), e0.f(i10, aVar.a()));
    }

    private final Typeface e(String str, i0 i0Var, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, i0Var, i10);
        if ((ae.r.b(typefaceD, z0.f15910a.a(Typeface.DEFAULT, i0Var.t(), e0.f(i10, e0.f15784b.a()))) || ae.r.b(typefaceD, d(null, i0Var, i10))) ? false : true) {
            return typefaceD;
        }
        return null;
    }

    @Override // n2.p0
    public Typeface a(i0 i0Var, int i10) {
        return d(null, i0Var, i10);
    }

    @Override // n2.p0
    public Typeface b(j0 j0Var, i0 i0Var, int i10) {
        return d(j0Var.o(), i0Var, i10);
    }

    @Override // n2.p0
    public Typeface c(String str, i0 i0Var, int i10, h0.d dVar, Context context) {
        Typeface typefaceE;
        j0 j0VarA;
        t.a aVar = t.f15881b;
        if (ae.r.b(str, aVar.d().o())) {
            j0VarA = aVar.d();
        } else if (ae.r.b(str, aVar.e().o())) {
            j0VarA = aVar.e();
        } else if (ae.r.b(str, aVar.c().o())) {
            j0VarA = aVar.c();
        } else {
            if (!ae.r.b(str, aVar.a().o())) {
                typefaceE = e(str, i0Var, i10);
                return s0.c(typefaceE, dVar, context);
            }
            j0VarA = aVar.a();
        }
        typefaceE = b(j0VarA, i0Var, i10);
        return s0.c(typefaceE, dVar, context);
    }
}
