package w2;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final long a(float f10, long j10) {
        return g(j10, f10);
    }

    public static final void b(long j10) {
        if (!(!f(j10))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    public static final long c(double d10) {
        return g(4294967296L, (float) d10);
    }

    public static final long d(float f10) {
        return g(4294967296L, f10);
    }

    public static final long e(int i10) {
        return g(4294967296L, i10);
    }

    public static final boolean f(long j10) {
        return t.f(j10) == 0;
    }

    public static final long g(long j10, float f10) {
        return t.c(j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }
}
