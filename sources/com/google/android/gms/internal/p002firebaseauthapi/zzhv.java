package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzhv {
    private static final zzzc zza;
    private static final zzon<zzft, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzfp, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzft zzftVar = (zzft) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzxb) ((zzajy) zzxb.zzb().zza((zzxe) ((zzajy) zzxe.zzb().zza(zzftVar.zzb()).zze())).zze())).a_()).zza(zzhv.zza(zzftVar.zzc())).zze()));
            }
        }, zzft.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzhv.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzia
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzfp zzfpVar = (zzfp) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzwy) ((zzajy) zzwy.zzb().zza(zzaip.zza(zzfpVar.zzd().zza(zzcn.zza(zzcnVar)))).zza((zzxe) ((zzajy) zzxe.zzb().zza(zzfpVar.zzb().zzb()).zze())).zze())).a_(), zzvq.zzb.SYMMETRIC, zzhv.zza(zzfpVar.zzb().zzc()), zzfpVar.zza());
            }
        }, zzfp.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzhv.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzft.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzic.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzft.zza.zza;
        }
        if (i10 == 2) {
            return zzft.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zzft.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzft.zza.zza)) {
            return zzws.TINK;
        }
        if (Objects.equals(zzaVar, zzft.zza.zzb)) {
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
    public static zzfp zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzwy zzwyVarZza = zzwy.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzwyVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzwyVarZza.zze().zzb() == 32) {
                return zzfp.zza(zzft.zza(zza(zzpcVar.zzb()), zzwyVarZza.zzd().zza()), zzze.zza(zzwyVarZza.zze().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzft zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zzxb zzxbVarZza = zzxb.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zzxbVarZza.zza() == 0) {
                return zzft.zza(zza(zzpfVar.zza().zzd()), zzxbVarZza.zzd().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }
}
