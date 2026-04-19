package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzt;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends zzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f8024b;

    /* synthetic */ a0(WeakReference weakReference, ResultReceiver resultReceiver, v6.u uVar) {
        this.f8023a = weakReference;
        this.f8024b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu
    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.f8024b;
        if (resultReceiver == null) {
            zzb.zzk("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f8023a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f8024b.send(0, null);
            zzb.zzk("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f8024b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f8024b.send(0, null);
            zzb.zzl("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
