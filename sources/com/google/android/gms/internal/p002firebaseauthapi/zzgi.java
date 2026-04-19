package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdm;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgi {
    private static final zzzc zza;
    private static final zzon<zzdm, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdh, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzdm zzdmVar = (zzdm) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zzsq) ((zzajy) zzsq.zzb().zza(zzgi.zzb(zzdmVar)).zza(zzdmVar.zzc()).zze())).a_()).zza(zzgi.zza(zzdmVar.zzf())).zze()));
            }
        }, zzdm.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzgi.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzdh zzdhVar = (zzdh) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzsn) ((zzajy) zzsn.zzb().zza(zzgi.zzb(zzdhVar.zzc())).zza(zzaip.zza(zzdhVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgi.zza(zzdhVar.zzc().zzf()), zzdhVar.zza());
            }
        }, zzdh.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzgi.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzdm.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzgl.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzdm.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdm.zza.zzb;
        }
        if (i10 == 4) {
            return zzdm.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zzdm.zza zzaVar) throws GeneralSecurityException {
        if (zzdm.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzdm.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdm.zza.zzc.equals(zzaVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzb);
        zzofVarZza.zza(zzc);
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdh zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsn zzsnVarZza = zzsn.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzsnVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdh.zzb().zza(zzdm.zze().zzb(zzsnVarZza.zze().zzb()).zza(zzsnVarZza.zzd().zza()).zzc(16).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zzsnVarZza.zze().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdm zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsq zzsqVarZza = zzsq.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzdm.zze().zzb(zzsqVarZza.zza()).zza(zzsqVarZza.zzd().zza()).zzc(16).zza(zza(zzpfVar.zza().zzd())).zza();
            } catch (zzakf e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
    }

    private static zzst zzb(zzdm zzdmVar) throws GeneralSecurityException {
        if (zzdmVar.zzd() == 16) {
            return (zzst) ((zzajy) zzst.zzb().zza(zzdmVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdmVar.zzd())));
    }
}
