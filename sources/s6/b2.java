package s6;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.util.Date;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20009c = f1.a("762A0B7AA62A4B6A810D6E403E7F19");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyStore f20011b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20013b;

        public a(String str, String str2) {
            this.f20012a = str;
            this.f20013b = str2;
        }

        public String a() {
            return this.f20013b;
        }

        public String b() {
            return this.f20012a;
        }
    }

    public b2(a aVar, KeyStore keyStore) {
        this.f20010a = aVar;
        if (!g(keyStore)) {
            throw new IllegalArgumentException(f1.a("67251C7BAC270F548A07484421620E26FA060A447909217C5FAB7E"));
        }
        this.f20011b = keyStore;
    }

    public abstract Key a(KeyStore.Entry entry);

    @Override // s6.a2
    public void a() throws l1 {
        try {
            q();
        } catch (KeyStoreException e10) {
            throw d(f1.a("72361D67BB63404287014F4634695C25F70B464A3C0237655FAF72746FD6E86E43254F6EBB2C42018F11444725620E37"), e10);
        }
    }

    public abstract KeyStore.Entry b(Date date);

    @Override // s6.a2
    public void b() throws l1 {
        Date date = new Date();
        f(b(date), h(date));
    }

    @Override // s6.a2
    public Key c() throws l1 {
        if (!k()) {
            throw c(null);
        }
        Key keyA = a(o());
        e(keyA);
        return keyA;
    }

    public l1 c(Exception exc) {
        return new l1(-7778, f1.a("72361D67BB63404287014F4634695C25F70B464A3C02377C42B07E6C6198EB2F53251B69E9255D4E89545651287E083DED07"), exc);
    }

    public final l1 d(String str, Exception exc) {
        return new l1(-7772, str, exc);
    }

    public final void e(Key key) throws l1 {
        try {
            j(key);
        } catch (InvalidKeyException e10) {
            if (e10 instanceof UserNotAuthenticatedException) {
                return;
            }
            if (!(e10 instanceof KeyPermanentlyInvalidatedException)) {
                throw d(f1.a("72361D67BB63404287014F4634695C25F70B464A3C06336459BD7A6E6198EB2F53251B69E925405389545651287E083DED07"), e10);
            }
            throw n();
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw i(e);
        } catch (NoSuchPaddingException e12) {
            e = e12;
            throw i(e);
        }
    }

    @Override // s6.a2
    public boolean e() {
        return k();
    }

    public final void f(KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws l1 {
        try {
            this.f20011b.setEntry(this.f20010a.b(), entry, protectionParameter);
        } catch (KeyStoreException e10) {
            throw d(f1.a("72361D67BB63404287014F4634695C25F70B464A3C03266742B0757D2892ED7B56641B67E9284A589700524634"), e10);
        }
    }

    public final boolean g(KeyStore keyStore) {
        return f1.a("762A0B7AA62A4B6A810D6E403E7F19").equals(keyStore.getProvider().getName());
    }

    public abstract KeyStore.ProtectionParameter h(Date date);

    public l1 i(Exception exc) {
        return new l1(-7773, f1.a("72361D67BB63404287014F4634695C25F70B464A3C02377C42B07E6C6198EB2F5C211628A02D494EC4124F5B3C2D1737E6115E406E15"), exc);
    }

    public abstract void j(Key key);

    public final boolean k() throws l1 {
        try {
            return l();
        } catch (KeyStoreException e10) {
            throw d(f1.a("72361D67BB63404287014F4634695C25F70B464A3C02377C42B07E6C6198EB2F53251B69E9255D4E89545651287E083DED07"), e10);
        }
    }

    public boolean l() {
        return this.f20011b.containsAlias(this.f20010a.b()) && this.f20011b.entryInstanceOf(this.f20010a.b(), m());
    }

    public abstract Class<? extends KeyStore.Entry> m();

    public l1 n() {
        return new l1(-7779, null);
    }

    public KeyStore.Entry o() throws l1 {
        try {
            return p();
        } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e10) {
            throw d(f1.a("72361D67BB63404287014F4634695C25F70B464A3C02377C42B07E6C6198EB2F53251B69E9255D4E89545651287E083DED07"), e10);
        }
    }

    public KeyStore.Entry p() throws NoSuchAlgorithmException, KeyStoreException, l1, UnrecoverableEntryException {
        KeyStore.Entry entry = this.f20011b.getEntry(this.f20010a.b(), null);
        if (entry != null) {
            return entry;
        }
        throw c(null);
    }

    public final void q() throws KeyStoreException {
        this.f20011b.deleteEntry(this.f20010a.b());
    }
}
