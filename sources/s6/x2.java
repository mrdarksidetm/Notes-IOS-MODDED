package s6;

import android.os.Build;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import s6.e2;

/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20386a = f1.a("04750C6DFE71491082415B0566681831A752181624416B6D00BF7A7831C1B43C54275F38FE7B1718864C0F56603B4463AE5B131E2D48376E04BF292F3DC3B83C");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20387b = f1.b(f1.c("76013C"));

    public static a2 a() throws l1 {
        KeyStore keyStoreD = d();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 ? f(f1.a("04750C6DFE71491082415B0566681831A752181624416B6D00BF7A7831C1B43C54275F38FE7B1718864C0F56603B4463AE5B131E2D48376E04BF292F3DC3B83C"), keyStoreD) : i10 >= 28 ? e(f1.a("04750C6DFE71491082415B0566681831A752181624416B6D00BF7A7831C1B43C54275F38FE7B1718864C0F56603B4463AE5B131E2D48376E04BF292F3DC3B83C"), keyStoreD) : b(f1.a("04750C6DFE71491082415B0566681831A752181624416B6D00BF7A7831C1B43C54275F38FE7B1718864C0F56603B4463AE5B131E2D48376E04BF292F3DC3B83C"), keyStoreD);
    }

    public static a2 b(String str, KeyStore keyStore) {
        return new e2(c(str), keyStore);
    }

    public static e2.a c(String str) {
        return new e2.a(str, 16, f1.a("76013C"), 1, f1.b(f1.c("74062C")), f1.b(f1.c("792B3F69AD27464F83")));
    }

    public static KeyStore d() throws l1 {
        try {
            KeyStore keyStore = KeyStore.getInstance(f1.a("762A0B7AA62A4B6A810D6E403E7F19"));
            keyStore.load(null);
            return keyStore;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            throw new l1(-7772, f1.a("72361D67BB6358498D1858143D621D36F60C4D0F5D3B01"), e10);
        }
    }

    public static a2 e(String str, KeyStore keyStore) {
        return new o2(c(str), keyStore);
    }

    public static a2 f(String str, KeyStore keyStore) {
        return new t2(c(str), keyStore);
    }
}
