package okhttp3;

import ae.r;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RealConnectionPool f16767a;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i10, long j10, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f17146i, i10, j10, timeUnit));
        r.f(timeUnit, "timeUnit");
    }

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        r.f(realConnectionPool, "delegate");
        this.f16767a = realConnectionPool;
    }

    public final RealConnectionPool a() {
        return this.f16767a;
    }
}
