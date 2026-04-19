package le;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<?> f15086a;

    public l(Future<?> future) {
        this.f15086a = future;
    }

    @Override // le.n
    public void e(Throwable th) {
        if (th != null) {
            this.f15086a.cancel(false);
        }
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        e(th);
        return md.i0.f15558a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f15086a + ']';
    }
}
