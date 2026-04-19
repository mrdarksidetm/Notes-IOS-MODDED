package v9;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import v9.e;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T_WRAPPER extends v9.e<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d<e.a, Cipher> f22313b = new d<>(new e.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d<e.C0464e, Mac> f22314c = new d<>(new e.C0464e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<e.g, Signature> f22315d = new d<>(new e.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<e.f, MessageDigest> f22316e = new d<>(new e.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<e.b, KeyAgreement> f22317f = new d<>(new e.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d<e.d, KeyPairGenerator> f22318g = new d<>(new e.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d<e.c, KeyFactory> f22319h = new d<>(new e.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f22320a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v9.e<JcePrimitiveT> f22321a;

        private b(v9.e<JcePrimitiveT> eVar) {
            this.f22321a = eVar;
        }

        @Override // v9.d.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f22321a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f22321a.a(str, null);
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v9.e<JcePrimitiveT> f22322a;

        private c(v9.e<JcePrimitiveT> eVar) {
            this.f22322a = eVar;
        }

        @Override // v9.d.e
        public JcePrimitiveT a(String str) {
            return this.f22322a.a(str, null);
        }
    }

    /* JADX INFO: renamed from: v9.d$d, reason: collision with other inner class name */
    private static class C0463d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v9.e<JcePrimitiveT> f22323a;

        private C0463d(v9.e<JcePrimitiveT> eVar) {
            this.f22323a = eVar;
        }

        @Override // v9.d.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f22323a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public d(T_WRAPPER t_wrapper) {
        this.f22320a = u9.b.c() ? new C0463d<>(t_wrapper) : h.a() ? new b<>(t_wrapper) : new c<>(t_wrapper);
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f22320a.a(str);
    }
}
