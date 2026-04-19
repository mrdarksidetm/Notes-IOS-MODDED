package z;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f24108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24110e;

    private w() {
        this.f24106a = z.f24117a;
        this.f24107b = a0.a.f16c;
        this.f24108c = j.a();
    }

    public /* synthetic */ w(ae.j jVar) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f24109d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f24106a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L50
            r11 = r12
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 == 0) goto L6c
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f24107b
            r15 = r15[r11]
            boolean r15 = ae.r.b(r15, r1)
            if (r15 == 0) goto L66
            return r11
        L66:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L6c:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L77
            r1 = -1
            return r1
        L77:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: z.w.a(java.lang.Object):int");
    }

    public final int b(K k10) {
        int iA = a(k10);
        if (iA >= 0) {
            return this.f24108c[iA];
        }
        throw new NoSuchElementException("There is no key " + k10 + " in the map");
    }

    public final int c() {
        return this.f24109d;
    }

    public final int d(K k10, int i10) {
        int iA = a(k10);
        return iA >= 0 ? this.f24108c[iA] : i10;
    }

    public final int e() {
        return this.f24110e;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            boolean r3 = r1 instanceof z.w
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            z.w r1 = (z.w) r1
            int r3 = r1.e()
            int r5 = r18.e()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f24107b
            int[] r5 = r0.f24108c
            long[] r6 = r0.f24106a
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
            int r15 = r1.b(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: z.w.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.f24110e == 0;
    }

    public final boolean g() {
        return this.f24110e != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f24107b;
        int[] iArr = this.f24108c;
        long[] jArr = this.f24106a;
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
                            Object obj = objArr[i14];
                            iHashCode += Integer.hashCode(iArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r8
  0x0079: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r2 = r0.f24107b
            int[] r3 = r0.f24108c
            long[] r4 = r0.f24106a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7e
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
            if (r11 == 0) goto L79
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3d:
            if (r13 >= r11) goto L77
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
            if (r14 == 0) goto L73
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L58
            java.lang.String r15 = "(this)"
        L58:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f24110e
            if (r8 >= r14) goto L73
            r14 = 44
            r1.append(r14)
            r14 = 32
            r1.append(r14)
        L73:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L77:
            if (r11 != r12) goto L7e
        L79:
            if (r7 == r5) goto L7e
            int r7 = r7 + 1
            goto L23
        L7e:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            ae.r.e(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.w.toString():java.lang.String");
    }
}
