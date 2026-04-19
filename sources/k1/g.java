package k1;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final long a(float f10, float f11) {
        return f.g((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        float fO = f.o(j10);
        if ((Float.isInfinite(fO) || Float.isNaN(fO)) ? false : true) {
            float fP = f.p(j10);
            if ((Float.isInfinite(fP) || Float.isNaN(fP)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j10) {
        return j10 != f.f14338b.b();
    }

    public static final boolean d(long j10) {
        return j10 == f.f14338b.b();
    }
}
