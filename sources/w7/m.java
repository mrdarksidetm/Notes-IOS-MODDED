package w7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22572a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f22573a;

        a(Runnable runnable) {
            this.f22573a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22573a.run();
            } catch (Exception e10) {
                a8.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f22572a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22572a.execute(new a(runnable));
    }
}
