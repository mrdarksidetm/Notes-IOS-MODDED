package ca;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class h0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<String> f6683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y f6684c;

    h0(y yVar, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f6684c = yVar;
        this.f6682a = new WeakReference<>(activity);
        this.f6683b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f6682a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f6683b.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            y.d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                y.e(this.f6684c, intent, this.f6683b, context);
                return;
            }
            this.f6683b.setException(zzadg.zza(t.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (f1.d(intent)) {
            this.f6683b.setException(zzadg.zza(f1.a(intent)));
            y.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f6683b.setException(zzadg.zza(t.a("WEB_CONTEXT_CANCELED")));
            y.d(context);
        }
    }
}
