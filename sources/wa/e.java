package wa;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f22681b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f22682c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22683a;

    private e(Looper looper) {
        this.f22683a = new zza(looper);
    }

    public static e a() {
        e eVar;
        synchronized (f22681b) {
            if (f22682c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f22682c = new e(handlerThread.getLooper());
            }
            eVar = f22682c;
        }
        return eVar;
    }

    public static Executor d() {
        return p.f22734a;
    }

    public <ResultT> Task<ResultT> b(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new Runnable() { // from class: wa.o
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (sa.a e10) {
                    taskCompletionSource2.setException(e10);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(new sa.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
