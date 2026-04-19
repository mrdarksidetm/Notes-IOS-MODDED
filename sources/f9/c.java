package f9;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f11168a;

    public c(Runnable runnable, int i10) {
        this.f11168a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f11168a.run();
    }
}
