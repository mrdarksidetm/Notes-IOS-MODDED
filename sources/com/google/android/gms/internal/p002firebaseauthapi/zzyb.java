package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class zzyb {
    public static int zza(EllipticCurve ellipticCurve) {
        return (zzmk.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerZza = zzmk.zza(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZza);
        if (bigIntegerZza.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZza);
        BigInteger bigIntegerAdd = null;
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigInteger2)) {
            if (bigIntegerZza.testBit(0) && bigIntegerZza.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerZza.add(BigInteger.ONE).shiftRight(2), bigIntegerZza);
            } else if (bigIntegerZza.testBit(0) && !bigIntegerZza.testBit(1)) {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerZza.subtract(bigIntegerAdd).shiftRight(1);
                int i10 = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZza);
                    if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZza);
                    BigInteger bigIntegerMod4 = BigInteger.ONE;
                    if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerZza)) {
                        BigInteger bigIntegerShiftRight2 = bigIntegerZza.add(bigIntegerMod4).shiftRight(1);
                        BigInteger bigIntegerMod5 = bigIntegerAdd;
                        for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                            BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                            bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZza).multiply(bigIntegerMod3)).mod(bigIntegerZza);
                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZza);
                            if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZza);
                                bigIntegerMod5 = bigIntegerMod7;
                            } else {
                                bigIntegerMod4 = bigIntegerMod6;
                            }
                        }
                        bigIntegerAdd = bigIntegerMod5;
                    } else {
                        if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                        i10++;
                        if (i10 == 128 && !bigIntegerZza.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerZza).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger2 = bigIntegerAdd;
        }
        return z10 != bigInteger2.testBit(0) ? bigIntegerZza.subtract(bigInteger2).mod(bigIntegerZza) : bigInteger2;
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGeneratorZza = zzyf.zzd.zza("EC");
        keyPairGeneratorZza.initialize(eCParameterSpec);
        return keyPairGeneratorZza.generateKeyPair();
    }

    public static ECPrivateKey zza(zzya zzyaVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) zzyf.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzmj.zza(bArr), zza(zzyaVar)));
    }

    public static ECPublicKey zza(zzya zzyaVar, zzyd zzydVar, byte[] bArr) {
        return zza(zza(zzyaVar), zzydVar, bArr);
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzyd zzydVar, byte[] bArr) {
        return (ECPublicKey) zzyf.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzydVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzya zzyaVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzyaVar.ordinal();
        if (iOrdinal == 0) {
            return zzmk.zza;
        }
        if (iOrdinal == 1) {
            return zzmk.zzb;
        }
        if (iOrdinal == 2) {
            return zzmk.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + String.valueOf(zzyaVar));
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzyd zzydVar, byte[] bArr) throws GeneralSecurityException {
        ECPoint eCPoint;
        int iZza = zza(ellipticCurve);
        int iOrdinal = zzydVar.ordinal();
        boolean z10 = false;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                BigInteger bigIntegerZza = zzmk.zza(ellipticCurve);
                if (bArr.length != iZza + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                byte b10 = bArr[0];
                if (b10 != 2) {
                    if (b10 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z10 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerZza) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                return new ECPoint(bigInteger, zza(bigInteger, z10, ellipticCurve));
            }
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:" + String.valueOf(zzydVar));
            }
            if (bArr.length != iZza * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iZza)), new BigInteger(1, Arrays.copyOfRange(bArr, iZza, bArr.length)));
        } else {
            if (bArr.length != (iZza * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i10 = iZza + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i10)), new BigInteger(1, Arrays.copyOfRange(bArr, i10, bArr.length)));
        }
        zzmk.zza(eCPoint, ellipticCurve);
        return eCPoint;
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        zzmk.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        return zza(eCPrivateKey, eCPublicKey.getW());
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zzmk.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = zzyf.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement keyAgreementZza = zzyf.zzc.zza("ECDH");
        keyAgreementZza.init(eCPrivateKey);
        try {
            keyAgreementZza.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementZza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmk.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return bArrGenerateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzmk.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
