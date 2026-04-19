package okhttp3.internal.tls;

import ae.r;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<X500Principal, Set<X509Certificate>> f17610a;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        r.f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            r.e(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f17610a = linkedHashMap;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z10;
        r.f(x509Certificate, "cert");
        Set<X509Certificate> set = this.f17610a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && r.b(((BasicTrustRootIndex) obj).f17610a, this.f17610a));
    }

    public int hashCode() {
        return this.f17610a.hashCode();
    }
}
