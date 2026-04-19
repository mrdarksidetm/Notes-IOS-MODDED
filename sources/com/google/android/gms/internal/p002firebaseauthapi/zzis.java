package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzis {
    private static final zzor<zzio, zzbl> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzir
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzis.zza((zzio) zzbpVar);
        }
    }, zzio.class, zzbl.class);
    private static final zzbs<zzbl> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbl.class, zzvq.zzb.SYMMETRIC, zzti.zze());
    private static final zznz<zziv> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zziu
    };
    private static final zznx<zziv> zzd = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzit
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzis.zza((zziv) zzchVar, num);
        }
    };

    public static /* synthetic */ zzbl zza(zzio zzioVar) throws InvalidAlgorithmParameterException {
        zza(zzioVar.zzc());
        return zzxt.zza(zzioVar);
    }

    static zzio zza(zziv zzivVar, Integer num) throws InvalidAlgorithmParameterException {
        zza(zzivVar);
        return zzio.zzb().zza(zzivVar).zza(num).zza(zzze.zza(zzivVar.zzb())).zza();
    }

    private static void zza(zziv zzivVar) throws InvalidAlgorithmParameterException {
        if (zzivVar.zzb() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzivVar.zzb() + ". Valid keys must have 64 bytes.");
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        zzjg.zza();
        zzoc.zza().zza(zza);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("AES256_SIV", zzje.zza);
        map.put("AES256_SIV_RAW", zziv.zzc().zza(64).zza(zziv.zzb.zzc).zza());
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zznw.zza().zza(zzc, zziv.class);
        zznv.zza().zza(zzd, zziv.class);
        zzmt.zza().zza((zzbs) zzb, true);
    }
}
