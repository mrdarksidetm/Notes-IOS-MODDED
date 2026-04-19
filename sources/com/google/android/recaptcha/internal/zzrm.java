package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrm extends zzks implements zzly {
    private static final zzrm zzb;
    private zzkz zzd = zzks.zzz();
    private int zze;

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zzks.zzF(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    private final void zzJ() {
        zzkz zzkzVar = this.zzd;
        if (zzkzVar.zzc()) {
            return;
        }
        this.zzd = zzks.zzA(zzkzVar);
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzrm zzrmVar, zzrl zzrlVar) {
        zzrlVar.getClass();
        zzrmVar.zzJ();
        zzrmVar.zzd.add(zzrlVar);
    }

    static /* synthetic */ void zzj(zzrm zzrmVar, Iterable iterable) {
        zzrmVar.zzJ();
        zzig.zzc(iterable, zzrmVar.zzd);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzrl.class, "zze"});
        }
        if (i11 == 3) {
            return new zzrm();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzrj(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
