package okhttp3;

import ae.j;
import ae.r;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import md.l;
import md.n;
import nd.u;
import nd.v;
import okhttp3.internal.Util;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Handshake {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16822e = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TlsVersion f16823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CipherSuite f16824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f16825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f16826d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            return certificateArr != null ? Util.v(Arrays.copyOf(certificateArr, certificateArr.length)) : u.m();
        }

        public final Handshake a(SSLSession sSLSession) throws IOException {
            List<Certificate> listM;
            r.f(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (r.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : r.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(r.m("cipherSuite == ", cipherSuite));
            }
            CipherSuite cipherSuiteB = CipherSuite.f16698b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (r.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionA = TlsVersion.f17013b.a(protocol);
            try {
                listM = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM = u.m();
            }
            return new Handshake(tlsVersionA, cipherSuiteB, c(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(listM));
        }

        public final Handshake b(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            r.f(tlsVersion, "tlsVersion");
            r.f(cipherSuite, "cipherSuite");
            r.f(list, "peerCertificates");
            r.f(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.U(list2), new Handshake$Companion$get$1(Util.U(list)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a<? extends List<? extends Certificate>> aVar) {
        r.f(tlsVersion, "tlsVersion");
        r.f(cipherSuite, "cipherSuite");
        r.f(list, "localCertificates");
        r.f(aVar, "peerCertificatesFn");
        this.f16823a = tlsVersion;
        this.f16824b = cipherSuite;
        this.f16825c = list;
        this.f16826d = n.b(new Handshake$peerCertificates$2(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        r.e(type, "type");
        return type;
    }

    public final CipherSuite a() {
        return this.f16824b;
    }

    public final List<Certificate> c() {
        return this.f16825c;
    }

    public final List<Certificate> d() {
        return (List) this.f16826d.getValue();
    }

    public final TlsVersion e() {
        return this.f16823a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f16823a == this.f16823a && r.b(handshake.f16824b, this.f16824b) && r.b(handshake.d(), d()) && r.b(handshake.f16825c, this.f16825c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f16823a.hashCode()) * 31) + this.f16824b.hashCode()) * 31) + d().hashCode()) * 31) + this.f16825c.hashCode();
    }

    public String toString() {
        List<Certificate> listD = d();
        ArrayList arrayList = new ArrayList(v.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f16823a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f16824b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f16825c;
        ArrayList arrayList2 = new ArrayList(v.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
