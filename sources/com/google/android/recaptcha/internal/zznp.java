package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zznp {
    static {
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(-315576000000L);
        zzjzVarZzi.zzd(-999999999);
        zzjz zzjzVarZzi2 = zzka.zzi();
        zzjzVarZzi2.zze(315576000000L);
        zzjzVarZzi2.zzd(999999999);
        zzjz zzjzVarZzi3 = zzka.zzi();
        zzjzVarZzi3.zze(0L);
        zzjzVarZzi3.zzd(0);
    }

    public static zzka zza(long j10) {
        int i10 = (int) (j10 % 1000000000);
        long jZza = j10 / 1000000000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            jZza = zzic.zza(jZza, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (jZza > 0 && i10 < 0) {
            i10 += 1000000000;
            jZza--;
        }
        if (jZza < 0 && i10 > 0) {
            i10 -= 1000000000;
            jZza++;
        }
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(jZza);
        zzjzVarZzi.zzd(i10);
        zzka zzkaVar = (zzka) zzjzVarZzi.zzj();
        long jZzg = zzkaVar.zzg();
        int iZzf = zzkaVar.zzf();
        if (jZzg < -315576000000L || jZzg > 315576000000L || iZzf < -999999999 || iZzf >= 1000000000 || ((jZzg < 0 || iZzf < 0) && (jZzg > 0 || iZzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzkaVar;
    }
}
