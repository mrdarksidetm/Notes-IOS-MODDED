package ca;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f6624b = "c";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f6625c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6626a;

    private c() {
    }

    public static c a() {
        return f6625c;
    }

    private final void g(FirebaseAuth firebaseAuth, h1 h1Var, Activity activity, TaskCompletionSource<m1> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new ba.t());
            return;
        }
        p0.d(firebaseAuth.i().l(), firebaseAuth);
        w8.m.k(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (y.b().h(activity, taskCompletionSource2)) {
            new zzaep(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzadg.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new n1(this, taskCompletionSource)).addOnFailureListener(new k1(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11, final h1 h1Var, final TaskCompletionSource<m1> taskCompletionSource) {
        if (!z10 || z11) {
            g(firebaseAuth, h1Var, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f6626a) ? Tasks.forResult(new zzagh(this.f6626a)) : firebaseAuth.I()).continueWithTask(firebaseAuth.C0(), new l1(this, str, IntegrityManagerFactory.create(firebaseAuth.i().l()))).addOnCompleteListener(new OnCompleteListener() { // from class: ca.d0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f6636a.e(taskCompletionSource, firebaseAuth, h1Var, activity, task);
                }
            });
        }
    }

    public static boolean i(Exception exc) {
        if (exc instanceof ba.t) {
            return true;
        }
        return (exc instanceof ba.q) && ((ba.q) exc).a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    public final Task<m1> b(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z10, boolean z11, boolean z12, final RecaptchaAction recaptchaAction) {
        p1 t1Var;
        h hVar = (h) firebaseAuth.l();
        final h1 h1VarF = h1.f();
        if (!zzafb.zza(firebaseAuth.i()) && !hVar.h()) {
            String str2 = f6624b;
            Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z11 + ", ForceRecaptchav2Flow from firebaseSettings = " + hVar.f());
            boolean z13 = z11 || hVar.f();
            final TaskCompletionSource<m1> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> taskE = h1VarF.e();
            if (taskE != null) {
                if (taskE.isSuccessful()) {
                    t1Var = new t1().d(taskE.getResult());
                } else {
                    Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + taskE.getException().getMessage());
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (z13 || z12) {
                h(firebaseAuth, str, activity, z10, z13, h1VarF, taskCompletionSource);
            } else {
                final boolean z14 = false;
                firebaseAuth.p().addOnCompleteListener(new OnCompleteListener() { // from class: ca.b1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        this.f6611a.f(taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z10, z14, h1VarF, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        t1Var = new t1();
        return Tasks.forResult(t1Var.a());
    }

    final /* synthetic */ void e(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, h1 h1Var, Activity activity, Task task) {
        if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
            taskCompletionSource.setResult(new t1().b(((IntegrityTokenResponse) task.getResult()).token()).a());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f6624b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        g(firebaseAuth, h1Var, activity, taskCompletionSource);
    }

    final /* synthetic */ void f(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z10, boolean z11, h1 h1Var, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f6624b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.m0() == null || !firebaseAuth.m0().e("PHONE_PROVIDER")) {
            h(firebaseAuth, str, activity, z10, z11, h1Var, taskCompletionSource);
        } else {
            firebaseAuth.m0().b(firebaseAuth.n(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new i1(this, taskCompletionSource)).addOnFailureListener(new j1(this, firebaseAuth, str, activity, z10, z11, h1Var, taskCompletionSource));
        }
    }
}
