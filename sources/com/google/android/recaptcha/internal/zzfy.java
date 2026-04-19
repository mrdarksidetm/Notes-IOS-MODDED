package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy implements zzfe {
    public static final zzfy zza = new zzfy();

    private zzfy() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        zzel zzelVarZzc = zzekVar.zzc();
        StringBuilder sb2 = new StringBuilder();
        try {
            for (int i11 : iArr) {
                sb2.append(str.charAt(i11));
            }
            zzelVarZzc.zze(i10, sb2.toString());
        } catch (Exception e10) {
            throw new zzby(4, 22, e10);
        }
    }
}
