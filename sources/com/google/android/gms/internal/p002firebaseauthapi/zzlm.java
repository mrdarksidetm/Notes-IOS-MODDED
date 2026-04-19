package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzlm {
    private static final zzor<zzjw, zzbo> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzlj.zza((zzjw) zzbpVar);
        }
    }, zzjw.class, zzbo.class);
    private static final zzor<zzke, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzli.zza((zzke) zzbpVar);
        }
    }, zzke.class, zzbn.class);
    private static final zzcj<zzbo> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbo.class, zzvk.zzf());
    private static final zzbs<zzbn> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbn.class, zzvq.zzb.ASYMMETRIC_PUBLIC, zzvn.d_());
    private static final zznx<zzju> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzlm.zza((zzju) zzchVar, num);
        }
    };

    public static /* synthetic */ zzjw zza(zzju zzjuVar, Integer num) throws GeneralSecurityException {
        byte[] bArr;
        zzzc zzzcVarZza;
        zzze zzzeVarZza;
        if (zzjuVar.zze().equals(zzju.zzf.zzd)) {
            byte[] bArrZza = zzpe.zza(32);
            bArrZza[0] = (byte) (bArrZza[0] | 7);
            byte b10 = (byte) (bArrZza[31] & 63);
            bArrZza[31] = b10;
            bArrZza[31] = (byte) (b10 | 128);
            zzzeVarZza = zzze.zza(bArrZza, zzbq.zza());
            zzzcVarZza = zzzc.zza(zzza.zza(bArrZza));
        } else {
            if (!zzjuVar.zze().equals(zzju.zzf.zza) && !zzjuVar.zze().equals(zzju.zzf.zzb) && !zzjuVar.zze().equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzya zzyaVarZzc = zzlq.zzc(zzjuVar.zze());
            KeyPair keyPairZza = zzyb.zza(zzyb.zza(zzyaVarZzc));
            zzyd zzydVar = zzyd.UNCOMPRESSED;
            ECPoint w10 = ((ECPublicKey) keyPairZza.getPublic()).getW();
            EllipticCurve curve = zzyb.zza(zzyaVarZzc).getCurve();
            zzmk.zza(w10, curve);
            int iZza = zzyb.zza(curve);
            int iOrdinal = zzydVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    int i10 = iZza + 1;
                    bArr = new byte[i10];
                    byte[] bArrZza2 = zzmj.zza(w10.getAffineX());
                    System.arraycopy(bArrZza2, 0, bArr, i10 - bArrZza2.length, bArrZza2.length);
                    bArr[0] = (byte) (w10.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("invalid format:" + String.valueOf(zzydVar));
                    }
                    int i11 = iZza * 2;
                    bArr = new byte[i11];
                    byte[] bArrZza3 = zzmj.zza(w10.getAffineX());
                    if (bArrZza3.length > iZza) {
                        bArrZza3 = Arrays.copyOfRange(bArrZza3, bArrZza3.length - iZza, bArrZza3.length);
                    }
                    byte[] bArrZza4 = zzmj.zza(w10.getAffineY());
                    if (bArrZza4.length > iZza) {
                        bArrZza4 = Arrays.copyOfRange(bArrZza4, bArrZza4.length - iZza, bArrZza4.length);
                    }
                    System.arraycopy(bArrZza4, 0, bArr, i11 - bArrZza4.length, bArrZza4.length);
                    System.arraycopy(bArrZza3, 0, bArr, iZza - bArrZza3.length, bArrZza3.length);
                }
            } else {
                int i12 = (iZza * 2) + 1;
                bArr = new byte[i12];
                byte[] bArrZza5 = zzmj.zza(w10.getAffineX());
                byte[] bArrZza6 = zzmj.zza(w10.getAffineY());
                System.arraycopy(bArrZza6, 0, bArr, i12 - bArrZza6.length, bArrZza6.length);
                System.arraycopy(bArrZza5, 0, bArr, (iZza + 1) - bArrZza5.length, bArrZza5.length);
                bArr[0] = 4;
            }
            zzzcVarZza = zzzc.zza(bArr);
            zzzeVarZza = zzze.zza(zzmj.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzlq.zza(zzjuVar.zze())), zzbq.zza());
        }
        return zzjw.zza(zzke.zza(zzjuVar, zzzcVarZza, num), zzzeVarZza);
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        zzjz.zza();
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        zzju.zzd zzdVarZzc = zzju.zzc();
        zzju.zze zzeVar = zzju.zze.zza;
        zzju.zzd zzdVarZza = zzdVarZzc.zza(zzeVar);
        zzju.zzf zzfVar = zzju.zzf.zzd;
        zzju.zzd zzdVarZza2 = zzdVarZza.zza(zzfVar);
        zzju.zzc zzcVar = zzju.zzc.zza;
        zzju.zzd zzdVarZza3 = zzdVarZza2.zza(zzcVar);
        zzju.zzb zzbVar = zzju.zzb.zza;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzdVarZza3.zza(zzbVar).zza());
        zzju.zzd zzdVarZzc2 = zzju.zzc();
        zzju.zze zzeVar2 = zzju.zze.zzc;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzdVarZzc2.zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar).zza());
        zzju.zzd zzdVarZza4 = zzju.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
        zzju.zzb zzbVar2 = zzju.zzb.zzb;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzdVarZza4.zza(zzbVar2).zza());
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar2).zza());
        zzju.zzd zzdVarZza5 = zzju.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
        zzju.zzb zzbVar3 = zzju.zzb.zzc;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzdVarZza5.zza(zzbVar3).zza());
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar3).zza());
        zzju.zzd zzdVarZza6 = zzju.zzc().zza(zzeVar);
        zzju.zzf zzfVar2 = zzju.zzf.zza;
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzdVarZza6.zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
        zzju.zzd zzdVarZza7 = zzju.zzc().zza(zzeVar);
        zzju.zzf zzfVar3 = zzju.zzf.zzb;
        zzju.zzd zzdVarZza8 = zzdVarZza7.zza(zzfVar3);
        zzju.zzc zzcVar2 = zzju.zzc.zzb;
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzdVarZza8.zza(zzcVar2).zza(zzbVar).zza());
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar).zza());
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
        zzju.zzd zzdVarZza9 = zzju.zzc().zza(zzeVar);
        zzju.zzf zzfVar4 = zzju.zzf.zzc;
        zzju.zzd zzdVarZza10 = zzdVarZza9.zza(zzfVar4);
        zzju.zzc zzcVar3 = zzju.zzc.zzc;
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzdVarZza10.zza(zzcVar3).zza(zzbVar).zza());
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar).zza());
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzju.zzc().zza(zzeVar).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzju.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
        zznv.zza().zza(zze, zzju.class);
        zzmt.zza().zza((zzbs) zzc, true);
        zzmt.zza().zza((zzbs) zzd, false);
    }
}
