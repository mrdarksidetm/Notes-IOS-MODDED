package v8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static void a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    public static <ResultT> void b(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.B()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(w8.a.a(status));
        }
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.B() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(w8.a.a(status));
    }
}
