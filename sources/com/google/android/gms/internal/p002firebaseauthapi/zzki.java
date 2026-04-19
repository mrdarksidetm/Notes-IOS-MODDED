package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzki implements zzbo {
    private final zzoz<zzbo> zza;
    private final zznk zzb;

    public zzki(zzoz<zzbo> zzozVar) {
        this.zza = zzozVar;
        this.zzb = zzozVar.zzf() ? zzny.zzb().zza().zza(zznr.zza(zzozVar), "hybrid_decrypt", "decrypt") : zznr.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzpb<zzbo> zzpbVar : this.zza.zza(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] bArrZza = zzpbVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpbVar.zza(), bArr.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpb<zzbo> zzpbVar2 : this.zza.zza(zzbj.zza)) {
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
