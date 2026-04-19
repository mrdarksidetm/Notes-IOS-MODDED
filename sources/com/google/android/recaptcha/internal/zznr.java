package com.google.android.recaptcha.internal;

import com.revenuecat.purchases.common.UtilsKt;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zznr {
    private static final ThreadLocal zza;

    static {
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(-62135596800L);
        zzmyVarZzi.zzd(0);
        zzmy zzmyVarZzi2 = zzmz.zzi();
        zzmyVarZzi2.zze(253402300799L);
        zzmyVarZzi2.zzd(999999999);
        zzmy zzmyVarZzi3 = zzmz.zzi();
        zzmyVarZzi3.zze(0L);
        zzmyVarZzi3.zzd(0);
        zza = new zznq();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmzVar) {
        long jZzg = zzmzVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzmzVar.zzf();
        if (!zZze || iZzf < 0 || iZzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzmzVar;
    }

    public static zzmz zzb(long j10) {
        long jZza = j10 / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(jZza)));
        }
        int i10 = (int) ((j10 % 1000) * 1000000);
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            jZza = zzic.zza(jZza, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            jZza = zzic.zzb(jZza, 1L);
        }
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(jZza);
        zzmyVarZzi.zzd(i10);
        zzmz zzmzVar = (zzmz) zzmyVarZzi.zzj();
        zza(zzmzVar);
        return zzmzVar;
    }

    public static String zzc(zzmz zzmzVar) {
        zza(zzmzVar);
        long jZzg = zzmzVar.zzg();
        int iZzf = zzmzVar.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb2.append(".");
            sb2.append(iZzf % UtilsKt.MICROS_MULTIPLIER == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / UtilsKt.MICROS_MULTIPLIER)) : iZzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf)));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j10) {
        return j10 >= -62135596800L && j10 <= 253402300799L;
    }
}
