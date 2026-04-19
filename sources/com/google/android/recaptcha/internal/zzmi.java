package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzmi implements zzlu {
    private final zzlx zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzmi(zzlx zzlxVar, String str, Object[] objArr) {
        this.zza = zzlxVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.zzd = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final zzlx zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final int zzc() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
