package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzva;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgc {
    private static final zzzc zza;
    private static final zzon<zzdg, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzcz, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzdg zzdgVar = (zzdg) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzsb) ((zzajy) zzsb.zza().zza((zzsh) ((zzajy) zzsh.zzb().zza((zzsk) ((zzajy) zzsk.zzb().zza(zzdgVar.zzd()).zze())).zza(zzdgVar.zzb()).zze())).zza((zzux) ((zzajy) zzux.zzc().zza(zzgc.zzb(zzdgVar)).zza(zzdgVar.zzc()).zze())).zze())).a_()).zza(zzgc.zza(zzdgVar.zzh())).zze()));
            }
        }, zzdg.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzge
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzgc.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzcz zzczVar = (zzcz) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzry) ((zzajy) zzry.zzb().zza((zzse) ((zzajy) zzse.zzb().zza((zzsk) ((zzajy) zzsk.zzb().zza(zzczVar.zzc().zzd()).zze())).zza(zzaip.zza(zzczVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).zza((zzuu) ((zzajy) zzuu.zzb().zza(zzgc.zzb(zzczVar.zzc())).zza(zzaip.zza(zzczVar.zzf().zza(zzcn.zza(zzcnVar)))).zze())).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgc.zza(zzczVar.zzc().zzh()), zzczVar.zza());
            }
        }, zzcz.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzgc.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzdg.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzgf.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzdg.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdg.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdg.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzdg.zzc zza(zzur zzurVar) throws GeneralSecurityException {
        int i10 = zzgf.zzb[zzurVar.ordinal()];
        if (i10 == 1) {
            return zzdg.zzc.zza;
        }
        if (i10 == 2) {
            return zzdg.zzc.zzb;
        }
        if (i10 == 3) {
            return zzdg.zzc.zzc;
        }
        if (i10 == 4) {
            return zzdg.zzc.zzd;
        }
        if (i10 == 5) {
            return zzdg.zzc.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzurVar.zza());
    }

    private static zzws zza(zzdg.zzb zzbVar) throws GeneralSecurityException {
        if (zzdg.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzdg.zzb.zzb.equals(zzbVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdg.zzb.zzc.equals(zzbVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzb);
        zzofVarZza.zza(zzc);
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcz zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzry zzryVarZza = zzry.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzryVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzryVarZza.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzryVarZza.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzcz.zzb().zza(zzdg.zzf().zza(zzryVarZza.zzd().zzf().zzb()).zzb(zzryVarZza.zze().zzf().zzb()).zzc(zzryVarZza.zzd().zze().zza()).zzd(zzryVarZza.zze().zze().zza()).zza(zza(zzryVarZza.zze().zze().zzb())).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zzryVarZza.zzd().zzf().zzd(), zzcn.zza(zzcnVar))).zzb(zzze.zza(zzryVarZza.zze().zzf().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdg zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zzsb zzsbVarZza = zzsb.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zzsbVarZza.zzd().zzb() == 0) {
                return zzdg.zzf().zza(zzsbVarZza.zzc().zza()).zzb(zzsbVarZza.zzd().zza()).zzc(zzsbVarZza.zzc().zze().zza()).zzd(zzsbVarZza.zzd().zzf().zza()).zza(zza(zzsbVarZza.zzd().zzf().zzb())).zza(zza(zzpfVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    private static zzva zzb(zzdg zzdgVar) throws GeneralSecurityException {
        zzur zzurVar;
        zzva.zza zzaVarZza = zzva.zzc().zza(zzdgVar.zze());
        zzdg.zzc zzcVarZzg = zzdgVar.zzg();
        if (zzdg.zzc.zza.equals(zzcVarZzg)) {
            zzurVar = zzur.SHA1;
        } else if (zzdg.zzc.zzb.equals(zzcVarZzg)) {
            zzurVar = zzur.SHA224;
        } else if (zzdg.zzc.zzc.equals(zzcVarZzg)) {
            zzurVar = zzur.SHA256;
        } else if (zzdg.zzc.zzd.equals(zzcVarZzg)) {
            zzurVar = zzur.SHA384;
        } else {
            if (!zzdg.zzc.zze.equals(zzcVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzcVarZzg));
            }
            zzurVar = zzur.SHA512;
        }
        return (zzva) ((zzajy) zzaVarZza.zza(zzurVar).zze());
    }
}
