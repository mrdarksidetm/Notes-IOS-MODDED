package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import le.k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdh extends TimerTask {
    final /* synthetic */ zzdk zza;

    public zzdh(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzdk zzdkVar = this.zza;
        k.d(zzdkVar.zzd, null, null, new zzdi(zzdkVar, null), 3, null);
    }
}
