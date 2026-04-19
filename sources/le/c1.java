package le;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class c1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f14991a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j0 j0Var = this.f14991a;
        qd.h hVar = qd.h.f19040a;
        if (j0Var.i0(hVar)) {
            this.f14991a.g0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f14991a.toString();
    }
}
