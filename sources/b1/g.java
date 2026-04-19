package b1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f5172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f5173c;

    public g(int i10, long[] jArr, Object[] objArr) {
        this.f5171a = i10;
        this.f5172b = jArr;
        this.f5173c = objArr;
    }

    private final int a(long j10) {
        int i10 = this.f5171a - 1;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 == 0) {
            long j11 = this.f5172b[0];
            if (j11 == j10) {
                return 0;
            }
            return j11 > j10 ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j12 = this.f5172b[i12] - j10;
            if (j12 < 0) {
                i11 = i12 + 1;
            } else {
                if (j12 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final Object b(long j10) {
        int iA = a(j10);
        if (iA >= 0) {
            return this.f5173c[iA];
        }
        return null;
    }

    public final g c(long j10, Object obj) {
        int i10 = this.f5171a;
        Object[] objArr = this.f5173c;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] != null) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                if (i11 >= i14 || i15 >= i10) {
                    break;
                }
                long j11 = this.f5172b[i15];
                Object obj2 = this.f5173c[i15];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i11] = j11;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr[i16] = j10;
                objArr2[i16] = obj;
            } else {
                while (i11 < i14) {
                    long j12 = this.f5172b[i15];
                    Object obj3 = this.f5173c[i15];
                    if (obj3 != null) {
                        jArr[i11] = j12;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr2[0] = obj;
        }
        return new g(i14, jArr, objArr2);
    }

    public final boolean d(long j10, Object obj) {
        int iA = a(j10);
        if (iA < 0) {
            return false;
        }
        this.f5173c[iA] = obj;
        return true;
    }
}
