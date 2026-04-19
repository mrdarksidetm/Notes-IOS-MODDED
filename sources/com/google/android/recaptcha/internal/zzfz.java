package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfz implements zzfe {
    public static final zzfz zza = new zzfz();

    private zzfz() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzby(4, 3, null);
            }
            zzekVar.zzc().zze(i10, new zzbt());
            return;
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof zzbt)) {
            objZza2 = null;
        }
        zzbt zzbtVar = (zzbt) objZza2;
        if (zzbtVar == null) {
            throw new zzby(4, 5, null);
        }
        byte[] bArrZzd = zzdn.zza(zzekVar.zzb(), zzbtVar).zzd();
        zzekVar.zzi().zzb(str, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
