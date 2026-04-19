package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzar zzc;

    public final zzas zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzal.zza(length, i11));
        }
        zzah.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzat zzb() {
        zzar zzarVar = this.zzc;
        if (zzarVar != null) {
            throw zzarVar.zza();
        }
        zzbb zzbbVarZzg = zzbb.zzg(this.zzb, this.zza, this);
        zzar zzarVar2 = this.zzc;
        if (zzarVar2 == null) {
            return zzbbVarZzg;
        }
        throw zzarVar2.zza();
    }
}
