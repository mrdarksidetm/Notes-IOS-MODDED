package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer implements zzfe {
    public static final zzer zza = new zzer();

    private zzer() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length == 0) {
            throw new zzby(4, 3, null);
        }
        zzrj zzrjVarZzf = zzrm.zzf();
        for (zzrr zzrrVar : zzrrVarArr) {
            Object objZza = zzekVar.zzc().zza(zzrrVar);
            if (objZza == null) {
                throw new zzby(4, 4, null);
            }
            zzrk zzrkVarZzf = zzrl.zzf();
            if (objZza instanceof Integer) {
                zzrkVarZzf.zzt(((Number) objZza).intValue());
            } else if (objZza instanceof Short) {
                zzrkVarZzf.zzs(((Number) objZza).shortValue());
            } else if (objZza instanceof Byte) {
                zzrkVarZzf.zze(zziv.zzk(new byte[]{((Number) objZza).byteValue()}, 0, 1));
            } else if (objZza instanceof Long) {
                zzrkVarZzf.zzu(((Number) objZza).longValue());
            } else if (objZza instanceof Double) {
                zzrkVarZzf.zzq(((Number) objZza).doubleValue());
            } else if (objZza instanceof Float) {
                zzrkVarZzf.zzr(((Number) objZza).floatValue());
            } else if (objZza instanceof Boolean) {
                zzrkVarZzf.zzd(((Boolean) objZza).booleanValue());
            } else if (objZza instanceof Character) {
                zzrkVarZzf.zzp(objZza.toString());
            } else {
                zzrkVarZzf.zzv(objZza instanceof String ? (String) objZza : objZza.toString());
            }
            zzrjVarZzf.zze((zzrl) zzrkVarZzf.zzj());
        }
        zzel zzelVarZzc = zzekVar.zzc();
        byte[] bArrZzd = ((zzrm) zzrjVarZzf.zzj()).zzd();
        zzelVarZzc.zze(i10, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
