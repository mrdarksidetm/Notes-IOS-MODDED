package ca;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: loaded from: classes2.dex */
public interface v0 {
    Task<RecaptchaTasksClient> a(Application application, String str);
}
