package c0;

/* JADX INFO: loaded from: classes.dex */
public interface f0 extends i<Float> {
    @Override // c0.i
    default <V extends q> r1<V> a(j1<Float, V> j1Var) {
        return new r1<>(this);
    }

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);
}
