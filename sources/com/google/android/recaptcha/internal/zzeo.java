package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo implements zzfe {
    public static final zzeo zza = new zzeo();

    private zzeo() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int iIntValue = num.intValue();
        try {
            zzekVar.zzc().zze(i10, objZza instanceof String ? String.valueOf(((String) objZza).charAt(iIntValue)) : objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue));
        } catch (Exception e10) {
            if (!(e10 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 23, e10);
            }
            throw new zzby(4, 22, e10);
        }
    }
}
