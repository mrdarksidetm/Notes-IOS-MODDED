package okhttp3.internal.tls;

import ae.j;
import ae.r;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CertificateChainCleaner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17611a = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final CertificateChainCleaner a(X509TrustManager x509TrustManager) {
            r.f(x509TrustManager, "trustManager");
            return Platform.f17567a.g().c(x509TrustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
