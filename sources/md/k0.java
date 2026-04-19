package md;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= c(0)) {
            return 0;
        }
        if (d10 >= c(-1)) {
            return -1;
        }
        return a0.b(d10 <= 2.147483647E9d ? (int) d10 : a0.b((int) (d10 - ((double) a.e.API_PRIORITY_OTHER))) + a0.b(a.e.API_PRIORITY_OTHER));
    }

    public static final int b(int i10, int i11) {
        return ae.r.g(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final double c(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    public static final int d(long j10, long j11) {
        return ae.r.h(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double e(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    public static final String f(long j10) {
        return g(j10, 10);
    }

    public static final String g(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, je.b.a(i10));
            ae.r.e(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, je.b.a(i10));
        ae.r.e(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, je.b.a(i10));
        ae.r.e(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
