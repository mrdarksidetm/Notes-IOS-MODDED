package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzug;
import com.google.android.gms.internal.p002firebaseauthapi.zzuj;
import com.google.android.gms.internal.p002firebaseauthapi.zzum;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public final class zzkz {
    private static final zzzc zza;
    private static final zzzc zzb;
    private static final zzon<zzjp, zzpf> zzc;
    private static final zzoj<zzpf> zzd;
    private static final zzmw<zzjv, zzpc> zze;
    private static final zzms<zzpc> zzf;
    private static final zzmw<zzjs, zzpc> zzg;
    private static final zzms<zzpc> zzh;
    private static final zzmm<zzws, zzjp.zzd> zzi;
    private static final zzmm<zzur, zzjp.zzb> zzj;
    private static final zzmm<zzup, zzjp.zzc> zzk;
    private static final zzmm<zztu, zzjp.zze> zzl;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzzcVarZzb;
        zzzc zzzcVarZzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzzcVarZzb2;
        zzc = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzky
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzjp zzjpVar = (zzjp) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzua) ((zzajy) zzua.zza().zza(zzkz.zzb(zzjpVar)).zze())).a_()).zza((zzws) zzkz.zzi.zza(zzjpVar.zzg())).zze()));
            }
        }, zzjp.class, zzpf.class);
        zzd = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzkz.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zze = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzla
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzjv zzjvVar = (zzjv) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzkz.zza(zzjvVar).a_(), zzvq.zzb.ASYMMETRIC_PUBLIC, (zzws) zzkz.zzi.zza(zzjvVar.zzb().zzg()), zzjvVar.zza());
            }
        }, zzjv.class, zzpc.class);
        zzf = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzld
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzkz.zzd((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb2, zzpc.class);
        zzg = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                return zzkz.zza((zzjs) zzbpVar, zzcnVar);
            }
        }, zzjs.class, zzpc.class);
        zzh = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzkz.zzc((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
        zzmp zzmpVarZza = zzmm.zza().zza(zzws.RAW, zzjp.zzd.zzc).zza(zzws.TINK, zzjp.zzd.zza);
        zzws zzwsVar = zzws.LEGACY;
        zzjp.zzd zzdVar = zzjp.zzd.zzb;
        zzi = zzmpVarZza.zza(zzwsVar, zzdVar).zza(zzws.CRUNCHY, zzdVar).zza();
        zzj = zzmm.zza().zza(zzur.SHA1, zzjp.zzb.zza).zza(zzur.SHA224, zzjp.zzb.zzb).zza(zzur.SHA256, zzjp.zzb.zzc).zza(zzur.SHA384, zzjp.zzb.zzd).zza(zzur.SHA512, zzjp.zzb.zze).zza();
        zzk = zzmm.zza().zza(zzup.NIST_P256, zzjp.zzc.zza).zza(zzup.NIST_P384, zzjp.zzc.zzb).zza(zzup.NIST_P521, zzjp.zzc.zzc).zza(zzup.CURVE25519, zzjp.zzc.zzd).zza();
        zzl = zzmm.zza().zza(zztu.UNCOMPRESSED, zzjp.zze.zzb).zza(zztu.COMPRESSED, zzjp.zze.zza).zza(zztu.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjp.zze.zzc).zza();
    }

    private static int zza(zzjp.zzc zzcVar) throws GeneralSecurityException {
        if (zzjp.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzjp.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzjp.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzcVar));
    }

    private static zzjp zza(zzws zzwsVar, zzud zzudVar) throws GeneralSecurityException {
        zzjp.zza zzaVarZza = zzjp.zzc().zza(zzi.zza(zzwsVar)).zza(zzk.zza(zzudVar.zzf().zzd())).zza(zzj.zza(zzudVar.zzf().zze())).zza(zzcp.zza(((zzvu) ((zzajy) zzvu.zza().zza(zzudVar.zzb().zzd().zzf()).zza(zzws.RAW).zza(zzudVar.zzb().zzd().zze()).zze())).zzk())).zza(zzzc.zza(zzudVar.zzf().zzf().zzd()));
        if (!zzudVar.zzf().zzd().equals(zzup.CURVE25519)) {
            zzaVarZza.zza(zzl.zza(zzudVar.zza()));
        } else if (!zzudVar.zza().equals(zztu.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzaVarZza.zza();
    }

    public static /* synthetic */ zzpc zza(zzjs zzjsVar, zzcn zzcnVar) throws GeneralSecurityException {
        zzaip zzaipVarZza;
        zzug.zza zzaVarZza = zzug.zzb().zza(0).zza(zza((zzjv) ((zzkr) zzjsVar.zzb())));
        if (zzjsVar.zzc().zzd().equals(zzjp.zzc.zzd)) {
            zzaipVarZza = zzaip.zza(zzjsVar.zzf().zza(zzcn.zza(zzcnVar)));
        } else {
            zzaipVarZza = zzaip.zza(zzmj.zza(zzjsVar.zze().zza(zzcn.zza(zzcnVar)), zza(zzjsVar.zzc().zzd())));
        }
        zzaVarZza.zza(zzaipVarZza);
        return zzpc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzug) ((zzajy) zzaVarZza.zze())).a_(), zzvq.zzb.ASYMMETRIC_PRIVATE, (zzws) zzi.zza(zzjsVar.zzc().zzg()), zzjsVar.zza());
    }

    private static zzuj zza(zzjv zzjvVar) throws GeneralSecurityException {
        zzuj.zza zzaVarZza;
        zzaip zzaipVarZza;
        if (zzjvVar.zzb().zzd().equals(zzjp.zzc.zzd)) {
            zzaVarZza = zzuj.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzaip.zza(zzjvVar.zzd().zzb()));
            zzaipVarZza = zzaip.zza;
        } else {
            int iZza = zza(zzjvVar.zzb().zzd());
            ECPoint eCPointZze = zzjvVar.zze();
            if (eCPointZze == null) {
                throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
            }
            zzaVarZza = zzuj.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzaip.zza(zzmj.zza(eCPointZze.getAffineX(), iZza)));
            zzaipVarZza = zzaip.zza(zzmj.zza(eCPointZze.getAffineY(), iZza));
        }
        return (zzuj) ((zzajy) zzaVarZza.zzb(zzaipVarZza).zze());
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
    public static zzjp zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzpfVar.zza().zzd(), zzua.zza(zzpfVar.zza().zze(), zzajk.zza()).zzc());
            } catch (zzakf e10) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
    }

    private static zzud zzb(zzjp zzjpVar) throws GeneralSecurityException {
        zzum.zza zzaVarZza = zzum.zza().zza((zzup) zzk.zza(zzjpVar.zzd())).zza((zzur) zzj.zza(zzjpVar.zze()));
        if (zzjpVar.zzh() != null && zzjpVar.zzh().zza() > 0) {
            zzaVarZza.zza(zzaip.zza(zzjpVar.zzh().zzb()));
        }
        zzum zzumVar = (zzum) ((zzajy) zzaVarZza.zze());
        try {
            zzvu zzvuVarZza = zzvu.zza(zzcp.zza(zzjpVar.zzb()), zzajk.zza());
            zztx zztxVar = (zztx) ((zzajy) zztx.zza().zza((zzvu) ((zzajy) zzvu.zza().zza(zzvuVarZza.zzf()).zza(zzws.TINK).zza(zzvuVarZza.zze()).zze())).zze());
            zzjp.zze zzeVarZzf = zzjpVar.zzf();
            if (zzeVarZzf == null) {
                zzeVarZzf = zzjp.zze.zza;
            }
            return (zzud) ((zzajy) zzud.zzc().zza(zzumVar).zza(zztxVar).zza((zztu) zzl.zza(zzeVarZzf)).zze());
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjs zzc(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzpcVar.zzf());
        }
        try {
            zzug zzugVarZza = zzug.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzugVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzuj zzujVarZzd = zzugVarZza.zzd();
            if (zzujVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjp zzjpVarZza = zza(zzpcVar.zzb(), zzujVarZzd.zzb());
            return zzjpVarZza.zzd().equals(zzjp.zzc.zzd) ? zzjs.zza(zzjv.zza(zzjpVarZza, zzzc.zza(zzujVarZzd.zzf().zzd()), zzpcVar.zze()), zzze.zza(zzugVarZza.zze().zzd(), zzcn.zza(zzcnVar))) : zzjs.zza(zzjv.zza(zzjpVarZza, new ECPoint(zzmj.zza(zzujVarZzd.zzf().zzd()), zzmj.zza(zzujVarZzd.b_().zzd())), zzpcVar.zze()), zzzf.zza(zzmj.zza(zzugVarZza.zze().zzd()), zzcn.zza(zzcnVar)));
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjv zzd(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzpcVar.zzf());
        }
        try {
            zzuj zzujVarZza = zzuj.zza(zzpcVar.zzd(), zzajk.zza());
            if (zzujVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjp zzjpVarZza = zza(zzpcVar.zzb(), zzujVarZza.zzb());
            if (!zzjpVarZza.zzd().equals(zzjp.zzc.zzd)) {
                return zzjv.zza(zzjpVarZza, new ECPoint(zzmj.zza(zzujVarZza.zzf().zzd()), zzmj.zza(zzujVarZza.b_().zzd())), zzpcVar.zze());
            }
            if (zzujVarZza.b_().zzb() == 0) {
                return zzjv.zza(zzjpVarZza, zzzc.zza(zzujVarZza.zzf().zzd()), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzakf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }
}
