package wa;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
enum p implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e.a().f22683a.post(runnable);
    }
}
