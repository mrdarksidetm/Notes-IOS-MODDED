package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zziq extends zziu {
    private final int zzc;

    zziq(byte[] bArr, int i10, int i11) {
        super(bArr);
        zziv.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zziu) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    final byte zzb(int i10) {
        return ((zziu) this).zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zziu
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zziu) this).zza, 0, bArr, 0, i12);
    }
}
