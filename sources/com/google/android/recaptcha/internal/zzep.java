package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class zzep implements zzfe {
    public static final zzep zza = new zzep();

    private zzep() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 3) {
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
        Object objZza3 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (objZza3 instanceof Object)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e10) {
            if (!(e10 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 25, e10);
            }
            throw new zzby(4, 22, e10);
        }
    }
}
