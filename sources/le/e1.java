package le;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class e1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<?> f15014a;

    public e1(Future<?> future) {
        this.f15014a = future;
    }

    @Override // le.f1
    public void dispose() {
        this.f15014a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f15014a + ']';
    }
}
