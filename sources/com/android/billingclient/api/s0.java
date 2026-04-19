package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class s0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0 f8220c;

    s0(t0 t0Var, boolean z10) {
        this.f8220c = t0Var;
        this.f8219b = z10;
    }

    private final void d(Bundle bundle, e eVar, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f8220c.f8228e.e(c0.a(23, i10, eVar));
            return;
        }
        try {
            this.f8220c.f8228e.e(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
        } catch (Throwable unused) {
            zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (this.f8218a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.f8219b ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.f8218a = true;
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        if (this.f8218a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f8219b ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
        this.f8218a = true;
    }

    public final synchronized void c(Context context) {
        if (!this.f8218a) {
            zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f8218a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            d0 d0Var = this.f8220c.f8228e;
            e eVar = e0.f8095j;
            d0Var.e(c0.a(11, 1, eVar));
            t0 t0Var = this.f8220c;
            if (t0Var.f8225b != null) {
                t0Var.f8225b.onPurchasesUpdated(eVar, null);
                return;
            }
            return;
        }
        e eVarZze = zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listZzi = zzb.zzi(extras);
            if (eVarZze.b() == 0) {
                this.f8220c.f8228e.c(c0.c(i10));
            } else {
                d(extras, eVarZze, i10);
            }
            this.f8220c.f8225b.onPurchasesUpdated(eVarZze, listZzi);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (eVarZze.b() != 0) {
                d(extras, eVarZze, i10);
                this.f8220c.f8225b.onPurchasesUpdated(eVarZze, zzai.zzk());
                return;
            }
            t0 t0Var2 = this.f8220c;
            if (t0Var2.f8226c == null && t0Var2.f8227d == null) {
                zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                d0 d0Var2 = this.f8220c.f8228e;
                e eVar2 = e0.f8095j;
                d0Var2.e(c0.a(77, i10, eVar2));
                this.f8220c.f8225b.onPurchasesUpdated(eVar2, zzai.zzk());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                d0 d0Var3 = this.f8220c.f8228e;
                e eVar3 = e0.f8095j;
                d0Var3.e(c0.a(16, i10, eVar3));
                this.f8220c.f8225b.onPurchasesUpdated(eVar3, zzai.zzk());
                return;
            }
            try {
                if (this.f8220c.f8227d != null) {
                    this.f8220c.f8227d.a(new j(string));
                } else {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new r0(jSONObjectOptJSONObject, null));
                            }
                        }
                    }
                    this.f8220c.f8226c.zza();
                }
                this.f8220c.f8228e.c(c0.c(i10));
            } catch (JSONException unused) {
                zzb.zzk("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                d0 d0Var4 = this.f8220c.f8228e;
                e eVar4 = e0.f8095j;
                d0Var4.e(c0.a(17, i10, eVar4));
                this.f8220c.f8225b.onPurchasesUpdated(eVar4, zzai.zzk());
            }
        }
    }
}
