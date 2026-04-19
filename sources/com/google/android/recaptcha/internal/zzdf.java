package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import md.n;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdf {
    private static zzoa zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzdg zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zznr.zzc(zznr.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;

    public zzdf(int i10, String str, String str2, String str3, String str4, String str5, zzdg zzdgVar, zzbw zzbwVar, Context context, Integer num) {
        this.zzk = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzdgVar;
        this.zzg = context;
        this.zzh = num;
    }

    private final void zzc(int i10, zzod zzodVar) {
        String iSO3Language;
        String strValueOf;
        int i11;
        long longVersionCode;
        int i12;
        String iSO3Country = "";
        zzoo zzooVarZzi = zzop.zzi();
        zzooVarZzi.zzx(this.zzk);
        zzooVarZzi.zzp(this.zzc);
        zzooVarZzi.zzs(this.zzd);
        String str = this.zze;
        if (str != null) {
            zzooVarZzi.zzw(str);
        }
        Integer num = this.zzh;
        if (num != null) {
            zzooVarZzi.zzu(num.intValue());
        }
        if (zzodVar != null) {
            zzooVarZzi.zzr(zzodVar);
        }
        zzooVarZzi.zzy(i10);
        zzooVarZzi.zzv(this.zzi);
        zzooVarZzi.zzq(System.currentTimeMillis() - this.zzj);
        int i13 = zzbb.zza;
        for (zzbd zzbdVar : ((zzbf) n.b(zzdd.zza).getValue()).zza()) {
            zzooVarZzi.zze(0);
        }
        int i14 = zzbq.zza;
        int i15 = this.zzk - 2;
        zzbq.zza((i15 != 4 ? i15 != 5 ? i15 != 6 ? i15 != 7 ? i15 != 14 ? zzbr.zza : zzbr.zzf : zzbr.zze : zzbr.zzd : zzbr.zzc : zzbr.zzb).zza(), zzooVarZzi.zzd() * 1000);
        Context context = this.zzg;
        Set setZza = zzbk.zza(context);
        zzoa zzoaVar = zza;
        if (zzoaVar == null) {
            zzny zznyVarZzf = zzoa.zzf();
            int i16 = Build.VERSION.SDK_INT;
            zznyVarZzf.zze(i16);
            String strValueOf2 = "unknown";
            if (i16 >= 33) {
                i12 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1);
                if (i12 == -1) {
                }
            } else {
                i12 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1);
                strValueOf = i12 == -1 ? "unknown" : String.valueOf(i12);
            }
            zznyVarZzf.zzr(strValueOf);
            zznyVarZzf.zzt("18.5.1");
            zznyVarZzf.zzq(Build.MODEL);
            zznyVarZzf.zzs(Build.MANUFACTURER);
            try {
                i11 = Build.VERSION.SDK_INT;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (i11 >= 33) {
                longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode();
            } else if (i11 >= 28) {
                longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            } else {
                strValueOf2 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                zznyVarZzf.zzp(strValueOf2);
                zzoaVar = (zzoa) zznyVarZzf.zzj();
            }
            strValueOf2 = String.valueOf(longVersionCode);
            zznyVarZzf.zzp(strValueOf2);
            zzoaVar = (zzoa) zznyVarZzf.zzj();
        }
        zza = zzoaVar;
        zzny zznyVar = (zzny) zzoaVar.zzq();
        zznyVar.zzd(setZza);
        zzoa zzoaVar2 = (zzoa) zznyVar.zzj();
        try {
            iSO3Language = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused2) {
            iSO3Language = "";
        }
        try {
            iSO3Country = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused3) {
        }
        String str2 = this.zzb;
        zzpa zzpaVarZzf = zzpb.zzf();
        zzpaVarZzf.zzq(str2);
        zzpaVarZzf.zzd(zzoaVar2);
        zzpaVarZzf.zzp(iSO3Language);
        zzpaVarZzf.zze(iSO3Country);
        zzooVarZzi.zzt((zzpb) zzpaVarZzf.zzj());
        zzrd zzrdVarZzi = zzre.zzi();
        zzrdVarZzi.zzd(zzooVarZzi);
        this.zzf.zza((zzre) zzrdVarZzi.zzj());
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbj zzbjVar) {
        zzoc zzocVarZzg = zzod.zzg();
        zzocVarZzg.zzq(String.valueOf(zzbjVar.zzb().zza()));
        zzocVarZzg.zzd(zzbjVar.zza().zza());
        zzocVarZzg.zzp(zzbjVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbjVar.zzd();
        if (strZzd != null) {
            zzocVarZzg.zze(strZzd);
        }
        zzc(4, (zzod) zzocVarZzg.zzj());
    }
}
