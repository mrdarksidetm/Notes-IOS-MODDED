package bd;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f5714a;

    public interface a<T> {
        void a(Future<T> future);
    }

    public c(int i10) {
        this.f5714a = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(s9.g gVar, Callable callable) {
        if (gVar.isCancelled()) {
            return;
        }
        try {
            gVar.B(callable.call());
        } catch (Throwable th) {
            gVar.C(th);
        }
    }

    public <T> s9.d<T> e(final Callable<T> callable) {
        final s9.g gVarD = s9.g.D();
        this.f5714a.execute(new Runnable() { // from class: bd.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(gVarD, callable);
            }
        });
        return gVarD;
    }

    public <T> void f(Callable<T> callable, final a<T> aVar) {
        final s9.d<T> dVarE = e(callable);
        dVarE.a(new Runnable() { // from class: bd.a
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(dVarE);
            }
        }, d.a());
    }
}
