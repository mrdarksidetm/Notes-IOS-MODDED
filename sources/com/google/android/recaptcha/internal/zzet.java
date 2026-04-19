package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzet implements zzfe {
    public static final zzet zza = new zzet();

    private zzet() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        boolean z10 = true;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzekVar.zzh().zza((String) objZza);
                }
                zzel zzelVarZzc = zzekVar.zzc();
                try {
                    zzej.zza(objZza);
                } catch (zzby e10) {
                    if (e10.zzb() == 8 || e10.zzb() == 6) {
                        z10 = false;
                    } else if (e10.zzb() != 47) {
                        throw e10;
                    }
                }
                zzelVarZzc.zze(i10, Boolean.valueOf(z10));
            } catch (Exception e11) {
                throw new zzby(6, 8, e11);
            }
        } catch (zzby e12) {
            throw e12;
        }
    }
}
