package ca;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: loaded from: classes2.dex */
final class y0 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f6781a;

    y0(w0 w0Var, RecaptchaAction recaptchaAction) {
        this.f6781a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f6781a);
        }
        Exception exc = (Exception) w8.m.k(task.getException());
        if (!(exc instanceof x0)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
