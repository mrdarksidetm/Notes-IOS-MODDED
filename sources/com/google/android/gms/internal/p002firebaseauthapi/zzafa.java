package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class zzafa extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    public zzafa(zzaew zzaewVar, String str) {
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).x() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzaez zzaezVar = (zzaez) this.zzb.zzd.get(this.zza);
                if (zzaezVar == null) {
                    zzaew.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String strZza = zzaew.zza(str);
                    zzaezVar.zze = strZza;
                    if (strZza == null) {
                        zzaew.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzc(zzaezVar.zzd)) {
                        zzaew.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
