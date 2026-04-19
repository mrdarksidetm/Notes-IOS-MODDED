package l1;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.graphics.Matrix r21, float[] r22) {
        /*
            r0 = 2
            r1 = r22[r0]
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 != 0) goto Lc
            r3 = r4
            goto Ld
        Lc:
            r3 = r5
        Ld:
            r6 = 8
            r7 = 6
            if (r3 == 0) goto L60
            r3 = r22[r7]
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L1a
            r3 = r4
            goto L1b
        L1a:
            r3 = r5
        L1b:
            if (r3 == 0) goto L60
            r3 = 10
            r3 = r22[r3]
            r8 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L29
            r3 = r4
            goto L2a
        L29:
            r3 = r5
        L2a:
            if (r3 == 0) goto L60
            r3 = 14
            r3 = r22[r3]
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L36
            r3 = r4
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L60
            r3 = r22[r6]
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L41
            r3 = r4
            goto L42
        L41:
            r3 = r5
        L42:
            if (r3 == 0) goto L60
            r3 = 9
            r3 = r22[r3]
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L4e
            r3 = r4
            goto L4f
        L4e:
            r3 = r5
        L4f:
            if (r3 == 0) goto L60
            r3 = 11
            r3 = r22[r3]
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L5b
            r2 = r4
            goto L5c
        L5b:
            r2 = r5
        L5c:
            if (r2 == 0) goto L60
            r2 = r4
            goto L61
        L60:
            r2 = r5
        L61:
            if (r2 == 0) goto Lab
            r2 = r22[r5]
            r3 = r22[r4]
            r8 = 3
            r9 = r22[r8]
            r10 = 4
            r11 = r22[r10]
            r12 = 5
            r13 = r22[r12]
            r14 = r22[r7]
            r15 = 7
            r16 = r22[r15]
            r17 = r22[r6]
            r18 = 12
            r18 = r22[r18]
            r19 = 13
            r19 = r22[r19]
            r20 = 15
            r20 = r22[r20]
            r22[r5] = r2
            r22[r4] = r11
            r22[r0] = r18
            r22[r8] = r3
            r22[r10] = r13
            r22[r12] = r19
            r22[r7] = r9
            r22[r15] = r16
            r22[r6] = r20
            r21.setValues(r22)
            r22[r5] = r2
            r22[r4] = r3
            r22[r0] = r1
            r22[r8] = r9
            r22[r10] = r11
            r22[r12] = r13
            r22[r7] = r14
            r22[r15] = r16
            r22[r6] = r17
            return
        Lab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Android does not support arbitrary transforms"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.h.a(android.graphics.Matrix, float[]):void");
    }

    public static final void b(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }
}
