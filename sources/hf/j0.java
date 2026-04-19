package hf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11990d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f11991e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11994c;

    public static final class a extends j0 {
        a() {
        }

        @Override // hf.j0
        public j0 d(long j10) {
            return this;
        }

        @Override // hf.j0
        public void f() {
        }

        @Override // hf.j0
        public j0 g(long j10, TimeUnit timeUnit) {
            ae.r.f(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }
    }

    public j0 a() {
        this.f11992a = false;
        return this;
    }

    public j0 b() {
        this.f11994c = 0L;
        return this;
    }

    public long c() {
        if (this.f11992a) {
            return this.f11993b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public j0 d(long j10) {
        this.f11992a = true;
        this.f11993b = j10;
        return this;
    }

    public boolean e() {
        return this.f11992a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f11992a && this.f11993b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j10, TimeUnit timeUnit) {
        ae.r.f(timeUnit, "unit");
        if (j10 >= 0) {
            this.f11994c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f11994c;
    }

    public final void i(Object obj) throws InterruptedIOException {
        ae.r.f(obj, "monitor");
        try {
            boolean zE = e();
            long jH = h();
            long jNanoTime = 0;
            if (!zE && jH == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zE && jH != 0) {
                jH = Math.min(jH, c() - jNanoTime2);
            } else if (zE) {
                jH = c() - jNanoTime2;
            }
            if (jH > 0) {
                long j10 = jH / 1000000;
                obj.wait(j10, (int) (jH - (1000000 * j10)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jH) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
