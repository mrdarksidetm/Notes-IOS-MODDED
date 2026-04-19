package ee;

import ae.r;
import ge.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final String a(Object obj, Object obj2) {
        r.f(obj, "from");
        r.f(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final long d(c cVar, l lVar) {
        r.f(cVar, "<this>");
        r.f(lVar, "range");
        if (!lVar.isEmpty()) {
            long jN = lVar.n();
            long jL = lVar.l();
            return jN < Long.MAX_VALUE ? cVar.f(jL, lVar.n() + 1) : jL > Long.MIN_VALUE ? cVar.f(lVar.l() - 1, lVar.n()) + 1 : cVar.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + lVar);
    }

    public static final int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
