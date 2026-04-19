package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzan extends zzak {
    public zzan() {
        super(4);
    }

    public final zzan zzb(Object obj) {
        obj.getClass();
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        this.zza = Arrays.copyOf(objArr, zzal.zza(length, i10));
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }

    public final zzaq zzc() {
        this.zzc = true;
        return zzaq.zzg(this.zza, this.zzb);
    }
}
