package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzjb implements zzbl {
    private final zzoz<zzbl> zza;
    private final zznk zzb;

    public zzjb(zzoz<zzbl> zzozVar) {
        zznk zznkVarZza;
        this.zza = zzozVar;
        if (zzozVar.zzf()) {
            zznl zznlVarZza = zzny.zzb().zza();
            zznn zznnVarZza = zznr.zza(zzozVar);
            zznlVarZza.zza(zznnVarZza, "daead", "encrypt");
            zznkVarZza = zznlVarZza.zza(zznnVarZza, "daead", "decrypt");
        } else {
            zznkVarZza = zznr.zza;
        }
        this.zzb = zznkVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzpb<zzbl> zzpbVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpbVar.zza(), bArr.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbl> zzpbVar2 : this.zza.zza(zzbj.zza)) {
            try {
                byte[] bArrZza2 = zzpbVar2.zzd().zza(bArr, bArr2);
                this.zzb.zza(zzpbVar2.zza(), bArr.length);
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
