package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcp {
    public static zzch zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvu zzvuVarZza = zzvu.zza(bArr, zzajk.zza());
            zzof zzofVarZza = zzof.zza();
            zzpf zzpfVarZza = zzpf.zza(zzvuVarZza);
            return !zzofVarZza.zzc(zzpfVarZza) ? new zzne(zzpfVarZza) : zzofVarZza.zza(zzpfVarZza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzch zzchVar) {
        return (zzchVar instanceof zzne ? ((zzne) zzchVar).zzb() : (zzpf) zzof.zza().zza(zzchVar, zzpf.class)).zza().zzk();
    }
}
