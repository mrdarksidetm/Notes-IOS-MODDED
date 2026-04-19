package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfi implements zzfe {
    public static final zzfi zza = new zzfi();

    private zzfi() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Class<?> clsZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (clsZza instanceof Object)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzby(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i10, cls.getField(zzekVar.zzh().zza(str)));
        } catch (Exception e10) {
            throw new zzby(6, 10, e10);
        }
    }
}
