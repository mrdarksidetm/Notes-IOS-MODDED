package com.google.android.recaptcha.internal;

import android.os.Build;
import md.i0;
import nd.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad implements zzaa {
    private final zzdc zza;

    public zzad(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        int i10 = Build.VERSION.SDK_INT;
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(String.valueOf(i10));
        zzrjVarZzf.zzd(t.d(zzrkVarZzf.zzj()));
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzab.zzc(this).zza();
        return i0.f15558a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
