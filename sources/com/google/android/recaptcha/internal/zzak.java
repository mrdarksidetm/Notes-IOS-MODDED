package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import le.k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak extends TimerTask {
    final /* synthetic */ zzap zza;

    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzap zzapVar = this.zza;
        k.d(zzapVar.zzb, null, null, new zzal(zzapVar, null), 3, null);
    }
}
