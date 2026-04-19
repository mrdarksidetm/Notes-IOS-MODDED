package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzrh {
    private static final zzzc zza;
    private static final zzmm<zzws, zzqk.zzb> zzb;
    private static final zzmm<zzur, zzqk.zzc> zzc;
    private static final zzon<zzqk, zzpf> zzd;
    private static final zzoj<zzpf> zze;
    private static final zzmw<zzqd, zzpc> zzf;
    private static final zzms<zzpc> zzg;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzzcVarZzb;
        zzb = zzmm.zza().zza(zzws.RAW, zzqk.zzb.zzd).zza(zzws.TINK, zzqk.zzb.zza).zza(zzws.LEGACY, zzqk.zzb.zzc).zza(zzws.CRUNCHY, zzqk.zzb.zzb).zza();
        zzc = zzmm.zza().zza(zzur.SHA1, zzqk.zzc.zza).zza(zzur.SHA224, zzqk.zzc.zzb).zza(zzur.SHA256, zzqk.zzc.zzc).zza(zzur.SHA384, zzqk.zzc.zzd).zza(zzur.SHA512, zzqk.zzc.zze).zza();
        zzd = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzqk zzqkVar = (zzqk) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzux) ((zzajy) zzux.zzc().zza(zzrh.zzb(zzqkVar)).zza(zzqkVar.zzc()).zze())).a_()).zza((zzws) zzrh.zzb.zza(zzqkVar.zzf())).zze()));
            }
        }, zzqk.class, zzpf.class);
        zze = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzrh.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzf = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzqd zzqdVar = (zzqd) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzuu) ((zzajy) zzuu.zzb().zza(zzrh.zzb(zzqdVar.zzc())).zza(zzaip.zza(zzqdVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, (zzws) zzrh.zzb.zza(zzqdVar.zzc().zzf()), zzqdVar.zza());
            }
        }, zzqd.class, zzpc.class);
        zzg = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzrh.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
        zzofVarZza.zza(zzf);
        zzofVarZza.zza(zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqd zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzuu zzuuVarZza = zzuu.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzuuVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqd.zzb().zza(zzqk.zzd().zza(zzuuVarZza.zzf().zzb()).zzb(zzuuVarZza.zze().zza()).zza(zzc.zza(zzuuVarZza.zze().zzb())).zza(zzb.zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zzuuVarZza.zzf().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqk zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zzux zzuxVarZza = zzux.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zzuxVarZza.zzb() == 0) {
                return zzqk.zzd().zza(zzuxVarZza.zza()).zzb(zzuxVarZza.zzf().zza()).zza(zzc.zza(zzuxVarZza.zzf().zzb())).zza(zzb.zza(zzpfVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzuxVarZza.zzb());
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    private static zzva zzb(zzqk zzqkVar) {
        return (zzva) ((zzajy) zzva.zzc().zza(zzqkVar.zzb()).zza((zzur) zzc.zza(zzqkVar.zze())).zze());
    }
}
