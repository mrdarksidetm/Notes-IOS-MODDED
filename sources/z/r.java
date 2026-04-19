package z;

/* JADX INFO: loaded from: classes.dex */
public final class r extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24101e;

    public r(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        g(z.e(i10));
    }

    private final void e() {
        this.f24101e = z.a(b()) - this.f24085d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = z.f24117a;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            nd.o.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f24082a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    private final void g(int i10) {
        int iMax = i10 > 0 ? Math.max(7, z.d(i10)) : 0;
        this.f24084c = iMax;
        f(iMax);
        this.f24083b = new int[iMax];
    }
}
