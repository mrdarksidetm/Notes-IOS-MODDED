package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends zzx {
    public zzaa() {
        super(4);
    }

    public final zzaa zza(Object obj) {
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
        int i12 = length + (length >> 1) + 1;
        if (i12 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            i12 = a.e.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i12);
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }

    public final zzad zzb() {
        this.zzc = true;
        return zzad.zzg(this.zza, this.zzb);
    }
}
