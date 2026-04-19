package s6;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import s6.b2;
import s6.e2;

/* JADX INFO: loaded from: classes.dex */
public class o2 extends e2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2.a f20237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final KeyStore f20238f;

    public o2(e2.a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
        this.f20237e = aVar;
        this.f20238f = keyStore;
    }

    @Override // s6.b2
    public boolean l() throws KeyStoreException {
        KeyStore keyStore;
        b2.a aVar = this.f20237e;
        if (aVar == null || (keyStore = this.f20238f) == null) {
            throw new KeyStoreException(f1.a("7C21167BBD2C5D44C41B4F143A680572EF03584E7103726143F9756F649AA2"));
        }
        if (!keyStore.containsAlias(aVar.b())) {
            return false;
        }
        try {
            return this.f20238f.getEntry(this.f20237e.b(), null).getClass() == m();
        } catch (NullPointerException e10) {
            throw new KeyStoreException(f1.a("7E2A1B6DBB2D4E4DC41D4E4724685C3BF1425E477950396D49AA6F757A93AC6D5E2A0B6DBB634B4490115E40346952"), e10);
        } catch (UnsupportedOperationException | NoSuchAlgorithmException | UnrecoverableEntryException unused) {
            throw new KeyStoreException(f1.a("72361D67BB63404287014F4634695C25F70B464A3C133A6D53B272746FD6E569172F0A71BA37405381545E5B3F791D3BF1110A4A720420711E"));
        }
    }
}
