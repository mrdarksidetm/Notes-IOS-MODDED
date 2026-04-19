package com.google.android.recaptcha.internal;

import md.i0;
import md.x;
import nd.q0;
import nd.t;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements zzaa {
    private final zzdc zza;
    private final zzbl zzb;
    private boolean zzc = true;

    public zzp(zzdc zzdcVar, zzbl zzblVar) {
        this.zza = zzdcVar;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzbl zzblVar = this.zzb;
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        String strZza = zzblVar.zza();
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(strZza);
        zzrjVarZzf.zzd(t.d(zzrkVarZzf.zzj()));
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzdf zzdfVarZzc = zzab.zzc(this);
        if (zzpsVar.zzJ().length() == 0) {
            this.zzc = false;
            zzdfVarZzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
        } else {
            this.zzb.zzb(q0.c(x.a("_GRECAPTCHA_KC", zzpsVar.zzJ())));
            zzdfVarZzc.zza();
        }
        return i0.f15558a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
