package s6;

import java.security.Key;
import java.security.KeyStore;
import s6.e2;

/* JADX INFO: loaded from: classes.dex */
public class t2 extends o2 {
    public t2(e2.a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
    }

    @Override // s6.b2, s6.a2
    public /* bridge */ /* synthetic */ void a() throws l1 {
        super.a();
    }

    @Override // s6.b2, s6.a2
    public /* bridge */ /* synthetic */ void b() throws l1 {
        super.b();
    }

    @Override // s6.b2, s6.a2
    public /* bridge */ /* synthetic */ Key c() {
        return super.c();
    }

    @Override // s6.e2, s6.a2
    public boolean d() {
        int securityLevel = super.t().getSecurityLevel();
        return securityLevel == -1 || securityLevel == 1 || securityLevel == 2;
    }

    @Override // s6.b2, s6.a2
    public boolean e() {
        return k();
    }
}
