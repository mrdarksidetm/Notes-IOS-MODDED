package t0;

/* JADX INFO: loaded from: classes.dex */
public interface h1 extends m0, k1<Float> {
    @Override // t0.m0
    float b();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t0.p3
    default Float getValue() {
        return Float.valueOf(b());
    }

    void h(float f10);

    @Override // t0.k1
    /* bridge */ /* synthetic */ default void setValue(Float f10) {
        u(f10.floatValue());
    }

    default void u(float f10) {
        h(f10);
    }
}
