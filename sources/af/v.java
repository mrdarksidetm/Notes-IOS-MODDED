package af;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f832e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f833f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.f f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.p<ye.f, Integer, Boolean> f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f837d;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(ye.f fVar, zd.p<? super ye.f, ? super Integer, Boolean> pVar) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(pVar, "readIfAbsent");
        this.f834a = fVar;
        this.f835b = pVar;
        int iF = fVar.f();
        if (iF <= 64) {
            this.f836c = iF != 64 ? (-1) << iF : 0L;
            this.f837d = f833f;
        } else {
            this.f836c = 0L;
            this.f837d = e(iF);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f837d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f837d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f837d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f835b.invoke(this.f834a, Integer.valueOf(i13)).booleanValue()) {
                    this.f837d[i10] = j10;
                    return i13;
                }
            }
            this.f837d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[nd.p.P(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f836c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iF = this.f834a.f();
        do {
            long j10 = this.f836c;
            if (j10 == -1) {
                if (iF > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f836c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f835b.invoke(this.f834a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
