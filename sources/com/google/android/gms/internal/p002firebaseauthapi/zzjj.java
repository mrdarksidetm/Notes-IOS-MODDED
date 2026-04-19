package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzjj implements zzbl {
    private final zzbl zza;
    private final zzws zzb;
    private final byte[] zzc;

    private zzjj(zzbl zzblVar, zzws zzwsVar, byte[] bArr) {
        this.zza = zzblVar;
        this.zzb = zzwsVar;
        this.zzc = bArr;
    }

    public static zzbl zza(zznc zzncVar) throws GeneralSecurityException {
        zzzc zzzcVarZza;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze());
        zzpg.zza();
        zzbl zzblVar = (zzbl) zzpg.zza(zzvqVar, zzbl.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i10 = zzjm.zza[zzwsVarZzb.ordinal()];
        if (i10 == 1) {
            zzzcVarZza = zzog.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzzcVarZza = zzog.zza(zzncVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + zzwsVarZzb.zza());
            }
            zzzcVarZza = zzog.zzb(zzncVar.zza().intValue());
        }
        return new zzjj(zzblVar, zzwsVarZzb, zzzcVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzws.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpr.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
