package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;
import h.h;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends androidx.activity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h.d f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h.d f8006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResultReceiver f8007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ResultReceiver f8008d;

    final void F(h.a aVar) {
        Intent intentA = aVar.a();
        int iB = zzb.zze(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f8007c;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    final void G(h.a aVar) {
        Intent intentA = aVar.a();
        int iB = zzb.zze(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f8008d;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            zzb.zzk("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8005a = registerForActivityResult(new i.g(), new h.b() { // from class: com.android.billingclient.api.n0
            @Override // h.b
            public final void onActivityResult(Object obj) {
                this.f8194a.F((h.a) obj);
            }
        });
        this.f8006b = registerForActivityResult(new i.g(), new h.b() { // from class: com.android.billingclient.api.o0
            @Override // h.b
            public final void onActivityResult(Object obj) {
                this.f8198a.G((h.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f8007c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f8008d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f8007c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f8005a.a(new h.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f8008d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f8006b.a(new h.a(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f8007c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f8008d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
