package l3;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14733b;

        /* JADX INFO: renamed from: l3.h$a$a, reason: collision with other inner class name */
        private static class C0341a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f14734a;

            C0341a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f14734a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f14734a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f14732a = str;
            this.f14733b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0341a(runnable, this.f14732a, this.f14733b);
        }
    }

    private static class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<T> f14735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n3.a<T> f14736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f14737c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n3.a f14738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f14739b;

            a(n3.a aVar, Object obj) {
                this.f14738a = aVar;
                this.f14739b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f14738a.accept(this.f14739b);
            }
        }

        b(Handler handler, Callable<T> callable, n3.a<T> aVar) {
            this.f14735a = callable;
            this.f14736b = aVar;
            this.f14737c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f14735a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f14737c.post(new a(this.f14736b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, n3.a<T> aVar) {
        executor.execute(new b(l3.b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
