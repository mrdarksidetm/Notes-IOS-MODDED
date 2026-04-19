package r2;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import i2.a0;
import i2.d;
import java.util.List;
import n2.e0;
import n2.f0;
import n2.i0;
import n2.j0;
import n2.t;
import u2.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, a0 a0Var, int i10, int i11, w2.d dVar, t.b bVar) {
        TypefaceSpan typefaceSpanA;
        s2.d.k(spannableString, a0Var.g(), i10, i11);
        s2.d.o(spannableString, a0Var.k(), dVar, i10, i11);
        if (a0Var.n() != null || a0Var.l() != null) {
            i0 i0VarN = a0Var.n();
            if (i0VarN == null) {
                i0VarN = i0.f15808b.g();
            }
            e0 e0VarL = a0Var.l();
            spannableString.setSpan(new StyleSpan(n2.h.c(i0VarN, e0VarL != null ? e0VarL.i() : e0.f15784b.b())), i10, i11, 33);
        }
        if (a0Var.i() != null) {
            if (a0Var.i() instanceof j0) {
                typefaceSpanA = new TypefaceSpan(((j0) a0Var.i()).o());
            } else if (Build.VERSION.SDK_INT >= 28) {
                n2.t tVarI = a0Var.i();
                f0 f0VarM = a0Var.m();
                Object value = t.b.b(bVar, tVarI, null, 0, f0VarM != null ? f0VarM.j() : f0.f15789b.a(), 6, null).getValue();
                ae.r.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                typefaceSpanA = k.f19166a.a((Typeface) value);
            }
            spannableString.setSpan(typefaceSpanA, i10, i11, 33);
        }
        if (a0Var.s() != null) {
            u2.j jVarS = a0Var.s();
            j.a aVar = u2.j.f21569b;
            if (jVarS.d(aVar.c())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (a0Var.s().d(aVar.a())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (a0Var.u() != null) {
            spannableString.setSpan(new ScaleXSpan(a0Var.u().b()), i10, i11, 33);
        }
        s2.d.s(spannableString, a0Var.p(), i10, i11);
        s2.d.h(spannableString, a0Var.d(), i10, i11);
    }

    public static final SpannableString b(i2.d dVar, w2.d dVar2, t.b bVar, u uVar) {
        SpannableString spannableString = new SpannableString(dVar.j());
        List<d.b<a0>> listG = dVar.g();
        if (listG != null) {
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                d.b<a0> bVar2 = listG.get(i10);
                a(spannableString, a0.b(bVar2.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), bVar2.b(), bVar2.c(), dVar2, bVar);
            }
        }
        List<d.b<i2.i0>> listK = dVar.k(0, dVar.length());
        int size2 = listK.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d.b<i2.i0> bVar3 = listK.get(i11);
            spannableString.setSpan(s2.f.a(bVar3.a()), bVar3.b(), bVar3.c(), 33);
        }
        List<d.b<i2.j0>> listL = dVar.l(0, dVar.length());
        int size3 = listL.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d.b<i2.j0> bVar4 = listL.get(i12);
            spannableString.setSpan(uVar.a(bVar4.a()), bVar4.b(), bVar4.c(), 33);
        }
        return spannableString;
    }
}
