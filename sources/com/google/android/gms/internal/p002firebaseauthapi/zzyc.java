package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements zzbg {
    private final zzys zza;
    private final zzci zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzyc(zzys zzysVar, zzci zzciVar, int i10, byte[] bArr) {
        this.zza = zzysVar;
        this.zzb = zzciVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzbg zza(zzcz zzczVar) {
        return new zzyc(new zzxn(zzczVar.zze().zza(zzbq.zza()), zzczVar.zzc().zzd()), new zzyz(new zzyx("HMAC" + String.valueOf(zzczVar.zzc().zzg()), new SecretKeySpec(zzczVar.zzf().zza(zzbq.zza()), "HMAC")), zzczVar.zzc().zze()), zzczVar.zzc().zze(), zzczVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.zzb.zza(bArrCopyOfRange2, zzxv.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.zza.zza(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArrZzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzxv.zza(this.zzd, bArrZzb, this.zzb.zza(zzxv.zza(bArr2, bArrZzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
