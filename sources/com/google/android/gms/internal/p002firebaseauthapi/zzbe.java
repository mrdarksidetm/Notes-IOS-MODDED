package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public static long zza(long j10, long j11) {
        long j12 = j10 + j11;
        zzbd.zza(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long zzb(long j10, long j11) {
        long j12 = j10 - 1;
        zzbd.zza(((1 ^ j10) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, 1L);
        return j12;
    }
}
