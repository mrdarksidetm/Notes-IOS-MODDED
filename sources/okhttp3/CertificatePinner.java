package okhttp3;

import ae.j;
import ae.n0;
import ae.r;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.verification.SigningManager;
import hf.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import je.v;
import je.w;
import nd.c0;
import nd.u;
import okhttp3.internal.tls.CertificateChainCleaner;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f16683c = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f16684d = new Builder().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Pin> f16685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CertificateChainCleaner f16686b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Pin> f16687a = new ArrayList();

        public final CertificatePinner a() {
            return new CertificatePinner(c0.H0(this.f16687a), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final String a(Certificate certificate) {
            r.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return r.m("sha256/", c((X509Certificate) certificate).a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final f b(X509Certificate x509Certificate) {
            r.f(x509Certificate, "<this>");
            f.a aVar = f.f11960d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            r.e(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).D();
        }

        public final f c(X509Certificate x509Certificate) {
            r.f(x509Certificate, "<this>");
            f.a aVar = f.f11960d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            r.e(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).E();
        }
    }

    public static final class Pin {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f16690c;

        public final f a() {
            return this.f16690c;
        }

        public final String b() {
            return this.f16689b;
        }

        public final boolean c(String str) {
            r.f(str, "hostname");
            if (v.G(this.f16688a, "**.", false, 2, null)) {
                int length = this.f16688a.length() - 3;
                int length2 = str.length() - length;
                if (!v.x(str, str.length() - length, this.f16688a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!v.G(this.f16688a, "*.", false, 2, null)) {
                    return r.b(str, this.f16688a);
                }
                int length3 = this.f16688a.length() - 1;
                int length4 = str.length() - length3;
                if (!v.x(str, str.length() - length3, this.f16688a, 1, length3, false, 16, null) || w.c0(str, b.f7490a, length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return r.b(this.f16688a, pin.f16688a) && r.b(this.f16689b, pin.f16689b) && r.b(this.f16690c, pin.f16690c);
        }

        public int hashCode() {
            return (((this.f16688a.hashCode() * 31) + this.f16689b.hashCode()) * 31) + this.f16690c.hashCode();
        }

        public String toString() {
            return this.f16689b + '/' + this.f16690c.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        r.f(set, "pins");
        this.f16685a = set;
        this.f16686b = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, j jVar) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }

    public final void a(String str, List<? extends Certificate> list) {
        r.f(str, "hostname");
        r.f(list, "peerCertificates");
        b(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void b(String str, a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        r.f(str, "hostname");
        r.f(aVar, "cleanedPeerCertificatesFn");
        List<Pin> listC = c(str);
        if (listC.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = aVar.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            f fVarC = null;
            f fVarB = null;
            for (Pin pin : listC) {
                String strB = pin.b();
                if (r.b(strB, SigningManager.POST_PARAMS_ALGORITHM)) {
                    if (fVarC == null) {
                        fVarC = f16683c.c(x509Certificate);
                    }
                    if (r.b(pin.a(), fVarC)) {
                        return;
                    }
                } else {
                    if (!r.b(strB, "sha1")) {
                        throw new AssertionError(r.m("unsupported hashAlgorithm: ", pin.b()));
                    }
                    if (fVarB == null) {
                        fVarB = f16683c.b(x509Certificate);
                    }
                    if (r.b(pin.a(), fVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(f16683c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        for (Pin pin2 : listC) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List<Pin> c(String str) {
        r.f(str, "hostname");
        Set<Pin> set = this.f16685a;
        List<Pin> listM = u.m();
        for (Object obj : set) {
            if (((Pin) obj).c(str)) {
                if (listM.isEmpty()) {
                    listM = new ArrayList<>();
                }
                n0.c(listM).add(obj);
            }
        }
        return listM;
    }

    public final CertificateChainCleaner d() {
        return this.f16686b;
    }

    public final CertificatePinner e(CertificateChainCleaner certificateChainCleaner) {
        r.f(certificateChainCleaner, "certificateChainCleaner");
        return r.b(this.f16686b, certificateChainCleaner) ? this : new CertificatePinner(this.f16685a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (r.b(certificatePinner.f16685a, this.f16685a) && r.b(certificatePinner.f16686b, this.f16686b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f16685a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f16686b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
