package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.h0;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
final class r0 implements p0 {
    private final Typeface d(String str, i0 i0Var, int i10) {
        if (e0.f(i10, e0.f15784b.b()) && ae.r.b(i0Var, i0.f15808b.g())) {
            if (str == null || str.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        int iC = h.c(i0Var, i10);
        return str == null || str.length() == 0 ? Typeface.defaultFromStyle(iC) : Typeface.create(str, iC);
    }

    private final Typeface e(String str, i0 i0Var, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, i0Var, i10);
        if ((ae.r.b(typefaceD, Typeface.create(Typeface.DEFAULT, h.c(i0Var, i10))) || ae.r.b(typefaceD, d(null, i0Var, i10))) ? false : true) {
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
        Typeface typefaceE = e(s0.b(j0Var.o(), i0Var), i0Var, i10);
        return typefaceE == null ? d(j0Var.o(), i0Var, i10) : typefaceE;
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
