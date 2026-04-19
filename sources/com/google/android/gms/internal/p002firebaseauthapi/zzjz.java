package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzjz {
    private static final zzzc zza;
    private static final zzzc zzb;
    private static final zzon<zzju, zzpf> zzc;
    private static final zzoj<zzpf> zzd;
    private static final zzmw<zzke, zzpc> zze;
    private static final zzms<zzpc> zzf;
    private static final zzmw<zzjw, zzpc> zzg;
    private static final zzms<zzpc> zzh;
    private static final zzmm<zzws, zzju.zze> zzi;
    private static final zzmm<zzvf, zzju.zzf> zzj;
    private static final zzmm<zzvc, zzju.zzc> zzk;
    private static final zzmm<zzvd, zzju.zzb> zzl;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzzcVarZzb;
        zzzc zzzcVarZzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzzcVarZzb2;
        zzc = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzju zzjuVar = (zzju) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzve) ((zzajy) zzve.zza().zza(zzjz.zzb(zzjuVar)).zze())).a_()).zza((zzws) zzjz.zzi.zza(zzjuVar.zzf())).zze()));
            }
        }, zzju.class, zzpf.class);
        zzd = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzjz.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zze = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzke zzkeVar = (zzke) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzjz.zza(zzkeVar).a_(), zzvq.zzb.ASYMMETRIC_PUBLIC, (zzws) zzjz.zzi.zza(zzkeVar.zzb().zzf()), zzkeVar.zza());
            }
        }, zzke.class, zzpc.class);
        zzf = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzjz.zzd((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb2, zzpc.class);
        zzg = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzjw zzjwVar = (zzjw) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzvk) ((zzajy) zzvk.zzb().zza(0).zza(zzjz.zza((zzke) ((zzkr) zzjwVar.zzb()))).zza(zzaip.zza(zzjwVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.ASYMMETRIC_PRIVATE, (zzws) zzjz.zzi.zza(zzjwVar.zzc().zzf()), zzjwVar.zza());
            }
        }, zzjw.class, zzpc.class);
        zzh = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzjz.zzc((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
        zzmp zzmpVarZza = zzmm.zza().zza(zzws.RAW, zzju.zze.zzc).zza(zzws.TINK, zzju.zze.zza);
        zzws zzwsVar = zzws.LEGACY;
        zzju.zze zzeVar = zzju.zze.zzb;
        zzi = zzmpVarZza.zza(zzwsVar, zzeVar).zza(zzws.CRUNCHY, zzeVar).zza();
        zzj = zzmm.zza().zza(zzvf.DHKEM_P256_HKDF_SHA256, zzju.zzf.zza).zza(zzvf.DHKEM_P384_HKDF_SHA384, zzju.zzf.zzb).zza(zzvf.DHKEM_P521_HKDF_SHA512, zzju.zzf.zzc).zza(zzvf.DHKEM_X25519_HKDF_SHA256, zzju.zzf.zzd).zza();
        zzk = zzmm.zza().zza(zzvc.HKDF_SHA256, zzju.zzc.zza).zza(zzvc.HKDF_SHA384, zzju.zzc.zzb).zza(zzvc.HKDF_SHA512, zzju.zzc.zzc).zza();
        zzl = zzmm.zza().zza(zzvd.AES_128_GCM, zzju.zzb.zza).zza(zzvd.AES_256_GCM, zzju.zzb.zzb).zza(zzvd.CHACHA20_POLY1305, zzju.zzb.zzc).zza();
    }

    private static zzju zza(zzws zzwsVar, zzvh zzvhVar) {
        return zzju.zzc().zza(zzi.zza(zzwsVar)).zza(zzj.zza(zzvhVar.zzc())).zza(zzk.zza(zzvhVar.zzb())).zza(zzl.zza(zzvhVar.zza())).zza();
    }

    private static zzvn zza(zzke zzkeVar) {
        return (zzvn) ((zzajy) zzvn.zzc().zza(0).zza(zzb(zzkeVar.zzb())).zza(zzaip.zza(zzkeVar.zzd().zzb())).zze());
    }

    private static zzzc zza(zzju.zzf zzfVar, byte[] bArr) {
        return zzzc.zza(zzmj.zza(zzmj.zza(bArr), zzlq.zzb(zzfVar)));
    }

    public static void zza() {
        zzof zzofVarZza = zzof.zza();
        zzofVarZza.zza(zzc);
        zzofVarZza.zza(zzd);
        zzofVarZza.zza(zze);
        zzofVarZza.zza(zzf);
        zzofVarZza.zza(zzg);
        zzofVarZza.zza(zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzju zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzpfVar.zza().zzd(), zzve.zza(zzpfVar.zza().zze(), zzajk.zza()).zzc());
            } catch (zzakf e10) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
    }

    private static zzvh zzb(zzju zzjuVar) {
        return (zzvh) ((zzajy) zzvh.zzd().zza((zzvf) zzj.zza(zzjuVar.zze())).zza((zzvc) zzk.zza(zzjuVar.zzd())).zza((zzvd) zzl.zza(zzjuVar.zzb())).zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjw zzc(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzpcVar.zzf());
        }
        try {
            zzvk zzvkVarZza = zzvk.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzvkVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvn zzvnVarZzd = zzvkVarZza.zzd();
            if (zzvnVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzju zzjuVarZza = zza(zzpcVar.zzb(), zzvnVarZzd.zzb());
            return zzjw.zza(zzke.zza(zzjuVarZza, zza(zzjuVarZza.zze(), zzvnVarZzd.zzf().zzd()), zzpcVar.zze()), zzze.zza(zzmj.zza(zzmj.zza(zzvkVarZza.zze().zzd()), zzlq.zza(zzjuVarZza.zze())), zzcn.zza(zzcnVar)));
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzke zzd(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzpcVar.zzf());
        }
        try {
            zzvn zzvnVarZza = zzvn.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzvnVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzju zzjuVarZza = zza(zzpcVar.zzb(), zzvnVarZza.zzb());
            return zzke.zza(zzjuVarZza, zza(zzjuVarZza.zze(), zzvnVarZza.zzf().zzd()), zzpcVar.zze());
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }
}
