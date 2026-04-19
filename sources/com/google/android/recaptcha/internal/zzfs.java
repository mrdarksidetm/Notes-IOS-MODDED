package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfs implements zzfe {
    public static final zzfs zza = new zzfs();

    private zzfs() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        zzekVar.zzc().zze(i10, zzekVar.zzc().zza(zzrrVarArr[0]));
    }
}
