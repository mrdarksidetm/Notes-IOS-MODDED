package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwa.zzb zzbVar) throws GeneralSecurityException {
        zzzc zzzcVarZza;
        int i10 = zzbm.zza[zzbVar.zzf().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzzcVarZza = zzog.zza(zzbVar.zza());
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return zza;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzzcVarZza = zzog.zzb(zzbVar.zza());
        }
        return zzzcVarZza.zzb();
    }
}
