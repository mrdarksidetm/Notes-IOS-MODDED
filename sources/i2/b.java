package i2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j2.r0;
import u2.d;
import u2.e;
import u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        s2.d.u(spannableString, new l2.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(r0 r0Var, int i10) {
        int iL = r0Var.l();
        for (int i11 = 0; i11 < iL; i11++) {
            if (r0Var.k(i11) > i10) {
                return i11;
            }
        }
        return r0Var.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(g0 g0Var, boolean z10) {
        if (!z10 || w2.t.e(g0Var.s(), w2.u.e(0)) || w2.t.e(g0Var.s(), w2.t.f22428b.a())) {
            return false;
        }
        int iB = g0Var.B();
        i.a aVar = u2.i.f21560b;
        return (u2.i.k(iB, aVar.g()) || u2.i.k(g0Var.B(), aVar.f()) || u2.i.k(g0Var.B(), aVar.c())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10) {
        i.a aVar = u2.i.f21560b;
        if (u2.i.k(i10, aVar.d())) {
            return 3;
        }
        if (u2.i.k(i10, aVar.e())) {
            return 4;
        }
        if (u2.i.k(i10, aVar.a())) {
            return 2;
        }
        return (!u2.i.k(i10, aVar.f()) && u2.i.k(i10, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        e.b.a aVar = e.b.f21528a;
        if (e.b.e(i10, aVar.c())) {
            return 0;
        }
        if (e.b.e(i10, aVar.b())) {
            return 1;
        }
        return e.b.e(i10, aVar.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10) {
        d.a aVar = u2.d.f21519a;
        if (u2.d.e(i10, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        u2.d.e(i10, aVar.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10) {
        e.c.a aVar = e.c.f21533a;
        if (e.c.f(i10, aVar.a())) {
            return 0;
        }
        if (e.c.f(i10, aVar.b())) {
            return 1;
        }
        if (e.c.f(i10, aVar.c())) {
            return 2;
        }
        return e.c.f(i10, aVar.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i10) {
        e.d.a aVar = e.d.f21539a;
        return (!e.d.d(i10, aVar.a()) && e.d.d(i10, aVar.b())) ? 1 : 0;
    }
}
