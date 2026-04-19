package y1;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public static final long a(float f10, float f11) {
        return y0.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10, long j11) {
        return k1.m.a(k1.l.i(j10) * y0.b(j11), k1.l.g(j10) * y0.c(j11));
    }
}
