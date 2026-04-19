package ca;

import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Task<RecaptchaTasksClient>> f6768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zzagm f6769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    x9.f f6770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FirebaseAuth f6771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    v0 f6772f;

    public w0(x9.f fVar, FirebaseAuth firebaseAuth) {
        this(fVar, firebaseAuth, new u0());
    }

    private w0(x9.f fVar, FirebaseAuth firebaseAuth, v0 v0Var) {
        this.f6767a = new Object();
        this.f6768b = new HashMap();
        this.f6770d = fVar;
        this.f6771e = firebaseAuth;
        this.f6772f = v0Var;
    }

    static /* synthetic */ void c(w0 w0Var, zzagm zzagmVar, Task task, String str) {
        synchronized (w0Var.f6767a) {
            w0Var.f6769c = zzagmVar;
            w0Var.f6768b.put(str, task);
        }
    }

    private final Task<RecaptchaTasksClient> f(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.f6767a) {
            task = this.f6768b.get(str);
        }
        return task;
    }

    private static String g(String str) {
        return zzag.zzc(str) ? "*" : str;
    }

    public final Task<RecaptchaTasksClient> a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> taskF;
        String strG = g(str);
        return (bool.booleanValue() || (taskF = f(strG)) == null) ? this.f6771e.W("RECAPTCHA_ENTERPRISE").continueWithTask(new z0(this, strG)) : taskF;
    }

    public final Task<String> b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strG = g(str);
        Task<RecaptchaTasksClient> taskF = f(strG);
        if (bool.booleanValue() || taskF == null) {
            taskF = a(strG, bool);
        }
        return taskF.continueWithTask(new y0(this, recaptchaAction));
    }

    public final boolean d(String str) {
        String strZzb;
        w8.m.k(str);
        zzagm zzagmVar = this.f6769c;
        if (zzagmVar == null || (strZzb = zzagmVar.zzb(str)) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }

    public final boolean e(String str) {
        boolean z10;
        synchronized (this.f6767a) {
            zzagm zzagmVar = this.f6769c;
            z10 = zzagmVar != null && zzagmVar.zzc(str);
        }
        return z10;
    }
}
