package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzez implements zzfe {
    public static final zzez zza = new zzez();

    private zzez() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int iIntValue;
        int length = zzrrVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzby(4, 3, null);
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
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza3 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            throw new zzby(4, 5, null);
        }
        String strZza = zzekVar.zzh().zza(str2);
        Object objZza4 = zzekVar.zzc().zza(zzrrVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzekVar.zzc().zza(zzrrVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                throw new zzby(4, 5, null);
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            if (objZza2 instanceof String) {
                objZza2 = zzekVar.zzh().zza((String) objZza2);
            }
            Class clsZza = zzej.zza(objZza2);
            zzekVar.zzc().zze(i10, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzef(new zzey(zzekVar, str, iIntValue), strZza, objZza4)));
        } catch (Exception e10) {
            throw new zzby(6, 20, e10);
        }
    }
}
