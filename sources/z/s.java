package z;

/* JADX INFO: loaded from: classes.dex */
public final class s extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24102e;

    public s(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        j(z.e(i10));
    }

    private final void e() {
        if (this.f24090c > 8) {
            Long.compare(md.c0.b(md.c0.b(this.f24091d) * 32) ^ Long.MIN_VALUE, md.c0.b(md.c0.b(this.f24090c) * 25) ^ Long.MIN_VALUE);
        }
        n(z.c(this.f24090c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r1 = g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r21.f24102e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r21.f24088a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r3 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        e();
        r1 = g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        r21.f24091d++;
        r2 = r21.f24102e;
        r3 = r21.f24088a;
        r6 = r1 >> 3;
        r7 = r3[r6];
        r11 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (((r7 >> r11) & 255) != 128) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r21.f24102e = r2 - r18;
        r3[r6] = (r7 & (~(255 << r11))) | (r9 << r11);
        r2 = r21.f24090c;
        r6 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r3[r2] = ((~(255 << r6)) & r3[r2]) | (r9 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int f(long r22) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.f(long):int");
    }

    private final int g(int i10) {
        int i11 = this.f24090c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24088a;
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

    private final void h() {
        this.f24102e = z.a(b()) - this.f24091d;
    }

    private final void i(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = z.f24117a;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f24088a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        h();
    }

    private final void j(int i10) {
        int iMax = i10 > 0 ? Math.max(7, z.d(i10)) : 0;
        this.f24090c = iMax;
        i(iMax);
        this.f24089b = new long[iMax];
    }

    private final void m(int i10) {
        this.f24091d--;
        long[] jArr = this.f24088a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f24090c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    private final void n(int i10) {
        int i11;
        long[] jArr = this.f24088a;
        long[] jArr2 = this.f24089b;
        int i12 = this.f24090c;
        j(i10);
        long[] jArr3 = this.f24089b;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iG = g(i14 >>> 7);
                long j11 = i14 & 127;
                long[] jArr4 = this.f24088a;
                int i15 = iG >> 3;
                int i16 = (iG & 7) << 3;
                i11 = i13;
                jArr4[i15] = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                int i17 = this.f24090c;
                int i18 = ((iG - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr4[i19] = ((~(255 << i20)) & jArr4[i19]) | (j11 << i20);
                jArr3[iG] = j10;
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final void k(long j10) {
        this.f24089b[f(j10)] = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f24090c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f24088a
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
            if (r10 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f24089b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6e
        L5e:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L64:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L77
            r10 = -1
        L6e:
            if (r10 < 0) goto L71
            r4 = r11
        L71:
            if (r4 == 0) goto L76
            r0.m(r10)
        L76:
            return r4
        L77:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.l(long):boolean");
    }
}
