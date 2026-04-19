package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzcx implements zzbg {
    private final zzoz<zzbg> zza;
    private final zznk zzb;
    private final zznk zzc;

    private zzcx(zzoz<zzbg> zzozVar) {
        zznk zznkVarZza;
        this.zza = zzozVar;
        if (zzozVar.zzf()) {
            zznl zznlVarZza = zzny.zzb().zza();
            zznn zznnVarZza = zznr.zza(zzozVar);
            this.zzb = zznlVarZza.zza(zznnVarZza, "aead", "encrypt");
            zznkVarZza = zznlVarZza.zza(zznnVarZza, "aead", "decrypt");
        } else {
            zznkVarZza = zznr.zza;
            this.zzb = zznkVarZza;
        }
        this.zzc = zznkVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzpb<zzbg> zzpbVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzc.zza(zzpbVar.zza(), bArr.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbg> zzpbVar2 : this.zza.zza(zzbj.zza)) {
            try {
                byte[] bArrZza2 = zzpbVar2.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpbVar2.zza(), bArr.length);
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrZzb = this.zza.zzb().zzd().zzb(bArr, bArr2);
            this.zzb.zza(this.zza.zzb().zza(), bArr.length);
            return bArrZzb;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
