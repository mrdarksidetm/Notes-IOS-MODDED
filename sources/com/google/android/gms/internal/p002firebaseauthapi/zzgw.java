package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzec;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgw {
    private static final zzzc zza;
    private static final zzon<zzec, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdx, zzpc> zzd;
    private static final zzms<zzpc> zze;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzec zzecVar = (zzec) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zztf) ((zzajy) zztf.zzc().zza(zzecVar.zzb()).zze())).a_()).zza(zzgw.zza(zzecVar.zzd())).zze()));
            }
        }, zzec.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzgw.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzdx zzdxVar = (zzdx) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zztc) ((zzajy) zztc.zzb().zza(zzaip.zza(zzdxVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzgw.zza(zzdxVar.zzc().zzd()), zzdxVar.zza());
            }
        }, zzdx.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzgw.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    private static zzec.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i10 = zzgz.zza[zzwsVar.ordinal()];
        if (i10 == 1) {
            return zzec.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzec.zza.zzb;
        }
        if (i10 == 4) {
            return zzec.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zzec.zza zzaVar) throws GeneralSecurityException {
        if (zzec.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzec.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzec.zza.zzc.equals(zzaVar)) {
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
    public static zzdx zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zztc zztcVarZza = zztc.zza(zzpcVar.zzd(), zzajk.zza());
            if (zztcVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdx.zzb().zza(zzec.zzc().zza(zztcVarZza.zzd().zzb()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zztcVarZza.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzec zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zztf zztfVarZza = zztf.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zztfVarZza.zzb() == 0) {
                return zzec.zzc().zza(zztfVarZza.zza()).zza(zza(zzpfVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }
}
