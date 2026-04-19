package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgo;
import com.google.android.gms.internal.play_billing.zzhl;

/* JADX INFO: loaded from: classes.dex */
interface d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzal f8081a = zzal.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzgo.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzgo.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzgo.ALTERNATIVE_BILLING_ACTION);

    void a(zzhl zzhlVar);

    void b(zzge zzgeVar, int i10);

    void c(zzge zzgeVar);

    void d(zzga zzgaVar, int i10);

    void e(zzga zzgaVar);
}
