package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzko extends zzks implements zzly {
    protected zzki zzb = zzki.zzd();

    final zzki zzi() {
        if (this.zzb.zzj()) {
            this.zzb = this.zzb.clone();
        }
        return this.zzb;
    }
}
