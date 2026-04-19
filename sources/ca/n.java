package ca;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class n implements Continuation<ba.c0, Task<ba.l0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ k f6719a;

    n(k kVar) {
        this.f6719a = kVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<ba.l0> then(Task<ba.c0> task) {
        return !task.isSuccessful() ? Tasks.forException(task.getException()) : Tasks.forResult(r.x(task.getResult().g(), this.f6719a.f6706a));
    }
}
