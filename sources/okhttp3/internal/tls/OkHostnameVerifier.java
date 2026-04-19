package okhttp3.internal.tls;

import ae.r;
import com.amazon.a.a.o.c.a.b;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import hf.k0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import je.v;
import je.w;
import nd.c0;
import nd.u;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f17612a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        r.e(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return u.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && r.b(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return u.m();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) k0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !v.G(str, ".", false, 2, null) && !v.s(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !v.G(str2, ".", false, 2, null) && !v.s(str2, "..", false, 2, null)) {
                if (!v.s(str, ".", false, 2, null)) {
                    str = r.m(str, ".");
                }
                String str3 = str;
                if (!v.s(str2, ".", false, 2, null)) {
                    str2 = r.m(str2, ".");
                }
                String strB = b(str2);
                if (!w.L(strB, "*", false, 2, null)) {
                    return r.b(str3, strB);
                }
                if (!v.G(strB, "*.", false, 2, null) || w.X(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || r.b("*.", strB)) {
                    return false;
                }
                String strSubstring = strB.substring(1);
                r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!v.s(str3, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - strSubstring.length();
                return length <= 0 || w.c0(str3, b.f7490a, length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List<String> listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (f17612a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = HostnamesKt.e(str);
        List<String> listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (r.b(strE, HostnamesKt.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        r.f(x509Certificate, "certificate");
        return c0.n0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        r.f(str, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        r.f(x509Certificate, "certificate");
        return Util.i(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        r.f(str, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        r.f(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
