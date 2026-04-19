package com.google.android.recaptcha.internal;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeq implements zzfe {
    public static final zzeq zza = new zzeq();

    private zzeq() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 3) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            throw new zzby(4, 6, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza3 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (objZza3 instanceof Object)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzby(4, 5, null);
        }
        if (r.b(objZza2, objZza3)) {
            zzekVar.zzg(zzekVar.zza() + iIntValue);
        }
    }
}
