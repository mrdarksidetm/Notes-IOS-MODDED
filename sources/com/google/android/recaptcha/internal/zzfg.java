package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfg implements zzfe {
    public static final zzfg zza = new zzfg();

    private zzfg() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
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
            if (objZza instanceof String) {
                objZza = zzekVar.zzh().zza((String) objZza);
            }
            zzekVar.zzc().zze(i10, zzej.zza(objZza));
        } catch (zzby e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzby(6, 8, e11);
        }
    }
}
