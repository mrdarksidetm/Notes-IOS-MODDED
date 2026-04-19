package ca;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class i0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f6690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<ba.i> f6691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseAuth f6692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba.a0 f6693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y f6694e;

    i0(y yVar, Activity activity, TaskCompletionSource<ba.i> taskCompletionSource, FirebaseAuth firebaseAuth, ba.a0 a0Var) {
        this.f6694e = yVar;
        this.f6690a = new WeakReference<>(activity);
        this.f6691b = taskCompletionSource;
        this.f6692c = firebaseAuth;
        this.f6693d = a0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f6690a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f6691b.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            y.d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (f1.d(intent)) {
                this.f6691b.setException(zzadg.zza(f1.a(intent)));
                y.d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f6691b.setException(zzadg.zza(t.a("WEB_CONTEXT_CANCELED")));
                    y.d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            y yVar = this.f6694e;
            TaskCompletionSource<ba.i> taskCompletionSource = this.f6691b;
            this.f6692c.z(y.a(intent)).addOnSuccessListener(new a0(yVar, taskCompletionSource, context)).addOnFailureListener(new b0(yVar, taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            y yVar2 = this.f6694e;
            TaskCompletionSource<ba.i> taskCompletionSource2 = this.f6691b;
            this.f6693d.E(y.a(intent)).addOnSuccessListener(new c0(yVar2, taskCompletionSource2, context)).addOnFailureListener(new e0(yVar2, taskCompletionSource2, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            y yVar3 = this.f6694e;
            TaskCompletionSource<ba.i> taskCompletionSource3 = this.f6691b;
            this.f6693d.F(y.a(intent)).addOnSuccessListener(new f0(yVar3, taskCompletionSource3, context)).addOnFailureListener(new g0(yVar3, taskCompletionSource3, context));
        } else {
            this.f6691b.setException(zzadg.zza(t.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
