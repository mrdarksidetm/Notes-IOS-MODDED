package t0;

/* JADX INFO: loaded from: classes.dex */
public interface j1 extends b1, k1<Long> {
    @Override // t0.b1
    long a();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t0.p3
    default Long getValue() {
        return Long.valueOf(a());
    }

    void o(long j10);

    default void r(long j10) {
        o(j10);
    }

    @Override // t0.k1
    /* bridge */ /* synthetic */ default void setValue(Long l10) {
        r(l10.longValue());
    }
}
