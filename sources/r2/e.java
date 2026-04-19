package r2;

import i2.a0;
import i2.d;
import i2.g0;
import i2.w;
import i2.y;
import java.util.List;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final i2.p a(String str, g0 g0Var, List<d.b<a0>> list, List<d.b<i2.u>> list2, w2.d dVar, t.b bVar) {
        return new d(str, g0Var, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(g0 g0Var) {
        w wVarA;
        y yVarY = g0Var.y();
        return !(((yVarY == null || (wVarA = yVarY.a()) == null) ? null : i2.g.c(wVarA.a())) == null ? false : i2.g.f(r1.i(), i2.g.f12362b.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r6 == 1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(int r6, q2.e r7) {
        /*
            u2.k$a r0 = u2.k.f21574b
            int r1 = r0.b()
            boolean r1 = u2.k.j(r6, r1)
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L12
        L10:
            r2 = r5
            goto L6f
        L12:
            int r1 = r0.c()
            boolean r1 = u2.k.j(r6, r1)
            if (r1 == 0) goto L1e
        L1c:
            r2 = r3
            goto L6f
        L1e:
            int r1 = r0.d()
            boolean r1 = u2.k.j(r6, r1)
            if (r1 == 0) goto L29
            goto L6f
        L29:
            int r1 = r0.e()
            boolean r1 = u2.k.j(r6, r1)
            if (r1 == 0) goto L35
            r2 = r4
            goto L6f
        L35:
            int r1 = r0.a()
            boolean r1 = u2.k.j(r6, r1)
            if (r1 == 0) goto L41
            r6 = r4
            goto L49
        L41:
            int r0 = r0.f()
            boolean r6 = u2.k.j(r6, r0)
        L49:
            if (r6 == 0) goto L70
            if (r7 == 0) goto L62
            q2.d r6 = r7.d(r2)
            q2.f r6 = r6.a()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            ae.r.d(r6, r7)
            q2.a r6 = (q2.a) r6
            java.util.Locale r6 = r6.b()
            if (r6 != 0) goto L66
        L62:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L66:
            int r6 = m3.c.a(r6)
            if (r6 == 0) goto L10
            if (r6 == r4) goto L1c
            goto L10
        L6f:
            return r2
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.e.d(int, q2.e):int");
    }
}
