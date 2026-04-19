package com.google.android.recaptcha.internal;

import android.os.Build;
import com.amazon.a.a.o.b.f;
import md.i0;
import nd.p;
import nd.u;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements zzaa {
    private final zzdc zza;

    public zzn(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    private static final zzrl zzg(String str) {
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(str);
        return (zzrl) zzrkVarZzf.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrjVarZzf.zzd(u.p(zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(p.q0(Build.SUPPORTED_ABIS, f.f7478a, "[", "]", 0, null, null, 56, null))));
        zzdfVarZzb.zza();
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
