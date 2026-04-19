package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzly implements zzlk {
    private final zzle zza;

    zzly(zzle zzleVar) {
        this.zza = zzleVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzlq.zzf)) {
            return zzlq.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza(byte[] bArr, zzln zzlnVar) throws GeneralSecurityException {
        byte[] bArrZza = zzza.zza(zzlnVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzxv.zza(bArr, zzlnVar.zzb().zzb());
        byte[] bArrZza3 = zzlq.zza(zzlq.zzb);
        zzle zzleVar = this.zza;
        return zzleVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzleVar.zza());
    }
}
