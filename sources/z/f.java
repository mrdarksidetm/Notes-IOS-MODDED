package z;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f24073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24075e;

    private f() {
        this.f24071a = z.f24117a;
        this.f24072b = j.a();
        this.f24073c = j.a();
    }

    public /* synthetic */ f(ae.j jVar) {
        this();
    }

    public final boolean a(int i10) {
        return b(i10) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f24074d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f24071a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L4a
            r10 = r11
            goto L4b
        L4a:
            r10 = r4
        L4b:
            if (r10 == 0) goto L65
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f24072b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L5e
            return r10
        L5e:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L65:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L70
            r1 = -1
            return r1
        L70:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.b(int):int");
    }

    public final int c(int i10) {
        int iB = b(i10);
        if (iB >= 0) {
            return this.f24073c[iB];
        }
        throw new NoSuchElementException("Cannot find value for key " + i10);
    }

    public final int d() {
        return this.f24074d;
    }

    public final int e() {
        return this.f24075e;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof z.f
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            z.f r1 = (z.f) r1
            int r3 = r1.e()
            int r5 = r18.e()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            int[] r3 = r0.f24072b
            int[] r5 = r0.f24073c
            long[] r6 = r0.f24071a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6a
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L65
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L63
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L4e
            r14 = r2
            goto L4f
        L4e:
            r14 = r4
        L4f:
            if (r14 == 0) goto L5f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r14 == r15) goto L5f
            return r4
        L5f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r8 == r7) goto L6a
            int r8 = r8 + 1
            goto L27
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.f24075e == 0;
    }

    public int hashCode() {
        int[] iArr = this.f24072b;
        int[] iArr2 = this.f24073c;
        long[] jArr = this.f24071a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            iHashCode += Integer.hashCode(iArr2[i14]) ^ Integer.hashCode(iArr[i14]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 == length) {
                    i10 = iHashCode;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[PHI: r8
  0x0075: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r18.f()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            int[] r2 = r0.f24072b
            int[] r3 = r0.f24073c
            long[] r4 = r0.f24071a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7a
            r6 = 0
            r7 = r6
            r8 = r7
        L23:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L75
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3d:
            if (r13 >= r11) goto L73
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L4a
            r14 = 1
            goto L4b
        L4a:
            r14 = r6
        L4b:
            if (r14 == 0) goto L6f
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f24075e
            if (r8 >= r14) goto L6f
            r14 = 44
            r1.append(r14)
            r14 = 32
            r1.append(r14)
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L73:
            if (r11 != r12) goto L7a
        L75:
            if (r7 == r5) goto L7a
            int r7 = r7 + 1
            goto L23
        L7a:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            ae.r.e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.toString():java.lang.String");
    }
}
