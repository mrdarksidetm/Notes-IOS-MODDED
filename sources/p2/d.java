package p2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, p2.x r20, i2.d0 r21, k1.h r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.a(r2)
            int r5 = r1.a(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            i2.h r7 = r21.v()
            long r8 = i2.f0.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8b
            int r5 = r1.a(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            k1.h r8 = new k1.h
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.o(r8)
            float r9 = r8.f()
            float r10 = r8.i()
            boolean r9 = c(r3, r9, r10)
            if (r9 == 0) goto L5f
            float r9 = r8.g()
            float r10 = r8.c()
            boolean r9 = c(r3, r9, r10)
            if (r9 != 0) goto L61
        L5f:
            r7 = r7 | 2
        L61:
            r9 = r21
            u2.h r5 = r9.c(r5)
            u2.h r10 = u2.h.Rtl
            if (r5 != r10) goto L70
            r5 = r7 | 4
            r16 = r5
            goto L72
        L70:
            r16 = r7
        L72:
            float r12 = r8.f()
            float r13 = r8.i()
            float r14 = r8.g()
            float r15 = r8.c()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, p2.x, i2.d0, k1.h):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, e0 e0Var, x xVar, i2.d0 d0Var, Matrix matrix, k1.h hVar, k1.h hVar2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iJ = i2.e0.j(e0Var.c());
        builder.setSelectionRange(iJ, i2.e0.i(e0Var.c()));
        if (z10) {
            d(builder, iJ, xVar, d0Var, hVar);
        }
        if (z11) {
            i2.e0 e0VarB = e0Var.b();
            int iJ2 = e0VarB != null ? i2.e0.j(e0VarB.n()) : -1;
            i2.e0 e0VarB2 = e0Var.b();
            int i10 = e0VarB2 != null ? i2.e0.i(e0VarB2.n()) : -1;
            boolean z14 = false;
            if (iJ2 >= 0 && iJ2 < i10) {
                z14 = true;
            }
            if (z14) {
                builder.setComposingText(iJ2, e0Var.d().subSequence(iJ2, i10));
                a(builder, iJ2, i10, xVar, d0Var, hVar);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z12) {
            b.a(builder, hVar2);
        }
        if (i11 >= 34 && z13) {
            c.a(builder, d0Var, hVar);
        }
        return builder.build();
    }

    private static final boolean c(k1.h hVar, float f10, float f11) {
        if (f10 <= hVar.g() && hVar.f() <= f10) {
            if (f11 <= hVar.c() && hVar.i() <= f11) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, x xVar, i2.d0 d0Var, k1.h hVar) {
        if (i10 < 0) {
            return builder;
        }
        int iA = xVar.a(i10);
        k1.h hVarE = d0Var.e(iA);
        float fK = ge.o.k(hVarE.f(), 0.0f, w2.p.g(d0Var.z()));
        boolean zC = c(hVar, fK, hVarE.i());
        boolean zC2 = c(hVar, fK, hVarE.c());
        int i11 = 1;
        boolean z10 = d0Var.c(iA) == u2.h.Rtl;
        if (!zC && !zC2) {
            i11 = 0;
        }
        if (!zC || !zC2) {
            i11 |= 2;
        }
        builder.setInsertionMarkerLocation(fK, hVarE.i(), hVarE.c(), hVarE.c(), z10 ? i11 | 4 : i11);
        return builder;
    }
}
