package s9;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
