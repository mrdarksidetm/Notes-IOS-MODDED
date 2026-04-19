package a2;

/* JADX INFO: loaded from: classes.dex */
final class p {
    public static final int a(long j10, long j11) {
        boolean zD = d(j10);
        return zD != d(j11) ? zD ? -1 : 1 : (int) Math.signum(c(j10) - c(j11));
    }

    public static long b(long j10) {
        return j10;
    }

    public static final float c(long j10) {
        ae.l lVar = ae.l.f718a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean d(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }
}
