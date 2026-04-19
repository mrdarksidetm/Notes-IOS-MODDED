package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class zzle implements zzll {
    private final String zza;

    zzle(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        Mac macZza = zzyf.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], this.zza));
        } else {
            macZza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return macZza.doFinal(bArr);
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Mac macZza = zzyf.zzb.zza(this.zza);
        if (i10 > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i10];
        macZza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal);
            macZza.update(bArr2);
            macZza.update((byte) i11);
            bArrDoFinal = macZza.doFinal();
            if (bArrDoFinal.length + length >= i10) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i10 - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i11++;
        }
    }

    final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlq.zza(str, bArr2, bArr3), bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) {
        return zza(bArr, zzlq.zza(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) {
        return zza(zza(zzlq.zza(str, bArr2, bArr4), null), zzlq.zza(str2, bArr3, bArr4, i10), i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzb() throws GeneralSecurityException {
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "HmacSha256":
                return zzlq.zzf;
            case "HmacSha384":
                return zzlq.zzg;
            case "HmacSha512":
                return zzlq.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
