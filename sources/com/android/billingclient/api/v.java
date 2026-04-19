package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
final class v extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v6.h f8237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(b bVar, Handler handler, v6.h hVar) {
        super(handler);
        this.f8237a = hVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f8237a.a(zzb.zzf(bundle, "BillingClient"));
    }
}
