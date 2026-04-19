package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzds {
    private static final zzor<zzdo, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxq.zza((zzdo) zzbpVar);
        }
    }, zzdo.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbg.class, zzvq.zzb.SYMMETRIC, zzsw.zze());
    private static final zznz<zzdv> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdu
    };
    private static final zznx<zzdv> zzd = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzds.zza((zzdv) zzchVar, num);
        }
    };
    private static final zzil.zza zze = zzil.zza.zzb;

    public static /* synthetic */ zzdo zza(zzdv zzdvVar, Integer num) throws GeneralSecurityException {
        if (zzdvVar.zzc() != 24) {
            return zzdo.zzb().zza(zzdvVar).zza(num).zza(zzze.zza(zzdvVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z10) {
        zzil.zza zzaVar = zze;
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgq.zza();
        zzoc.zza().zza(zza);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzfh.zza);
        zzdv.zza zzaVarZzc = zzdv.zze().zza(12).zzb(16).zzc(16);
        zzdv.zzb zzbVar = zzdv.zzb.zzc;
        map.put("AES128_GCM_RAW", zzaVarZzc.zza(zzbVar).zza());
        map.put("AES256_GCM", zzfh.zzb);
        map.put("AES256_GCM_RAW", zzdv.zze().zza(12).zzb(32).zzc(16).zza(zzbVar).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zznw.zza().zza(zzc, zzdv.class);
        zznv.zza().zza(zzd, zzdv.class);
        zzmt.zza().zza((zzbs) zzb, zzaVar, true);
    }
}
