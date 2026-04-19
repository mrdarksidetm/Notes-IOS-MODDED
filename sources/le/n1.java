package le;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qe.h0 f15090a = new qe.h0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qe.h0 f15091b = new qe.h0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
