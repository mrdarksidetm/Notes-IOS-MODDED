package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzic {
    public static long zza(long j10, long j11) {
        long j12 = j10 + j11;
        zzid.zza(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long zzb(long j10, long j11) {
        long j12 = (-1) + j10;
        zzid.zza(((1 ^ j10) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, 1L);
        return j12;
    }
}
