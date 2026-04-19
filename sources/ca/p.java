package ca;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class p implements Continuation<ba.i, Task<ba.i>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ m f6723a;

    p(m mVar) {
        this.f6723a = mVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<ba.i> then(Task<ba.i> task) {
        if (this.f6723a.f6715d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            ba.i result = task.getResult();
            return Tasks.forResult(new c2((g) result.s(), (a2) result.p(), this.f6723a.f6715d));
        }
        Exception exception = task.getException();
        if (exception instanceof ba.x) {
            ((ba.x) exception).d(this.f6723a.f6715d);
        }
        return Tasks.forException(exception);
    }
}
