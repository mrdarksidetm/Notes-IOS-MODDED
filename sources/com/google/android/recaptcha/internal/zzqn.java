package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqn extends zzks implements zzly {
    private static final zzqn zzb;
    private int zzd;
    private String zze = "";
    private zzkz zzf = zzks.zzz();

    static {
        zzqn zzqnVar = new zzqn();
        zzb = zzqnVar;
        zzks.zzF(zzqn.class, zzqnVar);
    }

    private zzqn() {
    }

    public static zzqm zzf() {
        return (zzqm) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqn zzqnVar, String str) {
        str.getClass();
        zzqnVar.zzd |= 1;
        zzqnVar.zze = str;
    }

    static /* synthetic */ void zzj(zzqn zzqnVar, zzql zzqlVar) {
        zzqlVar.getClass();
        zzkz zzkzVar = zzqnVar.zzf;
        if (!zzkzVar.zzc()) {
            zzqnVar.zzf = zzks.zzA(zzkzVar);
        }
        zzqnVar.zzf.add(zzqlVar);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zzf", zzql.class, "zze"});
        }
        if (i11 == 3) {
            return new zzqn();
        }
        zzqi zzqiVar = null;
        if (i11 == 4) {
            return new zzqm(zzqiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
