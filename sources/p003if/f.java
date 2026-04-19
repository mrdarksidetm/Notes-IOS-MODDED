package p003if;

import ae.r;
import hf.c;
import hf.d0;
import hf.n0;
import hf.o0;
import hf.x;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f12745a = n0.a("0123456789abcdef");

    public static final c.a a(c cVar, c.a aVar) {
        r.f(cVar, "<this>");
        r.f(aVar, "unsafeCursor");
        c.a aVarG = o0.g(aVar);
        if (!(aVarG.f11935a == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVarG.f11935a = cVar;
        aVarG.f11936b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f12745a;
    }

    public static final boolean c(d0 d0Var, int i10, byte[] bArr, int i11, int i12) {
        r.f(d0Var, "segment");
        r.f(bArr, "bytes");
        int i13 = d0Var.f11950c;
        byte[] bArr2 = d0Var.f11948a;
        while (i11 < i12) {
            if (i10 == i13) {
                d0Var = d0Var.f11953f;
                r.c(d0Var);
                byte[] bArr3 = d0Var.f11948a;
                bArr2 = bArr3;
                i10 = d0Var.f11949b;
                i13 = d0Var.f11950c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(c cVar, long j10) throws EOFException {
        r.f(cVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (cVar.L(j11) == 13) {
                String strC = cVar.c(j11);
                cVar.skip(2L);
                return strC;
            }
        }
        String strC2 = cVar.c(j10);
        cVar.skip(1L);
        return strC2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(hf.c r17, hf.x r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            ae.r.f(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            ae.r.f(r2, r1)
            hf.d0 r0 = r0.f11933a
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L19
            if (r19 == 0) goto L17
            goto L18
        L17:
            r1 = r3
        L18:
            return r1
        L19:
            byte[] r4 = r0.f11948a
            int r5 = r0.f11949b
            int r6 = r0.f11950c
            int[] r2 = r18.n()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L27:
            int r11 = r8 + 1
            r8 = r2[r8]
            int r12 = r11 + 1
            r11 = r2[r11]
            if (r11 == r3) goto L32
            r10 = r11
        L32:
            if (r9 != 0) goto L35
            goto L65
        L35:
            r11 = 0
            if (r8 >= 0) goto L82
            int r8 = r8 * (-1)
            int r13 = r12 + r8
        L3c:
            int r8 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r12 = r2[r12]
            if (r5 == r12) goto L49
            return r10
        L49:
            if (r14 != r13) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = r7
        L4e:
            if (r8 != r6) goto L6f
            ae.r.c(r9)
            hf.d0 r4 = r9.f11953f
            ae.r.c(r4)
            int r6 = r4.f11949b
            byte[] r8 = r4.f11948a
            int r9 = r4.f11950c
            if (r4 != r0) goto L69
            if (r5 == 0) goto L65
            r4 = r8
            r8 = r11
            goto L75
        L65:
            if (r19 == 0) goto L68
            return r1
        L68:
            return r10
        L69:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L75
        L6f:
            r16 = r9
            r9 = r6
            r6 = r8
            r8 = r16
        L75:
            if (r5 == 0) goto L7d
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La7
        L7d:
            r5 = r6
            r6 = r9
            r12 = r14
            r9 = r8
            goto L3c
        L82:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + r8
        L8a:
            if (r12 != r14) goto L8d
            return r10
        L8d:
            r15 = r2[r12]
            if (r5 != r15) goto Lae
            int r12 = r12 + r8
            r5 = r2[r12]
            if (r13 != r6) goto La7
            hf.d0 r9 = r9.f11953f
            ae.r.c(r9)
            int r4 = r9.f11949b
            byte[] r6 = r9.f11948a
            int r8 = r9.f11950c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La7
            r9 = r11
        La7:
            if (r5 < 0) goto Laa
            return r5
        Laa:
            int r8 = -r5
            r5 = r13
            goto L27
        Lae:
            int r12 = r12 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: p003if.f.e(hf.c, hf.x, boolean):int");
    }

    public static /* synthetic */ int f(c cVar, x xVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(cVar, xVar, z10);
    }
}
