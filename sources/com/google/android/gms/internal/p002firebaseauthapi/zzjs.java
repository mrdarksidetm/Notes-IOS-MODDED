package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzjs extends zzko {
    private final zzjv zza;
    private final zzzf zzb;
    private final zzze zzc;

    private zzjs(zzjv zzjvVar, zzzf zzzfVar, zzze zzzeVar) {
        this.zza = zzjvVar;
        this.zzb = zzzfVar;
        this.zzc = zzzeVar;
    }

    public static zzjs zza(zzjv zzjvVar, zzze zzzeVar) throws GeneralSecurityException {
        if (zzjvVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzjvVar.zzd() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzzeVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] bArrZza = zzzeVar.zza(zzbq.zza());
        byte[] bArrZzb = zzjvVar.zzd().zzb();
        if (bArrZza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzza.zza(bArrZza), bArrZzb)) {
            return new zzjs(zzjvVar, null, zzzeVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static zzjs zza(zzjv zzjvVar, zzzf zzzfVar) throws GeneralSecurityException {
        if (zzjvVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzjvVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        if (zzzfVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        BigInteger bigIntegerZza = zzzfVar.zza(zzbq.zza());
        ECPoint eCPointZze = zzjvVar.zze();
        zzjp.zzc zzcVarZzd = zzjvVar.zzb().zzd();
        BigInteger order = zza(zzcVarZzd).getOrder();
        if (bigIntegerZza.signum() <= 0 || bigIntegerZza.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzmk.zza(bigIntegerZza, zza(zzcVarZzd)).equals(eCPointZze)) {
            return new zzjs(zzjvVar, zzzfVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    private static ECParameterSpec zza(zzjp.zzc zzcVar) {
        if (zzcVar == zzjp.zzc.zza) {
            return zzmk.zza;
        }
        if (zzcVar == zzjp.zzc.zzb) {
            return zzmk.zzb;
        }
        if (zzcVar == zzjp.zzc.zzc) {
            return zzmk.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko, com.google.android.gms.internal.p002firebaseauthapi.zzck
    public final /* synthetic */ zzbp zzb() {
        return (zzjv) zzb();
    }

    public final zzjp zzc() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzkr zzb() {
        return this.zza;
    }

    public final zzzf zze() {
        return this.zzb;
    }

    public final zzze zzf() {
        return this.zzc;
    }
}
