package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zznm {
    private ArrayList<zznp> zza = new ArrayList<>();
    private zzng zzb = zzng.zza;
    private Integer zzc = null;

    public final zznm zza(int i10) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zznm zza(zzbr zzbrVar, int i10, String str, String str2) {
        ArrayList<zznp> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznp(zzbrVar, i10, str, str2));
        return this;
    }

    public final zznm zza(zzng zzngVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzngVar;
        return this;
    }

    public final zznn zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList<zznp> arrayList = this.zza;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zznp zznpVar = arrayList.get(i10);
                i10++;
                if (zznpVar.zza() == iIntValue) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
        }
        zznn zznnVar = new zznn(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zznnVar;
    }
}
