package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    zzct(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzcz.zzj(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i10) {
        int i11 = this.zzd;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i12);
    }
}
