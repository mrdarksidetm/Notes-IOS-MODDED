package t0;

/* JADX INFO: loaded from: classes.dex */
public interface i1 extends s0, k1<Integer> {
    @Override // t0.s0
    int e();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t0.p3
    default Integer getValue() {
        return Integer.valueOf(e());
    }

    void k(int i10);

    @Override // t0.k1
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        t(num.intValue());
    }

    default void t(int i10) {
        k(i10);
    }
}
