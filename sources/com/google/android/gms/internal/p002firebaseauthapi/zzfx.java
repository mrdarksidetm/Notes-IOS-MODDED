package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzga;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzfx {
    private static final zzor<zzfv, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzfx.zza((zzfv) zzbpVar);
        }
    }, zzfv.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbg.class, zzvq.zzb.SYMMETRIC, zzxh.zze());
    private static final zznz<zzga> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfz
    };
    private static final zznx<zzga> zzd = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfy
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzfx.zza((zzga) zzchVar, num);
        }
    };

    public static /* synthetic */ zzbg zza(zzfv zzfvVar) {
        return zzib.zza() ? zzib.zza(zzfvVar) : zzzd.zza(zzfvVar);
    }

    static zzfv zza(zzga zzgaVar, Integer num) {
        return zzfv.zza(zzgaVar.zzb(), zzze.zza(32), num);
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z10) {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzie.zza();
        zzoc.zza().zza(zza);
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzga.zza(zzga.zza.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzga.zza(zzga.zza.zzc));
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zznv.zza().zza(zzd, zzga.class);
        zznw.zza().zza(zzc, zzga.class);
        zzmt.zza().zza((zzbs) zzb, true);
    }
}
