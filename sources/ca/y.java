package ca;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static y f6778c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6779a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f6780b;

    private y() {
    }

    private static ba.h a(Intent intent) {
        w8.m.k(intent);
        return ba.x1.D(((zzahr) x8.e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzahr.CREATOR)).zzc(true));
    }

    public static y b() {
        if (f6778c == null) {
            f6778c = new y();
        }
        return f6778c;
    }

    private final void c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f6780b = broadcastReceiver;
        t4.a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    static void d(Context context) {
        y yVar = f6778c;
        yVar.f6779a = false;
        if (yVar.f6780b != null) {
            t4.a.b(context).e(f6778c.f6780b);
        }
        f6778c.f6780b = null;
    }

    static /* synthetic */ void e(y yVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        d(context);
    }

    public final boolean h(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f6779a) {
            return false;
        }
        c(activity, new h0(this, activity, taskCompletionSource));
        this.f6779a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource<ba.i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean j(Activity activity, TaskCompletionSource<ba.i> taskCompletionSource, FirebaseAuth firebaseAuth, ba.a0 a0Var) {
        if (this.f6779a) {
            return false;
        }
        c(activity, new i0(this, activity, taskCompletionSource, firebaseAuth, a0Var));
        this.f6779a = true;
        return true;
    }
}
