package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd {
    private static final zzor<zzcz, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzyc.zza((zzcz) zzbpVar);
        }
    }, zzcz.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzbg.class, zzvq.zzb.SYMMETRIC, zzry.zzf());
    private static final zznz<zzdg> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdf
    };
    private static final zznx<zzdg> zzd = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzde
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzdd.zza((zzdg) zzchVar, num);
        }
    };
    private static final zzil.zza zze = zzil.zza.zzb;

    static zzcz zza(zzdg zzdgVar, Integer num) throws GeneralSecurityException {
        if (zzdgVar.zzb() == 16 || zzdgVar.zzb() == 32) {
            return zzcz.zzb().zza(zzdgVar).zza(num).zza(zzze.zza(zzdgVar.zzb())).zzb(zzze.zza(zzdgVar.zzc())).zza();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z10) {
        zzil.zza zzaVar = zze;
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgc.zza();
        zzoc.zza().zza(zza);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzfh.zze);
        zzdg.zza zzaVarZzc = zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdg.zzc zzcVar = zzdg.zzc.zzc;
        zzdg.zza zzaVarZza = zzaVarZzc.zza(zzcVar);
        zzdg.zzb zzbVar = zzdg.zzb.zzc;
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzaVarZza.zza(zzbVar).zza());
        map.put("AES256_CTR_HMAC_SHA256", zzfh.zzf);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzdg.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzcVar).zza(zzbVar).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zznw.zza().zza(zzc, zzdg.class);
        zznv.zza().zza(zzd, zzdg.class);
        zzmt.zza().zza((zzbs) zzb, zzaVar, true);
    }
}
