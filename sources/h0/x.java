package h0;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static long a(int i10, int i11, int i12, int i13) {
        return b(w2.c.a(i10, i11, i12, i13));
    }

    private static long b(long j10) {
        return j10;
    }

    public static long c(long j10, v vVar) {
        v vVar2 = v.Horizontal;
        return a(vVar == vVar2 ? w2.b.p(j10) : w2.b.o(j10), vVar == vVar2 ? w2.b.n(j10) : w2.b.m(j10), vVar == vVar2 ? w2.b.o(j10) : w2.b.p(j10), vVar == vVar2 ? w2.b.m(j10) : w2.b.n(j10));
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13);
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = w2.b.p(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = w2.b.n(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = w2.b.o(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = w2.b.m(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static final long f(long j10, v vVar) {
        int iO;
        int iM;
        int iP;
        int iN;
        if (vVar == v.Horizontal) {
            iO = w2.b.p(j10);
            iM = w2.b.n(j10);
            iP = w2.b.o(j10);
            iN = w2.b.m(j10);
        } else {
            iO = w2.b.o(j10);
            iM = w2.b.m(j10);
            iP = w2.b.p(j10);
            iN = w2.b.n(j10);
        }
        return w2.c.a(iO, iM, iP, iN);
    }
}
