package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzua;

/* JADX INFO: loaded from: classes.dex */
public final class zzkm {
    public static final zzvu zza;
    private static final byte[] zzb;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzup zzupVar = zzup.NIST_P256;
        zzur zzurVar = zzur.SHA256;
        zztu zztuVar = zztu.UNCOMPRESSED;
        zzvu zzvuVar = zzct.zza;
        zzws zzwsVar = zzws.TINK;
        zza = zza(zzupVar, zzurVar, zztuVar, zzvuVar, zzwsVar, bArr);
        zza(zzupVar, zzurVar, zztu.COMPRESSED, zzvuVar, zzws.RAW, bArr);
        zza(zzupVar, zzurVar, zztuVar, zzct.zzb, zzwsVar, bArr);
    }

    @Deprecated
    private static zzvu zza(zzup zzupVar, zzur zzurVar, zztu zztuVar, zzvu zzvuVar, zzws zzwsVar, byte[] bArr) {
        zzua.zza zzaVarZza = zzua.zza();
        zzum zzumVar = (zzum) ((zzajy) zzum.zza().zza(zzupVar).zza(zzurVar).zza(zzaip.zza(bArr)).zze());
        return (zzvu) ((zzajy) zzvu.zza().zza(zzjl.zza()).zza(zzwsVar).zza(((zzua) ((zzajy) zzaVarZza.zza((zzud) ((zzajy) zzud.zzc().zza(zzumVar).zza((zztx) ((zzajy) zztx.zza().zza(zzvuVar).zze())).zza(zztuVar).zze())).zze())).a_()).zze());
    }
}
