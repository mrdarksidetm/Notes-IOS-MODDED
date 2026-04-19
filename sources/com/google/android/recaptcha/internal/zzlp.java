package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzlp implements zzml {
    private static final zzlv zza = new zzln();
    private final zzlv zzb;

    public zzlp() {
        zzlv zzlvVar;
        zzlv[] zzlvVarArr = new zzlv[2];
        zzlvVarArr[0] = zzkl.zza();
        try {
            zzlvVar = (zzlv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzlvVar = zza;
        }
        zzlvVarArr[1] = zzlvVar;
        zzlo zzloVar = new zzlo(zzlvVarArr);
        byte[] bArr = zzla.zzb;
        this.zzb = zzloVar;
    }

    private static boolean zzb(zzlu zzluVar) {
        return zzluVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.recaptcha.internal.zzml
    public final zzmk zza(Class cls) {
        zzmd zzmdVarZza;
        zzlk zzlkVarZza;
        zznb zznbVarZzm;
        zzke zzkeVarZza;
        zzls zzlsVarZza;
        zznb zznbVarZzm2;
        zzke zzkeVarZza2;
        zzmm.zzs(cls);
        zzlu zzluVarZzb = this.zzb.zzb(cls);
        if (zzluVarZzb.zzb()) {
            if (zzks.class.isAssignableFrom(cls)) {
                zznbVarZzm2 = zzmm.zzn();
                zzkeVarZza2 = zzkg.zzb();
            } else {
                zznbVarZzm2 = zzmm.zzm();
                zzkeVarZza2 = zzkg.zza();
            }
            return zzmb.zzc(zznbVarZzm2, zzkeVarZza2, zzluVarZzb.zza());
        }
        if (zzks.class.isAssignableFrom(cls)) {
            zzmdVarZza = zzme.zzb();
            zzlkVarZza = zzll.zzb();
            zznbVarZzm = zzmm.zzn();
            zzkeVarZza = zzb(zzluVarZzb) ? zzkg.zzb() : null;
            zzlsVarZza = zzlt.zzb();
        } else {
            zzmdVarZza = zzme.zza();
            zzlkVarZza = zzll.zza();
            zznbVarZzm = zzmm.zzm();
            zzkeVarZza = zzb(zzluVarZzb) ? zzkg.zza() : null;
            zzlsVarZza = zzlt.zza();
        }
        return zzma.zzm(cls, zzluVarZzb, zzmdVarZza, zzlkVarZza, zznbVarZzm, zzkeVarZza, zzlsVarZza);
    }
}
