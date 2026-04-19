package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzby extends Exception {
    private final Throwable zza;
    private final zzrh zzb;
    private final int zzc;
    private final int zzd;

    public zzby(int i10, int i11, Throwable th) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th;
        zzrh zzrhVarZzf = zzri.zzf();
        zzrhVarZzf.zzp(i11);
        zzrhVarZzf.zzq(i10);
        this.zzb = zzrhVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzrh zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
