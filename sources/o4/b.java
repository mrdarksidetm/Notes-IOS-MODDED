package o4;

import java.io.Closeable;
import le.g2;
import le.n0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable, n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f16345a;

    public b(qd.g gVar) {
        this.f16345a = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g2.f(getCoroutineContext(), null, 1, null);
    }

    @Override // le.n0
    public qd.g getCoroutineContext() {
        return this.f16345a;
    }
}
