package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzkn extends zzkm implements zzly {
    protected zzkn(zzko zzkoVar) {
        super(zzkoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkm, com.google.android.recaptcha.internal.zzlw
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzko zzk() {
        zzks zzksVarZzk;
        if (((zzko) this.zza).zzI()) {
            ((zzko) this.zza).zzb.zzg();
            zzksVarZzk = super.zzk();
        } else {
            zzksVarZzk = this.zza;
        }
        return (zzko) zzksVarZzk;
    }

    @Override // com.google.android.recaptcha.internal.zzkm
    protected final void zzn() {
        super.zzn();
        if (((zzko) this.zza).zzb != zzki.zzd()) {
            zzko zzkoVar = (zzko) this.zza;
            zzkoVar.zzb = zzkoVar.zzb.clone();
        }
    }
}
