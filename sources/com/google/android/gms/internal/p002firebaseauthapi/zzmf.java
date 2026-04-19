package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class zzmf implements zzcd {
    private static final Object zza = new Object();

    public static final class zza {
        public zza() {
            zzmf.zza();
        }
    }

    public zzmf() {
        this(new zza());
    }

    private zzmf(zza zzaVar) {
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    static boolean zzc(String str) {
        synchronized (zza) {
            String strZza = zzzb.zza("android-keystore://", str);
            if (zzme.zzb(strZza)) {
                return false;
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strZza, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final zzbg zza(String str) throws GeneralSecurityException {
        zzmg zzmgVar;
        try {
            synchronized (zza) {
                zzmgVar = new zzmg(zzzb.zza("android-keystore://", str));
                byte[] bArrZza = zzpe.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrZza, zzmgVar.zza(zzmgVar.zzb(bArrZza, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzmgVar;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
