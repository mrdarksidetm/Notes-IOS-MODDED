package se;

import ge.o;
import java.util.concurrent.Executor;
import le.j0;
import le.p1;
import qe.i0;
import qe.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p1 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20557d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f20558e = m.f20578c.j0(k0.e("kotlinx.coroutines.io.parallelism", o.d(64, i0.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g0(qd.h.f19040a, runnable);
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        f20558e.g0(gVar, runnable);
    }

    @Override // le.j0
    public void h0(qd.g gVar, Runnable runnable) {
        f20558e.h0(gVar, runnable);
    }

    @Override // le.j0
    public j0 j0(int i10) {
        return m.f20578c.j0(i10);
    }

    @Override // le.j0
    public String toString() {
        return "Dispatchers.IO";
    }
}
