package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzxz {
    private ECPrivateKey zza;

    public zzxz(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, zzyd zzydVar) throws GeneralSecurityException {
        byte[] bArrZza = zzyb.zza(this.zza, zzyb.zza(this.zza.getParams(), zzydVar, bArr));
        int i11 = 1;
        byte[] bArrZza2 = zzxv.zza(bArr, bArrZza);
        Mac macZza = zzyf.zzb.zza(str);
        if (i10 > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], str));
        } else {
            macZza.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArrDoFinal = macZza.doFinal(bArrZza2);
        byte[] bArr4 = new byte[i10];
        macZza.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal2);
            macZza.update(bArr3);
            macZza.update((byte) i11);
            bArrDoFinal2 = macZza.doFinal();
            if (bArrDoFinal2.length + length >= i10) {
                System.arraycopy(bArrDoFinal2, 0, bArr4, length, i10 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal2, 0, bArr4, length, bArrDoFinal2.length);
            length += bArrDoFinal2.length;
            i11++;
        }
    }
}
