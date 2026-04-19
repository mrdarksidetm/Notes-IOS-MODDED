package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzec;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdy {
    private static final zzor<zzdx, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzik.zza((zzdx) zzbpVar);
        }
    }, zzdx.class, zzbg.class);
    private static final zznx<zzec> zzb = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzea
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            zzec zzecVar = (zzec) zzchVar;
            return zzdx.zzb().zza(zzecVar).zza(num).zza(zzze.zza(zzecVar.zzb())).zza();
        }
    };
    private static final zznz<zzec> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzed
    };
    private static final zzbs<zzbg> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzbg.class, zzvq.zzb.SYMMETRIC, zztc.zze());

    public static void zza(boolean z10) {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zzgw.zza();
        if (zza()) {
            zzoc.zza().zza(zza);
            zzod zzodVarZza = zzod.zza();
            HashMap map = new HashMap();
            zzec.zzb zzbVarZza = zzec.zzc().zza(16);
            zzec.zza zzaVar = zzec.zza.zza;
            map.put("AES128_GCM_SIV", zzbVarZza.zza(zzaVar).zza());
            zzec.zzb zzbVarZza2 = zzec.zzc().zza(16);
            zzec.zza zzaVar2 = zzec.zza.zzc;
            map.put("AES128_GCM_SIV_RAW", zzbVarZza2.zza(zzaVar2).zza());
            map.put("AES256_GCM_SIV", zzec.zzc().zza(32).zza(zzaVar).zza());
            map.put("AES256_GCM_SIV_RAW", zzec.zzc().zza(32).zza(zzaVar2).zza());
            zzodVarZza.zza(Collections.unmodifiableMap(map));
            zznw.zza().zza(zzc, zzec.class);
            zznv.zza().zza(zzb, zzec.class);
            zzmt.zza().zza((zzbs) zzd, true);
        }
    }

    private static boolean zza() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
