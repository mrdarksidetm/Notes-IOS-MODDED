package r2;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import i2.a0;
import i2.d;
import i2.g0;
import i2.w;
import i2.y;
import java.util.List;
import n2.e0;
import n2.f0;
import n2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f19147a = new a();

    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public static final CharSequence a(String str, float f10, g0 g0Var, List<d.b<a0>> list, List<d.b<i2.u>> list2, w2.d dVar, zd.r<? super n2.t, ? super i0, ? super e0, ? super f0, ? extends Typeface> rVar, boolean z10) {
        CharSequence charSequenceP;
        if (z10 && androidx.emoji2.text.e.i()) {
            charSequenceP = androidx.emoji2.text.e.c().p(str);
            ae.r.c(charSequenceP);
        } else {
            charSequenceP = str;
        }
        if (list.isEmpty() && list2.isEmpty() && ae.r.b(g0Var.F(), u2.o.f21591c.a()) && w2.u.f(g0Var.u())) {
            return charSequenceP;
        }
        Spannable spannableString = charSequenceP instanceof Spannable ? (Spannable) charSequenceP : new SpannableString(charSequenceP);
        if (ae.r.b(g0Var.C(), u2.j.f21569b.c())) {
            s2.d.u(spannableString, f19147a, 0, str.length());
        }
        if (b(g0Var) && g0Var.v() == null) {
            s2.d.r(spannableString, g0Var.u(), f10, dVar);
        } else {
            u2.g gVarV = g0Var.v();
            if (gVarV == null) {
                gVarV = u2.g.f21543c.a();
            }
            s2.d.q(spannableString, g0Var.u(), f10, dVar, gVarV);
        }
        s2.d.y(spannableString, g0Var.F(), f10, dVar);
        s2.d.w(spannableString, g0Var, list, dVar, rVar);
        s2.c.d(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(g0 g0Var) {
        w wVarA;
        y yVarY = g0Var.y();
        if (yVarY == null || (wVarA = yVarY.a()) == null) {
            return false;
        }
        return wVarA.b();
    }
}
