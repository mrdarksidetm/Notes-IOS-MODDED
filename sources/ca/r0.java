package ca;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Task<T> a(w0 w0Var, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> taskB = w0Var.b(str, Boolean.FALSE, recaptchaAction);
        return taskB.continueWithTask(continuation).continueWithTask(new s0(str, w0Var, recaptchaAction, continuation));
    }

    static /* synthetic */ Task b(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) w8.m.k(task.getException());
        if (zzadg.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.m0() == null) {
                firebaseAuth.f0(new w0(firebaseAuth.i(), firebaseAuth));
            }
            return a(firebaseAuth.m0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    public final Task<T> c(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: ca.t0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                r0 r0Var = this.f6747a;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) w8.m.k(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return r0Var.d(str3);
            }
        };
        w0 w0VarM0 = firebaseAuth.m0();
        return (w0VarM0 == null || !w0VarM0.e(str2)) ? (Task<T>) d(null).continueWithTask(new Continuation() { // from class: ca.q0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return r0.b(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : a(w0VarM0, recaptchaAction, str, continuation);
    }

    public abstract Task<T> d(String str);
}
