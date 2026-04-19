package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class zzmg implements zzbg {
    private static final String zza = "zzmg";
    private final zzbg zzb;

    public zzmg(String str) {
        this.zzb = zzme.zza(str);
    }

    private static void zza() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        try {
            return this.zzb.zza(bArr, bArr2);
        } catch (GeneralSecurityException e10) {
            e = e10;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (ProviderException e11) {
            e = e11;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (BadPaddingException e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        try {
            return this.zzb.zzb(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            zza();
            return this.zzb.zzb(bArr, bArr2);
        }
    }
}
