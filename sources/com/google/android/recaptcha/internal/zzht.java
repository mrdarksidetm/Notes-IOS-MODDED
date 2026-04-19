package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzht extends zzhj {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzht(MessageDigest messageDigest, int i10, zzhs zzhsVar) {
        this.zza = messageDigest;
        this.zzb = i10;
    }

    private final void zzc() {
        zzgx.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzhj
    protected final void zza(byte[] bArr, int i10, int i11) {
        zzc();
        this.zza.update(bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhp
    public final zzhn zzb() {
        zzc();
        this.zzc = true;
        int i10 = this.zzb;
        if (i10 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i11 = zzhn.zzb;
            return new zzhm(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i10);
        int i12 = zzhn.zzb;
        return new zzhm(bArrCopyOf);
    }
}
