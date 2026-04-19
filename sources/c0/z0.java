package c0;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f6256a = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        return q0.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final float b() {
        return f6256a;
    }
}
