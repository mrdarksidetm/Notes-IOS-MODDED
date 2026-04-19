package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class zzaj<E> extends zzam<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzaj(int i10) {
        zzai.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzaj<E> zza(E e10) {
        zzy.zza(e10);
        Object[] objArr = this.zza;
        int iZza = zzam.zza(objArr.length, this.zzb + 1);
        if (iZza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr2[i10] = e10;
        return this;
    }
}
