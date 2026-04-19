package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa implements zzfe {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length != 4 && length != 5) {
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
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            throw new zzby(4, 5, null);
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        String strZza = zzekVar.zzh().zza(str);
        Object objZza4 = zzekVar.zzc().zza(zzrrVarArr[3]);
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            throw new zzby(4, 5, null);
        }
        String strZza2 = zzekVar.zzh().zza(str2);
        Object objZza5 = length == 5 ? zzekVar.zzc().zza(zzrrVarArr[4]) : null;
        zzeg zzegVar = new zzeg(iIntValue2);
        try {
            Class clsZza = zzej.zza(strZza);
            zzekVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzeh(zzegVar, strZza2, objZza5)));
            zzekVar.zzc().zze(i10, zzegVar);
        } catch (Exception e10) {
            throw new zzby(6, 20, e10);
        }
    }
}
