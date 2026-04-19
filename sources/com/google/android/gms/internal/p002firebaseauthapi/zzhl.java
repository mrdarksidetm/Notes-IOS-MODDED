package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzhl {
    int[] zza;
    private final int zzb;

    public zzhl(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhk.zza(bArr);
        this.zzb = i10;
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = (iRemaining / 64) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBufferZza = zza(bArr, this.zzb + i11);
            if (i11 == i10 - 1) {
                zzxv.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
            } else {
                zzxv.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
            }
        }
    }

    abstract int zza();

    final ByteBuffer zza(byte[] bArr, int i10) {
        int[] iArrZza = zza(zzhk.zza(bArr), i10);
        int[] iArr = (int[]) iArrZza.clone();
        zzhk.zza(iArr);
        for (int i11 = 0; i11 < iArrZza.length; i11++) {
            iArrZza[i11] = iArrZza[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    abstract int[] zza(int[] iArr, int i10);
}
