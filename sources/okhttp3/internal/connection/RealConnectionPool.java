package okhttp3.internal.connection;

import ae.j;
import ae.r;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import md.i0;
import okhttp3.Address;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class RealConnectionPool {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f17239f = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskQueue f17242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RealConnectionPool$cleanupTask$1 f17243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<RealConnection> f17244e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i10, long j10, TimeUnit timeUnit) {
        r.f(taskRunner, "taskRunner");
        r.f(timeUnit, "timeUnit");
        this.f17240a = i10;
        this.f17241b = timeUnit.toNanos(j10);
        this.f17242c = taskRunner.i();
        final String strM = r.m(Util.f17029i, " ConnectionPool");
        this.f17243d = new Task(strM) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                return this.f17245e.b(System.nanoTime());
            }
        };
        this.f17244e = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(r.m("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
        }
    }

    private final int d(RealConnection realConnection, long j10) {
        if (Util.f17028h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> listN = realConnection.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference<RealCall> reference = listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Platform.f17567a.g().m("A connection to " + realConnection.A().a().l() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).a());
                listN.remove(i10);
                realConnection.D(true);
                if (listN.isEmpty()) {
                    realConnection.C(j10 - this.f17241b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    public final boolean a(Address address, RealCall realCall, List<Route> list, boolean z10) {
        r.f(address, "address");
        r.f(realCall, "call");
        for (RealConnection realConnection : this.f17244e) {
            r.e(realConnection, "connection");
            synchronized (realConnection) {
                if (z10) {
                    if (!realConnection.v()) {
                    }
                    i0 i0Var = i0.f15558a;
                }
                if (realConnection.t(address, list)) {
                    realCall.d(realConnection);
                    return true;
                }
                i0 i0Var2 = i0.f15558a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        for (RealConnection realConnection2 : this.f17244e) {
            r.e(realConnection2, "connection");
            synchronized (realConnection2) {
                if (d(realConnection2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jO = j10 - realConnection2.o();
                    if (jO > j11) {
                        realConnection = realConnection2;
                        j11 = jO;
                    }
                    i0 i0Var = i0.f15558a;
                }
            }
        }
        long j12 = this.f17241b;
        if (j11 < j12 && i10 <= this.f17240a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        r.c(realConnection);
        synchronized (realConnection) {
            if (!realConnection.n().isEmpty()) {
                return 0L;
            }
            if (realConnection.o() + j11 != j10) {
                return 0L;
            }
            realConnection.D(true);
            this.f17244e.remove(realConnection);
            Util.m(realConnection.E());
            if (this.f17244e.isEmpty()) {
                this.f17242c.a();
            }
            return 0L;
        }
    }

    public final boolean c(RealConnection realConnection) {
        r.f(realConnection, "connection");
        if (Util.f17028h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        if (!realConnection.p() && this.f17240a != 0) {
            TaskQueue.j(this.f17242c, this.f17243d, 0L, 2, null);
            return false;
        }
        realConnection.D(true);
        this.f17244e.remove(realConnection);
        if (!this.f17244e.isEmpty()) {
            return true;
        }
        this.f17242c.a();
        return true;
    }

    public final void e(RealConnection realConnection) {
        r.f(realConnection, "connection");
        if (!Util.f17028h || Thread.holdsLock(realConnection)) {
            this.f17244e.add(realConnection);
            TaskQueue.j(this.f17242c, this.f17243d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
    }
}
