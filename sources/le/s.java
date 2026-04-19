package le;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15109c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed");
    private volatile int _resumed;

    public s(qd.d<?> dVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed = 0;
    }

    public final boolean c() {
        return f15109c.compareAndSet(this, 0, 1);
    }
}
