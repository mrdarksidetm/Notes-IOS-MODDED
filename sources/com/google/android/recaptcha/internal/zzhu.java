package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhu extends zzhk implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    zzhu(String str, String str2) {
        MessageDigest messageDigestZzc = zzc("SHA-256");
        this.zza = messageDigestZzc;
        this.zzb = messageDigestZzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(messageDigestZzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzho
    public final zzhp zzb() {
        zzhs zzhsVar = null;
        if (this.zzc) {
            try {
                return new zzht((MessageDigest) this.zza.clone(), this.zzb, zzhsVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzht(zzc(this.zza.getAlgorithm()), this.zzb, zzhsVar);
    }
}
