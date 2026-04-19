package s6;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.util.UUID;
import javax.crypto.Cipher;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends e0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20315l = f1.a("6325037BAC206D488A10545A36");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20316m = f1.b(f1.c("762A0B7AA62A4B6A810D6E403E7F19"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20317n = f1.b(f1.c("65172E278C006D0EB43F7E67605D1D36FB0B4448"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x1 f20318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f2 f20319k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20321b;

        public a(boolean z10, boolean z11) {
            this.f20320a = z10;
            this.f20321b = z11;
        }
    }

    public t1(h3 h3Var, u6.k kVar, Context context, f2 f2Var) {
        super(h3Var, kVar);
        this.f20318j = new x1(context);
        this.f20319k = f2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 C(Context context) {
        boolean z10 = !D();
        a aVarA = A(context);
        return new n0(z10, !aVarA.f20320a, !aVarA.f20321b);
    }

    public final a A(Context context) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f1.a("762A0B7AA62A4B6A810D6E403E7F19"));
            keyStore.load(null);
            PublicKey publicKeyE = this.f20318j.e();
            if (publicKeyE != null) {
                if (!keyStore.containsAlias(f1.b(f1.c("6325037BAC206D488A10545A36")))) {
                    t(f1.b(f1.c("532D0B43AC3A7C558B065877396C1235FA")), f1.b(f1.c("56280669BA63414E90545B5B246318")));
                    y(keyStore, context);
                    return new a(false, true);
                }
                KeyStore.PrivateKeyEntry privateKeyEntryX = x(keyStore);
                if (privateKeyEntryX != null) {
                    if (z(publicKeyE, privateKeyEntryX, UUID.randomUUID().toString())) {
                        return new a(false, false);
                    }
                    t(f1.b(f1.c("532D0B43AC3A7C558B065877396C1235FA")), f1.b(f1.c("5C211678A82A5D01891D4E5930791F3A")));
                    return new a(true, false);
                }
            }
            y(keyStore, context);
            return new a(false, false);
        } catch (Exception unused) {
            return new a(false, false);
        }
    }

    public void B(final Context context) {
        super.v(b(new c.a() { // from class: s6.s1
            @Override // u6.c.a
            public final n0 run() {
                return this.f20296a.C(context);
            }
        }));
    }

    public final boolean D() {
        String strA = this.f20319k.a();
        if (strA == null) {
            return false;
        }
        if (this.f20318j.c()) {
            String strD = this.f20318j.d();
            if (!strA.equals(strD)) {
                t(f1.a("532D0B49A7275D4E8D10745012651D3CF807"), f1.b(f1.c("78280B32E9")) + strD + f1.b(f1.c("1B64016DBE790F")) + strA);
                return true;
            }
        } else {
            this.f20318j.a(strA);
        }
        return false;
    }

    @Override // s6.j1
    public void a(Context context) {
        B(context);
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public final KeyStore.PrivateKeyEntry x(KeyStore keyStore) {
        try {
            KeyStore.Entry entry = keyStore.getEntry(f1.a("6325037BAC206D488A10545A36"), null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void y(KeyStore keyStore, Context context) {
        try {
            if (keyStore.containsAlias(f1.a("6325037BAC206D488A10545A36"))) {
                keyStore.deleteEntry(f1.b(f1.c("6325037BAC206D488A10545A36")));
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f1.b(f1.c("65172E")), f1.b(f1.c("762A0B7AA62A4B6A810D6E403E7F19")));
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(f1.b(f1.c("6325037BAC206D488A10545A36")), 3).setKeySize(2048).setEncryptionPaddings(f1.b(f1.c("670F2C5BF8134E45801D5353"))).setUserAuthenticationRequired(false).build());
            PublicKey publicKey = keyPairGenerator.generateKeyPair().getPublic();
            if (keyStore.containsAlias(f1.b(f1.c("6325037BAC206D488A10545A36")))) {
                this.f20318j.b(publicKey);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean z(PublicKey publicKey, KeyStore.PrivateKeyEntry privateKeyEntry, String str) {
        try {
            Cipher cipher = Cipher.getInstance(f1.a("65172E278C006D0EB43F7E67605D1D36FB0B4448"));
            cipher.init(1, publicKey);
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
            Cipher cipher2 = Cipher.getInstance(f1.b(f1.c("65172E278C006D0EB43F7E67605D1D36FB0B4448")));
            cipher2.init(2, privateKeyEntry.getPrivateKey());
            return str.equals(new String(cipher2.doFinal(bArrDoFinal), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            return true;
        }
    }
}
