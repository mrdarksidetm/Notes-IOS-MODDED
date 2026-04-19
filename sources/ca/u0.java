package ca;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: loaded from: classes2.dex */
final class u0 implements v0 {
    u0() {
    }

    @Override // ca.v0
    public final Task<RecaptchaTasksClient> a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
