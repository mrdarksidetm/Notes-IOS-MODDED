package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzj extends zzk {
    private final char zza;

    zzj(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char c10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzh
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
