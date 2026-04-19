package s2;

import i2.a0;
import r2.g;
import u2.p;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final i2.a0 a(r2.g r6, i2.a0 r7, zd.r<? super n2.t, ? super n2.i0, ? super n2.e0, ? super n2.f0, ? extends android.graphics.Typeface> r8, w2.d r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.e.a(r2.g, i2.a0, zd.r, w2.d, boolean):i2.a0");
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final i2.a0 c(long r32, boolean r34, long r35, u2.a r37) {
        /*
            r0 = r35
            r2 = 1
            r3 = 0
            if (r34 == 0) goto L26
            long r4 = w2.t.g(r32)
            w2.v$a r6 = w2.v.f22432b
            long r6 = r6.b()
            boolean r4 = w2.v.g(r4, r6)
            if (r4 == 0) goto L26
            float r4 = w2.t.h(r32)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L21
            r4 = r2
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            l1.j0$a r5 = l1.j0.f14524b
            long r6 = r5.j()
            boolean r6 = l1.j0.w(r0, r6)
            if (r6 != 0) goto L3f
            long r6 = r5.i()
            boolean r6 = l1.j0.w(r0, r6)
            if (r6 != 0) goto L3f
            r6 = r2
            goto L40
        L3f:
            r6 = r3
        L40:
            if (r37 == 0) goto L53
            u2.a$a r7 = u2.a.f21511b
            float r7 = r7.a()
            float r8 = r37.h()
            boolean r7 = u2.a.e(r8, r7)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r2 = r3
        L54:
            r3 = 0
            if (r4 != 0) goto L5c
            if (r6 != 0) goto L5c
            if (r2 != 0) goto L5c
            goto L9c
        L5c:
            if (r4 == 0) goto L61
            r19 = r32
            goto L69
        L61:
            w2.t$a r4 = w2.t.f22428b
            long r7 = r4.a()
            r19 = r7
        L69:
            if (r6 == 0) goto L6c
            goto L70
        L6c:
            long r0 = r5.j()
        L70:
            r24 = r0
            if (r2 == 0) goto L77
            r21 = r37
            goto L79
        L77:
            r21 = r3
        L79:
            i2.a0 r3 = new i2.a0
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63103(0xf67f, float:8.8426E-41)
            r31 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.e.c(long, boolean, long, u2.a):i2.a0");
    }

    public static final boolean d(a0 a0Var) {
        return (a0Var.i() == null && a0Var.l() == null && a0Var.n() == null) ? false : true;
    }

    public static final void e(g gVar, p pVar) {
        if (pVar == null) {
            pVar = p.f21595c.a();
        }
        gVar.setFlags(pVar.c() ? gVar.getFlags() | 128 : gVar.getFlags() & (-129));
        int iB = pVar.b();
        p.b.a aVar = p.b.f21600a;
        if (p.b.e(iB, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
        } else if (p.b.e(iB, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
            return;
        } else {
            boolean zE = p.b.e(iB, aVar.c());
            gVar.getFlags();
            if (!zE) {
                return;
            }
        }
        gVar.setHinting(0);
    }
}
