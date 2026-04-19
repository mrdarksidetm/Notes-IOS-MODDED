package l1;

import l1.b1;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final void b(n1.f fVar, b1 b1Var, z zVar, float f10, n1.g gVar, k0 k0Var, int i10) {
        f1 f1VarA;
        if (b1Var instanceof b1.b) {
            k1.h hVarA = ((b1.b) b1Var).a();
            fVar.R(zVar, i(hVarA), g(hVarA), f10, gVar, k0Var, i10);
            return;
        }
        if (b1Var instanceof b1.c) {
            b1.c cVar = (b1.c) b1Var;
            f1VarA = cVar.b();
            if (f1VarA == null) {
                k1.j jVarA = cVar.a();
                fVar.p0(zVar, j(jVarA), h(jVarA), k1.b.b(k1.a.d(jVarA.b()), 0.0f, 2, null), f10, gVar, k0Var, i10);
                return;
            }
        } else {
            if (!(b1Var instanceof b1.a)) {
                throw new md.q();
            }
            f1VarA = ((b1.a) b1Var).a();
        }
        fVar.f1(f1VarA, zVar, f10, gVar, k0Var, i10);
    }

    public static /* synthetic */ void c(n1.f fVar, b1 b1Var, z zVar, float f10, n1.g gVar, k0 k0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = n1.j.f15736a;
        }
        n1.g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            k0Var = null;
        }
        k0 k0Var2 = k0Var;
        if ((i11 & 32) != 0) {
            i10 = n1.f.S.a();
        }
        b(fVar, b1Var, zVar, f11, gVar2, k0Var2, i10);
    }

    public static final void d(n1.f fVar, b1 b1Var, long j10, float f10, n1.g gVar, k0 k0Var, int i10) {
        f1 f1VarA;
        if (b1Var instanceof b1.b) {
            k1.h hVarA = ((b1.b) b1Var).a();
            fVar.k1(j10, i(hVarA), g(hVarA), f10, gVar, k0Var, i10);
            return;
        }
        if (b1Var instanceof b1.c) {
            b1.c cVar = (b1.c) b1Var;
            f1VarA = cVar.b();
            if (f1VarA == null) {
                k1.j jVarA = cVar.a();
                fVar.T0(j10, j(jVarA), h(jVarA), k1.b.b(k1.a.d(jVarA.b()), 0.0f, 2, null), gVar, f10, k0Var, i10);
                return;
            }
        } else {
            if (!(b1Var instanceof b1.a)) {
                throw new md.q();
            }
            f1VarA = ((b1.a) b1Var).a();
        }
        fVar.X(f1VarA, j10, f10, gVar, k0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(k1.j r6) {
        /*
            long r0 = r6.b()
            float r0 = k1.a.d(r0)
            long r1 = r6.c()
            float r1 = k1.a.d(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L4f
            long r3 = r6.c()
            float r0 = k1.a.d(r3)
            long r3 = r6.i()
            float r3 = k1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L4f
            long r3 = r6.i()
            float r0 = k1.a.d(r3)
            long r3 = r6.h()
            float r3 = k1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            long r3 = r6.b()
            float r3 = k1.a.e(r3)
            long r4 = r6.c()
            float r4 = k1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L9d
            long r3 = r6.c()
            float r3 = k1.a.e(r3)
            long r4 = r6.i()
            float r4 = k1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7f
            r3 = r1
            goto L80
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L9d
            long r3 = r6.i()
            float r3 = k1.a.e(r3)
            long r4 = r6.h()
            float r6 = k1.a.e(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = r1
            goto L99
        L98:
            r6 = r2
        L99:
            if (r6 == 0) goto L9d
            r6 = r1
            goto L9e
        L9d:
            r6 = r2
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r1 = r2
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c1.f(k1.j):boolean");
    }

    private static final long g(k1.h hVar) {
        return k1.m.a(hVar.k(), hVar.e());
    }

    private static final long h(k1.j jVar) {
        return k1.m.a(jVar.j(), jVar.d());
    }

    private static final long i(k1.h hVar) {
        return k1.g.a(hVar.f(), hVar.i());
    }

    private static final long j(k1.j jVar) {
        return k1.g.a(jVar.e(), jVar.g());
    }
}
