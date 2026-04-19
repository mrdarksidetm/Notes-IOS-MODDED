package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzpx;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzpu {
    private static final zznx<zzpx> zza = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzpu.zza((zzpx) zzchVar, num);
        }
    };
    private static final zzor<zzpq, zzqa> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzpu.zzb((zzpq) zzbpVar);
        }
    }, zzpq.class, zzqa.class);
    private static final zzor<zzpq, zzci> zzc = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzpu.zza((zzpq) zzbpVar);
        }
    }, zzpq.class, zzci.class);
    private static final zzbs<zzci> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzci.class, zzvq.zzb.SYMMETRIC, zzrp.zzf());

    public static /* synthetic */ zzci zza(zzpq zzpqVar) throws GeneralSecurityException {
        zza(zzpqVar.zzc());
        return zzyz.zza(zzpqVar);
    }

    public static /* synthetic */ zzpq zza(zzpx zzpxVar, Integer num) throws GeneralSecurityException {
        zza(zzpxVar);
        return zzpq.zzb().zza(zzpxVar).zza(zzze.zza(zzpxVar.zzc())).zza(num).zza();
    }

    private static void zza(zzpx zzpxVar) throws GeneralSecurityException {
        if (zzpxVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        zzra.zza();
        zznv.zza().zza(zza, zzpx.class);
        zzoc.zza().zza(zzb);
        zzoc.zza().zza(zzc);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        zzpx zzpxVar = zzqu.zzc;
        map.put("AES_CMAC", zzpxVar);
        map.put("AES256_CMAC", zzpxVar);
        map.put("AES256_CMAC_RAW", zzpx.zzd().zza(32).zzb(16).zza(zzpx.zzb.zzd).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zzmt.zza().zza((zzbs) zzd, true);
    }

    public static /* synthetic */ zzqa zzb(zzpq zzpqVar) throws GeneralSecurityException {
        zza(zzpqVar.zzc());
        return new zzrf(zzpqVar);
    }
}
