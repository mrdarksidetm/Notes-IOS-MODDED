package z;

/* JADX INFO: loaded from: classes.dex */
public final class u<K, V> extends y<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24104f;

    public u(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        m(z.e(i10));
    }

    public /* synthetic */ u(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void g() {
        if (this.f24115d > 8) {
            Long.compare(md.c0.b(md.c0.b(this.f24116e) * 32) ^ Long.MIN_VALUE, md.c0.b(md.c0.b(this.f24115d) * 25) ^ Long.MIN_VALUE);
        }
        p(z.c(this.f24115d));
    }

    private final int i(int i10) {
        int i11 = this.f24115d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24112a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void k() {
        this.f24104f = z.a(c()) - this.f24116e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = z.f24117a;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f24112a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    private final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, z.d(i10)) : 0;
        this.f24115d = iMax;
        l(iMax);
        this.f24113b = new Object[iMax];
        this.f24114c = new Object[iMax];
    }

    private final void p(int i10) {
        int i11;
        long[] jArr = this.f24112a;
        Object[] objArr = this.f24113b;
        Object[] objArr2 = this.f24114c;
        int i12 = this.f24115d;
        m(i10);
        Object[] objArr3 = this.f24113b;
        Object[] objArr4 = this.f24114c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int i15 = i(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f24112a;
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                i11 = i13;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                int i18 = this.f24115d;
                int i19 = ((i15 - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (j10 << i21);
                objArr3[i15] = obj;
                objArr4[i15] = objArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final void h() {
        this.f24116e = 0;
        long[] jArr = this.f24112a;
        if (jArr != z.f24117a) {
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f24112a;
            int i10 = this.f24115d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        nd.o.q(this.f24114c, null, 0, this.f24115d);
        nd.o.q(this.f24113b, null, 0, this.f24115d);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r1 = i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r20.f24104f != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (((r20.f24112a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r2 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        g();
        r1 = i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r20.f24116e++;
        r2 = r20.f24104f;
        r3 = r20.f24112a;
        r4 = r1 >> 3;
        r7 = r3[r4];
        r9 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r20.f24104f = r2 - r19;
        r3[r4] = (r7 & (~(255 << r9))) | (r10 << r9);
        r2 = r20.f24115d;
        r4 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r2] = ((~(255 << r4)) & r3[r2]) | (r10 << r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        return ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(K r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.j(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V n(K r18) {
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
            int r5 = r0.f24115d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f24112a
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
            java.lang.Object[] r15 = r0.f24113b
            r15 = r15[r11]
            boolean r15 = ae.r.b(r15, r1)
            if (r15 == 0) goto L66
            goto L76
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
            if (r7 == 0) goto L7f
            r11 = -1
        L76:
            if (r11 < 0) goto L7d
            java.lang.Object r1 = r0.o(r11)
            return r1
        L7d:
            r1 = 0
            return r1
        L7f:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.n(java.lang.Object):java.lang.Object");
    }

    public final V o(int i10) {
        this.f24116e--;
        long[] jArr = this.f24112a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f24115d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f24113b[i10] = null;
        Object[] objArr = this.f24114c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void q(K k10, V v10) {
        int iJ = j(k10);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.f24113b[iJ] = k10;
        this.f24114c[iJ] = v10;
    }
}
