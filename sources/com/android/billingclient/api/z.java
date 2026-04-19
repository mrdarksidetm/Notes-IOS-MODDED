package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzi;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class z extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v6.d f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d0 f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8257c;

    /* synthetic */ z(v6.d dVar, d0 d0Var, int i10, v6.t tVar) {
        this.f8255a = dVar;
        this.f8256b = d0Var;
        this.f8257c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzj
    public final void zza(Bundle bundle) {
        if (bundle == null) {
            d0 d0Var = this.f8256b;
            e eVar = e0.f8095j;
            d0Var.d(c0.a(63, 13, eVar), this.f8257c);
            this.f8255a.a(eVar, null);
            return;
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        String strZzg = zzb.zzg(bundle, "BillingClient");
        e.a aVarC = e.c();
        aVarC.c(iZzb);
        aVarC.b(strZzg);
        if (iZzb != 0) {
            zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            e eVarA = aVarC.a();
            this.f8256b.d(c0.a(23, 13, eVarA), this.f8257c);
            this.f8255a.a(eVarA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            aVarC.c(6);
            e eVarA2 = aVarC.a();
            this.f8256b.d(c0.a(64, 13, eVarA2), this.f8257c);
            this.f8255a.a(eVarA2, null);
            return;
        }
        try {
            this.f8255a.a(aVarC.a(), new c(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            d0 d0Var2 = this.f8256b;
            e eVar2 = e0.f8095j;
            d0Var2.d(c0.a(65, 13, eVar2), this.f8257c);
            this.f8255a.a(eVar2, null);
        }
    }
}
