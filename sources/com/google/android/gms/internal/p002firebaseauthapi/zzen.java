package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzen {
    private static final zzbs<zzbg> zza = zzna.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzbg.class, zzvq.zzb.SYMMETRIC, zzwm.zze());
    private static final zznx<zzfa> zzb = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzey.zza((zzfa) zzchVar, num);
        }
    };
    private static final zzor<zzey, zzbg> zzc = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzep
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzen.zza((zzey) zzbpVar);
        }
    }, zzey.class, zzbg.class);

    public static /* synthetic */ zzbg zza(zzey zzeyVar) {
        String strZzd = zzeyVar.zzb().zzd();
        return zzhr.zza(zzeo.zza(zzeyVar.zzb().zzb(), zzcg.zza(strZzd).zza(strZzd)), zzeyVar.zzc());
    }

    public static void zza(boolean z10) {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zzfb.zza();
        zznv.zza().zza(zzb, zzfa.class);
        zzoc.zza().zza(zzc);
        zzmt.zza().zza((zzbs) zza, true);
    }
}
