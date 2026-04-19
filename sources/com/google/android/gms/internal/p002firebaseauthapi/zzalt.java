package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzalt implements zzala {
    private final zzalc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzalt(zzalc zzalcVar, String str, Object[] objArr) {
        this.zza = zzalcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.zzd = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final zzalo zzb() {
        int i10 = this.zzd;
        return (i10 & 1) != 0 ? zzalo.PROTO2 : (i10 & 4) == 4 ? zzalo.EDITIONS : zzalo.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
