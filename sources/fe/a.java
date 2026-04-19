package fe;

import ae.r;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ee.a {
    @Override // ee.c
    public long f(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // ee.a
    public Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        r.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
