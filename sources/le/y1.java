package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class y1 extends c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15126f = AtomicIntegerFieldUpdater.newUpdater(y1.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.l<Throwable, md.i0> f15127e;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(zd.l<? super Throwable, md.i0> lVar) {
        this.f15127e = lVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        r(th);
        return md.i0.f15558a;
    }

    @Override // le.e0
    public void r(Throwable th) {
        if (f15126f.compareAndSet(this, 0, 1)) {
            this.f15127e.invoke(th);
        }
    }
}
