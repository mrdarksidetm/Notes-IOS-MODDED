package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import le.x;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgo {
    final /* synthetic */ zzgv zza;
    private Long zzb;
    private final zzgz zzc = zzgz.zzb();

    public zzgo(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzgv zzgvVar = this.zza;
        if (zzgvVar.zzq().zzb == null) {
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzopVarZzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zze(zzopVarZzJ);
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        this.zza.zzl.zze((zzre) zzrdVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzqz zzqzVarZzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzqzVarZzg.zzi().name();
        if (zzqzVarZzg.zzi() == zzrc.JS_CODE_SUCCESS) {
            this.zza.zzu().hashCode();
            if (this.zza.zzu().L(i0.f15558a)) {
                return;
            }
            this.zza.zzu().hashCode();
            return;
        }
        zzqzVarZzg.zzi().name();
        int i10 = zzbj.zza;
        zzbj zzbjVarZza = zzbi.zza(zzqzVarZzg.zzi());
        this.zza.zzu().hashCode();
        this.zza.zzu().a(zzbjVarZza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzdv zzdvVar = this.zza.zzb;
        if (zzdvVar == null) {
            zzdvVar = null;
        }
        zzdvVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzpw zzpwVarZzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzpwVarZzi.toString();
        x xVar = (x) this.zza.zzi.remove(zzpwVarZzi.zzk());
        if (xVar != null) {
            xVar.L(zzpwVarZzi);
        }
    }
}
