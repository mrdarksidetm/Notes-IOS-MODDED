package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzks {
    private static final byte[] zza = new byte[0];

    public static zzkw zza(zzjp zzjpVar) throws GeneralSecurityException {
        zzch zzchVarZzb = zzjpVar.zzb();
        if (zzchVarZzb instanceof zzdv) {
            return new zzku((zzdv) zzchVarZzb);
        }
        if (zzchVarZzb instanceof zzdg) {
            return new zzkv((zzdg) zzchVarZzb);
        }
        if (zzchVarZzb instanceof zziv) {
            return new zzkx((zziv) zzchVarZzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: " + String.valueOf(zzchVarZzb));
    }
}
