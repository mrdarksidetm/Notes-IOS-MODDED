package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzhe {
    private static final zzzc zza;
    private static final zzon<zzei, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzee, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zztr.zzb().a_()).zza(zzhe.zza(((zzei) zzchVar).zzb())).zze()));
            }
        }, zzei.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzhe.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzee zzeeVar = (zzee) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzto) ((zzajy) zzto.zzb().zza(zzaip.zza(zzeeVar.zzd().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzhe.zza(zzeeVar.zzb().zzb()), zzeeVar.zza());
            }
        }, zzee.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzhe.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzei.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzhh.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzei.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzei.zza.zzb;
        }
        if (i10 == 4) {
            return zzei.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zzei.zza zzaVar) throws GeneralSecurityException {
        if (zzei.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzei.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzei.zza.zzc.equals(zzaVar)) {
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
    public static zzee zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzto zztoVarZza = zzto.zza(zzpcVar.zzd(), zzajk.zza());
            if (zztoVarZza.zza() == 0) {
                return zzee.zza(zza(zzpcVar.zzb()), zzze.zza(zztoVarZza.zzd().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzei zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zztr.zza(zzpfVar.zza().zze(), zzajk.zza());
                return zzei.zza(zza(zzpfVar.zza().zzd()));
            } catch (zzakf e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
    }
}
