package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdm;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl {
    private static final zzor<zzdh, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdk
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxp.zza((zzdh) zzbpVar);
        }
    }, zzdh.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzbg.class, zzvq.zzb.SYMMETRIC, zzsn.zzf());
    private static final zznx<zzdm> zzc = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzdl.zza((zzdm) zzchVar, num);
        }
    };

    public static /* synthetic */ zzdh zza(zzdm zzdmVar, Integer num) throws GeneralSecurityException {
        if (zzdmVar.zzc() != 24) {
            return zzdh.zzb().zza(zzdmVar).zza(num).zza(zzze.zza(zzdmVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z10) {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zzgi.zza();
        zzoc.zza().zza(zza);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzfh.zzc);
        zzdm.zzb zzbVarZzc = zzdm.zze().zza(16).zzb(16).zzc(16);
        zzdm.zza zzaVar = zzdm.zza.zzc;
        map.put("AES128_EAX_RAW", zzbVarZzc.zza(zzaVar).zza());
        map.put("AES256_EAX", zzfh.zzd);
        map.put("AES256_EAX_RAW", zzdm.zze().zza(16).zzb(32).zzc(16).zza(zzaVar).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zznv.zza().zza(zzc, zzdm.class);
        zzmt.zza().zza((zzbs) zzb, true);
    }
}
