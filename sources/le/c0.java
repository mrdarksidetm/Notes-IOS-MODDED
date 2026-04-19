package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14989b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14990a;

    public c0(Throwable th, boolean z10) {
        this.f14990a = th;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ c0(Throwable th, boolean z10, int i10, ae.j jVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean a() {
        return f14989b.get(this) != 0;
    }

    public final boolean b() {
        return f14989b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return r0.a(this) + '[' + this.f14990a + ']';
    }
}
