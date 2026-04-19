package wa;

import com.google.android.gms.internal.mlkit_common.zzbg;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class g extends zzbg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f22687b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f22688a;

    public g() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: wa.r
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: wa.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c(runnable);
                    }
                });
            }
        });
        this.f22688a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void c(Runnable runnable) {
        f22687b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Deque deque, Runnable runnable) {
        w8.m.k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f22687b.get();
        if (deque == null || deque.size() > 1) {
            this.f22688a.execute(new Runnable() { // from class: wa.q
                @Override // java.lang.Runnable
                public final void run() {
                    g.d((Deque) g.f22687b.get(), runnable);
                }
            });
        } else {
            d(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, com.google.android.gms.internal.mlkit_common.zzai
    protected final /* synthetic */ Object zza() {
        return this.f22688a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg
    protected final ExecutorService zzb() {
        return this.f22688a;
    }
}
