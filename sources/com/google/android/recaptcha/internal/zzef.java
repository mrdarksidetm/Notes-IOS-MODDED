package com.google.android.recaptcha.internal;

import ae.r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import nd.u;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzef extends zzee {
    private final p zza;
    private final String zzb;

    public zzef(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionM;
        if (!r.b(method.getName(), this.zzb)) {
            return false;
        }
        zzrj zzrjVarZzf = zzrm.zzf();
        if (objArr != null) {
            collectionM = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzrk zzrkVarZzf = zzrl.zzf();
                zzrkVarZzf.zzv(obj2.toString());
                collectionM.add((zzrl) zzrkVarZzf.zzj());
            }
        } else {
            collectionM = u.m();
        }
        zzrjVarZzf.zzd(collectionM);
        zzrm zzrmVar = (zzrm) zzrjVarZzf.zzj();
        p pVar = this.zza;
        byte[] bArrZzd = zzrmVar.zzd();
        pVar.invoke(objArr, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
