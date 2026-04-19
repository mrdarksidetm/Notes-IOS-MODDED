package w2;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final long a(float f10, float f11) {
        return j.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(float f10, float f11) {
        return k.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
