package s6;

import android.security.keystore.KeyInfo;
import android.security.keystore.KeyProtection;
import com.google.android.gms.common.api.a;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import s6.b2;

/* JADX INFO: loaded from: classes.dex */
public class e2 extends b2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20059d;

    public static class a extends b2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f20063f;

        public a(String str, int i10, String str2, int i11, String str3, String str4) {
            super(str, str2);
            if (i10 <= 0) {
                throw new IllegalArgumentException(f1.a("5B21016FBD2B0F5185065C5971600921EB42484A3C17206D51AD7E682882E46E59645F"));
            }
            this.f20060c = i10;
            this.f20061d = i11;
            this.f20062e = str3;
            this.f20063f = str4;
        }

        public String c() {
            return this.f20062e;
        }

        public int d() {
            return this.f20060c;
        }

        public String e() {
            return this.f20063f;
        }

        public int f() {
            return this.f20061d;
        }
    }

    public e2(a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
        this.f20059d = aVar;
    }

    @Override // s6.b2
    public Key a(KeyStore.Entry entry) {
        return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
    }

    @Override // s6.b2
    public KeyStore.Entry b(Date date) {
        return new KeyStore.SecretKeyEntry(new SecretKeySpec(new byte[this.f20059d.d()], this.f20059d.a()));
    }

    @Override // s6.a2
    public boolean d() {
        return t().isInsideSecureHardware();
    }

    @Override // s6.b2
    public KeyStore.ProtectionParameter h(Date date) {
        return new KeyProtection.Builder(this.f20059d.f()).setBlockModes(this.f20059d.c()).setEncryptionPaddings(this.f20059d.e()).setUserAuthenticationRequired(false).setUserAuthenticationValidityDurationSeconds(a.e.API_PRIORITY_OTHER).build();
    }

    @Override // s6.b2
    public void j(Key key) throws InvalidKeyException {
        Cipher.getInstance(f1.a("76013C278A016C0EAA1B6D553569153CF8")).init(1, key);
    }

    @Override // s6.b2
    public Class<? extends KeyStore.Entry> m() {
        return KeyStore.SecretKeyEntry.class;
    }

    public final KeyInfo r(SecretKey secretKey) throws l1 {
        try {
            return (KeyInfo) SecretKeyFactory.getInstance(secretKey.getAlgorithm(), f1.a("762A0B7AA62A4B6A810D6E403E7F19")).getKeySpec(secretKey, KeyInfo.class);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            throw super.i(e);
        } catch (NoSuchProviderException e11) {
            e = e11;
            throw super.i(e);
        } catch (ProviderException e12) {
            e = e12;
            throw super.i(e);
        } catch (InvalidKeySpecException e13) {
            throw super.c(e13);
        }
    }

    public final void s(Key key, KeyInfo keyInfo) throws l1 {
        int purposes = keyInfo.getPurposes();
        int keySize = keyInfo.getKeySize() / 8;
        String algorithm = key.getAlgorithm();
        if (purposes != this.f20059d.f() || keySize != this.f20059d.d() || !this.f20059d.a().equals(algorithm)) {
            throw new l1(-7779, null);
        }
    }

    public KeyInfo t() throws l1 {
        Key keyC = c();
        KeyInfo keyInfoR = r((SecretKey) keyC);
        s(keyC, keyInfoR);
        return keyInfoR;
    }
}
