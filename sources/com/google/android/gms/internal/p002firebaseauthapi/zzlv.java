package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzlv implements zzbn {
    private zzlv(zzbn zzbnVar, byte[] bArr) {
    }

    public static zzbn zza(zznc zzncVar) throws GeneralSecurityException {
        zzzc zzzcVarZza;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzbn zzbnVar = (zzbn) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze()), zzbn.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i10 = zzlu.zza[zzwsVarZzb.ordinal()];
        if (i10 == 1) {
            zzzcVarZza = zzog.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzzcVarZza = zzog.zza(zzncVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzwsVarZzb));
            }
            zzzcVarZza = zzog.zzb(zzncVar.zza().intValue());
        }
        return new zzlv(zzbnVar, zzzcVarZza.zzb());
    }
}
