package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzjl {
    private static final zzor<zzjs, zzbo> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxx.zza((zzjs) zzbpVar);
        }
    }, zzjs.class, zzbo.class);
    private static final zzor<zzjv, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxw.zza((zzjv) zzbpVar);
        }
    }, zzjv.class, zzbn.class);
    private static final zzcj<zzbo> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbo.class, zzug.zzf());
    private static final zzbs<zzbn> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbn.class, zzvq.zzb.ASYMMETRIC_PUBLIC, zzuj.zzh());
    private static final zznx<zzjp> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzjl.zza((zzjp) zzchVar, num);
        }
    };

    public static /* synthetic */ zzjs zza(zzjp zzjpVar, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        zzjp.zzc zzcVarZzd = zzjpVar.zzd();
        if (zzcVarZzd == zzjp.zzc.zza) {
            eCParameterSpec = zzmk.zza;
        } else if (zzcVarZzd == zzjp.zzc.zzb) {
            eCParameterSpec = zzmk.zzb;
        } else {
            if (zzcVarZzd != zzjp.zzc.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: " + String.valueOf(zzcVarZzd));
            }
            eCParameterSpec = zzmk.zzc;
        }
        KeyPair keyPairZza = zzyb.zza(eCParameterSpec);
        return zzjs.zza(zzjv.zza(zzjpVar, ((ECPublicKey) keyPairZza.getPublic()).getW(), num), zzzf.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzbq.zza()));
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
        zzkz.zza();
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        zzjp.zza zzaVarZzc = zzjp.zzc();
        zzjp.zzc zzcVar = zzjp.zzc.zza;
        zzjp.zza zzaVarZza = zzaVarZzc.zza(zzcVar);
        zzjp.zzb zzbVar = zzjp.zzb.zzc;
        zzjp.zza zzaVarZza2 = zzaVarZza.zza(zzbVar);
        zzjp.zze zzeVar = zzjp.zze.zzb;
        zzjp.zza zzaVarZza3 = zzaVarZza2.zza(zzeVar);
        zzjp.zzd zzdVar = zzjp.zzd.zza;
        zzjp.zza zzaVarZza4 = zzaVarZza3.zza(zzdVar);
        zzdv.zza zzaVarZzc2 = zzdv.zze().zza(12).zzb(16).zzc(16);
        zzdv.zzb zzbVar2 = zzdv.zzb.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza4.zza(zzaVarZzc2.zza(zzbVar2).zza()).zza());
        zzjp.zza zzaVarZza5 = zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar);
        zzjp.zzd zzdVar2 = zzjp.zzd.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzaVarZza5.zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        zzjp.zza zzaVarZza6 = zzjp.zzc().zza(zzcVar).zza(zzbVar);
        zzjp.zze zzeVar2 = zzjp.zze.zza;
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza6.zza(zzeVar2).zza(zzdVar).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        zzjp.zza zzaVarZza7 = zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar);
        zzdg.zza zzaVarZzc3 = zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdg.zzc zzcVar2 = zzdg.zzc.zzc;
        zzdg.zza zzaVarZza8 = zzaVarZzc3.zza(zzcVar2);
        zzdg.zzb zzbVar3 = zzdg.zzb.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzaVarZza7.zza(zzaVarZza8.zza(zzbVar3).zza()).zza());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar2).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
        zznv.zza().zza(zze, zzjp.class);
        zzmt.zza().zza((zzbs) zzc, true);
        zzmt.zza().zza((zzbs) zzd, false);
    }
}
