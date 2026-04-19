package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzfp implements zzgj {
    private static final zzfv zza = new zzfn();
    private final zzfv zzb;

    public zzfp() {
        zzfv zzfvVar;
        zzfv[] zzfvVarArr = new zzfv[2];
        zzfvVarArr[0] = zzes.zza();
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfvVar = zza;
        }
        zzfvVarArr[1] = zzfvVar;
        zzfo zzfoVar = new zzfo(zzfvVarArr);
        byte[] bArr = zzfa.zzd;
        this.zzb = zzfoVar;
    }

    private static boolean zzb(zzfu zzfuVar) {
        return zzfuVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgj
    public final zzgi zza(Class cls) {
        zzgc zzgcVarZza;
        zzfl zzflVarZzc;
        zzgz zzgzVarZza;
        zzem zzemVarZza;
        zzfs zzfsVarZza;
        zzgz zzgzVarZza2;
        zzem zzemVarZza2;
        zzgk.zze(cls);
        zzfu zzfuVarZzb = this.zzb.zzb(cls);
        if (zzfuVarZzb.zzb()) {
            if (zzev.class.isAssignableFrom(cls)) {
                zzgzVarZza2 = zzgk.zzb();
                zzemVarZza2 = zzeo.zzb();
            } else {
                zzgzVarZza2 = zzgk.zza();
                zzemVarZza2 = zzeo.zza();
            }
            return zzgb.zzb(zzgzVarZza2, zzemVarZza2, zzfuVarZzb.zza());
        }
        if (zzev.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzfuVarZzb);
            zzgcVarZza = zzgd.zzb();
            zzflVarZzc = zzfl.zzd();
            zzgzVarZza = zzgk.zzb();
            zzemVarZza = zZzb ? zzeo.zzb() : null;
            zzfsVarZza = zzft.zzb();
        } else {
            boolean zZzb2 = zzb(zzfuVarZzb);
            zzgcVarZza = zzgd.zza();
            zzflVarZzc = zzfl.zzc();
            zzgzVarZza = zzgk.zza();
            zzemVarZza = zZzb2 ? zzeo.zza() : null;
            zzfsVarZza = zzft.zza();
        }
        return zzga.zzj(cls, zzfuVarZzb, zzgcVarZza, zzflVarZzc, zzgzVarZza, zzemVarZza, zzfsVarZza);
    }
}
