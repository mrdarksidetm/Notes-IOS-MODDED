package v;

import android.hardware.biometrics.BiometricPrompt$CryptoObject;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
class e {

    private static class a {
        static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static KeyGenParameterSpec.Builder b(String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    private static class b {
        static BiometricPrompt$CryptoObject a(Signature signature) {
            return new BiometricPrompt$CryptoObject(signature);
        }

        static BiometricPrompt$CryptoObject b(Cipher cipher) {
            return new BiometricPrompt$CryptoObject(cipher);
        }

        static BiometricPrompt$CryptoObject c(Mac mac) {
            return new BiometricPrompt$CryptoObject(mac);
        }
    }

    private static class c {
        static BiometricPrompt$CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt$CryptoObject(identityCredential);
        }
    }

    static d a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = a.b("androidxBiometric", 3);
            a.d(builderB);
            a.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new d(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    static BiometricPrompt$CryptoObject b(d dVar) {
        IdentityCredential identityCredentialB;
        if (dVar == null) {
            return null;
        }
        Cipher cipherA = dVar.a();
        if (cipherA != null) {
            return b.b(cipherA);
        }
        Signature signatureD = dVar.d();
        if (signatureD != null) {
            return b.a(signatureD);
        }
        Mac macC = dVar.c();
        if (macC != null) {
            return b.c(macC);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialB = dVar.b()) == null) {
            return null;
        }
        return c.a(identityCredentialB);
    }
}
