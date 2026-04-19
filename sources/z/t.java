package z;

/* JADX INFO: loaded from: classes.dex */
public final class t<K> extends w<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24103f;

    public t() {
        this(0, 1, null);
    }

    public t(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        m(z.e(i10));
    }

    public /* synthetic */ t(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f24109d > 8) {
            Long.compare(md.c0.b(md.c0.b(this.f24110e) * 32) ^ Long.MIN_VALUE, md.c0.b(md.c0.b(this.f24109d) * 25) ^ Long.MIN_VALUE);
        }
        p(z.c(this.f24109d));
    }

    private final int i(int i10) {
        int i11 = this.f24109d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24106a;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r1 = i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r20.f24103f != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (((r20.f24106a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L24;
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
    
        h();
        r1 = i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r20.f24110e++;
        r2 = r20.f24103f;
        r3 = r20.f24106a;
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
    
        r20.f24103f = r2 - r19;
        r3[r4] = (r7 & (~(255 << r9))) | (r10 << r9);
        r2 = r20.f24109d;
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
    private final int j(K r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.t.j(java.lang.Object):int");
    }

    private final void k() {
        this.f24103f = z.a(c()) - this.f24110e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = z.f24117a;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f24106a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    private final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, z.d(i10)) : 0;
        this.f24109d = iMax;
        l(iMax);
        this.f24107b = new Object[iMax];
        this.f24108c = new int[iMax];
    }

    private final void p(int i10) {
        int i11;
        long[] jArr = this.f24106a;
        Object[] objArr = this.f24107b;
        int[] iArr = this.f24108c;
        int i12 = this.f24109d;
        m(i10);
        Object[] objArr2 = this.f24107b;
        int[] iArr2 = this.f24108c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int i15 = i(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f24106a;
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                i11 = i13;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                int i18 = this.f24109d;
                int i19 = ((i15 - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (j10 << i21);
                objArr2[i15] = obj;
                iArr2[i15] = iArr[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final int n(K k10, int i10, int i11) {
        int iJ = j(k10);
        if (iJ < 0) {
            iJ = ~iJ;
        } else {
            i11 = this.f24108c[iJ];
        }
        this.f24107b[iJ] = k10;
        this.f24108c[iJ] = i10;
        return i11;
    }

    public final void o(int i10) {
        this.f24110e--;
        long[] jArr = this.f24106a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f24109d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f24107b[i10] = null;
    }

    public final void q(K k10, int i10) {
        int iJ = j(k10);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.f24107b[iJ] = k10;
        this.f24108c[iJ] = i10;
    }
}
