package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq implements zzfe {
    public static final zzfq zza = new zzfq();

    private zzfq() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Constructor<?> constructorZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (constructorZza instanceof Object)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzby(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(new Class[0]);
        Object[] objArrZzg = zzekVar.zzc().zzg(p.E0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i10, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e10) {
            throw new zzby(6, 14, e10);
        }
    }
}
