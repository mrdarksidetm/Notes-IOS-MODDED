package w2;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final long a(float f10, float f11) {
        return w.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
