package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzro implements zzci {
    private static final byte[] zza = {0};
    private final zzci zzb;
    private final zzws zzc;
    private final byte[] zzd;

    private zzro(zzci zzciVar, zzws zzwsVar, byte[] bArr) {
        this.zzb = zzciVar;
        this.zzc = zzwsVar;
        this.zzd = bArr;
    }

    public static zzci zza(zznc zzncVar) throws GeneralSecurityException {
        zzzc zzzcVarZza;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze());
        zzpg.zza();
        zzci zzciVar = (zzci) zzpg.zza(zzvqVar, zzci.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i10 = zzrn.zza[zzwsVarZzb.ordinal()];
        if (i10 == 1) {
            zzzcVarZza = zzog.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzzcVarZza = zzog.zza(zzncVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzzcVarZza = zzog.zzb(zzncVar.zza().intValue());
        }
        return new zzro(zzciVar, zzwsVarZzb, zzzcVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzws.LEGACY)) {
            bArr2 = zzxv.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzws.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzws.LEGACY)) {
            bArr = zzxv.zza(bArr, zza);
        }
        return zzxv.zza(this.zzd, this.zzb.zza(bArr));
    }
}
