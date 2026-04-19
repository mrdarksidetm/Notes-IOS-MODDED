package w8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f22646a = new f0();

    public interface a<R extends u8.h, T> {
        T a(R r10);
    }

    public static <R extends u8.h, T> Task<T> a(u8.d<R> dVar, a<R, T> aVar) {
        i0 i0Var = f22646a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        dVar.addStatusListener(new g0(dVar, taskCompletionSource, aVar, i0Var));
        return taskCompletionSource.getTask();
    }

    public static <R extends u8.h> Task<Void> b(u8.d<R> dVar) {
        return a(dVar, new h0());
    }
}
