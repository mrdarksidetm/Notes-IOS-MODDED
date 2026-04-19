package y1;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    static /* synthetic */ k1.h M(r rVar, r rVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return rVar.A(rVar2, z10);
    }

    k1.h A(r rVar, boolean z10);

    long L(r rVar, long j10);

    r S();

    long U(long j10);

    long a();

    long p(long j10);

    boolean v();
}
