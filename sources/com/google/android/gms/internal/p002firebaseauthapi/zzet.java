package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zzet {
    private static final zzzc zza;
    private static final zzon<zzer, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzes, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzev
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzer zzerVar = (zzer) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzwj) ((zzajy) zzwj.zza().zza(zzerVar.zzc()).zze())).a_()).zza(zzet.zza(zzerVar.zzb())).zze()));
            }
        }, zzer.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzet.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzex
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzes zzesVar = (zzes) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzwg) ((zzajy) zzwg.zzb().zza((zzwj) ((zzajy) zzwj.zza().zza(zzesVar.zzb().zzc()).zze())).zze())).a_(), zzvq.zzb.REMOTE, zzet.zza(zzesVar.zzb().zzb()), zzesVar.zza());
            }
        }, zzes.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzew
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzet.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzer.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzez.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzer.zza.zza;
        }
        if (i10 == 2) {
            return zzer.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zzer.zza zzaVar) throws GeneralSecurityException {
        if (zzer.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzer.zza.zzb.equals(zzaVar)) {
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
    public static zzer zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzer.zza(zzwj.zza(zzpfVar.zza().zze(), zzajk.zza()).zzd(), zza(zzpfVar.zza().zzd()));
            } catch (zzakf e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzes zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzwg zzwgVarZza = zzwg.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzwgVarZza.zza() == 0) {
                return zzes.zza(zzer.zza(zzwgVarZza.zzd().zzd(), zza(zzpcVar.zzb())), zzpcVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzwgVarZza));
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }
}
