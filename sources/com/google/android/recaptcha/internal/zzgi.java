package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgi implements zzgm {
    private final Context zza;

    public zzgi(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    @SuppressLint({"UnprotectedReceiver"})
    public final Object zza(Object... objArr) throws zzby {
        Intent intentRegisterReceiver = this.zza.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            throw new zzby(7, 19, null);
        }
        int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("plugged", -1);
        boolean booleanExtra = intentRegisterReceiver.getBooleanExtra("present", false);
        int intExtra4 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra5 = intentRegisterReceiver.getIntExtra("status", -1);
        String stringExtra = intentRegisterReceiver.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(intentRegisterReceiver.getIntExtra("temperature", -1)), Integer.valueOf(intentRegisterReceiver.getIntExtra("voltage", -1))};
    }
}
