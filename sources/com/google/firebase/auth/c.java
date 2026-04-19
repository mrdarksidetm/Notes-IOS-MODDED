package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: loaded from: classes2.dex */
final class c implements Continuation<RecaptchaTasksClient, Task<Void>> {
    c(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new ba.q("INTERNAL_ERROR", zzag.zzb(exception != null ? exception.getMessage() : "")));
    }
}
