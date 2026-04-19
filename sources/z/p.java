package z;

/* JADX INFO: loaded from: classes.dex */
public final class p extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24099f;

    public p(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        l(z.e(i10));
    }

    public /* synthetic */ p(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void g() {
        if (this.f24074d > 8) {
            Long.compare(md.c0.b(md.c0.b(this.f24075e) * 32) ^ Long.MIN_VALUE, md.c0.b(md.c0.b(this.f24074d) * 25) ^ Long.MIN_VALUE);
        }
        m(z.c(this.f24074d));
    }

    private final int h(int i10) {
        int i11 = this.f24074d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24071a;
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        r1 = h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r19.f24099f != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        if (((r19.f24071a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r3 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        g();
        r1 = h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        r19.f24075e++;
        r2 = r19.f24099f;
        r6 = r19.f24071a;
        r7 = r1 >> 3;
        r11 = r6[r7];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (((r11 >> r8) & 255) != 128) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        r19.f24099f = r2 - r18;
        r6[r7] = ((~(255 << r8)) & r11) | (r9 << r8);
        r2 = r19.f24074d;
        r3 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r6[r2] = ((~(255 << r3)) & r6[r2]) | (r9 << r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        return ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int i(int r20) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.p.i(int):int");
    }

    private final void j() {
        this.f24099f = z.a(d()) - this.f24075e;
    }

    private final void k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = z.f24117a;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f24071a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        j();
    }

    private final void l(int i10) {
        int iMax = i10 > 0 ? Math.max(7, z.d(i10)) : 0;
        this.f24074d = iMax;
        k(iMax);
        this.f24072b = new int[iMax];
        this.f24073c = new int[iMax];
    }

    private final void m(int i10) {
        int i11;
        long[] jArr = this.f24071a;
        int[] iArr = this.f24072b;
        int[] iArr2 = this.f24073c;
        int i12 = this.f24074d;
        l(i10);
        int[] iArr3 = this.f24072b;
        int[] iArr4 = this.f24073c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iH = h(i15 >>> 7);
                long j10 = i15 & 127;
                long[] jArr2 = this.f24071a;
                int i16 = iH >> 3;
                int i17 = (iH & 7) << 3;
                i11 = i13;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                int i18 = this.f24074d;
                int i19 = ((iH - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (j10 << i21);
                iArr3[iH] = i14;
                iArr4[iH] = iArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final void n(int i10, int i11) {
        int i12 = i(i10);
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f24072b[i12] = i10;
        this.f24073c[i12] = i11;
    }
}
