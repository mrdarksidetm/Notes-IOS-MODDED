package w2;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final long a(int i10, int i11) {
        return n.e((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10, long j11) {
        return k1.g.a(k1.f.o(j10) - n.j(j11), k1.f.p(j10) - n.k(j11));
    }

    public static final long c(long j10, long j11) {
        return k1.g.a(k1.f.o(j10) + n.j(j11), k1.f.p(j10) + n.k(j11));
    }
}
