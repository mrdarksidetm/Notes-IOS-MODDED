package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzjg {
    private static final zzzc zza;
    private static final zzon<zziv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzio, zzpc> zzd;
    private static final zzms<zzpc> zze;
    private static final Map<zziv.zzb, zzws> zzf;
    private static final Map<zzws, zziv.zzb> zzg;

    static {
        zzzc zzzcVarZzb = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzzcVarZzb;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zziv zzivVar = (zziv) zzchVar;
                return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztl) ((zzajy) zztl.zzc().zza(zzivVar.zzb()).zze())).a_()).zza(zzjg.zza(zzivVar.zzd())).zze()));
            }
        }, zziv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzji
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                return zzjg.zzb((zzpf) zzpjVar);
            }
        }, zzzcVarZzb, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzio zzioVar = (zzio) zzbpVar;
                return zzpc.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzti) ((zzajy) zzti.zzb().zza(zzaip.zza(zzioVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzjg.zza(zzioVar.zzc().zzd()), zzioVar.zza());
            }
        }, zzio.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                return zzjg.zzb((zzpc) zzpjVar, zzcnVar);
            }
        }, zzzcVarZzb, zzpc.class);
        HashMap map = new HashMap();
        zziv.zzb zzbVar = zziv.zzb.zzc;
        zzws zzwsVar = zzws.RAW;
        map.put(zzbVar, zzwsVar);
        zziv.zzb zzbVar2 = zziv.zzb.zza;
        zzws zzwsVar2 = zzws.TINK;
        map.put(zzbVar2, zzwsVar2);
        zziv.zzb zzbVar3 = zziv.zzb.zzb;
        zzws zzwsVar3 = zzws.CRUNCHY;
        map.put(zzbVar3, zzwsVar3);
        zzf = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzws.class);
        enumMap.put(zzwsVar, zzbVar);
        enumMap.put(zzwsVar2, zzbVar2);
        enumMap.put(zzwsVar3, zzbVar3);
        enumMap.put(zzws.LEGACY, zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zziv.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        Map<zzws, zziv.zzb> map = zzg;
        if (map.containsKey(zzwsVar)) {
            return map.get(zzwsVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    private static zzws zza(zziv.zzb zzbVar) throws GeneralSecurityException {
        Map<zziv.zzb, zzws> map = zzf;
        if (map.containsKey(zzbVar)) {
            return map.get(zzbVar);
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
    public static zzio zzb(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzti zztiVarZza = zzti.zza(zzpcVar.zzd(), zzajk.zza());
            if (zztiVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzio.zzb().zza(zziv.zzc().zza(zztiVarZza.zzd().zzb()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zztiVarZza.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zziv zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zztl zztlVarZza = zztl.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zztlVarZza.zzb() == 0) {
                return zziv.zzc().zza(zztlVarZza.zza()).zza(zza(zzpfVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf e10) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
        }
    }
}
