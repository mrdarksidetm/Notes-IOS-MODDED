package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpj extends zzks implements zzly {
    private static final zzpj zzb;
    private int zzd;
    private zzph zze;
    private zzph zzf;

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zzks.zzF(zzpj.class, zzpjVar);
    }

    private zzpj() {
    }

    public static zzpj zzj(byte[] bArr) {
        return (zzpj) zzks.zzv(zzb, bArr);
    }

    public final zzph zzf() {
        zzph zzphVar = this.zze;
        return zzphVar == null ? zzph.zzg() : zzphVar;
    }

    public final zzph zzg() {
        zzph zzphVar = this.zzf;
        return zzphVar == null ? zzph.zzg() : zzphVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzpj();
        }
        zzpf zzpfVar = null;
        if (i11 == 4) {
            return new zzpi(zzpfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
