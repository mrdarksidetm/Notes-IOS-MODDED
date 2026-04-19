package ca;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes2.dex */
final class s0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w0 f6744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f6745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Continuation f6746d;

    s0(String str, w0 w0Var, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f6743a = str;
        this.f6744b = w0Var;
        this.f6745c = recaptchaAction;
        this.f6746d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzadg.zzc((Exception) w8.m.k(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f6743a);
        }
        return this.f6744b.b(this.f6743a, Boolean.TRUE, this.f6745c).continueWithTask(this.f6746d);
    }
}
